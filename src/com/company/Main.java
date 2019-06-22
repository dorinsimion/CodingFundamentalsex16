package com.company;

public class Main {

    public static void main(String[] args) {
        for(int i=0;i<=1000;i++){
            int nr=i;
            int sum=0;
            while(nr!=0){
                sum+=Math.pow(nr%10,3);
                nr/=10;
            }
            if(i==sum) System.out.print(i+" ");
        }
    }
}
