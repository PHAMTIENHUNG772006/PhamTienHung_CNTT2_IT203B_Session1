package XuatSac.XuatSac2;

import XuatSac.InvalidAgeException;

public class Main {

    public static void main(String[] args) {

        try {

            User user = new User("Hung", -10);
            user.display();

        }
        catch (InvalidAgeException e) {
            Logger.logError("Lỗi khi tạo người dùng", e);

        }

        System.out.println("Chương trình vẫn tiếp tục chạy");
    }
}