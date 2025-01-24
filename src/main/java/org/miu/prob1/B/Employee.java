package org.miu.prob1.B;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "(" + this.name + ", " + this.salary + ")";
    }

    public boolean equals(Object e) {
        if (!(e instanceof Employee emp)) return false;
        return emp.name.equals(this.name) && emp.salary == this.salary;
    }
/*    public int hashCode() {
       return Objects.hash(this.name, this.salary);
    }*/
}

