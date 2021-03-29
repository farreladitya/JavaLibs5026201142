import java.util.*;
import java.lang.*;

public class ComputeMethods5026201142 {
    public double fToC (double degreesF){
        double celcius = (double) 5/9 * (degreesF-32);
        System.out.println("Temp in celcius is " + celcius);
        return celcius;
    }
    public double hypotenuse (int a, int b){
        double hypo = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is " + hypo);
        return hypo;
    }
    public int roll () {
        Random rndNum = new Random();
        int dice1 = rndNum.nextInt(6)+1;
        int dice2 = rndNum.nextInt(6)+1;
        int total = dice1 + dice2;
        System.out.println("The sum of the dice values is " + total);
        return total;

    }


}