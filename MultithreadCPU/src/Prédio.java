
public class Prédio {

	// vai criar um objeto do tipo elevador e o inicializa(ele pode ser inicializado
	// em um andar pre_definido).
	int andarIn = 0;

	Elevador elevador;

	public Prédio() {
	}

	public void run(int F) {
		// cria elevador passando numero de andares e o andar inicial dele(0)
		elevador = new Elevador(F, andarIn);
		//prints informativos
		System.out.println("Criou prédio com " + F + " andares");
		System.out.println("O elevador começou no andar: " + andarIn);

	}

	//função que retorna o elevador criado
	public Elevador getElevador() {
		return this.elevador;
	}

}