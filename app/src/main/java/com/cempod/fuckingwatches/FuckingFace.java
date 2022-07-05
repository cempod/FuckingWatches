package com.cempod.fuckingwatches;

import com.cempod.fuckingwatches.widget.ClockWidget;
import com.cempod.fuckingwatches.widget.FuckingClock;
import com.huami.watch.watchface.AbstractSlptClock;

public class FuckingFace extends AbstractWatchFace{
    public FuckingFace() {
        super(new FuckingClock());
    }

    @Override
    protected Class<? extends AbstractSlptClock> slptClockClass() {
        return FuckingFaceSlpt.class;
    }
}
