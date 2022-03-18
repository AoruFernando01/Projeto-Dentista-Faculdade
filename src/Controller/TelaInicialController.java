/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Agenda;
import View.AnaliseDeDados;
import View.Estoque;
import View.Financeiro;
import View.Login;
import View.Pacientes;
import View.TelaInicial;
import View.Usuario;
import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Fernnd
 */
public class TelaInicialController {
    
    private final TelaInicial view;

    public TelaInicialController(TelaInicial view) {
        this.view = view;
    }
    
    public void Sair(){
        Login login = new Login();
        login.setVisible(true);
        view.dispose();
    }
    
    public void entrarPacientes(){
    Pacientes pacientes = new Pacientes();
        pacientes.setVisible(true);
    }
    
    public void entrarAgenda(){
    Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    public void entrarFinanceiro(){
    Financeiro financeiro = new Financeiro();
        financeiro.setVisible(true);
    }
    
    public void entrarAnalise(){
    AnaliseDeDados analiseDeDados = new AnaliseDeDados();
    analiseDeDados.setVisible(true);
    }
    
    public void entrarEstoque(){
    Estoque estoque = new Estoque();
        estoque.setVisible(true);    
    }
    
    public void entrarUsuario(){
    Usuario usuario = new Usuario();
        usuario.setVisible(true);
    }
    
    public void aoPassarMouse(JButton botao){
        Color SkyBlue = new Color(135,206,235);
        botao.setBackground(SkyBlue);
    }
    
    public void aoTirarMouse(JButton botao){
        Color LightBlue = new Color(173,216,230);
        botao.setBackground(LightBlue);
    }
    
}
