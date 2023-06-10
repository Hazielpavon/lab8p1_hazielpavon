
package lab8p1_hazielpavon;

public class Libro {
    
    private int anio; 
    String escritor; 
    private String titulo; 
    
    
    public Libro(int anioN, String escritorN, String tituloN){
    this.anio = anioN;
    this.escritor = escritorN; 
    this.titulo = tituloN;  
    
    }
    
    public Libro(){
        
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anioN) {
        this.anio = anioN;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritorN) {
        this.escritor = escritorN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituloN) {
        this.titulo = tituloN;
    }
    
}


