
import java.awt.Color;
import java.awt.Graphics2D;

public class Frase {
    int x;
    int y;
    Color color;
    int desplazamientoX;
    int desplazamientoY;
    
    
    public void pintar(Graphics2D g2, String s){
        int i = (int)(Math.random()*39);
        g2.setColor(new Color((int)(Math.random()*250),(int)(Math.random()*255),(int)(Math.random()*255)));
        g2.drawString(s, x, y);
        
    }
    
    
    public void rebotar(){
        x += desplazamientoX;
        y += desplazamientoY;
        
        if(x <= 0){
            desplazamientoX = 5;
        }
        if(x >= 600){
            desplazamientoX = -5; 
        }
        
        if(y <= 0 || y >= 400){
            desplazamientoY *= -1;
        }
    }
    
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
}
