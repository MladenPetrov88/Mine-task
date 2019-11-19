import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MineTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> productQuantity = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String word = command;
            int count = Integer.parseInt(scanner.nextLine());
            if (!productQuantity.containsKey(word)) {
                productQuantity.put(word, count);
            } else {
                productQuantity.put(word, productQuantity.get(word) + count);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : productQuantity.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
