package Chapter5.Exercises;

/**
 * 10. Создайте класс с методом finalize(), который выводит сообщение. В методе main() создайте объект вашего класса.
 * Объясните поведение программы.
 * date: 19.09.2020
 */
class ForTenthExercise {
    public void finalize() {
        System.out.println("It works!");
    }
}

public class Exercise10 {
    public static void main(String[] args) {
        ForTenthExercise forTenthExercise = new ForTenthExercise();
    }
}
// Перед освобождением памяти, использованной созданным объектом, сборщик мусора вызывает метод finalize(). Тем не
// менее, "ни уборка мусора, ни финализация не гарантированы. Если виртуальная машина Java (Java Virtual Machine, JVM)
// далека от критической точки расходования ресурсов, она не станет тратить время на освобождение памяти с
// использованием уборки мусора." Только явный вызов метода finalize() или (в случае, если не была указана ссылка на
// объект) принудительная уборка мусора и финализация (System.gc()) позволят увидеть выводимое сообщение.