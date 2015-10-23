package com.eaglebytes;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class Shell extends javax.swing.JFrame {

    public double[] data;
    
    public Shell() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        renderPanel = new Panel();
        dataGenPanel = new javax.swing.JPanel();
        dataGenLabel = new javax.swing.JLabel();
        generateButton = new javax.swing.JButton();
        minMaxPanel = new javax.swing.JPanel();
        minValuePanel = new javax.swing.JPanel();
        minValueSlider = new javax.swing.JSlider();
        minValueLabel = new javax.swing.JLabel();
        minTextField = new javax.swing.JTextField();
        maxSliderPanel = new javax.swing.JPanel();
        maxValueSlider = new javax.swing.JSlider();
        maxValueLabel = new javax.swing.JLabel();
        maxTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shell");
        setPreferredSize(new java.awt.Dimension(1024, 720));
        setResizable(false);

        javax.swing.GroupLayout renderPanelLayout = new javax.swing.GroupLayout(renderPanel);
        renderPanel.setLayout(renderPanelLayout);
        renderPanelLayout.setHorizontalGroup(
            renderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        renderPanelLayout.setVerticalGroup(
            renderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dataGenPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataGenLabel.setText("Data Generation");

        generateButton.setText("Generate Random");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        minValueSlider.setMaximum(999);
        minValueSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        minValueSlider.setValue(0);
        minValueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minValueSliderStateChanged(evt);
            }
        });

        minValueLabel.setText("Min");

        minTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minTextField.setText("0");

        javax.swing.GroupLayout minValuePanelLayout = new javax.swing.GroupLayout(minValuePanel);
        minValuePanel.setLayout(minValuePanelLayout);
        minValuePanelLayout.setHorizontalGroup(
            minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(minTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(minValueSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, minValuePanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(minValueLabel)))
                .addContainerGap())
        );
        minValuePanelLayout.setVerticalGroup(
            minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minValueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minValueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maxValueSlider.setMaximum(1000);
        maxValueSlider.setMinimum(1);
        maxValueSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        maxValueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maxValueSliderStateChanged(evt);
            }
        });

        maxValueLabel.setText("Max");

        maxTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maxTextField.setText("100");

        javax.swing.GroupLayout maxSliderPanelLayout = new javax.swing.GroupLayout(maxSliderPanel);
        maxSliderPanel.setLayout(maxSliderPanelLayout);
        maxSliderPanelLayout.setHorizontalGroup(
            maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxSliderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(maxTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(maxValueSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, maxSliderPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(maxValueLabel)))
                .addContainerGap())
        );
        maxSliderPanelLayout.setVerticalGroup(
            maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxSliderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(maxValueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxValueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(maxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout minMaxPanelLayout = new javax.swing.GroupLayout(minMaxPanel);
        minMaxPanel.setLayout(minMaxPanelLayout);
        minMaxPanelLayout.setHorizontalGroup(
            minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minMaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minValuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(maxSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        minMaxPanelLayout.setVerticalGroup(
            minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minMaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minValuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.setText("Generate Sequential");

        javax.swing.GroupLayout dataGenPanelLayout = new javax.swing.GroupLayout(dataGenPanel);
        dataGenPanel.setLayout(dataGenPanelLayout);
        dataGenPanelLayout.setHorizontalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dataGenLabel)
                .addGap(44, 44, 44))
            .addGroup(dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minMaxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dataGenPanelLayout.setVerticalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataGenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minMaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(renderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataGenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(renderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dataGenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 273, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        
    }//GEN-LAST:event_generateButtonActionPerformed

    private void maxValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maxValueSliderStateChanged
        if(minValueSlider.getValue() > maxValueSlider.getValue()-1)
            minValueSlider.setValue(maxValueSlider.getValue()-1);
        maxTextField.setText("" + maxValueSlider.getValue());
    }//GEN-LAST:event_maxValueSliderStateChanged

    private void minValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minValueSliderStateChanged
        if(maxValueSlider.getValue() < minValueSlider.getValue()+1)
            maxValueSlider.setValue(minValueSlider.getValue()+1);
        minTextField.setText("" + minValueSlider.getValue());
    }//GEN-LAST:event_minValueSliderStateChanged

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
            java.util.logging.Logger.getLogger(Shell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Shell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Shell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Shell.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Shell().setVisible(true);
            }
        });
    }

    private class Panel extends JPanel{
        
        @Override
        public void paint(Graphics gfx){
            Graphics2D g = (Graphics2D)gfx;
            g.fillRect(0, 0, 1024, 720);
        }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataGenLabel;
    private javax.swing.JPanel dataGenPanel;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel maxSliderPanel;
    private javax.swing.JTextField maxTextField;
    private javax.swing.JLabel maxValueLabel;
    private javax.swing.JSlider maxValueSlider;
    private javax.swing.JPanel minMaxPanel;
    private javax.swing.JTextField minTextField;
    private javax.swing.JLabel minValueLabel;
    private javax.swing.JPanel minValuePanel;
    private javax.swing.JSlider minValueSlider;
    private javax.swing.JPanel renderPanel;
    // End of variables declaration//GEN-END:variables
}
