package Chapter5.Exercises;

/**
 * 9. Подготовьте класс с двумя (перегруженными) конструкторами. Используя ключевое слово this, вызовите второй
 * конструктор из первого.
 * date: 19.09.2020
 */
public class Exercise9 {
    Exercise9() {
        this(5);
    }
    Exercise9(int x) {
        System.out.println("The number is " + x);
    }
    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();
    }
}