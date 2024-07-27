public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTimeEmployee alen = new FullTimeEmployee("Alen Carter", 1, 2000);
        PartTimeEmployee fabian = new PartTimeEmployee("Fabien Ruiz", 2, 40, 20);

        payrollSystem.addEmployee(alen);
        payrollSystem.addEmployee(fabian);

        System.out.println("Initial Employee details: ");
        payrollSystem.displayEmployees();

        System.out.println("Removing Employee: ");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaining Employees Details: ");
        payrollSystem.displayEmployees();
    }
}
