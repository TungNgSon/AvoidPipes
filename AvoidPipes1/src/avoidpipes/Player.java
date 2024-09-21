/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avoidpipes;

/**
 *
 * @author Moment
 */
public class Player {
    public int x,y,diameter;
    public int speedY=0;
    public int score=0;
    public Player(int x,int y,int diameter)
    {
        this.x=x;
        this.y=y;
        this.diameter=diameter;
    }
}
