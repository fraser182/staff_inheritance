package staff.management;

public class Director extends Manager {

//    Add a private property to store a double value budget.
    private Double budget;

//    Create a constructor for Director that includes the parameters needed for Manager and the budget parameter.
    public Director(String name, String nationalInsuranceNumber, double salary, String deptName, Double budget) {
    super(name, nationalInsuranceNumber, salary, deptName);
    this.budget = budget;
    }

//    Create a getter method for this property.

    public Double getBudget() {
        return budget;
    }

//    Override the payBonus in director to return 2% of their salary.
    public double payBonus(){
        return 0.02 * super.getSalary();
    }

}
