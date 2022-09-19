package NarmathaAssignment2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){


        Person personObj=new Person();
        Scanner input =new Scanner(System.in);
        int myFloat = input.nextInt();
        personObj.age=myFloat;
        personObj.printTestKids();

    }
}
