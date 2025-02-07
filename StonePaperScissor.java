import java.util.Scanner; 
class  StonePaperScissor
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int rnum=0;
		for(;;)
		{
		 int num=(int)(Math.random()*10);
		 if(num>=1 && num<=3)
			{
			 rnum=num;
			 break;
		 }
		}
		 String codeOpt=null;
         if(rnum ==1){
			 codeOpt="STONE";
		 }
		 if(rnum ==2){
			 codeOpt="PAPER";
		 }
		 if(rnum ==3){
			 codeOpt="SCISSOR";
		 }

		 System.out.println(" ");
		 System.out.println(" Welcome ");
		 System.out.println("1.STONE 2.PAPER 3.SCISSOR ");
		 System.out.println(" Enter NUmber ");

		 int unum=sc.nextInt();

		 String userOpt=null;
		  if(unum ==1){
			 userOpt="STONE";
		 }
		 if(unum ==2){
			 userOpt="PAPER";
		 }
		 if(unum ==3){
			 userOpt="SCISSOR";
		 }
		 if(unum>=4)
		{
			 System.out.println("invalid number");
			
			 
		}
		 System.out.println("enter user number:   "+userOpt);
		 System.out.println("enter bot number :   "+codeOpt);

		 if((unum==1 && rnum==2)||(unum==2 && rnum==3)||(unum==3 && rnum==1))
		{
			 System.out.println("BOT WIN");
		 }
		 else if((unum==1 && rnum==3)||(unum==2 && rnum==1)||(unum==3 && rnum==2))
		{
			 System.out.println("USER WIN");
		 }
		 else if((unum==1 && rnum==1)||(unum==2 && rnum==2)||(unum==3 && rnum==3))
		{
			 System.out.println("DRAW");
		 }

        else
		{
			 System.out.println("INVALID OUTPUT");
		 }

	}
}
 