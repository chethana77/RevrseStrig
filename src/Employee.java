import java.util.Objects;

public class Employee
{
    int empid;
    String ename;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public int hashCode() {
       // return super.hashCode();
        return Objects.hash(ename,empid);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) return true;
        if(!(obj instanceof Employee)) return  false;
        Employee e=(Employee) obj;
        return this.empid==e.empid ;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}