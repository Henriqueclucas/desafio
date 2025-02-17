package desafio_dio_banco;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    private double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
	this.agencia = AGENCIA_PADRAO;
	this.numero = SEQUENCIAL ++;
    this.cliente = cliente;
	}

    
    public void sacar(double valor) {
	this.saldo = saldo - valor;
    }

    
    public void depositar(double valor) {
	this.saldo = saldo + valor;

    }

    
    public void transferir(double valor, Conta contaDestino) {
	this.sacar(valor);
	contaDestino.depositar(valor);

    }

    public int getAgencia() {
	return agencia;
    }

    public int getNumero() {
	return numero;
    }

    public double getSaldo() {
	return saldo;

    }
    
    protected void imprimirInformacoes() {
        System.out.println(String.format("Endereço: %s", this.cliente.getEndereco()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));    
    System.out.println(String.format("Titular: %s", this.cliente.getNome()));
   	System.out.println(String.format("Agencia: %d", this.agencia));
   	System.out.println(String.format("Conta: %d", this.numero));
   	System.out.println(String.format("Saldo: %.2f", this.saldo));
       }

}
