package machine;

import java.util.Locale;
import java.util.Scanner;
enum StateMachine{
    BUY, FILL,TAKE,REMAINING,EXIT
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        boolean e = true;
        while (e) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            StateMachine stateMachine=StateMachine.valueOf(scanner.next().toUpperCase(Locale.ROOT));
            switch (stateMachine) {
                case BUY:
                    coffeeMachine.buying();
                    break;
                case FILL:
                    coffeeMachine.filling();
                    break;
                case TAKE:
                    coffeeMachine.taking();
                    break;
                case REMAINING:
                    coffeeMachine.remaining();
                    break;
                case EXIT:
                    e = false;
                    break;
            }
        }
    }
}
