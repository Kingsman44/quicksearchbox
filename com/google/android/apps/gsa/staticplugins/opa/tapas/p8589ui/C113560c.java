package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.c */
/* compiled from: PG */
public final class C113560c extends Drawable {

    /* renamed from: a */
    private final Paint f314435a;

    /* renamed from: b */
    private final Paint f314436b;

    /* renamed from: c */
    private final Context f314437c;

    /* renamed from: d */
    private final float f314438d;

    /* renamed from: e */
    private final C113545b f314439e;

    public C113560c(Context context, C113545b bVar) {
        this.f314437c = context;
        Paint paint = new Paint();
        this.f314435a = paint;
        paint.setColor(context.getResources().getColor(R.color.tapas_extra_options_background));
        Paint paint2 = new Paint();
        this.f314436b = paint2;
        paint2.setColor(context.getResources().getColor(R.color.tapas_extra_options_separator));
        this.f314438d = bVar.f314346d == 1 ? context.getResources().getDimension(R.dimen.extra_options_pointer_height) : 0.0f;
        this.f314439e = bVar;
    }

    public final void draw(Canvas canvas) {
        float dimension = this.f314437c.getResources().getDimension(R.dimen.extra_options_corner_radius);
        float dimension2 = this.f314437c.getResources().getDimension(R.dimen.extra_options_width);
        float f = this.f314438d;
        Canvas canvas2 = canvas;
        float f2 = dimension2;
        canvas2.drawRoundRect(0.0f, f, f2, f + this.f314439e.f314343a, dimension, dimension, this.f314435a);
        float f3 = this.f314439e.f314344b;
        canvas2.drawLine(0.0f, f3, f2, f3, this.f314436b);
        float dimension3 = this.f314437c.getResources().getDimension(R.dimen.extra_options_pointer_height);
        float dimension4 = this.f314437c.getResources().getDimension(R.dimen.extra_options_pointer_radius);
        C113545b bVar = this.f314439e;
        canvas.translate(bVar.f314345c, bVar.f314346d == 2 ? bVar.f314343a - (3.0f * dimension3) : 0.0f);
        canvas.rotate(45.0f);
        double sqrt = Math.sqrt(2.0d);
        double d = (double) dimension3;
        Double.isNaN(d);
        float f4 = (float) ((sqrt + sqrt) * d);
        canvas.drawRoundRect(0.0f, 0.0f, f4, f4, dimension4, dimension4, this.f314435a);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
