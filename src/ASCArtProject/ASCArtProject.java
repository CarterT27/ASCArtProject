//Made by Carter Tran

/*
 This program writes a word horizontally from left to right in block letters. It uses 
 */

package ASCArtProject;

public class ASCArtProject {

	public static final String word = "THIS IS ART"; //Word to print in all capital letters
	public static final int wordLength = word.length();
	
	
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int letterCount = 1; letterCount <= wordLength; letterCount++) {
				String currentLetter; //initializes string currentLetter
				currentLetter = word.substring(letterCount - 1, letterCount); //sets string to single letter in the word
				//System.out.print(currentLetter + "-");
				letterCall(currentLetter, row); //prints portion of the current letter that corresponds to the current row
				System.out.print("   "); //space between the letters
			}
			System.out.println();
		}
	}
	
	//all the letters and their portions grouped in rows
	public static void letterCall(String letter, int row) {
		if (letter.equals("A")) {
			if (row == 1) {
				System.out.print(" AA ");
			} else if (row == 2) {
				System.out.print("A  A");
			} else if (row == 3) {
				System.out.print("AAAA");
			} else if (row == 4) {
				System.out.print("A  A");
			} else if (row == 5) {
				System.out.print("A  A");
			}
		} else if (letter.equals("B")) {
			if (row == 1) {
				System.out.print("BBBB ");
			} else if (row == 2) {
				System.out.print("B   B");
			} else if (row == 3) {
				System.out.print("BBBB");
			} else if (row == 4) {
				System.out.print("B   B");
			} else if (row == 5) {
				System.out.print("BBBB");
			}
		} else if (letter.equals("C")) {
			if (row == 1) {
				System.out.print(" CCC");
			} else if (row == 2) {
				System.out.print("C   ");
			} else if (row == 3) {
				System.out.print("C   ");
			} else if (row == 4) {
				System.out.print("C   ");
			} else if (row == 5) {
				System.out.print(" CCC");
			}
		} else if (letter.equals("D")) {
			if (row == 1) {
				System.out.print("DDD ");
			} else if (row == 2) {
				System.out.print("D  D");
			} else if (row == 3) {
				System.out.print("D  D");
			} else if (row == 4) {
				System.out.print("D  D");
			} else if (row == 5) {
				System.out.print("DDD ");
			}
		} else if (letter.equals("E")) {
			if (row == 1) {
				System.out.print("EEEE");
			} else if (row == 2) {
				System.out.print("E   ");
			} else if (row == 3) {
				System.out.print("EEE ");
			} else if (row == 4) {
				System.out.print("E   ");
			} else if (row == 5) {
				System.out.print("EEEE");
			}
		} else if (letter.equals("F")) {
			if (row == 1) {
				System.out.print("FFFF");
			} else if (row == 2) {
				System.out.print("F   ");
			} else if (row == 3) {
				System.out.print("FFF ");
			} else if (row == 4) {
				System.out.print("F   ");
			} else if (row == 5) {
				System.out.print("F   ");
			}
		} else if (letter.equals("G")) {
			if (row == 1) {
				System.out.print(" GGG ");
			} else if (row == 2) {
				System.out.print("G    ");
			} else if (row == 3) {
				System.out.print("G   G");
			} else if (row == 4) {
				System.out.print("B   B");
			} else if (row == 5) {
				System.out.print(" GGG ");
			}
		} else if (letter.equals("H")) {
			if (row == 1) {
				System.out.print("H  H");
			} else if (row == 2) {
				System.out.print("H  H");
			} else if (row == 3) {
				System.out.print("HHHH");
			} else if (row == 4) {
				System.out.print("H  H");
			} else if (row == 5) {
				System.out.print("H  H");
			}
		} else if (letter.equals("I")) {
			if (row == 1) {
				System.out.print("III");
			} else if (row == 2) {
				System.out.print(" I ");
			} else if (row == 3) {
				System.out.print(" I ");
			} else if (row == 4) {
				System.out.print(" I ");
			} else if (row == 5) {
				System.out.print("III");
			}
		} else if (letter.equals("J")) {
			if (row == 1) {
				System.out.print("    J");
			} else if (row == 2) {
				System.out.print("    J");
			} else if (row == 3) {
				System.out.print("    J");
			} else if (row == 4) {
				System.out.print("J   J");
			} else if (row == 5) {
				System.out.print(" JJJ ");
			}
		} else if (letter.equals("K")) {
			if (row == 1) {
				System.out.print("K  K");
			} else if (row == 2) {
				System.out.print("K K ");
			} else if (row == 3) {
				System.out.print("KK  ");
			} else if (row == 4) {
				System.out.print("K K ");
			} else if (row == 5) {
				System.out.print("K  K");
			}
		} else if (letter.equals("L")) {
			if (row == 1) {
				System.out.print("L   ");
			} else if (row == 2) {
				System.out.print("L   ");
			} else if (row == 3) {
				System.out.print("L   ");
			} else if (row == 4) {
				System.out.print("L   ");
			} else if (row == 5) {
				System.out.print("LLLL");
			}
		} else if (letter.equals("M")) {
			if (row == 1) {
				System.out.print("M   M");
			} else if (row == 2) {
				System.out.print("MM MM");
			} else if (row == 3) {
				System.out.print("M M M");
			} else if (row == 4) {
				System.out.print("M   M");
			} else if (row == 5) {
				System.out.print("M   M");
			}
		} else if (letter.equals("N")) {
			if (row == 1) {
				System.out.print("N   N");
			} else if (row == 2) {
				System.out.print("NN  N");
			} else if (row == 3) {
				System.out.print("N N N");
			} else if (row == 4) {
				System.out.print("N  NN");
			} else if (row == 5) {
				System.out.print("N   N");
			}
		} else if (letter.equals("O")) {
			if (row == 1) {
				System.out.print(" OOO ");
			} else if (row == 2) {
				System.out.print("O   O");
			} else if (row == 3) {
				System.out.print("O   O");
			} else if (row == 4) {
				System.out.print("O   O");
			} else if (row == 5) {
				System.out.print(" OOO ");
			}
		} else if (letter.equals("P")) {
			if (row == 1) {
				System.out.print("PPPP ");
			} else if (row == 2) {
				System.out.print("P   P");
			} else if (row == 3) {
				System.out.print("PPPP ");
			} else if (row == 4) {
				System.out.print("P    ");
			} else if (row == 5) {
				System.out.print("P    ");
			}
		} else if (letter.equals("Q")) {
			if (row == 1) {
				System.out.print(" QQQ ");
			} else if (row == 2) {
				System.out.print("Q   Q");
			} else if (row == 3) {
				System.out.print("Q   Q");
			} else if (row == 4) {
				System.out.print("Q  QQ");
			} else if (row == 5) {
				System.out.print(" QQQQ");
			}
		} else if (letter.equals("R")) {
			if (row == 1) {
				System.out.print("RRRR ");
			} else if (row == 2) {
				System.out.print("R   R");
			} else if (row == 3) {
				System.out.print("RRRR ");
			} else if (row == 4) {
				System.out.print("R R  ");
			} else if (row == 5) {
				System.out.print("R   R");
			}
		} else if (letter.equals("S")) {
			if (row == 1) {
				System.out.print(" SSS ");
			} else if (row == 2) {
				System.out.print("S    ");
			} else if (row == 3) {
				System.out.print(" SSS ");
			} else if (row == 4) {
				System.out.print("    S");
			} else if (row == 5) {
				System.out.print("SSSS ");
			}
		} else if (letter.equals("T")) {
			if (row == 1) {
				System.out.print("TTTTTT");
			} else if (row == 2) {
				System.out.print("  TT  ");
			} else if (row == 3) {
				System.out.print("  TT  ");
			} else if (row == 4) {
				System.out.print("  TT  ");
			} else if (row == 5) {
				System.out.print("  TT  ");
			}
		} else if (letter.equals("U")) {
			if (row == 1) {
				System.out.print("U   U");
			} else if (row == 2) {
				System.out.print("U   U");
			} else if (row == 3) {
				System.out.print("U   U");
			} else if (row == 4) {
				System.out.print("U   U");
			} else if (row == 5) {
				System.out.print(" UUU ");
			}
		} else if (letter.equals("V")) {
			if (row == 1) {
				System.out.print("V     V");
			} else if (row == 2) {
				System.out.print("V     V");
			} else if (row == 3) {
				System.out.print(" V   V ");
			} else if (row == 4) {
				System.out.print("  V V  ");
			} else if (row == 5) {
				System.out.print("   V   ");
			}
		} else if (letter.equals("W")) {
			if (row == 1) {
				System.out.print("W     W");
			} else if (row == 2) {
				System.out.print("W     W");
			} else if (row == 3) {
				System.out.print("W  W  W");
			} else if (row == 4) {
				System.out.print(" W W W ");
			} else if (row == 5) {
				System.out.print("  W W  ");
			}
		} else if (letter.equals("X")) {
			if (row == 1) {
				System.out.print("X   X");
			} else if (row == 2) {
				System.out.print(" X X ");
			} else if (row == 3) {
				System.out.print("  X  ");
			} else if (row == 4) {
				System.out.print(" X X ");
			} else if (row == 5) {
				System.out.print("X   X");
			}
		} else if (letter.equals("Y")) {
			if (row == 1) {
				System.out.print("Y   Y");
			} else if (row == 2) {
				System.out.print(" Y Y ");
			} else if (row == 3) {
				System.out.print("  Y  ");
			} else if (row == 4) {
				System.out.print("  Y  ");
			} else if (row == 5) {
				System.out.print("  Y  ");
			}
		} else if (letter.equals("Z")) {
			if (row == 1) {
				System.out.print("ZZZZZ");
			} else if (row == 2) {
				System.out.print("   Z ");
			} else if (row == 3) {
				System.out.print("  Z  ");
			} else if (row == 4) {
				System.out.print(" Z   ");
			} else if (row == 5) {
				System.out.print("ZZZZZ");
			}
		} else if (letter.equals(" ")) {
			if (row == 1) {
				System.out.print("     ");
			} else if (row == 2) {
				System.out.print("     ");
			} else if (row == 3) {
				System.out.print("     ");
			} else if (row == 4) {
				System.out.print("     ");
			} else if (row == 5) {
				System.out.print("     ");
			}
		} else {
			System.out.print("ERROR");
		}
	}
}