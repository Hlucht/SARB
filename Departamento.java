/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SARB;

/**
 *
 * @author Heloisa Luchtemberg
 */
public class Departamento extends Relato{
    private String id;
    private Ordem ordem_servico;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ordem getOrdem_servico() {
        return ordem_servico;
    }

    public void setOrdem_servico(Ordem ordem_servico) {
        this.ordem_servico = ordem_servico;
    }
}
