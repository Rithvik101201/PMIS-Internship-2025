package carManagament;

import java.util.List;
import java.util.Scanner;

import DAO.CarDAO;
import DAOImpl.CarDAOImpl;
import POJO.Car;

public class Main {

	// main method is entry point of this program
	public static void main(String[] args) {

		// scanner class is used to get input from user to choose options and details
		Scanner sc = new Scanner(System.in);

		// CarDao Parent reference is created with child CarDAOImpl object
		CarDAO dao = new CarDAOImpl();

		while (true) {
			System.out.println("\n===Car Manufacturer Management System  Menu ===");
			System.out.println("1. Add Car");
			System.out.println("2. View All Cars");
			System.out.println("3. Search Car by ID");
			System.out.println("4. Update Car");
			System.out.println("5. Delete Car");
			System.out.println("6. Exit");
			System.out.println("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Car Name:");
				String name = sc.next();
				System.out.println("Enter model");
				String model = sc.next();
				System.out.println("Enter price");
				double price = sc.nextDouble();
				System.out.println("Enter manufacturer");
				String manu = sc.next();
				dao.addCar(new Car(name, model, price, manu));
				break;

			case 2:
				List<Car> cars = dao.getAllCars();
				if (cars.isEmpty()) {
					System.out.println("No cars found!");
				}
				break;

			case 3:
				System.out.println("Enter Car ID");
				int cid = sc.nextInt();
				Car c = dao.getCarById(cid);
				if (c != null) {
					System.out.println(c);

				} else {
					System.out.println("Car not found");
				}
				break;

			case 4:
				System.out.println("Enter CarID to Update: ");
				int uid = sc.nextInt();
				System.out.println("Enter New Car Name:");
				String uname = sc.next();
				System.out.println("Enter New Model:");
				String umodel = sc.next();
				System.out.println("Enter the new price");
				double uprice = sc.nextDouble();
				System.out.println("Enter NEW Manufacturer");
				String umanu = sc.next();
				dao.updateCar(new Car(uid, uname, umodel, uprice, umanu));
				break;

			case 5:
				System.out.println("Enter Car Id to Delete: ");
				int did = sc.nextInt();
				dao.deleteCar(did);
				break;

			case 6:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice");
			}

		}

	}

}
