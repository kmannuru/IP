package assignments.assignment3;

public class EmployeeSorter {

    public static void main(String []args){
        Employee emp1= new Employee(123456789L, "foo1","bar1", "test1@abc.com");
        Employee emp2= new Employee(123456790L, "foo2","bar2", "test2@abc.com");
        Employee emp3= new Employee(123456791L, "foo3","bar3", "test3@abc.com");
        Employee emp4= new Employee(123456792L, "foo4","bar4", "test4@abc.com");
        Employee emp5= new Employee(123456793L, "foo5","bar5", "test5@abc.com");

        Employee[] arr = {emp2,emp1,emp4,emp5,emp3};

        for(int i=1;i<arr.length;i++){
            Employee currentEmp = arr[i];
            int j=i-1;
            while(j >=0){
                if(currentEmp.getEmployeeNumber() < arr[j].getEmployeeNumber()){
                   arr[j+1] = arr[j];
                   j--;
                }else{
                    break;
                }
            }

            if(i != j){
                arr[j+1] = currentEmp;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].toString());
        }
    }
}
