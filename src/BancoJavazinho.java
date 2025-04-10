import java.util.Scanner;

public class BancoJavazinho {
    public static void main(String[] args) {

        String nome = ("Tatiane Gomes");
        String tipoDeConta = ("Conta Internacional");
        double saldoReal = 1200.00;
        double saldoDolar = 3000.00;

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\nCliente: "+nome);
        System.out.println("Tipo de Conta: "+tipoDeConta);
        System.out.println("Saldo em Real: "+saldoReal);
        System.out.println("Saldo em Dólar: "+saldoDolar);
        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++");

        String Menu = ("""
                \n************* MENU - BANCO JAVAZINHO **************
                \n1 - Consultar Saldo Real
                2 - Consultar Saldo Dólar
                3 - Transferir Dólar
                4 - Transferir Real
                5- Converter Real p/ dólar
                6 - SAIR
                """);
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 6){
            System.out.println(Menu);
            System.out.println("Digite uma Opcao: ");
            opcao = leitura.nextInt();
         if (opcao ==1){
            System.out.println(saldoReal);}

         else if (opcao ==2){
             System.out.println(saldoDolar);}

         else if (opcao==3) {
             System.out.println("Digite um valor p/ tranferencia: ");
             double valorTranfDolar = leitura.nextDouble();

             if (valorTranfDolar > saldoDolar) {
                 System.out.println("Saldo insuficiente");
             } else {
                 saldoDolar = saldoDolar - valorTranfDolar;
                 System.out.println("Tranferencia realizada");
                 System.out.println("Seu novo saldo em dolar: "+saldoDolar);
             }
         }

           else if (opcao == 4) {
                 System.out.println("Digite um valor para tranferencia: ");
                 double valorTranfReal = leitura.nextDouble();


           if (valorTranfReal > saldoReal) {
                     System.out.println("Saldo insuficiente");
                 } else {
                     saldoReal = saldoReal - valorTranfReal;
               System.out.println("Tranferencia realizada.");
               System.out.println("Seu novo saldo em Real: "+ saldoReal);
                 }
             } else if (opcao==5){
             System.out.println("Digite o valor em Real: ");
             double convReal = leitura.nextDouble();
             saldoDolar = (convReal * 5.90) + saldoDolar;
             System.out.println("Tranferencia convertida realizada.");
             System.out.println("Seu novo saldo em dólar: "+ saldoDolar);
             System.out.println("Contacao do dólar hoje:R$.5,90 ");
         }

         }
           }
         }




















