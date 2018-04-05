package Bussinesslogic;
import factory.*;
public class CalHandler {
    private CalFactory cf;
    private Calculator calc;
    public double evaluate(String expr){
        cf = new CalFactory();
        calc = cf.chooser(expr);
        return calc.cal(expr);
    }
}

