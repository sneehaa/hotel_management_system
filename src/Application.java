import view.homepage.Homepage;
import view.login.ManagerLogin;

class Application {
    public static void main(String[] args) {
        new Homepage().setVisible(true);
        new ManagerLogin().setVisible(true);
    }

}