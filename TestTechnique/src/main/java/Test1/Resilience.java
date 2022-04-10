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
public class Resilience {
    public ArrayList <Question> resi;
    public  String QUEST []={"Si jai un petit désaccord avec un ami ou avec mon conjoint (du genre: «Non, c'est à toi de faire la vaisselle» et pas «Tu m'as trompé(e)?!»), je reste en général énervé(e) pendant des heures, voire plus",
    "Si un automobiliste roule sur le talus pour doubler les autres dans la file d'attente, je hausse les épaules au lieu de m'énerver durablement.",
    "Quand je ressens un profond chagrin, comme de la mort d'un proche, cela perturbe mon fonctionnement pendant plusieurs mois.",
    "Si je commets une erreur au travail et qu'on m'en fait reproche, je suis capable de rebondir et d'y voir une occasion de progresser.",
    "Si j’essaye un nouveau restaurant où le repas est infect et le service détestable, cela gâche toute ma soirée.",
    "Après avoir été coincé(e) dans un embouteillage causé par un accident, j’accélère pour évacuer mon agacement dès que je peux enfin m’échapper, mais je continue à bouillonner intérieurement.",
    "Si mon chauffe-eau tombe en panne, cela n’a grand effet sur mon humeur, car je sais qu’il suffit d’appeler un plombier pour le faire réparer.",
    "Si je rencontre un homme/une femme formidable avec qui j’ai très envie de sortir, un finalement accordée à quelqu’un qui me semble moins qualifié, je rebondis en général assez vite.",
    "Si l’on pense à moi pour une promotion ou une importante récompense professionnelle,finalement accordée à quelqu’un qui me semble moins qualifié, je rebondis en général assez vite.",
    "Lors d’une soirée, au cours d’une conversation avec un passionnant inconnu, si je reste muet(te) lorsqu’il m’interroge à mon sujet, j’ai tendance à me rejouer mentalement tout l’entretien – en imaginant cette fois ce que j’aurais dû dire pendant des heures et des heures, et même des jours entiers.", 
    };
    public Resilience(){
        this.resi=new ArrayList();
            
    }
    public void generate_Resilence(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
        for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && (i==1 | i==3 | i==6 | i==8)){
               q=new Question(QUEST[i],1); }
            else if  (rep.equalsIgnoreCase("faux") && (i==1 | i==3 | i==6 | i==8)){ 
                 q=new Question(QUEST[i],0); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],0);
            }
            else
            { q=new Question(QUEST[i],1);
            }
            resi.add(q);
        }
       
        
    }
    public int Totpoints(){
        
        int s=0 ;
        for (Question q:resi) {
            s=s+q.reponse ;
        }
        return s;
    }   
    public void resultatRes(){
        if (Totpoints()<3 ){
            System.out.println("vous possédez un faible niveau de résilience, et donc que vous êtes lent(e) à récupérer après une épreuve.");
        }
        else if( Totpoints()>=7 ){
            System.out.println("vous êtes rapide à récupérer et tout à fait résilient(e).");
        }
        else
            System.out.println ("Plus votre score est faible, plus vous peinez à vous remettre d’une émotion négative. Tout score inférieur à trois points indique que vous possédez un faible niveau de résilience, et donc que vous êtes lent(e) à récupérer après une épreuve. Si vous avez obtenu plus de sept points, en revanche, vous êtes rapide à récupérer et tout à fait résilient(e).");
    }
            
    
    
}
