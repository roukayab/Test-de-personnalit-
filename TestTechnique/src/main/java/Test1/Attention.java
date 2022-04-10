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
public class Attention {
    public ArrayList <Question> attention ;
    public  String QUEST []={ 
        "Je suis capable de me concentrer dans un environnement bruyant.",
        "Quand je suis dans une situation où il se passe beaucoup de choses et où les stimulations sensorielles sont nombreuses, comme lors d’une fête ou dans la foule d’un aéroport, j’arrive à ne pas me laisser distraire par ce qui se passe devant moi.",
        "Si je décide de concentrer mon attention sur une tâche particulière, j’en suis en général capable.",
        "Si je suis chez moi et que je tente de travailler,le bruit de la télévision ou des gens qui parlent me perturbe énormément.",
        "Si je reste immobile ne serait-ce que quelques instants, un flux de pensées me vient à l’esprit et je me mets à suivre plusieurs fils, souvent sans savoir comment chacun a commencé.",
        "Si je suis perturbé(e) par un événement imprévu,je suis capable de reconcentrer mon attention sur ce que je faisais avant d’être interrompu(e).",
        "À des moments de calme relatif, quand je suis assis(e) dans un train, dans un autobus, ou quand je fais la queue dans un magasin, je remarque beaucoup de choses autour de moi.",
        "Quand un projet important exige toute mon attention, j’essaye de m’installer dans un endroit le plus tranquille possible.",
        "Mon attention a tendance à se laisser capter par les stimuli et événements de mon environnement, et j’ai du mal à me reconcentrer quand cela se produit.",
        "Je n’ai aucun mal à mener une discussion personnelle au milieu d’une foule, lors d’un cocktail ou dans une grande pièce ; dans un tel environnement, je peux faire abstraction de tous les autres, même si, en me concentrant, j’arrive à distinguer ce qu’ils disent."
    };
        
 public  Attention (){
    this.attention =new ArrayList();
}
        
 
 
 public void generate_sensibilité(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
        for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && ( i==3 | i==4| i==7 | i==8)){
               q=new Question(QUEST[i],0); }
            else if  (rep.equalsIgnoreCase("faux") && ( i==3 | i==4| i==7 | i==8)){ 
                 q=new Question(QUEST[i],1); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],1);
            }
            else
            { q=new Question(QUEST[i],0);
            }
            attention.add(q);
        }}
 
 
 
 
 public int Totpoints(){
        
        int s=0 ;
        for (Question q:attention) {
            s=s+q.reponse ;
        }
        return s;
    } 
 
 
 
   public void resultatConscience(){
        if (Totpoints()<=3 ){
            
            System.out.println("vous avez tendance à être peu concentré(e).");}
        else if (Totpoints()>=8 ){
            System.out.println("vous avez un bon niveau globald’attention") ; }
        else {
            System.out.println("Plus votre score est élevé, plus vous savez vous concentrer.");
        }
   }
                 
 
 
 
 
          
    
}
