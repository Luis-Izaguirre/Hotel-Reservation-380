package HotelModel;

public class Customer {
    private String idCustomer;
    private String name;
    private String email;
    private String phone;

    Customer(String idCustomer, String name, String email, String phone){
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }


    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
