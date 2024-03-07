// File        : UserInputValidator.java          08/03/24
// Penulis     : Aditya Haidar Faishal
// Deskripsi   : Membuat class UserInputValidator


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidator {
    public static void validateUsername(String username) {
        // username minimal  5 karakter,
        // tidak lebih dari 20 karakter dan hanya boleh berisi huruf, angka, dan underscore ( _ )
        // serta harus diawali dengan huruf.
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid username. Username must start with a letter, " +
                    "be between 5 and 20 characters long, and can only contain letters, numbers, or underscore (_).");
        }
    }

    public static void validateEmail(String email) {
        // Persyaratan  email harus bentuk email valid.
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid email address. Please enter a valid email address.");
        }
    }

    public static void validateAge(int age) {
        // syarat usia diantara 17 tahun hingga 99 tahun.
        if (age < 17 || age > 99) {
            throw new IllegalArgumentException("Invalid age. Age must be between 17 and 99 years old.");
        }
    }
}
