package myconcrete;
/**
 * @author Tyler
 */
public class Employee {
    
    private String fName;
    private String lName;
    private String employeeID;
    private String department;

    public Employee(String fName, String lName, String employeeID, String department) {
        this.fName = fName;
        this.lName = lName;
        this.employeeID = employeeID;
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
