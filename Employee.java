import java.util.*;

public class Employee {
 static  int Hour_wage=20;
    static int full_day_hour=8;
    static int part_time_hour=2;

  public static int presentOrAnsent(){
        int ans= (int) ((Math.random()*10)%3);
        return ans;

    }

   public static int calculateDailyWage(int present_or_absent){

        int daily_wage;
        switch (present_or_absent){
            case 1:
                daily_wage=Hour_wage*full_day_hour;
                break;
            case 2:
                daily_wage=part_time_hour*Hour_wage;
                break;
            default:
                daily_wage=0;


        }
        return daily_wage;

    }

public static void main(String[] args){
       

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	 int monthlyWage=0;
	for(int i=0;i<20;i++){
	int present_or_absent=presentOrAnsent();

 	int daily_wage=calculateDailyWage(present_or_absent);
	monthlyWage+=daily_wage;
	}
	
}
}