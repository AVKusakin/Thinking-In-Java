package Chapter5.Exercises;

/**
 * 11. Измените предыдущее упражнение так, чтобы метод finalize() обязательно был исполнен.
 * @see Chapter5.Exercises.Exercise10
 * date: 19.09.2020
 */
class ForEleventhExercise {
    public void finalize() {
        System.out.println("It works!");
    }
}

public class Exercise11 {
    public static void main(String[] args) {
        new ForEleventhExercise();
        System.gc();
        // ForEleventhExercise forEleventhExercise = new ForEleventhExercise();
        // forEleventhExercise.finalize(); // второй способ
    }
}