import javax.swing.JOptionPane;

public class Horoscopes {
public static void main(String[] args) {
	String hi =
	JOptionPane.showInputDialog("What is your star sign");
	if(hi.equals ("leo")) {
		JOptionPane.showMessageDialog(null, "leo signs tend to like relaxation, preferably someplace warm and comfortable."
				+ " Leo likes the big picture, not the small details and fine print. ");
		}
	if(hi.equals("scorpio")) {
		JOptionPane.showMessageDialog(null, "Scorpio signs are not fearful individuals,"
				+ " often trying things that others would not attempt. "
				+ "This is because they most often become self-aware at an earlier age than most other signs.");
	}
	if(hi.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "Cancer is a water sign which means that they have a deep,"
				+ " mysterious side to them that can also be gentle and nurturing.");
	}
}
}
