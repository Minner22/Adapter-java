public class Client {
    public static void main(String[] args) {
        String[][] employeesArray = {
                {"15", "Adam", "IT", "15000"},
                {"116","Ewa", "HR", "6000"},
                {"117", "Piotr", "support", "4600"},
                {"118", "Dominika", "manager", "13000"},
                {"119", "Marcin", "CEO", "25000"}};

        ICompanyPaychecks paychecks = new EmployeeAdapter();
        paychecks.processCompanyPaychecks(employeesArray);
    }
}
