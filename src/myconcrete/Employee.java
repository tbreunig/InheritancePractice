package myconcrete;
/**
 * Concrete Version of Employee 
 * 
 * @author Tyler
 */
public class Employee {
    
    /**
     * Properties that all employees have.
     */
    private String fName;
    private String lName;
    private String employeeID;
    private String department;

    /**
     * Constructor for Concrete Employee
     * 
     * @param fName - a string object
     * @param lName - a string object
     * @param employeeID - a string object
     * @param department - a string object
     */
    public Employee(String fName, String lName, String employeeID, String department) {
        this.fName = fName;
        this.lName = lName;
        this.employeeID = employeeID;
        this.department = department;
    }

    /**
     * Gets employees first name.
     * 
     * @return - first name as a String
     */
    public String getfName() {
        return fName;
    }

    /**
     * Sets the employee name in the form of a string object.
     * 
     * @param fName - a string object 
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * Gets the employee last name in the form of a string object.
     * 
     * @return - a string object 
     */
    public String getlName() {
        return lName;
    }

    /**
     * Gets the employee first name in the form of a string object.
     * 
     * @param lName - a string object
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     * Gets the employee ID in the form of a string object.
     * 
     * @return - a string object
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the employee ID in the form of a string object.
     * 
     * @param employeeID - a string object
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the employee department in the form of a string object
     * 
     * @return - a string object
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the employee department in the form of a string object.
     * 
     * @param department - a string object
     */
    public void setDepartment(String department) {
        this.department = department;
    }

}
