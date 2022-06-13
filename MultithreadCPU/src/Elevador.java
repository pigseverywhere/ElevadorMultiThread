
import java.util.concurrent.Semaphore;

public class Elevador extends Thread {

	// o elevador deve rodar em loop separado a ser implemententado em outra thread.

	TelaPredio telapredio;// classe de interface
	public int F;// quantidade de andares
	public int andarIn;// andar inicial do elevador
	public int andarAt;// andar atual do elevador
	Semaphore semaphore = new Semaphore(1);// semaforo

	int idP, aiP, afP;// valores que os passageiros usam( indice, andar inicial e andar destino)

	public Elevador(int _F, int _andarIn) {
		// valores passados pela classe predio
		F = _F;
		andarIn = _andarIn;
		andarAt = andarIn;
	}

	// chamada do elevador e suas ações
	public void usarElevador(int _id, int _andarIn, int _andarDes, TelaPredio _telapredio) {
		// entrada de thread e bloqueio
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// classe de interface passado pelo passageiro
		this.telapredio = _telapredio;
		idP = _id;
		aiP = _andarIn;
		afP = _andarDes;

		// parte visual
		// delay
		try {
			sleep(500 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ação visual do elevador indo buscar passageiro
		funcaoEntrarDesenho();

		// delay
		try {
			sleep(300 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ação visual do elevador indo deixar passageiro
		funcaoSairDesenho();

		// parte textual

		System.out.println("Passageiro " + idP + " no andar: " + aiP + " chamou o elevador para o andar: " + afP);

		// ir buscar passageiro
		mudarAndar(aiP);// elevador muda de andar
		andarAt = aiP;// andar atual recebe o inicial do passageiro
		AbrirPorta();// abre a porta do elevador
		VisitarAndar(0);// passageiro entra
		FecharPorta();// fecha a porta

		// ir deixar passageiro
		mudarAndar(afP);// elevador muda de andar
		andarAt = afP;// andar atual recebe o destino do passageiro
		AbrirPorta();// abre a porta do elevador
		VisitarAndar(1);// passageiro sai
		FecharPorta();// fecha a porta

		System.out.println("------------------------------------------");

		// libreação do semaforo
		semaphore.release();

		// delay
		try {
			sleep(500 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// funcao que gera delay
	public void esperar() {
		try {
			sleep(200 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void funcaoEntrarDesenho() {
		// dependendo do indice do personagem a imagem do boneco vai ser alterada, por
		// exemplo no caso do indice 0 estamos lidando com o label passageiro0 e o label
		// que mostra seu indice: passageiro_00
		if (idP == 0) {
			// dependendo de qual andar inicial, posições serão atualizadas
			if (aiP == 4) {
				// elevador e porta vao até o andar desejado
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				// espera
				esperar();
				// portas abrem
				telapredio.Portas.setVisible(false);
				esperar();
				// passageiro e seu numero entram
				telapredio.Passageiro0.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 90, 100, 100);
				// espera
				esperar();
				// porta fecha
				telapredio.Portas.setVisible(true);
			}

			if (aiP == 3) {
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 2) {
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 1) {
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				telapredio.Portas.setBounds(350, 356, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 0) {
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice 1
		if (idP == 1) {
			if (aiP == 4) {
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (aiP == 3) {
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 2) {
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 1) {
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 0) {
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice 2
		if (idP == 2) {
			if (aiP == 4) {
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (aiP == 3) {
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 2) {
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 1) {
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				telapredio.Portas.setBounds(350, 356, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 365, 100, 100);
				esperar();
			}
			if (aiP == 0) {
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice3
		if (idP == 3) {
			if (aiP == 4) {
				// elevador e portas vão para andar desejado
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				esperar();
				// porta abre
				telapredio.Portas.setVisible(false);
				esperar();
				// passageiro e seu numero entrasm no elevador
				telapredio.Passageiro3.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 90, 100, 100);
				esperar();
				// porta fecha
				telapredio.Portas.setVisible(true);
			}

			if (aiP == 3) {
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 2) {
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 1) {
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 0) {
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice4
		if (idP == 4) {
			if (aiP == 4) {
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (aiP == 3) {
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 2) {
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 1) {
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				telapredio.Portas.setBounds(350, 356, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (aiP == 0) {
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}

	}

	public void funcaoSairDesenho() {
		// indice0
		if (idP == 0) {
			// dependendo de qual andar final, posições serão atualizadas
			if (afP == 4) {
				// passageiro, seu numero e o elevador e sua porta vão para a posição do andar
				// de destino
				telapredio.Passageiro0.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 90, 100, 100);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				// esperam
				esperar();
				// porta abre
				telapredio.Portas.setVisible(false);
				esperar();
				// passageiro e seu numero saem do elevador
				telapredio.Passageiro0.setBounds(150, 90, 100, 100);
				telapredio.Passageiro_00.setBounds(150, 90, 100, 100);
				esperar();
				// porta fecha
				telapredio.Portas.setVisible(true);
			}

			if (afP == 3) {
				telapredio.Passageiro0.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 185, 100, 100);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(150, 185, 100, 100);
				telapredio.Passageiro_00.setBounds(150, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 2) {
				telapredio.Passageiro0.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 260, 100, 100);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(150, 260, 100, 100);
				telapredio.Passageiro_00.setBounds(150, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 1) {
				telapredio.Passageiro0.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 365, 100, 100);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(150, 365, 100, 100);
				telapredio.Passageiro_00.setBounds(150, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 0) {
				telapredio.Passageiro0.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_00.setBounds(350, 460, 100, 100);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro0.setBounds(150, 460, 100, 100);
				telapredio.Passageiro_00.setBounds(150, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice1
		if (idP == 1) {
			if (afP == 4) {
				telapredio.Passageiro1.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 90, 100, 100);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(150, 90, 100, 100);
				telapredio.Passageiro_01.setBounds(150, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (afP == 3) {
				telapredio.Passageiro1.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 185, 100, 100);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(150, 185, 100, 100);
				telapredio.Passageiro_01.setBounds(150, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 2) {
				telapredio.Passageiro1.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 260, 100, 100);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(150, 260, 100, 100);
				telapredio.Passageiro_01.setBounds(150, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 1) {
				telapredio.Passageiro1.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 365, 100, 100);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(150, 365, 100, 100);
				telapredio.Passageiro_01.setBounds(150, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 0) {
				telapredio.Passageiro1.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_01.setBounds(350, 460, 100, 100);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro1.setBounds(150, 460, 100, 100);
				telapredio.Passageiro_01.setBounds(150, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice2
		if (idP == 2) {
			if (afP == 4) {
				telapredio.Passageiro2.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 90, 100, 100);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(150, 90, 100, 100);
				telapredio.Passageiro_02.setBounds(150, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (afP == 3) {
				telapredio.Passageiro2.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 185, 100, 100);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(150, 185, 100, 100);
				telapredio.Passageiro_02.setBounds(150, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 2) {
				telapredio.Passageiro2.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 260, 100, 100);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(150, 260, 100, 100);
				telapredio.Passageiro_02.setBounds(150, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 1) {
				telapredio.Passageiro2.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 365, 100, 100);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(150, 365, 100, 100);
				telapredio.Passageiro_02.setBounds(150, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 0) {
				telapredio.Passageiro2.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_02.setBounds(350, 460, 100, 100);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro2.setBounds(150, 460, 100, 100);
				telapredio.Passageiro_02.setBounds(150, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice3
		if (idP == 3) {
			if (afP == 4) {
				telapredio.Passageiro3.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 90, 100, 100);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(150, 90, 100, 100);
				telapredio.Passageiro_03.setBounds(150, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);

			}

			if (afP == 3) {
				telapredio.Passageiro3.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 185, 100, 100);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(150, 185, 100, 100);
				telapredio.Passageiro_03.setBounds(150, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 2) {
				telapredio.Passageiro3.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 260, 100, 100);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(150, 260, 100, 100);
				telapredio.Passageiro_03.setBounds(150, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 1) {
				telapredio.Passageiro3.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 365, 100, 100);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(150, 365, 100, 100);
				telapredio.Passageiro_03.setBounds(150, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 0) {
				telapredio.Passageiro3.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_03.setBounds(350, 460, 100, 100);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro3.setBounds(150, 460, 100, 100);
				telapredio.Passageiro_03.setBounds(150, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
		// indice4
		if (idP == 4) {
			if (afP == 4) {
				telapredio.Passageiro4.setBounds(350, 90, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 90, 100, 100);
				telapredio.Portas.setBounds(350, 90, 100, 100);
				telapredio.Elevador.setBounds(250, -356, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(150, 90, 100, 100);
				telapredio.Passageiro_04.setBounds(150, 90, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}

			if (afP == 3) {
				telapredio.Passageiro4.setBounds(350, 185, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 185, 100, 100);
				telapredio.Portas.setBounds(350, 185, 100, 100);
				telapredio.Elevador.setBounds(250, -260, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(150, 185, 100, 100);
				telapredio.Passageiro_04.setBounds(150, 185, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 2) {
				telapredio.Passageiro4.setBounds(350, 260, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 260, 100, 100);
				telapredio.Portas.setBounds(350, 260, 100, 100);
				telapredio.Elevador.setBounds(250, -180, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(150, 260, 100, 100);
				telapredio.Passageiro_04.setBounds(150, 260, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 1) {
				telapredio.Passageiro4.setBounds(350, 365, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 365, 100, 100);
				telapredio.Portas.setBounds(350, 365, 100, 100);
				telapredio.Elevador.setBounds(250, -90, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(150, 365, 100, 100);
				telapredio.Passageiro_04.setBounds(150, 365, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
			if (afP == 0) {
				telapredio.Passageiro4.setBounds(350, 460, 100, 100);
				telapredio.Passageiro_04.setBounds(350, 460, 100, 100);
				telapredio.Portas.setBounds(350, 460, 100, 100);
				telapredio.Elevador.setBounds(250, 0, 300, 600);
				esperar();
				telapredio.Portas.setVisible(false);
				esperar();
				telapredio.Passageiro4.setBounds(150, 460, 100, 100);
				telapredio.Passageiro_04.setBounds(150, 460, 100, 100);
				esperar();
				telapredio.Portas.setVisible(true);
			}
		}
	}

	// funções textuais
	public void AbrirPorta() {
		System.out.println("Abriu a Porta do andar: " + andarAt);
	}

	public void FecharPorta() {
		System.out.println("Fechou Porta do andar: " + andarAt);
	}

	public void VisitarAndar(int i) {
		//pegar passageiro
		if (i == 0)
			System.out.println("Pegou o passageiro " + idP);
		//deixar passageiro
		if (i == 1)
			System.out.println("Deixou o passageiro " + idP + " que chegou no seu destino!");
	}

	public void mudarAndar(int i) {
		System.out.println("O elevador foi para o andar: " + i);
	}

}