package clases;
import javax.swing.JOptionPane;
/*@author Gustavo Apaza Huanca*/
public class Validacion {
//tengo problema con los caracteres " \
    private String charEspecialUser = "|°¬!#$%&/()=?¡¿@*+~[{^]}`-_;,:.0123456789";
    private String charEspecialDni = "|°¬!#$%&/()=?¡¿@*+~[{^]}`-_;,:.abcdefghijklmnñopqrstuvwxyz";
    // Username
    // Sin espacios (trim())
    // Min/Max 8/20
    // Sin caracteres especiales
    public void mostrarAdvertenciaUsuario(){
        JOptionPane.showMessageDialog(null, "El campo Username NO puede: " +
                                        "\n- Estar vacio" +
                                        "\n- Ser menor de 8 o mayor de 20 caracteres" +
                                        "\n- Tener caracteres especiales", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean validarUsername(String username){
//El método trim() de la clase String en Java, solo elimina los espacios al principio y al final de las cadenas.
//.replaceAll(" ", "") elimina todos los espacios de la cadena de caracteres
	String cadenaSinEspacios = username.replaceAll(" ", "");
        if(cadenaSinEspacios.isEmpty() || (cadenaSinEspacios.length() < 8 || cadenaSinEspacios.length() > 20)){
            mostrarAdvertenciaUsuario();
            return false;
        }
        for(int i = 0; i < cadenaSinEspacios.length(); i++){
            for(int j = 0; j < charEspecialUser.length(); j++){
                if(cadenaSinEspacios.charAt(i) == charEspecialUser.charAt(j)){
                    mostrarAdvertenciaUsuario();
                    return false;
                }
            }
        }
        return true;
    }
//======================================================================================================================================================
    // Password
    // Sin espacios (trim())
    // Min/Max 8/20
    // password1 password2 que sean iguales
    public void mostrarAdvertenciaContraseñas(){
        JOptionPane.showMessageDialog(null, "Los campos Password y Repetir password NO pueden: " +
                                        "\n- Estar vacio" +
                                        "\n- Ser menor de 8 o mayor de 20 caracteres" +
                                        "\n- Ser distintos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean validarContraseñas(String password1, String password2){
        String cadenaSinEspacios1 = password1.replaceAll(" ", "");
        String cadenaSinEspacios2 = password2.replaceAll(" ", "");
        if(cadenaSinEspacios1.isEmpty() || (cadenaSinEspacios1.length() < 8 || cadenaSinEspacios1.length() > 20) || (!(cadenaSinEspacios1.equals(cadenaSinEspacios2)))){
            mostrarAdvertenciaContraseñas();
            return false;
        }
        return true;
    }
//=======================================================================================================================================================
    // Email
    // xxxx@xxx.com ??????????
    // Min/Max 5/254
    // que contenga @ 
    // Sin espacios
    public void mostrarAdvertenciaEmail(){
        JOptionPane.showMessageDialog(null, "El campo Email NO puede: " +
                                        "\n- Estar vacio" +
                                        "\n- Ser menor de 5 o mayor de 254 caracteres" +
                                        "\n- Faltar @", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean validarEmail(String email){
        String cadenaSinEspacios = email.replaceAll(" ", "");
        if(cadenaSinEspacios.isEmpty() || (cadenaSinEspacios.length() < 5 || cadenaSinEspacios.length() > 256) || (cadenaSinEspacios.indexOf('@', 0) == -1)){
            mostrarAdvertenciaEmail();
            return false;
        }
        return true;
    }
//=======================================================================================================================================================
    // Dni
    // Sin espacios
    // Solo numeros
    // 8 digitos
    // sin puntos
    public void mostrarAdvertenciaDni(){
        JOptionPane.showMessageDialog(null, "El campo DNI NO puede: " +
                                        "\n- Estar vacio" +
                                        "\n- Ser distinto de 8 digitos", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
    }
    
    public boolean validarDni(String dni){
        String cadenaSinEspacios = dni.replaceAll(" ", "").toLowerCase();
        if(cadenaSinEspacios.isEmpty() || (cadenaSinEspacios.length() != 8)){
            mostrarAdvertenciaDni();
            return false;
        }
        for(int i = 0; i < cadenaSinEspacios.length(); i++){
            for(int j = 0; j < charEspecialDni.length(); j++){
                if(cadenaSinEspacios.charAt(i) == charEspecialDni.charAt(j)){
                    mostrarAdvertenciaDni();
                    return false;
                }
            }
        }
        return true;
    }
    // Crear metodos para validar los campos necesarios
}
