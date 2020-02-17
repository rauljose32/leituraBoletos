package com.mycompany.leituraboleto.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class LeituraRetornoBancoBrasil implements LeituraRetorno {

    @Override
    public List<Boleto> lerArquivo(String nomeArquivo) {
        List<Boleto> lista = new ArrayList();
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(nomeArquivo));
            String ln;
            while ((ln = reader.readLine()) != null) {

                String[] vetor = ln.split(";");
                Boleto b = new Boleto();
                b.setId(Integer.parseInt(vetor[0]));
                b.setCodBanco(vetor[1]);
                b.setDataVencimento(LocalDate.parse(vetor[2], FORMATER_DATA));
                b.setDatePagamento(LocalDate.parse(vetor[3], FORMATER_DATA).atTime(0, 0));
                b.setCpfCliente(vetor[4]);
                b.setValor(Double.parseDouble(vetor[5]));
                b.setMulta(Double.parseDouble(vetor[6]));
                b.setJuros(Double.parseDouble(vetor[7]));
                lista.add(b);
            }
            reader.readLine();

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        return lista;
    }

}
