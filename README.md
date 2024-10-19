java.util.Scanner;

public class IbarraC_Sprint3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Aqui se pondran los valores que tiene que introducir el usuario
        System.out.println("Num. de registre del nen: ");
        int kidInscription = teclado.nextInt();
        System.out.println("Té algun germà al centre (0:no / 1:si): ");
        int brother = teclado.nextInt();
        System.out.println("Viu a la zona de l'escola (0:no / 1:si): ");
        int samePoblation = teclado.nextInt();
        System.out.println("El pare o mare treballa a la zona de l'escola (0:no / 1:si): ");
        int jobPoblation = teclado.nextInt();
        System.out.println("Té alguna discapacitat igual o superior al 33% o malaltia crònica (0:no / 1:si): ");
        int disability = teclado.nextInt();
        System.out.println("La familia del nen es nombrosa (0:no / 1:si): ");
        int bigFamily = teclado.nextInt();
        System.out.println("Algun familiar o tutor legal que ha estat escolaritzat a la mateixa escola (0:no / 1:si): ");
        int pastSchoolMembers = teclado.nextInt();

        //Aqui se declarará si las variables se les cambian el valor o no
        if(brother == 1){
            brother = 40;
        }

        if (samePoblation == 1){
            samePoblation = 30;
        }

        if(jobPoblation == 1){
            jobPoblation = 20;
        }

        if(disability == 1) {
            disability = 10;
        }

        if(bigFamily == 1){
            bigFamily = 15;
        }

        if (pastSchoolMembers == 1){
            pastSchoolMembers = 5;
        }

        //En este if de abajo se selecciona si se elige samePoblation o jobPoblarion según su valor

        if (samePoblation > jobPoblation){
            jobPoblation = 0;
        }

        //ahora se suman todos los valores para dar el resultado de los puntos totales según los datos introducidos

        int suma = brother + samePoblation + jobPoblation + disability + bigFamily + pastSchoolMembers;
        System.out.println("El nen amb el número " + kidInscription + " té " + suma + " punts");

    }
}
