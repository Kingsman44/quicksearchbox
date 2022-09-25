package com.android.datetimepicker.date;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class TextViewWithCircularIndicator extends TextView {

    /* renamed from: a */
    Paint f16147a = new Paint();

    /* renamed from: b */
    public boolean f16148b;

    /* renamed from: c */
    private final int f16149c;

    /* renamed from: d */
    private final String f16150d;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.date_picker_blue);
        this.f16149c = color;
        resources.getDimensionPixelOffset(R.dimen.month_select_circle_radius);
        this.f16150d = context.getResources().getString(R.string.item_is_selected);
        this.f16147a.setFakeBoldText(true);
        this.f16147a.setAntiAlias(true);
        this.f16147a.setColor(color);
        this.f16147a.setTextAlign(Paint.Align.CENTER);
        this.f16147a.setStyle(Paint.Style.FILL);
        this.f16147a.setAlpha(60);
    }

    public final CharSequence getContentDescription() {
        CharSequence text = getText();
        if (!this.f16148b) {
            return text;
        }
        return String.format(this.f16150d, new Object[]{text});
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16148b) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (Math.min(width, height) / 2), this.f16147a);
        }
    }
}
