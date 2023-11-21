public class Main {
        public static void main(String[] args) {
if (args.length < 2) {
 System.out.println("Debes poner al menos 2 numeros");
 return;
 }
 double resultado = 0.0;
 for (int i = 0; i < args.length; i++) {
 try { resultado += Double.parseDouble(args[i]);
 } catch (NumberFormatException e) {
 System.out.println("La posicion " + i + " no es validp");
 }
 } System.out.println("La suma es: " + resultado);
 }
 }


