package jetaKrasniqi;

import java.util.Scanner;

public class ArraysOperations {
	
	 /**
     * Llogarit mesataren e elementeve në varg.
     * @param varguIm Vargu i dhënë
     * @return Mesatarja e elementeve
     */
      public static double mesatarja(int[] varguIm) {
    	int sum = 0;
		for(int i = 0; i< varguIm.length; i++ ) {
			sum += varguIm[i];
		    }
		double mesatarja= sum/varguIm.length;
		return mesatarja;
	    }
      /**
       * Gjen vlerën maksimale në varg.
       * @param varguIm Vargu i dhënë
       * @return Vlera maksimale
       */
      public static int max(int[] varguIm) {
    	int i = 0;
    	int max = varguIm[i];
		for(i = 1; i < varguIm.length; i++ ) {
			if (varguIm[i]>max) {
				max = varguIm[i];
				} 
			}
		return max;
	    }
      
      /**
       * Gjen vlerën minimale në varg.
       * @param varguIm Vargu i dhënë
       * @return Vlera minimale
       */
      public static int min(int[] varguIm) {
      	int i = 0;
      	int min = varguIm[i];
  		for(i = 1; i < varguIm.length; i++ ) {
  			if (varguIm[i]<min) {
  				min = varguIm[i];
  				} 
  			}
  		return min;
  	    }
      
      /**
       * Kthen vargun mbrapsht.
       * @param varguIm Vargu i dhënë
       * @return Vargu i kthyer
       */
      public static int[] varguIkthyer(int[] varguIm) {  
    	    int[] reversed = new int[varguIm.length];  
    	    for (int i = 0; i < varguIm.length; i++) {  
    	        reversed[i] = varguIm[varguIm.length - 1 - i];  
    	    }  
    	 return reversed;  
    	 }

}
