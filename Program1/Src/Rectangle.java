class Rectangle {
	private double length ;
	private double width;
	

	Rectangle(){
		length=-1;
		width=-1;

	}

	public Rectangle(double l,double w){
		length=l;
		width=w;

	}
   public void setDim(double l,double w){
   	length=l;
   	width=w;

   }
   public double getLength(){
   	return length;
   }
   public double getWidth(){
   	return width;
   }

   public double area(){
   	return length*width;

   }

   public double perimeter(){
   	return(2*(length*width));

   }
    

    public void print(){
    	System.out.print("\nLength=" +length +"Width=" +width + "Area" +area() + "Perimeter=" +perimeter());
    }


}