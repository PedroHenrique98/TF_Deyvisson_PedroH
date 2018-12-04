public class Automovel {

	private String placaVeiculo;

	private String modelo;

	private int ano;

	private String fabricante;

	private int capTanque;

	private float odometro;

	public Automovel(String pv, String m, int a, String f, int ct, float o) {
		placaVeiculo = pv;
		modelo = m;
		ano = a;
		fabricante = f;
		capTanque = ct;
		odometro = o;
	}

	public void setPlacaVeiculo(String placa) {
		placaVeiculo = placa;
	}

	public float setOdometro(int odo) {
		odometro = odo;
	}


	public String toString() {
		return null;
	}
}
