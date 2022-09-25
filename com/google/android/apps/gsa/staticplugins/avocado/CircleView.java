package com.google.android.apps.gsa.staticplugins.avocado;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class CircleView extends View {

    /* renamed from: a */
    public float f263025a;

    /* renamed from: b */
    public float f263026b;

    /* renamed from: c */
    private final Paint f263027c;

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f263027c = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f263025a, this.f263026b, getResources().getDimension(R.dimen.circle_radius), this.f263027c);
    }
}
