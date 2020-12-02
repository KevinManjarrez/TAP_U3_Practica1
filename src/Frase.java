
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Frase {
    int x;
    int y;
    Color color;
    int desplazamientoX;
    int desplazamientoY;
    
    
    
    public Frase(){
        x = (int)(Math.random()*600+10);
        y = (int)(Math.random()*400+10);
        
        
        float moneda = (float) (Math.random()*10+1);
        if(moneda > 5){
            desplazamientoX = 5;
        }else{
            desplazamientoX = -5;
        }
        
        moneda = (float) (Math.random()*10+1);
        if(moneda > 5){
            desplazamientoY = 5;
        }else{
            desplazamientoY = -5;
        }
    }
    
    public void pintar(Graphics2D g2, String s){
        int i = (int)(Math.random()*39);
        g2.setColor(new Color((int)(Math.random()*250),(int)(Math.random()*255),(int)(Math.random()*255)));
        g2.drawString(s, x, y);
        
    }
    
    
    public void rebotar(){
        //1 respecto a X  2 margenes  0 izq   800 der
        //2 respecto a Y  2 margenes  0 arriba  600 abajo
        
        //desplazamientoX valga NEGATIVO cuando x toque 800 y POSITIVO cuando llegue a 0
        //desplazamientoY valga NEGATIVO cuando y toque 800 y POSITIVO cuando llegue a 0
        
        x += desplazamientoX;
        y += desplazamientoY;
        
        //analisis de rebote para x
        if(x <= 0){
            desplazamientoX = 5;
        }
        if(x >= 600){
            desplazamientoX = -5; 
        }
        
        //analisis de rebote para y
        if(y <= 0 || y >= 400){
            desplazamientoY *= -1;
        }
    }
}
