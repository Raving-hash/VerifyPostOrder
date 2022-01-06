class Solution {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }
    private boolean recur(int[] postorder, int l, int r){
        if (l >= r){
            return true;
        }
        int v = postorder[r];
        int i = l;
        while (postorder[i] < v) {
            i++;
        }
        int j = i;
        while (postorder[j] > v) {
           j++;
        }
        return j == r && recur(postorder,l,i-1) && recur(postorder,i,r-1);
    }
}