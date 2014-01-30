package myconcrete;
/**
 * Concrete Version of Salaried Employee
 * 
 * @author Tyler
 */
public class SalariedEmployee {
 
    /**
     * Properties that SalariedEmployees will have.
     */
    private String firstName;
    private String lastName;
    private String employeeID;
    private String salary;

    /**
     * Constructor for concrete Salaried Employees.
     * 
     * @param firstName
     * @param lastName 
     * @param employeeID
     * @param salary - Annual Salary
     */
    public SalariedEmployee(String firstName, String lastName, String employeeID, String salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    
    /**
     * Gets the employees first name in the form of a string object.
     * 
     * @return - Employee First Name
     */
    public String getfirstName() {
        return firstName;
    }

    /**
     * Sets the employees first name in the form of a string object.
     * 
     * @param firstName
     */
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the employees last name in the form of a string object.
     * 
     * @return - Employee Last Name
     */
    public String getlastName() {
        return lastName;
    }

    /**
     * Sets the employees last name in the form of a string object.
     * 
     * @param lastName
     */
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the employees ID number in the form of a string object.
     * 
     * @return - Employee ID Number
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the employees ID number in the form of a string object.
     * 
     * @param employeeID
     */
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * Gets the employees annual salary in the form of a string object.
     * 
     * @return - Employees Annual Salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * Sets the employees annual salary in the form of a string object.
     * 
     * @param salary 
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
}
