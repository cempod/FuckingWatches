package com.cempod.fuckingwatches;

import android.util.Log;

import com.cempod.fuckingwatches.widget.ClockWidget;
import com.huami.watch.watchface.AbstractSlptClock;
import com.ingenic.iwds.slpt.view.core.SlptAbsoluteLayout;
import com.ingenic.iwds.slpt.view.core.SlptLayout;
import com.ingenic.iwds.slpt.view.core.SlptViewComponent;

import java.util.Arrays;
import java.util.LinkedList;


/**
 * Splt version of
 */

public abstract class AbstractWatchFaceSlpt extends AbstractSlptClock {

    final ClockWidget clock;


    protected AbstractWatchFaceSlpt(final ClockWidget clock) {
        this.clock = clock;

    }


}
