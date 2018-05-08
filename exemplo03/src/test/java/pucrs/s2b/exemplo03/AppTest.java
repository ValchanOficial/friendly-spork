package pucrs.s2b.exemplo03;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class AppTest{

	@Test
	@FileParameters("./CSV/teste.csv")
	public void paramTesteArquivo(float p1, float p2, String r){
		assertEquals(r, Medias.calcular(p1, p2));
	}
}