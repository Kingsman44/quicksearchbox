package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.RoundedCornerFrameLayout */
/* compiled from: PG */
public class RoundedCornerFrameLayout extends FrameLayout implements C83417f {

    /* renamed from: a */
    private float f227327a;

    /* renamed from: b */
    private int f227328b;

    /* renamed from: c */
    private float[] f227329c;

    public RoundedCornerFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f227329c != null) {
            Path path = new Path();
            path.addRoundRect(new RectF(canvas.getClipBounds()), this.f227329c, Path.Direction.CW);
            canvas.clipPath(path);
            setClipChildren(true);
            setClipToOutline(true);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: hb */
    public final void mo76723hb(int i) {
        float f = (float) i;
        if (this.f227327a != f) {
            this.f227327a = f;
            this.f227329c = C83418g.m132812a(f, this.f227328b);
            invalidate();
        }
    }

    /* renamed from: hc */
    public final void mo76724hc(int i) {
        if (this.f227328b != i) {
            this.f227328b = i;
            this.f227329c = C83418g.m132812a(this.f227327a, i);
            invalidate();
        }
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RoundedCornerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
