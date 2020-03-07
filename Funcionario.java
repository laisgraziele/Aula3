public class Funcionario implements Autenticavel, AutorizaDesconto{

private int senha;
private double valor;

// atributos e métodos

public boolean autentica(int senha) {
if(this.senha != senha) {
return false;
}

return true;

}

public double calculaDesconto (double valor){

double valorDescontoAVista = 10;

double resultado;

resultado = valor - valorDescontoAVista;

return valor;
}



}