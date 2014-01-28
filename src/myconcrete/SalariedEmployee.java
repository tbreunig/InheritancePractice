package myconcrete;
/**
 * @author Tyler
 */
public class SalariedEmployee {
 
    private String fName;
    private String lName;
    private String employeeID;
    private String salary;

    public SalariedEmployee(String fName, String lName, String employeeID, String salary) {
        this.fName = fName;
        this.lName = lName;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
