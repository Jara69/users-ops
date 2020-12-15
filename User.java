package cz.educanet.webik;

public class User {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String email;

    public User(String email ,String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public User(String firstname, String lastname, String username, String password) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstname(){
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }


    public void setLastname(){
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setEmail(){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String changeUsername(String newUsername){
        return this.username = newUsername;

    }

    public String changePassword(String newPassword){
        return this.username = newPassword;

    }
}

