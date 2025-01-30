//Finding Single Source Shortest path of a Graph((Dijstra's Algorithm using JAVA)) 14
import java.util.*;
public class Main{
    //Method to Find the shortest path using Dijkstra's algorithm
    public static void dijkstra(int[][]graph, int source){
        int vertices = graph.length; //Number of vertices
        int[] dist = new int[vertices]; //Holds the shortest distance from source to each vertex
        boolean[] visited = new boolean[vertices]; //To check if the vertex is already processed

        //Initialize all distance to infinity and visited to false
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source] = 0; //Distance from source to itself id 0

        //Loop to find the shortest path for all vertices
        for (int i = 0; i<vertices -1; i++){
            //pick the minimum distance vertex from the set of vertex not processed
            int u = minDistance(dist, visited);
            visited[u] = true; //Mark the picked vertex as processed

            //update dist[] of the adjacent vertices of the picked vertex
            for (int v = 0; v<vertices; v++){
                //Update dist[v] only if it is not visited, there is an edge from u to v,
                // and total weight of path from source to v throung u is smaller than current value of dist[v]
                if(!visited[v] && graph[u][v] !=0 && dist[u]!=Integer.MAX_VALUE && dist[u] + graph[u][v]<dist[v]){
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        //Print the result 
        printSolution(dist,source);
    }
    //Method to find the vertex with the minmum distance
    public static int minDistance(int[] dist, boolean[]visited){
        int min = Integer.MAX_VALUE,minIndex = -1;
        for(int v = 0; v< dist.length; v++){
            if(!visited[v] && dist[v]<= min){
                min = dist[v];
                minIndex = v;
            }
        }
        return minIndex;
    }
    //Method to print the shortest distance from the source
    public static void printSolution(int[] dist, int source){
        System.out.print("Vertex\tDistance from Source("+source +")");
        for(int i =0; i<dist.length; i++){
            System.out.println(i+"\t\t"+dist[i]);
        }
    }
    public static void main(String[]args){
        //Hardcoded graph as a 20 matrix (adjacency matrix)
        //0 means no edge, other values represent the weight of the edge

        int[][] graph ={
            {0,10,0,30,100},
            {10,0,50,0,0},
            {0,50,0,20,10},
            {30,0,20,0,60},
            {100,0,10,60,0}
        };
        //Headcoded source vertex
        int source = 0; // Start from vertex 0
        
        //Find Shortest path using Dijkstra's algorithm 
        dijkstra(graph,source);
    }
}