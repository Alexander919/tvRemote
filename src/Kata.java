public class Kata {
    public static int tvRemote(final String word) {
        //declare col = 0; lastCol = 0; row = 0; lastRow = 0; count = 0
        //loop
        //find the index of the letter
        //calculate row and column of the letter (row: index / 8; col: index % 8)
        //add Math.abs(row - lastRow) to count
        //add Math.abs(col - lastCol) to count
        //update lastCol with col and lastRow with row value
        //end loop
        String kb = "abcde123fghij456klmno789pqrst.@0uvwxyz_/";
        int col, lastCol = 0, row, lastRow = 0, count = 0;
        for (String letter : word.split("")) {
            int inx = kb.indexOf(letter);
            col = inx % 8;
            row = inx / 8;
            count += Math.abs(row - lastRow) + Math.abs(col - lastCol);
            lastCol = col;
            lastRow = row;
        }
        return count + word.length();
    }
}
