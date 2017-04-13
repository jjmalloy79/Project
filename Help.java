/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.troubleshoot;

import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

/**
 *
 * @author joshuamalloy
 * 
 * Thanks to http://www.online-convert.com/result/a3ba865e0784976756b07842dc746209
 * for converting my docx file into a html
 */
public class Help {
    /**
     * @param args the command line arguments
     */
    public static void main() throws Exception { 
        Help goTo = new Help();
        goTo.go();
    }
  public void go() throws Exception{
 // some parts of this code came from http://www.rgagnon.com/javadetails/java-0205.html   
  JTextPane tp = new JTextPane();
  JScrollPane js = new JScrollPane();
  js.getViewport().add(tp);
  JFrame jf = new JFrame();
  jf.getContentPane().add(js);
  jf.pack();
  jf.setSize(800,800);
  jf.setVisible(true); 
  
  try {
      URL url = getClass().getResource("HelpCenter.html");
    tp.setPage(url);
    } // ends try
  catch (Exception e) {
    e.printStackTrace();
    
    }// ends catch
  }
        // TODO code application logic here

    
}
