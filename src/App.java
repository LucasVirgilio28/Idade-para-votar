import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();
       
       if (idade >= 18 && idade <= 70){
        System.out.println ("Precisa votar");
       } else if (idade >= 16 && idade <= 17){
        System.out.println("Voto opcional");
       } else if (idade >= 71 && idade <= 200){
        System.out.println("Voto opcional");
       } else if (idade >= 0 && idade <= 15){
        System.out.println("Não pode votar");
       } else {
        System.out.println("Inexistente");
       }
       teclado.close();
    }
}
