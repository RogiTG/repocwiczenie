import java.math.BigDecimal;
import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        double x =1.2;
        double result;


        result=x+x+x;
        System.out.println("WYNIK !!! "+ result );

        BigDecimal bigDecimal = new BigDecimal(15,MathContext.DECIMAL64);
        BigDecimal bigDecima2 = new BigDecimal(6,MathContext.DECIMAL64);
        BigDecimal resultB;

       //resultB = bigDecimal.add(bigDecimal).add(bigDecimal).add(bigDecimal).add(bigDecimal).add(bigDecimal);
        resultB=bigDecimal.multiply(bigDecima2,MathContext.DECIMAL64);
        System.out.println(resultB.toString());
    }
}
