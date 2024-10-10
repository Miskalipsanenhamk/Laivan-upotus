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

             
    
