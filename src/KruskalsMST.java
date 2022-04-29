import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KruskalsMST {
    public static int kruskals(int gNodes, List<Integer> gFrom, List<Integer> gTo, List<Integer> gWeight) {

        class UnionFind{
            int[] parent;
            int vrtxSize;
            UnionFind(int vertex){
                vrtxSize = vertex;
                parent = new int[vrtxSize+1];
                for (int i = 0; i < parent.length ; i++) {
                    parent[i] = i;
                }
            }
            public int FindRoot(int vrtx){
                if(parent[vrtx] == vrtx){
                    return vrtx;
                }
                return FindRoot(parent[vrtx]);
            }
            public void Union(int frm, int to){
                if (FindRoot(frm) == FindRoot(to)){
                    return;
                }
                parent[FindRoot(frm)] = parent[FindRoot(to)];
            }
        }



        class Edge implements Comparable<Edge>{
            int u, v, w;
            Edge(int u, int v, int w){
                this.u = u;
                this.v = v;
                this.w = w;
            }

            @Override
            public int compareTo(Edge o) {
                if (w == o.w){
                    return 0;
                }
                else if (w > o.w){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
        ArrayList<Edge> listOfEdges = new ArrayList<>();
        for (int i = 0; i < gFrom.size(); i++) {
            listOfEdges.add(new Edge(gFrom.get(i), gTo.get(i), gWeight.get(i)));
        }
        Collections.sort(listOfEdges);
        int mstCost = 0;
        UnionFind unionFind = new UnionFind(gNodes);
        for (int i = 0; i <listOfEdges.size() ; i++) {
            int from = listOfEdges.get(i).u, to = listOfEdges.get(i).v, weight = listOfEdges.get(i).w;
            if(unionFind.FindRoot(from) != unionFind.FindRoot(to)){
                unionFind.Union(from, to);
                mstCost += weight;
            }
        }
        return mstCost;

    }
}
