package lab03;

public class que5 {
    int emp_id, salary;
    String name, address, department, email;
    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [emp_id =" + emp_id + ", salary=" + salary + ", name= " + name + ", address = " + address
                + ", department= " + department + ", email = " + email + "]";
    }
}
class Main {
    public static void main(String[] args) throws Exception {
        que5 emp = new que5();
        emp.setEmp_id(101);
        emp.setName("Aryan Tayal");
        emp.setDepartment("IT");
        emp.setSalary(15000);
        emp.setAddress("New Delhi");
        emp.setEmail("aryantayal123@gmail.com");
        System.out.println(emp);
        int sal = emp.getSalary();
        int increment = 0;
        if ((sal >= 1000) && (sal <= 1500)) {
            increment += (sal * 2) / 100;
            sal = sal + increment;
            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);

        }
        else if ((sal >= 1500) && (sal <= 20000)) {
        //incrementing salary 5% increment+= (sal * 5)/100; sal = sal+increment;
            emp.setSalary(sal);
            System.out.println("\n Salary is incremented \n");
            System.out.println(emp);
        }
        else {
            System.out.println("\n Salary is not incremented \n");
            System.out.println(emp);
        }
    }

    
}
