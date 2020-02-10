/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraboleto.model;

/**
 *
 * @author aluno
 */
public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    public void processar(String nomeArquivo) {
        LeituraRetorno lr = new LeituraRetornoBancoBrasil();
        lr.lerArquivo(nomeArquivo);
    }

    public LeituraRetorno getLeituraRetorno() {
        return leituraRetorno;
    }

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
}
