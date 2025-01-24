package org.miu.prob1.B;

import java.util.ArrayList;
import java.util.List;

public class EmployeeInfo {
    public EmployeeInfo() {
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
        List<Employee> noDupsList = new ArrayList();
        noDupsList.add((Employee)employees.get(0));

        for(int i = 1; i < employees.size(); ++i) {
            if (!inList((Employee)employees.get(i), noDupsList)) {
                noDupsList.add((Employee)employees.get(i));
            }
        }

        return noDupsList;
    }

    private static boolean inList(Employee e, List<Employee> emps) {
        for(Employee emp : emps) {
            if (e.equals(emp)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>() {
            {
                this.add(new Employee("Richard", 55000));
                this.add(new Employee("Richard", 55000));
                this.add(new Employee("John", 30000));
                this.add(new Employee("Steve", 30000));
                this.add(new Employee("Zeke", 50000));
                this.add(new Employee("Reggie", 50000));
                this.add(new Employee("Steve", 30000));
                this.add(new Employee("John", 70000));
                this.add(new Employee("Harold", 55000));
                this.add(new Employee("Richard", 55000));
                this.add(new Employee("Richard", 55000));
                this.add(new Employee("Richard", 60000));
                this.add(new Employee("Dennis", 80000));
                this.add(new Employee("Adam", 80000));
                this.add(new Employee("John", 70000));
                this.add(new Employee("Charles", 25000));
                this.add(new Employee("Bill", 60000));
                this.add(new Employee("Bob", 60000));
                this.add(new Employee("Bill", 70000));
                this.add(new Employee("Bob", 60000));
            }
        };
        List<Employee> dupsRemoved = new ArrayList<Employee>() {
            {
                this.add(new Employee("Richard", 55000));
                this.add(new Employee("John", 30000));
                this.add(new Employee("Steve", 30000));
                this.add(new Employee("Zeke", 50000));
                this.add(new Employee("Reggie", 50000));
                this.add(new Employee("John", 70000));
                this.add(new Employee("Harold", 55000));
                this.add(new Employee("Richard", 60000));
                this.add(new Employee("Dennis", 80000));
                this.add(new Employee("Adam", 80000));
                this.add(new Employee("Charles", 25000));
                this.add(new Employee("Bill", 60000));
                this.add(new Employee("Bill", 70000));
                this.add(new Employee("Bob", 60000));
            }
        };
        List<Employee> answer = removeDuplicates(list);
        System.out.println(answer);
        System.out.println("Is answer correct? " + listsAreEqual(answer, dupsRemoved));
    }

    public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
        if (l1.size() != l2.size()) {
            return false;
        } else {
            for(Employee e : l1) {
                if (!l2.contains(e)) {
                    return false;
                }
            }

            return true;
        }
    }
}

