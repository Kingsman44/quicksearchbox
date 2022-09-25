package com.google.android.apps.search.assistant.surfaces.roti.home;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import java.util.Iterator;

/* compiled from: PG */
public final class DrawSoundLevelsView extends View {

    /* renamed from: a */
    public static final C59071e f349086a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.roti.home.DrawSoundLevelsView");

    /* renamed from: b */
    public final C58425eo f349087b;

    /* renamed from: c */
    private final int f349088c;

    /* renamed from: d */
    private final Paint f349089d;

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void onDraw(Canvas canvas) {
        int i = 0;
        canvas.drawColor(0);
        if (isEnabled()) {
            int min = Math.min(getHeight(), getWidth()) - this.f349088c;
            int size = this.f349087b.size();
            if (size != 0) {
                if (size == 1) {
                    i = ((Integer) this.f349087b.peek()).intValue();
                } else {
                    Iterator it = this.f349087b.iterator();
                    double d = C59203do.f157270a;
                    while (it.hasNext()) {
                        double intValue = (double) ((Integer) it.next()).intValue();
                        Double.isNaN(intValue);
                        Double.isNaN(intValue);
                        double d2 = (double) i;
                        Double.isNaN(d2);
                        double d3 = (intValue + intValue) * d2;
                        double d4 = (double) ((size - 1) * size);
                        Double.isNaN(d4);
                        d += d3 / d4;
                        i++;
                    }
                    i = (int) d;
                }
            }
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) ((((min * i) / 100) + this.f349088c) / 2), this.f349089d);
        }
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f349087b = new C58425eo(20);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C126834cn.f349298a, i, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        this.f349088c = (int) obtainStyledAttributes.getDimension(0, 2.13116595E9f);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f349089d = paint;
        paint.setColor(color);
    }
}
