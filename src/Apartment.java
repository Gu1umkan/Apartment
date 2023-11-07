public class Apartment {
    private String title;
    private int price;
    private String address;
    public Apartment(){}

    public Apartment(String title, int price, String address) {
        this.title = title;
        this.price = price;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getInfo() {
        return
                "\nApartment title: " + title +
                "\nprice: " + price +
                "\naddress: " + address ;
    }
    public int payPerMonth(Student[] students){
        int counter = 0;
        for (Student student:students) {
            if(student.getAddress() == address){
                counter++;
            }
        }
        return price / counter;

    }
}
