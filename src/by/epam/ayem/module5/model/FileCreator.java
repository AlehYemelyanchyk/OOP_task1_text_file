package by.epam.ayem.module5.model;

/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class FileCreator {

    private File file;
    private Directory directory;

    public FileCreator() {
    }

    public void printText(File file, Directory directory) {
        System.out.println(file.getFileName());
        System.out.println(file.getText());
    }

    public void deleteText(File file, Directory directory) {
        file.setText("");
    }

    public void addText(File file, Directory directory, String text) {
        StringBuilder sb = new StringBuilder(file.getText());
        sb.append(text);
        file.setText(sb.toString() + " ");
    }

    public void changeTitle(File file, Directory directory, String newTitle) {
        file.setFileName(newTitle);
    }

    public Directory createDirectory(String path) {
        return new Directory(path);
    }

    public File createFile(String fileName) {
        return new File(fileName);
    }

    public File createFile(String fileName, Directory directory) {
        return new File(fileName, directory);
    }

    public void putFileInDirectory(File file, Directory directory) {
        file.setDirectory(directory);
    }
}
