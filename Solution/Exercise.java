package domain;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Exercise class containing static calculation methods.
 * Task 1: Ackermann function for two non-negative integers n and m
 * Task 2: Convert hexadecimal number to binary, octal, and decimal
 * Task 3: Count working days between two dates
 */
public class Exercise {

    /**
     * Task 1: Ackermann function
     * @param n non-negative integer
     * @param m non-negative integer
     * @return Ackermann value A(n, m)
     */
    public static long calculateAckermann(int n, int m) {
        if (n == 0) return m + 1;
        if (m == 0) return calculateAckermann(n - 1, 1);
        return calculateAckermann(n - 1, calculateAckermann(n, m - 1));
    }

    /**
     * Task 2: Convert hex string to decimal, binary, octal, hex
     * @param hex hexadecimal string (e.g. "1F")
     * @return comma-separated string: decimal, binary, octal, hex
     */
    public static String calculateHexConversion(String hex) {
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexUpper = Integer.toHexString(decimal).toUpperCase();
        return decimal + ", " + binary + ", " + octal + ", " + hexUpper;
    }

    /**
     * Task 3: Count working days between two dates (excluding Saturday and Sunday)
     * @param start start date (inclusive)
     * @param end end date (inclusive)
     * @return number of working days
     */
    public static int calculateWorkingDays(LocalDate start, LocalDate end) {
        int workingDays = 0;
        LocalDate current = start;
        while (!current.isAfter(end)) {
            DayOfWeek day = current.getDayOfWeek();
            if (day != DayOfWeek.SATURDAY && day != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            current = current.plusDays(1);
        }
        return workingDays;
    }
}