package sef.finaltask.activity.FirstTask;

import java.util.Comparator;

public class CompareSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee arg1, Employee  arg2) {
        if(arg1.getSalary() < arg2.getSalary())
            return 1;
        else if (arg1.getSalary() > arg2.getSalary())
            return -1;
        else
            return 0;
    }
}
