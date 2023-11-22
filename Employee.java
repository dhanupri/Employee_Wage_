import java.util.*;

public class Employee {
 static  int Hour_wage=20;
    static int full_day_hour=8;
    static int part_time_hour=2;
static int max_working_hour=100;
    static int max_woking_days=20;
    static int working_day_per_month=20;


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
 public static int calculateWork_hours(int present_or_Absent){
        switch (present_or_Absent){
            case 1:
                return full_day_hour;
            case 2:
                return part_time_hour;
            default:
                return 0;
        }
    }

public static void main(String[] args){
       

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	 int monthlyWage=0;
	int totworkingHour=0;
        int totworkingDays=0;

        while(totworkingHour<max_working_hour && totworkingDays<max_woking_days){
	int present_or_absent=presentOrAnsent();

 	int daily_wage=calculateDailyWage(present_or_absent);
	monthlyWage+=daily_wage;
	 totworkingHour+=calculateWork_hours(present_or_absent);
            if( present_or_absent==1 || present_or_absent==2){
                totworkingDays++;
            }


            System.out.println("total Monthly Wage:"+monthlyWage);
            System.out.println("Total Working Hour:"+totworkingHour);
            System.out.println("Total Working Days:"+totworkingDays);

        }
	}
	
}
}