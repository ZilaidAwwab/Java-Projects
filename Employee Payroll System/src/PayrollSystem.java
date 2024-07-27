import java.util.ArrayList;

class PayrollSystem {
  private ArrayList<Employee> employeeList;

  public PayrollSystem() {
      this.employeeList = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
      employeeList.add(employee);
  }

  public void removeEmployee(int id) {
      // This is similar to running a for each loop and then removing the employee whose id matches the id provided
      employeeList.removeIf(employee -> employee.getId() == id);
  }

  public void displayEmployees() {
      for (Employee employee: employeeList) {
          System.out.println(employee);
      }
  }
}
