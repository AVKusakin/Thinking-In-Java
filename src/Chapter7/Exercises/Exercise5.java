package Chapter7.Exercises;

/**
 * 5. Создайте два класса A и B, имеющие конструкторы по умолчанию (с пустым списком аргументов), которые выводят
 * сообщение о вызове. Создайте новый класс С, производный от А; создайте в С поле типа В. Не создавайте конструктор С.
 * Создайте объект класса С и проследите за происходящим.
 * date: 07.10.2020
 */
class A {
    public A() {
        System.out.println("A constructor");
    }
}

class B {
    public B() {
        System.out.println("B constructor");
    }
}

class C extends A {
    private B b = new B();
}

public class Exercise5 {
    public static void main(String[] args) {
        C c = new C();
    }
}
// Поскольку класс C наследуется от класса А, то при создании объекта класса С создаётся и "подобъект" класса А, поэтому
// на экран будет выведено сообщение о вызове: "A constructor". Кроме того, класс С содержит поле типа В. Объект класса
// В проинициализирован. Таким образом, при создании объекта класса С на экран будет выведено ещё одно сообщение:
// "B constructor".