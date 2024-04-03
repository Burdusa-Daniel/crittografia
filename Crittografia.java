import java.util.ArrayList;

public class Crittografia {
    public static void main(String[] args) {
        String DIZIONARIO = "abcdefghijklmnopqrstuvwxyz";
        String messaggio = "ciao";
        int shift = 2;
        ArrayList<Character> risultato = new ArrayList<>();
        ArrayList<Character> risultato1 = new ArrayList<>();

        //modo per criptare il messaggio
        for (char carattere : messaggio.toCharArray()) {
            if (DIZIONARIO.indexOf(carattere) != -1) {
                int posizioneOriginale = DIZIONARIO.indexOf(carattere);
                int nuovaPosizione = (DIZIONARIO.length() + posizioneOriginale + shift) % DIZIONARIO.length();
                risultato.add(DIZIONARIO.charAt(nuovaPosizione));
            } else {
                risultato.add(carattere);
            }
        }
        //Stampa del messaggio criptato
        for (char carattere1 : risultato) {
            System.out.print(carattere1 + ", ");
        }

        System.out.println();

        //modo per decriptare il messaggio
        for (char character : risultato) {
            if (DIZIONARIO.indexOf(character) != -1) {
                int posizioneOriginale1 = DIZIONARIO.indexOf(character);
                int nuovaPosizione = (DIZIONARIO.length() + posizioneOriginale1 - shift) % DIZIONARIO.length();
                risultato1.add(DIZIONARIO.charAt(nuovaPosizione));
            }else{
                risultato1.add(character);
            }
        }

        //stampa del messaggio decriptato
        for (char character2 : risultato1) {
            System.out.print(character2 + ", ");
        }
    }
}