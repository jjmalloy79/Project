/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.troubleshoot;

import java.util.StringTokenizer;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author joshuamalloy
 */
    class MenuPaneHyperlinkListener implements HyperlinkListener
            {
                //@Override
                public void hyperlinkUpdate(HyperlinkEvent e){
                    if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                        StringTokenizer st = new StringTokenizer(e.getDescription()," ");
                        if(st.hasMoreTokens()){
                            String s = st.nextToken();
                            System.err.println("token: " + s);
                        }
                    }
                }
            }
