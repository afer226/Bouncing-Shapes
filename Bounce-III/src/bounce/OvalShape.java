/*	COMPSCI 230 (2020) - University of Auckland
	ASSIGNMENT THREE - Bounce II
	 Shan  441147157
 */
package bounce;

/**
 * Class to represent an oval shape.
 * 
 * @author  Shan
 *
 */
public class OvalShape extends Shape {

	/**	Constructor arguments.
	 * @param x position.
	 * @param y position.
	 * @param deltaX horizontal speed.
	 * @param deltaY vertical speed.
	 * @param width  in pixels.
	 * @param height in pixels.
	 * @param text to display on the shape.
	 */
	public OvalShape() {
		super();
	}
	public OvalShape(int x, int y) {
		super(x, y);
	}
	public OvalShape(int x, int y, int deltaX, int deltaY) {
		super(x, y, deltaX, deltaY);
	}
	public OvalShape(int x, int y, int deltaX, int deltaY,
	                               int width,  int height) {
		super(x, y, deltaX, deltaY, width, height);
	}
/************************* BOUNCE-II *************************/
	public OvalShape(int x, int y, int deltaX, int deltaY,
						int width, int height, String text) {
		super(x, y, deltaX, deltaY, width, height, text);
	}
/************************* BOUNCE-II *************************/
	
	/**
	 * Paints the shape using the supplied Painter.
	 */
	@Override
	protected void doPaint(Painter painter) {
		painter.drawOval(_x,_y,_width,_height);
	}
}
