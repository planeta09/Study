package input;

import main.Main;

public class Input {
    public static double inputNumber(String str) {
        System.out.println(str);
        while (true) {
            String input = Main.in.nextLine();
            try {
                return Double.parseDouble(input.replace(',','.'));
            } catch (NumberFormatException e) {
                System.out.println("Please, try again to enter the number");
            }
        }
    }
}
