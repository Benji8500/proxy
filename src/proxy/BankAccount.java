package proxy;

public class BankAccount implements IAccount {
    private String owner;
    private int saldo;
    
    
    public BankAccount() {}
    

    public BankAccount(String owner, int saldo) {
		this.owner = owner;
		this.saldo = saldo;
	}





	public String getOwner() {
		return owner;
	}





	public void setOwner(String owner) {
		this.owner = owner;
	}





	public int getSaldo() {
		return saldo;
	}





	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}





	@Override
    public void retirar(int monto, String moneda) {
        if(monto<=saldo) {
        	saldo-=monto;
        	System.out.println("Estimado: "+ this.getOwner());
        	System.out.println("Se ha realizado una transaccion con un valor de: "+monto+moneda+ ", el saldo restante es: "+saldo);
        }else {
        	System.out.println("No se puede llevar a cabo la transferencia");
        }
       
    }
}