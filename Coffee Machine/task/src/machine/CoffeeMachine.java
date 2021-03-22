package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner=new Scanner(System.in);
    public static int water=400;
    public static int milk=540;
    public static int coffeeBeans=120;
    public static int disposalCups=9;
    public static int money=550;

    public static void taking() {
        System.out.println("I gave you "+money);
        money=0;
    }

    public static void filling() {
        System.out.println("Write how many ml of water do you want to add:");
        water+= scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk+= scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans+= scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        disposalCups+= scanner.nextInt();
    }

    public static void buying() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String str=scanner.next();
        if(str.equals("back"))
            return;
        else {
            int option = Integer.parseInt(str);
            choose(option);
        }
    }

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water+" of water");
        System.out.println(milk+" of milk");
        System.out.println(coffeeBeans+" of coffee beans");
        System.out.println(disposalCups+" of disposable cups");
        System.out.println(money+" of money");
    }

public static void choose(int option) {
    switch(option){
        case 1:
            if(water>=250&&coffeeBeans>=16&&disposalCups>=1){
                System.out.println("I have enough resources, making you a coffee!");
            water-=250;
            coffeeBeans-=16;
            money+=4;
            disposalCups--;}
            else if(water<250)
                System.out.println("Sorry, not enough water!");
            else if(coffeeBeans<16)
                System.out.println("Sorry, not enough coffeeBeans!");
            else if(disposalCups<1)
                System.out.println("Sorry, not enough disposalCups!");
            break;
        case 2:
            if(water>=350&&milk>=75&&coffeeBeans>=20&&disposalCups>=1){
                System.out.println("I have enough resources, making you a coffee!");
                water-=350;
                milk-=75;
                money+=7;
                coffeeBeans-=20;
                disposalCups--;}
            else if(water<350)
                System.out.println("Sorry, not enough water!");
            else if(coffeeBeans<20)
                System.out.println("Sorry, not enough coffeeBeans!");
            else if(milk<75)
                System.out.println("Sorry, not enough milk!");
            else if(disposalCups<1)
                System.out.println("Sorry, not enough disposalCups!");

            break;
        case 3:
            if(water>=200&&milk>=100&&coffeeBeans>=12&&disposalCups>=1){
                System.out.println("I have enough resources, making you a coffee!");
                water-=200;
                milk-=100;
                coffeeBeans-=12;
                money+=6;
                disposalCups--;
            }
            else if(water<200)
                System.out.println("Sorry, not enough water!");
            else if(coffeeBeans<12)
                System.out.println("Sorry, not enough coffeeBeans!");
            else if(milk<100)
                System.out.println("Sorry, not enough milk!");
            else if(disposalCups<1)
                System.out.println("Sorry, not enough disposalCups!");
            break;
         }
    }
}
