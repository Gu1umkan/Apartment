import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Gulumkan", "+996990550102", "Jal", 20000);
        Student student2 = new Student("Zarina", "+9996779456756", "Ulan", 50000);
        Student student3 = new Student("kanymai", "+996223451223", "Jal", 10000);
        Student student4 = new Student("Albina", "+996509565645", "Ulan", 45000);
        Student student5 = new Student("Saikal", "+996556787898", "Ulan", 12000);
        Student student6 = new Student("Aiturgan", "+99645367667", "Jal", 34000);
        Student[] students = {student1, student2, student3, student4, student5, student6};

        Apartment apartment1 = new Apartment("Kut", 30000, "Jal");
        Apartment apartment2 = new Apartment("ELite - House", 20000, "Ulan");
        Apartment[] apartments = {apartment1, apartment2};
        System.out.print("Enter address: ");
        String address = new Scanner(System.in).nextLine();

        findStudentByaddress(students, apartments, address);

        System.out.println("__________________________________________________________________");
        for (Apartment apartment : apartments) {
            System.out.printf("Every student  at the %s %d payed\n",
                    apartment.getAddress(), apartment.payPerMonth(students));
        }
        System.out.println("******************************************************************");
            new Student().liveIn(apartments, students);
        System.out.println("*****************************************************************");
        System.out.println("Which student's information do you want to update?");
        for (int i = 0; i < students.length; i++) {
            System.out.println(i + 1 + "." + students[i].getFullName());
        }
        System.out.println("Enter student number:");
        int numberStudent = new Scanner(System.in).nextInt();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" +
                "\n1)Update name; \n2) Update phone number;" +
                "\n3)Update address; \n3)Update BankAccaunt;" +
                "\n*Enter your choise:");
        int choise = new Scanner(System.in).nextInt();
        students[numberStudent - 1].changeInfo(choise);
        System.out.println("Updated information:\n" + students[numberStudent - 1].studentInfo());

    }
    public static void findStudentByaddress(Student[] students, Apartment[] apartments, String address) {
        int isTrue = 0;
        for (Apartment apartment : apartments) {
            if (address.equalsIgnoreCase(apartment.getAddress())) {
                System.out.println("********************************************" +
                        apartment.getInfo());

            } else isTrue++;
            if (isTrue == apartments.length)
                System.out.println("There are no apartment at this address\n");
        }
        System.out.println("Residents at this address:");
        int k = 1;
        for (Student student : students) {
            isTrue = 0;
            if (address.equalsIgnoreCase(student.getAddress())) {
                System.out.println("---------------------------------------------\n"
               + k++ +"." + student.studentInfo());
            } else isTrue++;
            if (isTrue == students.length)
                System.out.println("There are no students at this address");
        }
        System.out.println("********************************************");
    }

}

