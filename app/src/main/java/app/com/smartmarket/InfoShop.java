package app.com.smartmarket;

public class InfoShop
{
    String add;
    String email;
    String name;
    String phone;

    public InfoShop(String add, String email, String name, String phone) {
        this.add = add;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public InfoShop(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
