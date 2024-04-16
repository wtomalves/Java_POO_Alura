public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDoLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        System.out.println(incluidoNoPlano + " e " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(String.format("A média é %.2f", media));


        String sinopse = """
                Filme Top Gun
                Filme de Aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento 
                """ + anoDoLancamento;
        System.out.println(sinopse);
        System.out.println("");
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        System.out.println("\nCLASSIFICAÇÂO\n");

        int classificacao = (int) (media / 2);
        System.out.println("Estrelas: " + classificacao);

        System.out.println("\nCasting");

        double um = 5.6;
        int dois = (int) um;
        System.out.println(dois);

        System.out.println("\nConcatenando String e Char");

        String amora = "Amora";
        char letra = 'A';
        System.out.println(amora + " " + letra);

        System.out.println("\nProduto x Quantidade");

        double precoProduto = 10.0;
        int quantidade = 10;
        double multiplicado = precoProduto * quantidade;
        System.out.println("Preço do Produto x quantidade é: " + multiplicado);

        System.out.println("\nDolar");

        double valorEmDolares = 50.0;
        double moedaReal = 4.94;
        double total = valorEmDolares * moedaReal;
        System.out.println(String.format("Você tem %.2f que equivalem a %.2f reais", valorEmDolares, total));

        System.out.println("\nPreço");

        double precoOriginal = 247.0;
        double percentualDesconto = 10.0;
        double valorComdesconto = precoOriginal - (precoOriginal * percentualDesconto / 100);
        System.out.println(String.format("Com o desconto de %.2f aplicado no valor de %.2f, o valor com desconto é %.2f", percentualDesconto, precoOriginal, valorComdesconto));




    }
}