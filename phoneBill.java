// Read the README.md
// Read it again
// Your code here
// Delete these 4 lines of comments

import java.util.Scanner;

class phoneBill {
    public static void main(String[] args) {

        System.out.println("Here are your package options :" + "\n" +
                "Package Green: For $49.99/month, 2GB of data is provided. Additional GB are $15/GB." +
                "\n" + "Package Blue: For $70/month, 4GB of data is provided. Additional GB are $10/GB." + "\n" +
                "Package Purple: For $99.95/month, unlimited data is provided.");
        Scanner input = new Scanner(System.in);
        System.out.println("Which package will you choose: ");
        String phone_package = input.nextLine();
        while (!phone_package.equals("Package Green") && !phone_package.equals("Package Blue")
                && !phone_package.equals("Package Purple")) {
            System.out.println("Invalid option, try again.");
            System.out.println("Which package will you choose: ");
            phone_package = input.nextLine();
        }
        if (phone_package.equals ("Package Green")) {
            double money = 49.99;
            System.out.println("How many extra gigabytes do you want? ");
            int gigabytes = input.nextInt();
            int total_gigs = gigabytes + 2;
            double total_money = money + (gigabytes * 15);
            System.out.println("Your total gigabytes are " + total_gigs);
            if(total_money >= 75){
                System.out.println("You get a $20 coupon");
                total_money = total_money - 20;
                System.out.println("Your total is $" + total_money + "per month");
            }
            else{
                System.out.println("Your total is $" + total_money + "per month");
            }
        }
        else if(phone_package.equals ("Package Blue")){
            double money = 70.00;
            System.out.println("How many extra gigabytes do you want? ");
            int gigabytes = input.nextInt();
            int total_gigs = gigabytes + 4;
            double total_money = money + (gigabytes * 10);
            System.out.println("Your total gigabytes is " + total_gigs);
            System.out.println("Your total is $" + total_money);
        }
        else if(phone_package.equals ("Package Purple")){
            double money = 99.95;
            System.out.println("Congratulations you have unlimited data!!!");
            System.out.println("Your total is $" + money);
        }
    }
}