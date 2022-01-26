package project;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;


//public class FontTest {
//	public static void drawFancyString(Graphics2D g, String str, int x, int y, float size, Color internalColor) {
//		if (str.length() == 0)
//			return;
//		AffineTransform orig = g.getTransform();
////		Font f = 
//		TextLayout tl = new TextLayout(str, f, g.getFontRenderContext());
//		AffineTransform transform = g.getTransform();
//		FontMetrics fm = g.getFontMetrics(f);
//		Shape outline = tl.getOutline(null);
//		Rectangle bound = outline.getBounds();
//		transform.translate(x, y + fm.getAscent());
//
//		g.setTransform(transform);
//		g.setColor(internalColor);
//		g.fill(outline);
//		g.setStroke(new BasicStroke(size / 25));
//		g.setColor(Color.BLACK);
//		g.draw(outline);
//
//		g.setTransform(orig);
//	}
//}