package Modelo;

/**
 *
 * @author Yonatan
 */
public class usuarios {

    private String usuario;
    private String password;
    private int nivelacceso;

    public usuarios() {
    }

    public usuarios(String usuario, String password, int nivelacceso) {
        this.usuario = usuario;
        this.password = password;
        this.nivelacceso = nivelacceso;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNivelacceso() {
        return nivelacceso;
    }

    public void setNivelacceso(int nivelacceso) {
        this.nivelacceso = nivelacceso;
    }
    
    



}
