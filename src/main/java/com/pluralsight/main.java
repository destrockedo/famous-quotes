package com.pluralsight;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String[] qoutes = {
                "Doth Mother know you wherith her drapes",
                "But what if you put it inside of an elevator, elevator not worthy",
                "Where one goes one goes because they go",
                " A qoute is just a memrory you holding onto waiting to be forgotten",
                "Over yonder bingbong is calling and hes not happy",
                "lowkenuinely i did use to like you but then i found out ur human",
                "Well that just childish who actaully pays taxes",
                "Im not gonna lie your highkenuinely being dramatic",
                "Gonne get a little wired gonna get alittle wild i aint",
                "I disagree but for 50 cents i can agree"
        };
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter a number between 1-10 to display a specific quote.");
            System.out.print("Your choice: ");

            int indexFromUser = scan.nextInt();

            // - 1 turns the user's 1 to 10 into the array's 0 to 9;

            System.out.println(qoutes[indexFromUser - 1]);

        } catch (Exception exception) {

            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            scan.nextLine();
        }




    }
}
