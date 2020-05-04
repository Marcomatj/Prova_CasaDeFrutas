package br.fai.prova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private String[] items = { "Manga", "Framboesa", "Abacate", "Guaraná", "Laranja", "Acerola", "Cacau", "Caju",
			"Goiaba", "Abacaxi", "Cereja", "Limão", "Maçã", "Ameixa", "Banana", "Mamão" };
	public Map<String, List<String>> mapaDeFrutas = new HashMap<String, List<String>>();

	public List<String> listaDeFrutas = new ArrayList<String>();

	private void start() {

		iterarMapa();

	}

	private void imprimirMapa(String letra) {

		System.out.println("Foram encontradas " + mapaDeFrutas.get(letra).size() + " frutas com a letra: " + letra);
		for (int i = 0; i < mapaDeFrutas.get(letra).size(); i++) {
			System.out.println("Frutas com a letra " + letra + ":" + mapaDeFrutas.get(letra).get(i));
		}
		System.out.println("-----------");
	}

	private void iterarMapa() {

		if (mapaDeFrutas.isEmpty()) {
			String inicial = null;
			char letra;

			for (String fruta : items) {
				letra = fruta.charAt(0);
				inicial = String.valueOf(letra);
				if (mapaDeFrutas.containsKey(inicial) == true) {
					mapaDeFrutas.get(inicial).add(fruta);

				} else {
					mapaDeFrutas.put(inicial, new ArrayList<String>());
					mapaDeFrutas.get(inicial).add(fruta);
				}
			}
			for(String aux : mapaDeFrutas.keySet()) {
			imprimirMapa(aux);}
		}
	}

}
