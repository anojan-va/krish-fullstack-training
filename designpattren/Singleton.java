class DbManager
{
	 private static volatile DbManager dbManager;
	 
	 private DbManager()
	 {
		if(dbManager !=null)
		{
			throw new RuntimeException("Exception");
		}
	 }
	 
	 public static DbManager getDbManager()
	 {
		 if(dbManager==null)
		 {
			 synchronized (DbManager.class)
			 {
					if(dbManager==null)
				 {
					dbManager=new DbManager(); 
					
				 } 
			 }
			  
			 
		 }
		 
		return dbManager; 
	 }
}

class Singleton
{
	public static void main(String args[])
	{
		DbManager dbManager= DbManager.getDbManager();
		System.out.println(dbManager);
		
		DbManager dbManager1= DbManager.getDbManager();
		System.out.println(dbManager1);
	}
}
