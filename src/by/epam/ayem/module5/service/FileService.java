package by.epam.ayem.module5.service;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

import by.epam.ayem.module5.model.Directory;
import by.epam.ayem.module5.model.File;

/**
 * @author Aleh Yemelyanchyk on 9/24/2019.
 */

public class FileService {

    public File createFile(String fileName, Directory directory, String text) {
        return new File(fileName, directory, text);
    }

    public void changeTitle(File file, Directory directory, String newTitle) {
        if (file.getDirectory().equals(directory)) {
            file.setTitle(newTitle);
        }
    }

    public void printText(File file, Directory directory) {
        if (file.getDirectory().equals(directory)) {
            System.out.println(file.getTitle());
            System.out.println(file.getText());
        }
    }

    public void addText(File file, Directory directory, String text) {
        if (file.getDirectory().equals(directory)) {
            String newText = file.getText() + text;
            file.setText(newText);
        }
    }

    public void deleteText(File file, Directory directory) {
        if (file.getDirectory().equals(directory)) {
            file.setText("");
        }
    }
}
