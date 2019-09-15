package by.epam.ayem.module5;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import by.epam.ayem.module5.model.Directory;
import by.epam.ayem.module5.model.File;
import by.epam.ayem.module5.model.FileCreator;

public class FileMain {

    public static void main(String[] args) {

        FileCreator fileCreator = new FileCreator();
        File newFile = fileCreator.createFile("First text");
        Directory newDirectory = fileCreator.createDirectory("D:/user/text");
        fileCreator.changeTitle(newFile, newDirectory, "First text");
        fileCreator.printText(newFile, newDirectory);
        fileCreator.addText(newFile, newDirectory, "First sentence.");
        fileCreator.addText(newFile, newDirectory, "Second sentence.");
        fileCreator.printText(newFile, newDirectory);
        fileCreator.deleteText(newFile, newDirectory);
        fileCreator.printText(newFile, newDirectory);

    }
}
