package com.google.android.apps.gsa.now.shared.p6421ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.apps.gsa.shared.p7148ui.TouchInterceptingFrameLayout;

/* renamed from: com.google.android.apps.gsa.now.shared.ui.RoundedCornerTouchInterceptingFrameLayout */
/* compiled from: PG */
public final class RoundedCornerTouchInterceptingFrameLayout extends TouchInterceptingFrameLayout implements C83417f {

    /* renamed from: c */
    private float f227337c;

    /* renamed from: d */
    private int f227338d;

    /* renamed from: e */
    private float[] f227339e;

    public RoundedCornerTouchInterceptingFrameLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        if (this.f227339e != null) {
            Path path = new Path();
            Rect clipBounds = canvas.getClipBounds();
            path.addRoundRect(new RectF((float) clipBounds.left, (float) clipBounds.top, (float) clipBounds.right, (float) clipBounds.bottom), this.f227339e, Path.Direction.CW);
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    /* renamed from: hb */
    public final void mo76723hb(int i) {
        float f = (float) i;
        if (this.f227337c != f) {
            this.f227337c = f;
            this.f227339e = C83418g.m132812a(f, this.f227338d);
            invalidate();
        }
    }

    /* renamed from: hc */
    public final void mo76724hc(int i) {
        if (this.f227338d != i) {
            this.f227338d = i;
            this.f227339e = C83418g.m132812a(this.f227337c, i);
            invalidate();
        }
    }

    public RoundedCornerTouchInterceptingFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RoundedCornerTouchInterceptingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
