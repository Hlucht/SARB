/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SARB;

/**
 *
 * @author Heloisa Luchtemberg
 */
public class Equipe {
    private String id_equipe;
    private int numero_membros;
    private String equipamentos;
    private float horas_trabalhadas;
    private float valor_hora;

    public String getIdentificacao() {
        return id_equipe;
    }

    public void setIdentificacao(String identificacao) {
        this.id_equipe = identificacao;
    }

    public int getNumero_membros() {
        return numero_membros;
    }

    public void setNumero_membros(int numero_membros) {
        this.numero_membros = numero_membros;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }

    public float getHoras_trabalhadas() {
        return horas_trabalhadas;
    }

    public void setHoras_trabalhadas(float horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }

    public float getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(float valor_hora) {
        this.valor_hora = valor_hora;
    }
}
