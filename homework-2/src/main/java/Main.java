import service.UserService;
import service.impl.UserServiceImpl;


public class Main {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.start();
    }
}
