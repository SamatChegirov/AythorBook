public class Author {
    private String AuthorName;
    private String email;
    private char gender;

    public Author() {
    }

    public Author(String authorName, String email, char gender) {
        AuthorName = authorName;
        this.email = email;
        this.gender = gender;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AuthorName: " + AuthorName + ", email: " + email + ", gender: " + gender + ".";
    }
}
