package Model;

public class Ingredient {


    String name;
    Nutrient[] valori_nut;
    String category;

    //METHODS


    public Ingredient() {};
    public Ingredient(String n, Nutrient[] vn,String c) {
        name=n;
        valori_nut=vn;
        category=c;
    };
    //Constructor fara valori nutritionale:
    public Ingredient(String n, String c) {
        name=n;

        category=c;
    };
    //Getters
    public String getName() {
        return name;
    }

    public Nutrient[] getValori_nut() {
        return valori_nut;
    }

    public String getCategory() {
        return category;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setValori_nut(Nutrient[] valori_nut) {
        this.valori_nut = valori_nut;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //to string
    public String toString(){
        //Vectrorul de valori nutrinale se transforma ntr-un singur string : vectorstring
        String vectorstring = "";
        for (Nutrient i : valori_nut){
            vectorstring=vectorstring+" "+i.toString();
        }
        return "Name: "+name+" Ctaegory "+category+vectorstring;
    };
}
