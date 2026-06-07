package Week1.OOPS;

class OOPSsolution{
    public static void main(String[] args){
        KidUser adi = new KidUser(10, "Kids");
        KidUser anju = new KidUser(18, "Kids");
        KidUser sakshi = new KidUser(10, "Fiction");
        KidUser ayu = new KidUser(18, "Fiction");
        adi.registerAccount();
        anju.registerAccount();
        sakshi.registerAccount();
        ayu.registerAccount();
        adi.requestBook();
        anju.requestBook();
        sakshi.requestBook();
        ayu.requestBook();

        AdultUser a = new AdultUser(5, "Fiction");
        AdultUser b = new AdultUser(23, "Fiction");
        AdultUser c = new AdultUser(5, "Kids");
        AdultUser d = new AdultUser(23, "Kids");
        a.registerAccount();
        b.registerAccount();
        c.registerAccount();
        d.registerAccount();
        a.requestBook();
        b.requestBook();
        c.requestBook();
        d.requestBook();
        
    }
}


