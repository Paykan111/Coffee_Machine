package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        while (true){
            String action = scanner.nextLine();
            service.menu(action);
        }
    }
}
