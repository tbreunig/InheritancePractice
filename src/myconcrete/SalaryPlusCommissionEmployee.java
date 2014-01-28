package myconcrete;
/**
 * @author Tyler
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private String commission;

    public SalaryPlusCommissionEmployee(String fName, String lName, String employeeID, String salary) {
        super(fName, lName, employeeID, salary);
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }
    
    
    
}
