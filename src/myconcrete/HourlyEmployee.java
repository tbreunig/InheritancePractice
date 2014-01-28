package myconcrete;
/**
 * @author Tyler
 */
public class HourlyEmployee extends Employee{
 
    private String hourlyWage;

    public HourlyEmployee(String fName, String lName, String employeeID, String department) {
        super(fName, lName, employeeID, department);
    }

    public String getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(String hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
}
