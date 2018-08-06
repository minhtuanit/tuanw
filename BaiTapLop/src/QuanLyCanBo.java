import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.List;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class QuanLyCanBo extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaCanBo;
	private JTextField txtHoTen;
	private JTextField txtSoLuong;
	private DocGhiFile docghifile = new DocGhiFile();
	private List jlist = new List();
	private java.util.List<CanBo> list;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyCanBo frame = new QuanLyCanBo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyCanBo() {
		addWindowStateListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				super.windowOpened(arg0);
				list = docghifile.docfile();
				int lenght = list.size();
				for(int i=0; i < lenght; i++) {
					jlist.add(list.get(i).getHotenn());
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblMaCanBo = new JLabel("Ma Can Bo");
		lblMaCanBo.setBounds(10, 22, 82, 14);
		contentPane.add(lblMaCanBo);
		
		JLabel lblHoTen = new JLabel("Ho Ten");
		lblHoTen.setBounds(10, 47, 82, 14);
		contentPane.add(lblHoTen);
		
		JLabel lblHeSoLuong = new JLabel("He So Luong");
		lblHeSoLuong.setBounds(10, 72, 82, 14);
		contentPane.add(lblHeSoLuong);
		
		txtMaCanBo = new JTextField();
		txtMaCanBo.setBounds(114, 19, 129, 20);
		contentPane.add(txtMaCanBo);
		txtMaCanBo.setColumns(10);
		
		txtHoTen = new JTextField();
		txtHoTen.setBounds(114, 44, 129, 20);
		contentPane.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setBounds(114, 69, 129, 20);
		contentPane.add(txtSoLuong);
		txtSoLuong.setColumns(10);
		
		jlist = new List();
		jlist.setBounds(112, 106, 131, 93);
		contentPane.add(jlist);
		
		JButton btnThem = new JButton("Them");
		btnThem.setBounds(271, 18, 89, 23);
		contentPane.add(btnThem);
		
		JButton btnHienThi = new JButton("Hien Thi");
		btnHienThi.setBounds(271, 43, 89, 23);
		contentPane.add(btnHienThi);
		
		JButton btnTim = new JButton("Tim");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnTim.setBounds(271, 68, 89, 23);
		contentPane.add(btnTim);
		
		JButton btnXoa = new JButton("Xoa");
		btnXoa.setBounds(271, 106, 89, 23);
		contentPane.add(btnXoa);
		
		JButton btnSua = new JButton("Sua");
		btnSua.setBounds(271, 137, 89, 23);
		contentPane.add(btnSua);
		
		JButton btnLuu = new JButton("Luu");
		btnLuu.setBounds(271, 171, 89, 23);
		contentPane.add(btnLuu);
		
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				CanBo canBo = new CanBo(txtMaCanBo.getText(), txtHoTen.getText(), Double.parseDouble(txtSoLuong.getText()));
				list.add(canBo);
			}
		});
		
		btnHienThi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				list = docghifile.docfile();
				jlist.removeAll();
				for(int i=0; i < list.size(); i++) {
					jlist.add(list.get(i).getHotenn());
				
				}
				
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				jlist.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent arg0) {
						list.remove(arg0.getItem());
					}
				});
			}
		});
		
		btnTim.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = JOptionPane.showInputDialog(null, "Nhap Ten");
				int length = s 
				
			}
		});
	}
	
}
