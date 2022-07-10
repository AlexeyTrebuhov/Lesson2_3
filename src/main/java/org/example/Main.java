//Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера),
// если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить
// дубликаты, будет заменять номер  этого телефона по ключу, нужно подумать как не допустить такого)


import java.util.*;
public class Main {

    public static void main(String[] args) {

        TreeMap<String, String> numbersAndNames = new TreeMap<>();

        numbersAndNames.put("Phone_1 = +70000001", "John Smith");
        numbersAndNames.put("Phone_1 = +70000002", "John Smith");
        numbersAndNames.put("Phone_1 = +70000003", "Marilyn Monroe");
        numbersAndNames.put("Phone_1 = +70000004", "John Smith");
        numbersAndNames.put("Phone_1 = +70000005", "John Smith");
        numbersAndNames.put("Phone_2 = +70000005", "Marilyn Monroe");
        numbersAndNames.put("Phone_3 = +70000005", "Alladin");

        numbersAndNames.forEach((v, k) -> System.out.println(v + ": " + k));
        System.out.println("_______________________");
        numbersAndNames.forEach((v, k) -> System.out.println(k+ ": " + v));

    }
}