
package my.troubleshoot;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.Console;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;



/**
 *
 * @author joshuamalloy from JoMa Interactive
 * Senior Project
 * Special thanks to Mark Cohen for leading me into the right direction to 
 * run file in stream.
 * BHS Infrastructure at BHS:
 * Cliff Harewood for Ideas to have in the program.
 * Steve Phelps  to try to get the file to be read.
 * Neal(yes that is how you spell it) Mulcahy for the networking solutions as
 * well as helping figuring out how to do things.
 * John G. For ideas and opinions on the program.
 * Richard  for Ideas and opinions on the program.
 * Brain    for looking at the project and saying what he things.
 * And David Eve for helping troubleshooting
 * Network Connectivity Troubleshooting Series 0.17*/
public class troubleshootUI extends javax.swing.JFrame {
//Global Variables 
        // Variables declaration - do not modify                     
    private javax.swing.JButton Other;
    private javax.swing.JButton References;
    private javax.swing.JButton Router;
    private javax.swing.JButton Rules;
    private javax.swing.JButton Server;
    private javax.swing.JButton Switch;
    private javax.swing.JButton Training;
    private javax.swing.JButton Wifi;
    private javax.swing.JButton Wired;
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addedLevel;
    private javax.swing.JButton cmdButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel levelUp;
    private javax.swing.JButton noButton;
    private javax.swing.JLabel question;
    private javax.swing.JButton resetButton;
    private javax.swing.JToolBar rulesTab;
    private javax.swing.JButton saveButton;
    private javax.swing.JScrollPane textArea;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JButton yesButton;
    // End of variables declaration    
    //this is for the main files names
    private boolean firstSw = true;
    private int defaultSizeSw = 26;
    
    private int defaultSizeW = 37;
    private int defaultSizeC = 11;
    private int defaultSizeR = 11;
    private int defaultSizeS = 4;
    private int defaultSizeO = 7;
    private int defaultSizeRef = 15;
    private static final String relSw = "switch.txt";
    private static final String relCom = "computer.txt";
    private static final String relO = "other.txt";
    private static final String relR = "router.txt";
    private static final String relS = "server.txt";
    private static final String relW = "wifi.txt";
    private static final String relRef  = "references.txt";
    private static final String drelSw = "defaultSwitch.txt";
    private static final String drelCom = "defaultComputer.txt";
    private static final String drelO = "defaultOther.txt";
    private static final String drelR = "defaultRouter.txt";
    private static final String drelS = "defaultServer.txt";
    private static final String drelW = "defaultWifi.txt";
    private static final String drelRef = "defaultReference.txt";
    //this is for the level files names
    private static final String rellSw = "levelForSwitch.txt";
    private static final String rellCom = "levelForWired.txt";
    private static final String rellO = "levelForOther.txt";
    private static final String rellR = "levelForRouter.txt";
    private static final String rellS = "levelForServer.txt";
    private static final String rellW = "levelForWifi.txt";
    private static final String drellSw = "defaultLevelSwitch.txt";
    private static final String drellCom = "defaultLevelWired.txt";
    private static final String drellO = "defaultLevelOther.txt";
    private static final String drellR = "defaultLevelRouter.txt";
    private static final String drellS = "defaultLevelServer.txt";
    private static final String drellW = "defaultLevelWifi.txt";
    //  images and other expressions
    private final ImageIcon image1 = new ImageIcon(getClass().getResource("image1.png"));
    private boolean switchsEnd = false;
    private boolean firstCallSw = true;
    private final int cout = 0;
    private boolean routerEnd = false;
    private boolean serverEnd = false;
    private boolean otherEnd = false;
    private boolean computerEnd = false;
    private boolean wifiEnd = false;
    private boolean references = false;
    private boolean rule = true; 
    private boolean reset = false;
    private boolean save = false;
    private boolean switchs = false;
    private boolean router = false;
    private boolean server = false;
    private boolean other = false;
    private boolean computer = false;
    private boolean wifi = false;
    private boolean train = false;
    private boolean autoDisplay = false;
    private boolean yes = false;
    private boolean no = false;
    private boolean add = false;
    private final boolean saveComputer = false;
    private boolean saveSwitch = false;
    private boolean saveRouter = false;
    private boolean saveWired = false;
    private boolean saveWifi = false;
    private boolean saveServer = false;
    private boolean saveOther = false;
    private final boolean saveReference = false;
    private final boolean firstTimeComputer = true;
    private final  FileInputStream instream = null;
    private final  FileOutputStream outstream = null;
    private final int counterC = 2;
    private final int counterR = 2;
    private final int countC = 3;
    private final int countR = 3;    
    private int levelNumSwitch = 0;
    private int levelNumOther = 0;
    private int levelNumRouter = 0;
    private int levelNumServer = 0;
    private int levelNumComputer = 0;
    private int levelNumWifi = 0;   
    private int levelCounterSw = 0;
    private int levelCounterO = 0;
    private int levelCounterR = 0;
    private int levelCounterS = 0;
    private int levelCounterC = 0;
    private int levelCounterW = 0;   
    private int computerSize = 0;
    private int routerSize = 0;
    private int serverSize = 0;
    private int switchSize = 0;
    private int otherSize = 0;
    private int wifiSize = 0;
    private int referenceSize = 0;
    private int theCounterC = 2;
    private int theCounterR = 2;
    private int theCounterS = 2;
    private int theCounterSw = 2;
    private int theCounterO = 2;
    private int theCounterW = 2;
    private final int theCounterRef = 2;
    private final String computerShoot = "";
    private final String routerShoot = "";
    private final String otherShoot = "";
    private final String switchShoot = "";
    private final String serverShoot = "";
    private final String pcString = "";
    private final String routerString = "";
    private String userLevel = "";
    private final String hlp = " Help Desk";
    private final String tech = " Tech Support";
    private final String admin = " Administration Support";
    private final String ven = " Vendor Support";
    private String stringEnter = "";
    private String text = "";  
    private File source;
    private File dest;
    // These are all the array list that allows to read in and out and display
    // content
    private final ArrayList<String> listRef = new ArrayList<String> ();
    private final ArrayList<String> listpc = new ArrayList<String> ();
    private final ArrayList<String> listR = new ArrayList<> ();
    private final ArrayList<String> listSw = new ArrayList<> ();
    private final ArrayList<String> listS = new ArrayList<> ();
    private final ArrayList<String> listO = new ArrayList<> ();
    private final ArrayList<String> listW = new ArrayList<> ();
    private final ArrayList<String> levelRef = new ArrayList<String> ();
    private final List<String> levelSw = new ArrayList<>();
    private final List<String> levelS = new ArrayList<>();
    private final List<String> levelO = new ArrayList<>();
    private final List<String> levelW = new ArrayList<>();
    private final List<String> levelpc = new ArrayList<>();
    private final List<String> levelR = new ArrayList<>();
    private final Help Helper = new Help();
    private final Font font = new Font("Courier", Font.BOLD,14);

    
    public troubleshootUI() {
        
        initComponents();
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        yesButton.setEnabled(false);
        noButton.setEnabled(false);
        cmdButton.setEnabled(false);
        Rules.setOpaque(true);
        Rules.setSelected(true);
        Rules.setBackground(Color.BLACK);
        addButton.setBackground(Color.LIGHT_GRAY);
        resetButton.setBackground(Color.LIGHT_GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.LIGHT_GRAY);
        noButton.setBackground(Color.LIGHT_GRAY);
        cmdButton.setBackground(Color.LIGHT_GRAY);     
        
        Rules.setBackground(Color.BLACK);
        getContentPane().setBackground( Color.LIGHT_GRAY );
        Rules.doClick();
        javax.swing.border.Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
        textArea1.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10,10,10,10)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        textArea = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        question = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        noButton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        rulesTab = new javax.swing.JToolBar();
        Rules = new javax.swing.JButton();
        Switch = new javax.swing.JButton();
        Wifi = new javax.swing.JButton();
        Wired = new javax.swing.JButton();
        Router = new javax.swing.JButton();
        Server = new javax.swing.JButton();
        Other = new javax.swing.JButton();
        Training = new javax.swing.JButton();
        References = new javax.swing.JButton();
        help = new javax.swing.JButton();
        levelUp = new javax.swing.JLabel();
        cmdButton = new javax.swing.JButton();
        addedLevel = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(Color.LIGHT_GRAY);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setFocusTraversalKeysEnabled(false);
        setForeground(Color.LIGHT_GRAY);
        setName("JFrame"); // NOI18N
        setResizable(false);
        

        jLabel1.setFont(new java.awt.Font("Noteworthy", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/troubleshoot/netWorkPic.png"))); // NOI18N
        
        exitButton.setBackground(new java.awt.Color(153, 153, 153));
        exitButton.setForeground(new java.awt.Color(0, 51, 204));
        exitButton.setText("Exit");
        exitButton.setMaximumSize(new java.awt.Dimension(95, 33));
        exitButton.setMinimumSize(new java.awt.Dimension(95, 33));
        exitButton.setPreferredSize(new java.awt.Dimension(95, 33));
        exitButton.setSize(new java.awt.Dimension(95, 33));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonButton(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(153, 153, 153));
        addButton.setForeground(new java.awt.Color(0, 51, 255));
        addButton.setLabel("Add ");
        addButton.setMaximumSize(new java.awt.Dimension(95, 33));
        addButton.setMinimumSize(new java.awt.Dimension(95, 33));
        addButton.setPreferredSize(new java.awt.Dimension(95, 33));
        addButton.setSize(new java.awt.Dimension(95, 33));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonButton(evt);
                
            }
        });

        textArea1.setEditable(false);
        textArea1.setBackground(java.awt.Color.lightGray);
        textArea1.setColumns(20);
        textArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textArea1.setRows(5);
        textArea1.setText("\n  Rules:\n\n  How many people will be effected by change?\n\n  Will data be effected?\n\n  Who needs to be involved?\n\n  Does management need to be involved?\n\n  Does other members of the team need to be involved?\n\n  Does vendor(s) need to be involved?\n\n  Is it software or hardware?\n\n  What procedure do I need to do?\n\n");
        textArea1.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        textArea1.setLineWrap(true);
        textArea.setViewportView(textArea1);
        textArea1.setWrapStyleWord(true);

        question.setBackground(new java.awt.Color(0, 0, 0));
        question.setFont(new java.awt.Font("Monospaced", 2, 14)); // NOI18N
        question.setForeground(new java.awt.Color(255, 255, 255));
        question.setOpaque(true);

        saveButton.setBackground(new java.awt.Color(153, 153, 153));
        saveButton.setForeground(new java.awt.Color(0, 51, 255));
        saveButton.setText("Save");
        saveButton.setEnabled(false);
        saveButton.setMaximumSize(new java.awt.Dimension(95, 33));
        saveButton.setMinimumSize(new java.awt.Dimension(95, 33));
        saveButton.setPreferredSize(new java.awt.Dimension(95, 33));
        saveButton.setSize(new java.awt.Dimension(95, 33));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonButton(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(153, 153, 153));
        resetButton.setForeground(new java.awt.Color(0, 51, 204));
        resetButton.setText("Reset ");
        resetButton.setEnabled(false);
        resetButton.setMaximumSize(new java.awt.Dimension(95, 33));
        resetButton.setMinimumSize(new java.awt.Dimension(95, 33));
        resetButton.setPreferredSize(new java.awt.Dimension(95, 33));
        resetButton.setSize(new java.awt.Dimension(95, 33));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButton(evt);
            }
        });

        yesButton.setBackground(new java.awt.Color(153, 153, 153));
        yesButton.setForeground(new java.awt.Color(0, 51, 204));
        yesButton.setText("Yes");
        yesButton.setMaximumSize(new java.awt.Dimension(95, 33));
        yesButton.setMinimumSize(new java.awt.Dimension(95, 33));
        yesButton.setPreferredSize(new java.awt.Dimension(95, 33));
        yesButton.setSize(new java.awt.Dimension(95, 33));
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButton(evt);
            }
        });

        noButton.setBackground(new java.awt.Color(153, 153, 153));
        noButton.setForeground(new java.awt.Color(0, 51, 204));
        noButton.setText("No");
        noButton.setMaximumSize(new java.awt.Dimension(95, 33));
        noButton.setMinimumSize(new java.awt.Dimension(95, 33));
        noButton.setPreferredSize(new java.awt.Dimension(95, 33));
        noButton.setSize(new java.awt.Dimension(95, 33));
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButton(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        rulesTab.setBackground(Color.LIGHT_GRAY);
        rulesTab.setFloatable(false);
        rulesTab.setForeground(new java.awt.Color(255, 255, 255));
        rulesTab.setRollover(true);
        rulesTab.setFont(new java.awt.Font("Luminari", 3, 13)); // NOI18N

        Rules.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Rules.setText("Rules");
       
        Rules.setMaximumSize(new java.awt.Dimension(97, 19));
        Rules.setMinimumSize(new java.awt.Dimension(97, 19));
        Rules.setPreferredSize(new java.awt.Dimension(97, 19));
        Rules.setSelected(true);
        Rules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RulesActionPerformed(evt);
            }
        });
        rulesTab.add(Rules);
        Rules.getAccessibleContext().setAccessibleName("rulesTab");

        Switch.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        
        Switch.setLabel("Switch");
        Switch.setMaximumSize(new java.awt.Dimension(97, 19));
        Switch.setMinimumSize(new java.awt.Dimension(97, 19));
        Switch.setPreferredSize(new java.awt.Dimension(97, 19));
        Switch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchActionPerformed(evt);
            }
        });
        rulesTab.add(Switch);
        Switch.getAccessibleContext().setAccessibleName("switchTab");

        Wifi.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Wifi.setText("Wifi Computer");
        
        Wifi.setMaximumSize(new java.awt.Dimension(97, 19));
        Wifi.setMinimumSize(new java.awt.Dimension(97, 19));
        Wifi.setPreferredSize(new java.awt.Dimension(97, 19));
        Wifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WifiActionPerformed(evt);
            }
        });
        rulesTab.add(Wifi);
        Wifi.getAccessibleContext().setAccessibleName("wifiTab");

        Wired.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        
        Wired.setLabel("Wired Computer");
        Wired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WiredActionPerformed(evt);
            }
        });
        rulesTab.add(Wired);
        Wired.getAccessibleContext().setAccessibleName("wiredTab");

        Router.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Router.setText("Router");
        
        Router.setMaximumSize(new java.awt.Dimension(97, 19));
        Router.setMinimumSize(new java.awt.Dimension(97, 19));
        Router.setPreferredSize(new java.awt.Dimension(97, 19));
        Router.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RouterActionPerformed(evt);
            }
        });
        rulesTab.add(Router);
        Router.getAccessibleContext().setAccessibleName("routerTab");

        Server.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Server.setText("Server");
        
        Server.setMaximumSize(new java.awt.Dimension(97, 19));
        Server.setMinimumSize(new java.awt.Dimension(97, 19));
        Server.setPreferredSize(new java.awt.Dimension(97, 19));
        Server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServerActionPerformed(evt);
            }
        });
        rulesTab.add(Server);
        Server.getAccessibleContext().setAccessibleName("serverTab");

        Other.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        
        Other.setFocusCycleRoot(true);
        Other.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Other.setLabel("Other");
        Other.setMaximumSize(new java.awt.Dimension(97, 19));
        Other.setMinimumSize(new java.awt.Dimension(97, 19));
        Other.setPreferredSize(new java.awt.Dimension(97, 19));
        Other.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherActionPerformed(evt);
            }
        });
        rulesTab.add(Other);
        Other.getAccessibleContext().setAccessibleName("otherTab");

        Training.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        Training.setText("Training");
        
        Training.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Training.setMaximumSize(new java.awt.Dimension(97, 19));
        Training.setMinimumSize(new java.awt.Dimension(97, 19));
        Training.setName(""); // NOI18N
        Training.setOpaque(true);
        Training.setPreferredSize(new java.awt.Dimension(97, 19));
        Training.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Training.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainingActionPerformed(evt);
            }
        });
        rulesTab.add(Training);
        Training.getAccessibleContext().setAccessibleName("trainingTab");

        References.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        References.setText("References");
        
        References.setMaximumSize(new java.awt.Dimension(97, 19));
        References.setMinimumSize(new java.awt.Dimension(97, 19));
        References.setPreferredSize(new java.awt.Dimension(97, 19));
        References.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReferencesActionPerformed(evt);
            }
        });
        rulesTab.add(References);
        References.getAccessibleContext().setAccessibleName("refTab");

        help.setFont(new java.awt.Font("Luminari", 3, 11)); // NOI18N
        help.setText("Help");
        
        help.setFocusable(false);
        help.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        help.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        rulesTab.add(help);

        levelUp.setBackground(new java.awt.Color(0, 0, 0));
        levelUp.setFont(new java.awt.Font("Monospaced", 2, 12)); // NOI18N
        levelUp.setForeground(new java.awt.Color(255, 255, 255));
        levelUp.setOpaque(true);

        cmdButton.setBackground(new java.awt.Color(153, 153, 153));
        cmdButton.setForeground(new java.awt.Color(0, 0, 255));
        cmdButton.setText("Command");
        cmdButton.setMaximumSize(new java.awt.Dimension(95, 33));
        cmdButton.setMinimumSize(new java.awt.Dimension(95, 33));
        cmdButton.setPreferredSize(new java.awt.Dimension(95, 33));
        cmdButton.setSize(new java.awt.Dimension(95, 29));
        cmdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdButtonActionPerformed(evt);
            }
        });

        addedLevel.setEditable(false);
        addedLevel.setBackground(Color.LIGHT_GRAY);
        addedLevel.setEnabled(false);
        addedLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addedLevelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Oriya MN", 0, 8)); // NOI18N
        jLabel2.setText("Created by Joshua J. Malloy  May 2017 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(levelUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textArea, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(question, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addedLevel)
                    .addComponent(rulesTab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(levelUp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addedLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rulesTab, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))))
        );

        cmdButton.getAccessibleContext().setAccessibleName("cmdPrompt");

        pack();
    }// </editor-fold>                        

/*This will be used to get the Command Prompt or Terminal*/    
    private void getProgram(String programName)
    {
        Runtime runtime = Runtime.getRuntime();     
        try
        {
            runtime.exec(programName);        
        }
        catch (IOException e)
        {
        }
    }// End of Get Program
    private void exitButtonButton(java.awt.event.ActionEvent evt) {                                  
        System.exit(0);        //
    }                                 
// This is the add button control
    private void addButtonButton(java.awt.event.ActionEvent evt) {                                 
        //disable and enabling features.
        addButton.setEnabled(false);
        add = true;
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        levelUp.setText("");
// NO tabs allowed to be touched while saving. Except help.
        Rules.setEnabled(false);
        Switch.setEnabled(false);
        Wifi.setEnabled(false);
        Wired.setEnabled(false);
        Router.setEnabled(false);
        Server.setEnabled(false);
        Other.setEnabled(false);
        Training.setEnabled(false);
        References.setEnabled(false);
        if(references)
        {
            yesButton.setEnabled(true);
            noButton.setEnabled(true);
            addedLevel.setEditable(false);
            addedLevel.setText("");
            addButton.setEnabled(false);
        }
        else
            addedLevel.setEditable(true);
 
            textArea1.setText(" ");
            this.add = true;
            question.setText(" Are you sure you want to add to file? ");
     
        reset = false;
        save = false;  
    }                                
// Save Button
    private void saveButtonButton(java.awt.event.ActionEvent evt) {                                  

        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        exitButton.setEnabled(true);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        question.setText(" Are you ready to save?");
        stringEnter = textArea1.getText();
        userLevel = addedLevel.getText();
        save = true;
        add = false;
        reset = false;
        if(switchs)
           Switch.setEnabled(false);
         if(wifi)
           Wifi.setEnabled(false); 
        if(computer)
           Wired.setEnabled(false);
        if(server)
           Server.setEnabled(false);
        if(other)
           Other.setEnabled(false);
        if(references)
           References.setEnabled(false);
    }                                 
// yes button
    private void yesButton(java.awt.event.ActionEvent evt) {                           
        try {
            yes();
            } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
    }                          

//No button
    private void noButton(java.awt.event.ActionEvent evt) {                          
        try {
            no();
            
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                         
// Reset button 
    private void resetButton(java.awt.event.ActionEvent evt) {                             
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        reset = true;     
        save = false;
        add = false;
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        if(references){
            question.setText(" Are you sure you want to reset references section back to default? ");     
            yesButton.setEnabled(true);
            noButton.setEnabled(true);
        }
        else if(switchs)
            question.setText(" Are you sure you want to reset switch section back to default? ");
        else if(wifi)
            question.setText(" Are you sure you want to reset wifi section back to default? ");
        else if(computer)
            question.setText(" Are you sure you want to reset wired computer section back to default? ");
        else if(other)
            question.setText(" Are you sure you want to reset other section back to default? ");
        else if(router)
            question.setText(" Are you sure you want to reset router section back to default? ");
        else if(server)
            question.setText(" Are you sure you want to reset server section back to default? ");
    }                            
//Switch Button
    private void SwitchActionPerformed(java.awt.event.ActionEvent evt) {                                       

        try {
            callSwitch();
  
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                      
  
// Rule Button 
    private void RulesActionPerformed(java.awt.event.ActionEvent evt) {                                      
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        yesButton.setEnabled(false);
        noButton.setEnabled(false);
        cmdButton.setEnabled(false);
        addButton.setBackground(Color.LIGHT_GRAY);
        resetButton.setBackground(Color.LIGHT_GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.LIGHT_GRAY);
        noButton.setBackground(Color.LIGHT_GRAY);
        cmdButton.setBackground(Color.LIGHT_GRAY);     

        Rules.setBackground(Color.BLACK);
        Rules.setOpaque(true);
        Rules.setSelected(true);
        Rules.setEnabled(false);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        
       this.rule = true;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = false;
       this.references = false;
       question.setText("");
       levelUp.setText("");
       textArea1.setText("");
       textArea1.setText("\n  Rules:\n" 
                         + "\n  How many people will be effected by change?\n"
                         + "\n  Will data be effected?\n"
                         + "\n  Who needs to be involved?\n"
                         + "\n  Does management need to be involved?\n"
                         + "\n  Does other members of the team need to be involved?\n"
                         + "\n  Does vendor(s) need to be involved?\n"
                         + "\n  Is it software or hardware?\n" 
                         + "\n  What procedure do I need to do?");        // TODO add your handling code here:
    }                                     
// Other Button
    private void OtherActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try {
            callOther();
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }                                     
//Wifi Button
    private void WifiActionPerformed(java.awt.event.ActionEvent evt) {                                     
       
        try {
            callWifi();
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                    
// Wired Button
    private void WiredActionPerformed(java.awt.event.ActionEvent evt) {                                      
        try {
            callWired();
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }                                     
// Router button
    private void RouterActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            callRouter();
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      
// server
    private void ServerActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {
            callServer();
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      
// traing Button
    private void TrainingActionPerformed(java.awt.event.ActionEvent evt) {                                         
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = true;
       this.references = false;
        addButton.setBackground(Color.LIGHT_GRAY);
        resetButton.setBackground(Color.LIGHT_GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.LIGHT_GRAY);
        noButton.setBackground(Color.LIGHT_GRAY);
        cmdButton.setBackground(Color.LIGHT_GRAY);     
        Rules.setForeground(Color.BLUE);
        Rules.setBackground(Color.BLACK);
        addButton.setEnabled(false);
        resetButton.setEnabled(false);
        saveButton.setEnabled(false);
        yesButton.setEnabled(false);
        noButton.setEnabled(false);
        cmdButton.setEnabled(false);
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLUE);
        Training.setBackground(Color.BLACK);
        Training.setSelected(true);
        Training.setOpaque(true);
        Training.setEnabled(false);
        question.setText(" ");
       levelUp.setText(" ");
        textArea1.setText("\n  Training Process:\n" 
                         + "\n  Read and take a quiz on confidentiality.\n"
                         + "\n  Be introduced to the fellow workers if you haven't already met.\n"
                         + "\n  Understanding of the working enviroment, such as proper outfit.\n"
                         + "\n  Sitting in on a weekly conference call.\n"
                         + "\n  Learn the proper protocol that needs to be done before doing major changes.\n"
                         + "\n  Learn how to fill out the paper that is needed.\n"
                         + "\n  Learning the software that is being used: Command/Terminal Prompt(for using:  tracert, ping, ipconfig or for MAC ifconfig),"
                         + "\n  Orion, Prime, Putty, Webbrowser (for speedtest), Netspot Pro(site survey tool), and WireShark.\n"
                         + "\n  Create a small network in lab to show your understand of how a network works with WLAN.\n"
                         + "\n  Increase knowledge of other parts of IT that you might not normal have to do.\n"
                         + "\n  Learn the steps to do an audit on servers.\n" 
                         + "\n  Being able to resolve application issues.\n"
                         + "\n  Installing and replacing monitors on carts."
                         + "\n  Have some form of camera to take pictures to verify where connections are made."
                         + "\n");        // TODO add your handling code here:
    }                                        
// References Button
    private void ReferencesActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.rule = false;
        this.switchs = false;
        this.router = false;
        this.server = false;
        this.other = false;
        this.computer = false;
        this.wifi = false;
        this.train = false;
        this.references = true;
        cmdButton.setEnabled(true);
        resetButton.setEnabled(true);
        saveButton.setEnabled(false);
        yesButton.setEnabled(false);
        noButton.setEnabled(false);
        addButton.setEnabled(true);

        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);     
       
        Rules.setBackground(Color.BLACK);       
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLUE);
        References.setBackground(Color.BLACK);
        References.setSelected(true);
        References.setOpaque(true);
        References.setEnabled(false);
      
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        
        try {
            readIn(relRef);
        } catch (IOException ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        question.setText("");
        levelUp.setText("");
        
        
    }                                          

    private void cmdButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        Console console = System.console();
       boolean enter = false;
        if(console == null && !GraphicsEnvironment.isHeadless()){
// this is to open terminal in Windows
            if(!enter)
             try {
                Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k"});
                enter = true;
            } catch (IOException ex) {
                 }
// this is to open terminal in Mac os
        if(!enter){
            File instFolder = new File(System.getProperty("user.dir"));
            try {
                Runtime.getRuntime().exec(new String[] { "open", instFolder.toString() });
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            enter = true;
        }
        if(!enter)
// this is to open a terminal in Linux
           try {
                Runtime.getRuntime().exec(new String[] { "/usr/bin/gnome-terminal"});
                enter = true;
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }// ends if
        
    }                                         
// this calls another Class to display the help section
    private void helpActionPerformed(java.awt.event.ActionEvent evt) {                                     

        try {
            Helper.main();
        } catch (Exception ex) {
            Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       

    }                                    

    private void addedLevelActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
    }                                          
    public ImageIcon createImage(String path){
        return new ImageIcon(java.awt.Toolkit.getDefaultToolkit().getClass().getResource(path));
    }
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new troubleshootUI().setVisible(true);
                
            }
        });
    }
 // This Section reads in just the Reference section since it doesnt have levels.
    private void readIn(String filename) throws MalformedURLException, IOException//, IOException
    {
/**************Variables ****************/
       InputStream in = getClass().getResourceAsStream(filename);
       BufferedReader input = new BufferedReader(new InputStreamReader(in));
       textArea1.setText("");    
       //String input = "";
       String textFieldReadable = "";
       String tfr = "";
       computerSize = 0;
       routerSize = 0;
       serverSize = 0;
       otherSize = 0;
       switchSize = 0;
       wifiSize = 0;
       referenceSize = 0;

       listRef.clear();


/***************Try to catch the file trying to open**************/
    
       try {
            while (textFieldReadable != null){
               
                textFieldReadable = input.readLine();
                if(!(textFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    tfr = textFieldReadable;
                    if(computer)
                        listpc.add(tfr); 
                    if(router)
                        listR.add(tfr);
                    if(server)
                        listS.add(tfr);
                    if(switchs)     
                        listSw.add(tfr);   
                    if(other)
                        listO.add(tfr);
                    if(wifi)
                        listW.add(tfr);
                    if(references)
                        listRef.add(tfr);
                }
                
/***********************Gets how big the file is...*************************/
                if(computer)
                    computerSize++;
                if(router)
                    routerSize++;
                if(server)
                    serverSize++;
                if(switchs)
                    switchSize++;
                if(other)
                    otherSize++;
                if(wifi)
                    wifiSize++;
                if(references)
                    referenceSize++;
                
            }// ends while
            
            input.close();// Close stream
        }// ends try

        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch

       if(!add || save)
       {
         printOut();
       }
       
    }//ends ReadIn
 
    
    /******************************This adds new data to files*/
    private void addToFile() throws IOException, MalformedURLException, URISyntaxException
    {   
      String temp = "";
      String levelTemp ="";
       int sizeOf = 0;
       int levelSize = 0;
      String nameOfFile = "";
      String fileLevelName ="";
      /********* This puts data into variables depending on which Section the users is in.***/
            if(computer)
            {
                sizeOf = listpc.size();
                nameOfFile = relCom ;
                levelSize = levelpc.size();
                fileLevelName = rellCom;
            }
            if(switchs)
            {
                sizeOf = listSw.size();
                nameOfFile = relSw;
                levelSize = levelSw.size();
                fileLevelName = rellSw; 
            }
            if(wifi)
            {
                sizeOf = listW.size();
                nameOfFile = relW;
                levelSize = levelW.size();
                fileLevelName = rellW; 
            }
            if(router)
            {
                sizeOf = listR.size();
                nameOfFile = relR;
                levelSize = levelR.size();
                fileLevelName = rellR; 
            }
            if(server)
            {
                sizeOf = listS.size();
                nameOfFile = relS;
                levelSize = levelS.size();
                fileLevelName = rellS; 
            }
            if(other)
            {
                sizeOf = listO.size();
                nameOfFile = relO;
                levelSize = levelO.size();
                fileLevelName = rellO; 
            }
            if(references)
            {
                sizeOf = listRef.size();
                nameOfFile = relRef;
                addedLevel.setBackground(Color.LIGHT_GRAY);
            }

/**********************This writes to that file**********************/
            FileWriter writer = new FileWriter(nameOfFile);           
            for(int j = 0; j < sizeOf; j ++)
            {
                    if( j < sizeOf)
                    {
/***********************This puts the data into the right file.******/
                        if(computer)
                            temp = listpc.get(j);
 
                        if(switchs)
                            temp = listSw.get(j);
                            
                        if(wifi)
                            temp = listW.get(j);
                      
                        if(router)
                            temp = listR.get(j);
                       
                        if(other)
                            temp = listO.get(j);
                      
                        if(server)
                            temp = listS.get(j);
                     
                        if(references)
                            temp = listRef.get(j);
                         writer.write(temp + "\n");
                    }
            }
           
            writer.write(stringEnter);  // adds what user wants to add    
            writer.flush();
            writer.close();// close the writer
            if(switchs)
                listSw.add(stringEnter); // adds to the arraylist
            if(wifi)
                listW.add(stringEnter); // adds to the arraylist
            if(computer)
                listpc.add(stringEnter); // adds to the arraylist   
            if(server)
                listS.add(stringEnter); // adds to the arraylist   
            if(other)
                listO.add(stringEnter); // adds to the arraylist
            if(router)
                listR.add(stringEnter); // adds to the arraylist
            if(!references){
/**********************This writes to that file**********************/
            FileWriter writerlevel = new FileWriter(fileLevelName); 
            for(int k = 0; k < levelSize; k ++)
            {
                    if( k < levelSize)
                    {
/***********************This puts the data into the right file.******/
                        if(computer)
                            levelTemp = levelpc.get(k);
                        
                        if(switchs)
                            levelTemp = levelSw.get(k);
                        
                        if(wifi)
                            levelTemp = levelW.get(k);
                        
                        if(router)
                            levelTemp = levelR.get(k);
                       
                        if(other)
                            levelTemp = levelO.get(k);
                       
                        if(server)
                            levelTemp = levelS.get(k);
           
                         writerlevel.write(levelTemp +"\n" );
                    }
            }
           
            writerlevel.write(userLevel);  
            writerlevel.flush();
            writerlevel.close();
            }
            if(switchs)
                levelSw.add(userLevel);
            else if(wifi)
                levelW.add(userLevel);
            else if(computer)
                levelpc.add(userLevel);
            else if(router)
                levelR.add(userLevel);
            else if(other)
                levelO.add(userLevel);
            else if(server)
                levelS.add(userLevel);
/**********************This clears only the list that is being read in by the text.***/
            String t = "";
            String lt = "";
            if (switchs)
            {
                for(int i = 0; i < listSw.size();i++)
		{
                    t = t + listSw.get(i);
                    lt = lt + levelSw.get(i);
		}
                    
                textArea1.setText(t);
                levelUp.setText(lt);

            }
            if (computer)
            {
                for(int i = 0; i < listpc.size();i++)
		{
                    t = t + listpc.get(i);
                    lt = lt + levelpc.get(i);
		}
                System.out.println(t);
                textArea1.setText(t);
                levelUp.setText(lt);
            }
             if (wifi)
            {
                for(int i = 0; i < listW.size();i++)
		{
                    t = t + listW.get(i);
                    lt = lt + levelW.get(i);
		}
                textArea1.setText(t);
                levelUp.setText(lt);
            } 
            
            if (server)
            {
                for(int i = 0; i < listS.size();i++)
		{
                    t = t + listS.get(i);
                    lt = lt + levelS.get(i);
		}
                textArea1.setText(t);
                levelUp.setText(lt);
            }  
            if (router)
            {
                for(int i = 0; i < listR.size();i++)
		{
                    t = t + listR.get(i);
                    lt = lt + levelR.get(i);
		}
                textArea1.setText(t);
                levelUp.setText(lt);
            }
            if (other)
            {
                for(int i = 0; i < listO.size();i++)
		{
                    t = t + listO.get(i);
                    lt = lt + levelO.get(i);
		}
                
                textArea1.setText(t);
                levelUp.setText(lt);
            }
              if (references)
            {
                for(int i = 0; i < listR.size();i++)
		{
                    t = t + listR.get(i);
                   
		}
                textArea1.setText(t);
                //readIn(relRef);
            }    
 
        stringEnter = "";
        userLevel = "";
    
    }
 /********************************Prints to text area**********/
    private void printOut() throws  IOException{     
/******************Variables*************************************/

        boolean noMore = false;
        int printCount = 0;
        int lprintCount = 0;
        int listSize = 0;
        String tempData = "";
        String ltempData = "";
        boolean saving = false;
        text = "";
        String textLevel = "";
        int counter = 1;
        if(switchs)
        {
            listSize = listSw.size();
            saving = saveSwitch;
            printCount = theCounterSw; 
            lprintCount = theCounterSw;
        }
        if(computer)
        {
            listSize = listpc.size();
            saving = saveWired;
            printCount = theCounterC; 
            lprintCount = theCounterC;
        }
        if(wifi)
        {
            listSize = listW.size();
            saving = saveWifi;
            printCount = theCounterW;
            lprintCount = theCounterW;
        }
        if(router)
        {
            listSize = listR.size();
            saving = saveRouter;
            printCount = theCounterR; 
            lprintCount = theCounterR;
        }
        if(other)
        {
            listSize = listO.size();
            saving = saveOther;
            printCount = theCounterO; 
            lprintCount = theCounterO;
        }
        if(server)
        {
            listSize = listS.size();
            saving = saveServer;
            printCount = theCounterS; 
           lprintCount = theCounterS;
        }
        if(references)
        {
            listSize = listRef.size();
            saving = saveReference;
            printCount = listRef.size(); 
        }
        if(printCount == listSize && switchs)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
               
        if(printCount == listSize && wifi)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
        if(printCount == listSize && computer)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
        if(printCount == listSize && router)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
        if(printCount == listSize && server)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
        if(printCount == listSize && other)
            {
                noMore = true;
                noButton.setEnabled(false);
                yesButton.setEnabled(false);
                resetButton.setEnabled(true);
            }// ends if
                for(int i = 0; i < listSize; i ++)
                {
                    if(printCount > i)    
                    {
/*******************************This puts what is in the list into a temp***/             
                        if(computer)
                            tempData = listpc.get(i);
                        if(switchs)
                            tempData = listSw.get(i);
         
                        if(wifi)
                            tempData = listW.get(i);
                        if(other)
                            tempData = listO.get(i);
                        if(server)
                            tempData = listS.get(i);
                        if(router)
                            tempData = listR.get(i);
                        if(references)
                            tempData = listRef.get(i);
                        if(!references)
                        {
                            if(i < 1)
                                text = text + "\n  " + tempData + "\n";  
                            else
                                text = text + "\n  " + (i) +") " + tempData + "\n"; 
                        }
                        else if(references)
                        {
                                text = text + "\n" + tempData + "\n"; 
                        }

                      if((!add || !save || !reset) && !references)  
                       {
                          if(printCount > i)
                              question.setText(" Did Step " + (i) + " work?");

                          if(noMore)
                          {
                              question.setText(" I used all my resources.");
                              if(computer)
                              {
                                    computerEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);     
                              }
                              if(wifi)
                              {
                                    wifiEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);
                              }
                              if(switchs)
                              {
                                    switchsEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);
                              }
                              if(router)
                              {
                                    routerEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);
                              }
                              if(server)
                              {
                                    serverEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);
                              }
                              if(other)
                              {
                                    otherEnd = true;
                                    addButton.setEnabled(true);
                                    resetButton.setEnabled(true);
                              }
                              

                          } // ends if
                       }   // ends if


                         if(save)
                            question.setText(" Your file was saved!");
                         else if(!save && !references && noMore)
                            question.setText(" All resources used up!");
                       
                       
                      if(no || yes)
                        if(save || add)
                            question.setText(" All resources used up!");
                      
                   }
                   
                textArea1.setText(text);
                }// ends for loop 
     System.out.println(listSize);
//************************displays which level should be involved******
                for(int i = 0; i < listSize; i ++)
                {
                    if(lprintCount > i)    
                    {
/*******************************This puts what is in the list into a temp***/             
                        if(computer)
                            ltempData = levelpc.get(i);
                        if(switchs)
                            ltempData = levelSw.get(i);
         
                        if(wifi)
                            ltempData = levelW.get(i);
                        if(other)
                            ltempData = levelO.get(i);
                        if(server)
                            ltempData = levelS.get(i);
                        if(router)
                            ltempData = levelR.get(i);


                   }
                   
               levelUp.setText(ltempData);
                }// ends for loop              
        
    }

    /*This is the Reset Section that puts everything back to default */
    private void Reset() throws FileNotFoundException, IOException
    {
        FileInputStream instream = null;
        FileOutputStream outstream = null;
        String inFileName = "";
        String outFileName="";
        FileInputStream instreamLevel = null;
        FileOutputStream outstreamLevel = null;
        String inFileNameLevel = "";
        String outFileNameLevel ="";
        if(computer)
        {
            outFileName = relCom;
            inFileName = drelCom;
            outFileNameLevel = rellCom;
            inFileNameLevel = drellCom;
        }// ends computer
        if(wifi)
        {
            outFileName = relW;
            inFileName = drelW;
            outFileNameLevel = rellW;
            inFileNameLevel = drellW;
        } // ends wifi
        if(switchs)
        {
            outFileName = relSw;
            inFileName = drelSw;
            outFileNameLevel = rellSw;
            inFileNameLevel = drellSw;
        }// ends switchs
        if(router)
        {
            outFileName = relR;
            inFileName = drelR;
            outFileNameLevel = rellR;
            inFileNameLevel = drellR;
        }//ends Router
        if(server)
        {
            outFileName = relS;
            inFileName = drelS;
            outFileNameLevel = rellS;
            inFileNameLevel = drellS;
        }//ends server
        if(other)
        {
            outFileName =relO;
            inFileName = drelO;
            outFileNameLevel = rellO;
            inFileNameLevel = drellO;
        }// ends other
        if(references)
        {
            outFileName = relRef;
            inFileName = drelRef;
        }// ends references

// this section copies one file to another file
        if(!references)
    	try{
    	    File infile =new File(inFileNameLevel);
    	    File outfile =new File(outFileNameLevel);
 
    	    instream = new FileInputStream(infile);
    	    outstream = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	outstream.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
            
            
    	    instream.close();
    	    outstream.close();

 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
        // this section copies on file to another for level
        try{
    	    File infile =new File(inFileName);
    	    File outfile =new File(outFileName);
 
    	    instreamLevel = new FileInputStream(infile);
    	    outstreamLevel = new FileOutputStream(outfile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*copying the contents from input stream to
    	     * output stream using read and write methods
    	     */
    	    while ((length = instreamLevel.read(buffer)) > 0){
    	    	outstreamLevel.write(buffer, 0, length);
    	    }

    	    //Closing the input/output file streams
            
            
    	    instreamLevel.close();
    	    outstreamLevel.close();

    	    
 
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }       

/***********This Section calls readIn to redisplay sections*******/
        if(switchs)
        {
            defaultReadIn();
            //readInStream(relSw,rellSw);
           
        }// ends if
        if(other)
        {
            defaultReadIn();
            //readInStream(relO,rellO);
          
        }// ends if
        if(computer)
        {
            defaultReadIn();
           
        }// ends if
        if(wifi)
        {
            defaultReadIn();
           
        }
        if(server)
        {
            defaultReadIn();
            
        }// ends if
        if(references)
        {
            readIn(relRef);
        }// ends if
        if(router)
        {
           defaultReadIn();
           
        }// ends if

}
   
    private void readInStream(String filename, String levelname) throws MalformedURLException, IOException//, IOException
    {
/**************Variables ****************/
       InputStream in = getClass().getResourceAsStream(filename);
       BufferedReader input = new BufferedReader(new InputStreamReader(in));
       InputStream lin = getClass().getResourceAsStream(levelname);
       BufferedReader linput = new BufferedReader(new InputStreamReader(lin));
       String textFieldReadable = "";
       String tfr = "";
       String ltextFieldReadable = "";
       String ltfr = "";
       computerSize = 0;
       routerSize = 0;
       serverSize = 0;
       otherSize = 0;
       switchSize = 0;
       wifiSize = 0;
       referenceSize = 0;
       listSw.clear();
       listW.clear();
       listO.clear();
       listR.clear();
       listRef.clear();
       listS.clear();
       listpc.clear();
       textArea1.setText("");    
       levelNumComputer = 0;
       levelNumRouter = 0;
       levelNumServer = 0;
       levelNumOther = 0;
       levelNumSwitch = 0;
       levelNumWifi = 0;
       levelSw.clear();
       levelW.clear();
       levelO.clear();
       levelR.clear();
       levelRef.clear();
       levelS.clear();
       levelpc.clear();

/***************Try to catch the file trying to open**************/

    
       try {
            while (ltextFieldReadable != null){
               
                ltextFieldReadable = linput.readLine();
                if(!(ltextFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    ltfr = ltextFieldReadable;
                     if(computer)
                        levelpc.add(ltfr); 
                    if(router)
                          levelR.add(ltfr);
                    if(server)
                        levelS.add(ltfr);
                    if(switchs)
                        levelSw.add(ltfr);
                    if(other)
                        levelO.add(ltfr);
                    if(wifi)
                        levelW.add(ltfr);
                }
                
/***********************Gets how big the file is...*************************/
             if(computer)
                    levelNumComputer++;
                if(router)
                    levelNumRouter++;
                if(server)
                    levelNumServer++;
                if(switchs)
                    levelNumSwitch++;
                if(other)
                    levelNumOther++;
                if(wifi)
                    levelNumWifi++;
                
            }// ends while
           
        }// ends try

        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch

        linput.close();
        lin.close();

      

/***************Try to catch the file trying to open**************/

 
       try {
            while (textFieldReadable != null){
               
                textFieldReadable = input.readLine();
                if(!(textFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    tfr = textFieldReadable;
                    if(computer)
                        listpc.add(tfr); 
                    if(router)
                        listR.add(tfr);
                    if(server)
                        listS.add(tfr);
                    if(switchs)     
                        listSw.add(tfr);   
                    if(other)
                        listO.add(tfr);
                    if(wifi)
                        listW.add(tfr);
                    if(references)
                        listRef.add(tfr);
                }
                
/***********************Gets how big the file is...*************************/
                if(computer)
                    computerSize++;
                if(router)
                    routerSize++;
                if(server)
                    serverSize++;
                if(switchs)
                    switchSize++;
                if(other)
                    otherSize++;
                if(wifi)
                    wifiSize++;
                if(references)
                    referenceSize++;
                
            }// ends while

            input.close();
            in.close();
        }// ends try

        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch; 
       
      // if(!add )
      // {
   
         printOut();
      // }
      
    }    
    private void yes() throws IOException, URISyntaxException {
      
            // if user fines what they are looking for
            if(reset || save)
                textArea1.setEnabled(false);
            if(add){
                textArea1.setEnabled(true);
                levelUp.setText("");
                textArea1.setText("");
            }
            textArea1.setBackground(Color.LIGHT_GRAY);
            no = false;
            if(add)
                addButton.setEnabled(false);
            if(references)
                addButton.setEnabled(true);
            else
            {
                addedLevel.setBackground(new java.awt.Color(255,255,255));
                addedLevel.setEnabled(true);
            }
            if(!add && !train && !rule && !save && !reset && !references)
                question.setText(" Glad to be helpful.");
            /***********This is when the user is adding something***/
            if(add)
            {
                addButton.setEnabled(false);
                resetButton.setEnabled(false);
                saveButton.setEnabled(true);
                yesButton.setEnabled(false);
                noButton.setEnabled(false);
                textArea1.setEditable(true);
                textArea1.setBackground(Color.WHITE);
                // add section
            }
// if saving            
            if(save)
            {
                stringEnter = textArea1.getText();
                userLevel = addedLevel.getText();
                addToFile();
                /***********************Reads in wired Computer information*******************/
                if(computer)
                {
                   
                    if(levelCounterC <= levelNumComputer)
                        levelCounterC++;
                    else
                        levelCounterC = levelNumComputer;
                    if(theCounterC <= computerSize)
                        theCounterC++;
                    else
                        theCounterC = computerSize;
                    
                } // ends computer if
                /***********************Reads in Wifi information*******************/
                if(wifi)
                {
                    
                    if(levelCounterW <= levelNumWifi)
                        levelCounterW++;
                    else
                        levelCounterW = levelNumWifi;
                    if(theCounterW <= wifiSize)
                        theCounterW++;
                    else
                        theCounterW = wifiSize;
                }
                /***********************Reads in Router information*******************/
                if(router)
                {
                  
                    if(levelCounterR <= levelNumRouter)
                        levelCounterR++;
                    else
                        levelCounterR = levelNumRouter;
                    if(theCounterR <= routerSize)
                        theCounterR++;
                    else
                        theCounterR = routerSize;
                    
                }
                /***********************Reads in Switch information*******************/
                if(switchs)
                {
                  
                        if(theCounterSw <= switchSize)
                            theCounterSw++;
                        else
                            theCounterSw = switchSize;
                        if(levelCounterSw <= levelNumSwitch)
                            levelCounterSw++;
                        else
                            levelCounterSw = levelNumSwitch;

                }
                /***********************Reads in Server information*******************/
                if(server)
                {
                   
                    if(levelCounterS <= levelNumServer)
                        levelCounterS++;
                    else
                        levelCounterS = levelNumServer;
                    if(theCounterS <= serverSize)
                        theCounterS++;
                    else
                        theCounterS = serverSize;
                }
                /***********************Reads in Other information*******************/
                if(other)
                {
                   
                    if(levelCounterO <= levelNumOther)
                        levelCounterO++;
                    else
                        levelCounterO = levelNumOther;
                    if(theCounterO <= otherSize)
                        theCounterO++;
                    else
                        theCounterO = otherSize;
                }
                /***********************Reads in References information*******************/
                if(references)
                {
                    yesButton.setEnabled(false);
                    noButton.setEnabled(false);
                    question.setText("");
                    
                        readIn(relRef);

                }
                
                /************************Tells user what to do to ***************************/
                String input;
                if(!references){
                    levelUp.setText("");
                    input = " Type in the area below to add dont hit enter unless adding more than one step." ;
                    input = input + "In box above add the level Help desk, IT, Admin and Up for level.";
                    question.setFont(new java.awt.Font("Monospaced", 2, 10));
                    question.setText(input);
                }
                else if(references){
                    input = " Type in the area below the section name then hit enter. Then type the in the references you are adding." ;
                    question.setFont(new java.awt.Font("Monospaced", 2, 10));
                    question.setText(input);
                }
            }
      /***********************End of the saving section*/
            if(save || reset)
            {
                // tabs allowed to be touched.
                if(rule)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(switchs)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(false);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(wifi)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(false);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(computer)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(false);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(router)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(false);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(server)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(false);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(other)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(false);
                    Training.setEnabled(true);
                    References.setEnabled(true);
                }
                if(references)
                {
                    Rules.setEnabled(true);
                    Switch.setEnabled(true);
                    Wifi.setEnabled(true);
                    Wired.setEnabled(true);
                    Router.setEnabled(true);
                    Server.setEnabled(true);
                    Other.setEnabled(true);
                    Training.setEnabled(true);
                    References.setEnabled(false);
                }
                addedLevel.setBackground(Color.LIGHT_GRAY);
                question.setText("Reset Complete.");
            }
            /*************************If users is saving file************************/
            if(save)
            {
                /*************************Resting textArea to not editable question to
                 * nothing and save to be disabled**/
                question.setText("");
                addedLevel.setBackground(Color.LIGHT_GRAY);
                addedLevel.setEnabled(false);
                addButton.setEnabled(true);
                /************************* fines which section is to be save at
                 *************/
                if(switchs)
                    saveSwitch = true;
                if(other)
                    saveOther = true;
                if(wifi)
                    saveWifi = true;
                if(router)
                    saveRouter = true;
                if(server)
                    saveServer = true;
                if(computer)
                    saveWired = true;
                /************************This calls add to file which adds
                 * the text to the file*****/

                addedLevel.setBackground(Color.LIGHT_GRAY);
                addedLevel.setText("");                     
                addButton.setEnabled(true);
                saveButton.setEnabled(false);
                resetButton.setEnabled(true);
                exitButton.setEnabled(true);
                addedLevel.setEditable(false);
                addedLevel.setText("");
                addedLevel.setBackground(Color.LIGHT_GRAY);
                addButton.setEnabled(true);
                addedLevel.setText("");
              
                    if(switchs)
                    {
                        Switch.setEnabled(false);
                        if(saveSwitch){
                            saveSwitch = false; 
                        }
                        printOut();   
                    }
                    if(wifi)
                    {
                        Wifi.setEnabled(false);
                        if(saveWifi){
                            saveWifi = false; 
                        }
                        printOut();   
                    }
                    if(other)
                    {
                        Other.setEnabled(false);
                        if(saveOther){
                            saveOther = false; 
                        }
                        printOut();   
                    }
                    if(computer)
                    {
                        Wired.setEnabled(false);
                        if(saveWired){
                            saveWired = false; 
                        }
                        printOut();   
                    }
                    if(references){
                        readIn(relRef);
                        question.setText("");
                    }
                    
                    if(router)
                    {
                        Router.setEnabled(false);
                        if(saveRouter){
                            saveRouter = false; 
                        }
                        printOut();   
                    }
                    if(server)
                    {
                        Server.setEnabled(false);
                        if(saveServer){
                            saveServer = false; 
                        }
                        printOut();   
                    }
                    
                save = false;
            }// ends save
            if(reset)
            {
                    addButton.setEnabled(true);
                    addedLevel.setText("");
                    Reset();       
                    saveButton.setEnabled(false);
                    resetButton.setEnabled(true);
                    exitButton.setEnabled(true);
            } 

    }
    private void no() throws IOException{
                         
    // Variables ==================================
        no = true;  
        yes = false;
        String temp = "";
        autoDisplay = false; 
        if(reset || save || add){
            textArea1.setEnabled(false);
            textArea1.setBackground(Color.LIGHT_GRAY);
            addedLevel.setBackground(Color.LIGHT_GRAY);
            addedLevel.setEnabled(false);
          // tabs allowed to be touched. Except help.
            Rules.setEnabled(true);
            Switch.setEnabled(true);
            Wifi.setEnabled(true);
            Wired.setEnabled(true);
            Router.setEnabled(true);
            Server.setEnabled(true);
            Other.setEnabled(true);
            Training.setEnabled(true);
            References.setEnabled(true);
            addButton.setEnabled(true);
              /***********************Reads in Switch information*******************/ 
            if(switchs)
            {
                    //normalReadIn();
                    readInStream(relSw, rellSw); 
                    Switch.doClick();
                   
            }
            /***********************Reads in Switch information*******************/  
           if(wifi)
           {
               
                   readInStream(relW,rellW); 
                   Wifi.doClick();
           }  

              /***********************Reads in Switch information*******************/
              if(computer)
              {
                
                       readInStream(relCom,rellCom);  
                       Wired.doClick();
              }
              /***********************Reads in Switch information*******************/  
              if(router)
              {
 
                      readInStream(relR,rellR); 
                      Router.doClick();

    
              }
              /***********************Reads in Switch information*******************/ 
              if(server)
              {
           
                      readInStream(relS,rellS); 
                      Server.doClick();
     
              }
              /***********************Reads in Switch information*******************/  
              if(other)
              {
               
                      readInStream(relO,rellO); 
                      Other.doClick();

              }

                 

         }

/***********************Computer*******************/    
    if(computer && !computerEnd)
       {
            
            try {
                readInStream(relCom, rellCom);
                if(theCounterC <= computerSize)
                    theCounterC++;
                else
                    theCounterC= computerSize;
                
                if(levelCounterC < levelNumComputer)
                    levelCounterC++;
                else
                    levelCounterC = levelNumComputer;
                
                readInStream(relCom, rellCom);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
/***********************Computer*******************/    
    if(wifi && !wifiEnd)
       {
            
            try {
                readInStream(relW, rellW);
                if(theCounterW <= wifiSize)
                    theCounterW++;
                else
                    theCounterW = wifiSize;
                
                if(levelCounterW < levelNumWifi)
                    levelCounterW++;
                else
                    levelCounterW = levelNumWifi;
                
                readInStream(relW, rellW);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
/***********************Router*******************/  
    if(router && !routerEnd)
       {
            
            try {
                readInStream(relR, rellR);
                if(theCounterR <= routerSize)
                    theCounterR++;
                else
                    theCounterR = routerSize;
                
                if(levelCounterR < levelNumRouter)
                    levelCounterR++;
                else
                    levelCounterR = levelNumSwitch;
                
                readInStream(relR, rellR);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
/***********************Switch*******************/  
       if(switchs && !switchsEnd)
       {
            
            try {
                readInStream(relSw, rellSw);
                if(theCounterSw <= switchSize)
                    theCounterSw++;
                else
                    theCounterSw = switchSize;
                
                if(levelCounterSw < levelNumSwitch)
                    levelCounterSw++;
                else
                    levelCounterSw = levelNumSwitch;
                
                readInStream(relSw, rellSw);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
       //else if (switchs && switchsEnd)
         //   defaultReadIn();
/***********************Server*******************/  
    if(server && !serverEnd)
       {
            
            try {
                readInStream(relS, rellS);
                if(theCounterS <= serverSize)
                    theCounterS++;
                else
                    theCounterS = serverSize;
                
                if(levelCounterS < levelNumServer)
                    levelCounterS++;
                else
                    levelCounterS = levelNumServer;
                
                readInStream(relS, rellS);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
/***********************Other*******************/   
    else if(other && !otherEnd)
       {
            
            try {
                readInStream(relO, rellO);
                if(theCounterO <= otherSize)
                    theCounterO++;
                else
                    theCounterO = otherSize;
                
                if(levelCounterO < levelNumOther)
                    levelCounterO++;
                else
                    levelCounterO = levelNumOther;
                
                readInStream(relO, rellO);
            } catch (IOException ex) {
                Logger.getLogger(troubleshootUI.class.getName()).log(Level.SEVERE, null, ex);
            }

       }
       
        if(reset)
        {
            saveButton.setEnabled(false);
            reset = false;
        }
        if(add)
        {
            add = false;
        }
        if(save)
            save = false;
    }                         
// Reset button 

    private void callSwitch() throws IOException{

        this.rule = false;
        this.switchs = true;
        this.router = false;
        this.server = false;
        this.other = false;
        this.computer = false;
        this.wifi = false;
        this.train = false;
        this.references = false;
       
        Switch.setForeground(Color.BLUE);
        addButton.setBackground(Color.GRAY);
        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);
        resetButton.setEnabled(false);
        cmdButton.setEnabled(true);
        addButton.setEnabled(false);
        saveButton.setEnabled(false);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        Switch.setBackground(Color.BLACK);
        Switch.setOpaque(true);
        Switch.setSelected(true);
        Switch.setEnabled(false);
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        addedLevel.setText("");
        addedLevel.setEditable(false);
      //  if(firstCallSw){
            readInStream(relSw, rellSw);

    }

    private void callOther() throws IOException{
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = true;
       this.computer = false;
       this.wifi = false;
       this.train = false;
       this.references = false;
        cmdButton.setEnabled(true);
        addButton.setEnabled(false);
        resetButton.setEnabled(false);

        saveButton.setEnabled(false);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        
        addButton.setBackground(Color.GRAY);
        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);
        
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLUE);
        Other.setBackground(Color.BLACK);
        Other.setSelected(true);
        Other.setOpaque(true);
        Other.setEnabled(false);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        
            readInStream(relO, rellO);        // TODO add your handling code here:

    }

    private void callWifi() throws IOException {
            this.rule = false;
            this.switchs = false;
            this.router = false;
            this.server = false;
            this.other = false;
            this.wifi = true;
            this.computer = false;
            this.train = false;
            this.references = false;
            cmdButton.setEnabled(true);
            addButton.setEnabled(false);
            resetButton.setEnabled(false);
            
            saveButton.setEnabled(false);
            yesButton.setEnabled(true);
            noButton.setEnabled(true);
            
            addButton.setBackground(Color.GRAY);
            resetButton.setBackground(Color.GRAY);
            saveButton.setBackground(Color.LIGHT_GRAY);
            yesButton.setBackground(Color.GRAY);
            noButton.setBackground(Color.GRAY);
            cmdButton.setBackground(Color.GRAY);
            
            Rules.setForeground(Color.BLACK);
            Rules.setBackground(Color.LIGHT_GRAY);
            Rules.setOpaque(false);
            Rules.setSelected(false);
            Rules.setEnabled(true);
            
            Switch.setForeground(Color.BLACK);
            Switch.setBackground(Color.LIGHT_GRAY);
            Switch.setOpaque(false);
            Switch.setSelected(false);
            Switch.setEnabled(true);
            
            Wifi.setForeground(Color.BLUE);
            Wifi.setBackground(Color.BLACK);
            Wifi.setSelected(true);
            Wifi.setOpaque(true);
            Wifi.setEnabled(false);
            
            Wired.setForeground(Color.BLACK);
            Wired.setBackground(Color.LIGHT_GRAY);
            Wired.setSelected(false);
            Wired.setOpaque(false);
            Wired.setEnabled(true);
            
            Router.setForeground(Color.BLACK);
            Router.setBackground(Color.LIGHT_GRAY);
            Router.setSelected(false);
            Router.setOpaque(false);
            Router.setEnabled(true);
            
            
            Server.setForeground(Color.BLACK);
            Server.setBackground(Color.LIGHT_GRAY);
            Server.setSelected(false);
            Server.setOpaque(false);
            Server.setEnabled(true);
            
            Other.setForeground(Color.BLACK);
            Other.setBackground(Color.LIGHT_GRAY);
            Other.setSelected(false);
            Other.setOpaque(false);
            Other.setEnabled(true);
            
            References.setForeground(Color.BLACK);
            References.setBackground(Color.LIGHT_GRAY);
            References.setSelected(false);
            References.setOpaque(false);
            References.setEnabled(true);
            
            Training.setForeground(Color.BLACK);
            Training.setBackground(Color.LIGHT_GRAY);
            Training.setSelected(false);
            Training.setOpaque(false);
            Training.setEnabled(true);
            
            
            readInStream(relW, rellW);         // TODO add your handling code here:

    }

    private void callWired() throws IOException {
       //Variables      
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = false;
       this.other = false;
       this.wifi = false;
       this.computer = true;
       this.train = false;
       this.add = false;
       this.references = false;
        cmdButton.setEnabled(true);
        addButton.setEnabled(false);
        resetButton.setEnabled(false);

        saveButton.setEnabled(false);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        
        addButton.setBackground(Color.GRAY);
        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);
        
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLUE);
        Wired.setBackground(Color.BLACK);
        Wired.setSelected(true);
        Wired.setOpaque(true);
        Wired.setEnabled(false);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        readInStream(relCom,rellCom);

    }

    private void callRouter() throws IOException{
       this.rule = false;
       this.switchs = false;
       this.router = true;
       this.server = false;
       this.other = false;
       this.computer = false; 
       this.wifi = false;
       this.train = false;
       this.references = false;
        cmdButton.setEnabled(true);
        addButton.setEnabled(false);
        resetButton.setEnabled(false);

        saveButton.setEnabled(false);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        
        addButton.setBackground(Color.GRAY);
        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);
        
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLUE);
        Router.setBackground(Color.BLACK);
        Router.setSelected(true);
        Router.setOpaque(true);
        Router.setEnabled(false);
        
        
        Server.setForeground(Color.BLACK);
        Server.setBackground(Color.LIGHT_GRAY);
        Server.setSelected(false);
        Server.setOpaque(false);
        Server.setEnabled(true);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        
        
            readInStream(relR,rellR);        // TODO add your handling code here:
      
          
    }

    private void callServer() throws IOException {
       this.rule = false;
       this.switchs = false;
       this.router = false;
       this.server = true;
       this.other = false;
       this.computer = false;
       this.wifi = false;
       this.train = false;
        cmdButton.setEnabled(true);
        addButton.setEnabled(false);
        resetButton.setEnabled(false);

        saveButton.setEnabled(false);
        yesButton.setEnabled(true);
        noButton.setEnabled(true);
        
        addButton.setBackground(Color.GRAY);
        resetButton.setBackground(Color.GRAY);
        saveButton.setBackground(Color.LIGHT_GRAY);
        yesButton.setBackground(Color.GRAY);
        noButton.setBackground(Color.GRAY);
        cmdButton.setBackground(Color.GRAY);
        
        Rules.setForeground(Color.BLACK);
        Rules.setBackground(Color.LIGHT_GRAY);
        Rules.setOpaque(false);
        Rules.setSelected(false);
        Rules.setEnabled(true);
        
        Switch.setForeground(Color.BLACK);
        Switch.setBackground(Color.LIGHT_GRAY);
        Switch.setOpaque(false);
        Switch.setSelected(false);
        Switch.setEnabled(true);
        
        Wifi.setForeground(Color.BLACK);
        Wifi.setBackground(Color.LIGHT_GRAY);
        Wifi.setSelected(false);
        Wifi.setOpaque(false);
        Wifi.setEnabled(true);
        
        Wired.setForeground(Color.BLACK);
        Wired.setBackground(Color.LIGHT_GRAY);
        Wired.setSelected(false);
        Wired.setOpaque(false);
        Wired.setEnabled(true);
        
        Router.setForeground(Color.BLACK);
        Router.setBackground(Color.LIGHT_GRAY);
        Router.setSelected(false);
        Router.setOpaque(false);
        Router.setEnabled(true);
        
        Server.setForeground(Color.BLUE);
        Server.setBackground(Color.BLACK);
        Server.setSelected(true);
        Server.setOpaque(true);
        Server.setEnabled(false);
        
        Other.setForeground(Color.BLACK);
        Other.setBackground(Color.LIGHT_GRAY);
        Other.setSelected(false);
        Other.setOpaque(false);
        Other.setEnabled(true);
        
        References.setForeground(Color.BLACK);
        References.setBackground(Color.LIGHT_GRAY);
        References.setSelected(false);
        References.setOpaque(false);
        References.setEnabled(true);
        
        Training.setForeground(Color.BLACK);
        Training.setBackground(Color.LIGHT_GRAY);
        Training.setSelected(false);
        Training.setOpaque(false);
        Training.setEnabled(true);
        
      readInStream(relS,rellS);

      
    }
    private void readStream(String filename, String levelname) throws MalformedURLException, IOException//, IOException
    {
/**************Variables ****************/
       InputStream in = getClass().getResourceAsStream(filename);
       BufferedReader input = new BufferedReader(new InputStreamReader(in));
       InputStream lin = getClass().getResourceAsStream(levelname);
       BufferedReader linput = new BufferedReader(new InputStreamReader(lin));
       String textFieldReadable = "";
       String tfr = "";
       computerSize = 0;
       routerSize = 0;
       serverSize = 0;
       otherSize = 0;
       switchSize = 0;
       wifiSize = 0;
       referenceSize = 0;
       listSw.clear();
       listW.clear();
       listO.clear();
       listR.clear();
       listRef.clear();
       listS.clear();
       listpc.clear();
       textArea1.setText("");    
       String ltextFieldReadable = "";
       String ltfr = "";
       levelNumComputer = 0;
       levelNumRouter = 0;
       levelNumServer = 0;
       levelNumOther = 0;
       levelNumSwitch = 0;
       levelNumWifi = 0;
       levelSw.clear();
       levelW.clear();
       levelO.clear();
       levelR.clear();
       levelRef.clear();
       levelS.clear();
       levelpc.clear();

/***************Try to catch the file trying to open**************/

    
       try {
            while (ltextFieldReadable != null){
               
                ltextFieldReadable = linput.readLine();
                if(!(ltextFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    ltfr = ltextFieldReadable;
                     if(computer)
                        levelpc.add(ltfr); 
                    if(router)
                          levelR.add(ltfr);
                    if(server)
                        levelS.add(ltfr);
                    if(switchs)
                        levelSw.add(ltfr);
                    if(other)
                        levelO.add(ltfr);
                    if(wifi)
                        levelW.add(ltfr);
                }
                
/***********************Gets how big the file is...*************************/
             if(computer)
                    levelNumComputer++;
                if(router)
                    levelNumRouter++;
                if(server)
                    levelNumServer++;
                if(switchs)
                    levelNumSwitch++;
                if(other)
                    levelNumOther++;
                if(wifi)
                    levelNumWifi++;
                
            }// ends while
           
        }// ends try

        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch

      

/***************Try to catch the file trying to open**************/

 
       try {
            while (textFieldReadable != null){
               
                textFieldReadable = input.readLine();
                if(!(textFieldReadable == (null)))
                {  
/****************************Puts file in the proper list...******************/
                    tfr = textFieldReadable;
                    if(computer)
                        listpc.add(tfr); 
                    if(router)
                        listR.add(tfr);
                    if(server)
                        listS.add(tfr);
                    if(switchs)     
                        listSw.add(tfr);   
                    if(other)
                        listO.add(tfr);
                    if(wifi)
                        listW.add(tfr);
                    if(references)
                        listRef.add(tfr);
                }
                
/***********************Gets how big the file is...*************************/
                if(computer)
                    computerSize++;
                if(router)
                    routerSize++;
                if(server)
                    serverSize++;
                if(switchs)
                    switchSize++;
                if(other)
                    otherSize++;
                if(wifi)
                    wifiSize++;
                if(references)
                    referenceSize++;
                
            }// ends while
            input.close();
             linput.close();
             lin.close();
             in.close();
        }// ends try

        catch (IOException ex) {
            System.out.println("unkownerror");
        } // ends catch; 
       
      // if(!add )
      // {
     
         printOut();
      // }
      
    }   
    private void defaultReadIn() throws IOException{
        /**********************This clears only the list that is being read in by the text.***/
            String t = "";
            String lt = "";
            ArrayList sublist = new ArrayList();
            if (switchs)
            {
                
              for(int i = 0; i < defaultSizeSw;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listSw.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listSw.get(i) + "\n"; 

		}

                lt = levelSw.get(defaultSizeSw-1);
                textArea1.setText(t);
                levelUp.setText(lt);

            }
            if (computer)
            {
              for(int i = 0; i < defaultSizeC;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listpc.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listpc.get(i) + "\n"; 

		}
                lt = levelpc.get(defaultSizeC-1);
                textArea1.setText(t);
                levelUp.setText(lt);
            }
             if (wifi)
            {
              for(int i = 0; i < defaultSizeW;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listW.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listW.get(i) + "\n"; 

		}
                lt = lt + levelW.get(defaultSizeW-1);
                textArea1.setText(t);
                levelUp.setText(lt);
            } 
            
            if (server)
            {
              for(int i = 0; i < defaultSizeS;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listS.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listS.get(i) + "\n"; 

		}
                lt = levelS.get(defaultSizeS-1);
                textArea1.setText(t);
                levelUp.setText(lt);
            }  
           System.out.println("hi");
            if (router)
            {
              for(int i = 0; i < defaultSizeR;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listR.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listR.get(i) + "\n"; 

		}
              
                lt = levelR.get(defaultSizeR-1);
                textArea1.setText(t);
                levelUp.setText(lt);
                
            }
            if (other)
            {
               for(int i = 0; i < defaultSizeO;i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listO.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listO.get(i) + "\n"; 

		}
                lt = levelO.get(defaultSizeO -1);
                 
                textArea1.setText(t);
                levelUp.setText(lt);
            }
              if (references)
            {
                readIn(relRef);
            }    
 
    }
    private void normalReadIn() throws IOException{
        /**********************This clears only the list that is being read in by the text.***/
            String t = "";
            String lt = "";
            if (switchs)
            {
              
                for(int i = 0; i < listSw.size();i++)
		{
                    if(i < 1)
                        t = t + "\n  " + listSw.get(i) + "\n";  
                    else
                        t = t + "\n  " + (i) +") " + listSw.get(i) + "\n"; 
		}
                System.out.println(t);
//                lt = levelSw.get(listSw.size());
                textArea1.setText(t);
                levelUp.setText(lt);

            }
            if (computer)
            {
                for(int i = 0; i < defaultSizeC;i++)
		{
                    t = t + listpc.get(i);
                    lt = lt + levelpc.get(i);
		}
                lt = levelpc.get(defaultSizeC);
                textArea1.setText(t);
                levelUp.setText(lt);
            }
             if (wifi)
            {
                for(int i = 0; i < listW.size();i++)
		{
                    t = t + listW.get(i);
                    lt = lt + levelW.get(i);
		}
                textArea1.setText(t);
                levelUp.setText(lt);
            } 
            
            if (server)
            {
                for(int i = 0; i < defaultSizeS;i++)
		{
                    t = t + listS.get(i);
                    
		}
                lt = levelS.get(defaultSizeS);
                textArea1.setText(t);
                levelUp.setText(lt);
            }  
            if (router)
            {
                for(int i = 0; i < defaultSizeR;i++)
		{
                    t = t + listR.get(i);
                   
		}
                textArea1.setText(t);
                levelUp.setText(lt);
                lt = levelS.get(defaultSizeR);
            }
            if (other)
            {
                for(int i = 0; i < defaultSizeO;i++)
		{
                    t = t + listO.get(i);
                    
		}
                lt = levelS.get(defaultSizeO);
                textArea1.setText(t);
                levelUp.setText(lt);
            }
              if (references)
            {
                readIn(relRef);
            }    
 
    }
}
