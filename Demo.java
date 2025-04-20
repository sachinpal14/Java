import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

// public class Demo {
//   public static void main(String[] args) {
//     // System.out.println("Hello, World!");
//     // System.out.println("Welcome to the Java programming language.");
//     // String sachin = "Sachin Tendulkar";
//     // System.out.println(sachin);
//     // // int age = 50;

//     // // System.out.println("Sachin's age is: " + age);

//     // // int number = age;
//     // // System.out.println("The number is: " + number);

//     // byte age =30;
//     // System.out.println("Sachin's age is: " + age);
//     // int number = 100;
//     // int number2 = 1234567890;
//     // float number3 = 123.45f;
//     // char character = 'A';
//     // System.out.println("character: " + character);
//     // System.out.println("number3: " + number3);
//     // System.out.println("The number is: " + number2);
//     // System.out.println("The number is: " + number);

//     // STRINGS ARE IMMUTABLE IN THE JAVA PROGRAMMING LANGUAGE
//     // String name = "Sachin Tendulkar";
//     // String newName ;
//     // newName =new String("sachin pal ");
//     // System.out.println(newName);
//     // System.out.println(name.length());

//     // String name3= name + " and " + newName;
//     // System.out.println(name3);

//     // System.out.println(name.charAt(0));

//     // String newString= name.replace("Sachin", "pikachu");
//     // System.out.println(newString);

//     // System.out.println(name.substring(0, 4));

//     // java me ye direct array print nahi hota hai
//     // int[] numbers = new int[5];
//     // numbers[0] = 10;
//     // numbers[1] = 20;
//     // numbers[2] = 30;
//     // numbers[3] = 40;
//     // numbers[4] = 50;

//     // System.out.println(numbers);
//     // for (int i = 0; i < numbers.length; i++) {
//     // System.out.println("The number is: " + numbers[i]);
//     // }
//     // // automatically array me garbage ki jagah 0 hota hai or boolena ke liye
//     // false

//     // boolean[] marks = new boolean[3];
//     // System.out.println(marks[0]);

//     // System.out.println("Array length is: " + numbers.length);
//     // Arrays.sort(numbers);

//     // System.out.println("sorted " + numbers[0]);

//     ///    2d array  

//     // int [][] finalMarks ={{45,65,65,80},{77,56,82,20}};
//     // System.out.println(finalMarks[0][0]);

//     // Casting change the type of the variable can be implicit and explicit

//     // double price = 100.00;
//     // double finalPrice = price + 18; // implicit casting
//     // // double finalPrice = price + 18.0; // implicit casting

//     // System.out.println(finalPrice);

//     // // explicit casting // data can lost
//     // int price2 = 100;
//     // int finalPrice2 = price2 + (int)18.18;

//     // System.out.println(finalPrice2);

//     // CONSTANTS 4

//     // float pi = 3.14f; // normal variable
//     // // pi = 3.14159f; // normal variable can be changed
//     // pi = 3.14159f; // normal variable can be changed

//     // System.out.println(pi);
//     // final float PI = 3.14f; // constant variable

//     // System.out.println(PI);

//     // Operators in java

//     // int a = 10;
//     // int b = 20;

//     // int sum = a + b; // addition
//     // int sub = a - b; // subtraction
//     // int mul = a * b; // multiplication
//     // double div = b / a; // division
//     // int mod = a % b; // modulus
//     // int inc = a++; //post increment
//     // int dec = a--; // post decrement

//     // System.out.println("sum: " + sum);
//     // System.out.println("sub: " + sub);
//     // System.out.println("mul: " + mul);
//     // System.out.println("div: " + div);
//     // System.out.println("mod: " + mod);
//     // System.out.println("inc: " + inc);
//     // System.out.println("dec: " + dec);

//     // Maths class in java

//     // System.out.println(Math.max(5,6)); // absolute value
//     // System.out.println(Math.min(5,6)); // absolute value

//     // System.out.println((int)Math.random()*10 +1);

//     // taking the input from the user

//     Scanner sc = new Scanner(System.in);
//     // System.out.print("Input the age of sachin: ");
//     // int age = sc.nextInt();
//     // System.out.println("The age of sachin is: " + age);

//     // System.out.println("What is your name : " );
//     // String name = sc.next(); // taking only one word input
//     // System.out.println("The name of sachin is: " + name);

//     // System.out.println("What is your name : " );
//     // String name = sc.nextLine(); // taking whole input
//     // System.out.println("The name of sachin is: " + name);

//     // COMPARISON OPERATORS IN JAVA
//     // a==b
//     // a!=b
//     // a>b
//     // a<b
//     // a>=b
//     // a<=b

//     // if -else statement in java

//     Scanner sc1 = new Scanner(System.in);

//     // System.out.println("Enter the value of a: ");
//     // int a = sc1.nextInt();
//     // if (a > 5) {
//     // System.out.println("a is greater than 5");
//     // } else if (a < 5) {
//     // System.out.println("a is less than 5");
//     // } else {
//     // System.out.println("a is equal to 5");
//     // }

//     // boolean isSun = true;

//     // if (isSun) {
//     // System.out.println("Day");
//     // } else {
//     // System.out.println("Night");
//     // }

//     // Logical Operatrs in java

//     // AND operator
//     // OR operator

//     // NOT operator

//     String property = "Chutiya";
//     String property2 = "Chutiyapa ";

//     // if(property== "Chutiya" && property2=="Chutiyapa"){
//     // System.out.println("Bhadwa hai");
//     // }else{
//     // System.out.println("Bhadwa nahi hai");
//     // }

//     // if(property== "Chutiya" || property2=="Chutiyapa"){
//     // System.out.println("Bhadwa hai");
//     // }else{
//     // System.out.println("Bhadwa nahi hai");
//     // }

//     // boolean isAdult = false;
//     // if(!isAdult) {
//     // System.out.println("Adult hai");
//     // }
//     // else {
//     // System.out.println("Adult nahi hai");
//     // }

//     // switch case in java

//     int day = 1;

//     // switch (day) {
//     //   case 1:
//     //     System.out.println("Monday");

//     //     break;
//     //   case 2:
//     //     System.out.println("Tuesday");
//     //     break;
//     //   case 3:
//     //     System.out.println("Wednesday");
//     //     break;
//     //   case 4:
//     //     System.out.println("Thursday");
//     //     break;
//     //   case 5:
//     //     System.out.println("Friday");
//     //     break;
//     //   case 6:
//     //     System.out.println("Saturday");
//     //     break;
//     //   case 7:
//     //     System.out.println("Sunday");
//     //     break;
//     //   default:
//     //     System.out.println("Invalid day");
//     //     break;
//     // }



//     // TRY AND THE CATCH BLOCK IN JAVA

//   // try{
    
//   //   int [] numbers = {1, 2, 3, 4, 5};
//   //    System.out.println(numbers[5]); 
//   // }
//   // catch(Exception exception) {
//   //   System.out.println("chud gayi array ki .........");
//   // }

//   // System.out.println("End of the program");
// //   memme("my meme :" +"chud gai chud gai.............. aah hh ahh ");
// //   }

// // public static void memme(String meme){

// //   System.out.println(meme);
// }
