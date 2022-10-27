/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SARB;

/**
 *
 * @author Heloisa Luchtemberg
 */
public class Dimensao {
    private float profundidade;
    private float largura;
    private float comprimento;
    private float escala;

    public float getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(float profundidade) {
        this.profundidade = profundidade;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    
    public void setEscala(){
        this.escala = this.comprimento * this.largura * this.profundidade;
    }
    
    public float getEscala(){
        return escala;
    }
}
