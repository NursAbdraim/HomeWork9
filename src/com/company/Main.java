package com.company;

public class Main {
    public static void main(String[] args) {
        sum300();


    }

        static int sum300(){
            int [] array300 = new int[300];
            int sum = 0;
            for (int i = 1; i <= array300.length; i++) {
                if (i%3==0 && i%4==0 && i%5==0) {
                    sum += i;
                    System.out.print(i+ ", ");
                }

            } System.out.println("\n3, 4, 5ke kaldyksyz bolungon 300go cheyinki sandardyn summasy: "+sum);
            return sum;
        }
    }

