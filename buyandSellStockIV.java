
public class buyandSellStockIV {

	static int findProfit(int[]prices , int n)
	{
		int obsp = -prices[0];
		int ocsp = 0;
		int ossp = 0;
		
		for(int i=1; i<n; i++)
		{
			int nbsp,nssp,ncsp;
			if(obsp + prices[i] > obsp)
			{
				nbsp = obsp + prices[i];
			}
			else {
				nbsp = obsp;
			}
			
			
          if(obsp + prices[i] > ossp)
          {
        	  nssp = obsp + prices[i];
        	  
          }else {
        	  nssp = ossp;
          }
			
		  if(ossp > ocsp) {
			  ncsp = ossp;
		  }else
		  {
			  ncsp = ocsp;
		  }
			  
			
		}
		return ossp;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
