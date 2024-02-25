package TUGAS1;

public class Admin {
    String username, password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean checkAdmin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

