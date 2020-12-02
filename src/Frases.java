
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Frases extends Canvas{
    Frase f = new Frase();
    
    Timer timer,timer2;
    int i;
    String[] frases = {"Hola mundo","Programación es lo mejor","TAP la mejor materia","POO sirve de mucho","Estructura de Datos","Java es un enguaje","NetBeans es un IDE","Eclipse es un IDE","Python buen lenguaje","SQL para base de datos",
                       "Hilos tercera unidad","Canvas es para graficos","Thread es hilo","Javascript lenguaje","Ingeniería es lo mejor","Google gran empresa","FaceBook red social","Amazon para compras","Netflix ver series","Sillicon Valley",
                       "Developer","Tester","Sistemas Computacionales","BackEnd es bueno","FrontEnd es diseño","FullStack","Base de Datos","18401120 mi No. Control","Juan Diego mi nombre",
                       "Machine Learning","Inteligencia Artificial","Block Chain","Computer Science","Código para crear cosas","StackOverflow sirve de mucho",
                       "Codecademy para aprender","Web Development","Android es lo mejor","Apple de IOS"};
    
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
