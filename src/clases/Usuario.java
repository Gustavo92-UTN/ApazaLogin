package clases;
/*@author Gustavo Apaza Huanca*/
public class Usuario {
    private String username;
    private String password;
    private String email;
    private String dni;

    public Usuario(String username, String password, String email, String dni) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dni = dni;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }
    
}
