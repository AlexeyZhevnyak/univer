package calcExample;

public class Runner {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.plus(10));
        System.out.println(calc.minus(5));
        System.out.println(calc.div(5));
        System.out.println(calc.mult(100));
    }
}
