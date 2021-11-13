/*
 * The intution is simple that only keeping a visited array won't help we will keep a recursion
 * stack so that we maintain the track if there is the back edge from the child edge to one of its
 * ancestors.
 */


import java.util.*;
public class DetectCycleinDAG
{
  static boolean detectCycle(ArrayList<ArrayList<Integer>>adj ,int V)
  {
	  boolean[]visited = new boolean[V];
	  for(int i=0; i<V; i++)
		  visited[i] = false;
	  
	  
	  
	  boolean[]recSt = new boolean[V]; //we create a recursion Stack to maintain the visited edges
	  
	  for(int i=0; i<V; i++)
		  recSt[i] = false;
	  
	  for(int i=0; i<V; i++)
	  {
		  if(visited[i] == false)
		  {
		     if(Dfsrec(adj,i,visited , recSt) == true)
		    	 return true;
		  }
	  }
	  return false;
  }
  
  
  static boolean Dfsrec(ArrayList<ArrayList<Integer>>adj , int s ,boolean[]visited,boolean[]recSt)
  {
	  visited[s] = true;
	  recSt[s] = true;
	  
	  for(int u:adj.get(s))
	  {
		  if(visited[s] == false && Dfsrec(adj , u,visited ,recSt))
			  return false;
		  else if(recSt[u] == true)
			  return true;
	  }
	  recSt[s] = false;
	  return false;

	  
  }
  
  
  
  
