package com.eaglebytes.sorting;

import com.eaglebytes.util.MathUtils;
import com.eaglebytes.util.Vector2f;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Shell extends javax.swing.JFrame {

    private int[] data;

    public Shell() {
        initComponents();
        pack();
        setSize(1065, 720);
        setLocationRelativeTo(null);
        ((Panel) renderPanel).preInit();
        sequentialButton.doClick();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        renderPanel = new Panel();
        dataGenPanel = new javax.swing.JPanel();
        dataGenLabel = new javax.swing.JLabel();
        minMaxPanel = new javax.swing.JPanel();
        minValuePanel = new javax.swing.JPanel();
        minValueSlider = new javax.swing.JSlider();
        minValueLabel = new javax.swing.JLabel();
        minTextField = new javax.swing.JTextField();
        maxSliderPanel = new javax.swing.JPanel();
        maxValueSlider = new javax.swing.JSlider();
        maxValueLabel = new javax.swing.JLabel();
        maxTextField = new javax.swing.JTextField();
        sequentialButton = new javax.swing.JButton();
        elementsField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        elementsSlider = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shell");
        setResizable(false);

        renderPanel.setPreferredSize(new java.awt.Dimension(800, 672));

        javax.swing.GroupLayout renderPanelLayout = new javax.swing.GroupLayout(renderPanel);
        renderPanel.setLayout(renderPanelLayout);
        renderPanelLayout.setHorizontalGroup(
            renderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        renderPanelLayout.setVerticalGroup(
            renderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );

        dataGenPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dataGenLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        dataGenLabel.setText("Data Generation");

        minMaxPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        minValueSlider.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        minValueSlider.setMajorTickSpacing(100);
        minValueSlider.setMaximum(600);
        minValueSlider.setMinorTickSpacing(25);
        minValueSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        minValueSlider.setPaintLabels(true);
        minValueSlider.setPaintTicks(true);
        minValueSlider.setValue(100);
        minValueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                minValueSliderStateChanged(evt);
            }
        });

        minValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        minValueLabel.setText("Min");

        minTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        minTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minTextField.setText("100");
        minTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout minValuePanelLayout = new javax.swing.GroupLayout(minValuePanel);
        minValuePanel.setLayout(minValuePanelLayout);
        minValuePanelLayout.setHorizontalGroup(
            minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minValuePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(minValuePanelLayout.createSequentialGroup()
                        .addGroup(minValuePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(minTextField)
                            .addComponent(minValueSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minValuePanelLayout.createSequentialGroup()
                        .addComponent(minValueLabel)
                        .addGap(25, 25, 25))))
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

        maxValueSlider.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        maxValueSlider.setMajorTickSpacing(100);
        maxValueSlider.setMaximum(600);
        maxValueSlider.setMinorTickSpacing(25);
        maxValueSlider.setOrientation(javax.swing.JSlider.VERTICAL);
        maxValueSlider.setPaintLabels(true);
        maxValueSlider.setPaintTicks(true);
        maxValueSlider.setValue(600);
        maxValueSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                maxValueSliderStateChanged(evt);
            }
        });

        maxValueLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        maxValueLabel.setText("Max");

        maxTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        maxTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maxTextField.setText("600");
        maxTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout maxSliderPanelLayout = new javax.swing.GroupLayout(maxSliderPanel);
        maxSliderPanel.setLayout(maxSliderPanelLayout);
        maxSliderPanelLayout.setHorizontalGroup(
            maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maxSliderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(maxSliderPanelLayout.createSequentialGroup()
                        .addGroup(maxSliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(maxTextField)
                            .addComponent(maxValueSlider, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, maxSliderPanelLayout.createSequentialGroup()
                        .addComponent(maxValueLabel)
                        .addGap(25, 25, 25))))
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

        sequentialButton.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        sequentialButton.setText("Generate Sequential");
        sequentialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequentialButtonActionPerformed(evt);
            }
        });

        elementsField.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        elementsField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        elementsField.setText("10");
        elementsField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                elementsFieldMousePressed(evt);
            }
        });
        elementsField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                elementsFieldKeyReleased(evt);
            }
        });

        generateButton.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        generateButton.setText("Generate Random");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jLabel1.setText("Number of Elements");

        elementsSlider.setMajorTickSpacing(25);
        elementsSlider.setMinorTickSpacing(10);
        elementsSlider.setPaintLabels(true);
        elementsSlider.setPaintTicks(true);
        elementsSlider.setValue(10);
        elementsSlider.setPreferredSize(new java.awt.Dimension(100, 23));
        elementsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                elementsSliderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout minMaxPanelLayout = new javax.swing.GroupLayout(minMaxPanel);
        minMaxPanel.setLayout(minMaxPanelLayout);
        minMaxPanelLayout.setHorizontalGroup(
            minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minMaxPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(minMaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(minMaxPanelLayout.createSequentialGroup()
                        .addComponent(minValuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(maxSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sequentialButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(elementsField)
                    .addComponent(elementsSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        minMaxPanelLayout.setVerticalGroup(
            minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minMaxPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(minMaxPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minValuePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxSliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(elementsSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sequentialButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateButton)
                .addContainerGap())
        );

        jButton1.setText("Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(">");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<");

        jSlider1.setMaximum(300);
        jSlider1.setValue(150);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout dataGenPanelLayout = new javax.swing.GroupLayout(dataGenPanel);
        dataGenPanel.setLayout(dataGenPanelLayout);
        dataGenPanelLayout.setHorizontalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataGenPanelLayout.createSequentialGroup()
                        .addGroup(dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minMaxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dataGenLabel)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap())))
        );
        dataGenPanelLayout.setVerticalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataGenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minMaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3))
                    .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(renderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                    .addComponent(dataGenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        try {
            ((Panel)renderPanel).index = 0;
            int indices = Integer.parseInt(elementsField.getText());
            data = new int[indices];
            for (int i = 0; i < indices; i++)
                data[i] = (int) (Math.random() * (maxValueSlider.getValue() - minValueSlider.getValue()) + minValueSlider.getValue());
            ((Panel) renderPanel).data = data;
            ((Panel) renderPanel).init();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void maxValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maxValueSliderStateChanged
        if (minValueSlider.getValue() > maxValueSlider.getValue() - 1)
            minValueSlider.setValue(maxValueSlider.getValue() - 1);
        if (maxValueSlider.getValue() == 0)
            maxValueSlider.setValue(1);
        maxTextField.setText("" + maxValueSlider.getValue());
    }//GEN-LAST:event_maxValueSliderStateChanged

    private void minValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minValueSliderStateChanged
        if (maxValueSlider.getValue() < minValueSlider.getValue() + 1)
            maxValueSlider.setValue(minValueSlider.getValue() + 1);
        if (minValueSlider.getValue() == 600)
            minValueSlider.setValue(599);
        minTextField.setText("" + minValueSlider.getValue());
    }//GEN-LAST:event_minValueSliderStateChanged

    private void minTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTextFieldKeyReleased
        try {
            if (!minTextField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                minTextField.setText(minTextField.getText().substring(0, minTextField.getText().length() - 1));
            minValueSlider.setValue(Integer.parseInt(minTextField.getText()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_minTextFieldKeyReleased

    private void maxTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxTextFieldKeyReleased
        try {
            if (!maxTextField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                maxTextField.setText(maxTextField.getText().substring(0, maxTextField.getText().length() - 1));
            maxValueSlider.setValue(Integer.parseInt(maxTextField.getText()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_maxTextFieldKeyReleased

    private void elementsFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elementsFieldMousePressed
        if (elementsField.getText().matches(""))
            elementsField.setText("");
    }//GEN-LAST:event_elementsFieldMousePressed

    private void sequentialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequentialButtonActionPerformed
        try {
            ((Panel)renderPanel).index = 0;
            int indices = Integer.parseInt(elementsField.getText());
            data = new int[indices];
            for (int i = 0; i < indices; i++)
                data[i] = (int) ((float) i * (maxValueSlider.getValue() - minValueSlider.getValue()) / (indices - 1) + minValueSlider.getValue());
            ((Panel) renderPanel).data = data;
            ((Panel) renderPanel).init();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_sequentialButtonActionPerformed

    private void elementsFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementsFieldKeyReleased
        try {
            if (!elementsField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                elementsField.setText(elementsField.getText().substring(0, elementsField.getText().length() - 1));
            elementsSlider.setValue(Integer.parseInt(elementsField.getText()));
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_elementsFieldKeyReleased

    private void elementsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_elementsSliderStateChanged
        elementsField.setText("" + elementsSlider.getValue());
    }//GEN-LAST:event_elementsSliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ((Panel)renderPanel).sort();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        ((Panel)renderPanel).sortSpeed = jSlider1.getValue();
    }//GEN-LAST:event_jSlider1StateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ((Panel)renderPanel).sortStep();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
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

    private class Panel extends JPanel {

        private int[] data;
        private int[] selectedIndices = new int[]{-1, -1};
        private Color[] colors;

        private BufferedImage img;
        private Graphics2D bg;

        private int mouseX, mouseY;
        private int timerSpeed = 10;

        public Panel() {
            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent me) {
                    mouseX = me.getX();
                    mouseY = me.getY();
                    repaint();
                }
            });
            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent me) {
                    int index = getDataIndexFromCoord(new Vector2f(me.getX(), me.getY()));
//                    if(index != -1)
                        selectDataIndex(index);
                    if(me.getButton() == MouseEvent.BUTTON3){
                        //TODO: Slow down
                        //Note: The time here MUST match the time on the other timer.
                        new javax.swing.Timer(timerSpeed, new ActionListener(){
                            private int index = 0;
                            @Override
                            public void actionPerformed(ActionEvent ae){
                                selectDataIndex(index++);
                                selectDataIndex(data.length-index);
                                if(index > data.length-1)
                                    ((Timer)ae.getSource()).stop();
                            }
                        }).start();
                    }
                }
            });
        }

        public int sortSpeed = 150;
        Timer sortTimer;
        public void sort() {
            //example sort
            if(sortTimer !- null)
                sortTimer.stop();
            sortTimer = new Timer(sortSpeed, new ActionListener() {
                int index = 0;

                @Override
                public void actionPerformed(ActionEvent ae) {
                    if (index > data.length - 1)
                        ((Timer) ae.getSource()).stop();
//                    selectDataIndex(index);
//                    selectDataIndex(index+1);
                    repaint();
                    for (int i = index; i < data.length - 1; i++){
                        if (data[i] < data[i + 1])
                            if (data[i + 1] > data[index])
                                swapData(index, i + 1);
                    }
                    index++;
                }
            }).start();
        }
        
        private int index = 0;
        public void sortStep() {
            //example sort
            for (int i = index; i < data.length - 1; i++)
                if (data[i] < data[i + 1])
                    if (data[i + 1] > data[index])
                        swapData(index, i + 1);
            index++;
        }

        /**
         * Swaps the two indices in the array, ONLY IN THE DATA.
         *
         * @param index The first index to swap. Use -1 to take from temp.
         * @param destination The second index to swap. Use -1 to put in temp.
         */
        public void swapData(int index, int destination) {
            int temp = data[index];
            data[index] = data[destination];
            data[destination] = temp;
            //TODO: Not necessary if color based on length.
            Color tempColor = colors[index];
            colors[index] = colors[destination];
            colors[destination] = tempColor;
        }

        public void swap(final int index, final int destination) {
            new Timer(20, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Vector2f offset = dataOffset.get(index);
                    Vector2f offset2 = dataOffset.get(destination);
                    if (getCoordsFromDataIndex(index).x + offset.x > getCoordsFromDataIndex(destination).x - offset2.x) {
                        offset.x -= 5f;
                        offset2.x += 5f;
                        if (getCoordsFromDataIndex(index).x + offset.x < getCoordsFromDataIndex(destination).x - offset2.x) {
                            swapData(index, destination);
                            dataOffset.get(index).x = 0;
                            dataOffset.get(destination).x = 0;
                            ((Timer) ae.getSource()).stop();
                        }
                    } else {
                        offset.x += 5f;
                        offset2.x -= 5f;
                        if (getCoordsFromDataIndex(index).x - offset.x > getCoordsFromDataIndex(destination).x + offset2.x) {
                            swapData(index, destination);
                            dataOffset.get(index).x = 0;
                            dataOffset.get(destination).x = 0;
                            ((Timer) ae.getSource()).stop();
                        }
                    }
                    repaint();
                }
            }).start();
        }

        private javax.swing.Timer animationTimer;

        public void preInit() {
            img = new BufferedImage(800, 680, BufferedImage.TYPE_INT_ARGB);
            bg = (Graphics2D) img.getGraphics();
            bg.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
//            bg.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            bg.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }

        private float speed = 3f;

        public void init() {
            dataOffset.clear();
            for (int i : data)
                dataOffset.add(new Vector2f(0, 0));
//            setBlackAndWhite();
//            setColorSequentially();
            setShadeSequentially();
            if(animationTimer != null)
                animationTimer.stop();
            animationTimer = new javax.swing.Timer(timerSpeed, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    for (int i = 0; i < data.length; i++)
                        if (i == selectedIndices[0] || i == selectedIndices[1]) {
                            //TODO: Slow down
                            speed = 100f;
                            Vector2f offset = dataOffset.get(i);
                            if (offset.y > -200)
                                dataOffset.get(i).y = offset.y - speed;
                            repaint();
                        } else {
                            //TODO: Remove hard-coded descent speed
                            speed = 10f;
                            Vector2f offset = dataOffset.get(i);
                            if (offset.y < 0)
                                dataOffset.get(i).y = offset.y + speed;
                            repaint();
                        }
                }
            });
            animationTimer.start();
            repaint();
        }

        private void setBlackAndWhite() {
            colors = new Color[data.length];
            for (int i = 0; i < data.length; i++) {
                float colorValue = MathUtils.clamp((float) i / colors.length, 0.2f, 1);
                colors[i] = new Color(colorValue, colorValue, colorValue);
            }
        }

        private void setColor() {
            colors = new Color[data.length];
            for (int i = 0; i < data.length; i++)
                colors[i] = new Color((float) Math.random(), (float) Math.random(), (float) Math.random());
        }

        private void setColorSequentially() {
            colors = new Color[data.length];
            int max = MathUtils.getMax(data);
            int min = MathUtils.getMin(data);
            for (int i = 0; i < data.length; i++) {
                int color = (int) MathUtils.scale((data[i] - min) / (float) (max - min), 0f, 1f, 0x000000, 0xFFFFFF);
                colors[i] = new Color((int) ((color & 0xFF0000) / (float) 0xFF0000 * 255f), (int) ((color & 0x00FF00) / (float) 0x00FF00 * 255f), (int) ((color & 0x0000FF) / (float) 0x0000FF * 255f));
            }
        }

        private void setShadeSequentially() {
            colors = new Color[data.length];
            for (int i = 0; i < data.length; i++) {
                int max = MathUtils.getMax(data);
                int min = MathUtils.getMin(data);
                float color = (float) (data[i] - min) / (max - min);
                colors[i] = new Color(1 - color, color, color);
            }
        }

        private List<Vector2f> dataOffset = new ArrayList<Vector2f>();
        private boolean firstSelection = false;

        public void selectDataIndex(int index) {
            if (firstSelection = !firstSelection)
                this.selectedIndices[0] = index;
            else
                this.selectedIndices[1] = index;

//            if(selectedIndices[1] != -1){
//                swap(selectedIndices[0], selectedIndices[1]);
//                for(int i = 0; i < selectedIndices.length; i++)
//                    selectedIndices[i] = -1;
//            }
            repaint();
        }

        private int getDataIndexFromCoord(Vector2f coordinate) {
            for (int i = 0; i < data.length; i++) {
                int xPos = (int) (i * 800f / (9 / 8f * data.length)) + (int) dataOffset.get(i).x;
                int yPos = 673 - data[i] + (int) dataOffset.get(i).y;
                int width = (int) (800f / (9 / 8f * data.length));
                int height = data[i];
                if (coordinate.x > xPos && coordinate.x < xPos + width && coordinate.y > yPos && coordinate.y < yPos + height)
                    return i;
            }
            return -1;
        }

        private Vector2f getCoordsFromDataIndex(int index) {
            return new Vector2f((int) (index * 800f / (9 / 8f * data.length)) + (int) dataOffset.get(index).x, 673 - data[index] + (int) dataOffset.get(index).y);
        }

        @Override
        public void paint(Graphics gfx) {
            //Graphics Initialization
            Graphics2D g = (Graphics2D) gfx;
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draw Elements onto a backbuffer
            bg.setColor(Color.black);
            bg.fillRect(0, 0, 800, 720);
            bg.setColor(Color.DARK_GRAY);
            bg.fillRect(710, 0, 800, 720);
            if (data != null && colors != null) {
                for (int i = 0; i < data.length; i++) {
                    int xPos = (int) (i * 800f / (9 / 8f * data.length)) + (int) dataOffset.get(i).x;
                    int yPos = 673 - data[i] + (int) dataOffset.get(i).y;
                    int width = (int) (800f / (9 / 8f * data.length));
                    int height = data[i];
                    if (i != selectedIndices[0] && i != selectedIndices[1]){
                        bg.setColor(colors[i]);
                        bg.fill3DRect(xPos, yPos + (int) dataOffset.get(i).y, width, height, true);
                    }
                }
                for (int i = 0; i < data.length; i++) {
                    int xPos = (int) (i * 800f / (9 / 8f * data.length)) + (int) dataOffset.get(i).x;
                    int yPos = 673 - data[i] + (int) dataOffset.get(i).y;
                    int width = (int) (800f / (9 / 8f * data.length));
                    int height = data[i];
                    if (i == selectedIndices[0]) {
                        //Beam of light behind the data
                        bg.setPaint(new GradientPaint(0, 0, new Color(255, 255, 100, 150), 0, 673, new Color(255, 255, 0, 100)));
                        bg.fillPolygon(new int[]{
                            xPos + (int) dataOffset.get(i).x,
                            (int) (xPos + (int) dataOffset.get(i).x + width),
                            (int) (xPos + (int) dataOffset.get(i).x + 3 / 2f * width),
                            (int) (xPos + (int) dataOffset.get(i).x - 1 / 2f * width)
                        }, new int[]{0, 0, 673, 673}, 4);

                        //Data
                        bg.setColor(colors[i]);
                        bg.fill3DRect(xPos, yPos, width, height, true);

                        //Beam of light infront of the data
                        bg.setPaint(new GradientPaint(0, 0, new Color(255, 255, 100, 100), 0, 673, new Color(255, 255, 0, 25)));
                        bg.fillPolygon(new int[]{
                            xPos + (int) dataOffset.get(i).x,
                            (int) (xPos + (int) dataOffset.get(i).x + width),
                            (int) (xPos + (int) dataOffset.get(i).x + 3 / 2f * width),
                            (int) (xPos + (int) dataOffset.get(i).x - 1 / 2f * width)
                        }, new int[]{0, 0, 673, 673}, 4);
                    } else if (i == selectedIndices[1]) {
                        //Beam of light behind the data
                        bg.setPaint(new GradientPaint(0, 0, new Color(255, 0, 255, 150), 0, 673, new Color(0, 0, 255, 100)));
                        bg.fillPolygon(new int[]{
                            xPos + (int) dataOffset.get(i).x,
                            (int) (xPos + (int) dataOffset.get(i).x + width),
                            (int) (xPos + (int) dataOffset.get(i).x + 3 / 2f * width),
                            (int) (xPos + (int) dataOffset.get(i).x - 1 / 2f * width)
                        }, new int[]{0, 0, 673, 673}, 4);

                        //Data
                        bg.setColor(colors[i]);
                        bg.fill3DRect(xPos, yPos, width, height, true);

                        //Beam of light infront of the data
                        bg.setPaint(new GradientPaint(0, 0, new Color(255, 0, 255, 100), 0, 673, new Color(0, 0, 255, 25)));
                        bg.fillPolygon(new int[]{
                            xPos + (int) dataOffset.get(i).x,
                            (int) (xPos + (int) dataOffset.get(i).x + width),
                            (int) (xPos + (int) dataOffset.get(i).x + 3 / 2f * width),
                            (int) (xPos + (int) dataOffset.get(i).x - 1 / 2f * width)
                        }, new int[]{0, 0, 673, 673}, 4);
                    }
                }
            }
            //Draw the backbuffer to the screen
            g.drawImage(img, 0, 0, this);
            //Draw the y-coordinate text
            g.setColor(Color.yellow);
            for (int i = 0; i <= 6; i++)
                g.drawString("" + (100 * i), 20, 673 - (i * 100));
            g.drawString("Temp", 740, 20);
            g.drawLine(710, 30, 800, 30);
            //Draw the point intersection lines
            g.setColor(Color.pink);
            g.drawLine(0, mouseY, 800, mouseY);
            g.drawLine(mouseX, 0, mouseX, 700);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dataGenLabel;
    private javax.swing.JPanel dataGenPanel;
    private javax.swing.JTextField elementsField;
    private javax.swing.JSlider elementsSlider;
    private javax.swing.JButton generateButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSlider jSlider1;
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
    private javax.swing.JButton sequentialButton;
    // End of variables declaration//GEN-END:variables
}
