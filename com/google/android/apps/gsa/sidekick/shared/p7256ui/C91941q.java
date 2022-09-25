package com.google.android.apps.gsa.sidekick.shared.p7256ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.ui.q */
/* compiled from: PG */
public final class C91941q extends ColorDrawable {

    /* renamed from: a */
    private Shape f256411a;

    /* renamed from: b */
    private Paint f256412b;

    /* renamed from: c */
    private final float f256413c;

    public C91941q(int i, int i2) {
        super(i);
        this.f256413c = (float) i2;
    }

    /* renamed from: a */
    public final void mo86641a(int i) {
        float f = this.f256413c;
        if (f > 0.0f) {
            float[] fArr = new float[8];
            if ((i & 1) != 0) {
                fArr[0] = f;
                fArr[1] = f;
            }
            if ((i & 2) != 0) {
                fArr[2] = f;
                fArr[3] = f;
            }
            if ((i & 4) != 0) {
                fArr[4] = f;
                fArr[5] = f;
            }
            if ((i & 8) != 0) {
                fArr[6] = f;
                fArr[7] = f;
            }
            this.f256411a = new RoundRectShape(fArr, (RectF) null, (float[]) null);
            Paint paint = new Paint();
            this.f256412b = paint;
            paint.setAntiAlias(true);
        } else {
            this.f256411a = null;
            this.f256412b = null;
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Shape shape = this.f256411a;
        if (shape == null) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        shape.resize((float) bounds.right, (float) bounds.bottom);
        Paint paint = this.f256412b;
        if (paint != null) {
            paint.setColor(getColor());
            shape.draw(canvas, this.f256412b);
        }
    }
}
