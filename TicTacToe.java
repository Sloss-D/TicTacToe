package mrb;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		
		 Scanner scan = new Scanner(System.in);
       String currentPlayer = "X";		
		
       String[] list	= new String [9];  
       list[0]=" ";
       list[1]=" ";
       list[2]=" ";
       list[3]=" ";
       list[4]=" ";
       list[5]=" ";
       list[6]=" ";
       list[7]=" ";
       list[8]=" ";
       
       System.out.println(list[0] + "   +   " + list[1] + "  +  " + list[2]) ;
       System.out.println("    |------| ");
       System.out.println(list[3] + "   +   " + list[4] + "  +  " + list[5]) ;
       System.out.println("    |------| ");
       System.out.println(list[6] + "   +   " + list[7] + "  +  " + list[8]) ;

      while (true) { 
    	
    	  System.out.println("Siradaki oyuncu:" + currentPlayer);
       System.out.println("Yerlestirmek istediginiz pozisyonu seciniz: 1-9");
       int pos = scan.nextInt();
       if(pos < 0 || pos > 9) {
    	   System.out.println("Gecersiz sayi girdiniz lutfen 1 ile 9 arasinda sayi giriniz"); 
    	  
       }
       else {
    	switch(pos) {
    	case 1:
    		if(list[0]=="X" || list[0]=="Y") { 
        		
        		continue;
        	} 
    	    list[0]=currentPlayer;
    	    break;
    	case 2:
    		if(list[1]=="X" || list[1]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[1]=currentPlayer;
        	break;
    	case 3:
    		if(list[2]=="X" || list[2]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[2]=currentPlayer;
        	break;
    	case 4:
    		if(list[3]=="X" || list[3]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[3]=currentPlayer;
        	break;
    	case 5:
    		if(list[4]=="X" || list[4]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[4]=currentPlayer;
        	break;
    	case 6:
    		if(list[5]=="X" || list[5]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[5]=currentPlayer;
        	break;
    	case 7:
    		if(list[6]=="X" || list[6]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[6]=currentPlayer;
        	break;
    	case 8:
    		if(list[7]=="X" || list[7]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[7]=currentPlayer;
        	break;
    	case 9:
    		if(list[8]=="X" || list[8]=="Y") { 
        		System.out.println("Bu yer dolu baska yer seciniz");
        		continue;} 
        	list[8]=currentPlayer;
        	break;
    	
    	}
       
        if( 1<=pos || pos<=9) {
        	
            System.out.println(list[0] + "   +   " + list[1] + "  +  " + list[2]) ;
            System.out.println("    |      | ");
            System.out.println(list[3] + "   +   " + list[4] + "  +  " + list[5]) ;
            System.out.println("    |      | ");
            System.out.println(list[6] + "   +   " + list[7] + "  +  " + list[8]) ;

      }
        
       
        	}
        	
        	
       if(list[0]=="X" && list[1]=="X" && list[2]=="X") 	{
    	   System.out.println("X oyunu kazandi tebrikler!!");
    	   break;}
    	   if(list[3]=="X" && list[4]=="X" && list[6]=="X") 	{
        	   System.out.println("X oyunu kazandi tebrikler!!");
        	   break;}
        	   if(list[6]=="X" && list[7]=="X" && list[8]=="X") 	{
            	   System.out.println("X oyunu kazandi tebrikler!!");
            	   break;}
            	   if(list[0]=="X" && list[3]=="X" && list[6]=="X") 	{
                	   System.out.println("X oyunu kazandi tebrikler!!");
                	   break;}
                	   if(list[1]=="X" && list[4]=="X" && list[7]=="X") 	{
                    	   System.out.println("X oyunu kazandi tebrikler!!");
                    	   break;}
                    	   if(list[2]=="X" && list[5]=="X" && list[8]=="X") 	{
                        	   System.out.println("X oyunu kazandi tebrikler!!");
                        	   break;}
                        	   if(list[0]=="X" && list[4]=="X" && list[8]=="X") 	{
                            	   System.out.println("X oyunu kazandi tebrikler!!");
                            	   break;}
                            	   if(list[2]=="X" && list[4]=="X" && list[6]=="X") 	{
                                	   System.out.println("X oyunu kazandi tebrikler!!");
                                	   break;}
                            	   
                            	   
                            	     if(list[0]=="Y" && list[1]=="Y" && list[2]=="Y") 	{
                            	    	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	    	   break;}
                            	    	   if(list[3]=="Y" && list[4]=="Y" && list[6]=="Y") 	{
                            	        	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	        	   break;}
                            	        	   if(list[6]=="Y" && list[7]=="Y" && list[8]=="Y") 	{
                            	            	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	            	   break;}
                            	            	   if(list[0]=="Y" && list[3]=="Y" && list[6]=="Y") 	{
                            	                	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	                	   break;}
                            	                	   if(list[1]=="Y" && list[4]=="Y" && list[7]=="Y") 	{
                            	                    	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	                    	   break;}
                            	                    	   if(list[2]=="Y" && list[5]=="Y" && list[8]=="Y") 	{
                            	                        	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	                        	   break;}
                            	                        	   if(list[0]=="Y" && list[4]=="Y" && list[8]=="X") 	{
                            	                            	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	                            	   break;}
                            	                            	   if(list[2]=="X" && list[4]=="X" && list[6]=="X") 	{
                            	                                	   System.out.println("Y oyunu kazandi tebrikler!!");
                            	                                	   break;}
                            	                            	   if    (  (list[0]=="X" || list[0]=="Y") &&
                            	                            			   (list[1]=="X" || list[1]=="Y") &&
                            	                            			   (list[2]=="X" || list[2]=="Y") &&
                            	                            			   (list[3]=="X" || list[3]=="Y") &&
                            	                            			   (list[4]=="X" || list[4]=="Y") &&
                            	                            			   (list[5]=="X" || list[5]=="Y") &&
                            	                            			   (list[6]=="X" || list[6]=="Y") &&
                            	                            			   (list[7]=="X" || list[7]=="Y") &&
                            	                            			   (list[8]=="X" || list[8]=="Y")){
                             	                             	      
                             	                             	      System.out.println("Oyun Berabere Bitti");
                             	                             	      }
                                      	   
                if(currentPlayer=="X") {
                	currentPlayer="Y";
                }
               else if(currentPlayer=="Y") {
            	   currentPlayer="X";
               }
       }
      
	
	
	}
	

}
       
       
      
