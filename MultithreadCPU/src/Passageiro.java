
public class Passageiro extends Thread {

	// N numero de passageiros

	// passageiro precisa ter Andar Inicial, Andar de destino.

	int id;//indice
	int andarIn;//andar incial
	int andarDes;//andar destino
	Elevador elevador;//classe elevador
	TelaPredio telapredio;//classe de interface

	public Passageiro(int _id, int _andarIn, int _andarDes, Elevador _elevador, TelaPredio _telapredio) {
		id = _id;// identificação
		andarIn = _andarIn;// andar inicial
		andarDes = _andarDes;// andar destino
		this.elevador = _elevador;//instancia do elevador criada pelo prédio
		this.telapredio = _telapredio;//instancia da telapredio cirada pela main
	}

	public void run() {
		//informação textual
		System.out.println("Criou o passageiro " + id + " com o inicio: " + andarIn + " e destino: " + andarDes);
	}

	public void chamada() {
		//chamada do elevador
		elevador.usarElevador(id, andarIn, andarDes, telapredio);
	}

}