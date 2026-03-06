package Gioi.Gioi1;

public class User {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0){
            throw new IllegalArgumentException("Tuổi không thể âm ");
        }else {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        User user1 = new User();

        User user2 = new User();

        user1.setAge(18);

        user2.setAge(-1);

    }
}
