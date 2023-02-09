package holiday.counter;

import java.util.Scanner;
public class HolidayCounter {

    
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      
      //Promtp user to enter curent month and day
      System.out.println("Please enter the current month (1-12) followed by the day");
      int month =input.nextInt();
      int day = input.nextInt();
      int numb_day=0;
      
      //int numb_day is only utilized during the menu selection if the user selects a custom date
      int numb_day2=0;
      //Translate month into number of days using if statement
      if(month==1)
          numb_day=+day;
      else if(month==2)
          numb_day=+31+day;
      else if(month==3)
          numb_day=+59+day;
       else if(month==4)
          numb_day=+90+day;
      else if(month==5)
          numb_day=+120+day;
       else if(month==6)
          numb_day=+151+day;
      else if(month==7)
          numb_day=+181+day;
       else if(month==8)
          numb_day=+212+day;
      else if(month==9)
          numb_day=+243+day;
       else if(month==10)
          numb_day=+273+day;
      else if(month==11)
          numb_day=+304+day; 
      else if(month==12)
          numb_day=+334+day;
      else
          System.out.println("Invalid month!  Please enter a month as 1-12");
    
      //Display menu to enter holidays or custom date
      System.out.println("Please select a preset date, or choose a custom date:");
      System.out.println("1. New years day                6. Halloween");
      System.out.println("2. Valentines day               7. Thanksgiving Day");
      System.out.println("3. St.Patricks day              8. Christmas day");
      System.out.println("4. Easter day                   9. New Years Eve");
      System.out.println("5. Independence Day             0. Enter a custom date");

      int choice=input.nextInt();
      
//Switch Statement that will calculate the number of days between selected date and current date
//Choice 0 will yield the same if statement to calcualte the number of days into the year that date is.
      switch(choice){
          //Custom date
          case 0:
               System.out.println("Please enter your custom date as month followed by day: ");
                int month2=input.nextInt();
                int day2=input.nextInt();
      if(month2==1)
          numb_day2=+day2;
      else if(month2==2)
          numb_day2=+31+day2;
      else if(month2==3)
          numb_day2=+59+day2;
       else if(month2==4)
          numb_day2=+90+day2;
      else if(month2==5)
          numb_day2=+120+day2;
       else if(month2==6)
          numb_day2=+151+day2;
      else if(month2==7)
          numb_day2=+181+day2;
       else if(month2==8)
          numb_day2=+212+day2;
      else if(month2==9)
          numb_day2=+243+day2;
      else if(month2==10)
          numb_day2=+273+day2;
      else if(month2==11)
          numb_day2=+304+day2; 
      else if(month2==12)
          numb_day2=+334+day2;
      else
          System.out.println("Invalid month!  Please enter a month as 1-12");
      int until=(numb_day2-numb_day);
        if(until<0)
        {
            until=until+365;
                System.out.println(until + " days until " + month2+"/"+day2);
        }
        else if (until==0){
            System.out.println(month2+"/"+day2 + " is today!");
        }
        else
            System.out.println(until + " days until " + month2+"/"+day2);
        break;
        //New Years day
          case 1:
              until=1-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until New years day!");
        }
        else if (until==0){
            System.out.println("Today is  New years day!");
        }
        else
            System.out.println(until + " days until New years day!");
        break;
        //Valentines day
          case 2:
              until=45-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Valentines day!");
        }
        else if (until==0){
            System.out.println("Today is Valentines day!");
        }
        else
            System.out.println(until + " days until Valentines day!");
        break;
        //St. Patricks day
          case 3:
              until=76-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until St.Patricks day!");
        }
        else if (until==0){
            System.out.println("Today is St.Patricks day!");
        }
        else
            System.out.println(until + " days until St.Patricks day!");
        break;
        //Easter
          case 4:
              until=100-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Easter day!");
        }
        else if (until==0){
            System.out.println("Today is Easter day!");
        }
        else
            System.out.println(until + " days until Easter day!");
        break;
        //Independence Day
          case 5:
              until=185-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Independence day!");
        }
        else if (until==0){
            System.out.println("Today is Independence day!");
        }
        else
            System.out.println(until + " days until Independence day!");
        break;
        //Halloween
          case 6:
              until=304-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Halloween!");
        }
        else if (until==0){
            System.out.println(" Today is Halloween!");
        }
        else
            System.out.println(until + " days until Halloween!");
        break; 
        //Thanksgiving
          case 7: 
              until=327-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Thanksgiving day!");
        }
        else if (until==0){
            System.out.println("Today is Thanksgiving day!");
        }
        else
            System.out.println(until + " days until Thanksgiving day!");
        break; 
        //Christmas day
          case 8:
              until=359-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until Christmas day!");
        }
        else if (until==0){
            System.out.println("Today is Christmas day!");
        }
        else
            System.out.println(until + " days until Christmas day!");
        break; 
        //New years eve
          case 9:
               until=365-numb_day;
              if (until<0){
                 until=until+365;
                System.out.println(until + " days until New Years Eve!");
        }
        else if (until==0){
            System.out.println("Today is New Years Eve!");
        }
        else
            System.out.println(until + " days until New Years Eve!");
        break; 
      }
}
}
