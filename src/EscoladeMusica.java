import java.util.Scanner;

public class EscoladeMusica {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int resp;
        int i = 0;
        String cursop;

        Campos c = new Campos();

        System.out.println("\n Pressione : \n 1-Para cadastrar novo aluno \n"
                + "2-Para pesquisa por curso especifico \n "
                + "3-Para sair do programa");
        resp = leia.nextInt();

        while (resp >= 1 && resp <= 2) {
            if (resp == 1) {
                System.out.println("Digite o nome");
                c.setNome(leia.next());
                System.out.println("Telefone para contato");
                c.setTelefone(leia.nextInt());
                System.out.println("Cidade natal");
                c.setCidade(leia.next());
                System.out.println("Curso matriculado ");
                c.setCurso(leia.next());
                System.out.println("CPF do aluno");
                c.setCpf(leia.next());
                System.out.println("Data de nascimento");
                c.setDatan(leia.next());
                Campos.vet.add(c);

                System.out.println("\n Pressione : \n 1-Para cadastrar novo aluno \n"
                        + "2-Para pesquisa por curso especifico \n "
                        + "3-Para sair do programa");
                resp = leia.nextInt();
            }

            if (resp == 2) {
                System.out.println("\n Digite o curso a ser pesquisado");
                cursop = leia.next();
                for (i = 0; i < Campos.vet.size(); i++) {
                    if (cursop.equalsIgnoreCase(Campos.vet.get(i).getCurso())) {
                        System.out.println("Nome.....=" + Campos.vet.get(i).getNome());
                        System.out.println("Telefone para contato.....=" + Campos.vet.get(i).getTelefone());
                        System.out.println("CPF.....=" + Campos.vet.get(i).getCpf());
                        System.out.println("Cidade natal.....=" + Campos.vet.get(i).getCidade());
                        System.out.println("Data de nascimento.....=" + Campos.vet.get(i).getDatan());
                    } else {
                        System.out.println("\n Curso não encontrado");

                    }
                }

            }
            System.out.println("\n Pressione : \n 1-Para cadastrar novo aluno \n"
                    + "2-Para pesquisa por curso especifico \n "
                    + "3-Para sair do programa");
            resp = leia.nextInt();
        }
        if (resp == 3) {
            System.out.println(" \n Você saiu do programa.");
        }

    }
}
