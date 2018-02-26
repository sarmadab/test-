public class Hund{

String navn = "";
String farve = "";
int alder = 0;
double vaegt = 0.0;

//metode til udskrift af hunde 
public void hundeInfo(){
   System.out.println("Navn:\t\t" + navn);
   System.out.println("Farve:\t" + farve);
   System.out.println("Alder:\t" + alder + " år");
   System.out.println("Vaegt:\t" + vaegt + " kg\n");

}
// denne metode bruger vi ikke, men den er sej 

public String hundeInfoToString(){
   String hundeText = "";
   hundeText = hundeText + "Navn:\t\t" + navn + "\n"; 
   hundeText = hundeText + "Farve:\t" + farve + "\n"; 
   hundeText = hundeText + "Alder:\t" + alder + "år\n"; 
   hundeText = hundeText + "Veagt:\t" + vaegt + "kg\n"; 
   return hundeText;


}
} 