package Chapter10.Examples;

//: innerclasses/Parcel7b.java
// Расширенная версия Parcel7.java

public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;
        public int value() {
            return i;
        }
    }
    public Contents contents() {
        return new MyContents();
    }
    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
} ///:~