package ucsp365final;
import java.util.Scanner;

public class UCSP365Final {

    public static void main(String[] args) {
        Scanner scanstr = new Scanner(System.in);
        float taxes[];
        taxes = new float[11];
        
        System.out.println("1) Wages, salaries, and tips earned by the husband: ");
        taxes[0] = scanstr.nextFloat();
        
        System.out.println("2) Wages, salaries, and tips earned by the wife: ");
        taxes[1] = scanstr.nextFloat();
        
        System.out.println("3) Bonus earned by the family combined: ");
        taxes[2] = scanstr.nextFloat();
        
        float line4sum = 0;
        for (float num : taxes) {
            line4sum += num;
        }
        System.out.println("4) Your yearly gross income is: " + "$" + line4sum);
        
        System.out.println("5) $5000 will be subtracted from your annual gross income. If this line is larger than line 4, enter 0");
        
        taxes[3] = (line4sum - 5000);
        System.out.println("6) The amount subtracted from line 5. This is your taxable income: " + "$" + taxes[3]);
        
        System.out.println("7) Federal income tax withheld from paychecks for husband: ");
        taxes[4] = scanstr.nextFloat();
        
        System.out.println("8) Federal income tax withheld from paychecks for wife: ");
        taxes[5] = scanstr.nextFloat();
        
        taxes[6] = (taxes[4] + taxes[5]);
        System.out.println("9) Added lines 7 and 8. The amount is your total for payments and credits: " + "$" + taxes[6]);
        
        taxes[7] = (float) (taxes[3] * 0.28);
        System.out.println("10) Federal tax. Multiply Line 6 by 0.28. The amount is: " +  "$" + taxes[7]);
        
        System.out.println("11) Property tax to be owed: ");
        taxes[8] = scanstr.nextFloat();
        
        taxes[9] = (taxes[7] + taxes [8]);
        System.out.println("12) Add lines 10 and 11. This amount is your total tax: " + "$" + taxes[9]);
        
        taxes[10] = (taxes[9] - taxes[6]);
        System.out.println("13) Subtract line 9 from line 12. If the result is positive, this is the amount you have to pay. If the result is negative, this is the you have overpaid. The result is: " + "$" + taxes[10]);
        

        }
    
    
}
