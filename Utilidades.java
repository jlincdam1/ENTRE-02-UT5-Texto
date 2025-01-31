/**
 * clase Utilidades 
 * incluye  m�todos est�ticos para trabajar con String
 *
 */
public class Utilidades {
    
    /**
     * Dada una cadena devuelve una nueva capitalizando los caracteres de
     * tres en tres de forma
     * alterna empezando por may�scula (may�scula, min�scula, may�scula,
     * min�scula, ....) 
     * Ej. si la cadena recibida es "texto" devuelve "TEXto"
     * si la cadena recibida es "zapato" devuelve "ZAPato"
     * si la cadena recibida es "de" devuelve "DE"
     */
    
    public static String capitalizarAlterna(String cadena) {
        int a = 3;
        int x = 0;
        String alternada = "";
        for(int i = 0; i < cadena.length(); i = i + 3){
            if(a > cadena.length()){
                a = cadena.length();
                if(x % 2 == 0){
                    alternada += cadena.substring(i, a).toUpperCase();
                }
                else{
                    alternada += cadena.substring(i, a).toLowerCase();
                }
                i = cadena.length();
            }
            else{
                if(x % 2 == 0){
                    alternada += cadena.substring(i, a).toUpperCase();
                    x++;
                }
                else{
                    alternada += cadena.substring(i, a).toLowerCase();
                    x++;
                }
                a = a + 3;
            }
        }
        return alternada;
    }
    
    /**
     * Dada una cadena devuelve true si hay letras repetidas, false en otro caso
     * Es indiferente may�sculas o min�sculas
     *
     * Pista!! puedes hacer de forma sencilla este m�todo con ayuda de
     * indexOf y substring
     *
     */
    public static boolean tieneLetrasRepetidas(String cadena) {
        int a = 0;
        String caracter = "";
        String semiCadena = "";
        cadena = cadena.toUpperCase();
        boolean repetidos = false;
        for(int i = 1; i <= cadena.length(); i++){
            caracter = cadena.substring(a, i);
            int x = cadena.substring(i).indexOf(caracter);
            a++;
            if(x >= 0){
                repetidos = true;
            }
        }
        return repetidos;
    }
    
    /**
     *
     */
    public static void main(String[] args) {
        String cadena = "zaPaTo";
        System.out.println(cadena + "\tCapitalizada alterna: " +
                Utilidades.capitalizarAlterna(cadena));
        cadena = "pez";
        System.out.println(cadena + "\tCapitalizada alterna: " +
                Utilidades.capitalizarAlterna(cadena));
        
        cadena = "vaso";
        System.out.println(cadena + "\tCapitalizada alterna: " +
                Utilidades.capitalizarAlterna(cadena));
        
        
        cadena = "semana";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
                Utilidades.tieneLetrasRepetidas(cadena));
        
        cadena = "quebrantos";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
                Utilidades.tieneLetrasRepetidas(cadena));
        
        cadena = "y";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
                Utilidades.tieneLetrasRepetidas(cadena));
        
        cadena = "de";
        System.out.println(cadena + "\tTiene letras repetidas?: " +
                Utilidades.tieneLetrasRepetidas(cadena));
        
       
        
    }
    
}
