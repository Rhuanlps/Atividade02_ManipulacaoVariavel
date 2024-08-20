public class Main {
    public static void main(String[] args) {

        //informações
        //prodCompra = produtos comprados
        String nome = "Claudin";
        int idade = 21;
        double salario = 2500.00;
        int mes = 12;
        int prodCompra = 4;
        double gasto = 2000.00;

        //operação
        double salarioAno = salario * mes;
        double salarioLiquido = salarioAno - gasto;
        double prodValor = prodCompra / gasto;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: R$" + salario);
        System.out.println("O " + nome + " trabalhou " + mes + " meses.");
        System.out.println("O senhor " + nome + " teve um total de R$" + gasto + " em gastos no ano!");
        System.out.println("No total foram " + prodCompra + " compras no ano, dando o valor de cada compra R$" + prodValor + "." );
        System.out.println("O senho teve o valor liquido em R$" + salarioLiquido + "." );

    }
}