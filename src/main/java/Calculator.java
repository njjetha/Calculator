import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner scanner=new Scanner(System.in);
        while(true){
            double num1,num2;
            System.out.println("**************************************Scientific Calculator*****************************************");
            System.out.println("Enter the choice ");
            System.out.println("1.Square Root Function");
            System.out.println("2.Factorial Function");
            System.out.println("3.Natural Logarithm Function");
            System.out.println("4.Power Function ");
            System.out.println("5.Exiting from calculator");
            System.out.print("Pls Enter your choice : ");
            int choice=scanner.nextInt();
            System.out.println("");


            switch (choice){
                case 1:
                    System.out.print("Enter the Number : ");
                    num1=scanner.nextDouble();
                    System.out.println("Square Root value of "+num1+" is"+calculator.squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter the Number : ");
                    num1=scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is"+calculator.fact((int)num1));
                    break;
                case 3:
                    System.out.print("Enter the Number : ");
                    num1=scanner.nextDouble();
                    System.out.println("Natural Logarithm of value "+num1+" is"+calculator.logarithm(num1));
                    break;
                case 4:
                    System.out.print("Enter the Number : ");
                    num1=scanner.nextDouble();
                    System.out.print("Enter the power value : ");
                    num2=scanner.nextDouble();
                    System.out.println(num1+" Power "+num2 +" is "+calculator.power(num1,num2));
                    break;
                case 5:
                    System.out.println("Switching off the calculator .......");
                    return ;
            }
        }
    }

    public static int fact(int num1){
        int result=1;
        if(num1==0||num1==1)
                return 1;
        for(int i=num1;i>=1;i--){
            result=result*i;
        }
        return result;
    }



    public static double squareRoot(double num)
    {
        //temporary variable
        if(num==0)
            return 0;
        if(num<0)
            return -1;
        double t;
        double sqrtroot=num/2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(num/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }



    public static double logarithm(double num){
        return log(num);
    }



    public static double power(double x, double y)
    {
       return pow(x,y);
    }
}
