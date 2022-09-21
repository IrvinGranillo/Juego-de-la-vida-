package juegodelavida;

public class JuegoDeLaVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //   Array2d<Boolean> hola=new Array2d<>();
         
      
       Poblacion eden=new Poblacion();
       /* eden.setCasillas(0, 2, true);
        eden.setCasillas(4, 7, true);
        eden.setCasillas(5, 4, true);
        eden.setCasillas(8, 9, true);
        eden.setCasillas(7, 4, true);
        eden.setCasillas(5, 5, true);
        eden.setCasillas(4, 4, true);
        eden.setCasillas(4, 2, true);

        eden.setCasillas(8, 5, true);
        eden.setCasillas(8, 6, true);
        eden.setCasillas(8, 7, true);*/
       eden.setValor(0, 2, true);
       eden.setValor(5, 2, true);
       eden.setValor(5, 3, true);
       eden.setValor(5, 6, true);
       eden.setValor(8, 8, true);
       eden.setValor(8, 9, true);
       eden.setValor(2, 5, true);
       eden.setValor(6, 6, true);
       eden.setValor(2, 5, true);
       eden.setValor(3, 1, true);
       eden.setValor(3, 2, true);
       eden.setValor(3, 3, true);
       eden.setValor(3, 4, true);
       
        eden.setValor(6, 5, true);
       eden.setValor(6, 6, true);
       eden.setValor(4, 5, true);
       eden.setValor(3, 1, true);
       eden.setValor(2, 2, true);
       eden.setValor(2, 3, true);
       eden.setValor(1, 4, true);
        

       for(int i=0;i<10;i++){
           System.out.println("GENEREACION "+(i+1));
           eden.imprimir();
           eden.siguienteGeneracion();
       }
    }

}
