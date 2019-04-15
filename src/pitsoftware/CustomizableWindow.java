/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitsoftware;

import eu.hansolo.steelseries.gauges.*;
import eu.hansolo.steelseries.tools.LedColor;
import eu.hansolo.steelseries.tools.Orientation;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.TreeMap;
import javax.swing.JPanel;
import pitsoftware.dialogs.CustomizeGaugeDialog;
import pitsoftware.dialogs.GaugeProperties;

/**
 *
 * @author aribdhuka
 */
public class CustomizableWindow extends javax.swing.JFrame {

    //holds all the gauges
    TreeMap<String, Object> gauges;
    //holds if the form is being edited
    boolean editing;
    //holds if a radial is being added
    boolean addingRadial;
    //holds if a linear is being added
    boolean addingLinear;
    //Holds the data and gauges
    Logger logger;
    
    /**
     * Creates new form CustomizableWindow
     */
    public CustomizableWindow() {
        initComponents();
        //initialize treemap of gauges
        gauges = new TreeMap<>();
        //start with hiding the edit panel and in non edit mode
        editing = false;
        addingRadial = false;
        addingLinear = false;
        editPanel.setVisible(false);
        //generate images for edit panel
        generateEditPanel();
        //create logger
        logger = new Logger();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editPanel = new javax.swing.JPanel();
        radial_editPanel = new javax.swing.JPanel();
        linear_editPanel = new javax.swing.JPanel();
        linearVert_editPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openWindowMenuItem = new javax.swing.JMenuItem();
        saveWindowMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editPanelMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1375, 800));

        editPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));

        radial_editPanel.setBackground(new java.awt.Color(255, 255, 255));
        radial_editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radial_editPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout radial_editPanelLayout = new javax.swing.GroupLayout(radial_editPanel);
        radial_editPanel.setLayout(radial_editPanelLayout);
        radial_editPanelLayout.setHorizontalGroup(
            radial_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        radial_editPanelLayout.setVerticalGroup(
            radial_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        linear_editPanel.setBackground(new java.awt.Color(255, 255, 255));
        linear_editPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        linear_editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linear_editPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout linear_editPanelLayout = new javax.swing.GroupLayout(linear_editPanel);
        linear_editPanel.setLayout(linear_editPanelLayout);
        linear_editPanelLayout.setHorizontalGroup(
            linear_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        linear_editPanelLayout.setVerticalGroup(
            linear_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        linearVert_editPanel.setBackground(new java.awt.Color(255, 255, 255));
        linearVert_editPanel.setPreferredSize(new java.awt.Dimension(99, 100));
        linearVert_editPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linearVert_editPanelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout linearVert_editPanelLayout = new javax.swing.GroupLayout(linearVert_editPanel);
        linearVert_editPanel.setLayout(linearVert_editPanelLayout);
        linearVert_editPanelLayout.setHorizontalGroup(
            linearVert_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );
        linearVert_editPanelLayout.setVerticalGroup(
            linearVert_editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout editPanelLayout = new javax.swing.GroupLayout(editPanel);
        editPanel.setLayout(editPanelLayout);
        editPanelLayout.setHorizontalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radial_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(linear_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(linearVert_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1135, Short.MAX_VALUE))
        );
        editPanelLayout.setVerticalGroup(
            editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editPanelLayout.createSequentialGroup()
                .addGroup(editPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radial_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linear_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(linearVert_editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        openWindowMenuItem.setText("Open Window");
        fileMenu.add(openWindowMenuItem);

        saveWindowMenuItem.setText("Save Window");
        saveWindowMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveWindowMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveWindowMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        editPanelMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editPanelMenuItem.setText("Enable Editing");
        editPanelMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPanelMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(editPanelMenuItem);

        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 678, Short.MAX_VALUE)
                .addComponent(editPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editPanelMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPanelMenuItemActionPerformed
        if(!editing) {
            editing = true;
            editPanel.setVisible(true);
            editPanelMenuItem.setText("Finish Edits");
        } else {
            editing = false;
            addingRadial = false;
            addingLinear = false;
            editPanel.setVisible(false);
            editPanelMenuItem.setText("Enable Editing");
        }
    }//GEN-LAST:event_editPanelMenuItemActionPerformed

    private void radial_editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radial_editPanelMouseClicked
        //Create new panel that can be moved
        //ask for properties: Title, Unit, generate TAG, size, scale, min, max, threshold, invertthreshhold, trackstart, trackstop
        JPanel newPanel = new JPanel();
        newPanel.setSize(100,100);
        newPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if(editing) {
                    JPanel panel = (JPanel) evt.getSource();
                    Point newLocation = evt.getLocationOnScreen();
                    newLocation.x = newLocation.x + panel.getParent().getLocation().x - 50;
                    newLocation.y = newLocation.y + panel.getParent().getLocation().y - 100;
                    panel.setLocation(newLocation);
                    panel.repaint();
                }
            }
        });
        this.add(newPanel);
        newPanel.setVisible(true);
        newPanel.setLocation(10, 10);
        ScaledRadial gauge = (ScaledRadial) createCircularGauge("", "", "", new Dimension(200, 200), 0, 100, 0, false, 0, 0, newPanel);
        String[] tag = new String[] {""};
        GaugeProperties gp = new GaugeProperties(this, true, gauge, tag);
        gp.setVisible(true);
        CustomizeGaugeDialog cgd = new CustomizeGaugeDialog(this, true, gauge);
        cgd.setVisible(true);
        newPanel.add(gauge);
        logger.addGauge(tag[0], gauge);
        repaint();

    }//GEN-LAST:event_radial_editPanelMouseClicked

    private void saveWindowMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveWindowMenuItemActionPerformed
        for(String key : logger.gauges.keySet()) {
            AbstractGauge o = logger.gauges.get(key);
            if(o instanceof ScaledRadial) {
                StringBuilder sb = new StringBuilder();
                //SR\Title\\units\x,y\scale\min,max\warning\inverted?\redlinemin,redlinemax\key\framedesign\backgroundRGB\LEDColor\PointerColor\LCDColor
                sb.append("SR\\");
                sb.append(o.getTitle()).append("\\");
                sb.append(o.getUnitString()).append("\\");
                sb.append(o.getParent().getX()).append(",").append(o.getParent().getY()).append("\\");
                sb.append(((ScaledRadial) o).getScale()).append("\\");
                sb.append(o.getMinValue()).append(",").append(o.getMaxValue()).append("\\");
                sb.append(o.getThreshold()).append("\\");
                sb.append(o.isThresholdBehaviourInverted()).append("\\");
                sb.append(o.getTrackStart()).append(",").append(o.getTrackStop());
                sb.append(key).append("\\");
                sb.append(o.getFrameDesign().toString()).append("\\");
                sb.append(o.getBackground().getRGB()).append("\\");
                sb.append(o.getLedColor().toString()).append("\\");
                sb.append(((ScaledRadial) o).getPointerColor().toString()).append("\\");
                sb.append(((ScaledRadial) o).getLcdColor().toString()).append("\n");
            }
            else if(o instanceof ScaledLinear) {
                StringBuilder sb = new StringBuilder();
                //SL\Title\\units\x,y\scale\min,max\warning\inverted?\redlinemin,redlinemax\key\framedesign\backgroundRGB\LEDColor\PointerColor\LCDColor
                sb.append("SR\\");
                sb.append(o.getTitle()).append("\\");
                sb.append(o.getUnitString()).append("\\");
                sb.append(o.getParent().getX()).append(",").append(o.getParent().getY()).append("\\");
                sb.append(((ScaledRadial) o).getScale()).append("\\");
                sb.append(o.getMinValue()).append(",").append(o.getMaxValue()).append("\\");
                sb.append(o.getThreshold()).append("\\");
                sb.append(o.isThresholdBehaviourInverted()).append("\\");
                sb.append(o.getTrackStart()).append(",").append(o.getTrackStop());
                sb.append(key).append("\\");
                sb.append(o.getFrameDesign().toString()).append("\\");
                sb.append(o.getBackground().getRGB()).append("\\");
                sb.append(o.getLedColor().toString()).append("\\");
                sb.append(((ScaledRadial) o).getPointerColor().toString()).append("\\");
                sb.append(((ScaledRadial) o).getLcdColor().toString()).append("\n");
            }
        }
    }//GEN-LAST:event_saveWindowMenuItemActionPerformed

    private void linearVert_editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linearVert_editPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_linearVert_editPanelMouseClicked

    private void linear_editPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linear_editPanelMouseClicked
        //Create new panel that can be moved
        //ask for properties: Title, Unit, generate TAG, size, scale, min, max, threshold, invertthreshhold, trackstart, trackstop
        JPanel newPanel = new JPanel();
        newPanel.setSize(100,100);
        newPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            @Override
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                if(editing) {
                    JPanel panel = (JPanel) evt.getSource();
                    Point newLocation = evt.getLocationOnScreen();
                    newLocation.x = newLocation.x + panel.getParent().getLocation().x - 50;
                    newLocation.y = newLocation.y + panel.getParent().getLocation().y - 100;
                    panel.setLocation(newLocation);
                    panel.repaint();
                }
            }
        });
        this.add(newPanel);
        newPanel.setVisible(true);
        newPanel.setLocation(10, 10);
        ScaledLinear gauge = createLinearGauge("", "", "", new Dimension(200, 100), 1, 0, 100, 0, false, 0, 0, newPanel);
        String[] tag = new String[] {""};
        GaugeProperties gp = new GaugeProperties(this, true, gauge, tag);
        gp.setVisible(true);

        //TODO: NEW custom dialog
        // CustomizeGaugeDialog cgd = new CustomizeGaugeDialog(this, true, gauge);
        //cgd.setVisible(true);
        newPanel.add(gauge);
        logger.addGauge(tag[0], gauge);
        repaint();
    }//GEN-LAST:event_linear_editPanelMouseClicked

    private void generateEditPanel() {
        createCircularGauge("Engine RPM", "RPMx1K", "RPM", new Dimension(100,100), 1000, 0, 14, 12, false, 10.5, 14, radial_editPanel).setValue(7);
        createLinearGauge("BrakeFront", "PSIx1k", "PSI", new Dimension(200,100), 1, 0, 2, 1, false, 1, 2, linear_editPanel).setValue(.9);
        createLinearGauge("BrakeRear", "PSIx1k", "PSI", new Dimension(99,100), 1, 0, 2, 1, false, 1, 2, linearVert_editPanel).setValue(.9);
    }
    
    //create with default scale
    private Radial createCircularGauge(String title, String unit, String TAG, Dimension size, double min, double max, double threshold, boolean invertThreshold, double trackStart, double trackStop, JPanel parent) {
        return createCircularGauge(title, unit, TAG, size, 1.0, min, max, threshold, invertThreshold, trackStart, trackStop, parent);
    }
    
    private Radial createCircularGauge(String title, String unit, String TAG, Dimension size, double scale, double min, double max, double threshold, boolean invertThreshold, double trackStart, double trackStop, JPanel parent) {
        //create object
        ScaledRadial gauge = new ScaledRadial();
        //set the title
        gauge.setTitle(title);
        //set the units
        gauge.setUnitString(unit);
        //set the size
        gauge.setSize(size);
        //set the scale
        gauge.setScale(scale);
        //set the max limit
        gauge.setMaxValue(max);
        //set the min value
        gauge.setMinValue(min);
        //set the threshold value for the blinking led
        gauge.setThreshold(threshold);
        //how to invert the threshhold, if true: if the current value is less than the threshold set blink,
        //if false, if current value is greater than the threshold set blink
        gauge.setThresholdBehaviourInverted(invertThreshold);
        //set the "redline" or track for the gauge
        if(trackStart != trackStop) {
            gauge.setTrackStop(trackStop);
            gauge.setTrackStart(trackStart);
            gauge.setTrackStartColor(Color.RED);
            gauge.setTrackStopColor(Color.RED);
            gauge.setTrackVisible(true);
        }
        //set the panel the gauge will go in size
        parent.setPreferredSize(size);
        parent.setSize(size);
        //add the gauge to the panel
        parent.add(gauge);
        gauges.put(TAG, gauge);
        
        return gauge;
    }
    
    private ScaledLinear createLinearGauge(String title, String unit, String TAG, Dimension size, double scale, double min, double max, double threshold, boolean invertThreshold, double trackStart, double trackStop, JPanel parent) {
        //create object
        ScaledLinear gauge = new ScaledLinear();
        //set the title
        gauge.setTitle(title);
        //set the units
        gauge.setUnitString(unit);
        //set the size
        gauge.setSize(size);
        //set the scale
        gauge.setScale(scale);
        //set the max limit
        gauge.setMaxValue(max);
        //set the min value
        gauge.setMinValue(min);
        //set the threshold value for the blinking led
        gauge.setThreshold(threshold);
        //how to invert the threshhold, if true: if the current value is less than the threshold set blink,
        //if false, if current value is greater than the threshold set blink
        gauge.setThresholdBehaviourInverted(invertThreshold);
        //set the "redline" or track for the gauge
        if(trackStart != trackStop) {
            gauge.setTrackStop(trackStop);
            gauge.setTrackStart(trackStart);
            gauge.setTrackStartColor(Color.RED);
            gauge.setTrackStopColor(Color.RED);
            gauge.setTrackVisible(true);
        }
        //set the panel the gauge will go in size
        parent.setPreferredSize(size);
        //add the gauge to the panel
        parent.add(gauge);
        
        return gauge;
    }
    
    private LinearBargraph createVerticalLinearGauge(String title, String unit, String TAG, Dimension size, double min, double max, double threshold, boolean invertThreshold, double trackStart, double trackStop, JPanel parent) {
        //create object
        LinearBargraph gauge = new LinearBargraph();
        //set the title
        gauge.setTitle(title);
        //set the units
        gauge.setUnitString(unit);
        //set the size
        gauge.setSize(size);
        //set the max limit
        gauge.setMaxValue(max);
        //set the min value
        gauge.setMinValue(min);
        //set the threshold value for the blinking led
        gauge.setThreshold(threshold);
        //how to invert the threshhold, if true: if the current value is less than the threshold set blink,
        //if false, if current value is greater than the threshold set blink
        gauge.setThresholdBehaviourInverted(invertThreshold);
        //set the "redline" or track for the gauge
        if(trackStart != trackStop) {
            gauge.setTrackStop(trackStop);
            gauge.setTrackStart(trackStart);
            gauge.setTrackStartColor(Color.RED);
            gauge.setTrackStopColor(Color.RED);
            gauge.setTrackVisible(true);
        }
        //set the panel the gauge will go in size
        parent.setPreferredSize(size);
        //add the gauge to the panel
        parent.add(gauge);
        
        return gauge;
    }
    
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
            java.util.logging.Logger.getLogger(CustomizableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomizableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomizableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomizableWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomizableWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel editPanel;
    private javax.swing.JMenuItem editPanelMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel linearVert_editPanel;
    private javax.swing.JPanel linear_editPanel;
    private javax.swing.JMenuItem openWindowMenuItem;
    private javax.swing.JPanel radial_editPanel;
    private javax.swing.JPanel radial_editPanel1;
    private javax.swing.JPanel radial_editPanel2;
    private javax.swing.JPanel radial_editPanel3;
    private javax.swing.JPanel radial_editPanel4;
    private javax.swing.JPanel radial_editPanel5;
    private javax.swing.JPanel radial_editPanel6;
    private javax.swing.JPanel radial_editPanel7;
    private javax.swing.JMenuItem saveWindowMenuItem;
    // End of variables declaration//GEN-END:variables
}