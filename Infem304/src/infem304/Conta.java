package infem304;

import javax.swing.JOptionPane;

public class Conta {

	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		double entrada; 
		cc1.numConta = Long.parseLong(JOptionPane.showInputDialog(null, "Informe o numero da conta: "));
		cc1.nome = JOptionPane.showInputDialog(null, "Informe o seu nome:");
		cc1.saldo = 100;
		
		
		entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor para o deposito"));
		cc1.DepositarValor(entrada);
		cc1.ExibirSaldo();
		
		String saque = JOptionPane.showInputDialog(null, "Deseja sacar?");
		if (saque.equals("sim") || saque.equals("Sim") || saque.equals("SIM") || saque.equals("S")) {
			entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor do saque"));
			cc1.SacarValor(entrada);
			cc1.ExibirSaldo();	
		} else if (saque.equals("não") || saque.equals("Não") || saque.equals("NÃO") || saque.equals("n") || saque.equals("N")) {
			cc1.ExibirSaldo();
		}
		
	}

}
