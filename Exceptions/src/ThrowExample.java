class ThrowExample{
	public static void main(String[] args){

		try{
			throw new ArithmeticException("Exception throw");

		}
		catch (ArithmeticException e){
			System.out.print(e.toString());
			System.out.print("\n"+e.getMessage());

		}
		finally{
			System.out.print("\nfinally");
		}
	}
}