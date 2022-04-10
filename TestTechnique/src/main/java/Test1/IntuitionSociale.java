/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;
import java.util.ArrayList;
import java.util.Scanner ;
/**
 *
 * @author az
 */
public class IntuitionSociale {
    public ArrayList <Question> intuition ;
    public  String QUEST []={
     "Quand je parle à des gens, je remarque souvent de subtils indices sociaux concernant leurs émotions – la gêne ou la colère, par exemple – avant qu’ils ne prennent eux-mêmes conscience de ces sentiments.",
     "Je me surprends souvent à noter les expressions faciales et le langage du corps." ,
     "Peu m’importe que je parle aux gens au téléphone ou en face-à-face, puisque voir la personne à qui je parle m’apporte rarement des informations supplémentaires.",
   "J’ai souvent l’impression d’en savoir plus que les gens sur leurs véritables sentiments.",
   "Je suis souvent surpris(e) quand mon interlocuteur est énervé ou contrarié par ce que j’ai dit, sans raison apparente.",
   "Au restaurant, je préfère m’asseoir à côté de la personne avec qui je parle, afin de ne pas voir son visage de face.",
   "Je réagis souvent à l’inconfort ou au désarroi d’autrui sur la base d’une intuition plutôt que d’une discussion explicite.",
   "Quand je suis dans un lieu public et que j’ai du temps à perdre, j’aime observer les gens qui m’entourent.",
   "Je suis mal à l’aise quand quelqu’un que je connais à peine me regarde droit dans les yeux pendant une conversation.",
   "Je peux souvent déterminer si une personne est gênée par quelque chose rien qu’en la regardant."
    };
     public  IntuitionSociale (){
    this.intuition =new ArrayList();
}
     public void generate_intuition(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
        for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && (i==2 | i==4 | i==5 | i==8)){
               q=new Question(QUEST[i],0); }
            else if  (rep.equalsIgnoreCase("faux") && (i==2 | i==4 | i==5 | i==8)){ 
                 q=new Question(QUEST[i],1); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],1);
            }
            else
            { q=new Question(QUEST[i],0);
            }
            intuition.add(q);
        }}
     public int Totpoints(){
        
        int s=0 ;
        for (Question q:intuition) {
            s=s+q.reponse ;
        }
        return s;
    } 
     public void resultatIntuition(){
        if (Totpoints()<3 ){
            System.out.println("vous êtes plutôt socialement perplexe.");}
        else if (Totpoints()>=8 ){
            System.out.println("vous êtes socialement intuitif/ve.");}
        
        else
        System.out.println("Plus votre score est élevé, plus vous identifiez facilement ce que ressentent les autres.");
     }
}
