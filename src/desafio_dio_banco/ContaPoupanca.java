package desafio_dio_banco;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
	System.out.println("Extrato Conta Poupança: ");
	super.imprimirInformacoes();
	
    }

    


  
}
