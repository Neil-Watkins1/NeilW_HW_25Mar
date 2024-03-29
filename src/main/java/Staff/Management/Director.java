package Staff.Management;

import Staff.Employee;

public class Director extends Manager {

    private double budget;


    public Director (String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }


    public double getBudget() {
        return budget;
    }

    public void setBudget(double newBudget) {
        this.budget = newBudget;
    }

    @Override
    public double payBonus() {
        return (this.getSalary() * 0.02);
    }
}
