package com.ex;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Random_Fail {
    public static void main(String[] args) {
        int count = 0;
        int ran = 0;
        boolean ran_YN = true;
        String talk = "알림톡이 왔어요";

        for(int i=0; i<100000;i++) {
            ran=(int)(Math.random()*100000);

            if(ran<20000) {
                ran_YN=false;
                count++;
            } else {
                ran_YN=true;
            }
            //System.out.println("띵동"+ ran_YN + talk);
        }
        System.out.println("성공 횟 수 : "+ (100000-count) +", 실패 횟 수 : " + count + ", 성공 확률 : " + (100-(count/1000)) + "%");

        int j=0;
        Runnable r = new RunableTest();
        Thread t = new Thread(r);
        while (j<=5) {
            System.out.println(j+"0초 경과");
            t.run();
            j++;
        }
    }
    static class RunableTest implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000*10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
