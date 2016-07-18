import java.util.ArrayList;

public class VoteProcessor {
	ArrayList<String> stuff = new ArrayList<String>();
	public static void main(String[] args) {
		VoteProcessor VP = new VoteProcessor();
	}
	VoteProcessor() {
		calculateElectionWinner(stuff);
	}
	public String calculateElectionWinner(ArrayList<String> votes) {
		String winner = "";
		int countFrancis = 0;
		int countSnowden = 0;
		for (String string : votes) {
			string = string.toLowerCase();
			if(string.equals("pope francis")) {
				countFrancis++;
			} else if(string.equals("edward snowden")) {
				countSnowden++;
			}
		}
		if(countFrancis>countSnowden) {
			winner = "pope francis";
		} else if (countSnowden > countFrancis) {
			winner = "edward snowden";
		} else winner = "TIE";
		return winner;
	}
}
