import java.util.*;

public class BFSGraph {
    public static List<Integer> bfs(int n, int m, List<List<Integer>> edges, int s) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n ; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for (List<Integer> edge: edges) {
            int u = edge.get(0);
            int v = edge.get(1);

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        Integer[] distArray = new Integer[n+1];
        for (int i = 0; i <= n ; i++) {
            distArray[i] = -1;
        }
        distArray[s] = 0;
        queue.offer(s);

        while (queue.size() != 0){
            int node = queue.poll(); //taking out the first item
            for (Integer v: adjList.get(node)) {
                if(distArray[v] == -1){
                    distArray[v] = distArray[node]+6;
                    queue.offer(v);
                }
            }

        }
        List<Integer> resArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if( i != s){
                resArray.add(distArray[i]);
            }
        }
        return resArray;


    }
}
