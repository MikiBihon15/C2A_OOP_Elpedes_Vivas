// user
class User {
    private String email;
    private String role;
    private String idNumber; // NEW 🔹

    public User(String email, String role, String idNumber) {
        this.email = email;
        this.role = role;
        this.idNumber = idNumber;
    }

    public void login() {
        System.out.println(role + " account logged in: " + email + " | ID: " + idNumber);
    }
}
