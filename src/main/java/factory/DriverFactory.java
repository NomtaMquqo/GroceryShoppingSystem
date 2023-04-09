package factory;

/**
 * Driver Factory Class
 * @author: Gilberto Silva
 * student number: 218239300
 */
import domain.Driver;
import util.Helper;

public class DriverFactory {
    public static Driver createDriver (int driver_ID, String first_Name, String last_Name, int driver_License_Number, String vehicle_Information, long phone_Number, String email){

        if (Helper.isNullorEmpty(first_Name) || Helper.isNullorEmpty(email))
            return null;
        ;
        String driver_NumGen = Helper.generateId();
        Driver driver = new Driver.Builder().setDriver_ID(driver_ID)
                .setFirst_Name(first_Name)
                .setLast_Name(last_Name)
                .setDriver_License_Number(driver_License_Number)
                .setVehicle_Information(vehicle_Information)
                .setEmail(email)
                .build();
        return driver;
    }
}
