// package io.github.jiangdequan;

/*
CONDITIONAL STATEMENTS: 
1. Relational Operators: return a boolean result 
< > <= >= == !=

2. Logical Operators: to combine multiple boolean expressions or conditions 
&& || !

3. Conditions: 
- if
- if-else
- if-else if ladder
- switch Statement: works with int, char, String, and enum types
- Ternary Operator (variable = (condition)? value_if_true: value_if_false; )
*/
public class ConditionalStatements {
    public static void main(String[] args) {
        //relational
        System.out.println(1 < 2);  //true
        System.out.println(1 == 2); //false
        System.out.println(1 != 2);  //true

        //logical
        System.out.println(1 != 2 && 1 < 2);  //true && true = true

        //AND operator (&&)
        System.out.println("------------------");
        boolean isSunny = true;
        boolean isWarm = true;
        boolean isGoodBeachDay = isSunny && isWarm;
        System.out.println("Is it a good beach dat? " + isGoodBeachDay);

        //OR operator (||)
        System.out.println("--------------");
        boolean isRaining = false;
        boolean isSnowing = true;
        boolean isBadWeather = isRaining || isSnowing;
        System.out.println("Is the weather bad? " + isBadWeather);

        //NOT operator (!)
        System.out.println("-------------");
        boolean isHomeworkDone = false;
        boolean canPlayGames = !isHomeworkDone;
        System.out.println("Can I play games? " + canPlayGames);

        //Conditions
        System.out.println("--------------");
        if(isSunny && isWarm) {                 
            System.out.println("Beach day");
        }else{
            System.out.println("Stay at home!");
        }

        //can skip brackets in single statements inside the conditions
        System.out.println("---------------");
        if(isSunny && isWarm) System.out.println("Beach day");
        else System.out.println("Stay at home!");

        //more than 2 conditions
        System.out.println("--------------");
        if(isSunny && isWarm) System.out.println("Beach day");
        else if(isSunny) System.out.println("wear jacket and then go to beach");
        else System.out.println("Stay at home!");

        //many conditions for some values ask for switch statements: if-else if ladder becomes ineffective
        int day = 3;
        String dayName;

        if (day == 1) { dayName = "Monday"; 
        } else if (day == 2) { 
            dayName = "Tuesday"; 
        } else if (day == 3) { 
            dayName = "Wednesday"; 
        } else if (day == 4) { 
            dayName = "Thursday"; 
        } else if (day == 5) { 
            dayName = "Friday"; 
        } else if (day == 6) { 
            dayName = "Saturday"; 
        } else if (day == 7) { 
            dayName = "Sunday"; 
        } else { 
            System.out.println("Invalid day");
        }
        // System.out.println(dayName);

        //use switch instead
        switch (day) { 
            case 1:
                dayName = "Monday";
                break;                  //note the use of break, after a case is run the loop should break, else all other cases will also run
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // System.out.println(dayName);   //don't know why this is not working 
        
        //TERNARY OPERATOR
        //result = (condition) ? valueIfTrue : valueIfFalse;
        System.out.println("----------------");
        int a = 1;
        String str = a % 2 == 0 ? "Even" : "Odd";
        System.out.println("Is 1 odd or even? " + str);


        //LOOPS in next notes


    }
}