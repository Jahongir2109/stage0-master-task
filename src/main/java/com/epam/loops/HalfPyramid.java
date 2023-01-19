package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
//        for (int i = 0; i < cathetusLength; i++) {
//            String str="";
//            for (int j = 0; j < cathetusLength; j++) {
//                if(cathetusLength-i<=j){
//                    str+="*";
//                }else {
//                    str+=" ";
//                }
//            }
//            System.out.println(str);
//        }
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
