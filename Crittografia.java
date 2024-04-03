import java.util.ArrayList;

public class Crittografia {
    public static void main(String[] args) {
        String DIZIONARIO = "abcdefghijklmnopqrstuvwxyz";
        String messaggio = "ciao";
        int shift = 2;
        ArrayList <Character> risultato=  new ArrayList<>();

            for(char carattere : messaggio.toCharArray()){
                if (DIZIONARIO.indexOf(carattere) != 1) {
                    int posizioneOriginale = DIZIONARIO.indexOf(carattere);
                    int nuovaPosizione = (DIZIONARIO.length() + posizioneOriginale + shift ) % DIZIONARIO.length(); 
                    risultato.add(DIZIONARIO.charAt(nuovaPosizione));
                }else{
                    risultato.add(carattere);
                }
            }
            for (char carattere1 : risultato) {
                System.out.print(carattere1);
            }
        
    }
}