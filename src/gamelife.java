import java.util.Random;

public class gamelife {
	public static boolean result;
	public static void main(String[] args){
		int n=10;
		int flag=100;
		gamelife.startgame(n,flag);
	}
	public static void startgame(int n,int flag){
		int a[][]=new int[n+2][n+2];
		int b[][]=new int[n+2][n+2];
		int i,j=0;
		for(i=0;i<=n+1;i++){
			for(j=0;j<=n+1;j++){
				a[i][j]=0;
			}			
		}
		Random random=new Random();
		for(i=1;i<=n;i++){
			for(j=1;j<=n;j++){
				a[i][j]=(int)random.nextInt(2);
			}			
		}
		int temp=0,num=0;
		while(num<flag){
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					System.out.print(a[i][j]+"  ");
				}
				System.out.println();
			}
			System.out.println("----------------------------------------");
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					temp=a[i-1][j-1]+a[i-1][j]+a[i-1][j+1]+a[i][j-1]+a[i][j+1]+a[i+1][j-1]+a[i+1][j]+a[i+1][j+1];
					if((temp==2&&a[i][j]==1)||temp==3)	b[i][j]=1;
					else	b[i][j]=0;
				}			
			}	
			for(i=1;i<=n;i++){
				for(j=1;j<=n;j++){
					a[i][j]=b[i][j];
				}
			}
			try{Thread.sleep(1000);}
			catch(Exception e){}
			num++;
		}
		result=true; 
	}
}
