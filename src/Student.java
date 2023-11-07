import java.util.Scanner;

public class Student {
    private String fullName;
    private String phoneNumber;
    private String address;
    private int bankAccaunt;

    public Student() {
    }

    public Student(String fullName, String phoneNumber, String address,int bankAccaunt) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.bankAccaunt = bankAccaunt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBankAccaunt() {
        return bankAccaunt;
    }

    public void setBankAccaunt(int bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }


    public String studentInfo() {
        return "Name= " + fullName +
                " \nphoneNumber:  " + phoneNumber +
                " \naddress:  " + address +
                " \nbankAccaunt:  " + bankAccaunt;
    }

    public void liveIn(Apartment[] apartments, Student[] students) {
        for (Apartment apartment:apartments) {
        for (Student student : students) {
            if (apartment.getAddress().equals(student.getAddress())) {
                System.out.println(student.getFullName() + " can live in the apartment for " +
                        (int)(student.getBankAccaunt()/apartment.payPerMonth(students)) + " months");
            }
        }
    }
    }

    public void changeInfo(int choise){
        switch (choise) {
            case 1:
                System.out.println("Enter new name:");
                String newName = new Scanner(System.in).nextLine();
                fullName = newName; break;
            case 2:
                System.out.println("Enter new phoneNumber");
                String newPhoneNumber = new Scanner(System.in).nextLine();
                phoneNumber = newPhoneNumber; break;
            case 3:
                System.out.println("Enter new Address:");
                String adres = new Scanner(System.in).nextLine();
                address = adres; break;
            case 4:
                System.out.println("Enter new bankAccaont:");
               int bankaccaunt = new Scanner(System.in).nextInt();
                bankAccaunt = bankaccaunt; break;
            default:
                System.err.println("invalid choise");
        }
    }

}
