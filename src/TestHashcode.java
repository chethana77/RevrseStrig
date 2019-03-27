import java.util.*;

public class TestHashcode {


    public static void main(String[] args)
    {

        Employee employee=new Employee();

        Employee e1=new Employee();
        e1.empid=1;
        e1.ename="Chethana";

        Employee e2=new Employee();
        e2.empid=2;
        e2.ename="Prashanthi";


        System.out.println("equals" + e1.equals(e2));

        System.out.println("HashCode - " +e1.hashCode());
        System.out.println("HashCode - " +e2.hashCode());
        System.out.println("HashCode - " +e1);

        HashMap<String,Employee> employeeHashMap=new HashMap<String, Employee>();

        employeeHashMap.put(e1.ename,e1);
        employeeHashMap.put(e2.ename,e2);

        List<String> fruits=new ArrayList<>();
        Collections.addAll(fruits,"cheth","test","tet");
        fruits.forEach(System.out::println);

    }

}
