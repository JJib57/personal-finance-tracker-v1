public class Rate3 {
    public Rate3( long amount){
        System.out.println("doing the maths....yearly");
        long yearlyPay = amount;
        long weeklyPay = amount / 52;
        long monthlyPay = amount / 12;


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
    }
}
