/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avoidpipes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ControlWindow extends JPanel implements ActionListener, KeyListener
{
    public static final int Width=500;
    public static final int Height=600;
    private Timer timer=new Timer(20,this);
    private Player player=new Player(80,Height/2-15,30);
    private boolean gameOver=false;
    private Pipes pipes=new Pipes();
    private Font font=new Font("Times New Roman",Font.BOLD,30);
    public ControlWindow()
    {
        this.setFocusable(true);
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(Width,Height));
        this.addKeyListener(this);
        timer.start();
    }
    @Override public void paintComponent(Graphics g)
    {
         super.paintComponent(g);
         //Background
         this.setBackground(Color.blue);
         //Player(Oval)
         g.setColor(Color.yellow);
         g.fillOval(player.x, player.y, player.diameter, player.diameter);
         
         //UpPipes
         g.setColor(Color.green);
         for(int i=0;i<pipes.numPipes;i++)
         {
             g.fillRect(pipes.upX[i], pipes.upY[i], pipes.width, pipes.heightUp[i]);
         }
         //DownPipes
         for(int i=0;i<pipes.numPipes;i++)
         {
             g.fillRect(pipes.downX[i], pipes.downY[i], pipes.width, pipes.heightDown[i]);
         }
         //Score
         g.setColor(Color.yellow);
         g.setFont(font);
         g.drawString("Score : "+player.score, 5, 40);
         if(gameOver==true)
         {
             g.setColor(Color.red);
             g.setFont(font);
             g.drawString("GAME OVER!", Width/2 -90, Height/2);
         }
         g.dispose();
    }
    @Override public void actionPerformed(ActionEvent e)
    {
        
        if(gameOver==false)
        {
        player.score+=1;
        player.speedY++;
        player.y+=player.speedY;
        for(int i=0;i<pipes.numPipes;i++)
        {
            pipes.upX[i]-=pipes.speedX;
            pipes.downX[i]-=pipes.speedX;   
        }
        for(int i=0;i<pipes.numPipes;i++)
        {   Rectangle pRect=new Rectangle(player.x,player.y,player.diameter-10,player.diameter-10);
            Rectangle uRect=new Rectangle(pipes.upX[i],pipes.upY[i],pipes.width,pipes.heightUp[i]);
            Rectangle dRect=new Rectangle(pipes.downX[i],pipes.downY[i],pipes.width,pipes.heightDown[i]);
            if(pRect.intersects(uRect)||pRect.intersects(dRect))
            {
                gameOver=true;
            }
            //Score if pipes's speed =1
//                    if(player.x==pipes.upX[i]+pipes.width)
//            {
//                player.score+=1;
//            }
        
            if(pipes.upX[i]<-pipes.width)
            {
                pipes.heightUp[i]=new java.util.Random().nextInt(350)+30;
                pipes.heightDown[i]=Height-pipes.gap-pipes.heightUp[i];
                pipes.upX[i]=Width;
                pipes.downX[i]=Width;
                pipes.downY[i]=Height-pipes.heightDown[i];
            
                
        }
       
        if(player.y<0||player.y>Height-39)
        {
            gameOver=true;
        }
        }
        }
        repaint();
    }
    @Override public void keyPressed(KeyEvent e)
    {
        if(gameOver==false)
        {
        if(e.getKeyCode()==KeyEvent.VK_SPACE||e.getKeyCode()==KeyEvent.VK_UP||e.getKeyCode()==KeyEvent.VK_W)
        {
            player.speedY=-10;
        }
        }
        else
        {
              gameOver=false;
              pipes.init();
              Player player1=new Player(80,Height/2-15,30);
              player=player1;
        }
    }

    @Override public void keyReleased(KeyEvent e) {}
    @Override public void keyTyped(KeyEvent e) {}
}
