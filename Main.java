public class Main {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        Employee emp1 = new FullTimeEmployee(
                101,           
                "Rahul",       
                50000          
        );

        Employee emp2 = new PartTimeEmployee(
                102,           
                "Aman",        
                40,            
                500            
        );

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);

        System.out.println("----- Employee List -----");
        payroll.displayEmployee();

        payroll.removeEmployee(101);

        System.out.println("\n----- After Removing Employee with ID 101 -----");
        payroll.displayEmployee();
    }
}
