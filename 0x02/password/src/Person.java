public class Person {
    private String user;
    private String password;

    public Person() {
    }

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean checkUser(){
        boolean charEspecial = this.user.matches(".*[\\W]+.*");
        if (this.user.length() < 8) return false;
        if (charEspecial) return false;
        return true;
    }

    public boolean checkPassword(){
        boolean requisitos = password.matches("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}");
        if (!requisitos) return false;
        return true;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
