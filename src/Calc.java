import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilya on 2022-02-27 16:40
 **/

public class Calc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(2);
        list.add("Первый");
        list.add("Второй");
        for (String l : list) {
            System.out.println(l);
        }
    }
}
