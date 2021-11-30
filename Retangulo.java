package areadoretangulo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author padov
 */
public class Retangulo {
    int x,y;
    int x1, y1;
    
    public void setX(int X){
        this.x=X;
    }
    public void setY(int Y){
        this.y=Y;
    }
    public void setX1(int X1){
        this.x1=X1;
    }
    public void setY1(int Y1){
        this.y1=Y1;
    }
    public int getSomaA(){
        if(x<0 || y<0){
            return 0;
        }
        int A = x*y;
        return A;
    }
    public int getSomaA1(){
        if(x1<0 || y1<0){
            return 0;
        }
        int A1 = x1*y1;
        return A1;
    }
    public int getDiferença(){
        int A = x*y;
        int A1 = x1*y1;
        int Dife = Math.abs(A-A1);
        return Dife;
    }
    
}
