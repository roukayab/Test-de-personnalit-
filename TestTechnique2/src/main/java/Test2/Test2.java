/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test2;
import java.util.Scanner;
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author az
 */

class Question {
    public static void main (String args[]) throws IOException{
     String QUEST []={"j'aime pratiquer des activitées variées et nouvelles","j'ai tendance à faire confiances aux autres","Je suis quelqu’un de prudent(e) et j’ai les pieds sur terre.",
        "J’aide les autres quand ils ont besoin de moi.","J’ai tendance à être anxieux(se), tendu(e).","Je prends du plaisir à me laisser aller à des rêveries.",
        "J’aime faire la fête avec beaucoup de gens autour de moi.","Je suis honnête et ne pourrais pas tromper les autres.","Je n’ai pas une bonne opinion de moi-même.",
        "Je suis fidèle aux engagements que je prends.","Je ressens parfois des frissons lorsque j’écoute de la musique.","Je m’inquiète et m’angoisse très facilement, même pour des choses sans importance.",
        "Je suis de nature généreuse.","J’aime plaisanter et m’amuser avec les autres.","Je suis quelqu’un de méthodique et de très organisé.",
        "J’ai tendance à me sentir inférieur(e) aux autres.","J’ai tendance à pardonner et ne suis pas rancunier(ère).","J’accorde une grande importance à mes sentiments et à ceux des autres.",
        "Je n’agis jamais sans réfléchir aux conséquences.","Je me cultive en lisant, en regardant des émissions scientifiques ou culturelles à la télévision.","Je fais généralement les choses avec enthousiasme et excitation.",
        "Je me mets facilement en colère.","J’aime faire plaisir à ma famille et mes amis.","J’ai beaucoup d’imagination.",
        "J’aime lorsque le rythme de ma vie est intense et rapide.","Je préfère valoriser les autres que moi-même.","Je m’investis beaucoup dans tout ce que j’entreprends.",
        "Je me vexe souvent.","J’aime me tenir informé(e) et savoir ce qui se passe dans le monde.","Je suis poli(e) et respectueux(se) quand je parle aux autres.",
        "J’aime me trouver au cœur de l’action.","Je suis impulsif(ve) et contrôle mal mes émotions et mes sentiments.","Je travaille dur jusqu’à ce que j’obtienne ce que je souhaite.",
        "Je prends du plaisir à réfléchir sur de grandes questions existentielles portant sur l’homme, la nature, l’Univers.","Je suis très sociable et me fais facilement des amis.","Je me dispute facilement avec les autres pour des choses sans importance.",
        "Je suis souvent de mauvaise humeur.","Je suis soucieux(se) de respecter mes principes moraux.","J’aimerais beaucoup voyager et découvrir les coutumes,les habitudes de vie des autres pays.",
        "Je pense que la plupart des personnes sont honnêtes et gentilles.","Je suis respectueux(se) des règles et des interdits.","Je dis aux autres ce que je pense.",
         "Je cherche à rompre la monotonie et les habitudes.","Je fais les choses avec soin et vérifie que mon travail est bien fait.","Je me sens souvent triste.",
         "Je partage mes affaires avec mes amis.","Je parle facilement, même avec des inconnus.","J’aime connaître et apprendre des choses nouvelles.",
         "Je recherche le meilleur et la perfection dans tout ce que je fais.","Je suis une personne optimiste et généralement de bonne humeur."
        };
     
        int rep[]=new int[50];
        int sextra=0, sagr=0 , scarac=0, snevro=0 ,souv=0 ;
        String resextra, resagr ,rescarac ,resnevro ,resouv ;        
        int i;
        int j;
        String reponse;
        System.out.println("Pour chacune des affirmations suivantes, choisissez la réponse qui vous ressemble le plus :Tout à fait vrai ,Plutôt vrai,Plutôt faux,Tout à fait faux");
        for (i=0;i<50;i++) {
            System.out.println(i +"-"+QUEST[i]);
            BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));;
            reponse=entree.readLine();
            
            if (reponse.equalsIgnoreCase("Tout à fait vrai")){
                rep[i]=3;
            }
            else if (reponse.equalsIgnoreCase("Plutôt vrai")){
                rep[i]=2;
            }
            else if (reponse.equalsIgnoreCase("Plutôt faux")){
                rep[i]=1;
            }
            else if (reponse.equalsIgnoreCase("Tout à fait faux")){
                rep[i]=0;
            }
         }
        for (j=0;j<50;j++){
            System.out.println(rep[j]+",");
        }
        for (j=0;j<50;j++){
            if(j==0|j==6|j==13|j==20|j==24|j==30|j==34|j==41|j==46|j==49){
                sextra=sextra+rep[j];
            }
            else if(j==1|j==3|j==7|j==12|j==16|j==22|j==25|j==29|j==39|j==45){
                sagr=sagr+rep[j];
            }
            else if(j==2|j==9|j==14|j==18|j==26|j==32|j==37|j==40|j==43|j==48){
                scarac=scarac+rep[j];              
            }
            else if(j==4|j==8|j==11|j==15|j==21|j==27|j==31|j==35|j==36|j==44){
                snevro=snevro+rep[j];
                
            }
            else if(j==5|j==10|j==17|j==19|j==23|j==28|j==33|j==38|j==42|j==47){
                souv=souv+rep[j];
             }}
      
            
                
     
        System.out.println(sextra+"\n");
        System.out.println(sagr+"\n");
        System.out.println(scarac+"\n");
        System.out.println(snevro+"\n");
        System.out.println(souv+"\n");
        
        if (sextra<15){
            resextra="vous êtes introverti(e) et peu expansif(ve).Vous avez tendance à être calme, modéré(e) et peu impliqué(e) dans la vie des autres. Plutôt timide,\n" +
"effacé(e) et silencieux(se) en groupe, vous préférez le plus souvent vous consacrer à des activités solitaires et être seul(e)."; }
        else {
    resextra="vous êtes plein(e) d’énergie et éprouvez des émotions positives. Vous avez tendance à être loquace, actif(ve), voire exubérant(e). Vous êtes très à l’aise en groupe et puisez votre\n" + 
"dynamisme dans l’interaction avec les autres. Vous parlez et vous affirmez facilement, et attirez l’attention sur vous. Vous vous montrez enthousiaste pour des projets excitants.";}
        if (sagr<15){
           resagr="vous avez tendance à être sceptique et à douter des intentions d’autrui. Vous préférez entrer en compétition plutôt que de coopérer, et défendez davantage\n" +
"vos intérêts que ceux du groupe. Vous êtes en général distant(e) et peu sensible au bien-être d’autrui, ce qui donne parfois l’impression que vous êtes centré(e) sur vous.";
        }
        else {            
           resagr="vous êtes prévenant(e), serviable et disposé(e) à trouver un terrain d’entente en cas de conflit. Honnête et droit(e), vous êtes digne de confiance et foncièrement\n" +
"généreux(se) et altruiste. Sympathique, respectueux(se) et amical(e), vous vous entendez bien avec les autres. Vous acceptez les autres dans leurs différences, sans critique. Sensible, indulgent(e) de\n" +
"nature, vous êtes doué(e) de compassion et pensez que les autres le sont également.";}
        if(scarac<15){
           rescarac="vous éprouvez beaucoup de plaisir à pratiquer des activités de courte durée, et avez des difficultés à rester concentré(e) sur vos objectifs. Impulsif(ve),\n" +
"vous êtes perçu(e) comme une personne amusante et boute-en-train en société. Vous ne savez pas toujours respecter les limites, ce qui peut vous rendre irréfléchi(e), dispersé(e), voire imprudent(e).\n" +
"Vous ne pensez parfois pas aux conséquences de vos paroles, de vos actes, ce qui peut entraver votre réussite, notamment au travail.";
        }
        else {
            rescarac="vous êtes prudent(e), réfléchi(e), fiable et savez éviter les difficultés. Vous atteignez facilement vos objectifs grâce à vos capacités d’anticipation et d’organisation. Vous êtes\n" +
"perspicace et déterminé(e). Parfois, vous êtes très perfectionniste, soucieux(se) de l’ordre dans vos tâches et au travail.";}
        if(snevro<15){
            resnevro="vous êtes émotionnellement stable. Vous êtes en général calme, d’humeur égale et détendu(e). Vous affrontez les situations stressantes sans vous\n" +
"déstabiliser, sans inquiétude et avec confiance. Vous prenez le temps d’interpréter les événements avec discernement et agissez de façon raisonnée, non impulsive. \n" +
"Vous avez tendance à éprouver peu d’émotions négatives.";}
        else {
           resnevro="vous éprouvez souvent de l’anxiété, de la colère ou de la peur. Vous êtes très réactif(ve) sur le plan émotionnel, voire instable, avec une humeur changeante et négative. Vous avez\n" +
"tendance à interpréter des situations ordinaires comme menaçantes, et des événements mineurs comme insurmontables. Vous êtes souvent tendu(e) et avez en général beaucoup de difficultés à gérer\n" +
"le stress de la vie quotidienne. Vos émotions peuvent entraver votre capacité à raisonner et votre lucidité, d’où parfois des prises de décisions inadaptées. Vous avez aussi tendance à être triste et déprimé(e).";}
       if (souv<15){
           resouv="vous avez tendance à être terre à terre,conventionnel(le) et fuyez l’originalité, l’extravagance. Vous écoutez assez peu vos sentiments et\n" +
"émotions, vous êtes plutôt centré(e) sur vos objectifs. Vous privilégiez les aspects pratiques et les choses qui ont déjà fait leurs preuves. Vous avez peu de centres d’intérêt et portez assez peu d’attention\n" +
"aux activités artistiques, esthétiques, scientifiques et métaphysiques. Vous appréciez davantage un environnement familier et êtes routinier(ère). Vos habitudes vous rassurent, alors que le changement et la nouveauté peuvent vous inquiéter." ;
           
       }   
       else{
           resouv="vous êtes curieux(se), inventif(ve) et imaginatif(ve). Vous appréciez l’art, les activités diversifiées et non conventionnelles. Vous êtes davantage attiré(e) par la complexité, le sens\n" +
"caché des événements, l’ambiguïté, que par les évidences. Vous aimez jouer avec les idées, avoir des discussions profondes et existentielles avec vos amis. La nouveauté, le changement ainsi que la différence\n" +
"chez autrui guident vos intérêts et vos actions. Vous écoutez vos sentiments et avez tendance à penser et à agir de façon personnelle, voire non conformiste (vous êtes indépendant(e) dans vos jugements).";
        
       }
       
       System.out.println("\n"+resextra+"\n \n"+resagr+"\n \n"+rescarac+"\n \n"+resnevro+"\n \n"+resouv );

}}
