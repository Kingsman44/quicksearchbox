package com.google.android.apps.search.transcription.p10679ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4535g.C59203do;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.transcription.ui.DrawSoundLevelsView */
/* compiled from: PG */
public final class DrawSoundLevelsView extends View {

    /* renamed from: a */
    private static final C59071e f385133a = C59071e.m91332i("com.google.android.apps.search.transcription.ui.DrawSoundLevelsView");

    /* renamed from: b */
    private final int f385134b;

    /* renamed from: c */
    private final Paint f385135c;

    /* renamed from: d */
    private final C58425eo f385136d;

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo116900a(int i) {
        ((C59052c) ((C59052c) f385133a.mo56224b()).mo56372aa(41954)).mo56387q("#setSpeechLevel %d", i);
        this.f385136d.add(Integer.valueOf(i));
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        int i = 0;
        canvas.drawColor(0);
        if (isEnabled()) {
            int min = Math.min(getHeight(), getWidth()) - this.f385134b;
            int size = this.f385136d.size();
            if (size != 0) {
                if (size == 1) {
                    i = ((Integer) this.f385136d.peek()).intValue();
                } else {
                    Iterator it = this.f385136d.iterator();
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
            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), (float) ((((min * i) / 100) + this.f385134b) / 2), this.f385135c);
        }
    }

    public DrawSoundLevelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f385136d = new C58425eo(20);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C141939f.f385165a, i, 0);
        int color = obtainStyledAttributes.getColor(3, 0);
        this.f385134b = (int) obtainStyledAttributes.getDimension(2, 2.13117286E9f);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f385135c = paint;
        paint.setColor(color);
    }
}
