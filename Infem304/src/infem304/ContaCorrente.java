package infem304;

import javax.swing.JOptionPane;

public class ContaCorrente {

		public String nome = null;
		public double saldo;
		public long numConta;
		
		public void ExibirSaldo() {
			String status = "Numero da Conta: " + numConta+ "\n"+ "Nome do cliente: " + nome + "\n" + "saldo do cliente: "
				+ saldo + "\n" ;

			JOptionPane.showMessageDialog(null, status);
		}
		
		public void DepositarValor(double valor) {
			if(valor > 0) {
			this.saldo = this.saldo + valor;
			System.out.println("Foi feito um deposito de: " + valor);
			} else {
				System.out.println("Nenhum depósito foi feito.");
			}
		}
		
		public void SacarValor(double valor) {
			if(valor <= saldo && valor > 0) {
			this.saldo = this.saldo - valor;
			System.out.println("Foi sacado um valor de: " +valor);
			} else {
				System.out.println("Saldo insuficiente.");
			}
		}
}

