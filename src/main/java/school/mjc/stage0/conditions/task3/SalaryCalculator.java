package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double count;
        if(salary >0 && salary <= 10000){
            count =salary*85/100;
            System.out.println(count);
        }else if(salary > 10000 && salary <= 20000){
            count = salary*82/100;
            System.out.println(count);
        }else if(salary > 20000){
            count =salary*80/100;
            System.out.println(count);
        }else{
            System.out.println( "wrong input!");
        }
        
    }
}
