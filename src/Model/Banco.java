package Model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    public static void main(String[] args) {
     Inicia();   
    }
    
    public static ArrayList<Usuario> banco;
    
    public static void Inicia(){
        
        banco = new ArrayList<Usuario>();
        Usuario usuario1 = new Usuario("Skss", "senha");
        
        banco.add(usuario1);
        
        banco.forEach(x -> x.getUser());      
        
        
    }
    
    public Usuario selectPorNomeESenha(Usuario usuario){
        for (Usuario usuarioLista : banco) {
                 if(nomeESenhaSaoIguais(usuarioLista,usuario)){
                return usuarioLista;
            }
        }
        return null;
    }
    
    private boolean nomeESenhaSaoIguais(Usuario usuario, Usuario usuarioAPesquisar) {
        return usuario.getUser().equals(usuarioAPesquisar.getUser()) && usuario.getSenha().equals(usuarioAPesquisar.getSenha());
    }
    
    
    
    
}
