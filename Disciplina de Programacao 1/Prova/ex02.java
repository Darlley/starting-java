public class ex02{
	public static void main(String[] args){
		int sala1 = 0, sala2 = 0, sala3 = 0, maior = 0, menor = 0, dia = 0;
		int vetor1[] = new int[7], vetor2[] = new int[7], vetor3[] = new int[7];
		String fraseMaior = "A sala que vendeu mais foi a ";
		String fraseMenor = "A sala que vendeu menos foi a ";
		
		for(int i=0; i<=6; i++){
			// ENTRADA DE DADOS
			System.out.println("\nDIA " + (i+1));
			vetor1[i] = Input.readInt("Informe a quantidade de ingressos vendidos para a sala 1: ");
			vetor2[i] = Input.readInt("Informe a quantidade de ingressos vendidos para a sala 2: ");
			vetor3[i] = Input.readInt("Informe a quantidade de ingressos vendidos para a sala 3: ");
			System.out.println("");
			
			// A)
			sala1 += vetor1[i];
			sala2 += vetor2[i];
			sala3 += vetor3[i];
			
			// B) e C)
			if(sala1 > sala2 && sala1 > sala3){
				maior = vetor1[i];
				fraseMaior = "SALA 1";
				if(sala2 > sala3){
					menor = vetor3[i];
					fraseMenor = "SALA 3";
					dia = (i+1);
				}else{
					menor = vetor2[i];
					fraseMenor = "SALA 2";
					dia = (i+1);
				}
			}else if(sala2 > sala1 && sala2 > sala3){
				maior = vetor2[i];
				fraseMaior = "SALA 2";
				if(sala1 > sala3){
					menor = vetor3[i];
					fraseMenor = "SALA 3";
					dia = (i+1);
				}else{
					menor = vetor1[i];
					fraseMenor = "SALA 1";
					dia = (i+1);
				}
			}else{
				maior = vetor3[i];
				fraseMaior = "SALA 3";
				if(sala1 > sala2){
					menor = vetor2[i];
					fraseMenor = "SALA 2";
					dia = (i+1);
				}else{
					menor = vetor1[i];
					fraseMenor = "SALA 1";
					dia = (i+1);
				}
			}
		}
		
		System.out.println("A) Quantos ingressos foram vendidos em cada semana para cada uma das 3 salas: ");
		System.out.println("Sala 1: " + sala1);
		System.out.println("Sala 2: " + sala2);
		System.out.println("Sala 3: " + sala3);
		System.out.println("");
		
		System.out.println("B) Qual foi a sala que vendeu mais ingressos e em que dia isto ocorreu ");
		System.out.println(fraseMaior + "\nTOTAL: " + maior + "\nNo dia: " + dia);
		System.out.println("");
		
		System.out.println("C) Qual foi a sala que vendeu menos ingressos e em que dia isto ocorreu" );
		System.out.println(fraseMenor + "\nTOTAL: " + menor + "\nNo dia: " + dia);
	}
}
