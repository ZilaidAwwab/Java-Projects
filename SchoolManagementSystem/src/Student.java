public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    // we are not going to alter the student name and id so, we should not make a setter for name and id
    // Setters should always be void and getter should always be returning some data type

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // The school is going to receive the funds submitted as a fees by students
    public void payFees(int fees) {
        feesPaid += fees;

        // we made this method static in its class so to access it here
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + "\n"
                + "Total fees paid so far: $" + feesPaid;
    }
}
