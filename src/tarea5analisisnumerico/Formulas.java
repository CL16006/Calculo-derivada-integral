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
public class Formulas {
    
    public double primeraDiferenciaDelante(double fxh,double fxo,double h){
       double fx;
     
        fx=(fxh-fxo)/h;
        
        return fx;
    }
    
     public double primeraDiferenciaAtras(double fxo,double fxh,double h){
       double fx;
       
        fx=(fxo-fxh)/h;
        
        return fx;
    }
      public double tresPuntos(double fxo,double fxh,double fx2h,double h){
        double fx;
        
        
        fx=(1/(2*h))*(-3*fxo+4*fxh-fx2h);
        
        return fx;
    }
    public double segundaDerivada(double x, double h){
        //usando la primera diferencia hacia adelante
          double fx,fxh,fxo,fx2h;
        Funciones a=new Funciones();
        
        fxh=a.funcion1(x+h);
        fxo=a.funcion1(x);
        fx2h=a.funcion1(x+2*h);
        
        fx=(fx2h-2*fxh+fxo)/(Math.pow(h,2));
        
        return fx;
        
    }
      public double diferenciasFinitasCentrales1(double fxh,double fxh1, double h){
        //encontrar la primera derivada con diferencias finitas centrales
       double fx;
        
        fx=(fxh-fxh1)/(2*h);
        
        return fx;
        
    }
        public double diferenciasFinitasCentrales2(double fxh, double fxh1,double fxo,double h){
        //encontrar la segunda derivada con diferencias finitas centrales
          double fx;
        
        fx=(fxh-2*fxo+fxh1)/(Math.pow(h,2));
        
        return fx;
        
    }
         public double cincoPuntos(double fx1,double fx2,double fx3,double fx4,double fx5,double h){
         //formula de cinco puntos primera diferencia
       double fx;
 
        fx=(1/(12*h))*(-25*fx1+48*fx2-36*fx3+16*fx4-3*fx5);
        
        return fx;
    }
         public double trapecioSimple(double fa,double fb,double b,double a){
             double fx;
             fx=((b-a)/2)*(fa+fb);
             
             return fx;
         }


      
}
