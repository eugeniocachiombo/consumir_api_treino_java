package apipessoa;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class ConsumirAPI extends javax.swing.JFrame {

    public ConsumirAPI() {
        initComponents();
    }

    public void Create(String name, int age) {
        try {
            String apiUrl = "http://restapi034.000webhostapp.com/create";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String postData = "name=" + name + "&age=" + age;

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = postData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            String message = jsonObject.getString("message");
            String log = jsonObject.getString("log");
            txtLog.setForeground(Color.green);
            txtLog.setText(message + " \n" + log );
            
            System.out.println(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void Update(int id, String name, int age) {
        try {
            String apiUrl = "http://restapi034.000webhostapp.com/update";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String putData = "id=" + id + "&name=" + name + "&age=" + age;
            
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = putData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            String message = jsonObject.getString("message");
            String log = jsonObject.getString("log");
            txtLog.setForeground(Color.green);
            txtLog.setText(message + " \n" + log );
            
            System.out.println(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Delete(int id) {
        try {
            String apiUrl = "http://restapi034.000webhostapp.com/delete";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String deleteData = "id=" + id;

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = deleteData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            String message = jsonObject.getString("message");
            String log = jsonObject.getString("log");
            txtLog.setForeground(Color.green);
            txtLog.setText(message + " \n" + log );
            
            System.out.println(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void GetId(int id) {
        try {
            String apiUrl = "http://restapi034.000webhostapp.com/get_id";
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);

            String deleteData = "id=" + id;

            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = deleteData.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer response = new StringBuffer();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            String new_name = jsonObject.getString("nome");
            int new_age = jsonObject.getInt("idade");
            txtNome.setText(new_name);
            txtIdade.setText("" + new_age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void CleanTextFields() {
        txtId.setText("");
        txtNome.setText("");
        txtIdade.setText("");
    }

    void CleanLog() {
        txtLog.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        btnEliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consumir API");
        setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(731, 450));
        setMinimumSize(new java.awt.Dimension(731, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(731, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setToolTipText("");
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 252, 32));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Id:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 252, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Idade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 252, -1));

        txtIdade.setBackground(new java.awt.Color(0, 0, 0));
        txtIdade.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtIdade.setForeground(new java.awt.Color(255, 255, 255));
        txtIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 252, 32));

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 204));
        btnCadastrar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 115, 40));

        btnActualizar.setBackground(new java.awt.Color(0, 102, 204));
        btnActualizar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 120, 40));

        jLabel3.setFont(jLabel3.getFont().deriveFont((jLabel3.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 30));
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Consumir API ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 0));
        txtNome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 252, 33));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 255));
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 252, -1));

        txtLog.setBackground(new java.awt.Color(44, 58, 79));
        txtLog.setColumns(20);
        txtLog.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        txtLog.setForeground(java.awt.Color.white);
        txtLog.setRows(5);
        txtLog.setBorder(null);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, txtLog, org.jdesktop.beansbinding.ELProperty.create("${false}"), txtLog, org.jdesktop.beansbinding.BeanProperty.create("editable"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(txtLog);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 379, 220));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 252, 40));

        jButton4.setBackground(new java.awt.Color(204, 0, 204));
        jButton4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Limpar Registo");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 379, 40));

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Genio Pro\\Documents\\NetBeansProjects\\APIPessoa\\img\\fundo.jpg")); // NOI18N
        fundo.setAutoscrolls(true);
        fundo.setOpaque(true);
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 731, 450));

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if ("".equals(txtNome.getText()) || "".equals(txtIdade.getText())) {
            JOptionPane.showMessageDialog(null, "Erro, existe campo vazio");
        } else {
            String name = txtNome.getText();
            int age = Integer.parseInt(txtIdade.getText());
            Create(name, age);
            CleanTextFields();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if ("".equals(txtId.getText()) || "".equals(txtNome.getText()) || "".equals(txtIdade.getText())) {
            JOptionPane.showMessageDialog(null, "Erro, existe campo vazio");
        } else {
            int id = Integer.parseInt(txtId.getText());
            String name = txtNome.getText();
            int age = Integer.parseInt(txtIdade.getText());
            Update(id, name, age);
            CleanTextFields();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if ("".equals(txtId.getText())) {
            JOptionPane.showMessageDialog(null, "Erro, existe campo vazio");
        } else {
            int id = Integer.parseInt(txtId.getText());
            Delete(id);
            CleanTextFields();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CleanLog();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased
        int id = Integer.parseInt(txtId.getText());
        txtNome.setText("");
        txtIdade.setText("");
        GetId(id);
    }//GEN-LAST:event_txtIdKeyReleased

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
            java.util.logging.Logger.getLogger(ConsumirAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumirAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumirAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumirAPI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsumirAPI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel fundo;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextArea txtLog;
    private javax.swing.JTextField txtNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
