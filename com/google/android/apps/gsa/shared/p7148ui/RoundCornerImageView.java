package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.google.android.apps.gsa.shared.ui.RoundCornerImageView */
/* compiled from: PG */
public class RoundCornerImageView extends ImageView {

    /* renamed from: a */
    private float[] f253359a;

    /* renamed from: b */
    private Path f253360b;

    /* renamed from: c */
    private RectF f253361c;

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C90629ae.f253428f, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, 15);
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            if (dimension > 0.0f) {
                float[] fArr = new float[8];
                this.f253359a = fArr;
                if ((integer & 1) != 0) {
                    fArr[0] = dimension;
                    fArr[1] = dimension;
                }
                if ((integer & 2) != 0) {
                    fArr[2] = dimension;
                    fArr[3] = dimension;
                }
                if ((integer & 4) != 0) {
                    fArr[4] = dimension;
                    fArr[5] = dimension;
                }
                if ((integer & 8) != 0) {
                    fArr[6] = dimension;
                    fArr[7] = dimension;
                }
                this.f253360b = new Path();
                this.f253361c = new RectF();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f253359a != null) {
            this.f253361c.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f253360b.rewind();
            this.f253360b.addRoundRect(this.f253361c, this.f253359a, Path.Direction.CW);
            canvas.clipPath(this.f253360b);
        }
        super.onDraw(canvas);
    }
}
