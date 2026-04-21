package String_Functions;

public class StringHandlingDemo {

    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        System.out.println("=== String Creation and Basic Operations ===");
        String str1 = "Hello, World!";
        String str2 = new String("Java Programming");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // 2. Length and Character Access
        System.out.println("\n=== Length and Character Access ===");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4: " + str1.charAt(4));

        // 3. String Comparison
        System.out.println("\n=== String Comparison ===");
        String str3 = "hello, world!";
        System.out.println("Equals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        System.out.println("\n=== String Searching ===");
        System.out.println("Index of 'World': " + str1.indexOf("World"));
        System.out.println("Last index of 'o': " + str1.lastIndexOf('o'));
        System.out.println("Contains 'Hello': " + str1.contains("Hello"));

        // 5. Substring Operations
        System.out.println("\n=== Substring Operations ===");
        System.out.println("Substring (7): " + str1.substring(7));
        System.out.println("Substring (0,5): " + str1.substring(0, 5));

        // 6. String Modification
        System.out.println("\n=== String Modification ===");
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Replace: " + str1.replace("World", "Java"));

        // 7. Whitespace Handling
        System.out.println("\n=== Whitespace Handling ===");
        String spaceStr = "  Java Program  ";
        System.out.println("Before Trim: '" + spaceStr + "'");
        System.out.println("After Trim: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        System.out.println("\n=== String Concatenation ===");
        String a = "Hello";
        String b = "World";
        System.out.println("Using + : " + a + " " + b);
        System.out.println("Using concat(): " + a.concat(" ").concat(b));

        // 9. String Splitting
        System.out.println("\n=== String Splitting ===");
        String data = "Java,Python,C++,JavaScript";
        String[] arr = data.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + arr[i]);
        }

        // 10. StringBuilder Demo
        System.out.println("\n=== StringBuilder Demo ===");
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("After append: " + sb);
        sb.insert(5, "Core ");
        System.out.println("After insert: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 11. String Formatting
        System.out.println("\n=== String Formatting ===");
        String formatted = String.format("Name: %s, Age: %d", "John", 25);
        System.out.println(formatted);

        // 12. Email Validation
        System.out.println("\n=== Email Validation ===");
        String email = "user@example.com";

        boolean valid = email.contains("@") &&
                        email.contains(".") &&
                        !email.startsWith("@") &&
                        !email.endsWith(".") &&
                        email.indexOf("@") < email.lastIndexOf(".");

        System.out.println("Email: " + email);
        System.out.println("Valid Email: " + valid);
    }
}