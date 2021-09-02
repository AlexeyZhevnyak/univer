package calcExample;

public class Calc {
    private double screenValue;

    public Calc() {
        screenValue = 0;
    }

    public void print(){
        System.out.println("screenValue = " + screenValue);
    }

    public double getScreenValue() {
        return screenValue;
    }

    public void setScreenValue(double screenValue) {
        this.screenValue = screenValue;
    }

    public  double plus(double x){
        screenValue += x;
        return screenValue;
    }
    public  double minus(double x){
        screenValue -= x;
        return screenValue;
    }
    public double mult(double x){
        screenValue *= x;
        return screenValue;
    }
    public  double div(double x){
        screenValue /= x;
        return screenValue;
    }

}
