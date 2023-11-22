import java.util.*;

public class Employee {

  public static int presentOrAnsent(){
        int ans= (int) ((Math.random()*10)%3);
        return ans;

    }

public static void main(String[] args){
       

        System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION");
	int present_or_absent=presentOrAnsent();
}
}