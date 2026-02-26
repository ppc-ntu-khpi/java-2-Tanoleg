package test;

import domain.Exercise;
import java.time.LocalDate;

public class TestResult {
    public static void main(String[] args) {

        // Task 1: Ackermann function
        System.out.println("=== Task 1: Ackermann Function ===");
        System.out.println("A(0, 0) = " + Exercise.calculateAckermann(0, 0)); // 1
        System.out.println("A(1, 1) = " + Exercise.calculateAckermann(1, 1)); // 3
        System.out.println("A(2, 2) = " + Exercise.calculateAckermann(2, 2)); // 7
        System.out.println("A(3, 3) = " + Exercise.calculateAckermann(3, 3)); // 61

        // Task 2: Hex conversion
        System.out.println("\n=== Task 2: Hex Conversion ===");
        System.out.println("Input: 1F  -> decimal, binary, octal, hex");
        System.out.println("Result: " + Exercise.calculateHexConversion("1F"));
        System.out.println("Input: FF  -> decimal, binary, octal, hex");
        System.out.println("Result: " + Exercise.calculateHexConversion("FF"));
        System.out.println("Input: A3  -> decimal, binary, octal, hex");
        System.out.println("Result: " + Exercise.calculateHexConversion("A3"));

        // Task 3: Working days
        System.out.println("\n=== Task 3: Working Days ===");
        LocalDate start1 = LocalDate.of(2025, 1, 1);
        LocalDate end1   = LocalDate.of(2025, 1, 31);
        System.out.println("Jan 2025 working days: " + Exercise.calculateWorkingDays(start1, end1)); // 23

        LocalDate start2 = LocalDate.of(2025, 3, 1);
        LocalDate end2   = LocalDate.of(2025, 3, 31);
        System.out.println("Mar 2025 working days: " + Exercise.calculateWorkingDays(start2, end2)); // 21
    }
}