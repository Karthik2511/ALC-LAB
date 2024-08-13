import java.util.Scanner;

class Staff {
    private String staffId;
    private String name;
    private String phone;
    private double salary;

    public Staff(String staffId, String name, String phone, double salary) {
        this.staffId = staffId;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: $" + salary);
    }
}

class Teaching extends Staff {
    private String domain;
    private int publications;

    public Teaching(String staffId, String name, String phone, double salary, String domain, int publications) {
        super(staffId, name, phone, salary);
        this.domain = domain;
        this.publications = publications;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Domain: " + domain);
        System.out.println("Publications: " + publications);
    }
}

class Technical extends Staff {
    private String skills;

    public Technical(String staffId, String name, String phone, double salary, String skills) {
        super(staffId, name, phone, salary);
        this.skills = skills;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Skills: " + skills);
    }
}

class Contract extends Staff {
    private int period;

    public Contract(String staffId, String name, String phone, double salary, int period) {
        super(staffId, name, phone, salary);
        this.period = period;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Contract Period: " + period + " months");
    }
}

public class StaffManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading and displaying details of Teaching staff
        System.out.println("Enter details for Teaching staff:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter staff ID:");
            String staffId = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone:");
            String phone = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter domain:");
            String domain = scanner.nextLine();
            System.out.println("Enter number of publications:");
            int publications = Integer.parseInt(scanner.nextLine());

            Teaching teaching = new Teaching(staffId, name, phone, salary, domain, publications);
            System.out.println("\nTeaching Staff Details:");
            teaching.displayDetails();
        }

        // Reading and displaying details of Technical staff
        System.out.println("\nEnter details for Technical staff:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter staff ID:");
            String staffId = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone:");
            String phone = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter skills:");
            String skills = scanner.nextLine();

            Technical technical = new Technical(staffId, name, phone, salary, skills);
            System.out.println("\nTechnical Staff Details:");
            technical.displayDetails();
        }

        // Reading and displaying details of Contract staff
        System.out.println("\nEnter details for Contract staff:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter staff ID:");
            String staffId = scanner.nextLine();
            System.out.println("Enter name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone:");
            String phone = scanner.nextLine();
            System.out.println("Enter salary:");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter contract period (in months):");
            int period = Integer.parseInt(scanner.nextLine());

            Contract contract = new Contract(staffId, name, phone, salary, period);
            System.out.println("\nContract Staff Details:");
            contract.displayDetails();
        }

        scanner.close();
    }
}
