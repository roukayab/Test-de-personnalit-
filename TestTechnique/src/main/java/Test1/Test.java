/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;
import Test1.Resilience;
import Test1.Attention;
import Test1.ConscienceDeSoi;
import Test1.IntuitionSociale;
import Test1.Perspective;
import Test1.SensibilitéAuContexte;
/**
 *
 * @author az
 */
public class Test {
  public static void main(String[] args){
    System.out.println("Les questionnaires ci-dessous évaluent les six dimensions de votre profil émotionnel. Pour de chaque affirmation, reponder « vrai » ou « faux » selon qu’elle vous correspond ou pas. Répondez le plus rapidement possible, sans chercher à trop réfléchir : c’est ainsi que vous obtiendrez les résultats les plus exacts.");
    Resilience Res  = new Resilience();
    Res.generate_Resilence();
    Res.Totpoints();
    System.out.println("\n");
    Res.resultatRes();
    System.out.println("\n");
    
    Perspective per =new Perspective();
    per.generate_perspect();
    per.Totpoints();
    System.out.println("\n");
    per.resultatPerspect();
    System.out.println("\n");
    
    IntuitionSociale intui = new IntuitionSociale() ;
    intui.generate_intuition();
    intui.Totpoints();
    System.out.println("\n");
    intui.resultatIntuition();
    System.out.println("\n");
    
    ConscienceDeSoi cons =new ConscienceDeSoi();
    cons.generate_conscience();
    cons.Totpoints();
    System.out.println("\n");
    cons.resultatConscience();
    
    SensibilitéAuContexte sen = new SensibilitéAuContexte();
    sen.generate_sensibilité();
    sen.Totpoints();
    System.out.println("\n");
    sen.resultatConscience();
    System.out.println("\n");
    
    Attention att =new Attention();
    att.generate_sensibilité();
    att.Totpoints();
    System.out.println("\n");
    att.resultatConscience();
  
  
  }  
}
