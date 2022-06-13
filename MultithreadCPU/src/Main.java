import java.util.Random;

public class Main {

	Passageiro[] passageiro;
	TelaPredio telapredio = new TelaPredio();

	public void MetodoPrincipal() {
		Random rand = new Random();
		// antes o numero de andares e de passageiros eram aleatórios
		/*
		 * int nThread = rand.nextInt(8); while (nThread < 2) { nThread =
		 * rand.nextInt(8); } int F = rand.nextInt(8); while (F < 4) { F =
		 * rand.nextInt(8); }
		 */

		// numero de andares = 5;
		int F = 5;

		// variaveis que setam a posição inicial dos passageiros visualente antes das
		// threads fazerem a chamada do elevador
		int ai0, ai1, ai2, ai3, ai4;

		// numero de passageiros igual a 5
		int nThread = 5;

		// array de passageiros com 5
		passageiro = new Passageiro[nThread];

		// instancia da classe predio
		Prédio predio = new Prédio();
		// chama o run do predio passando o numero de andares
		predio.run(F);

		System.out.println("Criou " + nThread + " passageiros");
		System.out.println("-----------------------------------------");

		// percorre um for 5 vezes(numero de passageiro)
		for (int i = 0; i < nThread; i++) {
			// randomiza andares de inicio e destino dos passageiros
			int ini = rand.nextInt(F);
			int des = rand.nextInt(F);
			// destino e inicio não podem ser iguais
			while (des == ini) {
				des = rand.nextInt(F);
			}
			// criação dos passageiros com seu indice, andar de inicio, andar de destino,
			// instancia do elevador e da classe responsável pela parte gráfica
			passageiro[i] = new Passageiro(i, ini, des, predio.getElevador(), telapredio);
			passageiro[i].start();

			//join das threads
			try {
				passageiro[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//colocar os bonecos dos passageiros no andar certo quando inicia a aplicação
		ai0 = passageiro[0].andarIn;
		ai1 = passageiro[1].andarIn;
		ai2 = passageiro[2].andarIn;
		ai3 = passageiro[3].andarIn;
		ai4 = passageiro[4].andarIn;
		if (ai0 == 4) {
			//passageiro em forma de boneco
			telapredio.Passageiro0.setBounds(500, 90, 100, 100);
			//numero do passageiro
			telapredio.Passageiro_00.setBounds(500, 90, 100, 100);
		}
		if (ai0 == 3) {
			telapredio.Passageiro0.setBounds(500, 185, 100, 100);
			telapredio.Passageiro_00.setBounds(500, 185, 100, 100);
		}
		if (ai0 == 2) {
			telapredio.Passageiro0.setBounds(500, 260, 100, 100);
			telapredio.Passageiro_00.setBounds(500, 260, 100, 100);
		}
		if (ai0 == 1) {
			telapredio.Passageiro0.setBounds(500, 365, 100, 100);
			telapredio.Passageiro_00.setBounds(500, 365, 100, 100);
		}
		if (ai0 == 0) {
			telapredio.Passageiro0.setBounds(500, 460, 100, 100);
			telapredio.Passageiro_00.setBounds(500, 460, 100, 100);
		}
		// passageiro1
		if (ai1 == 4) {
			telapredio.Passageiro1.setBounds(500, 90, 100, 100);
			telapredio.Passageiro_01.setBounds(500, 90, 100, 100);
		}
		if (ai1 == 3) {
			telapredio.Passageiro1.setBounds(500, 185, 100, 100);
			telapredio.Passageiro_01.setBounds(500, 185, 100, 100);
		}
		if (ai1 == 2) {
			telapredio.Passageiro1.setBounds(500, 260, 100, 100);
			telapredio.Passageiro_01.setBounds(500, 260, 100, 100);
		}
		if (ai1 == 1) {
			telapredio.Passageiro1.setBounds(500, 365, 100, 100);
			telapredio.Passageiro_01.setBounds(500, 365, 100, 100);
		}
		if (ai1 == 0) {
			telapredio.Passageiro1.setBounds(500, 460, 100, 100);
			telapredio.Passageiro_01.setBounds(500, 460, 100, 100);
		}
		// passageiro2
		if (ai2 == 4) {
			telapredio.Passageiro2.setBounds(500, 90, 100, 100);
			telapredio.Passageiro_02.setBounds(500, 90, 100, 100);
		}
		if (ai2 == 3) {
			telapredio.Passageiro2.setBounds(500, 185, 100, 100);
			telapredio.Passageiro_02.setBounds(500, 185, 100, 100);
		}
		if (ai2 == 2) {
			telapredio.Passageiro2.setBounds(500, 260, 100, 100);
			telapredio.Passageiro_02.setBounds(500, 260, 100, 100);
		}
		if (ai2 == 1) {
			telapredio.Passageiro2.setBounds(500, 365, 100, 100);
			telapredio.Passageiro_02.setBounds(500, 365, 100, 100);
		}
		if (ai2 == 0) {
			telapredio.Passageiro2.setBounds(500, 460, 100, 100);
			telapredio.Passageiro_02.setBounds(500, 460, 100, 100);
		}
		// passageiro3
		if (ai3 == 4) {
			telapredio.Passageiro3.setBounds(500, 90, 100, 100);
			telapredio.Passageiro_03.setBounds(500, 90, 100, 100);
		}
		if (ai3 == 3) {
			telapredio.Passageiro3.setBounds(500, 185, 100, 100);
			telapredio.Passageiro_03.setBounds(500, 185, 100, 100);
		}
		if (ai3 == 2) {
			telapredio.Passageiro3.setBounds(500, 260, 100, 100);
			telapredio.Passageiro_03.setBounds(500, 260, 100, 100);
		}
		if (ai3 == 1) {
			telapredio.Passageiro3.setBounds(500, 365, 100, 100);
			telapredio.Passageiro_03.setBounds(500, 365, 100, 100);
		}
		if (ai3 == 0) {
			telapredio.Passageiro3.setBounds(500, 460, 100, 100);
			telapredio.Passageiro_03.setBounds(500, 460, 100, 100);
		}
		// passageiro4
		if (ai4 == 4) {
			telapredio.Passageiro4.setBounds(500, 90, 100, 100);
			telapredio.Passageiro_04.setBounds(500, 90, 100, 100);
		}
		if (ai4 == 3) {
			telapredio.Passageiro4.setBounds(500, 185, 100, 100);
			telapredio.Passageiro_04.setBounds(500, 185, 100, 100);
		}
		if (ai4 == 2) {
			telapredio.Passageiro4.setBounds(500, 260, 100, 100);
			telapredio.Passageiro_04.setBounds(500, 260, 100, 100);
		}
		if (ai4 == 1) {
			telapredio.Passageiro4.setBounds(500, 365, 100, 100);
			telapredio.Passageiro_04.setBounds(500, 365, 100, 100);
		}

		if (ai4 == 0) {
			telapredio.Passageiro4.setBounds(500, 460, 100, 100);
			telapredio.Passageiro_04.setBounds(500, 460, 100, 100);
		}
		
		//tornar visível
		telapredio.Passageiro0.setVisible(true);
		telapredio.Passageiro1.setVisible(true);
		telapredio.Passageiro2.setVisible(true);
		telapredio.Passageiro3.setVisible(true);
		telapredio.Passageiro4.setVisible(true);
		telapredio.Passageiro_00.setVisible(true);
		telapredio.Passageiro_01.setVisible(true);
		telapredio.Passageiro_02.setVisible(true);
		telapredio.Passageiro_03.setVisible(true);
		telapredio.Passageiro_04.setVisible(true);

		System.out.println("-----------------------------------------");

		//passageiros fazem a chamada do elevador
		for (int i = 0; i < nThread; i++) {
			passageiro[i].chamada();
		}

	}

	public static void main(String[] args) {

		Main main = new Main();
		main.MetodoPrincipal();

	}

}
