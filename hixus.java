1. Print even numbers from 1 to 20 using a for loop:
 
public class EvenNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
 
2. Prompt the user for their flight choice until a valid number is entered:
 
import java.util.Scanner;
public class FlightChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.print("Enter your flight choice (1-5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 5);
        System.out.println("You selected flight " + choice);
        scanner.close();
    }
}
4. Print the first 10 numbers of the Fibonacci sequence using a for loop:
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
 
5. Calculate the sum of integers from 1 to 100 using a while loop:
public class SumIntegers {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("Sum of integers from 1 to 100: " + sum);
    }
}
 
 
 
 
 
6. Prompt the user to enter a number until they enter a negative number using a do-while loop:
import java.util.Scanner;
public class NegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number >= 0);
        System.out.println("You entered a negative number: " + number);
        scanner.close();
    }
}
 
7. Demonstrate the use of the continue statement in a loop:
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i); // Print odd numbers
        }
    }
}
 
 
 
 
 
8. Initialize and print a 2D array of integers:
 
public class Print2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
10. Demonstrate the impact of using break in nested loops:
public class BreakInNestedLoops {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break; // Exits inner loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
14. Find the maximum value in an array using a for loop:
public class MaxValueInArray {
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
 
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 8};
        System.out.println("Maximum value: " + findMax(array));
    }
}
16. Sum the elements of a 2D array:
public class Sum2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
 
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);
    }
}
 
20. Reverse an array:
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reversed = new int[array.length];
 
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
 
        System.out.println("Reversed array: " + Arrays.toString(reversed));
    }
}
21. Find the second largest element in an array:
public class SecondLargest {
    public static void main(String[] args) {
        int[] array = {12, 35, 1, 10, 34, 1};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
 
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second largest element: " + second);
    }
}
22. Find the first even number in a list and break the loop:
public class FirstEvenNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 5, 6, 9, 8};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("First even number: " + number);
                break;
            }
        }
    }
}
23. Print all odd numbers from 1 to 20 using continue to skip even numbers:
public class OddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
 
 
 
24. Prompt the user to enter numbers until they enter a negative number:
import java.util.Scanner;
public class EnterNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
 
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number >= 0);
 
        System.out.println("You entered a negative number.");
        scanner.close();
    }
}
25. Print a multiplication table but skip multiplication by 5:
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 6; // Example number
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
 
 
 
26. Count from 1 to 10 but break the loop when it reaches 6:
 
public class BreakAtSix {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }
    }
}
27. Print numbers from 1 to 10 but skip the number 5:
public class SkipFive {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
 
 
 
 
 
 
 
 
28. Check if a given number is prime:
import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        boolean isPrime = true;
 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
 
        if (number > 1 && isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
 
 
 
 
 
 
 
29. Reverse the digits of a given integer:
import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
 
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
 
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}
30. Print the multiplication table for a given number and range:
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the range: ");
        int range = scanner.nextInt();
 
        for (int i = 1; i <= range; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
 
31. Count the number of vowels and consonants in a given string:
import java.util.Scanner;
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();
 
        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
 
System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        scanner.close();
    }
}
 
 
 
 
 
 
32. Print the given pattern:
public class Pattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
33. Collect customer ratings until a customer enters 0:
import java.util.Scanner;
public class CustomerRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rating, total = 0, count = 0;
 
        while (true) {
            System.out.print("Enter a rating (1-5, 0 to stop): ");
            rating = scanner.nextInt();
            if (rating == 0) break;
            if (rating >= 1 && rating <= 5) {
                total += rating;
                count++;
            } else {
                System.out.println("Invalid rating. Please try again.");
            }
        }
 
        if (count > 0) {
            System.out.println("Average rating: " + (double) total / count);
          System.out.println("Number of ratings: " + count);
        } else {
            System.out.println("No ratings received.");
        }
        scanner.close();
    }
}
 
 
 
34. Track monthly expenses:
import java.util.Scanner;
public class MonthlyExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String category;
        double expense, total = 0;
 
        while (true) {
            System.out.print("Enter expense category (type 'done' to finish): ");
            category = scanner.next();
            if (category.equalsIgnoreCase("done")) break;
 
            System.out.print("Enter expense amount: ");
            expense = scanner.nextDouble();
            total += expense;
        }
 
        System.out.println("Total expenses for the month: " + total);
        scanner.close();
    }
}
 
 
 
 
 
 
 
 
 
35. Password validation system:
import java.util.Scanner;
public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        while (true) {
            System.out.print("Create a password: ");
            password = scanner.next();
            if (password.length() >= 8 && password.matches(".[!@#$%^&].*")) {
                System.out.println("Password is valid.");
                break;
            } else {
                System.out.println("Password must be at least 8 characters long and include a special character.");
            }
        }
        scanner.close();
    }
}
 
 
 
 
 
 
 
 
 
 
 
36. Log daily steps and calculate total and average:
import java.util.Scanner;
public class FitnessApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] steps = new int[7];
        int total = 0;
 
        for (int i = 0; i < 7; i++) {
            System.out.print("Enter steps for day " + (i + 1) + ": ");
            steps[i] = scanner.nextInt();
            total += steps[i];
        }
 
        System.out.println("Total steps: " + total);
        System.out.println("Average steps per day: " + (total / 7.0));
        scanner.close();
    }
}
 
 
 
 
 
 
 
 
 
 
 
37. Temperature conversion tool:
import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        while (true) {
            System.out.print("Enter temperature (or type 'exit' to stop): ");
            if (scanner.hasNextDouble()) {
                temp = scanner.nextDouble();
                System.out.println("Fahrenheit: " + (temp * 9 / 5 + 32));
                System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
            } else if (scanner.next().equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Invalid input.");
            }
        }
        scanner.close();
    }
}
38. Banking system for deposits and withdrawals:
import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        String choice;
 
        while (true) {
            System.out.print("Enter 'deposit', 'withdraw', or 'exit': ");
            choice = scanner.next();
            if (choice.equalsIgnoreCase("exit")) break;
 
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
 
            if (choice.equalsIgnoreCase("deposit")) {
                balance += amount;
            } else if (choice.equalsIgnoreCase("withdraw")) {
                if (amount <= balance) {
                    balance -= amount;
                } else {
                    System.out.println("Insufficient balance.");
                }
            }
            System.out.println("Current balance: " + balance);
        }
        System.out.println("Final balance: " + balance);
        scanner.close();
    }
}
 
 
 
 
 
 
 
 
 
39. Input grades for students, calculate the average, highest grade, and count of students who passed:
import java.util.Scanner;
public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade, count = 0, passCount = 0, highest = Integer.MIN_VALUE, total = 0;
 
        System.out.println("Enter grades (-1 to stop):");
        while (true) {
            grade = scanner.nextInt();
            if (grade == -1) break;
            total += grade;
            count++;
            if (grade > highest) highest = grade;
            if (grade >= 40) passCount++; // Assuming 40 is the passing threshold
        }
 
        if (count > 0) {
            System.out.println("Average grade: " + (double) total / count);
            System.out.println("Highest grade: " + highest);
            System.out.println("Number of students who passed: " + passCount);
        } else {
            System.out.println("No grades entered.");
        }
        scanner.close();
    }
}
 
 
 
40. Shopping cart application:
import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        String item;
        double price, total = 0;
 
        while (true) {
            System.out.print("Enter item name (type 'checkout' to finish): ");
            item = scanner.next();
            if (item.equalsIgnoreCase("checkout")) break;
 
            System.out.print("Enter item price: ");
            price = scanner.nextDouble();
            items.add(item);
            prices.add(price);
            total += price;
        }
 
        System.out.println("\nItems purchased:");
        for (int i = 0; i < items.size(); i++) {
System.out.println(items.get(i) + ": $" + prices.get(i));
        }
        System.out.println("Total amount due: $" + total);
        scanner.close();
    }
}
41. Calculate total sales and average sales per salesperson:
import java.util.Scanner;
 
public class SalesReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sales, total = 0;
        int count = 0;
 
        System.out.println("Enter sales figures (-1 to end):");
        while (true) {
            sales = scanner.nextDouble();
            if (sales < 0) break;
            total += sales;
            count++;
        }
 
        if (count > 0) {
            System.out.println("Total sales: $" + total);
            System.out.println("Average sales per salesperson: $" + (total / count));
        } else {
            System.out.println("No sales entered.");
        }
        scanner.close();
    }
}
 
 
 
 
 
42. Reverse a string:
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
43. Check if a string is a palindrome:
import java.util.Scanner;
 
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        String reversed = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
44. Count the occurrences of each character in a string:
import java.util.HashMap;
import java.util.Scanner;
 
public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
 
        System.out.println("Character occurrences:");
        for (char c : charCount.keySet()) {
            System.out.println(c + ": " + charCount.get(c));
        }
        scanner.close();
    }
}
45. Reverse a string without using the built-in reverse method:
import java.util.Scanner;
public class ReverseStringManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
 
        String reversed = "";
  for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
 
        System.out.println("Reversed string: " + reversed);
        scanner.close();
    }
}
 
 
46. Check if a string is a palindrome (method version):
public class PalindromeCheckMethod {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
 
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // true
        System.out.println(isPalindrome("hello"));   // false
    }
}
 
 
 
 
 
 
 
 
 
 
 
47. Count the number of vowels and consonants in a string:
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "Hello World".toLowerCase();
        int vowels = 0, consonants = 0;
 
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            }
        }
 
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
48. Capitalize the first letter of each word in a string:
public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "hello world";
        String[] words = input.split(" ");
        StringBuilder capitalized = new StringBuilder();
 
        for (String word : words) {
            capitalized.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
        }
 
        System.out.println("Output: " + capitalized.toString().trim());
    }
}
49. Check if two strings are anagrams of each other:
import java.util.Arrays;
public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
 
        return Arrays.equals(arr1, arr2);
    }
 
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen", "silent")); // true
        System.out.println(areAnagrams("hello", "world"));   // false
    }
}
 
50. Remove duplicate characters from a string while maintaining the original order:
public class RemoveDuplicates {
    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
 
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // "progamin"
    }
}
 
 
 
 
 
 
 
 
 
 
51. Find the first non-repeating character in a string:
import java.util.LinkedHashMap;
import java.util.Map;
 
public class FirstNonRepeatingChar {
    public static char findFirstNonRepeating(String input) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0'; // Return null character if no non-repeating character is found
    }
}
 
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeating("swiss")); // 'w'
    }
}
 
 
 
 
 
 
 
 
52. Compress a string using the counts of repeated characters:
public class StringCompressor {
    public static String compress(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
 
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(input.charAt(input.length() - 1)).append(count);
 
        return compressed.length() < input.length() ? compressed.toString() : input;
    }public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa")); // "a2b1c5a3"
    }
}
 
53. Append "World" to a StringBuffer containing "Hello":
public class AppendStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb); // "Hello World"
    }
}
 
54. Insert "Beautiful" at index 6 in a StringBuffer:
public class InsertStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // "Hello Beautiful World"
    }
}
 
55. Reverse the contents of a StringBuffer:
public class ReverseStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.reverse();
        System.out.println(sb); // "gnimmargorP avaJ"
    }
}
 
56. Delete a substring from a StringBuffer:
public class DeleteSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(6, 11); // Remove "World"
        System.out.println(sb); // "Hello "
    }
}
 
 
 
 
 
57. Reverse the contents of a StringBuffer initialized with "Java Programming":
public class ReverseStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java Programming");
        sb.reverse();
        System.out.println(sb); // "gnimmargorP avaJ"
    }
}
 
58. Delete the substring "World" from a StringBuffer initialized with "Hello World":
public class DeleteWorld {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        sb.delete(sb.indexOf("World"), sb.indexOf("World") + "World".length());
        System.out.println(sb); // "Hello "
    }
}
 
59. Replace "Java" with "Python" in a StringBuffer initialized with "I love Java programming":
public class ReplaceSubstring {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("I love Java programming");
        int start = sb.indexOf("Java");
        int end = start + "Java".length();
        sb.replace(start, end, "Python");
        System.out.println(sb); // "I love Python programming"
    }
}
 
 
 
60. Check initial capacity of a StringBuffer and append enough characters to exceed it:
public class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("Initial capacity: " + sb.capacity());
 
        sb.append("This is a test to exceed the initial capacity.");
        System.out.println("New capacity: " + sb.capacity());
    }
}
 
61. Convert a StringBuffer to a String and print it:
public class StringBufferToString {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        String str = sb.toString();
        System.out.println(str); // "Hello World"
    }
}
 
 
 
 
 
 
 
 
 
 
 
 
62. Count the number of vowels in a StringBuffer:
public class CountVowels {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        int vowels = 0;
 
        for (char c : sb.toString().toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            }
        }
 
        System.out.println("Number of vowels: " + vowels); // 3
    }
}
 
63. Trim extra spaces from a StringBuffer:
public class TrimStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("   Hello World   ");
        String trimmed = sb.toString().trim();
        System.out.println(trimmed); // "Hello World"
    }
}
 
 
 
 
 
 
 
64. Merge two StringBuffer objects and separate them with a space:
public class MergeStringBuffers {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = new StringBuffer("World");
        sb1.append(" ").append(sb2);
        System.out.println(sb1); // "Hello World"
    }
}
