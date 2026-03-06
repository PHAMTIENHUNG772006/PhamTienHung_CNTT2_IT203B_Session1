package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        checkedException checkedException = new checkedException("36 rau má phá đường tàu");

        UnCheckedException UncheckedException = new UnCheckedException("88 hai củ lạc ");

        try {
            int input = inputInterger();
        }catch (UnCheckedException e){
            throw new RuntimeException("Lỗi mới");
        }



    }

    public static int inputInterger() throws UnCheckedException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Nhập một số nguyên : ");
                int input = Integer.parseInt(scanner.nextLine());
                if (input <= 0) {
                    System.out.println("không được nhập số âm và 0");
                    continue;
                }

                throw new UnCheckedException("new bug");
            } catch (UnCheckedException e) {
                System.out.println("Bạn phải nhập một số nguyên ");
            } finally {
                System.out.println("Kết thúc xử lý ");
            }
        }
    }
}

















