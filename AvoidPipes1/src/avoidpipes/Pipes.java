/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avoidpipes;

/**
 *
 * @author Moment
 */
public class Pipes {
    public int upX[]={200,400,600};
    public int gap=130;
    public int upY[]={0,0,0};
    public int width=40;
    public int heightUp[]={new java.util.Random().nextInt(350)+30,new java.util.Random().nextInt(350)+30,new java.util.Random().nextInt(350)+30};
    public int numPipes=3;
    public int downX[]={200,400,600};
    public int heightDown[]={ControlWindow.Height-gap-heightUp[0],ControlWindow.Height-gap-heightUp[1],ControlWindow.Height-gap-heightUp[2]};
    public int downY[]= {ControlWindow.Height-heightDown[0],ControlWindow.Height-heightDown[1],ControlWindow.Height-heightDown[2]};
    public int speedX=3;
    public void init()
    {
          upX=new int[]{200,400,600};
      gap=130;
    upY=new int[]{0,0,0};
      width=40;
     heightUp=new int[]{new java.util.Random().nextInt(350)+30,new java.util.Random().nextInt(350)+30,new java.util.Random().nextInt(350)+30};
     numPipes=3;
    downX=new int[]{200,400,600};
     heightDown=new int[]{ControlWindow.Height-gap-heightUp[0],ControlWindow.Height-gap-heightUp[1],ControlWindow.Height-gap-heightUp[2]};
     downY= new int[]{ControlWindow.Height-heightDown[0],ControlWindow.Height-heightDown[1],ControlWindow.Height-heightDown[2]};
     speedX=3;
    }
}

