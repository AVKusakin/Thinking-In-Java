package Chapter3.Examples;

//: operators/HelloDate.java
// Передача объектов методам может работать
// не так, как вы привыкли.
import static net.mindview.util.Print.print;

class Letter{
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
} /* Output
1: x.c: a
2: x.c: z
*///:~