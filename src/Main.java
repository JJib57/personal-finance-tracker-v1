import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);
    static int Rate = 0;
    static long amount;
    public static void main(String[] args) {

        System.out.println("welcome to my finance tracker");
        //System.out.println("please follow my github at https://github.com/JJib57 ");

       while (true) {

           System.out.println("enter the number associated with the rate");
           System.out.println("[1] Hourly");
           System.out.println("[2] Monthly");
           System.out.println("[3] annually");
           String RateOption = input.nextLine().trim();

           try {
               Rate = Integer.parseInt(RateOption);
               if(Rate != 1 && Rate != 2 && Rate != 3)
               {
                   System.out.println(" ");
               }
           } catch (NumberFormatException e) {
               System.out.printf("please enter one of the numbers");
               continue;
           }


           System.out.println("please enter your pay relative to your rate");
           String StAmount = input.nextLine().trim();
           try {
               amount = Long.parseLong(StAmount);

           } catch (NumberFormatException e) {
               System.out.println("please enter an amount which is a valid number");
               continue;
           }

           if(Rate == 1)
           {
               Rate1 r1 = new Rate1(amount, input);
           } else if (Rate == 2) {
               Rate2 r2 = new Rate2(amount);
           } else if (Rate == 3) {
               Rate3 r3 = new Rate3(amount);
           }

           System.out.printf("thanks for using my code");
           break;

       }

    }
}