class Solution {
    public List<Integer> lexicalOrder(int n) {
        System.out.println(n);
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<10; i++){
            dfs(i, n, list);
        }
        
        return list;
    }
    
    public static void dfs(int i, int n, List<Integer> list){
        if(i>n){
            return;
        }
        
        list.add(i);
        for(int j=0; j<10; j++){
            dfs(i*10+j, n, list);
        }
    }
    
}