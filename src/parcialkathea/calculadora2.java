
package parcialkathea;

public class calculadora2 {
   //para las prubeas unitarias 
    public calculadora2(){}
    
    public int Suma( int numero1,int numero2)
    { 
        return numero1+numero2;
    }
    public int Resta( int numero1,int numero2)
    { 
        return numero1-numero2;
    }
    public int Multiplicacion( int numero1,int numero2)
    { 
        return numero1*numero2;
    }
    public int division( int numero1,int numero2)
    { 
        return numero1/numero2;
    }
    public int exponenciacion( int numero1,int numero2)
    { 
        return (int) Math.pow(numero1,numero2);
    }
      public int exponenciacionSuma( int numero1,int numero2)
    { 
        return ((int) Math.pow(numero1,numero2))+((int) Math.pow(numero1,numero2));
    }
    
       public int exponenciacionMultiplicacion( int numero1,int numero2)
    { 
        return ((int) Math.pow(numero1,numero2))*((int) Math.pow(numero1,numero2));
    }
    
}
