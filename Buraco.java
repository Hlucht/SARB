/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SARB;

/**
 *
 * @author Heloisa Luchtemberg
 */
public class Buraco {
    private Endereco endereco_buraco;
    private Localizacao localizacao_buraco;
    private Dimensao dimensao_buraco;
    private String prioridade;

    public Endereco getEndereco_buraco() {
        return endereco_buraco;
    }

    public void setEndereco_buraco(Endereco endereco_buraco) {
        this.endereco_buraco = endereco_buraco;
    }

    public Localizacao getLocalizacao_buraco() {
        return localizacao_buraco;
    }

    public void setLocalizacao_buraco(Localizacao localizacao_buraco) {
        this.localizacao_buraco = localizacao_buraco;
    }

    public Dimensao getDimensao_buraco() {
        return dimensao_buraco;
    }

    public void setDimensao_buraco(Dimensao dimensao_buraco) {
        this.dimensao_buraco = dimensao_buraco;
    }
    
    public void setPrioridade(){
        if(dimensao_buraco.getEscala()> 500){
          this.prioridade = "Urgente";
        }else{
            this.prioridade = "Adiável";
        }
    }
    
    public String getPrioridade(){
        return this.prioridade;
    }
}
