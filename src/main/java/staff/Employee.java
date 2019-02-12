package staff;

public abstract class Employee {

    //    Employee will have a name, NI number and salary.
    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }


    //    Create Getters for all properties.

    public String getName() {
        return this.name;
    }

    public String getNationalInsuranceNumber() {
        return this.nationalInsuranceNumber;
    }


    public double getSalary(){
        return this.salary;
    }
//   Add a method named raiseSalary with takes in a parameter of type double to increment the salary.
//   Prevent a negative value for the raiseSalary method.

    public void raiseSalary(Double raiseAmount){
        if (raiseAmount > 0) {
            this.salary += raiseAmount;
        }
    }
//    Add a method called payBonus which returns 1% of the employees salary.
    public double payBonus(){
        return 0.01 * this.salary;
    }

//    Allow the user to change the Employees name and prevent a null value from being entered.
    public void changeName(String name) {
        if (name != null) {
            this.name = name;
        }
    }


}
