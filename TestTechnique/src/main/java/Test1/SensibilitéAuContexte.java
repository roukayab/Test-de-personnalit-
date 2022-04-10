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
public class SensibilitéAuContexte {
    public ArrayList <Question> sensibilité ;
    public  String QUEST []={ 
        "On m’a déjà dit que j’étais en général sensible aux sentiments d’autrui.",
        "On m’a parfois dit que je m’étais conduit(e) de manière socialement inadaptée,ce qui m’a surpris(e).",
        "Il m’est arrivé de connaître un échec professionnel ou de me disputer avec un ami parce que je me montrais trop cordial(e) avec un supérieur ou trop jovial(e) avec un ami en détresse.",
        "Quand je parle aux gens, ils reculent parfois pour mettre de la distance entre nous.",
        "Je me surprends souvent à me censurer parce que je sens que ce que j’allais dire aurait été malvenu étant donné la situation (par exemple, avant de répondre à la question : « Mon chéri, tu me trouves grosse dans ce pantalon ? »).",
        "Quand je suis dans un lieu public comme un restaurant, je prends bien soin de parler moins fort.",
        "En public, on me rappelle souvent de ne pas mentionner le nom de gens qui pourraient être présents.",
        "Quand je suis déjà venu(e) dans un endroit donné, je m’en souviens presque toujours, même si c’est une autoroute par laquelle je suis passé(e) bien des années auparavant.",
        "Quand quelqu’un a un comportement déplacé (trop désinvolte au travail,par exemple), je le remarque toujours.",
        "Mes proches me disent que je me conduis toujours très bien avec les inconnus et dans les situations peu familières."
    
    };
         public  SensibilitéAuContexte (){
    this.sensibilité =new ArrayList();
}
         
         
         public void generate_sensibilité(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
        for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && ( i==1 | i==2| i==3 | i==6)){
               q=new Question(QUEST[i],0); }
            else if  (rep.equalsIgnoreCase("faux") && ( i==1 | i==2| i==3 | i==6)){ 
                 q=new Question(QUEST[i],1); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],1);
            }
            else
            { q=new Question(QUEST[i],0);
            }
            sensibilité.add(q);
        }}
         
         
         
           public int Totpoints(){
        
        int s=0 ;
        for (Question q:sensibilité) {
            s=s+q.reponse ;
        }
        return s;
    } 
           
           
           
           public void resultatConscience(){
        if (Totpoints()<3 ){
            
            System.out.println("vous vous situez parmi les personnes déconnectées du contexte,");}
            else if (Totpoints()>=8 ){
            System.out.println("vous situez parmi les personnes très connecté(e).");}
            else 
                System.out.println("Plus votre score est élevé, plus vous réagissez de façon appropriée à l’environnement et à la situation.");}
           
           
           
           
           
}
