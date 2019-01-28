class Box extends Rectangle{

	private double height;

	public Box(){
		super();
		height = -1;
	}

	public Box(double l, double w, double h){
		super(l,w);
		height = h;
	}

	public void setDim(double l, double w, double h){
		super.setDim(l,w);
		height = h;
	}

	public double getHeight(){
		return height;
	}

	public double area(){
		return 2*getLength()*getWidth()+getLength()*getWidth()+height*getWidth();
	}

	public double volume(){
		return getLength()*getWidth()*height;
		//or return super.area()*height;
	}

	public void print(){
		System.out.println("Box: Area= " + area() + " Volume= " + volume());
	}


}