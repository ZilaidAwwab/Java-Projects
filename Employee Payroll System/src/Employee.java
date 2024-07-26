abstract class Employee {
  private String name;
  private int id;

  public Employee(String name, int id) {
      this.name = name;
      this.id = id;
  }

  public String getName() {
      return name;
  }

  public int getId() {
      return id;
  }

  /*
  abstract method are those to which we don't provide an id, we just declare them and leave them
  as it is as can be seen, we will define this method in the class where we will extend this class
   */
  public abstract double calculateSalary();

  /*
  We use override decorator whenever we are to use polymorphism, in this case the name of the method might
  be same but the functioning is different as per defined in every class
  */
  @Override
  public String toString() {
      return "Employee [name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
  }
}
