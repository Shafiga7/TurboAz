import dataAccess.BrandDAO;
import dataAccess.CarDAO;
import entity.Brand;

public class Main {
    public static void main(String[] args) {

        CarDAO carDAO = new CarDAO();

        System.out.println(carDAO.getAll());


    }
}
