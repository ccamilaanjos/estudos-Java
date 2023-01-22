public class Estudo05 {

	public static void main(String[] args) {
		String[] nomes = {"camila", "wesley", "maria", "katie", "anne"};
		String aux;
		int i, j;

		for (i = 0; i < nomes.length; i++) {
			for (j = 0; j < nomes.length - 1; j++) {
				if(nomes[i].compareTo(nomes[j]) < 0) {
					aux = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = aux;
				}
			}
		}

		for (i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
}
