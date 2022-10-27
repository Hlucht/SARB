/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SARB;

/**
 *
 * @author Heloisa Luchtemberg
 */
public class Ordem extends Equipe{
    private Buraco buraco_ordem;
    private String status;
    private int material;
    private float custo_reparo;

    public Buraco getBuraco_ordem() {
        return buraco_ordem;
    }

    public void setBuraco_ordem(Buraco buraco_ordem) {
        this.buraco_ordem = buraco_ordem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getMaterial() {
        return material;
    }

    public void setMaterial(int material) {
        this.material = material;
    }
    
    public void setCusto(float valor_material, float valor_equipamento){
        this.custo_reparo = (this.getHoras_trabalhadas() * this.getValor_hora()* this.getNumero_membros()) + valor_material + valor_equipamento;   
    }
    
    public float getCusto(){
        return custo_reparo;
    }
}
