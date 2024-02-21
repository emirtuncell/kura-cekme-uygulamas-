package kura;

import java.util.Random;
import java.util.Scanner;

public class kura {
	
      public static void main(String[] args) {
		
	
        
                
       int secim;
       Scanner scan=new Scanner(System.in);
       
       
       for(int i=1; i<=10; i++) {
    	   System.out.println("1-KURA ÇEK \n 2-İSTEMİYORUM \n KURA ÇEKMEK İSTİYOR MUSUNUZ?");
    	   secim=scan.nextInt();
    	  
    	   switch(secim) {
    	   case 1://kullanıcı 1'e basarsa kura çekilecek.
    		   
    		   Random r = new Random();
               int a=r.nextInt(10);
               System.out.println(i+".KŞİNİN SONUCU = " + a +"\n");
               continue;
               
    	   case 2://kullanıcı döngüden çıkış yapmak istiyor.
    		   System.out.println("ÇIKIŞ YAPILIYOR... \n");
    		   break;
    		   
    	   case 3://kullanıcının girdiği değer 1 veya 2 değil.Hatalı giriş yaptı.
    		   System.out.println("HATALI GİRİŞ YAPTINIZ !!! \n ");
    	   continue;
    	   }
    	  
       
}
      }
}
