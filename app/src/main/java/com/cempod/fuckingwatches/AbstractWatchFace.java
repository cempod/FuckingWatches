package com.cempod.fuckingwatches;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.renderscript.Element;
import android.service.wallpaper.WallpaperService;

import com.cempod.fuckingwatches.widget.AnalogClockWidget;
import com.cempod.fuckingwatches.widget.ClockWidget;
import com.cempod.fuckingwatches.widget.DigitalClockWidget;
import com.cempod.fuckingwatches.widget.Widget;

import java.util.Arrays;
import java.util.LinkedList;



/**
 * Abstract base class for watch faces
 */
public abstract class AbstractWatchFace extends com.huami.watch.watchface.AbstractWatchFace {


    private class DigitalEngine extends com.huami.watch.watchface.AbstractWatchFace.DigitalEngine {

        private final DigitalClockWidget widget;

        public DigitalEngine(DigitalClockWidget widget) {
            this.widget = widget;
        }

        @Override
        protected void onPrepareResources(Resources resources) {
            this.widget.init(AbstractWatchFace.this);

        }

        @Override
        protected void onDrawDigital(Canvas canvas, float width, float height, float centerX, float centerY, int seconds, int minutes, int hours, int year, int month, int day, int week, int ampm) {
            widget.onDrawDigital(canvas, width, height, centerX, centerY, seconds, minutes, hours, year, month, day, week, ampm);

        }
    }

    private class AnalogEngine extends com.huami.watch.watchface.AbstractWatchFace.AnalogEngine {

        private final AnalogClockWidget widget;

        public AnalogEngine(AnalogClockWidget widget) {
            this.widget = widget;
        }

        @Override
        protected void onPrepareResources(Resources resources) {
            this.widget.init(AbstractWatchFace.this);

        }

        @Override
        protected void onDrawAnalog(Canvas canvas, float width, float height, float centerX, float centerY, float secRot, float minRot, float hrRot) {
            widget.onDrawAnalog(canvas, width, height, centerX, centerY, secRot, minRot, hrRot);

        }
    }

    final ClockWidget clock;


    protected AbstractWatchFace(final ClockWidget clock) {
        this.clock = clock;

    }

    @Override
    public Engine onCreateEngine() {
        return AnalogClockWidget.class.isInstance(clock) ? new AnalogEngine((AnalogClockWidget) clock) : new  DigitalEngine((DigitalClockWidget) clock);

    }
}
