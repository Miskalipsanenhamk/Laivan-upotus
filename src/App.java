import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        String[][] laivanUpotus = new String[5][5];
        String input = "";
        String input2;
        String arvo = "O";
        for (int a = 0 ; a < 5 ; a++)
        {
            for (int s = 0 ; s < 5 ; s++)
            {
                laivanUpotus[a][s] = arvo;
            }
        }
        // luodaan taulukko johon syötetään arvot loopin avulla
        // luodaan myös valmiiksi käyttäjän syöte muuttujat
       
        for (int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0 ; j < 5 ; j++)
            {
                System.out.print(laivanUpotus[i][j] + " ");
            }
        System.out.println();
        }
        // tulostetaan taulukko
        while (true)
        {System.out.println("Anna rivi jolle haluat ampua (paina 0 lopettaaksesi)");
        input = in.nextLine();
        if (input.equals("0"))
        {
            break;
        }
        System.out.println("Anna sarake jolle haluat ampua");
        input2 = in.nextLine();
        int rivi = Integer.parseInt(input) -1;
        int sarake = Integer.parseInt(input2) -1;
        laivanUpotus[rivi][sarake] = "X";

        for (int i = 0 ; i < 5 ; i++)
        {
            for (int j = 0 ; j < 5 ; j++)
            {
                System.out.print(laivanUpotus[i][j] + " ");
            }
        System.out.println();
        }
    }

    System.out.println("Peli loppui");

    // Käyttäjältä kysytään rivi ja sarake jolle hän haluaa ampua
    // Tämän jälkeen tulostetaan taulukko uudelleen mutta ammutun indeksin arvo muutettuna
    // Sama jatkuu ikuisessa loopissa kunnes käyttäjä syöttää "0", jonka jälkeen peli loppuu
        
}
}


             
    
