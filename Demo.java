class Demo {


    public static void main (String[] args) {
       try{

	Class.forName("com.mysql.jdbc.Driver");

	String url="jdbc:mysql://localhost:3306/youtube";
	String username ="root";
	String password ="root";

	Connection con= DriverManager.getConnection(url,username,password);

	String q= "create table table1(tID int(20) primary key,tName varchar(200), tCity varchar(200))";

	Statement stmt=con.createStatement();
	stmt.executeupdate(q);
	
	System.out.println("table created");
	con.close();
    }catch(Exception e)
	{

	e.printStackTrace();
	}
}
}