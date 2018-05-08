package pucrs.s2b.exemplo03;

public class Medias {

	public static String calcular(float p1, float p2) {
		String r = null;
		float nota=(p1+p2)/2f;
		if(nota>=7.0f){
			r="Aprovado";
		}else if(nota<=7.0f && nota>=4.0f) {
			r="Em exame";
		}else {
			r="Reprovado";
		}
		return r;
	}
}