import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        boolean flag = true;
        while(flag == true){
            System.out.println("Please enter two numbers to start calculation");
            System.out.println("For squareRoot and factorial, please enter 0 for the second number");
            Scanner number = new Scanner(System.in);
            float a = number.nextFloat();
            float b = number.nextFloat();
            System.out.println("Please choose from the following options£º");
            System.out.println("1.plus");
            System.out.println("2.minus");
            System.out.println("3.multiply");
            System.out.println("4.divide");
            System.out.println("5.reminder");
            System.out.println("6.power");
            System.out.println("7.factorial");
            System.out.println("8.squareRoot");
            System.out.println("0.quit");
            System.out.println("9.GreatestCommonDivisor");
            System.out.println("10.LeastCommonMultiple");
            System.out.println("Please choose your operator£º");
            Scanner operator = new Scanner(System.in);
            int select  = operator.nextInt();
            if((select < 0) || (select > 10)){
                System.out.println("Your input is wrong, Please enter again");
                 
            }
            switch(select){
                case 0: System.exit(0);
                case 1: Calculator.plus(a, b);
                break;
                case 2: Calculator.minus(a, b);
                break;
                case 3: Calculator.multiply(a, b);
                break;
                case 4: Calculator.divide(a, b);
                break;
                case 5: Calculator.reminder(a, b);
                break;
                case 6: Calculator.power(a,b);
                break;
                case 7: Calculator.factorial(a);
                break;
                case 8: Calculator.squareRoot(a);
                break;
                case 9: Calculator.GreatestCommonDivisor(a, b);
                break;
                case 10: Calculator.LeastCommonMultiple(a, b);
                break;
                default: break;
            }
             
        }
     
    }
    
    /** 
     * function to calculate plus.
     * @param a the first number
     * @param b the second number
     */
    public static  void plus(float a, float b){
        System.out.println("the sum is£º" + (a+b));
    }
    
    /**
     * function to calculate minus.
     * @param a the first number
     * @param b the second number
     */
    public static void minus(float a, float b){
        System.out.println("the difference is£º" + (a-b));
    }
    
    /**
     * function to calculate multiply.
     * @param a the first number
     * @param b the second number
     */
    public static void multiply(float a, float b){
        System.out.println("the product is£º" + (a*b));
        }
    
    /**
     * function to calculate divide.
     * @param a the divisor 
     * @param b the dividend
     */ 
    public static void divide(float a, float b){
        System.out.println("the quotient is£º" + (a/b));
    }
    
    /** 
     * function to calculate reminder.
     * @param a the divisor 
     * @param b the dividend
     */
    public static void reminder(float a, float b){
        System.out.println("remiander is:" + (a%b));
    }
    
    /** 
     * function to calculate power.
     * @param a the base number
     * @param b the power number
     */
    public static void power(float a, float b){
	double result = 1;
	for(int i = 0; i < b; i++) {
	    result = result*a;
	}
        System.out.println("the power is:" + result);
    }
    
    /** 
     * function to calculate square root.
     * @param a the number to find square root
     */
    public static void squareRoot(float a) {
	if (a < 0) {
	    System.out.println("negative numbers don't have square root") ;
	}else {
	double err = 1e-15;
	double t = a;
	while( Math.abs(t - a/t) > err * t)
	t = (a/t + t) /2.0;
        System.out.println("the square root is:" + t);
	}
    }
    
    /**
     * function  to calculate factorial.
     * @param a the number to find factorial
     */
    public static void factorial(float a){ 
    	Math.round(a);
    	if (Math.round(a) != a) {
    		System.out.println("decimals don't have factorial");
    	} else {
	    long result = 1; 
	    for(int i = 1;i<a;i++){ 
	    result = result*i; 
	    }
	   System.out.println("the factorial is:" + result);  
    }  
    }
    
    /**
     * function to find GreatestCommonDivisor.
     * @param a the first number
     * @param b the second number
     */
    public static void GreatestCommonDivisor(float a,float b) {  
	if(a < b) {  
	        long m = (long) a;  
	        a = b; 
	        b = m;  
	    }  
	    long k = 0;  
	    while(b != 0) {  
	        k = (long) (a%b);  
	        a = b;  
	        b = k;  
	    }  
	    System.out.println("GreatestCommonDivisor is"+a);  
	}  
   /**
    * function to find LeastCommonMultiple.
    * @param a the first number
    * @param b the second number
    */
   public static void LeastCommonMultiple(float a,float b) {  
       	   int r = (int) a, s = (int) a, t = (int) b;
	   if (a < b) {
	   r = (int) a;
	   a = b;
	   b = r;
	   }
	   while (r != 0) {
	   r = (int) (a % b);
	   a = b;
	   b = r;
	   }
	   System.out.println("LeastCommonMultiple is" +s * t / a);
	   
	}  
}