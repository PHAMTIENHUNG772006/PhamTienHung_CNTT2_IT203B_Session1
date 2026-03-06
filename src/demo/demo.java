package demo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {

        /*tạo ra phương thức nhập và trả về các giá trị gồm
        * 1. Số nguyên ( int , byte , short, long)
        * 2. Số thực ( double , float)
        * 3. Kí tự và chuỗi
        *  4. boolean
        * Sử lý các lỗi ngoại lệ khi nhập
         */


        Number input = inputData();

        double inputDouble = DoubleData();

        String inputString = StringData();

        boolean inputBoolean = BooleanData();

    }

    public static Number inputData(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập một số nguyên dương : ");

            Number input = scanner.nextInt();

            System.out.println(input);
            return input;
        }catch (NumberFormatException e){
            System.out.println("Lỗi format");
        }catch (InputMismatchException e){
            System.out.println("Sai kiểu dữ liệu");
        }finally {
            System.out.println("Kết thúc");
        }

        return  -1;
    }


    public static double DoubleData(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập một số thực : ");

            double input = scanner.nextDouble();

            System.out.println(input);
            return input;
        }catch (Exception e){
            System.out.println("Hãy nhập vào một số thực");
        }finally {
            System.out.println("Kết thúc");
        }

        return -1;
    }

    public static String StringData(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập một chuỗi : ");

            String input = scanner.nextLine();

            System.out.println(input);
            return input;
        }catch (Exception e){
            System.out.println("Hãy nhập vào một chuỗi");
        }finally {
            System.out.println("Kết thúc");
        }

        return null;
    }

    public static boolean BooleanData(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập true/false :");

            boolean input = scanner.nextBoolean();

            System.out.println(input);
            return input;
        }catch (Exception e){
            System.out.println("Hãy nhập vào true / false");
        }finally {
            System.out.println("Kết thúc");
        }

        return false;
    }


    private  static Scanner input(){
        return  new Scanner(System.in);
    }
}
