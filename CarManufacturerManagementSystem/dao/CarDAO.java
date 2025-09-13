package DAO;

import POJO.Car;
import java.util.List;

public interface CarDAO {
	
	void addCar(Car car); // Insert new car
	List<Car> getAllCars(); // Get all cars
	Car getCarById(int id); // Search car by ID
	void updateCar(Car car); // Update car
	void deleteCar(int id); // Delete car

}