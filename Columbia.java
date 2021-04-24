package main1;

import java.util.Scanner;

public class Columbia extends price {

    final double originalprice = 37.68;
    String choice, choice1, choice2;
    private String menu;
    private int beverage, espresso, drizzle;
    private double pricebeverage, priceespresso, pricedrizzle, total_price, price_espresso, price_drizzle;

    Scanner input = new Scanner(System.in);

    public Columbia() {
        super();
        price_espresso = 'A';
        price_drizzle = 'B';
        this.menu = " Columbia";
        System.out.println("Choice of beverage: \n1. Grande Mocha Frappucino\t\t+RM 0.00");
        System.out.print("Please enter your choice of beverage: ");
        this.beverage = input.nextInt();

        while (this.beverage != 1) {
            System.out.println("Wrong input! Please input number '1' only!");
            System.out.print("Please enter your choice of beverage: ");
            this.beverage = input.nextInt();

        }

        System.out.println("Add-on Espresso\nChoose One");
        System.out.println("1. 1 shot espresso\t\t\t+RM 2.12\n2. 2 shots espresso\t\t\t+RM 4.24");
        System.out.print("Please enter your choice of espresso: ");
        this.espresso = input.nextInt();
        while (this.espresso != 1 && this.espresso != 2) {
            System.out.println("Wrong input! Please input 1 or 2 only!");
            System.out.print("Please enter your choice of espresso: ");
            this.espresso = input.nextInt();
        }
        if (espresso == 1) {
            this.price_espresso = 2.12;
        } else if (espresso == 2) {
            this.price_espresso = 4.24;
        }
        System.out.println("Add-on Drizzle\nChoose one");
        System.out.println("1. Caramel Drizzle\t\t\t+RM 2.12\n2. Upside down Caramel Drizzle\t\t+RM 4.24");
        System.out.print("Please enter your choice of drizzle: ");
        this.drizzle = input.nextInt();
        while (this.drizzle
                != 1 && this.drizzle
                != 2) {
            System.out.println("Wrong input! Please input 1 or 2 only!");
            System.out.print("Please enter your choice of Drizzle: ");
            this.drizzle = input.nextInt();
        }
        if (drizzle == 1) {
            this.price_drizzle = 2.12;

        } else if (espresso == 2) {
            this.price_drizzle = 4.24;
        }

    }

    public void setchoice(String choice) {
        this.choice = choice;
    }

    double setprice() {
        this.pricebeverage = 37.68 + 0.00;
        this.priceespresso = this.pricebeverage + this.price_espresso;
        this.pricedrizzle = this.priceespresso + this.price_drizzle;
        this.total_price = this.pricedrizzle;
    

    return total_price;
    }
    String getmenu() {
        return this.menu;
    }

    Integer getbeverages() {
        return this.beverage;
    }

    Integer getespresso() {
        return this.espresso;
    }

    Integer getdrizzle() {
        return this.drizzle;
    }

    String getchoice() {
        return this.choice;
    }
    double gettotalprice() {
        return this.total_price;
    }

}
