package com.usecases;
import java.io.*;

import java.util.*;

import com.colors.Color;
public class Main {
	
	  
	public static void main(String[] args) {
		
		  
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	      System.out.println(Color.ANSI_black_BACKGROUND+Color.ANSI_blue+"If you are Administrator then select 0 and if Faculty then select 1"+Color.ANSI_RESET);
	       int ans=s.nextInt();
	      
	       
	       
	       if(ans==0) {
	    	   AdminQury admin=new AdminQury();
	    	   admin.login();
	    	   
	       }
	       else {
	    	   System.out.println("try for faculty");
	       }
       
	}

}
