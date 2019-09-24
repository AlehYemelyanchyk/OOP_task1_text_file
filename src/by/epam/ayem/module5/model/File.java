package by.epam.ayem.module5.model;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class File {

    private String title;
    private Directory directory;
    private String text;

    public File(String title, Directory directory, String text) {
        this.title = title;
        this.directory = directory;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
