package calcExample;

public class CalcMemory extends Calc {
//    private double memoryValue;
    private final Memory memory;

    public CalcMemory() {
        memory = new Memory();
    }

    public double getMemoryValue() {
        return memory.value;
    }

    public void setMemoryValue(double memoryValue) {
        this.memory.value = memoryValue;
    }

    public void mPlus() {
        memory.value += getScreenValue();
    }

    public void mMinus() {
        memory.value -= getScreenValue();
    }

    public void mR() {
        setMemoryValue(memory.value);
    }

    public void mC() {
        memory.value = 0;
    }
}
