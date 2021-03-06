package Chapter9.Examples.filters;

//: interfaces/filters/LowPass.java

public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input) {
        return input; // Фиктивная обработка
    }
} ///:~