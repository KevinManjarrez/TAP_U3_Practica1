
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Frases extends Canvas{
    Frase f = new Frase();
    
    Timer timer,timer2;
    int i;
    String[] frases = 
    {"Nuestras vidas se definen por las oportunidades, incluso las que perdemos",
     "Lo que importa verdaderamente en la vida no son los objetivos que nos marcamos,\n"
      + " sino los caminos que seguimos para lograrlo",
     "El hombre que más ha vivido no es aquel que más años ha cumplido,\n"
     + "sino aquel que más ha experimentado la vida",
     "Si lo puedes soñar, lo puedes hacer",
     "Somos lo que hacemos de forma repetida. Por tanto, la excelencia no es un acto, sino un hábito",
     "Lo imposible es el fantasma de los tímidos y el refugio de los cobardes",
     "Comienza a verte a como un alma con un cuerpo en lugar de un cuerpo con un alma",
     "Vale más actuar exponiéndose a arrepentirse de ello, que arrepentirse de no haber hecho nada",
     "El camino que nos toca recorrer está lleno de sorpresas. \n"
      + "Nunca vas a estar preparado para las que te toquen a ti,\n "
      + "sean dichosas o sombrías, pues eso es parte de adquirir experiencia.\n "
      + "Y descubrir cuán gratas o desafortunadas son las que te esperan, es algo nunca podrás eva",
     "Una emoción no causa dolor. La resistencia o supresión de una emoción causa dolor",        
     "La felicidad no es algo que pospones para el futuro, es algo que diseñas para el presente",
     "Todos quieren la paz, y para asegurarla, fabrican más armas que nunca",
     "Todo el mundo piensa en cambiar el mundo, pero nadie piensa en cambiarse a sí mismo",
     "Si exagerásemos nuestras alegrías, como hacemos con nuestras penas, nuestros problemas perderían importancia",
     "El amigo ha de ser como el dinero, que antes de necesitarle, se sabe el valor que tiene",
     "Tus acciones serán el reflejo de la manera que tienes de ver la vida y las que te van definir ante\n"
      + " los demás. No las malgastes en cosas y actitudes que no valen la pena, solo tú puedes decidir\n"
      + " la forma en la que quieres que te recuerden, porque no estarás en este mundo para siempre",
     "Quién puede decir cuánto ama, pequeño amor siente",
     " El amor es lo que mueve al mundo aunque a veces parezca lo contrario.\n"
     + " A las personas no nos haría mal recordar esto de vez en cuando",
     "La ciencia es el gran antídoto contra el veneno del entusiasmo y la superstición",
     "Nunca terminas de conocer a la gente. Tus amigos, te familia y hasta tú mismo,\n "
      + "pueden ocultar sorpresas que en la vida te podrías haber imaginado, tanto buenas como malas",          
     "Todos tenemos el mismo destino, en esencia no hay manera de diferenciarnos si nacemos\n"
      + " para llorar y reír. Recuérdalo, todos tenemos los días contados,\n "
      + "vive cada uno de tus días como si fueran el regalo más grande, porque nadie\n "
      + "puede asegurarte el mañana",
     "Todos deseamos llegar a viejos; y todos negamos que hemos llegado",
     "Mientras vivas vas a encontrarte con todo tipo de personas, tanto buenas como malas.\n"
      + "Es imposible adivinar las intenciones que oculta alguien detrás de su comportamiento,\n"
      + " pero descubrirlo es la tarea más interesante y peligrosa con la que te puedes llegar a topar",
     "La decepción después de un amor fallido, puede llegar a oprimir tu corazón hasta\n"
     + " el punto de no dejarte respirar. Pero nadie se ha muerto de amor",
     "Si quieres cambiar las frutas, primero tendrás que cambiar las raíces.\n"
     + "Si quieres cambiar lo visible, primero debes cambiar lo invisible",
     "No llores por la gente que se ha ido, enfócate en quienes se encuentran a tu lado\n"
     + " en el presente y quédate con los buenas recuerdos de los que se marcharon",
     "No hay deber que descuidemos tanto como el deber de ser felices",
     "¿Quieres ser rico? Pues no te afanes es aumentar tus bienes, sino en disminuir tu codicia",
     "No debes enfocarte en el dolor que puedes sentir si alguien te ha falla.\n"
      + "Si no eres capaz de perdonar una equivocación, entiérrala y sigue adelante",            
     "No dejes de tener fe en los demás, por una o varias personas que te hayan decepcionado",
     " ¡Ojalá vivas todos los días de tu vida!",
     "Amar es la aventura más grande en la que te puedes embarcar. Porque te puede hacer volar más\n"
      + " alto de lo que jamás imaginarte y también ponerte los pies de la tierra",
     "Es difícil confiar después de haber recibido un golpe bajo, pero allá afuera hay gente\n"
      + " de buen corazón que puede compensar tus desilusiones. No hagas a un lado la oportunidad de conocerla",
     "Un corazón alegre vive más tiempo",
     "Solos podemos hacer poco, juntos podemos hacer mucho", 
     "La medida de la salud no es estar adaptado a una sociedad profundamente enferma",
     "Qué maravilloso es que nadie necesita un solo momento antes de comenzar a mejorar el mundo",
     "Siempre son las personas a las que más amamos, las que nos pueden hacer mayor daño",
     "La vida es un 10% lo que me ocurre y 90% cómo reacciono a ello"};
    
    public Frases(){
     
        
        
        timer = new Timer(200, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
                f.rebotar();
                repaint();
                
            
                timer2.start();
             }   
        });
        
        timer2 = new Timer(20000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                i = (int)(Math.random()*39);
                f.rebotar();
                repaint();
            }
        });
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        Graphics2D g2 = (Graphics2D)g;
        
        f.pintar(g2,frases[i]);
    }
    
        
        
        
    
    
    
}
