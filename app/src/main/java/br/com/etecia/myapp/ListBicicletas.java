package br.com.etecia.myapp;

public class ListBicicletas {
    //Criando os atributos
    private String tituloBike;
    private String descBike;
    private float precoBike;
    private int imgBike;

    //Criando os métodos getter e setter
    public String getTituloBike() {
        return tituloBike;
    }

    public void setTituloBike(String tituloBike) {
        this.tituloBike = tituloBike;
    }

    public String getDescBike() {
        return descBike;
    }

    public void setDescBike(String descBike) {
        this.descBike = descBike;
    }

    public float getPrecoBike() {
        return precoBike;
    }

    public void setPrecoBike(float precoBike) {
        this.precoBike = precoBike;
    }

    public int getImgBike() {
        return imgBike;
    }

    public void setImgBike(int imgBike) {
        this.imgBike = imgBike;
    }
}
