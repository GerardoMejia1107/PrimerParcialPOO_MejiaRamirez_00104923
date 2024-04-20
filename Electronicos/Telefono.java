package Electronicos;



public class Telefono extends Electronico {
    private String tipo;
    

    //Constructor 
    public Telefono(String tipo){
        this.tipo = tipo;
    }

   
  
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String generateID(){
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        String[] ID_preview = new String[2];

        ID_preview[0] = "T";

        for(int i = 1; i < ID_preview.length; i++){
            ID_preview[i]=numbers[this.indexRandom(numbers.length)];
        }

        StringBuilder builder = new StringBuilder();
        for(int i= 0; i < ID_preview.length; i++){
            builder.append(ID_preview[i]);
        }

        return builder.toString();
    }
}
