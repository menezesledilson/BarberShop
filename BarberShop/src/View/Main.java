/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Leds
 */
public class Main {
    
    
   public static void main (String[] args){
       String nome = "Tiago";
       System.out.println(nome);
       
       Servico servico = new Servico(1," barba ",30);
       
       System.out.print(servico.getDescricao());
       System.out.print(servico.getValor());
       
      Cliente cliente = new Cliente(1, "tiago", "Rua TEsla", "354652356");
       System.out.print (cliente.getNome());
       
       Usuario usuario = new Usuario( 1, "Barbeiro", "senha");
          System.out.print (usuario);
          
          
      Agendamento  agendamento= new Agendamento (1,cliente,servico, 30,"10/08/2023 09:15");
        System.out.print (agendamento.getCliente().getNome());
          
   }   
}
