package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public long add(String name, String number) {
        phoneBook.put(name, number);

        return phoneBook.size();
    }

    public String findByNumber(String number) {
        return null;
    }
}
