package com.understandpanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class UnderstandPanel {

	public static void main(String[] args) {
		//��������
		JFrame frm = new JFrame();
		//���ô������
		frm.setTitle("ʹ��JPnel");
		//���ô���رշ�ʽ
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//������岢���ڴ����ϰ벿��
		JPanel topPanel = new JPanel();
		frm.getContentPane().add(topPanel, BorderLayout.NORTH);	//NORTH�������������Ϸ�
		
		//������������򣬿ɱ༭��������룬25��
		JTextField input = new JTextField();	//TextField�ı�����
		input.setEditable(true);
		//Horizontal��ˮƽ�ߡ�ƽ��ġ�Alignment�����С��ų�ֱ��
		input.setHorizontalAlignment(SwingConstants.LEFT); 
		input.setColumns(25); //���С��ݶӡ���
		
		//����������ť
		JButton myBtn = new JButton("����");
		
		//������������Ͱ�ť
		topPanel.add(input);
		topPanel.add(myBtn);
		
		//������岢���ڴ����°ಿ��
		JPanel bottomPanel = new JPanel();
		frm.getContentPane().add(bottomPanel, BorderLayout.CENTER);
		
		//������������6��32�У����ɱ༭
		JTextArea output = new JTextArea();
		output.setRows(6);
		output.setColumns(32);
		output.setEditable(false);
		
		//��ӽ�������
		bottomPanel.add(output);
		bottomPanel.setVisible(true);
		
		//���ýṹ��JFrame����λ�����С����ʾ
		frm.setBounds(400, 200, 400, 200);
		frm.setVisible(true);
	}

}
