
	
	public class MicBoard implements Board{

    public char[] field = {'-','-','-','-','-','-','-','-','-'};



    public char getValueAt(int index) {
        if(index > 0 || index < 9) {
            return field[index];
        } else {
            return '-';
        }

    }

    public void setValueAt(int index, char value) {
        if(value == 'x'  value == 'o'  value == '-'  index > 0  index < 9) {
            field[index] = value;
        }
    }
    public void clear() {
        for (int i = 0; i < 9; i++) {
            field[i] = '-';
        }
    }
}
