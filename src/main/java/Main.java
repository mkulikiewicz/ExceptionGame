import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object object = new String("asd");
        Object object2 = new String("asd");
        System.out.println(object.hashCode());
        System.out.println(object2.hashCode());
    }
}
