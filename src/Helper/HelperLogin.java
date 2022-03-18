/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import Model.Usuario;
import View.Login;


public class HelperLogin {

    private final Login view;
    
    public HelperLogin(Login view) {
        this.view = view; 
    }
    
    public Usuario obterModelo() {
          String user = view.getTextUsuario().getText();
          String senha = view.getTextSenha().getText();
          Usuario usuario = new Usuario(user, senha);      
          return usuario;
    }
    
}
