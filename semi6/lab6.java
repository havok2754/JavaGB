package semi6;

import java.util.ArrayList;
import java.util.HashMap;

/*
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что в во входной 
структуре будут повторяющиеся имена с разными телефонами, 
их необходимо считать, как одного человека с разными телефонами. 
Вывод должен быть отсортирован по убыванию числа телефонов.
 */
 public class lab6 {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Ivanov", 123456);
        myPhoneBook.add("Ivanov", 654321);
        myPhoneBook.add("Petrov", 654321);

        PhoneBook.printSortedPhoneBook();
    }
}

 class PhoneBook {

    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, int phone) {
        phoneBook.computeIfAbsent(name, k -> new ArrayList<>()).add(phone);
    }

    public ArrayList<Integer> find(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public static void printSortedPhoneBook() {
        phoneBook.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
    }
}