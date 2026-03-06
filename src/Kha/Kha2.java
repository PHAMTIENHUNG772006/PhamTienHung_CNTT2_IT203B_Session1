package Kha;

import java.util.Scanner;

public class Kha2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập tổng số người : ");
            int totalPerson = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập số nhóm: ");
            int numberGroup = Integer.parseInt(scanner.nextLine());


            System.out.println("Số người chia theo nhóm là : " + totalPerson / numberGroup);
        } catch (ArithmeticException  e) {
            System.out.println("\"Không thể chia cho 0!");
        } finally {
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }


    }
}
