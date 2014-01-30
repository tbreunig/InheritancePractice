package myconcrete;
/**
 * Concrete Version of HourlyEmployee
 * Subclass of Employee
 * 
 * @author Tyler
 */
public class HourlyEmployee extends Employee{
 
    /**
     * Property the all HOURLY employees have.
     */
    private String hourlyWage;

    /**
     * Constructor for concrete HourlyEmployee
     * 
     * @param fName - a string object
     * @param lName - a string object
     * @param employeeID - a string object
     * @param department - a string object
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
