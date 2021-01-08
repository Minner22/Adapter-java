import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter extends ThirdPartyAccountant implements ICompanyPaychecks {

    @Override
    public void processCompanyPaychecks(String[][] employeesArray) {

        String Id = null, name = null, team = null, salary = null;
        List<Employee> employeeList = new ArrayList<>();

        for (String[] strings : employeesArray) {
            for (int j = 0; j < strings.length; j++) {
                switch (j) {
                    case 0:
                        Id = strings[j];
                        break;
                    case 1:
                        name = strings[j];
                        break;
                    case 2:
                        team = strings[j];
                        break;
                    case 3:
                        salary = strings[j];
                        break;
                    default:
                        System.out.println("error occurred");
                        break;
                }
            }
            employeeList.add(new Employee(Integer.parseInt(Id), name, team, Double.parseDouble(salary)));
        }

        withdrawPaycheck(employeeList);
    }
}
