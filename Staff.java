public class Staff extends Person {
    int employeeID;
    String department;

    public Staff(String name, int age, String address, int ID, String department) {
        super(name, age, address);
        employeeID = ID;
        this.department = department;
    }

    public void changeDepartment(String newDepartment) {
        department = newDepartment;
    }

    @Override
    public String toString() {
        return  personName + "is a staff who has a employeeID #" + employeeID + ", there department is "
                + department + ", there age is " + personAge + " and there address is " + personAddress;
    }

}
