/**
 * Created by Ilya on 2022-02-27 15:49
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, это master ветка");
        Main main = new Main();
        main.write("собеседование");
        main.write("КОНФЛИКТ ВЕРСИЙ");
    }

    public void write(String message) {
        System.out.println("Напишу-ка я слово: " + message);
        System.out.println("Java the best");
    }
}
