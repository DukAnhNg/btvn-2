package src.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên hàng nhập kho:");
        String productName = scanner.nextLine();
        System.out.println(productName);
        System.out.println("Mời bạn nhập ngày tháng năm sinh:");
        String birth = scanner.nextLine();
        LocalDate lcd = LocalDate.parse(birth, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(lcd);
        System.out.println("Mời bạn nhập thời gian nhập hàng:");
        String importTime = scanner.nextLine();
        LocalDateTime lcdt = LocalDateTime.parse(importTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(lcdt);
        System.out.println("Mời bạn nhập thời gian:");
        String time = scanner.nextLine();
        LocalTime lct = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(lct);
    }
}
