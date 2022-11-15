package Chapter14.Examples;

//: typeinfo/ClassCast.java

class Building {}
class House extends Building {}

public class ClassCast {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
        h = (House) b; // ... или так.
    }
} ///:~