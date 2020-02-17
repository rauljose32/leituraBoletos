package com.mycompany.leituraboleto.model;

import java.util.List;

/**
 *
 * @author Raul
 */
public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    public ProcessarBoletos(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }

    public void processar(String nomeArquivo) {
        List<Boleto> boletos = leituraRetorno.lerArquivo(nomeArquivo);
        for (Boleto b : boletos) {
            System.out.println("Id: " + b.getId() + "\nBanco: " + b.getCodBanco());
        }
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
