package Chapter5.Examples;

//: initialization/NewVarArgs.java
// Создание списков аргументов переменной длины
// с использованием ситаксиса массивов.

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object obj : args)
            System.out.print(obj + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        // Можно передать отдельные элементы
        printArray(new Integer(47), new Float(3.14),
                new Double(11.11));
        printArray(47, 3.14F, 11.11);
        printArray(new Object[]{"раз", "два", "три"});
        printArray(new Object[]{new A(), new A(), new A()});
        // Или массив:
        printArray((Object[])new Integer[]{ 1, 2, 3, 4 });
        printArray(); // Пустой список тоже возможен
    }
}/* Output:
47 3.14 11.11
47 3.14 11.11
раз два три
A@17327b6 A@14ae5a5 A@131245a
1 2 3 4
*///:~