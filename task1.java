
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();
        phoneBook.put("Sasha", List.of("8 924 546 76 98", "8 964 309 56 35"));
        phoneBook.put("Pasha", List.of("8 914 271 16 58", "8 914 271 16 50"));
        phoneBook.put("Vova", List.of("8 924 526 76 08", "8 924 526 76 81"));
        phoneBook.put("Katya", List.of("8 964 646 06 90", "8 964 646 06 99"));
        phoneBook.put("Olga", List.of("8 925 506 77 98", "8 925 506 77 92"));

        menu(phoneBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> phoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(phoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> phoneBook) {
        System.out.println(phoneBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> phoneBook) {
        System.out.println("Если хотите перестать вводить данные, введите 'stop'");
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер: ");
            String phone = scanner();
            if (phone.equals("stop")) {
                break;
            } else {
                number.add(phone);
            }
        }
        phoneBook.put(name, number);

        return phoneBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> phoneBook) {
        System.out.println(
                "Введите команду из списка: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - выйти");
        while (true) {
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "find":
                        find(phoneBook);
                        break;
                    case "add":
                        add(phoneBook);
                        break;
                    case "all":
                        allBook(phoneBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return phoneBook;
    }
}

