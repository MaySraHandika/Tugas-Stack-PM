package TugasStack;

import java.util.Scanner;

public class StackRumus {
    public static void main(String[] args) {

        StackMaysra<String> stack = new StackMaysra<>(25);
        String inp = "f(x)=(2x+y)-(3+(2x-x)+20)";
        String stt = "Status : ";
        Scanner scn = new Scanner(inp);
        System.out.println("Rumus Aljabar : " + inp);

        scn.useDelimiter("");

        for (int i = 0; i < inp.length(); i++) {
            String karakter = scn.next();
            if (karakter.equals("(")) {
                stack.push("(");
            } else if (karakter.equals(")")) {
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            System.out.println(stt + "Valid");
        } else {
            System.out.println(stt + "Tidak Valid");
        }
    }
}
