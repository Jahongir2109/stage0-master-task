package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String str="";
            for (int j = 1; j <= cathetusLength; j++) {
                if (i>=j){
                    str=j+str;
                }else {
                    str=" "+str;
                }
            }
            for (int k = 2; k <= cathetusLength; k++) {
                if (i>=k){
                    str=str+k;
                }else {
                    str=str+" ";
                }
            }
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
