import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] usuario1 = new String[6];

        Scanner nome = new Scanner(System.in);
        System.out.println("Nome: ");
        usuario1[0] = nome.nextLine();

        Scanner cpf = new Scanner(System.in);
        System.out.println("CPF: ");
        usuario1[1] = cpf.nextLine();

        Scanner tel = new Scanner(System.in);
        System.out.println("Telefone: ");
        usuario1[2] = tel.nextLine();

        Scanner nas = new Scanner(System.in);
        System.out.println("Nascimento: ");
        usuario1[3] = nas.nextLine();

        Scanner agen = new Scanner(System.in);
        System.out.println("Data agendamento: ");
        usuario1[4] = agen.nextLine();

        Scanner per = new Scanner(System.in);
        System.out.println("Periodo: ");
        usuario1[5] = per.nextLine();

        Usuario usuarioNovo = new Usuario(usuario1);

        System.out.println(usuarioNovo.toString());
    }
}