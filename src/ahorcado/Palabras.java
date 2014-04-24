package ahorcado;

public class Palabras 
{
    private String[] arreglo;
    private String elegida;
    private String[] palabraFormada;
    private int bandera;
    
    
    public Palabras()
    {
        arreglo = new String[10];
        arreglo[0] = "perro";
        arreglo[1] = "gato";
        arreglo[2] = "leon";
        arreglo[3] = "elefante";
        arreglo[4] = "gallo";
        arreglo[5] = "lobo";
        arreglo[6] = "jaguar";
        arreglo[7] = "conejo";
        arreglo[8] = "ardilla";
        arreglo[9] = "cebra";
        elegida = escogerPalabra();
        palabraFormada = new String[elegida.length()];
        llenarPalabraFormada();
        bandera = 0;
    }
    
    public String escogerPalabra()
    {
        int aleatorio=(int)((Math.random()*10));
        return arreglo[aleatorio];
        
    }
    
    public void llenarPalabraFormada()
    {
        for(int i = 0; i < palabraFormada.length; i++)
        {
            palabraFormada[i] = "*";
        }
    }
    
    public String comparar(char letra)
    {
        System.out.println(elegida);
        String aux="";
        String nuevaPalabra ="";
        int contador = 0;
        bandera =0;
        
        while(contador < elegida.length())
        {
            if((letra == elegida.charAt(contador)) && (palabraFormada[contador].equals("*")))
            {
                aux += letra;
                palabraFormada[contador] = aux;
                aux="";
                contador++;
                bandera=1;
            }
            else
            {
                contador++;
            }
            
        }
        
        for(int i = 0; i < palabraFormada.length;i++)
        {
            nuevaPalabra += palabraFormada[i];
            
        }
        return nuevaPalabra;
    }
    
    public String getElegida()
    {
        return elegida;
    }
    
    public int getBandera()
    {
        return bandera;
    }
}
