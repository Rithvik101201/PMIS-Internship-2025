package DAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.CarDAO;
import POJO.Car;
public class CarDAOImpl implements CarDAO{
	
	private static final String URL = "jdbc:sqlserver://localhost:1433/carDB" ;
	private static final String USER = "root";
	private static final String PASS = "";
	
	private Connection getConnection() throws SQLException{
		// DriverManager : responsible for establishing the connection with a data base
		return DriverManager.getConnection(URL, USER, PASS);
	}

	@Override
	public void addCar(Car car) { // This method is for inserting the data
		String sql = "INSERT INTO cars(name, model, price, manufacturer) VALUES (?, ?, ?, ?)";
		
		try {
			// PreparedStatement : used to handle the dynamic query
			PreparedStatement ps = getConnection().prepareStatement(sql);
				
			ps.setString(1, car.getName());
			ps.setString(2, car.getModel());
			ps.setDouble(3, car.getPrice());
			ps.setString(4, car.getManufacturer());
			
			// executeUpdate method is responsible for executing the query
			ps.executeUpdate();
			
			System.out.println("Car added successfully!");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public List<Car> getAllCars() { // This method is for fetching every single data
		String sql = "SELECT * FROM cars";
		
		try {
			// Statement : used to handle the query (no dynamic change)
			Statement st = getConnection().prepareStatement(sql);
			ResultSet data = st.executeQuery(sql);
			
			// Creating a new array list with a reference "dataInListFormat"
			List<Car> dataInListFormat = new ArrayList<>();
		
			while (data.next()) {
				Car car = new Car();
						
				car.setId(data.getInt("id"));
				car.setName(data.getString("name"));
				car.setModel(data.getString("model"));
				car.setPrice(data.getDouble("price"));
				car.setManufacturer(data.getString("manufacturer"));
				dataInListFormat.add(car);
			}
				
			return dataInListFormat;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public Car getCarById(int id) { // This method is for fetching the data with a particular id
		String sql = "SELECT * FROM cars WHERE id = ?";
		
		try {
			Statement st = getConnection().createStatement();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		return null;
	}

	@Override
	public void updateCar(Car car) { // This method is for updating the data
		String sql = "UPDATE cars SET name = ?, model = ?, price = ?, manufacturer = ? WHERE id = ?";
		
		try {
			// PreparedStatement : used to handle the dynamic query
			PreparedStatement ps = getConnection().prepareStatement(sql);
			
			ps.setDouble(3, car.getPrice());
			ps.setString(1, car.getName());
			
			int rows = ps.executeUpdate();
			
			if (rows > 0) {
				System.out.println("Car updated successfully");
			}else {
				System.out.println("Car not found!");
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteCar(int id) { // This method is for removing the data
		String sql = "DELETE FROM cars WHERE id = ?";
		
		try {
			// PreparedStatement : used to handle the dynamic query
			PreparedStatement ps = getConnection().prepareStatement(sql);
			
			ps.setInt(1, id);
			
			int rows = ps.executeUpdate();
			
			if (rows > 0) {
				System.out.println("Car deleted successfully");
			}else {
				System.out.println("Car not found!");
			}
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}
