import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static List<Auto> auto;
    public static void main(String[] args) {
        auto = new ArrayList<>();
        Auto A = new Auto("POGC102","Prius","Toyota",2010,4,1800.50);
        auto.add(A);
        Auto B = new Auto("RED5239","X","Ferrari",2020,5,4550);
        auto.add(B);


        menu();
    }
    public static void menu(){
        while(true) {
            System.out.println("Inserisci il numero per l'operazione.");
            System.out.println("1. Aggiungi una macchina.");
            System.out.println("2. Visualizza macchine.");
            System.out.println("3. Rimuovi macchina.");
            System.out.println("4. Ricerca macchina.");
            System.out.println("5. Esci dalla lista.");
            Scanner sc = new Scanner(System.in);
            int Choice = sc.nextInt();
            switch (Choice) {
                case 1:
                    addC();
                    break;
                case 2:
                    visualize();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    ricerca();
                    break;
                case 5:System.exit(0);
                    break;
            }
        }
    }
    private static void ricerca() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserisci la targa della macchina da ricercare: ");
        String tmptarga = sc.nextLine();
        for (int i=0;i<auto.size();i++){
            if (tmptarga.equals(auto.get(i).getTarga())) {
                System.out.println(auto.get(i).getTarga()+" "+auto.get(i).getNome()+" "+auto.get(i).getAzienda());
            }
        }
    }
    public static void addC(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserisci la targa: ");
        String targa = sc.nextLine();
        System.out.println("Inserisci il nome: ");
        String nome = sc.nextLine();
        System.out.println("Inserisci l'azienda: ");
        String azienda = sc.nextLine();
        System.out.println("Inserisci l'anno: ");
        int anno_c = sc.nextInt();
        System.out.println("Inserisci i posti auto: ");
        int posti_auto = sc.nextInt();
        System.out.println("Inserisci il prezzo: ");
        double prezzo = sc.nextDouble();
        Auto X = new Auto(targa,nome,azienda,anno_c,posti_auto,prezzo);
        auto.add(X);
    }
    public static void visualize(){
        for (int i=0;i<auto.size();i++){
            System.out.println("");
            System.out.println(auto.get(i).getTarga()+" "+auto.get(i).getNome()+" "+auto.get(i).getAzienda());
            System.out.println("");
        }
    }
    public static void remove(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Inserisci la targa della macchina da rimuovere: ");
        String tmptarga = sc.nextLine();
        for (int i=0;i<auto.size();i++){
            if (tmptarga.equals(auto.get(i).getTarga())) {
                auto.remove(i);
            }
        }


    }
}