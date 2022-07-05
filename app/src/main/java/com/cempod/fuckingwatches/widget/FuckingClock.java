package com.cempod.fuckingwatches.widget;

import android.app.Service;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.cempod.fuckingwatches.FuckingFaceSlpt;
import com.ingenic.iwds.slpt.view.core.SlptViewComponent;

import java.util.List;

public class FuckingClock extends DigitalClockWidget {

    Paint mPaint = new Paint();
    float widthF, heightF;
    Paint.FontMetrics fm;

    @Override
    public void init(Service service) {
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(2);
        mPaint.setTextSize(40);
        fm = mPaint.getFontMetrics();
        super.init(service);
    }

    public String getHour(int hour){
        switch (hour){
            case 1: return "второго";
            case 2: return "третьего";
            case 3: return "четвёртого";
            case 4: return "пятого";
            case 5: return "шестого";
            case 6: return "седьмого";
            case 7: return "восьмого";
            case 8: return "девятого";
            case 9: return "десятого";
            case 10: return "одиннадцатого";
            case 11: return "двенадцатого";
            case 12: return "первого";
            case 13: return "второго";
            case 14: return "третьего";
            case 15: return "четвёртого";
            case 16: return "пятого";
            case 17: return "шестого";
            case 18: return "седьмого";
            case 19: return "восьмого";
            case 20: return "девятого";
            case 21: return "десятого";
            case 22: return "одиннадцатого";
            case 23: return "двенадцатого";
            case 24: return "первого";
            case 0:  return "первого";
            default: return "хз";
        }
    }

    public String getTopMin(int minutes){
        if(minutes<=20){
            switch (minutes){
                case 1: return "одна";
                case 2: return "две";
                case 3: return "три";
                case 4: return "четыре";
                case 5: return "пять";
                case 6: return "шесть";
                case 7: return "семь";
                case 8: return "восемь";
                case 9: return "девять";
                case 10: return "десять";
                case 11: return "одиннадццать";
                case 12: return "двенадцать";
                case 13: return "тринадцать";
                case 14: return "четырнадцать";
                case 15: return "пятнадцать";
                case 16: return "шестнадцать";
                case 17: return "семнадцать";
                case 18: return "восемнадцать";
                case 19: return "девятнадцать";
                case 20: return "двадцать";
        }
        }else{
            if(minutes < 30) return "двадцать";
            if(minutes<40 ) return "тридцать";
            if(minutes <50) return "сорок";
            else return "пятьдесят";
        }
        return "";
    }

    public String getBotMin(int minutes){
        switch (minutes%10){
            case 1: return "одна";
            case 2: return "две";
            case 3: return "три";
            case 4: return "четыре";
            case 5: return "пять";
            case 6: return "шесть";
            case 7: return "семь";
            case 8: return "восемь";
            case 9: return "девять";
        }
        return "";
    }

    @Override
    public void onDrawDigital(Canvas canvas, float width, float height, float centerX, float centerY, int seconds, int minutes, int hours, int year, int month, int day, int week, int ampm) {
canvas.drawColor(Color.BLACK);
        heightF = fm.descent - fm.ascent;
        if(minutes>20){
            String minuteTop = getTopMin(minutes);
            widthF = mPaint.measureText(minuteTop);
            canvas.drawText(minuteTop, centerX-widthF/2, height/8+heightF/2, mPaint);
            String minuteBot = getBotMin(minutes);
            widthF = mPaint.measureText(minuteBot);
            canvas.drawText(minuteBot, centerX-widthF/2, (height/8+heightF/2)*2, mPaint);
            String text = getText(minutes);
            widthF = mPaint.measureText(text);
            canvas.drawText(text, centerX-widthF/2, (height/8+heightF/2)*3, mPaint);
            String hour = getHour(hours);
            widthF = mPaint.measureText(hour);

            canvas.drawText(hour, centerX-widthF/2, (height/8+heightF/2)*4, mPaint);
        }else{
            String minuteTop = getTopMin(minutes);
            widthF = mPaint.measureText(minuteTop);
            canvas.drawText(minuteTop, centerX-widthF/2, height/6+heightF/2, mPaint);
            String text = getText(minutes);
            widthF = mPaint.measureText(text);
            canvas.drawText(text, centerX-widthF/2, (height/6+heightF/2)*2, mPaint);
            String hour = getHour(hours);
            widthF = mPaint.measureText(hour);
            canvas.drawText(hour, centerX-widthF/2, (height/6+heightF/2)*3, mPaint);
        }

    }

    private String getText(int minutes) {
        if(minutes<=20){
            switch (minutes){
                case 1: return "минута";
                case 2:
                case 3:
                case 4:
                    return "минуты";

                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    return "минут";

            }
        }else{
            switch (minutes%10){
                case 1: return "минута";
                case 2:
                case 3:
                case 4:
                    return "минуты";

                case 5:
                case 6:
                case 7:
                case 8:
                case 9:

                    return "минут";
            }
        }
        return "";
    }


    @Override
    public List<SlptViewComponent> buildSlptViewComponent(Service service) {

        return null;
    }
}
