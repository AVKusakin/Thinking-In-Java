package Chapter10.Examples;

//: innerclasses/ClassInInterface.java
// {main: ClassInInterface$Test}

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface {
        public void howdy() {
            System.out.println("Привет!");
        }
        public static void main(String[] args) {
            new Test().howdy();
        }
    }
} /* Output:
Привет!
*///:~