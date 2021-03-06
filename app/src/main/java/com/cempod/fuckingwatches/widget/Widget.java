package com.cempod.fuckingwatches.widget;

import android.app.Service;
import android.graphics.Canvas;



/**
 * Base class for widgets
 */
public interface Widget extends HasSlptViewComponent {

    int getX();

    int getY();

    void setX(int x);

    void setY(int y);

    void init(Service service);

    void draw(Canvas canvas, float width, float height, float centerX, float centerY);
}
