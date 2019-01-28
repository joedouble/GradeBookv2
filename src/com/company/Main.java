package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Exercise 2.1 Gradebook

        Scanner grade = new Scanner(System.in);

        System.out.println("What is the numeric grade of the student? ");
        int studentNumericGrade = grade.nextInt();

        if (studentNumericGrade >= 90) {
            if (studentNumericGrade >= 97 && studentNumericGrade <= 100) {
                System.out.println("You got an A+!");
            } else if (studentNumericGrade >= 93 && studentNumericGrade <=96) {
                System.out.println("You got an A!");
            } else {
                System.out.println("You got an A-!");
            }
        } else if (studentNumericGrade >= 80) {
            if (studentNumericGrade >= 87 && studentNumericGrade <= 89) {
                System.out.println("You got an B+!");
            } else if (studentNumericGrade >= 83 && studentNumericGrade <= 86) {
                System.out.println("You got an B!");
            } else {
                System.out.println("You got an B-!");
            }
        } else if (studentNumericGrade >= 70) {
            if (studentNumericGrade >= 77 && studentNumericGrade <= 79) {
                System.out.println("You got an C+!");
            } else if (studentNumericGrade >= 73 && studentNumericGrade <= 76) {
                System.out.println("You got an C!");
            } else {
                System.out.println("You got an C-!");
            }
        } else if (studentNumericGrade >= 60) {
            if (studentNumericGrade >= 67 && studentNumericGrade <= 69) {
                System.out.println("You got an D+!");
            } else if (studentNumericGrade >= 63 && studentNumericGrade <= 66) {
                System.out.println("You got an D!");
            } else {
                System.out.println("You got an D-!");
            }
        } else {
            System.out.println("You failed.");
        }
    }
}