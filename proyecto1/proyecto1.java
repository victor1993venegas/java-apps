import java.util.Scanner;
public class proyecto1 {
   public static void main(String args[]) {
      /* Definir identificadores */
      int menu = 0 ;
      int operacion = 0 ;
      String nombre;
      
      /* Definir objetos */
      Scanner inmenu  = new Scanner(System.in);
      Scanner inoperacion = new Scanner(System.in);

      System.out.println("Bienvenido a cine hotts");
      
      /* Controlar repeticiones del programa */
      while(operacion!=2) {
         System.out.println();
         System.out.println("ingrese una opción:");
         System.out.println();

         System.out.println("1) Catalogo de peliculas");
         System.out.println("2) Proximos estrenos");
         menu = inmenu.nextInt(); /* instanciar objeto inmenu */

         /* Validar opcion ingesada */
         while(menu>2) {
            System.out.println("opción invalida , intente nuevamente: ");
            System.out.println("opciones disponibles: ");
            System.out.println("1) Catalogo de peliculas");
            System.out.println("2) Proximos estrenos");
            menu = inmenu.nextInt();
         }

         /* Opcion a mostrar */
         if(menu==1) {
            System.out.println("Estas son las peliculas en cartelera: ");
         } else {
            System.out.println("Estos son los proximos estrenos");
         }

         /* Menu de peliculas  */
         switch(menu) {
            case 1 :System.out.println();
            System.out.println("1) Rapido y furioso 7");
            System.out.println("2) Mad max");
            break;
            case 2 :System.out.println();
            System.out.println("pantaleon 4");
            System.out.println("chichiolina reloaded  2");
            break;
            default : System.out.println("WTF?");

         }

         /* Repetir proceso a peticion del usuario */
         System.out.println();
         System.out.println("Otra operacion ?");
         System.out.println("1) si");
         System.out.println("2) no");

         operacion = inoperacion.nextInt(); /* Instanciar inoperacion */

         /* Validar opcion ingresada */
         while(operacion<1) {
            System.out.println("Opcion invalida");
            System.out.println("1) si");
            System.out.println("2) no");

            operacion = inoperacion.nextInt();

         }

         /* Despedida del usuario */
         if(operacion>1) {
            System.out.println("Gracias por preferir cine hotts");

         }
      }
   }
}