import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        Teacher lizzie = new Teacher(1, "Lizzie Butcher", 1000);
        Teacher amie = new Teacher(2, "Amie Martin", 1200);
        Teacher lee = new Teacher(3, "Lee Matador", 1800);

        teachers.add(lizzie);
        teachers.add(amie);
        teachers.add(lee);

        Student amara = new Student(1, "Amara Shah", 4);
        Student melee = new Student(2, "Melee Mose", 9);
        Student moseley = new Student(3, "Moseley Aaron", 12);

        students.add(amara);
        students.add(melee);
        students.add(moseley);

        School pms = new School(teachers, students);

        melee.payFees(5000);
        moseley.payFees(2000);
        amara.payFees(4000);

        System.out.println(amara);

        System.out.println("PMS has earned $" + pms.getTotalMoneyEarned());

        System.out.println("Making PMS pay salaries");

        lizzie.receiveSalary(lizzie.getSalary());

        System.out.println(lizzie);

        System.out.println("PMS has earned $" + pms.getTotalMoneyEarned());
    }
}
