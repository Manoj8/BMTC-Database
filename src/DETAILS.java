
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import oracle.net.aso.j;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Manoj
 */
public class DETAILS extends javax.swing.JFrame {

    /**
     * Creates new form Frame3
     */
    public DETAILS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setText("OK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 110, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("SOURCE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("DESTINATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 170, 32));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 240, 40));

        jLabel3.setFont(new java.awt.Font("Monotype Corsiva", 3, 52)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 0));
        jLabel3.setText("Route Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 310, 50));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kempegowda Bus Station", "Banashankari TTMC", "Shivajinagar TTMC", "Kengeri TTMC", "Jayanagar TTMC", "Electronic City", "Domluru TTMC", "BTM Layout Bus Stop", "Yeshwanthpura TTMC", "ISRO Layout", "Bommasandra", "Vasanthapura", "Kumaraswamy Layout", "Chennammanakera Achukattu", "Padmanabanagar", "Kaval Byrasandra", "Central Silk Board", "Bommasandra", "Chinnappa Garden", "Bommanahalli Hosur Road", "Viveka Nagar", "Ejipura", "Viveka Nagar", "Neelasandra Bus Station", "Gajendra Nagar", "Viveka Nagar", "Seenivagilu", "Jai Bhima Nagar", "Lakshman Roa Nagar", "Ejipura", "Adugodi Police Quaters", "Koramangala", "Hampi Nagar", "MCTC Bus Stand", "Srinagar", "Central Silk Board", "Madiwala", "KR Puram Railway Station", "Avalahalli BDA Park", "Hebbala", "Ramasandra", "Kengeri Satellite Town Society", "Dodda Basthi", "Channasandra BEML 5th Stage", "Parasanapalya", "Byrohalli", "Avaregere", "Nagarbhavi Village", "Nrupathunga Nagar", "Machohalli", "Kenchanapura", "Hullalu Satellite Town Jnanabharathi", "Tavarekere Magadi Road", "Andrahalli Magadi Road", "Hampi Nagar", "Yeshwanthpura TTMC", "Peenya 2nd Stage", "Nelamangala Bus Stand", "Kammasandra Lakshmipura", "Anchepalya Nelamangala Road", "Jalahalli Cross", "Jalahalli East Area 7th camp", "B Channasandra", "Banaswadi", "Attibele Hosur Road", "JP Nagar 1st Phase", "JP Nagar 3rd Phase", "JP Nagar 6th phase", "Jayanagar 9th Block", "Vijayanagar TTMC", "Hampi Nagar", "Chandra Layout 1st Stage", "Mahalakshmi Layout", "Hampinagara", "Kurubarahalli", "Shankarnag Bus Station", "Choweshwari Bus Stand", "Kengeri KBH Quaters Shirke", "Jigani", "Hosakote Bus Stand", "HAL Main Gate", "Yelahanka", "Yelahanka Satellite Town 5th Phase", "Kengeri Satellite Town Society", "Basaveshwara Nagar" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 240, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jButton2.setText("<--");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BUS NO", "VIA", "DISTANCE", "JOURNEY TIME", "TIMINGS", "ADULT FARE", "CHILD FARE", "DAILY PASS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 850, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon("G:\\HD Wallpapers\\9.1.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public void close()
    {
        WindowEvent win=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jap j=new jap();
        String a=(String)jComboBox1.getSelectedItem();
        String b=(String)jComboBox2.getSelectedItem();
        try
        {
            ps=(j.con).prepareStatement("Select b.Bus_No,r.via,r.distance,r.time,r.timings,f.adult_fare,f.child_fare,f.passes from Route r,Facilities f ,Bus b where b.Bus_No=r.Bus_No and b.Bus_No=f.Bus_No and r.RID=f.RID and r.source=? and r.destination=?");
            ps.setString(1,a);
            ps.setString(2,b);
            rs=ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException e)
        {
             System.out.println("Exception"+e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String a=(String)jComboBox1.getSelectedItem();
        String b=(String)jComboBox2.getSelectedItem();
         jap j=new jap();
        try
        {
            jComboBox2.removeAllItems();
            ps=(j.con).prepareStatement("Select destination from route where source=? ");
            ps.setString(1,a);
            rs=ps.executeQuery();
            while(rs.next())
            {
                String s=rs.getString("destination");
                jComboBox2.addItem(s);
            }     
        }
        catch(SQLException e)
        {
             System.out.println("Exception"+e);
        }
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BMTC B=new BMTC();
        B.setVisible(true);
        close();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DETAILS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
