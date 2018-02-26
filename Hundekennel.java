public class Hundekennel{

public static void main(String[] hundeparametre){
    //lav et par hunde
    Hund hund1 = new Hund();
    Hund hund2 = new Hund();
    
    
    //sæt attributer for hunde
    hund1.navn = "Pluto";
    hund1.alder = 10;
    hund1.vaegt = 25.2;
    hund1.farve = "brun";

    hund2.navn = "Jerry";
    hund2.alder = 2;
    hund2.vaegt = 3.0;
    hund2.farve = "grå";
    
    //udskriv hund1 og hund2 
    hund1.hundeInfo();
    hund2.hundeInfo();
    
    System.out.println(hund1.hundeInfoToString());

    /*
    System.out.println("Navn: " + hund1.navn);
    System.out.println("Alder: " + hund1.alder);
    System.out.println("Vaegt: " + hund1.vaegt);
    System.out.println("Farve: " + hund1.farve);
    
    System.out.println("Navn: " + hund2.navn);
    System.out.println("Alder: " + hund2.alder);
    System.out.println("Vaegt: " + hund2.vaegt);
    System.out.println("Farve: " + hund2.farve);
    */
}
}