/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test1;
import java.util.ArrayList;
import java.util.Scanner ;
/**
/**
 *
 * @author az
 */
public class ConscienceDeSoi {
    public ArrayList <Question> conscience ;
    public  String QUEST []={ 
        "Souvent, quand on me demande pourquoi je suis triste ou en colère, je réponds (ou je pense) : « Mais pas du tout ! »",
        "Quand mes proches me demandent pourquoi j’ai traité quelqu’un de façon brusque ou méchante, je nie souvent m’être conduit(e) ainsi.",
        "Souvent – plusieurs fois par mois –, je m’aperçois que mon cœur bat très vite ou très fort, et je ne sais absolument pas pourquoi.",
        "Quand j’observe quelqu’un qui souffre, je ressens sa douleur en moi, sur les plans physique et émotionnel.",
        "En général, je sais de façon certaine ce que je ressens et je peux traduire mes émotions en mots.",
        "Parfois, je remarque en moi des douleurs sans savoir d’où elles viennent.",
        "J’aime passer du temps à ne rien faire, détendu(e), simplement pour ressentir ce qui se passe en moi." ,
        "Je crois que j’habite bien mon corps et je m’y sens chez moi, à l’aise.",
        "Je suis fortement orienté(e) vers le monde extérieur et je remarque rarement ce qui se passe dans mon corps.",
        " Quand je fais de l’exercice, je suis très sensible aux changements que cela produit dans mon corps."
    };
       public  ConscienceDeSoi (){
    this.conscience =new ArrayList();
}
       public void generate_conscience(){
        int i ;
        Question q;
        System.out.println("repondre par vrai ou faux ");
        for (i=0;i<10;i++) {
            System.out.println(QUEST[i]);
            Scanner s= new Scanner(System.in);
            String rep= s.next();
            if (rep.equalsIgnoreCase("vrai") && (i==0 | i==1 | i==2| i==5 | i==8)){
               q=new Question(QUEST[i],0); }
            else if  (rep.equalsIgnoreCase("faux") && (i==0 | i==1 | i==2| i==5 | i==8)){ 
                 q=new Question(QUEST[i],1); 
            }
            else if (rep.equalsIgnoreCase("vrai")){
               q=new Question(QUEST[i],1);
            }
            else
            { q=new Question(QUEST[i],0);
            }
            conscience.add(q);
        }}
       
       
         public int Totpoints(){
        
        int s=0 ;
        for (Question q:conscience) {
            s=s+q.reponse ;
        }
        return s;
    } 
         
         
         public void resultatConscience(){
        if (Totpoints()<3 ){
            
            System.out.println("vous êtes opaque à vous-même");}
        else if (Totpoints()>=8 ){
            System.out.println("vous êtes conscient(e) de vous-même");}
        else
        {System.out.println("Plus votre score est élevé, plus vous êtes conscient(e) de vos propres sensations et émotions") ;}
        System.out.println("Vous pouvez aussi effectuer un exercice simple avec un partenaire pour évaluer cette dimension.Quatre fois de suite, demandez-lui de prendre\n" +
"votre pouls pendant trente secondes. En parallèle,concentrez-vous sur vos sensations corporelles internes, et efforcez-vous (sans toucher votre\n" +
"poignet ni aucune autre partie de votre corps) de sentir votre pulsation cardiaque et de compter les battements. Comparez vos résultats aux siens. Plus\n" +
"ils sont proches, plus votre conscience de vous-même est aiguisée !");
         }
            
}
