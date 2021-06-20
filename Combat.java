package RelacionamentoEntreClasses;

public class Combat {

	public static void main(String[] args) {
		//Trabalhando com vetores
		Lutador l[] = new Lutador [6];
		
		//Construtor
		l[0] = new Lutador ("P.Boy","França",31, 1.75f, 68.9f, 11, 2, 1);
		l[1] = new Lutador ("Leonardo Vieira","Brasil",34, 1.68f, 57.9f, 14, 2, 3);
		l[2] = new Lutador ("Tigger","E.U.A",35, 1.75f, 80.9f, 11, 2, 1);
		l[3] = new Lutador ("Tomy","Astrália",28, 1.75f, 81.9f, 11, 0, 2);
		l[4] = new Lutador ("Lucas.B","Brasil",37, 1.75f, 119.9f, 11, 4, 3);
		l[5] = new Lutador ("Dalton","Portugal",30, 1.75f, 105.9f, 11, 2, 4);
	
		Luta UEC01 = new Luta();
		UEC01.marcarLuta(l[5], l[4]);
		UEC01.lutar();
		//l[0].status();
	//	l[1].status();
		}
}