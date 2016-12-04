/**
 * Created by Fatmi on 02/12/2016.
 */
public class Rectangle implements Forme {
    private double longeur;
    private double largeur;
    public Rectangle(double largeur , double longeur){
        this.largeur=largeur;
        this.longeur=longeur;
    }

    public double getLongeur(){
        return longeur;
    }
    public double getLargeur(){
        return largeur;
    }
    public double surface(){
        return longeur*largeur;
    }
    public double perimetre(){
        return(lobgeur+largeur)*2;
    }
    public String toString(){
        return "la largeur est " + largeur + "la longeur est " + longeur + "la surface est " + surface() + "le perimetre est " + perimetre();
    }
    public Object  clone(){
        return null ;
    }

}
