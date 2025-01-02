import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        logo();
        System.out.print("Digite o que sera criptografado: ");
        texto = scanner.nextLine();

        try {
            texto = cripto(texto);
            System.out.println("String Criptografada: " + texto);
        }
        catch (Exception e)
        {
            System.out.println("Erro: " + e);
        }
    }

    public static String cripto(String text){
        text = text.toLowerCase();
        String criptografia = "";

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for(int i = 0; i < text.length(); i++){
            char letra = text.charAt(i);
            for(int j = 0; j < alfabeto.length; j++){
                if(letra == alfabeto[j]){
                    criptografia = criptografia + Integer.toString(j+1);
                }
            }
        }
        return criptografia;
    }

    public static void logo(){
        System.out.println("***********************************");
        System.out.println("**      Criptografia Basica      **");
        System.out.println("***********************************\n");
    }
}