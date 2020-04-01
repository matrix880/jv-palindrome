package core.basesyntax;

public class Palindrome {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-zA-Яа-я0-9]", "");
        return text.toLowerCase().equals((
                new StringBuilder(text)).reverse().toString().toLowerCase());
    }
}
