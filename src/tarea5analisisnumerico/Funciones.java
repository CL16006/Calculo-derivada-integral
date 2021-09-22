/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea5analisisnumerico;

/**
 *
 * @author fatycalderon
 */
public class Funciones {
    
    
    public double funcion1(double x){
        double fx;
        
        fx=Math.log(x)*Math.tan(x);
        
        return fx;
    }
    
     public double funcion2(double x){
        double fx;
        
        fx=Math.pow(Math.E, x)*Math.cos(x);
        
        return fx;
    }
     
      public double funcion3(double x){
        double fx;
        
        fx=Math.pow(Math.E, Math.pow(x, 2))*Math.sin(x);
        
        return fx;
    }
     public double funcion6(double x){
        double fx;
        
    fx=(Math.pow(x, 3))*(Math.pow(Math.E, Math.pow(x, 2)));
        
        return fx;
    }
     
     public double funcion7(double x){
         double fx;
         fx=2*Math.pow(x,2)*Math.sin(x);
         
         return fx; 
         
     }
     public double funcion8(double x){
         double fx;
         fx=Math.pow(3, x)*Math.cos(x);
         
         return fx;
     }
     public double funcion9(double x){
         double fx;
         fx=2*x*Math.pow(Math.E, x)*Math.sin(x);
         
         return fx;
     }
     public double funcion10(double x){
         double fx;
         fx=3*Math.pow(x, 2)*Math.pow(Math.E, x);
         
         return fx;
     }
     public double funcion11(double x){
         double fx;
         fx=Math.pow(Math.E, x)*Math.sin(x);
         
         return fx;
     }
     public double integral1(double x){
         double fx;
         fx=Math.sin(x);
         return fx;
     }
      public double integral2(double x){
         double fx;
         fx=x*Math.pow(Math.E, x);
         return fx;
     }
       public double integral3(double x){
         double fx;
         fx=(Math.sin(x))/x;
         return fx;
     }
        public double integral4(double x){
         double fx;
         fx=Math.pow(x, 2)*Math.log(x);
         return fx;
     }
         public double integral5(double x){
         double fx;
         fx=Math.pow(x,2)*Math.sin(x);
         return fx;
     }
          public double integral6(double x){
         double fx;
         fx=1/Math.sqrt(Math.pow(x, 2)+1);
         return fx;
     }

    
}
