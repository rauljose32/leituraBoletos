/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraboleto.model;

import java.util.List;

/**
 *
 * @author aluno
 */
public interface LeituraRetorno {

    /**
     *
     * @param nomeArquivo
     * @return
     */
    public List<Boleto> lerArquivo(String nomeArquivo);

}
