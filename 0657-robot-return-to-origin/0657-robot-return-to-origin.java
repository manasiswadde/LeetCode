class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char move:moves.toCharArray())
        {
            if(move=='U'){
                x--;
            }
            else if(move=='D'){
                x++;
            }
            else if(move=='R'){
                y++;
            }
            else
            {
                y--;
            }
        }
        return x==0 && y==0;
    }
}