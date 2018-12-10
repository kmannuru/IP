package assignments.assignment3;

public class Employee {
    Long employeeNumber;
    String firstName;
    String lastName;
    String email;

    public Employee(Long employeeNumber, String firstName, String lastName, String email){
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getEmployeeNumber() {
        return employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString(){
        return "EmployeeNumber :"+this.employeeNumber + " Name : "+this.firstName+" "+this.lastName+" Email : "+this.email;
    }
}
