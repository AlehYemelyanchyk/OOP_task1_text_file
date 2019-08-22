/*Задача 1.
Создать новый объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
вывести на консоль содержимое, дополнить, удалить.*/

public class File {

    private String text;

    public File() {
        this.text = "";
    }

//    public void addText (String text){
//        StringBuilder sb = new StringBuilder(getText());
//        sb.append(text);
//    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
