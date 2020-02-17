/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraboleto.model;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author aluno
 */
public interface LeituraRetorno {

    public static final DateTimeFormatter FORMATER_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMATER_DATA_HORA = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    public List<Boleto> lerArquivo(String nomeArquivo);

}
