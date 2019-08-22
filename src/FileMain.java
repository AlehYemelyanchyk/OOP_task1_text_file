/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class FileMain {

    public static void main(String[] args) {

        TextFile textFile = new TextFile();
        textFile = textFile.createTextFile("New textFile");
        textFile.changeTitle("First text");
        textFile.addText("First sentence.");
        textFile.addText("Second sentence.");
        textFile.deleteText();
        textFile.printText();

    }
}
