package Chapter10.Examples;

//: innerclasses/MultiInterfaces.java
// Два способа реализации нескольких интерфейсов
// в одном классе.

interface A {}
interface B {}

class X implements A, B {}

class Y implements A {
    B makeB() {
        // Анонимный внутренний класс:
        return new B() {};
    }
}

public class MultiInterfaces {
    static void takesA(A a) {}
    static void takesB(B b) {}
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
} ///:~