package proxy;


public class Cliente {
    public static void main (String[] args){
    	
        ProxyDebitCard proxy= new ProxyDebitCard(3389455,589, "Benjamin Soto", 5000);
        proxy.retirar(300,"Bs");
        proxy.retirar(100,"E");
        proxy.retirar(150,"$");
        proxy.retirar(1000,"Y");



    }
}