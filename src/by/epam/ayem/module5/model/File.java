package by.epam.ayem.module5.model;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class File {

    private String fileName;
    private String text;
    private Directory directory;

    public File(String fileName) {
        this.fileName = fileName;
        this.text = "";
    }

    public File(String fileName, Directory directory) {
        this.fileName = fileName;
        this.text = "";
        this.directory = directory;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
