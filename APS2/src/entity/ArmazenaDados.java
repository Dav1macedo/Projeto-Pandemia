package entity;

public class ArmazenaDados {
    private int id;
    private String Cidade;
    private int Casos_confirmados;
    private int Obitos;
    private int Casos_Descartados;
    

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    } 
    public String getCidade(){
        return Cidade;
    }
    public void setCidade (String Cidade){
        this.Cidade = Cidade;
    }
    public int getCasos_Confirmados() {
        return Casos_confirmados;
    }
    public void setCasos_Confirmados(int casos_confirmados){
        this.Casos_confirmados = casos_confirmados;
    } 
    public int getObitos() {
        return Obitos;
    }
    public void setObitos(int Obitos){
        this.Obitos = Obitos;
    } 
    public int getCasos_Descartados() {
        return Casos_Descartados;
    }
    public void setCasos_Descartados(int Casos_Descartados){
        this.Casos_Descartados = Casos_Descartados;
    }
    
    
      

}
