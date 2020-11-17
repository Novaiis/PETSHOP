/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

/**
 *
 * @author Lucas
 */
public class Servico {
    private int codigoPet;
    private int quantidade;
    private String nome;
    private double valorServico;
    private String seletor;
    private double maior=0;
    
    public String getSeletor() {
        return seletor;
    }

    public void setSeletor(String seletor) {
        this.seletor = seletor;
    }

    public int getCodigoPet() {
        return codigoPet;
    }

    public void setCodigoPet(int codigoPet) {
        this.codigoPet = codigoPet;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorServico() {
        
        if (maior<=this.valorServico){
            maior=this.valorServico;
        }
        return maior;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
    
}
