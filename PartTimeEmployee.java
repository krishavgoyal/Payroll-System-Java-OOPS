public class PartTimeEmployee extends Employee{
    private int hours_worked;
    private double salary_per_hour;

    public PartTimeEmployee(int id, String name , int hours_worked ,double salary_per_hour ){
        super(id, name);
        this.hours_worked=hours_worked;
        this.salary_per_hour = salary_per_hour;
    }
    public double calculatesalary(){
        return (hours_worked*salary_per_hour);
    }   
}
