/**
 * MIT License
 * 
 * Copyright (c) 2024 Luís Vázquez Lema
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.

 */

package GreenwiChart;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Component;
import javax.swing.SwingConstants;

public class GreenwiChart extends javax.swing.JDialog {

        private javax.swing.JButton jButtonCalcular;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabelWelcome;
        private javax.swing.JLabel jLabelInstructions;
        private javax.swing.JTextField jTextFieldLat1;
        private javax.swing.JTextField jTextFieldLong1;
        private javax.swing.JTextField jTextFieldLat2;
        private javax.swing.JTextField jTextFieldLong2;
        private javax.swing.JTextArea jTextAreaLicense;
        private javax.swing.JLabel jLabelIcon;

        public GreenwiChart(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
                setLocationRelativeTo(null);
                setTitle("GreenwiChart");
                setIconImage(new ImageIcon(getClass().getResource("/GreenwiChart/icon/GreenwiChartlogo.png"))
                                .getImage());
                initCustomComponents();
        }

        private void initCustomComponents() {
                jLabelWelcome.setText(
                                "<html><center><h1>GreenwiChart</h1>La aplicación para calcular la distancia entre coordenadas</center></html>");
                jLabelInstructions.setText(
                                "<html><center>A continuación, introduzca los valores requeridos:</center></html>");
                jTextAreaLicense.setText(
                                "Para más información, puede contactar con el desarrollador:\nLuís Vázquez Lema - luisvazquezlema@gmail.com");
                jTextAreaLicense.setEditable(false);
                jTextAreaLicense.setBackground(jButtonCalcular.getBackground());
                jLabelIcon.setIcon(
                                new ImageIcon(new ImageIcon(
                                                getClass().getResource("/GreenwiChart/icon/GreenwiChartlogo.png"))
                                                .getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH)));
                jLabelIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabelIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
                jLabelIcon.setVerticalAlignment(SwingConstants.BOTTOM);
                jButtonCalcular.setText("Calcular Distancia");
                jButtonCalcular.setAlignmentX(Component.CENTER_ALIGNMENT);
        }

        private void initComponents() {
                jButtonCalcular = new javax.swing.JButton();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jTextFieldLat1 = new javax.swing.JTextField();
                jTextFieldLong1 = new javax.swing.JTextField();
                jTextFieldLat2 = new javax.swing.JTextField();
                jTextFieldLong2 = new javax.swing.JTextField();
                jLabelWelcome = new javax.swing.JLabel();
                jLabelInstructions = new javax.swing.JLabel();
                jTextAreaLicense = new javax.swing.JTextArea();
                jLabelIcon = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("Calcular Distancia entre Coordenadas");
                setResizable(false);

                jLabel1.setText("Latitud 1:");

                jLabel2.setText("Longitud 1:");

                jLabel3.setText("Latitud 2:");

                jLabel4.setText("Longitud 2:");

                jButtonCalcular.setText("Calcular Distancia");
                jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonCalcularActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addComponent(jLabel2))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jTextFieldLat1,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                80,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jTextFieldLong1)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jLabel3)
                                                                                                                .addComponent(jLabel4))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(jTextFieldLat2,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                80,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(jTextFieldLong2))))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabelInstructions,
                                                                                                javax.swing.GroupLayout.Alignment.CENTER,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabelWelcome,
                                                                                                javax.swing.GroupLayout.Alignment.CENTER,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTextAreaLicense,
                                                                                                javax.swing.GroupLayout.Alignment.CENTER,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                110, Short.MAX_VALUE)
                                                                                .addComponent(jLabelIcon,
                                                                                                javax.swing.GroupLayout.Alignment.CENTER,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jButtonCalcular,
                                                                                                javax.swing.GroupLayout.Alignment.CENTER,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabelIcon)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelWelcome)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabelInstructions)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jTextFieldLat1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jTextFieldLong1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jTextFieldLat2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jTextFieldLong2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jButtonCalcular)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jTextAreaLicense,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                58,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));

                pack();
                setSize(375, 600);
        }

        private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        Coordenada coordenada1 = obtenerCoordenada(jTextFieldLat1, jTextFieldLong1);
                        Coordenada coordenada2 = obtenerCoordenada(jTextFieldLat2, jTextFieldLong2);

                        double distancia = GreenwiChartOps.distanciaCoordenadas(coordenada1.getLatitud(),
                                        coordenada2.getLatitud(),
                                        coordenada1.getLongitud(), coordenada2.getLongitud());

                        JOptionPane.showMessageDialog(this, "La distancia entre coordenadas es: " + distancia + " km",
                                        "Resultado",
                                        JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese valores válidos para las coordenadas.",
                                        "Error",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }

        private Coordenada obtenerCoordenada(javax.swing.JTextField jTextFieldLat,
                        javax.swing.JTextField jTextFieldLong) {
                double latitud = Double.parseDouble(jTextFieldLat.getText());
                double longitud = Double.parseDouble(jTextFieldLong.getText());

                Coordenada coordenada = new Coordenada();
                coordenada.setLatitud(latitud);
                coordenada.setLongitud(longitud);

                return coordenada;
        }

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                GreenwiChart dialog = new GreenwiChart(new javax.swing.JFrame(), true);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }
}
