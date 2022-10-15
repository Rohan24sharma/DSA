class Solution {
    public int firstUniqChar(String s) {
        int[] fr = new int[256];
        for(int i=0;i<s.length();i++){
            fr[s.charAt(i)]++;
        }
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = fr[s.charAt(i)];            
        }
        for(int i=0;i<s.length();i++){
            if(arr[i]==1)return i;
        }
        return -1;
    }
}
