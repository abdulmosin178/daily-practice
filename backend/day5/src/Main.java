import java.io.*; // For Checked Exception

public class Main {

    // Method demonstrating 'throws' (Checked Exception)
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt"); // If file missing → IOException
        file.read();
        file.close();
    }

    // Method demonstrating 'throw' (Unchecked Exception)
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // Fixed typo
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        // 1️⃣ Unchecked Exception
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }

        // 2️⃣ Throw example
        try {
            checkAge(15); // manually throwing exception
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // 3️⃣ Checked Exception with throws
        try {
            readFile(); // File might not exist
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e);
        }

        System.out.println("Program ended successfully!");
    }
}
