package myconcrete;
/**
 * Concrete Version of HourlyEmployee
 * Subclass of Employee
 * 
 * @author Tyler
 */
public class HourlyEmployee extends Employee{
 
    private String hourlyWage;

    /**
     * 
     * @param fName
     * @param lName
     * @param employeeID
     * @param department 
     */
    public HourlyEmployee(String fName, String lName, String employeeID, String department) {
        super(fName, lName, employeeID, department);
    }

    /**
     * Gets hourly wage in the form of a string object.
     * 
     * @return - a string object
     */
    public String getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Sets hourly wage in the form of string object.
     * 
     * @param hourlyWage - a string object
     */
    public void setHourlyWage(String hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
}
