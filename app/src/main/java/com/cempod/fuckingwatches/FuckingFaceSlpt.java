package com.cempod.fuckingwatches;

import com.cempod.fuckingwatches.widget.ClockWidget;
import com.cempod.fuckingwatches.widget.FuckingClock;
import com.ingenic.iwds.slpt.view.core.SlptLayout;

public class FuckingFaceSlpt extends AbstractWatchFaceSlpt{
    public FuckingFaceSlpt() {
        super(new FuckingClock());
    }

    @Override
    protected SlptLayout createClockLayout26WC() {
        return null;
    }

    @Override
    protected SlptLayout createClockLayout8C() {
        return null;
    }

    @Override
    protected void initWatchFaceConfig() {

    }
}
