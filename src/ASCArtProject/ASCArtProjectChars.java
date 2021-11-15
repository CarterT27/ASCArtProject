//Made by Carter Tran

/*
 This program writes a word horizontally from left to right in block letters. 
 */

package ASCArtProject;

public class ASCArtProjectChars {

	public static final String word = "THIS IS ART"; //Word to print in all capital letters
	public static final int wordLength = word.length();
	
	
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int letterCount = 0; letterCount < wordLength; letterCount++) {
				char currentLetter; //initializes string currentLetter
				currentLetter = word.charAt(letterCount); //sets char to current index in the word
				//System.out.print(currentLetter + "-");
				letterCall(currentLetter, row); //prints portion of the current letter that corresponds to the current row
				System.out.print("   "); //space between the letters
			}
			System.out.println();
		}
	}
	
	//all the letters and their portions grouped in rows
	public static void letterCall(char letter, int row) {
		if (letter == 'A') {
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
		} else if (letter == 'B') {
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
		} else if (letter == 'C') {
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
		} else if (letter == 'D') {
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
		} else if (letter == 'E') {
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
		} else if (letter == 'F') {
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
		} else if (letter == 'G') {
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
		} else if (letter == 'H') {
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
		} else if (letter == 'I') {
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
		} else if (letter == 'J') {
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
		} else if (letter == 'K') {
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
		} else if (letter == 'L') {
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
		} else if (letter == 'M') {
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
		} else if (letter == 'N') {
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
		} else if (letter == 'O') {
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
		} else if (letter == 'P') {
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
		} else if (letter == 'Q') {
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
		} else if (letter == 'R') {
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
		} else if (letter == 'S') {
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
		} else if (letter == 'T') {
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
		} else if (letter == 'U') {
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
		} else if (letter == 'V') {
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
		} else if (letter == 'W') {
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
		} else if (letter == 'X') {
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
		} else if (letter =='Y') {
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
		} else if (letter == 'Z') {
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
		} else if (letter == ' ') {
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