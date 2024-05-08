public class Veiculo {

//Atibutos
    int ano;
    String modelo;
    String cor;
    float km;

// Construtores
public Veiculo(){

}

public Veiculo(int ano, String modelo, String cor, float km) {

    this.ano = ano;
    this.modelo = modelo;
    this.cor = cor;
    this.km = km;

}

//Metodos

public String verificarManutencao(){

    if(km <= 25000) {
        return "Tudo ok";
    } else if (this.km >= 25000 && this.km <= 75000){
        return "Realizar Revisão parcial";
    }


    return "Realizar revisão completa";
}

public void mudarCor(String cor) {

    this.cor = cor;
}

public String exibirCor(){

    return this.cor;
}

}
