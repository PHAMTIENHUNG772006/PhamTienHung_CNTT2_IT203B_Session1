package Gioi.Gioi2;

import java.io.IOException;

public class Main {


    static void saveToFile() throws IOException {
        System.out.println("Đang lưu dữ liệu vào file...");
        throw new IOException("Lỗi: Không thể ghi file!");
    }


    static void processUserData() throws IOException {
        System.out.println("Đang xử lý dữ liệu người dùng...");
        saveToFile();
    }


    public static void main(String[] args) {
        try {
            processUserData();
        } catch (IOException e) {
            System.out.println("Đã bắt lỗi tại main:");
            System.out.println(e.getMessage());
        }

        System.out.println("Chương trình vẫn tiếp tục chạy.");
    }
}