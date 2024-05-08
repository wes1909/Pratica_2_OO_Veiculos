public class Main {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo(2013,"Corsa","Branco",35000);

        System.out.println();
        System.out.println("Meu CARRO:");
        System.out.println();
        System.out.println("SITUAÇÃO: " + carro.verificarManutencao());
        System.out.println("COR ATUAL:"+ carro.exibirCor());
            carro.mudarCor ("Preto");
        System.out.println("Nova Cor: "+ carro.exibirCor());


}

    }