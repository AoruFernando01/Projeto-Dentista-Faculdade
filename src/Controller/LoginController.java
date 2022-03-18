/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Helper.HelperLogin;
import Model.Banco;
import Model.Usuario;
import View.Login;
import View.TelaInicial;

public class LoginController {

    private final Login view;
    private final HelperLogin helper;
    private final Banco banco;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new HelperLogin(view);
        this.banco = new Banco();
    }    
    
    
    public void entrarSistema(){
      Usuario usuario = helper.obterModelo();
      Usuario userAutenticado = banco.selectPorNomeESenha(usuario);
  
       
     if(userAutenticado != null) {
       TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        view.dispose();
     } else {
         view.exibeMensagem("Usuario ou senha incorretos");
     } 
        // se nao existir, mostrar mensagem
    }
}
