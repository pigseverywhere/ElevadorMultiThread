
public class Pr�dio {

	// vai criar um objeto do tipo elevador e o inicializa(ele pode ser inicializado
	// em um andar pre_definido).
	int andarIn = 0;

	Elevador elevador;

	public Pr�dio() {
	}

	public void run(int F) {
		// cria elevador passando numero de andares e o andar inicial dele(0)
		elevador = new Elevador(F, andarIn);
		//prints informativos
		System.out.println("Criou pr�dio com " + F + " andares");
		System.out.println("O elevador come�ou no andar: " + andarIn);

	}

	//fun��o que retorna o elevador criado
	public Elevador getElevador() {
		return this.elevador;
	}

}