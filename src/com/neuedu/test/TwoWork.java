package com.neuedu.test;

import java.util.Random;
import java.util.Scanner;

public class TwoWork {
    public static void main(String[] args) {
//        水仙花数
        int a,b,c,d;
        for (a=100;a<1000;a++){
            b=a%10;
            c=a/10%10;
            d=a/100%10;
            if (a==b*b*b+c*c*c+d*d*d){
                System.out.println(a);
            }
        }
//      学生成绩
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
         if (result>=90){
             System.out.println("A");
         } else if (result>59&&result<90){
             System.out.println("B");
         }else {
             System.out.println("C");
         }
//   无重复数字

        Random rand = new Random();
        int n=0;
        for(int i = 1; i <= 4; ++i)
            for(int j = 1; j <= 4; ++j)
                for(int k = 1; k <= 4; ++k)
                    if(i != j && j != k && i != k && ++n != 0)
            System.out.println(i+""+j+""+k);
            System.out.println(rand.nextInt(432));


//    9!
        int zhi=1;
        for (int shu=1;shu<10;shu++){
            zhi*=shu;
           }
        System.out.println(zhi);

// 奇偶数和
        int jishuhe=0;
        int oushuhe=0;
    for (int shuzhi=1;shuzhi<=100;shuzhi++){
        if (shuzhi%2==0){
            jishuhe+=shuzhi;
        }else {
            oushuhe+=shuzhi;
        }
    }
        System.out.println("奇数和为："+jishuhe);
        System.out.println("偶数和为："+oushuhe);

        回文数
        Scanner input = new Scanner(System.in);
        int result = input.nextInt();
        for (result=1000;result<100000;result++){
            int a= result%1000/100;
            int b=result%100/10;
            int c=result%10;
            int d=result%10000/1000;
            int e=result%100000/10000;
            result=e*10000+d*1000+a*100*b*10+c;
            if (e==c&&d==b){
                System.out.println("这个数："+result+"是回文数");
            } }
       System.out.println("这个数不是回文数，请刷新重新输入!!!");


//        判断平年还是闰年
        int year=0;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个年份：");
        year=input.nextInt();
        if(year%400==0 || (year%4==0&&year%100!=0)){
            System.out.println(year+"是闰年");}
        else{
            System.out.println(year+"不是闰年");}


//            判断是否是小写字母
        int zimu=0;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一个数字：");
        zimu=input.nextInt();
        if (zimu>=97&&zimu<=122){
            char daxie=(char) (zimu-32);
            System.out.println(daxie);
        }else {
            System.out.println("输入有误请重新输入！！！");



//        3的倍数和
        int beishu=1;
        int he=0;
        while (beishu<=200){
           if (beishu%3==0){
               he=he+beishu;
           }
            beishu++;
        }
        System.out.println(he);


//        能否被9整除


            int jiu=0;
            int gege=0;
            Scanner input=new Scanner(System.in);
            System.out.print("请输入一个数字：");
            jiu=input.nextInt();
            if (jiu%9==0){
                gege=jiu;
                int a= gege%1000/100;
                int b=gege%100/10;
                int c=gege%10;
                int d=gege%10000/1000;
                int e=gege%100000/10000;
                if ((a+b+c+d+e)%9==0){
                    System.out.println("该数满足条件");
                }
            }
            else {
                System.out.println("该数不满足条件");
            }



        }




           }





