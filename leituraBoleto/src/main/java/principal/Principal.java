package principal;

import com.mycompany.leituraboleto.model.LeituraRetornoBancoBrasil;
import com.mycompany.leituraboleto.model.LeituraRetornoBradesco;
import com.mycompany.leituraboleto.model.ProcessarBoletos;

/**
 *
 * @author Raul
 */
public class Principal {

    public static void main(String[] args) {

        LeituraRetornoBancoBrasil leituraBB = new LeituraRetornoBancoBrasil();
        ProcessarBoletos p = new ProcessarBoletos(leituraBB);

        String nomeArquivo = "banco-brasil-1.csv";
        p.processar(nomeArquivo);

        nomeArquivo = "bradesco-1.csv";
        LeituraRetornoBradesco leituraBradesco = new LeituraRetornoBradesco();
        p.processar(nomeArquivo);

    }

}
