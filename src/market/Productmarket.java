package market;

public class Productmarket {

    String ID;
    String Name;
    double Quantity;
    double UnPrice;
   
   
    public Productmarket() {
        ID = "1234";
        Name = "NO product";
        Quantity = 0;
        UnPrice = 0;
    }

    public Productmarket(String ID, String Name, double Quantity, double UnPrice ) {

        this.ID = ID;
        this.Name = Name;
        this.Quantity = Quantity;
        this.UnPrice = UnPrice;
        
    }
/*
    double QuafStore(double Qu) {

        
     this.Quantity = this.Quantity - Qu;

        return this.Quantity;
    }

    double GetQuantity() {
        return Quantity;
    }
*/
}
