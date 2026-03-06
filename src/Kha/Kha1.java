package Kha;

import java.util.Date;
import java.util.Scanner;

public class Kha1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập ngày sinh theo định dạng DD-MM-YYYY : ");
            int year = Integer.parseInt(scanner.nextLine());

            if (year < 0) {
                System.out.println("Năm không được âm");
            }

            System.out.println("Năm sinh của bạn là : " + year);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi bạn nhập sai định dạng");
        } finally {
            System.out.println("Thực hiện dọn dẹp tài nguyên trong finally...");
        }

    }

}
