/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Bean.DanhMucBean;
import controllers.MainController;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hai
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() throws SQLException, ClassNotFoundException {
        initComponents();
        setTitle("QUẢN LÝ THÔNG TIN COVID-19");
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChu", Home, jblTrangChu));
        listDanhMuc.add(new DanhMucBean("NhanKhau", NhanKhauBtn, jlbNhanKhau));
        listDanhMuc.add(new DanhMucBean("HoKhau", HoKhauBtn, jlbHoKhau));
        listDanhMuc.add(new DanhMucBean("ThongKe", ThongKeBtn, jlbThongKe));
        listDanhMuc.add(new DanhMucBean("KhaiBao", KhaiBaoBtn,jlbKhaiBao));
        listDanhMuc.add(new DanhMucBean("Test", TestBtn, jlbTest));
        listDanhMuc.add(new DanhMucBean("CachLy", CachLyBtn, jlbCachLy));
        
        MainController controller = new MainController(jpnBean, this);
        controller.setView(Home, jblTrangChu, "TrangChu");
        controller.setEvent(listDanhMuc);
        // confirm de thuc hien dong
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
                    dispose();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnContainer = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jblTrangChu = new javax.swing.JLabel();
        NhanKhauBtn = new javax.swing.JPanel();
        jlbNhanKhau = new javax.swing.JLabel();
        HoKhauBtn = new javax.swing.JPanel();
        jlbHoKhau = new javax.swing.JLabel();
        ThongKeBtn = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        KhaiBaoBtn = new javax.swing.JPanel();
        jlbKhaiBao = new javax.swing.JLabel();
        TestBtn = new javax.swing.JPanel();
        jlbTest = new javax.swing.JLabel();
        CachLyBtn = new javax.swing.JPanel();
        jlbCachLy = new javax.swing.JLabel();
        jpnBean = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnContainer.setBackground(new java.awt.Color(255, 255, 255));

        jpnMenu.setBackground(new java.awt.Color(153, 153, 153));

        Home.setBackground(new java.awt.Color(0, 160, 50));

        jblTrangChu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/app.png"))); // NOI18N
        jblTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblTrangChu)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jblTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        NhanKhauBtn.setBackground(new java.awt.Color(102, 102, 102));
        NhanKhauBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbNhanKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/multiple-users-silhouette.png"))); // NOI18N
        jlbNhanKhau.setText("Nhân Khẩu");

        javax.swing.GroupLayout NhanKhauBtnLayout = new javax.swing.GroupLayout(NhanKhauBtn);
        NhanKhauBtn.setLayout(NhanKhauBtnLayout);
        NhanKhauBtnLayout.setHorizontalGroup(
            NhanKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanKhau)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        NhanKhauBtnLayout.setVerticalGroup(
            NhanKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanKhauBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNhanKhau)
                .addContainerGap())
        );

        HoKhauBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbHoKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        jlbHoKhau.setText("Hộ Khẩu");

        javax.swing.GroupLayout HoKhauBtnLayout = new javax.swing.GroupLayout(HoKhauBtn);
        HoKhauBtn.setLayout(HoKhauBtnLayout);
        HoKhauBtnLayout.setHorizontalGroup(
            HoKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        HoKhauBtnLayout.setVerticalGroup(
            HoKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThongKeBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbThongKe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/increasing-stocks-graphic.png"))); // NOI18N
        jlbThongKe.setText("Thống Kê");
        jlbThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ThongKeBtnLayout = new javax.swing.GroupLayout(ThongKeBtn);
        ThongKeBtn.setLayout(ThongKeBtnLayout);
        ThongKeBtnLayout.setHorizontalGroup(
            ThongKeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        ThongKeBtnLayout.setVerticalGroup(
            ThongKeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbThongKe)
                .addContainerGap())
        );

        KhaiBaoBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbKhaiBao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbKhaiBao.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhaiBao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/healthreport_icon.png"))); // NOI18N
        jlbKhaiBao.setText("Khai Báo Dịch Tễ");
        jlbKhaiBao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlbKhaiBao.setPreferredSize(new java.awt.Dimension(115, 54));

        javax.swing.GroupLayout KhaiBaoBtnLayout = new javax.swing.GroupLayout(KhaiBaoBtn);
        KhaiBaoBtn.setLayout(KhaiBaoBtnLayout);
        KhaiBaoBtnLayout.setHorizontalGroup(
            KhaiBaoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhaiBaoBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhaiBao, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        KhaiBaoBtnLayout.setVerticalGroup(
            KhaiBaoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KhaiBaoBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbKhaiBao, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TestBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbTest.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTest.setForeground(new java.awt.Color(255, 255, 255));
        jlbTest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/testvirus_icon.png"))); // NOI18N
        jlbTest.setText("Test Covid");
        jlbTest.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout TestBtnLayout = new javax.swing.GroupLayout(TestBtn);
        TestBtn.setLayout(TestBtnLayout);
        TestBtnLayout.setHorizontalGroup(
            TestBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TestBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTest)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        TestBtnLayout.setVerticalGroup(
            TestBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TestBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTest)
                .addContainerGap())
        );

        CachLyBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbCachLy.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbCachLy.setForeground(new java.awt.Color(255, 255, 255));
        jlbCachLy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cachly_icon.png"))); // NOI18N
        jlbCachLy.setText("Cách Ly");
        jlbCachLy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout CachLyBtnLayout = new javax.swing.GroupLayout(CachLyBtn);
        CachLyBtn.setLayout(CachLyBtnLayout);
        CachLyBtnLayout.setHorizontalGroup(
            CachLyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CachLyBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCachLy)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        CachLyBtnLayout.setVerticalGroup(
            CachLyBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CachLyBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbCachLy)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnBeanLayout = new javax.swing.GroupLayout(jpnBean);
        jpnBean.setLayout(jpnBeanLayout);
        jpnBeanLayout.setHorizontalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnBeanLayout.setVerticalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NhanKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HoKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KhaiBaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CachLyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ThongKeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(HoKhauBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NhanKhauBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TestBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CachLyBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThongKeBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KhaiBaoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnBean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnContainerLayout = new javax.swing.GroupLayout(jpnContainer);
        jpnContainer.setLayout(jpnContainerLayout);
        jpnContainerLayout.setHorizontalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContainerLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnContainerLayout.setVerticalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnContainerLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CachLyBtn;
    private javax.swing.JPanel HoKhauBtn;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel KhaiBaoBtn;
    private javax.swing.JPanel NhanKhauBtn;
    private javax.swing.JPanel TestBtn;
    private javax.swing.JPanel ThongKeBtn;
    private javax.swing.JLabel jblTrangChu;
    private javax.swing.JLabel jlbCachLy;
    private javax.swing.JLabel jlbHoKhau;
    private javax.swing.JLabel jlbKhaiBao;
    private javax.swing.JLabel jlbNhanKhau;
    private javax.swing.JLabel jlbTest;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JPanel jpnBean;
    private javax.swing.JPanel jpnContainer;
    private javax.swing.JPanel jpnMenu;
    // End of variables declaration//GEN-END:variables
}
