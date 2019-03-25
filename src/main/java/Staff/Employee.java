package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void incSalary(double incRate) {
        if (incRate >= 0) {
            this.salary = this.salary * incRate;
        }
    }
    public double payBonus(){
        return (this.salary * 0.01);
    }
}
