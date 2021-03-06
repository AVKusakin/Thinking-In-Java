package Chapter3.Examples;

//: operators/ShortCircuit.java
// Демонстрация ускоренного вычсиления
// при использовании логических операторов.
import static net.mindview.util.Print.*;

public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("результат: " + (val < 1));
        return val < 1;
    }
    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("результат: " + (val < 2));
        return val < 2;
    }
    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("результат: " + (val < 3));
        return val < 3;
    }
    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        print("выражение: " + b);
    }
} /* Output:
test1(0)
результат: true
test2(2)
результат: false
выражение: false
*///:~