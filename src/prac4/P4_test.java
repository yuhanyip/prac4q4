package prac4;


/**
 *
 * @author
 */
public class P4_test {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Xiao Ming", 5000.00);
        Employee emp2 = new Employee("Xiao Hua");
        emp2.setSalary(5600.00);

// part b
// System.out.print("salary: "+emp1.salary);
//       System.out.print("salary: "+emp1.getSalary());
//
//        emp1.raiseSalary(8.0);
//
//       // System.out.print("salary: "+emp1.getSalary);
//         System.out.print("salary: "+emp1.getSalary());

//part c 
if(emp1.getSalary()>emp2.getSalary()){
            System.out.println(emp1.getName()+" "+emp1.getSalary());
        }
        else{
            System.out.println(emp2.getName()+" "+emp2.getSalary());
        }
         System.out.printf("%.2f + %.2f = %.2f\n",emp1.getSalary(),emp2.getSalary(),(emp1.getSalary() + emp2.getSalary()));
    }
    
}