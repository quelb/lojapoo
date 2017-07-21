/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojinha;

/**
 *
 * @author aluno
 */
public class Funcionario extends Pessoa {

    /**
     * @return the codFuncionario
     */
    public int getCodFuncionario() {
        return codFuncionario;
    }

    /**
     * @param codFuncionario the codFuncionario to set
     */
    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    /**
     * @return the dados
     */
    public Banco getDados() {
        return dados;
    }

    /**
     * @param dados the dados to set
     */
    public void setDados(Banco dados) {
        this.dados = dados;
    }
    
    public Funcionario() {
        
    }
   
    private int codFuncionario;
    private Banco dados;
        
    
}
