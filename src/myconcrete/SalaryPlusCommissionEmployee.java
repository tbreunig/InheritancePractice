package myconcrete;
/**
 * Concrete Version of Salary-Plus-Commission-Employee
 * Subclass of Salaried Employee
 * 
 * @author Tyler
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {

    /**
     * Property that SalariedPlusCommissionEmployees will have.
     */
    private String commission;
    
    /**
     * Constructor for concrete Salaried Plus Commission Employees.
     * 
     * @param fName - a string object
     * @param lName - a string object
     * @param employeeID - a string object
     * @param salary - a string object
     */
    public SalaryPlusCommissionEmployee(String fName, String lName, String employeeID, String salary) {
        super(fName, lName, employeeID, salary);
    }

    /**
     * Gets the employees commission amount in the form of a string object.
     * 
     * @return - a string object
     */
    public String getCommission() {
        return commission;
    }
    
    /**
     * Sets the employees commission amount in the form of a string object.
     * 
     * @param commission - a string object
     */
    public void setCommission(String commission) {
        this.commission = commission;
    }
    
    
    
}
