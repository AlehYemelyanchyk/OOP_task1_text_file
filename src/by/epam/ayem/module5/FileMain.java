package by.epam.ayem.module5;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import by.epam.ayem.module5.model.Directory;
import by.epam.ayem.module5.model.File;
import by.epam.ayem.module5.service.FileService;

public class FileMain {

    public static void main(String[] args) {

        FileService fileService = new FileService();
        Directory directory = new Directory("D:/user/text");
        File file = fileService.createFile("First text", directory, "Once upon a time there was a kingdom. " +
                "A brave knight lived in the kingdom. ");
        fileService.printText(file, directory);
        fileService.changeTitle(file, directory, "Second text");
        fileService.printText(file, directory);
        fileService.addText(file, directory, "There was also a bad bad wizard");
        fileService.printText(file, directory);
        fileService.deleteText(file, directory);
        fileService.printText(file, directory);

    }
}
