/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agremiacao;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alunoces
 */
@XmlRootElement
public class Time {
    private Integer id;
    private String nome;
    private String state;

    public Time(Integer id, String nome, String state) {
        this.id = id;
        this.nome = nome;
        this.state = state;
    }

    public Time() {
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
}
