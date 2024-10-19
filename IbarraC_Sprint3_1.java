import java.util.Scanner; 
public class IbarraC_Sprint3_1 {
    public static void main(String[] args) {

        double llarg = 300.3;
        Scanner teclado = new Scanner (System.in);
       
        System.out.println("Escribe l'ample de la piscina 1 ");
        double ample1 = teclado.nextDouble();
        System.out.println("Escribe profunditat de la piscina 1 ");
        double profunditat1 = teclado.nextDouble();
        System.out.println("Escribe l'ample de la piscina 2 ");
        double ample2 = teclado.nextDouble();
        System.out.println("Escribe profunditat de la piscina 2 ");
        double profunditat2 = teclado.nextDouble();
        
        
        double ample3 = ample1 + ample2;
        
        //Piscina 1

        double AreaPiscina1 = ample1 * llarg;
        int AreaPiscina1Entero = (int) AreaPiscina1;
        double VolumPiscina1 = AreaPiscina1 * profunditat1;
        int VolumPiscina1Entero = (int) VolumPiscina1;
        
        System.out.println("Valors de la piscina 1 ----- àrea " + AreaPiscina1Entero + " y volum " + VolumPiscina1Entero);

        //Piscina 2

        double AreaPiscina2 = ample2 * llarg;
        int AreaPiscina2Entero = (int) AreaPiscina2;
        double VolumPiscina2 = AreaPiscina2 * profunditat2;
        int VolumPiscina2Entero = (int) VolumPiscina2;
        System.out.println("Valors de la piscina 2 ----- àrea " + AreaPiscina2Entero + " y volum " + VolumPiscina2Entero);

        //Piscina 1 i 2

        System.out.println("Valors de les dues piscines ------ " + "ample: " + ample3 + " y llarg: " + llarg);

        double AreaPiscina3 = ample3 * llarg;
        int AreaPiscina3Entero = (int) AreaPiscina3;
        System.out.println("valor del àrea de les dues piscines: " + AreaPiscina3Entero);

        double VolumPisccina3 = VolumPiscina1 + VolumPiscina2;
        int VolumPisccina3Entro = (int) VolumPisccina3;
        System.out.println("valor del volum de les dues piscines: " + VolumPisccina3Entro);

        //Piscines valors intercanviats

        double profunditat = profunditat1;
        profunditat1 = profunditat2;
        profunditat2 = profunditat;

        VolumPiscina1 = AreaPiscina1 * profunditat1;
        VolumPiscina1Entero = (int) VolumPiscina1;
        VolumPiscina2 = AreaPiscina2 * profunditat2;
        VolumPiscina2Entero = (int) VolumPiscina2;

        System.out.println("Valors intercambiats de la piscina 1 ----- ample: " + ample1 + ", llarg: " + llarg + ", profunditat " + profunditat1 + ", volum " + VolumPiscina1Entero);
        System.out.println("Valors intercambiats de la piscina 2 ----- ample: " + ample2 + ", llarg: " + llarg + ", profunditat " + profunditat2 + ", volum " + VolumPiscina2Entero);

    }
    }
