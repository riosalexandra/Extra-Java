import java.sql.SQLOutput;

// 1. Create a class called PracticeJava2 with a main method.
public class PracticeJava2 {


//  2.  Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
//    --this is saying that this method will have a return type of integer
//    --question is asking that the method will take in an int as an argument also
    public static int subtractTen(int number) {
        return number -10;
    }

    
//    problem: 3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
    public static double average(int[] numbersArray){
        double total = 0;
        for (int number : numbersArray) {
            total += number;
        }
        return total / numbersArray.length;
    }

    public static void main(String[] args) {
        System.out.println(subtractTen(15));
        System.out.println(average(new int[]{1, 3, 5}));
//        ^this (line 26) is saying i am calling the average method and giving it an array (with 1, 3, 5) and it is returning 3.0
//        so this is taking care of turning my integers into a double
    }






}







//  # Java Assessment Practice Problems
//
//1. Create a class called PracticeJava2 with a main method.
//2. Create a public static method in the Practice class called *subtractTen* that takes one integer argument and returns that number minus 10.
//3. Create a public static method *average* in the Practice class that takes an array of integers and returns their average as a double.
//4. Create a class called Pet with two String instance variables, name and type.
//5. Create getters and setters for the properties as well as a constructor that takes two strings and sets the name and type.
//6. Create a PetDog class that inherits from Pet.
//7. In PetDog, create a boolean instance variable, trained.
//8. Write a constructor for PetDog that sets its name, type, and trained properties.
//9. Write an instance method in PetDog  called isTrained that returns the boolean value of the trained property.
//10. Create an interface named Companion. The Companion interface should specify an instance method named snuggle that has no arguments and returns a String. Change your PetDog class so it implements the Companion interface. The implementation of the snuggle method on the PetDog class should return "name wants to snuggle", where name is the inherited instance property.
//11. Create a PetDogTest class, instantiate a PetDog, and verify that the snuggle method works correctly.
//12. In your Practice class, create a static method named multiplyAll. It should accept an integer and an ArrayList of integers. It should take the ArrayList argument and multiply all its elements by the value of the integer argument.
//12b. In your PetDog class, create a static method named allSnuggle. It should accept an ArrayList of PetDog objects and output the result of calling the snuggle method on all of them. Create an ArrayList with at least three PetDog instances in the PetDogTest class. Call the allSnuggle method and pass it the ArrayList. Verify that the allSnuggle method works correctly.