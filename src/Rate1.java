import java.util.Scanner;

public class Rate1 {


    public Rate1(long amount, Scanner input) {

        //Scanner input = new Scanner(System.in);

        while(true){
            while (true) {
                try {
                    System.out.println("doing the maths.....hourly");
                    System.out.println("How many days in the week do you work?");
                    String stDays = input.nextLine().trim();
                    int days = Integer.parseInt(stDays);

                    if(days <= 7 && days > 0 )
                    {

                    }
                    else{
                        System.out.println("please make a sure to enter a value large then 0 and less then 8");
                        continue;
                    }


                    System.out.println("How many hours do you work per day?");
                    String stHours = input.nextLine().trim();
                    int hoursPerDay = Integer.parseInt(stHours);

                    if(hoursPerDay <= 24 && hoursPerDay > 0 )
                    {

                    }
                    else{
                        System.out.println("please make a sure to enter a value large then 0 and less then 25");
                        continue;
                    }

                    int weeklyHours = days * hoursPerDay;
                    long weeklyPay = weeklyHours * amount;
                    long yearlyPay = weeklyPay * 52;
                    long monthlyPay = weeklyPay * 4;


                    System.out.println("Weekly pay: " + weeklyPay);
                    System.out.println("Yearly pay: " + yearlyPay);
                    System.out.println("Monthly pay: " + monthlyPay);

                    if(yearlyPay<12570)
                    {
                        System.out.println("___not tax___");
                        System.out.println("after tax = yearly ");
                        System.out.println("after tax = monthly ");
                        System.out.println("after tax = weekly ");
                    } else if (yearlyPay>12579 && yearlyPay<50270) {
                        System.out.println("___basic rate___");
                        System.out.println("after tax = yearly " + (yearlyPay -(yearlyPay * 0.20)) + "");//make this change
                        System.out.println("after tax = monthly " + (monthlyPay- (monthlyPay * 0.20)) +"");
                        System.out.println("after tax = weekly " + (weeklyPay - ( weeklyPay * 0.20)) +"");
                    }else if (yearlyPay<125140 && yearlyPay>50270) {
                        System.out.println("___higher rate___");
                        System.out.println("after tax = yearly " + (yearlyPay -(yearlyPay * 0.40)) + "");
                        System.out.println("after tax = monthly " + (monthlyPay -(monthlyPay * 0.40)) + "");
                        System.out.println("after tax = weekly " + (weeklyPay-(weeklyPay * 0.40)) + "");
                    }else if (yearlyPay<125140) {
                        System.out.println("___additional rate___");
                        System.out.println("after tax = yearly " + (yearlyPay-(yearlyPay * 0.45)) + "");
                        System.out.println("after tax = monthly " + (monthlyPay-(monthlyPay * 0.45)) + "");
                        System.out.println("after tax = weekly " + (weeklyPay-(weeklyPay * 0.45)) + "");
                    }

                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Please enter valid numbers for days and hours.");
                    continue;
                }
            }

        }

    }


}
