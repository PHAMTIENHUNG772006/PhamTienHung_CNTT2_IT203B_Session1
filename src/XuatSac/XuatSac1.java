package XuatSac;

public class XuatSac1 {
    public static void main(String[] args) {

        try {
            User user = new User("Hung", -5);
            user.display();
        }
        catch (InvalidAgeException e) {
            System.out.println("Lỗi nghiệp vụ:");
            e.printStackTrace();
        }

        System.out.println("Chương trình vẫn tiếp tục.");
    }
}
