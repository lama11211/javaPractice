package MyPackage;

import java.util.Random;

public class Main {



    public static void main(String[] args) {
        // write your code  here
        String Lama = " Lama! :)";




        fisrtClass obj = new fisrtClass();

        // Passing String ass parameter
        System.out.println(obj.nametagText(Lama)+"\n");


        // calling countBlocks() method to Determine how many blocks we need to build a Pyramid!
        int sides = 4;
        System.out.println("We need "+obj.countBlocks(sides)+" blocks for my "+sides+" sides Pyramid.\n");

        // Calling Temperature() method to
        // convert from Fahrenheit to Celsius
        double fahrenheit = 66.9;
        System.out.println("Converting from Fahrenheit to Celsius...");
        System.out.println("From Fahrenheit:"+fahrenheit);
        System.out.println("To Celsius:"+obj.Temperature(fahrenheit)+"\n");




        // Determine the longest Name in the array
        String [] names = {"Lama","mai","laoura","Emma","sarah","Charlotte","Olivia"};
        int size = names.length;
        String longestName = names[0];
        for(int i=1;i<size;i++){
            if (names[i].length()>longestName.length()){
                longestName= names[i];
            }
        }
        System.out.println("The longestName in the array is: "+longestName+".\n");


        //Random String from an array
        String [] press = {"q","f","l","y","h","b","f"};
        double index = Math.random();
        index*=7;
        int intindex = (int) index;
        System.out.println("Here is random item of the array: "+press[intindex]+".\n");


        // random between 0 - 1
        double randomNumber = Math.random();

        // change randomNumber value to be more than 0 to 6
        randomNumber = randomNumber*6;

        // to make the rang in between 1 - 7( 6.999will cast it to 6 )
        // cause the range is from 1 to 6.999 ! NOT Including 7 itself!
        randomNumber+=1;
        //round randomNumber value to be int only
        int intRounded = (int) randomNumber;
        System.out.println(intRounded);




        //Decide what to do in this day
        int dayOfTheWeek = 4;
        boolean holiday = false;
        System.out.print("For the day #"+dayOfTheWeek);
        if (holiday && dayOfTheWeek==5 || dayOfTheWeek==6){
            System.out.println("Sleep in!\n");
        } else {
            System.out.println("Wake up at 7:00.\n");
        }





        //--------schedule----------
        int dayOfWeek = 2;
        String schedule;

        switch(dayOfWeek){
            case 1:
                schedule = "Gym in the morning.";
                break;
            case 2:
                schedule = "Class after work.";
                break;
            case 3:
                schedule = "Meetings all day.";
                break;
            case 4:
                schedule = "Work from home.";
                break;
            case 5:
                schedule = "Game night after work.";
                break;
            default:
                schedule = "Free!";
                break;
        }
        System.out.println("Your schedule for tuesday is: "+schedule+".\n");

        // calling factorial() method
        System.out.println("The factorial of 5 is equal to "+obj.factorial(5)+".\n");


        // calling indexOfFirstOccurrence() method
        String[] sentence = {"Learning", "Java", "is", "fun."};
        int targetString = obj.indexOfFirstOccurrence(sentence,"Java");
        System.out.println("The target in index #"+targetString+".\n");

        /* By savings account yields 5% interest annually
         Here we determine how many years it will take for you to have $1,000,000 on deposit
         Calling yearsTilOneMillion() method */
        System.out.println("It will take "+obj.yearsTilOneMillion(50)+" years.\n");

        // Printing all the Strings in the String array parameter
        //in reverse order.
        String [] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        obj.printInVerverse(weekdays);

        //
        int [] myIntArray = {1, 0, 2, 3, -1, 2};
        System.out.println("The range is : "+obj.findRange(myIntArray)+"\n");


        int rows = 3;
        for (int i = 1; i <= rows; i++) {
            String thisRow = "";
            for (int j = 0; j < i; j++) {
                thisRow = thisRow + "#";
            }
            System.out.println(thisRow);
        }


        System.out.println("\n"+obj.diceRoll(6));

        System.out.println("\n"+obj.monopolyRollRecursive());
    }



}