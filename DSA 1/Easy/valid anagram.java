class Solution
{
public boolean isAnagram(String s, String t)
{
char arr[] = (s.toLowerCase()).toCharArray();
char brr[] = (t.toLowerCase()).toCharArray();

    Arrays.sort(arr);
    Arrays.sort(brr);

    if(Arrays.equals(arr,brr))
    {
        return true;
    }
    else 
    {
        return false;
    }
}
}
