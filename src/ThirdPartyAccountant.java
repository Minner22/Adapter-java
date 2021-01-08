import java.util.List;

public class ThirdPartyAccountant {

    public void withdrawPaycheck(List<Employee> employeeList) {
        for (Employee employee: employeeList) {
            System.out.println("$" + employee.salary + " payed to " + employee.name + " in " + employee.team + " team.");
        }
    }
}
