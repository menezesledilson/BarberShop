/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Leds
 */
public class Usuario extends Pessoa {
   
    protected String Senha;
    
    protected String NivelAcesso;

    public Usuario( int id, String nome, String Senha) {
        super(id, nome);
        this.Senha = Senha;
    }

    public Usuario(String Senha, String NivelAcesso, int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.Senha = Senha;
        this.NivelAcesso = NivelAcesso;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivelAcesso() {
        return NivelAcesso;
    }

    public void setNivelAcesso(String NivelAcesso) {
        this.NivelAcesso = NivelAcesso;
    }
 
    
    
 
}
