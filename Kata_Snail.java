public class Kata {
    public static int snail(int column, int day, int night) {
      
      int Dia = 1;
      
      while (day<column){
        column = column - (day - night);
        Dia ++;
      }
      return Dia;
    }
}
