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
public class Perspective {
    public ArrayList <Question> Perspect ;
    public  String QUEST []={
        "Quand je suis invité(e) à rencontrer des gens que je ne connais pas, je suis enthousiaste car j’imagine qu’ils pourraient devenir des amis, plutôt que d’y voir une corvée à l’idée que ces gens ne m’intéresseront pas.",
        "Quand j’évalue un collègue, je me focalise sur les détails sur lesquels il doit s’améliorer, plutôt que sur sa performance globalement positive.",
        "Je pense que les dix années à venir seront meilleures pour moi que les dix années écoulées.",
        "Confronté(e) à la possibilité de déménager,j’y vois un effrayant saut dans l’inconnu.",
       " Quand il m’arrive le matin un petit événement inattendu mais positif – par exemple, si j’ai une conversation formidable avec un inconnu –, cette humeur positive se dissipe en quelques minutes.",
       "Quand je suis invité(e) à une fête et que je me sens bien au départ, ce sentiment positif a tendance à durer toute la soirée.",
       "L’impression suscitée par un beau paysage, par un superbe coucher de soleil, se dissipe vite et je m’ennuie facilement.",
       "Quand je me réveille le matin, je pense à une activité agréable que j’ai prévue, et cela me met de bonne humeur pour toute la journée." ,
       "Quand je vais au musée ou au concert, les premières minutes sont vraiment agréables,mais cela ne dure pas.",
       "Les jours où je suis très occupé(e), j’ai souvent le sentiment que je peux enchaîner les activités sans me fatiguer."
       
    };
 public  Perspective (){
    this.Perspect=new ArrayList <Question>();
}
 public void generate_perspect(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
       for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && (i==1 | i==3| i==4 | i==6 | i==8)){
               q=new Question(QUEST[i],0); }
            else if  (rep.equalsIgnoreCase("faux") && (i==1 | i==3 | i==4| i==6 | i==8)){ 
                 q=new Question(QUEST[i],1); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],1);
            }
            else
            { q=new Question(QUEST[i],0);
            } 
          Perspect.add(q);
          
          
        }
 }
 public int Totpoints(){
        
        int s=0 ;
        for (Question q:Perspect) {
            s=s+q.reponse ;
        }
        return s;
    } 
  public void resultatPerspect(){
        if (Totpoints()<3 ){
            System.out.println("vous êtes un(e) «négatif/ve»). Cette dimension concerne aussi bien votre attitude face\n"
                    +"à l’avenir que votre capacité à entretenir le sentiment positif inspiré par un événement passé.\n" +
"Et, comme pour la résilience, votre capacité de perspective sur les événements triviaux permet\n" +
"de prédire ce qu’elle sera sur les événements importants.");
        }
        else if( Totpoints()>=7 ){
    System.out.println("vous êtes un(e) «positif/ve». Cette dimension concerne aussi bien votre attitude face\n"
                    +"à l’avenir que votre capacité à entretenir le sentiment positif inspiré par un événement passé.\n" +
"Et, comme pour la résilience, votre capacité de perspective sur les événements triviaux permet\n" +
"de prédire ce qu’elle sera sur les événements importants.");}
    else 
    System.out.println("Plus votre score est élevé, plus vous avez une perspective positive (score supérieur à sept\n" +
"points : vous êtes un(e) «positif/ve» ; score inférieur à trois points: vous êtes un(e) «négatif/ve»). Cette\n" +
"dimension concerne aussi bien votre attitude fac à l’avenir que votre capacité à entretenir le\n" +
"sentiment positif inspiré par un événement passé. Et, comme pour la résilience, votre capacité de\n" +
"perspective sur les événements triviaux permet de prédire ce qu’elle sera sur les événements importants.");}
}
