public class UserTest {

    public static void main(String[] args) {
        //User user = new User();
        User user = new User("patryk", "qwer123");

        /*user.username = "kornelia";
        user.password = "qaz123";*/
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();

    }
}
