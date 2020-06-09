import java.util.*;
public class Main2 {

    //灌溉，一块土地需要灌溉，现将这块土地分为N * M 个 1*1的小方块，然后农夫随机
    //向这些方块中放入数根水管，已知每过一个小时，水管中的水就会蔓延到该方块上下左右
    //四个方块之中，请问k小时后，有多少个方块仍然需要被灌溉？
    //输入：初始时刻的水管位置，小时k
    //输出: 未被灌溉的方块个数
    //[
    // [0,1,0,0,0],
    //[0,0,0,1,0],
    //[0,1,0,0,0],
    //[0,0,0,0,0]
    // ]


        public void dfs(int[][] map,int[][] vis,int i,int j,int cur_k,int k){
            int m=map.length;
            int n=map[0].length;
            if(cur_k==k||i<0||i>m||j<0||j>n||vis[i][j]==1)return;
            map[i][j]=1;
            vis[i][j]=1;
            dfs(map, vis,i+1,j,cur_k+1,k);
            dfs(map,vis,i-1,j,cur_k+1,k);
            dfs(map,vis,i,j+1,cur_k+1,k);
            dfs(map,vis,i,j-1,cur_k+1,k);
            vis[i][j]=0;
        }
        public int Solution(int[][] map,int k){
            int m=map.length;
            int n=map[0].length;
            int[][] vis=new int[m][n];
            List<Integer> s_i=new ArrayList<>();
            List<Integer> s_j=new ArrayList<>();
            for(int i=0;i<m;i++){
                for(int j = 0;j<n;j++){
                    if(map[i][j]==1){
                        s_i.add(i);
                        s_j.add(j);
                    }
                }
            }
            for(int i=0;i<s_i.size();i++){
                int i_s=s_i.get(i);
                int j_s=s_j.get(i);
                dfs(map,vis,i_s,j_s,0,k);
            }
            int ans=0;
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(map[i][j]==0){
                        ans++;
                    }
                }
            }
            return ans;
        }


}
