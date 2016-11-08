/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Entities.Alarm;
import static IHM.Alarms.alarms;
import Time_MP3.MP3Player;
import dao.AlarmMetier;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Tarik
 */
public class Edit extends javax.swing.JFrame {
  
   static Alarm alarm=new Alarm();
    String song="",path="";
 AlarmMetier Am=new AlarmMetier();
 MP3Player track=new MP3Player();
 Image playImage,stopImage;

    /**
     * Creates new form AddEdit
     */
    public Edit(Alarm A) {
       initComponents();
          // centrer l'app
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
               this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        // eliminer le bouton X le traitememet de fremeture de cette frame gere par cancel button
                setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

          alarm=A;
          initValues();
            this.setTitle("Wake Me UP");
                    
      
          try {
  
    playImage = ImageIO.read(getClass().getResource("../IMG/play.png"));
    
    stopImage = ImageIO.read(getClass().getResource("../IMG/stop.jpg"));

     }
   
   
      catch (IOException ex) {}
          butPlay.setName("play");
        
        
    }
    
    
    
      
    public String checked()
    {
         String days="";
         
         if(mon.isSelected())
             days+="2-";
        
         if(tue.isSelected())
             days+="3-";
         
         if(wed.isSelected())
             days+="4-";
         
         if(thur.isSelected())
             days+="5-";
         
         if(fri.isSelected())
             days+="6-";
      
         if(sat.isSelected())
             days+="7-";
         
         if(sun.isSelected())
             days+="1-";
        
        return days;
    }
     public void Check(String S)
    {
          StringTokenizer St=new StringTokenizer(S,"-");
        
            while(St.hasMoreTokens())
            {
                switch(St.nextToken())
                {
                    case "1":  sun.setSelected(true);
                               break;
                    case "2":  mon.setSelected(true);
                               break;
                    case "3":  tue.setSelected(true);
                               break;
                    case "4":  wed.setSelected(true);
                               break;
                    case "5":  thur.setSelected(true);
                               break;
                    case "6":  fri.setSelected(true);
                               break;
                    case "7":  sat.setSelected(true);
                               break;
                    
                    
                }
  
            }
    }
     public void DaysChecked(String S)
    {
          StringTokenizer St=new StringTokenizer(S,"-");
        
            while(St.hasMoreTokens())
            {
                switch(St.nextToken())
                {
                    case "1":  sun.setSelected(true);
                               break;
                    case "2":  mon.setSelected(true);
                               break;
                    case "3":  tue.setSelected(true);
                               break;
                    case "4":  wed.setSelected(true);
                               break;
                    case "5":  thur.setSelected(true);
                               break;
                    case "6":  fri.setSelected(true);
                               break;
                    case "7":  sat.setSelected(true);
                               break;
                    
                    
                }
  
            }
    }
    
     public void initValues()
     {
      
         txtAlarm.setText(alarm.getNom());
         txtHour.setValue(alarm.getHour());
         txtMin.setValue(alarm.getMin());
         Check(alarm.getDays());
         snoozeTemps.setSelectedItem((""+alarm.getSnooze_temps()));
         labelDisplay.setText(alarm.getPath());
         path=alarm.getPath();
         txtmemo.setText(alarm.getMemo());
       
         
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDisplay = new javax.swing.JLabel();
        txtAlarm = new javax.swing.JTextField();
        butchooser = new javax.swing.JButton();
        butSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        butPlay = new javax.swing.JButton();
        snoozeTemps = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        mon = new javax.swing.JCheckBox();
        tue = new javax.swing.JCheckBox();
        sat = new javax.swing.JCheckBox();
        wed = new javax.swing.JCheckBox();
        thur = new javax.swing.JCheckBox();
        sun = new javax.swing.JCheckBox();
        fri = new javax.swing.JCheckBox();
        butCancel = new javax.swing.JButton();
        txtHour = new javax.swing.JSpinner();
        txtMin = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmemo = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setMinimumSize(new java.awt.Dimension(460, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(460, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(460, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 500));

        jLabel4.setBackground(new java.awt.Color(245, 245, 245));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText(" :");

        jLabel5.setBackground(new java.awt.Color(245, 245, 245));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel5.setText("Répeter(min)");

        labelDisplay.setBackground(new java.awt.Color(245, 245, 245));
        labelDisplay.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        labelDisplay.setText("          Choisir Sonnerie");

        txtAlarm.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtAlarm.setForeground(new java.awt.Color(102, 102, 102));
        txtAlarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlarmActionPerformed(evt);
            }
        });

        butchooser.setBackground(new java.awt.Color(102, 102, 102));
        butchooser.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        butchooser.setForeground(new java.awt.Color(255, 255, 255));
        butchooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add2.jpg"))); // NOI18N
        butchooser.setMaximumSize(new java.awt.Dimension(50, 50));
        butchooser.setMinimumSize(new java.awt.Dimension(50, 50));
        butchooser.setPreferredSize(new java.awt.Dimension(50, 50));
        butchooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butchooserActionPerformed(evt);
            }
        });

        butSave.setBackground(new java.awt.Color(245, 245, 245));
        butSave.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        butSave.setForeground(new java.awt.Color(102, 102, 102));
        butSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.PNG"))); // NOI18N
        butSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butSave.setOpaque(false);
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(245, 245, 245));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel1.setText("Temps");

        butPlay.setBackground(new java.awt.Color(102, 102, 102));
        butPlay.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        butPlay.setForeground(new java.awt.Color(255, 255, 255));
        butPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/play.png"))); // NOI18N
        butPlay.setMaximumSize(new java.awt.Dimension(50, 50));
        butPlay.setMinimumSize(new java.awt.Dimension(50, 50));
        butPlay.setPreferredSize(new java.awt.Dimension(50, 50));
        butPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPlayActionPerformed(evt);
            }
        });

        snoozeTemps.setBackground(new java.awt.Color(245, 245, 245));
        snoozeTemps.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        snoozeTemps.setForeground(new java.awt.Color(102, 102, 102));
        snoozeTemps.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "3", "5", "7", "10" }));

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel2.setText("Nom");

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "chaque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        mon.setBackground(new java.awt.Color(245, 245, 245));
        mon.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        mon.setText("lundi");

        tue.setBackground(new java.awt.Color(245, 245, 245));
        tue.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        tue.setText("mardi");

        sat.setBackground(new java.awt.Color(245, 245, 245));
        sat.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        sat.setText("samedi");

        wed.setBackground(new java.awt.Color(245, 245, 245));
        wed.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        wed.setText("mercredi");

        thur.setBackground(new java.awt.Color(245, 245, 245));
        thur.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        thur.setText("jeudi");

        sun.setBackground(new java.awt.Color(245, 245, 245));
        sun.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        sun.setText("dimanche");

        fri.setBackground(new java.awt.Color(245, 245, 245));
        fri.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        fri.setText("vendredi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(sat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fri, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(thur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(wed, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thur, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fri, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sun, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        butCancel.setBackground(new java.awt.Color(245, 245, 245));
        butCancel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        butCancel.setForeground(new java.awt.Color(102, 102, 102));
        butCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/cancel.PNG"))); // NOI18N
        butCancel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        butCancel.setOpaque(false);
        butCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelActionPerformed(evt);
            }
        });

        txtHour.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtHour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));
        txtHour.setMaximumSize(new java.awt.Dimension(50, 50));
        txtHour.setMinimumSize(new java.awt.Dimension(50, 50));
        txtHour.setPreferredSize(new java.awt.Dimension(50, 50));

        txtMin.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        txtMin.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));
        txtMin.setMaximumSize(new java.awt.Dimension(50, 50));
        txtMin.setMinimumSize(new java.awt.Dimension(50, 50));
        txtMin.setPreferredSize(new java.awt.Dimension(50, 50));

        txtmemo.setColumns(20);
        txtmemo.setRows(5);
        jScrollPane1.setViewportView(txtmemo);

        jLabel6.setBackground(new java.awt.Color(245, 245, 245));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jLabel6.setText("Memo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(snoozeTemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtHour, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(butPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butchooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAlarm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtHour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(snoozeTemps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(labelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlarmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlarmActionPerformed

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
 
        
        try{   
               alarm.setNom(txtAlarm.getText());
               alarm.setDays(checked());
               alarm.setHour(Integer.parseInt(txtHour.getValue().toString()));
               alarm.setMin(Integer.parseInt(txtMin.getValue().toString()));
               alarm.setSnooze_temps(Integer.parseInt((String)snoozeTemps.getSelectedItem()));
               alarm.setPath(path);
               alarm.setSnoozedHour(Integer.parseInt(txtHour.getValue().toString()));
               alarm.setSnoozedMin(Integer.parseInt(txtMin.getValue().toString()));
               alarm.setMemo(txtmemo.getText());
                if(Am.exist(alarm))
               {
                   JOptionPane.showMessageDialog(this,"Erreur : description ou l'heure existe deja !");
               }
               else
               Am.Update(alarm);
                
             
        }catch(Exception ex){}
      finally{
            track.Stop();
          this.setVisible(false);
          new Alarms().setVisible(true);
          
      }
      
    }//GEN-LAST:event_butSaveActionPerformed

    private void butPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlayActionPerformed
      if(butPlay.getName().equalsIgnoreCase("play") )
             {
                 track.Stop();
                 butPlay.setIcon(new ImageIcon(playImage));
                 butPlay.setName("pause");
             }
             else
             {
                 track.Play(path);
                  butPlay.setIcon(new ImageIcon(stopImage));
                 butPlay.setName("play");
             }
             
    }//GEN-LAST:event_butPlayActionPerformed

    private void butchooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butchooserActionPerformed
 
        FileNameExtensionFilter filter= new FileNameExtensionFilter("MP3 FILES","mp3","mpeg3");
       JFileChooser chooser=new JFileChooser("Sounds");
       chooser.addChoosableFileFilter(filter);
       int val=chooser.showOpenDialog(null);
       if(val==JFileChooser.APPROVE_OPTION)
       {
           File monFile=chooser.getSelectedFile();
           path=monFile+" ";
           
           song=chooser.getSelectedFile().getName();
           labelDisplay.setText(song);
          
           
       }
    }//GEN-LAST:event_butchooserActionPerformed

    private void butCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelActionPerformed
       track.Stop();
        this.setVisible(false);
          new Alarms().setVisible(true);
    }//GEN-LAST:event_butCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit(alarm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancel;
    private javax.swing.JButton butPlay;
    private javax.swing.JButton butSave;
    private javax.swing.JButton butchooser;
    private javax.swing.JCheckBox fri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDisplay;
    private javax.swing.JCheckBox mon;
    private javax.swing.JCheckBox sat;
    private javax.swing.JComboBox snoozeTemps;
    private javax.swing.JCheckBox sun;
    private javax.swing.JCheckBox thur;
    private javax.swing.JCheckBox tue;
    private javax.swing.JTextField txtAlarm;
    private javax.swing.JSpinner txtHour;
    private javax.swing.JSpinner txtMin;
    private javax.swing.JTextArea txtmemo;
    private javax.swing.JCheckBox wed;
    // End of variables declaration//GEN-END:variables
}