package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

public static void main(String[] args) {
	Random ran = new Random();
	int lotterynumber = 0;
	lotterynumber = ran.nextInt(90000) + 10000;
	JOptionPane.showMessageDialog(null, lotterynumber);
}
}
