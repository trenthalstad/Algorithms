package com.eaglebytes.sorting;

import com.eaglebytes.util.MathUtils;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Shell extends javax.swing.JFrame {

    public int[] data;
    
    public Shell() {
        initComponents();
        setLocationRelativeTo(null);
        ((Panel)renderPanel).preInit();
//        generateButton.doClick();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shell");
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

        dataGenLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        dataGenLabel.setText("Data Generation");

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

        javax.swing.GroupLayout dataGenPanelLayout = new javax.swing.GroupLayout(dataGenPanel);
        dataGenPanel.setLayout(dataGenPanelLayout);
        dataGenPanelLayout.setHorizontalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(minMaxPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataGenPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataGenLabel)
                .addGap(44, 44, 44))
        );
        dataGenPanelLayout.setVerticalGroup(
            dataGenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dataGenLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minMaxPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
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
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        try{
            int indices = Integer.parseInt(elementsField.getText());
            data = new int[indices];
            for(int i = 0; i < indices; i++){
                data[i] = (int)(Math.random()*(maxValueSlider.getValue()-minValueSlider.getValue())+minValueSlider.getValue());
            }
            ((Panel)renderPanel).data = data;
            ((Panel)renderPanel).init();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void maxValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_maxValueSliderStateChanged
        if(minValueSlider.getValue() > maxValueSlider.getValue()-1)
            minValueSlider.setValue(maxValueSlider.getValue()-1);
        if(maxValueSlider.getValue() == 0)
            maxValueSlider.setValue(1);
        maxTextField.setText("" + maxValueSlider.getValue());
    }//GEN-LAST:event_maxValueSliderStateChanged

    private void minValueSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_minValueSliderStateChanged
        if(maxValueSlider.getValue() < minValueSlider.getValue()+1)
            maxValueSlider.setValue(minValueSlider.getValue()+1);
        if(minValueSlider.getValue() == 600)
            minValueSlider.setValue(599);
        minTextField.setText("" + minValueSlider.getValue());
    }//GEN-LAST:event_minValueSliderStateChanged

    private void minTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_minTextFieldKeyReleased
        try{
            if(!minTextField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                minTextField.setText(minTextField.getText().substring(0, minTextField.getText().length()-1));
            minValueSlider.setValue(Integer.parseInt(minTextField.getText()));
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_minTextFieldKeyReleased

    private void maxTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_maxTextFieldKeyReleased
        try{
            if(!maxTextField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                maxTextField.setText(maxTextField.getText().substring(0, maxTextField.getText().length()-1));
            maxValueSlider.setValue(Integer.parseInt(maxTextField.getText()));
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_maxTextFieldKeyReleased

    private void elementsFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elementsFieldMousePressed
        if(elementsField.getText().matches(""))
            elementsField.setText("");
    }//GEN-LAST:event_elementsFieldMousePressed

    private void sequentialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequentialButtonActionPerformed
        try{
            int indices = Integer.parseInt(elementsField.getText());
            data = new int[indices];
            for(int i = 0; i < indices; i++){
                data[i] = (int)((float)i*(maxValueSlider.getValue()-minValueSlider.getValue())/(indices-1)+minValueSlider.getValue());
            }
            ((Panel)renderPanel).data = data;
            ((Panel)renderPanel).init();
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_sequentialButtonActionPerformed

    private void elementsFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_elementsFieldKeyReleased
        try{
            if(!elementsField.getText().matches("800|[0-7][0-9][0-9]|[0-9][0-9]|[0-9]"))
                elementsField.setText(elementsField.getText().substring(0, elementsField.getText().length()-1));
            elementsSlider.setValue(Integer.parseInt(elementsField.getText()));
        }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_elementsFieldKeyReleased

    private void elementsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_elementsSliderStateChanged
        elementsField.setText("" + elementsSlider.getValue());
    }//GEN-LAST:event_elementsSliderStateChanged

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
        
        public int[] data;
        public Color[] colors;
        
        private BufferedImage img;
        private Graphics2D bg;
        
        public int mouseX, mouseY;
        
        public Panel(){
            addMouseMotionListener(new MouseAdapter(){
               @Override
               public void mouseMoved(MouseEvent me){
                   mouseX = me.getX();
                   mouseY = me.getY();
                   repaint();
               }
            });
        }
        
        public void preInit(){
            img = new BufferedImage(800, 700, BufferedImage.TYPE_INT_ARGB);
            bg = (Graphics2D)img.getGraphics();
        }
        
        public void init(){
            //Doesn't work for some reason......
//            bg.setColor(Color.black);
//            bg.fillRect(0, 0, 800, 700);
//            for(int i = 0; i < data.length; i++){
//                bg.setColor(new Color((float)Math.random(), (float)Math.random(), (float)Math.random()));
//                bg.fill3DRect((int)(i*800f/data.length), 672, (int)(800f/data.length), -data[i], true);
//            }
            
            //Two Color Choices
            setColor();
//            setBlackAndWhite();
            
            repaint();
        }
        
        private void setBlackAndWhite(){
            colors = new Color[data.length];
            for(int i = 0; i < data.length; i++){
                float colorValue = MathUtils.clamp((float)i/colors.length, 0.2f, 1);
                colors[i] = new Color(colorValue, colorValue, colorValue);
            }
        }
        
        private void setColor(){
            colors = new Color[data.length];
            for(int i = 0; i < data.length; i++){
                colors[i] = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
            }
        }
        
        private void setColorSequentially(){
            colors = new Color[data.length];
            //int max = MathUtils.getMax(data);
            //int min = MathUtils.getMin(data);
            //for(int i = 0; i < data.length; i++){
            //int color = scale((data[i]-min)/(max-min), 0f, 1f, 0x000000, 0xFFFFFF);
            //    colors[i] = new Color((color & 0xFF0000)/(float)0xFF0000*255f, (color & 0x00FF00)/(float)0x00FF00*255f, (color & 0x0000FF)/(float)0x0000FF*255f);
            //}
        }
        
        @Override
        public void paint(Graphics gfx){
            Graphics2D g = (Graphics2D)gfx;
            g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
            g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            g.setColor(Color.black);
            g.fillRect(0, 0, 1024, 720);
            if(data != null && colors != null)
                for(int i = 0; i < data.length; i++){
                    g.setColor(colors[i]);
                    g.fill3DRect((int)(i*800f/data.length), 672-data[i], (int)(800f/data.length), 672, true);
                }
            g.setColor(Color.yellow);
            for(int i = 0; i <= 6; i++){
                g.drawString("" + (100*i), 20, 672-(i * 100));
            }
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
    private javax.swing.JLabel jLabel1;
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
