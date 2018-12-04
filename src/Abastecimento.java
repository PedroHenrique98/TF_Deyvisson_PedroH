import java.util.*;
import java.text.*;


public class Abastecimento {
	private Automovel automovel;

	private String tipoCombustivel;

	private String data;

	private float odometroAtual;

	private float litros;

	private float precoLitro;

	private float precoTotal;

	public Abastecimento(Automovel auto, String tc, float oa, float l, float pl, float pt) {
		automovel = auto;
		tipoCombustivel = tc;
		odometroAtual = oa;
		litros = l;
		precoLitro = pl;
		precoTotal = pt;
		java.util.Date d = new Date();
		data = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
	}
}
