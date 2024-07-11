import java.util.ArrayList;
import java.util.Scanner;

interface Manageable {
    void add();
    void display();
}

class Bus implements Manageable {
    int busID;
    String busName;
    int capacity;

    static ArrayList<Bus> busList = new ArrayList<>();
    private Scanner sc;

    public Bus(Scanner sc) {
        this.sc = sc;
    }
    public Bus(int id, String name, int cap) {
        busID = id;
        busName = name;
        capacity = cap;
    }
    public void add() {
        System.out.print("Enter Bus ID: ");
        int id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Bus Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Bus Capacity: ");
        int cap = sc.nextInt();

        Bus bus = new Bus(id, name, cap);
        busList.add(bus);
        System.out.println("Bus added successfully!");
        
        System.out.println("Current bus list:");
        for (Bus b : busList) {
            System.out.println(b.busID + ", " + b.busName + ", " + b.capacity);
        }
    }
    public void display() {
        if (busList.isEmpty()) {
            System.out.println("No buses to display.");
        } else {
            System.out.println("List of buses:");
            for (Bus bus : busList) {
                System.out.println("Bus ID: " + bus.busID + ", Bus Name: " + bus.busName + ", Capacity: " + bus.capacity);
            }
        }
    }
}
class Driver implements Manageable {
    int driverID;
    String driverName;
    int experience;

    static ArrayList<Driver> driverList = new ArrayList<>();
    private Scanner sc;

    public Driver(Scanner sc) {
        this.sc = sc;
    }
    public Driver(int id, String name, int exp) {
        driverID = id;
        driverName = name;
        experience = exp;
    }
    public void add() {
        System.out.print("Enter Driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Experience (years): ");
        int exp = sc.nextInt();

        Driver driver = new Driver(id, name, exp);
        driverList.add(driver);
        System.out.println("Driver added successfully!");
        
        System.out.println("Current driver list:");
        for (Driver d : driverList) {
            System.out.println(d.driverID + ", " + d.driverName + ", " + d.experience);
        }
    }
    public void display() {
        if (driverList.isEmpty()) {
            System.out.println("No drivers to display.");
        } else {
            System.out.println("List of drivers:");
            for (Driver driver : driverList) {
                System.out.println("Driver ID: " + driver.driverID + ", Driver Name: " + driver.driverName + ", Experience: " + driver.experience + " years");
            }
        }
    }
}
class Route implements Manageable {
    int routeID;
    String startPoint;
    String endPoint;

    static ArrayList<Route> routeList = new ArrayList<>();
    private Scanner sc;

    public Route(Scanner sc) {
        this.sc = sc;
    }
    public Route(int id, String start, String end) {
        routeID = id;
        startPoint = start;
        endPoint = end;
    }
    public void add() {
        System.out.print("Enter Route ID: ");
        int id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Start Point: ");
        String start = sc.nextLine();
        System.out.print("Enter End Point: ");
        String end = sc.nextLine();

        Route route = new Route(id, start, end);
        routeList.add(route);
        System.out.println("Route added successfully!");
        
        System.out.println("Current route list:");
        for (Route r : routeList) {
            System.out.println(r.routeID + ", " + r.startPoint + ", " + r.endPoint);
        }
    }
    public void display() {
        if (routeList.isEmpty()) {
            System.out.println("No routes to display.");
        } else {
            System.out.println("List of routes:");
            for (Route route : routeList) {
                System.out.println("Route ID: " + route.routeID + ", Start Point: " + route.startPoint + ", End Point: " + route.endPoint);
            }
        }
    }
}
public class BusManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus busManager = new Bus(sc);
        Driver driverManager = new Driver(sc);
        Route routeManager = new Route(sc);

        while (true) {
            System.out.println("Bus Management System");
            System.out.println("1. Add Bus");
            System.out.println("2. Display Buses");
            System.out.println("3. Add Driver");
            System.out.println("4. Display Drivers");
            System.out.println("5. Add Route");
            System.out.println("6. Display Routes");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    busManager.add();
                    break;
                case 2:
                    busManager.display();
                    break;
                case 3:
                    driverManager.add();
                    break;
                case 4:
                    driverManager.display();
                    break;
                case 5:
                    routeManager.add();
                    break;
                case 6:
                    routeManager.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
