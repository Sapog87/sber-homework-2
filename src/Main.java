import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        List<String> words = List.of(
                "кот", "дом", "кот", "книга", "машина",
                "цветок", "стол", "книга", "окно", "кот",
                "дорога", "дом", "река", "книга", "стул",
                "кот", "окно", "город", "машина", "кот"
        );

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Слова и их количество:");
        map.forEach((key, value) -> System.out.printf("%s %d %n", key, value));
        System.out.println();

        //Задание 2
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Кузнецов", "+79000000001");
        phoneBook.add("Иванов", "+79000000002");
        phoneBook.add("Иванов", "+79000000003");
        phoneBook.add("Кузнецов", "+79000000004");
        phoneBook.add("Попов", "+79000000005");

        System.out.printf("Кузнецов %s%n", phoneBook.get("Кузнецов"));
        System.out.printf("Иванов %s%n", phoneBook.get("Иванов"));
        System.out.printf("Попов %s%n", phoneBook.get("Попов"));
        System.out.printf("Фролов %s%n", phoneBook.get("Фролов"));
    }
}

/*
Слова и их количество:
дорога 1
стол 1
город 1
дом 2
окно 2
река 1
стул 1
цветок 1
машина 2
кот 5
книга 3

Кузнецов [+79000000001, +79000000004]
Иванов [+79000000002, +79000000003]
Попов [+79000000005]
Фролов []
*/