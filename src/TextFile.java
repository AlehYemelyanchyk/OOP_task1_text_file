/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class TextFile {

    private String title;
    private File file;
    private Directory directory;

    public TextFile() {
    }

    private TextFile(String title) {
        this.title = title;
        this.file = new File();
        this.directory = new Directory("D:\\Project\\File.txt");
    }


    public void printText() {
        System.out.println(getTitle());
        System.out.println(file.getText());
    }

    public void deleteText() {
        file.setText("");
    }

    public void addText(String text) {
        StringBuilder sb = new StringBuilder(file.getText());
        sb.append(text);
        file.setText(sb.toString() + " ");
    }

    public void changeTitle(String newTitle) {
        setTitle(newTitle);
    }

    public TextFile createTextFile(String title) {
        TextFile textFile = new TextFile(title);

        return textFile;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }
}
