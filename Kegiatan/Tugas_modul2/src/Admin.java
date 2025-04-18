public class Admin {
    String username = "admin";
    String password = "2025";

    public boolean login(String inputUsername, String inputPassword) {
        return inputUsername.equals(username) && inputPassword.equals(password);
    }
}