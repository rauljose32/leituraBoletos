/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leituraboleto.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {

        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get("banco-brasil-1.csv"));
            String ln;
            while ((ln = reader.readLine()) != null) {

            }
            reader.readLine();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return null;
    }

}
