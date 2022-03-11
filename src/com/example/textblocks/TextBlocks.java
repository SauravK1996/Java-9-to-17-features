package com.example.textblocks;

public class TextBlocks {

	public static void main(String[] args) {
		
		
		 String multilineString = """
		 		afk oi o  oseori oae oo oso o o dofo
		 		aisfhier
		 		weohoiwer
		 		 i weif hwe
		 		 wef owe
		 		 
		 		""";
		 
//		 System.out.println(multilineString);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 String oldstyle = "[\r\n"
			 		+ "  {\r\n"
			 		+ "    \"empid\":101,\r\n"
			 		+ "    \"empname\":\"Sagar\",\r\n"
			 		+ "    \"address\":{\r\n"
			 		+ "      \"Country\":\"India\",\r\n"
			 		+ "      \"State\":\"Uttar Pradesh\",\r\n"
			 		+ "      \"City\":\"Lucknow\"\r\n"
			 		+ "    }\r\n"
			 		+ "  },\r\n"
			 		+ "  {\r\n"
			 		+ "    \"empid\":102,\r\n"
			 		+ "    \"empname\":\"Sanjay\",\r\n"
			 		+ "    \"address\":{\r\n"
			 		+ "      \"Country\":\"India\",\r\n"
			 		+ "      \"State\":\"Madhya Pradesh\",\r\n"
			 		+ "      \"City\":\"Indore\"\r\n"
			 		+ "    }\r\n"
			 		+ "  }\r\n"
			 		+ "]";
		 
//		System.out.println(oldstyle);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		String newstyle = """
				[
				  {
							"empid":101,
				    "empname":"Sagar",
				    "address":{
				      "Country":"India",
				      "State":"Uttar Pradesh",
				      "City":"Lucknow"
				    }
				  },
				  {
				    "empid":102,
				    "empname":"Sanjay",
				    "address":{
				      "Country":"India",
				      "State":"Madhya Pradesh",
				      "City":"Indore"
				    }
				  }
				]
				""";
		System.out.println(newstyle);
	}

}
