package com.cempod.fuckingwatches.widget;

import android.app.Service;
import android.graphics.Canvas;
import android.graphics.Color;

import com.cempod.fuckingwatches.FuckingFaceSlpt;
import com.ingenic.iwds.slpt.view.core.SlptViewComponent;

import java.util.List;

public class FuckingClock extends DigitalClockWidget {
    @Override
    public void onDrawDigital(Canvas canvas, float width, float height, float centerX, float centerY, int seconds, int minutes, int hours, int year, int month, int day, int week, int ampm) {
canvas.drawColor(Color.RED);
    }

    @Override
    public List<SlptViewComponent> buildSlptViewComponent(Service service) {

        return null;
    }
}
