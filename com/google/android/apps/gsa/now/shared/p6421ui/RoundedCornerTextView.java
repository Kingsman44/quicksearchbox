package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.RoundedCornerTextView */
/* compiled from: PG */
public class RoundedCornerTextView extends TextView implements C83417f {

    /* renamed from: a */
    private final Path f227330a;

    /* renamed from: b */
    private final Paint f227331b;

    /* renamed from: c */
    private final Paint f227332c;

    /* renamed from: d */
    private final Paint f227333d;

    /* renamed from: e */
    private int f227334e;

    /* renamed from: f */
    private float f227335f;

    /* renamed from: g */
    private float[] f227336g;

    public RoundedCornerTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private final void m132775c(Context context, AttributeSet attributeSet, int i) {
        this.f227331b.setAntiAlias(true);
        this.f227331b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f227332c.setAntiAlias(true);
        this.f227332c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        setLayerType(2, (Paint) null);
        this.f227333d.setAntiAlias(true);
        this.f227333d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C83415d.f227387c, i, 0);
            this.f227335f = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f227334e = obtainStyledAttributes.getInteger(1, 0);
            obtainStyledAttributes.recycle();
            this.f227336g = C83418g.m132812a(this.f227335f, this.f227334e);
            return;
        }
        this.f227336g = null;
    }

    public final void draw(Canvas canvas) {
        if (this.f227336g == null) {
            super.draw(canvas);
            return;
        }
        super.draw(canvas);
        this.f227330a.rewind();
        this.f227330a.addRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), Path.Direction.CW);
        this.f227330a.addRoundRect(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), this.f227336g, Path.Direction.CCW);
        canvas.drawPath(this.f227330a, this.f227333d);
    }

    /* renamed from: hb */
    public final void mo76723hb(int i) {
        float f = (float) i;
        if (this.f227335f != f) {
            this.f227335f = f;
            this.f227336g = C83418g.m132812a(f, this.f227334e);
            invalidate();
        }
    }

    /* renamed from: hc */
    public final void mo76724hc(int i) {
        if (this.f227334e != i) {
            this.f227334e = i;
            this.f227336g = C83418g.m132812a(this.f227335f, i);
            invalidate();
        }
    }

    public RoundedCornerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedCornerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f227330a = new Path();
        this.f227331b = new Paint();
        this.f227332c = new Paint();
        this.f227333d = new Paint();
        m132775c(context, attributeSet, i);
    }

    public RoundedCornerTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f227330a = new Path();
        this.f227331b = new Paint();
        this.f227332c = new Paint();
        this.f227333d = new Paint();
        m132775c(context, attributeSet, i);
    }
}
