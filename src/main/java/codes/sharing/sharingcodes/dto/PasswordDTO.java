package codes.sharing.sharingcodes.dto;

public class PasswordDTO {

    public PasswordDTO(String password) {
        this.password = password;
    }
    public PasswordDTO() {
        this.password = "";
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
