package machine;

import java.util.Scanner;

public class Service {
    int water = 400;
    int milk = 540;
    int coffee = 120;
    int cups = 9;
    int money = 550;

    public void menu(String action) {
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                System.out.println("I gave you $ " + money);
                money = 0;
                break;
            case "remaining":
                coffeeMachineCondition();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                break;
        }
    }

    //int water, int milk, int coffee, int cups, int money
    private void coffeeMachineCondition() {
        System.out.println("The coffee machine has:\n" +
                this.water + " of water\n" +
                this.milk + " of milk\n" +
                this.coffee + " of coffee beans\n" +
                this.cups + " of disposable cups\n" +
                this.money + " of money");
    }

    private void fill() {
        Scanner fillSc = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        this.water += fillSc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        this.milk += fillSc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        this.coffee += fillSc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        this.cups += fillSc.nextInt();
    }

    private void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        Scanner buySc = new Scanner(System.in);
        String n = buySc.nextLine();
        switch (n) {
            case "1":
                if (this.water >= 250) this.water -= 250;
                else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (this.coffee >= 16) this.coffee -= 16;
                else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (this.cups >= 1) this.cups -= 1;
                else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                this.money += 4;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "2":
                if (this.water >= 350) this.water -= 350;
                else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (this.milk >= 75) this.milk -= 75;
                else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (this.coffee >= 20) this.coffee -= 20;
                else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (this.cups >= 1) this.cups -= 1;
                else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                this.money += 7;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            case "3":
                if (this.water >= 200) this.water -= 200;
                else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if (this.milk >= 100) this.milk -= 100;
                else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if (this.coffee >= 12) this.coffee -= 12;
                else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if (this.cups >= 1) this.cups -= 1;
                else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                this.money += 6;
                System.out.println("I have enough resources, making you a coffee!");
                break;
            default:
                break;
        }
    }
}
