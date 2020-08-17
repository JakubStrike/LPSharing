package lpsharing;

import java.awt.EventQueue;
import java.awt.FileDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class LoginMenu {

	private JFrame frame;
	
	private String urlDB = "jdbc:mysql://sql2.freemysqlhosting.net:3306/sql2333529";
	private String loginDB = "sql2333529";
	private String passwordDB = "jR8%pU1*";
	
	private JPanel btnLine_1;
	private JPanel btnLogin;
	private JPanel loginPanel;
	private JPanel welcomePanel;
	private JPanel RegisterPanel;
	private JPanel mainBackgroundPanel;
	private JPanel loginMenu;
	private JPanel friendStoryboardPanel;
	private JPanel addPhotoPanel;
	private JPanel friendsMenu;
	private JPanel friendList, addFriend, invitations;
	private JPanel addFriendPanel;
	
	private JPanel btnFriends;
	
	private JLabel registerErrorUsername, registerErrorUsername2, registerErrorPassword, registerErrorPassword2, registerErrorAge, registerErrorAge2;
	
	private JLabel loginErrorMessage, passwordErrorMessage;
	
	private JLabel lblLogin;
	
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxDay, comboBoxDay2, comboBoxMonth, comboBoxMonth2, comboBoxYear, comboBoxYear2;
	
	private JPasswordField textPassword;
	private JTextField registerLogin, registerLogin2, textLogin;
	private JPasswordField registerPassword, registerPassword2;
	
	private JLabel lblAccountAdded;
	
	private JLabel picture1, picture2;
	private JTextArea commentList1, commentList2;
	
	private String login = "";
	private String path = "";
	
	private File file = null;
	private FileInputStream fis = null;
	
	private JScrollBar scrollBar;
	
	
	private BufferedImage[] pictures = new BufferedImage[100];
	private String[] comments = new String[100];
	private String[] userNames = new String [100];
	private String[] allInvities = new String [100];
	private String[] allFriends = new String [100];
	private String[] alluserNames = new String [100];
	
	private String[] invateNames;
	private String[] friendNames;
	
	private String getFriendName = "";
	private String getInviteName = "";
	
	private int inviteCounter = 0;
	private int friendCounter = 0;
	
	private int[] commentCounters = {0,1};
	private int ammountOfPosts = 0;
	private boolean userLogin = false;
	private boolean loginMenuActive = false;
	private boolean friendsMenuActive = false;
	
	private boolean addFriendScreenActive = false;
	private boolean invitieFromFriendScreenActive = false;
	private boolean showFriendScreenActive = false;
	
	private JTextField txtLocation;
	private JTextField commentInput1;
	private JTextField commentInput2;
	private JTextField txtSearchFriend;
	
	
	private JLabel userName1, userName2, userName3, userName4, userName5, userName6, userName7, userName8, userName9;
	private JLabel addFriend1, addFriend2, addFriend3, addFriend4, addFriend5, addFriend6, addFriend7, addFriend8, addFriend9;
	private JLabel blockFriend1, blockFriend2, blockFriend3, blockFriend4, blockFriend5, blockFriend6, blockFriend7, blockFriend8, blockFriend9;
	private JLabel viewFriend1, viewFriend2, viewFriend3, viewFriend4, viewFriend5, viewFriend6, viewFriend7, viewFriend8, viewFriend9;
	private JPanel friend1;
	private JPanel friend2;
	private JPanel friend3;
	private JPanel friend4;
	private JPanel friend5;
	private JPanel friend6;
	private JPanel friend7;
	private JPanel friend8;
	private JPanel friend9;
	private JLabel friendNameStoryboard;
	private JLabel searchForFriend;
	private JPanel friendListPanel;
	private JPanel searchFriendListPanel;
	private JTextField txtSearchFriendList;
	private JLabel SearchFriendList;
	private JLabel viewProfile1;
	private JLabel block1;
	private JLabel friendName1;
	private JPanel friendPanel1;
	private JPanel friendPanel2;
	private JPanel friendPanel3;
	private JPanel friendPanel4;
	private JPanel friendPanel5;
	private JPanel friendPanel6;
	private JPanel friendPanel7;
	private JPanel friendPanel8;
	private JPanel friendPanel9;
	private JLabel friendName2;
	private JLabel friendName3;
	private JLabel friendName4;
	private JLabel friendName5;
	private JLabel friendName6;
	private JLabel friendName7;
	private JLabel friendName8;
	private JLabel friendName9;
	private JLabel block2;
	private JLabel block3;
	private JLabel block4;
	private JLabel block5;
	private JLabel block6;
	private JLabel block7;
	private JLabel block8;
	private JLabel block9;
	private JLabel viewProfile2;
	private JLabel viewProfile3;
	private JLabel viewProfile4;
	private JLabel viewProfile5;
	private JLabel viewProfile6;
	private JLabel viewProfile7;
	private JLabel viewProfile8;
	private JLabel viewProfile9;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMenu window = new LoginMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("rawtypes")
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 788, 587);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 784, 561);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		friendsMenu = new JPanel();
		friendsMenu.setBackground(new Color(41,57,80));
		friendsMenu.setBounds(538, 60, 123, 180);
		friendsMenu.setVisible(false);
		
		loginMenu = new JPanel();
		loginMenu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		loginMenu.setBackground(new Color(41,57,80));
		loginMenu.setBounds(661, 60, 123, 120);
		loginMenu.setVisible(false);
		panel.add(loginMenu);
		loginMenu.setLayout(null);
		
		JPanel settingsMenu = new JPanel();
		settingsMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
			}
		});
		settingsMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		settingsMenu.setBackground(new Color(41,57,80));
		settingsMenu.setBounds(0, 0, 123, 60);
		loginMenu.add(settingsMenu);
		settingsMenu.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Settings");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 14, 123, 35);
		settingsMenu.add(lblNewLabel_3);
		
		JPanel logoff = new JPanel();
		logoff.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				logoff();
			}
		});
		logoff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logoff.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		logoff.setBackground(new Color(41,57,80));
		logoff.setBounds(0, 60, 123, 60);
		loginMenu.add(logoff);
		logoff.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Sign Out");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(0, 14, 123, 35);
		logoff.add(lblNewLabel_8);
		panel.add(friendsMenu);
		friendsMenu.setLayout(null);
		
		friendList = new JPanel();
		friendList.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				addFriendScreenActive = false;
				invitieFromFriendScreenActive = false;
				showFriendScreenActive = true;
				
				friendsMenu.setVisible(false);
				friendsMenuActive = false;	
				loginMenu.setVisible(false);
				loginMenuActive = false;
				
				addFriendPanel.setVisible(false);
				mainBackgroundPanel.setVisible(false);
				friendListPanel.setVisible(true);
				
				updateFriendsName();
			}
		});
		friendList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		friendList.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		friendList.setBackground(new Color(41,57,80));
		friendList.setBounds(0, 0, 123, 60);
		friendsMenu.add(friendList);
		friendList.setLayout(null);
		
		JLabel lblFriends_1 = new JLabel("Friends");
		lblFriends_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriends_1.setForeground(Color.WHITE);
		lblFriends_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblFriends_1.setBounds(0, 11, 123, 35);
		friendList.add(lblFriends_1);
		
		addFriend = new JPanel();
		addFriend.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				addFriendScreenActive = true;
				invitieFromFriendScreenActive = false;
				showFriendScreenActive = false;
				
				
				searchForFriend.setVisible(true);
				txtSearchFriend.setVisible(true);
				
				addFriendPanel.setVisible(true);
				mainBackgroundPanel.setVisible(false);
				friendListPanel.setVisible(false);
				
				friendsMenu.setVisible(false);
				friendsMenuActive = false;	
				
				txtSearchFriend.setText("");
				
				setAllFriendPanelsToFalse();
			}
		});
		addFriend.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		addFriend.setBackground(new Color(41,57,80));
		addFriend.setBounds(0, 60, 123, 60);
		friendsMenu.add(addFriend);
		addFriend.setLayout(null);
		
		JLabel lblAddFriend = new JLabel("Add Friend");
		lblAddFriend.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddFriend.setForeground(Color.WHITE);
		lblAddFriend.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAddFriend.setBounds(0, 11, 123, 35);
		addFriend.add(lblAddFriend);
		
		invitations = new JPanel();
		invitations.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				addFriendScreenActive = false;
				invitieFromFriendScreenActive = true;
				showFriendScreenActive = false;
				
				searchForFriend.setVisible(false);
				txtSearchFriend.setVisible(false);
				
				addFriendPanel.setVisible(true);
				mainBackgroundPanel.setVisible(false);
				friendListPanel.setVisible(false);
				
				friendsMenu.setVisible(false);
				friendsMenuActive = false;	
				
				updateInviteUserName();
			}
		});
		invitations.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		invitations.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		invitations.setBackground(new Color(41,57,80));
		invitations.setBounds(0, 120, 123, 60);
		friendsMenu.add(invitations);
		invitations.setLayout(null);
		
		JLabel lblInvitations = new JLabel("Invitations");
		lblInvitations.setHorizontalAlignment(SwingConstants.CENTER);
		lblInvitations.setForeground(Color.WHITE);
		lblInvitations.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblInvitations.setBounds(0, 11, 123, 35);
		invitations.add(lblInvitations);
		
		addFriendPanel = new JPanel();
		addFriendPanel.setVisible(false);
		
		mainBackgroundPanel = new JPanel();
		mainBackgroundPanel.setBackground(new Color(71,120,197));
		mainBackgroundPanel.setBounds(0, 60, 784, 501);
		mainBackgroundPanel.setVisible(false);
		
		friendListPanel = new JPanel();
		friendListPanel.setBackground(new Color(71,120,197));
		friendListPanel.setVisible(false);
		friendListPanel.setBounds(0, 60, 784, 501);
		panel.add(friendListPanel);
		friendListPanel.setLayout(null);
		
		JPanel mainFriendListPanel = new JPanel();
		mainFriendListPanel.setBounds(100, 0, 584, 501);
		friendListPanel.add(mainFriendListPanel);
		mainFriendListPanel.setLayout(null);
		
		searchFriendListPanel = new JPanel();
		searchFriendListPanel.setLayout(null);
		searchFriendListPanel.setBackground(new Color(41, 57, 80));
		searchFriendListPanel.setBounds(0, 0, 584, 50);
		mainFriendListPanel.add(searchFriendListPanel);
		
		txtSearchFriendList = new JTextField();
		txtSearchFriendList.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSearchFriendList.setColumns(10);
		txtSearchFriendList.setBounds(10, 11, 160, 28);
		searchFriendListPanel.add(txtSearchFriendList);
		
		SearchFriendList = new JLabel("");
		SearchFriendList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SearchFriendList.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				findUserInFriendList();
			}
		});
		SearchFriendList.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		SearchFriendList.setBounds(176, 0, 50, 50);
		searchFriendListPanel.add(SearchFriendList);
		
		friendPanel1 = new JPanel();
		friendPanel1.setLayout(null);
		friendPanel1.setBackground(new Color(41, 57, 80));
		friendPanel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel1.setBounds(0, 50, 584, 50);
		mainFriendListPanel.add(friendPanel1);
		
		
		friendName1 = new JLabel("User Name");
		friendName1.setHorizontalAlignment(SwingConstants.CENTER);
		friendName1.setForeground(Color.WHITE);
		friendName1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName1.setBounds(0, 11, 123, 28);
		friendPanel1.add(friendName1);
		
		block1 = new JLabel("");
		block1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName1);
			}
		});
		block1.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block1.setBounds(123, 0, 50, 50);
		friendPanel1.add(block1);
		
		viewProfile1 = new JLabel("View Profile");
		viewProfile1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				viewFriendProfile(friendName1);
			}
		});
		viewProfile1.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile1.setForeground(new Color(71, 120, 197));
		viewProfile1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile1.setBounds(173, 0, 90, 50);
		friendPanel1.add(viewProfile1);
		
		friendPanel2 = new JPanel();
		friendPanel2.setLayout(null);
		friendPanel2.setBackground(new Color(41, 57, 80));
		friendPanel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel2.setBounds(0, 100, 584, 50);
		mainFriendListPanel.add(friendPanel2);
		
		friendName2 = new JLabel("User Name");
		friendName2.setHorizontalAlignment(SwingConstants.CENTER);
		friendName2.setForeground(Color.WHITE);
		friendName2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName2.setBounds(0, 11, 123, 28);
		friendPanel2.add(friendName2);
		
		block2 = new JLabel("");
		block2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName2);
			}
		});
		block2.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block2.setBounds(123, 0, 50, 50);
		friendPanel2.add(block2);
		
		viewProfile2 = new JLabel("View Profile");
		viewProfile2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile2);
			}
		});
		viewProfile2.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile2.setForeground(new Color(71, 120, 197));
		viewProfile2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile2.setBounds(173, 0, 90, 50);
		friendPanel2.add(viewProfile2);
		
		friendPanel3 = new JPanel();
		friendPanel3.setLayout(null);
		friendPanel3.setBackground(new Color(41, 57, 80));
		friendPanel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel3.setBounds(0, 150, 584, 50);
		mainFriendListPanel.add(friendPanel3);
		
		friendName3 = new JLabel("User Name");
		friendName3.setHorizontalAlignment(SwingConstants.CENTER);
		friendName3.setForeground(Color.WHITE);
		friendName3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName3.setBounds(0, 11, 123, 28);
		friendPanel3.add(friendName3);
		
		block3 = new JLabel("");
		block3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName3);
			}
		});
		block3.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block3.setBounds(123, 0, 50, 50);
		friendPanel3.add(block3);
		
		viewProfile3 = new JLabel("View Profile");
		viewProfile3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				viewFriendProfile(viewProfile3);
			}
		});
		viewProfile3.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile3.setForeground(new Color(71, 120, 197));
		viewProfile3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile3.setBounds(173, 0, 90, 50);
		friendPanel3.add(viewProfile3);
		
		friendPanel4 = new JPanel();
		friendPanel4.setLayout(null);
		friendPanel4.setBackground(new Color(41, 57, 80));
		friendPanel4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel4.setBounds(0, 200, 584, 50);
		mainFriendListPanel.add(friendPanel4);
		
		friendName4 = new JLabel("User Name");
		friendName4.setHorizontalAlignment(SwingConstants.CENTER);
		friendName4.setForeground(Color.WHITE);
		friendName4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName4.setBounds(0, 11, 123, 28);
		friendPanel4.add(friendName4);
		
		block4 = new JLabel("");
		block4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName4);
			}
		});
		block4.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block4.setBounds(123, 0, 50, 50);
		friendPanel4.add(block4);
		
		viewProfile4 = new JLabel("View Profile");
		viewProfile4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile4);
			}
		});
		viewProfile4.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile4.setForeground(new Color(71, 120, 197));
		viewProfile4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile4.setBounds(173, 0, 90, 50);
		friendPanel4.add(viewProfile4);
		
		friendPanel5 = new JPanel();
		friendPanel5.setLayout(null);
		friendPanel5.setBackground(new Color(41, 57, 80));
		friendPanel5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel5.setBounds(0, 250, 584, 50);
		mainFriendListPanel.add(friendPanel5);
		
		friendName5 = new JLabel("User Name");
		friendName5.setHorizontalAlignment(SwingConstants.CENTER);
		friendName5.setForeground(Color.WHITE);
		friendName5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName5.setBounds(0, 11, 123, 28);
		friendPanel5.add(friendName5);
		
		block5 = new JLabel("");
		block5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName5);
			}
		});
		block5.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block5.setBounds(123, 0, 50, 50);
		friendPanel5.add(block5);
		
		viewProfile5 = new JLabel("View Profile");
		viewProfile5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				viewFriendProfile(viewProfile5);
			}
		});
		viewProfile5.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile5.setForeground(new Color(71, 120, 197));
		viewProfile5.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile5.setBounds(173, 0, 90, 50);
		friendPanel5.add(viewProfile5);
		
		friendPanel6 = new JPanel();
		friendPanel6.setLayout(null);
		friendPanel6.setBackground(new Color(41, 57, 80));
		friendPanel6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel6.setBounds(0, 300, 584, 50);
		mainFriendListPanel.add(friendPanel6);
		
		friendName6 = new JLabel("User Name");
		friendName6.setHorizontalAlignment(SwingConstants.CENTER);
		friendName6.setForeground(Color.WHITE);
		friendName6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName6.setBounds(0, 11, 123, 28);
		friendPanel6.add(friendName6);
		
		block6 = new JLabel("");
		block6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName6);
			}
		});
		block6.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block6.setBounds(123, 0, 50, 50);
		friendPanel6.add(block6);
		
		viewProfile6 = new JLabel("View Profile");
		viewProfile6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile6);
			}
		});
		viewProfile6.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile6.setForeground(new Color(71, 120, 197));
		viewProfile6.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile6.setBounds(173, 0, 90, 50);
		friendPanel6.add(viewProfile6);
		
		friendPanel7 = new JPanel();
		friendPanel7.setLayout(null);
		friendPanel7.setBackground(new Color(41, 57, 80));
		friendPanel7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel7.setBounds(0, 350, 584, 50);
		mainFriendListPanel.add(friendPanel7);
		
		friendName7 = new JLabel("User Name");
		friendName7.setHorizontalAlignment(SwingConstants.CENTER);
		friendName7.setForeground(Color.WHITE);
		friendName7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName7.setBounds(0, 11, 123, 28);
		friendPanel7.add(friendName7);
		
		block7 = new JLabel("");
		block7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName7);
			}
		});
		block7.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block7.setBounds(123, 0, 50, 50);
		friendPanel7.add(block7);
		
		viewProfile7 = new JLabel("View Profile");
		viewProfile7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile7);
			}
		});
		viewProfile7.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile7.setForeground(new Color(71, 120, 197));
		viewProfile7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile7.setBounds(173, 0, 90, 50);
		friendPanel7.add(viewProfile7);
		
		friendPanel8 = new JPanel();
		friendPanel8.setLayout(null);
		friendPanel8.setBackground(new Color(41, 57, 80));
		friendPanel8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel8.setBounds(0, 400, 584, 50);
		mainFriendListPanel.add(friendPanel8);
		
		friendName8 = new JLabel("User Name");
		friendName8.setHorizontalAlignment(SwingConstants.CENTER);
		friendName8.setForeground(Color.WHITE);
		friendName8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName8.setBounds(0, 11, 123, 28);
		friendPanel8.add(friendName8);
		
		block8 = new JLabel("");
		block8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName8);
			}
		});
		block8.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block8.setBounds(123, 0, 50, 50);
		friendPanel8.add(block8);
		
		viewProfile8 = new JLabel("View Profile");
		viewProfile8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile8);
			}
		});
		viewProfile8.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile8.setForeground(new Color(71, 120, 197));
		viewProfile8.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile8.setBounds(173, 0, 90, 50);
		friendPanel8.add(viewProfile8);
		
		friendPanel9 = new JPanel();
		friendPanel9.setLayout(null);
		friendPanel9.setBackground(new Color(41, 57, 80));
		friendPanel9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friendPanel9.setBounds(0, 450, 584, 50);
		mainFriendListPanel.add(friendPanel9);
		
		friendName9 = new JLabel("User Name");
		friendName9.setHorizontalAlignment(SwingConstants.CENTER);
		friendName9.setForeground(Color.WHITE);
		friendName9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendName9.setBounds(0, 11, 123, 28);
		friendPanel9.add(friendName9);
		
		block9 = new JLabel("");
		block9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		block9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				deleteFriend(friendName9);
			}
		});
		block9.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		block9.setBounds(123, 0, 50, 50);
		friendPanel9.add(block9);
		
		viewProfile9 = new JLabel("View Profile");
		viewProfile9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewProfile9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				viewFriendProfile(viewProfile9);
			}
		});
		viewProfile9.setHorizontalAlignment(SwingConstants.LEFT);
		viewProfile9.setForeground(new Color(71, 120, 197));
		viewProfile9.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewProfile9.setBounds(173, 0, 90, 50);
		friendPanel9.add(viewProfile9);
		panel.add(mainBackgroundPanel);
		mainBackgroundPanel.setLayout(null);
		
		scrollBar = new JScrollBar();
		scrollBar.setForeground(new Color(71,120,197));
		scrollBar.setBackground(new Color(41,57,80));
		scrollBar.setBlockIncrement(1);
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				int scrollValue = 0;
				scrollValue = scrollBar.getValue();
				if(scrollValue < (ammountOfPosts - 1)) {
					commentCounters[0] = scrollValue;
					commentCounters[1] = scrollValue + 1;
					setPictureAndComment();	
				}
			}
		});
		scrollBar.setBounds(755, 0, 17, 501);
		mainBackgroundPanel.add(scrollBar);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(100, 0, 584, 501);
		mainBackgroundPanel.add(mainPanel);
		mainPanel.setLayout(null);
		
		addPhotoPanel = new JPanel();
		addPhotoPanel.setBackground(new Color(41,57,80));
		addPhotoPanel.setBounds(0, 0, 584, 50);
		addPhotoPanel.setVisible(true);
		mainPanel.add(addPhotoPanel);
		addPhotoPanel.setLayout(null);
		
		JLabel photoPicture = new JLabel("");
		photoPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				uploadPicutre();
				
			}
		});
		photoPicture.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		photoPicture.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/uploadPic2.png")));
		photoPicture.setBounds(20, 0, 114, 50);
		addPhotoPanel.add(photoPicture);
		
		JLabel lblNewLabel_9 = new JLabel("Add Photo");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel_9.setBounds(50, 0, 84, 50);
		addPhotoPanel.add(lblNewLabel_9);
		
		txtLocation = new JTextField();
		txtLocation.setBounds(137, 17, 183, 20);
		addPhotoPanel.add(txtLocation);
		txtLocation.setColumns(10);
		
		JLabel lblAddLocalisation = new JLabel("Add Localisation");
		lblAddLocalisation.setForeground(Color.WHITE);
		lblAddLocalisation.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblAddLocalisation.setBounds(330, 0, 118, 50);
		addPhotoPanel.add(lblAddLocalisation);
		
		JLabel btnConfirm = new JLabel("");
		btnConfirm.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		btnConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				addPictureToDatabase();
			}
		});
		btnConfirm.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirm.setBounds(468, 0, 50, 50);
		addPhotoPanel.add(btnConfirm);
		
		JLabel btnDecline = new JLabel("");
		btnDecline.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		btnDecline.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				resetPicture();
			}
		});
		btnDecline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDecline.setBounds(524, 0, 50, 50);
		addPhotoPanel.add(btnDecline);
		
		friendStoryboardPanel = new JPanel();
		friendStoryboardPanel.setBackground(new Color(41,57,80));
		friendStoryboardPanel.setBounds(0, 0, 584, 50);
		friendStoryboardPanel.setVisible(false);
		mainPanel.add(friendStoryboardPanel);
		friendStoryboardPanel.setLayout(null);
		
		friendNameStoryboard = new JLabel("username");
		friendNameStoryboard.setHorizontalAlignment(SwingConstants.CENTER);
		friendNameStoryboard.setFont(new Font("Segoe UI", Font.BOLD, 14));
		friendNameStoryboard.setForeground(new Color(255, 255, 255));
		friendNameStoryboard.setBounds(0, 0, 584, 50);
		friendStoryboardPanel.add(friendNameStoryboard);
		
		JPanel firstPicturePanel = new JPanel();
		firstPicturePanel.setBackground(new Color(255, 255, 255));
		firstPicturePanel.setBounds(0, 50, 584, 225);
		mainPanel.add(firstPicturePanel);
		firstPicturePanel.setLayout(null);
		
		picture1 = new JLabel("");
		picture1.setBounds(0, 0, 225, 225);
		firstPicturePanel.add(picture1);
		
		JPanel comments1 = new JPanel();
		comments1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comments1.setBackground(new Color(23,35,51));
		comments1.setBounds(224, 0, 360, 225);
		firstPicturePanel.add(comments1);
		comments1.setLayout(null);
		
		commentList1 = new JTextArea();
		commentList1.setEditable(false);
		commentList1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		commentList1.setBounds(10, 11, 340, 171);
		comments1.add(commentList1);
		
		commentInput1 = new JTextField();
		commentInput1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		commentInput1.setBounds(10, 195, 249, 20);
		comments1.add(commentInput1);
		commentInput1.setColumns(10);
		
		JButton btnSendComment1 = new JButton("Send");
		btnSendComment1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sendComment(commentInput1, commentCounters[0]);
			}
		});
		btnSendComment1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSendComment1.setForeground(Color.WHITE);
		btnSendComment1.setFocusPainted(false);
		btnSendComment1.setDefaultCapable(false);
		btnSendComment1.setBorderPainted(false);
		btnSendComment1.setBackground(Color.BLACK);
		btnSendComment1.setBounds(270, 194, 80, 20);
		comments1.add(btnSendComment1);
		
		JPanel secondPicturePanel = new JPanel();
		secondPicturePanel.setBackground(new Color(255, 255, 255));
		secondPicturePanel.setBounds(0, 275, 584, 226);
		mainPanel.add(secondPicturePanel);
		secondPicturePanel.setLayout(null);
		
		picture2 = new JLabel("");
		picture2.setBounds(0, 0, 225, 225);
		secondPicturePanel.add(picture2);
		
		JPanel comments2 = new JPanel();
		comments2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		comments2.setBackground(new Color(23,35,51));
		comments2.setForeground(new Color(0, 0, 0));
		comments2.setBounds(224, 0, 360, 226);
		secondPicturePanel.add(comments2);
		comments2.setLayout(null);
		
		commentInput2 = new JTextField();
		commentInput2.setColumns(10);
		commentInput2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		commentInput2.setBounds(10, 195, 249, 20);
		comments2.add(commentInput2);
		
		JButton btnSendComment2 = new JButton("Send");
		btnSendComment2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sendComment(commentInput2, commentCounters[1]);
			}
		});
		btnSendComment2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSendComment2.setForeground(Color.WHITE);
		btnSendComment2.setFocusPainted(false);
		btnSendComment2.setDefaultCapable(false);
		btnSendComment2.setBorderPainted(false);
		btnSendComment2.setBackground(Color.BLACK);
		btnSendComment2.setBounds(270, 194, 80, 20);
		comments2.add(btnSendComment2);
		
		commentList2 = new JTextArea();
		commentList2.setEditable(false);
		commentList2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		commentList2.setBounds(10, 11, 340, 171);
		comments2.add(commentList2);
		addFriendPanel.setBounds(0, 60, 784, 501);
		addFriendPanel.setBackground(new Color(71,120,197));
		panel.add(addFriendPanel);
		addFriendPanel.setLayout(null);
		
		JPanel mainAddFriendPanel = new JPanel();
		mainAddFriendPanel.setBackground(new Color(255, 255, 255));
		mainAddFriendPanel.setBounds(100, 0, 584, 501);
		addFriendPanel.add(mainAddFriendPanel);
		mainAddFriendPanel.setLayout(null);
		
		JPanel searchForFriendPanel = new JPanel();
		searchForFriendPanel.setBounds(0, 0, 584, 50);
		searchForFriendPanel.setBackground(new Color(41,57,80));
		mainAddFriendPanel.add(searchForFriendPanel);
		searchForFriendPanel.setLayout(null);
		
		txtSearchFriend = new JTextField();
		txtSearchFriend.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSearchFriend.setBounds(10, 11, 160, 28);
		searchForFriendPanel.add(txtSearchFriend);
		txtSearchFriend.setColumns(10);
		
		searchForFriend = new JLabel("");
		searchForFriend.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchForFriend.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				searchForFriend();
				
			}
		});
		searchForFriend.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		searchForFriend.setBounds(176, 0, 50, 50);
		searchForFriendPanel.add(searchForFriend);
		
		friend1 = new JPanel();
		friend1.setVisible(false);
		friend1.setBounds(0, 50, 584, 50);
		friend1.setBackground(new Color(41,57,80));
		friend1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainAddFriendPanel.add(friend1);
		friend1.setLayout(null);
		
		userName1 = new JLabel("User Name");
		userName1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName1.setForeground(Color.WHITE);
		userName1.setHorizontalAlignment(SwingConstants.CENTER);
		userName1.setBounds(0, 11, 123, 28);
		friend1.add(userName1);
		
		addFriend1 = new JLabel("");
		addFriend1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(addFriendScreenActive == true) {
					addFriend(userName1, addFriend1);
				}
				if(invitieFromFriendScreenActive == true) {
					acceptInvite(userName1, addFriend1);
				}
				
			}
		});
		addFriend1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend1.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend1.setBounds(123, 0, 50, 50);
		friend1.add(addFriend1);
		
		blockFriend1 = new JLabel("");
		blockFriend1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
					deleteFriend(userName1);
				}
				if(invitieFromFriendScreenActive == true) {
					deleteAcceptedInvite(userName1);
				}	
			}
		});
		blockFriend1.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend1.setBounds(173, 0, 50, 50);
		friend1.add(blockFriend1);
		
		viewFriend1 = new JLabel("View Profile");
		viewFriend1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName1);
				}
			}
		});
		viewFriend1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend1.setForeground(new Color(71,120,197));
		viewFriend1.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend1.setBounds(220, 0, 90, 50);
		friend1.add(viewFriend1);
		
		friend2 = new JPanel();
		friend2.setVisible(false);
		friend2.setLayout(null);
		friend2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend2.setBackground(new Color(41, 57, 80));
		friend2.setBounds(0, 100, 584, 50);
		mainAddFriendPanel.add(friend2);
		
		userName2 = new JLabel("User Name");
		userName2.setHorizontalAlignment(SwingConstants.CENTER);
		userName2.setForeground(Color.WHITE);
		userName2.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName2.setBounds(0, 11, 123, 28);
		friend2.add(userName2);
		
		addFriend2 = new JLabel("");
		addFriend2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
					addFriend(userName2, addFriend2);
				}
			}
		});
		addFriend2.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend2.setBounds(123, 0, 50, 50);
		friend2.add(addFriend2);
		
		blockFriend2 = new JLabel("");
		blockFriend2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
					deleteFriend(userName2);
				}
				if(invitieFromFriendScreenActive == true) {
					deleteAcceptedInvite(userName2);
				}	
			}
		});
		blockFriend2.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend2.setBounds(173, 0, 50, 50);
		friend2.add(blockFriend2);
		
		viewFriend2 = new JLabel("View Profile");
		viewFriend2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName2);
				}
			}
		});
		viewFriend2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend2.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend2.setForeground(new Color(71, 120, 197));
		viewFriend2.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend2.setBounds(220, 0, 90, 50);
		friend2.add(viewFriend2);
		
		friend3 = new JPanel();
		friend3.setVisible(false);
		friend3.setLayout(null);
		friend3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend3.setBackground(new Color(41, 57, 80));
		friend3.setBounds(0, 150, 584, 50);
		mainAddFriendPanel.add(friend3);
		
		userName3 = new JLabel("User Name");
		userName3.setHorizontalAlignment(SwingConstants.CENTER);
		userName3.setForeground(Color.WHITE);
		userName3.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName3.setBounds(0, 11, 123, 28);
		friend3.add(userName3);
		
		addFriend3 = new JLabel("");
		addFriend3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
					addFriend(userName3, addFriend3);
				}
			}
		});
		addFriend3.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend3.setBounds(123, 0, 50, 50);
		friend3.add(addFriend3);
		
		blockFriend3 = new JLabel("");
		blockFriend3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
					deleteFriend(userName3);
				}
				if(invitieFromFriendScreenActive == true) {
					deleteAcceptedInvite(userName3);
				}	
			}
		});
		blockFriend3.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend3.setBounds(173, 0, 50, 50);
		friend3.add(blockFriend3);
		
		viewFriend3 = new JLabel("View Profile");
		viewFriend3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName3);
				}
			}
		});
		viewFriend3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend3.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend3.setForeground(new Color(71, 120, 197));
		viewFriend3.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend3.setBounds(220, 0, 90, 50);
		friend3.add(viewFriend3);
		
		friend4 = new JPanel();
		friend4.setVisible(false);
		friend4.setLayout(null);
		friend4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend4.setBackground(new Color(41, 57, 80));
		friend4.setBounds(0, 200, 584, 50);
		mainAddFriendPanel.add(friend4);
		
		userName4 = new JLabel("User Name");
		userName4.setHorizontalAlignment(SwingConstants.CENTER);
		userName4.setForeground(Color.WHITE);
		userName4.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName4.setBounds(0, 11, 123, 28);
		friend4.add(userName4);
		
		addFriend4 = new JLabel("");
		addFriend4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName4, addFriend4);
				}
			}
		});
		addFriend4.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend4.setBounds(123, 0, 50, 50);
		friend4.add(addFriend4);
		
		blockFriend4 = new JLabel("");
		blockFriend4.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend4.setBounds(173, 0, 50, 50);
		friend4.add(blockFriend4);
		
		viewFriend4 = new JLabel("View Profile");
		viewFriend4.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName4);
				}
			}
		});
		viewFriend4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend4.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend4.setForeground(new Color(71, 120, 197));
		viewFriend4.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend4.setBounds(220, 0, 90, 50);
		friend4.add(viewFriend4);
		
		friend5 = new JPanel();
		friend5.setVisible(false);
		friend5.setLayout(null);
		friend5.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend5.setBackground(new Color(41, 57, 80));
		friend5.setBounds(0, 250, 584, 50);
		mainAddFriendPanel.add(friend5);
		
		userName5 = new JLabel("User Name");
		userName5.setHorizontalAlignment(SwingConstants.CENTER);
		userName5.setForeground(Color.WHITE);
		userName5.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName5.setBounds(0, 11, 123, 28);
		friend5.add(userName5);
		
		addFriend5 = new JLabel("");
		addFriend5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName5, addFriend5);
				}
			}
		});
		addFriend5.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend5.setBounds(123, 0, 50, 50);
		friend5.add(addFriend5);
		
		blockFriend5 = new JLabel("");
		blockFriend5.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend5.setBounds(173, 0, 50, 50);
		friend5.add(blockFriend5);
		
		viewFriend5 = new JLabel("View Profile");
		viewFriend5.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName5);
				}
			}
		});
		viewFriend5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend5.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend5.setForeground(new Color(71, 120, 197));
		viewFriend5.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend5.setBounds(220, 0, 90, 50);
		friend5.add(viewFriend5);
		
		friend6 = new JPanel();
		friend6.setVisible(false);
		friend6.setLayout(null);
		friend6.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend6.setBackground(new Color(41, 57, 80));
		friend6.setBounds(0, 300, 584, 50);
		mainAddFriendPanel.add(friend6);
		
		userName6 = new JLabel("User Name");
		userName6.setHorizontalAlignment(SwingConstants.CENTER);
		userName6.setForeground(Color.WHITE);
		userName6.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName6.setBounds(0, 11, 123, 28);
		friend6.add(userName6);
		
		addFriend6 = new JLabel("");
		addFriend6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName6, addFriend6);
				}
			}
		});
		addFriend6.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend6.setBounds(123, 0, 50, 50);
		friend6.add(addFriend6);
		
		blockFriend6 = new JLabel("");
		blockFriend6.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend6.setBounds(173, 0, 50, 50);
		friend6.add(blockFriend6);
		
		viewFriend6 = new JLabel("View Profile");
		viewFriend6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName6);
				}
			}
		});
		viewFriend6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend6.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend6.setForeground(new Color(71, 120, 197));
		viewFriend6.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend6.setBounds(220, 0, 90, 50);
		friend6.add(viewFriend6);
		
		friend7 = new JPanel();
		friend7.setVisible(false);
		friend7.setLayout(null);
		friend7.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend7.setBackground(new Color(41, 57, 80));
		friend7.setBounds(0, 350, 584, 50);
		mainAddFriendPanel.add(friend7);
		
		userName7 = new JLabel("User Name");
		userName7.setHorizontalAlignment(SwingConstants.CENTER);
		userName7.setForeground(Color.WHITE);
		userName7.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName7.setBounds(0, 11, 123, 28);
		friend7.add(userName7);
		
		addFriend7 = new JLabel("");
		addFriend7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName7, addFriend7);
				}
			}
		});
		addFriend7.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend7.setBounds(123, 0, 50, 50);
		friend7.add(addFriend7);
		
		blockFriend7 = new JLabel("");
		blockFriend7.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend7.setBounds(173, 0, 50, 50);
		friend7.add(blockFriend7);
		
		viewFriend7 = new JLabel("View Profile");
		viewFriend7.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName7);
				}
			}
		});
		viewFriend7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend7.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend7.setForeground(new Color(71, 120, 197));
		viewFriend7.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend7.setBounds(220, 0, 90, 50);
		friend7.add(viewFriend7);
		
		friend8 = new JPanel();
		friend8.setVisible(false);
		friend8.setLayout(null);
		friend8.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend8.setBackground(new Color(41, 57, 80));
		friend8.setBounds(0, 400, 584, 50);
		mainAddFriendPanel.add(friend8);
		
		userName8 = new JLabel("User Name");
		userName8.setHorizontalAlignment(SwingConstants.CENTER);
		userName8.setForeground(Color.WHITE);
		userName8.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName8.setBounds(0, 11, 123, 28);
		friend8.add(userName8);
		
		addFriend8 = new JLabel("");
		addFriend8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName8, addFriend8);
				}
			}
		});
		addFriend8.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend8.setBounds(123, 0, 50, 50);
		friend8.add(addFriend8);
		
		blockFriend8 = new JLabel("");
		blockFriend8.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend8.setBounds(173, 0, 50, 50);
		friend8.add(blockFriend8);
		
		viewFriend8 = new JLabel("View Profile");
		viewFriend8.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName8);
				}
			}
		});
		viewFriend8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend8.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend8.setForeground(new Color(71, 120, 197));
		viewFriend8.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend8.setBounds(220, 0, 90, 50);
		friend8.add(viewFriend8);
		
		friend9 = new JPanel();
		friend9.setVisible(false);
		friend9.setLayout(null);
		friend9.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		friend9.setBackground(new Color(41, 57, 80));
		friend9.setBounds(0, 450, 584, 50);
		mainAddFriendPanel.add(friend9);
		
		userName9 = new JLabel("User Name");
		userName9.setHorizontalAlignment(SwingConstants.CENTER);
		userName9.setForeground(Color.WHITE);
		userName9.setFont(new Font("Segoe UI", Font.BOLD, 14));
		userName9.setBounds(0, 11, 123, 28);
		friend9.add(userName9);
		
		addFriend9 = new JLabel("");
		addFriend9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addFriend9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				addFriend(userName9, addFriend9);
				}
			}
		});
		addFriend9.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/accept.png")));
		addFriend9.setBounds(123, 0, 50, 50);
		friend9.add(addFriend9);
		
		blockFriend9 = new JLabel("");
		blockFriend9.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/decline.png")));
		blockFriend9.setBounds(173, 0, 50, 50);
		friend9.add(blockFriend9);
		
		viewFriend9 = new JLabel("View Profile");
		viewFriend9.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(addFriendScreenActive == true) {
				viewFriendProfile(userName9);
				}
			}
		});
		viewFriend9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewFriend9.setHorizontalAlignment(SwingConstants.LEFT);
		viewFriend9.setForeground(new Color(71, 120, 197));
		viewFriend9.setFont(new Font("Segoe UI", Font.BOLD, 13));
		viewFriend9.setBounds(220, 0, 90, 50);
		friend9.add(viewFriend9);
		
		JPanel menuBar = new JPanel();
		menuBar.setBorder(null);
		menuBar.setBackground(new Color(23,35,51));
		menuBar.setBounds(0, 0, 784, 60);
		panel.add(menuBar);
		menuBar.setLayout(null);
		
		btnLogin = new JPanel();
		btnLogin.setVisible(true);
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if(userLogin == false) {
					btnLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
					activeButton(btnLogin, btnLine_1);
					loginPanel.setVisible(true);
					welcomePanel.setVisible(false);
					RegisterPanel.setVisible(false);
				}else {
					if(loginMenuActive == false) {
						loginMenu.setVisible(true);
						loginMenuActive = true;	
					}else {
						loginMenu.setVisible(false);
						loginMenuActive = false;	
					}	
				}
			}
		});
		btnLogin.setBackground(new Color(23,35,51));
		btnLogin.setBounds(661, 0, 123, 60);
		menuBar.add(btnLogin);
		btnLogin.setLayout(null);
		
		btnLine_1 = new JPanel();
		btnLine_1.setOpaque(false);
		btnLine_1.setBounds(0, 0, 123, 3);
		btnLogin.add(btnLine_1);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogin.setForeground(new Color(255, 255, 255));
		lblLogin.setBounds(0, 14, 123, 35);
		btnLogin.add(lblLogin);
		
		JLabel logo = new JLabel("LPSharing");
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				resetColour();
				if(userLogin == false) {
					welcomePanel.setVisible(true);
					loginPanel.setVisible(false);
					RegisterPanel.setVisible(false);	
				}else {
					refreshPicturesAndComments();
					friendListPanel.setVisible(false);
					addFriendPanel.setVisible(false);
					mainBackgroundPanel.setVisible(true);
					addPhotoPanel.setVisible(true);
					friendStoryboardPanel.setVisible(false);
				}
				
			}
		});
		logo.setForeground(new Color(41,57,80));
		logo.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		logo.setBounds(10, 0, 112, 60);
		logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.add(logo);
		
		btnFriends = new JPanel();
		btnFriends.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(friendsMenuActive == false) {
					friendsMenu.setVisible(true);
					friendsMenuActive = true;	
				}else {
					friendsMenu.setVisible(false);
					friendsMenuActive = false;	
				}	
				
			}
		});
		btnFriends.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFriends.setBackground(new Color(23,35,51));
		btnFriends.setBounds(538, 0, 123, 60);
		btnFriends.setVisible(false);
		menuBar.add(btnFriends);
		btnFriends.setLayout(null);
		
		JLabel lblFriends = new JLabel("Friends");
		lblFriends.setHorizontalAlignment(SwingConstants.CENTER);
		lblFriends.setForeground(Color.WHITE);
		lblFriends.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblFriends.setBounds(0, 14, 123, 35);
		btnFriends.add(lblFriends);
		loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 255, 255));
		loginPanel.setVisible(true);	
		RegisterPanel = new JPanel();
		RegisterPanel.setBounds(0, 60, 784, 501);
		RegisterPanel.setVisible(false);
		welcomePanel = new JPanel();
		welcomePanel.setVisible(false);
		
		welcomePanel.setBackground(new Color(71,120,197));
		welcomePanel.setBounds(0, 60, 784, 501);
		panel.add(welcomePanel);
		welcomePanel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/PinPoint.png")));
		label.setBounds(334, 182, 25, 25);
		welcomePanel.add(label);
		
		JLabel pinPoint2 = new JLabel("");
		pinPoint2.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/PinPoint.png")));
		pinPoint2.setBounds(228, 85, 25, 25);
		welcomePanel.add(pinPoint2);
		
		JLabel pinPoint1 = new JLabel("");
		pinPoint1.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/PinPoint.png")));
		pinPoint1.setBounds(146, 201, 25, 25);
		welcomePanel.add(pinPoint1);
		
		JLabel lblNewLabel_6 = new JLabel("Share with your friends location you have visited");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(10, 3, 399, 55);
		welcomePanel.add(lblNewLabel_6);
		
		JLabel welcomeMap = new JLabel("");
		welcomeMap.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		welcomeMap.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/welcomeMap.PNG")));
		welcomeMap.setBounds(10, 56, 399, 245);
		welcomePanel.add(welcomeMap);
		
		JLabel lblNewLabel_7 = new JLabel("Sign up to see photos shared by your friends");
		lblNewLabel_7.setBounds(424, 3, 338, 55);
		welcomePanel.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblNewLabel_7.setForeground(new Color(23,35,51));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel quickRegisterPanel = new JPanel();
		quickRegisterPanel.setBackground(new Color(23,35,51));
		quickRegisterPanel.setBounds(419, 56, 349, 247);
		welcomePanel.add(quickRegisterPanel);
		quickRegisterPanel.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(1, 1, 347, 245);
		quickRegisterPanel.add(panel_4);
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setLayout(null);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				quickRegister();
			}
		});
		btnSignUp.setBounds(20, 209, 290, 25);
		panel_4.add(btnSignUp);
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setFocusPainted(false);
		btnSignUp.setDefaultCapable(false);
		btnSignUp.setBorderPainted(false);
		btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSignUp.setBackground(Color.BLACK);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		label_1.setBounds(20, 11, 121, 14);
		panel_4.add(label_1);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		label_2.setBounds(20, 75, 121, 14);
		panel_4.add(label_2);
		
		registerLogin = new JTextField();
		registerLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		registerLogin.setColumns(10);
		registerLogin.setBackground(Color.WHITE);
		registerLogin.setBounds(20, 30, 290, 25);
		panel_4.add(registerLogin);
		
		registerPassword = new JPasswordField();
		registerPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		registerPassword.setBounds(20, 95, 290, 25);
		panel_4.add(registerPassword);
		
		JLabel age = new JLabel("Date of Birth");
		age.setForeground(Color.BLACK);
		age.setFont(new Font("Segoe UI", Font.BOLD, 16));
		age.setBounds(20, 142, 121, 21);
		panel_4.add(age);
		
		registerErrorPassword = new JLabel("");
		registerErrorPassword.setForeground(Color.RED);
		registerErrorPassword.setBounds(20, 129, 268, 14);
		panel_4.add(registerErrorPassword);
		
		registerErrorUsername = new JLabel("");
		registerErrorUsername.setForeground(Color.RED);
		registerErrorUsername.setBounds(20, 61, 268, 14);
		panel_4.add(registerErrorUsername);
		
		comboBoxDay = new JComboBox();
		setComboBox(31, comboBoxDay);
		comboBoxDay.setBounds(20, 165, 40, 20);
		panel_4.add(comboBoxDay);
		
		comboBoxMonth = new JComboBox();
		setComboBox(12, comboBoxMonth);
		comboBoxMonth.setBounds(70, 165, 40, 20);
		panel_4.add(comboBoxMonth);
		
		comboBoxYear = new JComboBox();
		setComboBoxYear(comboBoxYear);
		comboBoxYear.setBounds(120, 165, 54, 20);
		panel_4.add(comboBoxYear);
		
		registerErrorAge = new JLabel("");
		registerErrorAge.setForeground(Color.RED);
		registerErrorAge.setBounds(20, 190, 268, 14);
		panel_4.add(registerErrorAge);
		
		JLabel googlePlay = new JLabel("");
		googlePlay.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/googlePlay.png")));
		googlePlay.setBounds(146, 378, 130, 40);
		welcomePanel.add(googlePlay);
		
		JLabel AppStore = new JLabel("");
		AppStore.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/appleStore.png")));
		AppStore.setBounds(520, 378, 130, 40);
		welcomePanel.add(AppStore);
		panel.add(RegisterPanel);
		RegisterPanel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBackground(new Color(23, 35, 51));
		panel_1.setBounds(220, 95, 350, 330);
		RegisterPanel.add(panel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBounds(1, 1, 348, 328);
		panel_1.add(panel_5);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister.setForeground(Color.BLACK);
		lblRegister.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblRegister.setBounds(10, 11, 328, 43);
		panel_5.add(lblRegister);
		
		JLabel label_6 = new JLabel("Username");
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		label_6.setBounds(40, 57, 121, 14);
		panel_5.add(label_6);
		
		JLabel label_7 = new JLabel("Password");
		label_7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		label_7.setBounds(40, 120, 121, 14);
		panel_5.add(label_7);
		
		registerLogin2 = new JTextField();
		registerLogin2.setColumns(10);
		registerLogin2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		registerLogin2.setBackground(Color.WHITE);
		registerLogin2.setBounds(40, 76, 268, 25);
		panel_5.add(registerLogin2);
		
		registerPassword2 = new JPasswordField();
		registerPassword2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		registerPassword2.setBounds(40, 140, 268, 25);
		panel_5.add(registerPassword2);
		
		registerErrorUsername2 = new JLabel("");
		registerErrorUsername2.setForeground(Color.RED);
		registerErrorUsername2.setBounds(39, 105, 269, 14);
		panel_5.add(registerErrorUsername2);
		
		registerErrorPassword2 = new JLabel("");
		registerErrorPassword2.setForeground(Color.RED);
		registerErrorPassword2.setBounds(40, 170, 268, 14);
		panel_5.add(registerErrorPassword2);
		
		JButton btnSignUp2 = new JButton("Sign Up");
		btnSignUp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register();
			}
		});
		btnSignUp2.setForeground(Color.WHITE);
		btnSignUp2.setFocusPainted(false);
		btnSignUp2.setDefaultCapable(false);
		btnSignUp2.setBorderPainted(false);
		btnSignUp2.setBackground(Color.BLACK);
		btnSignUp2.setBounds(40, 270, 268, 25);
		panel_5.add(btnSignUp2);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblAge.setBounds(40, 180, 121, 21);
		panel_5.add(lblAge);
		
		comboBoxDay2 = new JComboBox();
		comboBoxDay2.setBounds(40, 212, 40, 20);
		setComboBox(31, comboBoxDay2);
		panel_5.add(comboBoxDay2);
		
		comboBoxMonth2 = new JComboBox();
		comboBoxMonth2.setBounds(90, 212, 40, 20);
		setComboBox(12, comboBoxMonth2);
		panel_5.add(comboBoxMonth2);
		
		comboBoxYear2 = new JComboBox();
		comboBoxYear2.setBounds(140, 212, 54, 20);
		setComboBoxYear(comboBoxYear2);
		panel_5.add(comboBoxYear2);
		
		registerErrorAge2 = new JLabel("");
		registerErrorAge2.setForeground(Color.RED);
		registerErrorAge2.setBounds(40, 235, 268, 14);
		panel_5.add(registerErrorAge2);
		
		lblAccountAdded = new JLabel("");
		lblAccountAdded.setForeground(Color.GREEN);
		lblAccountAdded.setBounds(40, 306, 268, 14);
		panel_5.add(lblAccountAdded);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/LoginBackground.png")));
		lblNewLabel.setBounds(0, 0, 784, 501);
		RegisterPanel.add(lblNewLabel);
		loginPanel.setBounds(0, 60, 784, 501);
		panel.add(loginPanel);
		loginPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(23,35,51));
		panel_2.setForeground(new Color(255, 255, 255));
		panel_2.setBounds(220, 95, 350, 330);
		loginPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(1, 1, 348, 328);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 328, 43);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Need account?");
		lblNewLabel_2.setBounds(70, 56, 91, 14);
		panel_3.add(lblNewLabel_2);
		
		JLabel btnRegister = new JLabel("Create an Account");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				resetColour();
				welcomePanel.setVisible(false);
				loginPanel.setVisible(false);
				RegisterPanel.setVisible(true);
			}
		});
		btnRegister.setForeground(new Color(0, 0, 255));
		btnRegister.setBounds(161, 56, 121, 14);
		btnRegister.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_3.add(btnRegister);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(40, 81, 121, 14);
		panel_3.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Segoe UI", Font.BOLD, 16));
		lblPassword.setBounds(40, 162, 121, 14);
		panel_3.add(lblPassword);
		
		textLogin = new JTextField();
		textLogin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textLogin.setBackground(new Color(255, 255, 255));
		textLogin.setBounds(40, 100, 268, 25);
		panel_3.add(textLogin);
		textLogin.setColumns(10);
		
		textPassword = new JPasswordField();
		textPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPassword.setBounds(40, 181, 268, 25);
		panel_3.add(textPassword);
		
		loginErrorMessage = new JLabel("");
		loginErrorMessage.setForeground(new Color(255, 0, 0));
		loginErrorMessage.setBounds(39, 136, 269, 14);
		panel_3.add(loginErrorMessage);
		
		passwordErrorMessage = new JLabel("");
		passwordErrorMessage.setForeground(new Color(255, 0, 0));
		passwordErrorMessage.setBounds(40, 216, 268, 14);
		panel_3.add(passwordErrorMessage);
		
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loginErrorMessage.setText("");
				passwordErrorMessage.setText("");
				login();
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setDefaultCapable(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(40, 244, 268, 25);
		panel_3.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Find your username or password");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(40, 291, 268, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("(Coming Soon)");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(40, 303, 268, 14);
		panel_3.add(lblNewLabel_5);
		
		JLabel backgroundPicture = new JLabel("");
		backgroundPicture.setIcon(new ImageIcon(LoginMenu.class.getResource("/lpsharing/LoginBackground.png")));
		backgroundPicture.setBounds(0, 0, 784, 501);
		loginPanel.add(backgroundPicture);
	}
	
	private void logoff(){
		friendListPanel.setVisible(false);
		addFriendPanel.setVisible(false);
		mainBackgroundPanel.setVisible(false);
		
		friendsMenu.setVisible(false);
		btnFriends.setVisible(false);
		friendsMenuActive = false;	
		loginMenu.setVisible(false);
		loginMenuActive = false;
		
		pictures = new BufferedImage[100];
		comments = new String[100];
		commentList1.setText("");
		commentList2.setText("");
		picture1.setIcon(null);
		picture2.setIcon(null);
		
		userLogin = false;
		lblLogin.setText("Login");
		loginPanel.setVisible(true);
	}
	
	private void findUserInFriendList() {
		String friendName = "";
		friendName = txtSearchFriendList.getText();
		int correctMatches = 0;
		getInvites();
		setAllFriendListPanelsToFalse();
		if(getFriendName == null || getFriendName.equals("")) {
		}else {
			friendNames = getFriendName.split("\n");
			
			
			for(int i = 0; i < friendNames.length; i++) {
				if(correctMatches == 0) {
					if(friendNames[i].contains(friendName)) {
						friendName1.setText(userNames[i]);
						friendPanel1.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 1) {
					if(friendNames[i].contains(friendName)) {
						friendName2.setText(userNames[i]);
						friendPanel2.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 2) {
					if(friendNames[i].contains(friendName)) {
						friendName3.setText(userNames[i]);
						friendPanel3.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 3) {
					if(friendNames[i].contains(friendName)) {
						friendName4.setText(userNames[i]);
						friendPanel4.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 4) {
					if(friendNames[i].contains(friendName)) {
						friendName5.setText(userNames[i]);
						friendPanel5.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 5) {
					if(friendNames[i].contains(friendName)) {
						friendName6.setText(userNames[i]);
						friendPanel6.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 6) {
					if(friendNames[i].contains(friendName)) {
						friendName7.setText(userNames[i]);
						friendPanel7.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 7) {
					if(friendNames[i].contains(friendName)) {
						friendName8.setText(userNames[i]);
						friendPanel8.setVisible(true);
						correctMatches++;
					}
				}
				if(correctMatches == 8) {
					if(friendNames[i].contains(friendName)) {
						friendName9.setText(userNames[i]);
						friendPanel9.setVisible(true);
						correctMatches++;
					}
				}			
			}	
		}	
	}
	
	private void setAllFriendListPanelsToFalse() {
		friendPanel1.setVisible(false);
		friendPanel2.setVisible(false);
		friendPanel3.setVisible(false);
		friendPanel4.setVisible(false);
		friendPanel5.setVisible(false);
		friendPanel6.setVisible(false);
		friendPanel7.setVisible(false);
		friendPanel8.setVisible(false);
		friendPanel9.setVisible(false);
	}
	
	private void updateFriendsName() {
		getInvites();
		setAllFriendListPanelsToFalse();
		if(getFriendName == null || getFriendName.equals("")) {
		}else {
			friendNames = getFriendName.split("\n");
			if(friendNames.length > 0) {
			friendCounter = 0;	
				for(int i = 0; i < friendNames.length; i++) {
					if(friendCounter == 0) {
							friendName1.setText(friendNames[i]);
							friendPanel1.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 1) {
							friendName2.setText(friendNames[i]);
							friendPanel2.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 2) {
							friendName3.setText(friendNames[i]);
							friendPanel3.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 3) {
							friendName4.setText(friendNames[i]);
							friendPanel4.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 4) {
							friendName5.setText(friendNames[i]);
							friendPanel5.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 5) {
							friendName6.setText(friendNames[i]);
							friendPanel6.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 6) {
							friendName7.setText(friendNames[i]);
							friendPanel7.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 7) {
							friendName8.setText(friendNames[i]);
							friendPanel8.setVisible(true);
							friendCounter++;
							continue;
					}
					if(friendCounter == 8) {
							friendName9.setText(friendNames[i]);
							friendPanel9.setVisible(true);
							friendCounter++;
							continue;
					}			
				}	
			}
		}	
	}
	
	private void updateDeletedFriend(String friendName, String friendUsername){
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingFriends set friends = ? where username='" + friendUsername + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, friendName);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void deleteFriend(JLabel userName){
		String friendName = "";
		String tempFriendName = "";
		String[] friendNames;
		friendName = userName.getText();	
		findNewFriendDetails(friendName);
		friendNames = getFriendName.split("\n");
		for(int i=0; i<friendNames.length; i++) {
			if(friendNames[i].equals(login)) {
				for(int j = i; j < (friendNames.length - 1); j++) {
					friendNames[j] = friendNames[(j+1)];
					if(j == (friendNames.length - 1)) {
						friendNames[(j+1)] = "";
					}
				}
			}
		}
		tempFriendName = friendName;
		for(int i = 0; i < (friendNames.length - 1); i++) {
			friendName += friendNames[i] + "\n";
		}	
		updateDeletedFriend(friendName, tempFriendName);
		getInvites();
		String friendName2 = "";
		String[] friendNames2;
		friendName2 = userName.getText();	
		friendNames2 = getFriendName.split("\n");
		for(int i=0; i<friendNames2.length; i++) {
			if(friendNames2[i].equals(friendName2)) {
				for(int j = i; j < (friendNames2.length - 1); j++) {
					friendNames2[j] = friendNames2[(j+1)];
					if(j == (friendNames2.length - 1)) {
						friendNames2[(j+1)] = "";
					}
				}
			}
		}
		for(int i = 0; i < (friendNames2.length - 1); i++) {
			getFriendName += friendNames2[i] + "\n";
		}
		updateLoginUserFriends();
		if(showFriendScreenActive == true) {
			updateFriendsName();
		}
	}
	
	private void deleteAcceptedInvite(JLabel userName){
		String inviteName = "";
		for(int i = 0; i < invateNames.length; i++) {
			if(invateNames[i].equals(userName.getText())) {
				invateNames[i] = "";
			}
		}
		for(int i = 0; i < invateNames.length; i++) {
			inviteName += invateNames[i] + "\n";
		}	
		updateInvities(inviteName);
	}
	
	private void updateDeletedInvite(String newInvite, String newFriendName) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingFriends set invites = ? where username='" + newFriendName + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, newInvite);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void updateFriendsFromInvite(String newFriend, String newFriendName) {	
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingFriends set friends = ? where username='" + newFriendName + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, newFriend);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void findNewFriendDetails(String newFriendName) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingFriends where username='" + newFriendName + "'";
			ResultSet rs=stmt.executeQuery(sql);	
			if(rs.next()) {
				getInviteName = rs.getString("invites");
				getFriendName = rs.getString("friends");
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void updateLoginUserFriends() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingFriends set friends = ? where username='" + login + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, getFriendName);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

	private void acceptInvite(JLabel userName,JLabel addFriend) {
		String newFriend = "";
		String newFriendName = "";
		String newInvitie = "";
		String[] newInvities;
		newFriendName = userName.getText();	
		newFriend = login;
		findNewFriendDetails(newFriendName);
		newFriend += "\n" + getFriendName;
		newInvities = getInviteName.split("\n");
		for(int i=0; i<newInvities.length; i++) {
			if(newInvities[i].equals(login)) {
				for(int j = i; j < (newInvities.length - 1); j++) {
					newInvities[j] = newInvities[(j+1)];
					if(j == (newInvities.length - 1)) {
						newInvities[(j+1)] = "";
					}
				}
			}
		}
		for(int i = 0; i < (newInvities.length - 1); i++) {
			newInvitie += newInvities[i] + "\n";
		}		
		updateFriendsFromInvite(newFriend, newFriendName);
		updateDeletedInvite(newInvitie, newFriendName);
		
		getInvites();
		getFriendName += newFriendName + "\n";
		updateLoginUserFriends();
		updateInviteUserName();	
		
			
	}
	
	private int getAllInvites() {	
		int i = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingFriends";
			ResultSet rs=stmt.executeQuery(sql);	
			while(rs.next()) {
				allInvities[i] = rs.getString("invites");
				alluserNames[i] = rs.getString("username");
				allFriends[i] = rs.getString("friends");
				i++;
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	
	private void updateInviteUserName() {
		alluserNames = new String [100];
		allInvities = new String [100];
		allFriends = new String [100];
		inviteCounter = 0;
		setAllFriendPanelsToFalse();
		int ammountOfUsernamesAndInvites = getAllInvites();
		
		for(int i = 0; i < ammountOfUsernamesAndInvites; i++) {
			invateNames = allInvities[i].split("\n");
			friendNames = allFriends[i].split("\n");
			if(!(alluserNames[i].equals(login))) {
				for(int j = 0; j < friendNames.length; j++) {
					if(!(friendNames[j].equals(login))) {
						for(int k = 0; k < invateNames.length; k++) {
							if(invateNames[k].equals(login)) {		
								if(inviteCounter == 0) {
										userName1.setText(alluserNames[i]);
										friend1.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 1) {
										userName2.setText(alluserNames[i]);
										friend2.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 2) {
										userName3.setText(alluserNames[i]);
										friend3.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 3) {
										userName4.setText(alluserNames[i]);
										friend4.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 4) {
										userName5.setText(alluserNames[i]);
										friend5.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 5) {
										userName6.setText(alluserNames[i]);
										friend6.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 6) {
										userName7.setText(alluserNames[i]);
										friend7.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 7) {
										userName8.setText(alluserNames[i]);
										friend8.setVisible(true);
										inviteCounter++;
										continue;
								}
								if(inviteCounter == 8) {
										userName9.setText(alluserNames[i]);
										friend9.setVisible(true);
										inviteCounter++;
										continue;
								}			
							}
						}	
					}
				}
			}		
		}
			
	}
	
	
	private void updatePicAndCommentsFriend(String friendName) {
			int counter = 0;
			try {
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
				Statement stmt=con.createStatement();
				String sql = "Select * from LPSharingPictures Where login='" + friendName + "'";
				ResultSet rs=stmt.executeQuery(sql);
				while(rs.next()) {
					pictures[counter] = ImageIO.read(rs.getBinaryStream("picture"));
					comments[counter] = rs.getString("comments");
					counter++;
				}				
				ammountOfPosts = counter;
				con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			setPictureAndComment();		
	}
	
	private void viewFriendProfile(JLabel userName) {
		String friendName = userName.getText();
		if(friendName == "" ||friendName == null) {
		}else {
			friendNameStoryboard.setText(friendName);
			addPhotoPanel.setVisible(false);
			addFriendPanel.setVisible(false);
			friendListPanel.setVisible(false);
			pictures = new BufferedImage[100];
			comments = new String[100];
			picture1.setIcon(null);
			commentList1.setText("");
			picture2.setIcon(null);
			commentList2.setText("");
			updatePicAndCommentsFriend(friendName);
			friendStoryboardPanel.setVisible(true);
			mainBackgroundPanel.setVisible(true);
		}
		
		
		
	}
	
	private void updateInvities(String inviteName) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingFriends set invites = ? where username='" + login + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, inviteName);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void getInvites() {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingFriends Where username='" + login + "'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				getInviteName = rs.getString("invites");
				getFriendName = rs.getString("friends");
			}else {
				try {
					Class.forName("com.mysql.jdbc.Driver"); 
							String query = " insert into LPSharingFriends (username, friends, invites)" + " values (?, ?, ?)";		
							PreparedStatement preparedStmt = con.prepareStatement(query);
						    preparedStmt.setString (1, login);
						    preparedStmt.setString (2, "");
						    preparedStmt.setString (3, "");			    
						    preparedStmt.execute();
					con.close();
					}catch(Exception ex) {
						ex.printStackTrace();
					}	
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	
	private void addFriend(JLabel userName,JLabel addFriend) {
		String inviteName = userName.getText();
		inviteName += "\n";
		getInvites();
		inviteName += getInviteName;
		updateInvities(inviteName);		
		searchForFriend();
	}
	
	private int getAllUserLogins() {
		int i = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingAccunts";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				userNames[i] = rs.getString("username");
				i++;
			}
			con.close();
			return i;
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return i;
	}
	
	private void setAllFriendPanelsToFalse() {
		friend1.setVisible(false);
		friend2.setVisible(false);
		friend3.setVisible(false);
		friend4.setVisible(false);
		friend5.setVisible(false);
		friend6.setVisible(false);
		friend7.setVisible(false);
		friend8.setVisible(false);
		friend9.setVisible(false);
	}
		
	private int checkForUserInviteOrFriend() {
		getInvites();
		friendNames = new String[100];
		invateNames = new String[100];
		
		friendNames = getFriendName.split("\n");
		invateNames = getInviteName.split("\n");
		int ammountOfLogins = getAllUserLogins();
		for(int i = 0; i < ammountOfLogins; i++) {
			for(int k = 0; k < friendNames.length; k++) {
				if(userNames[i].equals(friendNames[k])) {
					userNames[i] = "";
				}
			}
			for(int k = 0; k < invateNames.length; k++) {
				if(userNames[i].equals(invateNames[k])) {
					userNames[i] = "";
				}
			}	
				if(userNames[i].equals(login)) {
					userNames[i] = "";
				}				
		}
		return ammountOfLogins;		
	}
	
	private void searchForFriend() {
		String friendName = "";
		friendName = txtSearchFriend.getText();
		int correctMatches = 0;
		int ammountOfMatchingNames = 0;
		int ammountOfLogins = checkForUserInviteOrFriend();
		setAllFriendPanelsToFalse();
		if(friendName.equals("") || friendName.equals(null)) {
		}else {
		for(int i = 0; i < ammountOfLogins; i++) {
			if(userNames[i].contains(friendName)) {
				ammountOfMatchingNames++;
			}
			
		}
		for(int i = 0; i < ammountOfLogins; i++) {
			if(correctMatches == 0 && ammountOfLogins > 0 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName1.setText(userNames[i]);
					friend1.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 1 && ammountOfLogins > 1 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName2.setText(userNames[i]);
					friend2.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 2 && ammountOfLogins > 2 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName3.setText(userNames[i]);
					friend3.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 3 && ammountOfLogins > 3 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName4.setText(userNames[i]);
					friend4.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 4 && ammountOfLogins > 4 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName5.setText(userNames[i]);
					friend5.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 5 && ammountOfLogins > 5 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName6.setText(userNames[i]);
					friend6.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 6 && ammountOfLogins > 6 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName7.setText(userNames[i]);
					friend7.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 7 && ammountOfLogins > 7 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName8.setText(userNames[i]);
					friend8.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}
			if(correctMatches == 8 && ammountOfLogins > 8 && ammountOfMatchingNames > 0) {
				if(userNames[i].contains(friendName)) {
					userName9.setText(userNames[i]);
					friend9.setVisible(true);
					correctMatches++;
					ammountOfMatchingNames--;
					continue;
				}
			}			
		}
		}	
		

	}
	
	
	private void setPictureAndComment() {
		if(pictures[commentCounters[0]] != null) {
			Image image1 = pictures[commentCounters[0]].getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
			picture1.setIcon(new ImageIcon(image1));
			commentList1.setText(comments[commentCounters[0]]);
		}
		if(pictures[commentCounters[1]] != null) {
			Image image2 = pictures[commentCounters[1]].getScaledInstance(225, 225, java.awt.Image.SCALE_SMOOTH);
			picture2.setIcon(new ImageIcon(image2));
			commentList2.setText(comments[commentCounters[1]]);	
		}
	}
	
	private void sendComment(JTextField commentInput, int counter) {
		if(pictures[counter] != null) {
			String addComment = login;
			String getComment = comments[counter];
			addComment += ": " + commentInput.getText();
			boolean validInput = false;
			if(addComment == null || addComment == "") {
				validInput = false;
			}else {
				validInput = true;
			}
			if(validInput == true) {
				getComment = comments[counter];
				if(getComment == null) {
					getComment = "";
				}
				addComment += "\n";
				getComment += addComment;
				
				commentInput.setText("");
				addCommentToDatabase(getComment, counter);
				refreshPicturesAndComments();
				
			}	
		}
	}
	
	private void addCommentToDatabase(String addComment, int counter) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			String query = "update LPSharingPictures set comments = ? where login='" + login + "' and ID='" + (counter + 1) + "'";
			PreparedStatement preparedStmt = con.prepareStatement(query);
		    
		    preparedStmt.setString(1, addComment);
		    preparedStmt.execute();
		    con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	
	private void resetPicture() {
		txtLocation.setText("");
		file = null;
	}
	
	@SuppressWarnings("deprecation")
	private void uploadPicutre() {
		FileDialog fd= new FileDialog(frame);
		fd.show();
		path=fd.getDirectory()+fd.getFile();
		try {		
			file=new File(path);
			fis=new FileInputStream(file);	
		}catch(FileNotFoundException ex) {
			Logger.getLogger(LoginMenu.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	private void refreshPicturesAndComments() {
		int counter = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingPictures Where login='" + login + "'";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				pictures[counter] = ImageIO.read(rs.getBinaryStream("picture"));
				comments[counter] = rs.getString("comments");
				counter++;
			}
			
			ammountOfPosts = counter;
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		setPictureAndComment();		
	}
	
	private void addPictureToDatabase() {
		String location = "";
		location = txtLocation.getText();
		if(location == null) {
			location = "";
		}
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
					String query = " insert into LPSharingPictures (picture, location, login, ID)" + " values (?, ?, ?, ?)";		
					PreparedStatement preparedStmt = con.prepareStatement(query);
					preparedStmt.setBinaryStream(1, fis, (int)file.length());
					preparedStmt.setString(2, location);
				    preparedStmt.setString(3, login);
				    preparedStmt.setInt(4, (ammountOfPosts + 1));
				    preparedStmt.execute();
			con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}	
		refreshPicturesAndComments();
	}
	
	
 	
	private void login() {
		
		String tempLogin = textLogin.getText();
		@SuppressWarnings("deprecation")
		String tempPassword = textPassword.getText();
		boolean loginSuccesfull = false;
		
		loginSuccesfull = loginUser(tempLogin, tempPassword);
		if(loginSuccesfull == true) {
			pictures = new BufferedImage[100];
			comments = new String[100];
			textLogin.setText("");
			textPassword.setText("");
			login = tempLogin;
			userLogin = true;
			lblLogin.setText(login);
			loginPanel.setVisible(false);
			mainBackgroundPanel.setVisible(true);
			btnFriends.setVisible(true);
			resetColour();
			refreshPicturesAndComments();
		}else {
		loginErrorMessage.setText("Check username again");
		passwordErrorMessage.setText("Check password again");
		}
		
		
		
		
	}
	
	private boolean loginUser(String tempLogin, String tempPassword) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingAccunts Where username='" + tempLogin + "' and password='" + tempPassword + "'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				con.close();
				return true;
			}
			else {
				con.close();
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return false;
	}
	
	private void register() {
		String tempLogin = registerLogin2.getText();
		@SuppressWarnings("deprecation")
		String tempPassword = registerPassword2.getText();
		int tempDay = 0;
		int tempMonth = 0;
		int tempYear = 0;
		
		boolean invalidNumberOfDays = true;
		boolean incorrectUsername = true;
		boolean incorrectPassword = true;
		boolean originalLogin = false;
		
		resetErrorMessage(registerErrorUsername2, registerErrorPassword2, registerErrorAge2);
		
		try {
		tempDay = Integer.parseInt((String) comboBoxDay2.getSelectedItem());
		tempMonth = Integer.parseInt((String) comboBoxMonth2.getSelectedItem());
		tempYear  = Integer.parseInt((String) comboBoxYear2.getSelectedItem());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		incorrectUsername = checkRegisterUsername(incorrectUsername, tempLogin, registerErrorUsername2);
		incorrectPassword = checkRegisterPassword(tempPassword, registerErrorPassword2);
		invalidNumberOfDays = checkDaysInMonth(tempDay, tempMonth, registerErrorAge2);
			
		if(invalidNumberOfDays == false && incorrectPassword == false && incorrectUsername == false) {
			originalLogin = checkForOriginalLogin(tempLogin, registerErrorUsername2);
			if(originalLogin == true) {
				int age = 2020 - tempYear;
				addUserAccount(tempPassword, age, tempLogin);
				lblAccountAdded.setText("Account has been created");
			}			
		}
	}
	
	private void quickRegister() {
		String tempLogin = registerLogin.getText();
		@SuppressWarnings("deprecation")
		String tempPassword = registerPassword.getText();
		int tempDay = 0;
		int tempMonth = 0;
		int tempYear = 0;
		
		boolean invalidNumberOfDays = true;
		boolean incorrectUsername = true;
		boolean incorrectPassword = true;
		boolean originalLogin = false;
		
		resetErrorMessage(registerErrorUsername, registerErrorPassword, registerErrorAge);
		
		try {
		tempDay = Integer.parseInt((String) comboBoxDay.getSelectedItem());
		tempMonth = Integer.parseInt((String) comboBoxMonth.getSelectedItem());
		tempYear  = Integer.parseInt((String) comboBoxYear.getSelectedItem());
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		incorrectUsername = checkRegisterUsername(incorrectUsername, tempLogin, registerErrorUsername);
		incorrectPassword = checkRegisterPassword(tempPassword, registerErrorPassword);
		invalidNumberOfDays = checkDaysInMonth(tempDay, tempMonth, registerErrorAge);
			
		if(invalidNumberOfDays == false && incorrectPassword == false && incorrectUsername == false) {
			originalLogin = checkForOriginalLogin(tempLogin, registerErrorUsername);
			if(originalLogin == true) {
				int age = 2020 - tempYear;
				addUserAccount(tempPassword, age, tempLogin);
				JOptionPane.showMessageDialog(frame, "Account has been created", "Account added", JOptionPane.INFORMATION_MESSAGE);
			}			
		}
	}
	
	private void addUserAccount(String password, int age, String login) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
					String query = " insert into LPSharingAccunts (username, password, age)" + " values (?, ?, ?)";		
					PreparedStatement preparedStmt = con.prepareStatement(query);
				    preparedStmt.setString (1, login);
				    preparedStmt.setString (2, password);
				    preparedStmt.setInt (3, age);			    
				    preparedStmt.execute();
			con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}	
	}
	
	private boolean checkForOriginalLogin(String tempLogin, JLabel registerErrorUsername) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(urlDB, loginDB, passwordDB);
			Statement stmt=con.createStatement();
			String sql = "Select * from LPSharingAccunts Where username='" + tempLogin + "'";
			ResultSet rs=stmt.executeQuery(sql);
			if(rs.next()) {
				con.close();
				registerErrorUsername.setText("This username is taken");
				return false;
			}
			else {
				con.close();
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	private boolean checkRegisterPassword(String tempPassword, JLabel registerErrorPassword) {
		boolean originalPassword = false;
		if(tempPassword.isEmpty()) {
			registerErrorPassword.setText("Password is required");
			return true;
		}
		originalPassword = checkPasswordLenght(tempPassword, registerErrorPassword);
		if(originalPassword == false) {
			return false;
		}
		return true;
	}
	private boolean checkPasswordLenght(String tempPassword, JLabel registerErrorPassword) {
		try {
			if(tempPassword.length() < 3){
				registerErrorPassword.setText("Password need to have at least 3 characters!");
				return true;
			}
			} catch(Exception ex) {
				registerErrorPassword.setText("Password need to have at least 3 characters!");;
				ex.printStackTrace();
				return true;
			}
		return false;
	}
	
	
	private boolean checkRegisterUsername(boolean incorrectUsername, String tempLogin, JLabel registerErrorUsername) {
		boolean originalLoginName = false;
		if(tempLogin.isEmpty()) {
			registerErrorUsername.setText("Username is required");
			return true;
		}
		originalLoginName = checkLoginLenght(tempLogin, registerErrorUsername);
		if(originalLoginName == false) {
			return false;
		}
		return true;
	}
	
	private boolean checkLoginLenght(String tempLogin, JLabel registerErrorUsername) {
		try {
			if(tempLogin.length() < 3){
				registerErrorUsername.setText("Username need to have at least 3 characters!");
				return true;
			}
			} catch(Exception ex) {
				registerErrorUsername.setText("Username need to have at least 3 characters!");;
				ex.printStackTrace();
				return true;
			}
		return false;
	}
	
	
	private void resetErrorMessage(JLabel registerErrorUsername, JLabel registerErrorPassword, JLabel registerErrorAge) {
		
		registerErrorUsername.setText("");
		registerErrorPassword.setText("");
		registerErrorAge.setText("");
	}
	
	
	private boolean checkDaysInMonth(int tempDay,int tempMonth, JLabel registerErrorAge) {
		if(tempDay == 31) {
			if(tempMonth == 2 || tempMonth == 4 || tempMonth == 6 || tempMonth == 9 || tempMonth == 11) {
				registerErrorAge.setText("This month dont have 31 days");
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void setComboBox(int max, JComboBox comboBox) {
		String [] dates = new String [max];
		for(int i = 0; i < max; i++) {
			dates[i] = Integer.toString((i + 1));
		}
		comboBox.setModel(new DefaultComboBoxModel(dates));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void setComboBoxYear(JComboBox comboBoxYear) {
		String[] years = new String [108];
		for(int i = 0; i < 108; i++) {
			years[i] = Integer.toString((i + 1900));
		}
		comboBoxYear.setModel(new DefaultComboBoxModel(years));
	}
	
	
	
	private void activeButton(JPanel pane, JPanel btnLine) {
		resetColour();
		setColour(btnLogin);
		btnLine.setOpaque(true);	
	}
	
	
	private void setColour(JPanel pane) {
		pane.setBackground(new Color(41,57,80));
	}
	
	private void resetColour() {
		btnLogin.setBorder(null);
		btnLogin.setBackground(new Color(23,35,51));
		btnLine_1.setOpaque(false);
	}
}
