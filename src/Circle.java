
public class Circle implements Shape {

	private Point center;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is: (" + center.getX() +","+ center.getY() +")");
		
	}
	public Point getCenter() {
		return center;
	}
	//@Autowired
	//@Qualifier
	public void setCenter(Point center) {
		this.center = center;
	}
	
	
	
	
}
