import java.util.*;
import java.io.*;



class waterDrop2
{
	
	public static void main(String args[])
	{
		int design[][] ={{0,0,0,0,0,0,0},{1,0,0,0,0,0,0},{0,0,1,1,1,0,0},{0,0,0,0,0,0,0},{1,1,1,0,0,1,0},{0,0,0,0,0,0,1},{0,0,0,0,0,0,0}};
		int inputPoint=5;
		double y[]=new double[7];
		double x[]=new double[7];
		double z[]=new double[7];
		int n=0,k=0;	
		x[inputPoint-1]=100;
		
		
		while(n<7)
		{
			int m=0;
			while(m<7)
			{
				
				if(design[n][m]==0)
				{
					y[m]+=x[m];
				}else
				{
					int t=m;
					while(t>=0)
					{
						if(design[n][t]==0)
						{
							y[t]=y[t]+(x[m]/2.0);
							break;
						}
						t--;
					}
					
					int d=m;
					while(d<7)
					{
						if(design[n][d]==0)
						{
							y[d]=y[d]+(x[m]/2.0);
							break;
						}
						d++;
					}
					
					
					
				}
				m++;
			}
			
				x=y.clone();
				y=z.clone();
			
			n++;
			
		}
		
		
		while(k<7)
		{
			System.out.println("Cup" +(k+1)+":"+x[k]);
			
			k++;
		}
		
		
		
	}
}


