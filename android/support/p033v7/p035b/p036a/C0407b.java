package android.support.p033v7.p035b.p036a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.p034a.C0338a;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.C1930c;
import com.google.android.googlequicksearchbox.R;

/* renamed from: android.support.v7.b.a.b */
/* compiled from: PG */
public final class C0407b extends Drawable {

    /* renamed from: b */
    private static final float f1371b = ((float) Math.toRadians(45.0d));

    /* renamed from: a */
    public float f1372a;

    /* renamed from: c */
    private final Paint f1373c;

    /* renamed from: d */
    private final float f1374d;

    /* renamed from: e */
    private final float f1375e;

    /* renamed from: f */
    private final float f1376f;

    /* renamed from: g */
    private float f1377g;

    /* renamed from: h */
    private boolean f1378h;

    /* renamed from: i */
    private final Path f1379i = new Path();

    /* renamed from: j */
    private final int f1380j;

    /* renamed from: k */
    private float f1381k;

    /* renamed from: l */
    private final int f1382l = 2;

    public C0407b(Context context) {
        Paint paint = new Paint();
        this.f1373c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, C0338a.f1078n, R.attr.drawerArrowStyle, 2132148680);
        mo1370a(obtainStyledAttributes.getColor(3, 0));
        float dimension = obtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            double d = (double) (dimension / 2.0f);
            double cos = Math.cos((double) f1371b);
            Double.isNaN(d);
            this.f1381k = (float) (d * cos);
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(6, true);
        if (this.f1378h != z) {
            this.f1378h = z;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(5, 0.0f));
        if (round != this.f1377g) {
            this.f1377g = round;
            invalidateSelf();
        }
        this.f1380j = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f1375e = (float) Math.round(obtainStyledAttributes.getDimension(2, 0.0f));
        this.f1374d = (float) Math.round(obtainStyledAttributes.getDimension(0, 0.0f));
        this.f1376f = obtainStyledAttributes.getDimension(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo1370a(int i) {
        if (i != this.f1373c.getColor()) {
            this.f1373c.setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: b */
    public final void mo1371b(float f) {
        if (this.f1372a != f) {
            this.f1372a = f;
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        int i = this.f1382l;
        boolean z = false;
        if (i != 0 && (i == 1 || C1930c.m5229a(this) == 1)) {
            z = true;
        }
        float f = this.f1374d;
        float f2 = f * f;
        double sqrt = Math.sqrt((double) (f2 + f2));
        float f3 = this.f1375e;
        float f4 = this.f1372a;
        float f5 = ((((float) sqrt) - f3) * f4) + f3;
        float f6 = f3 + ((this.f1376f - f3) * f4);
        float round = (float) Math.round(((this.f1381k + 0.0f) * f4) + 0.0f);
        float f7 = f1371b;
        float f8 = this.f1372a;
        float f9 = ((f7 + 0.0f) * f8) + 0.0f;
        float f10 = true != z ? -180.0f : 0.0f;
        double d = (double) f5;
        double d2 = (double) f9;
        double cos = Math.cos(d2);
        Double.isNaN(d);
        float f11 = f10 + (f8 * 180.0f);
        float round2 = (float) Math.round(cos * d);
        double sin = Math.sin(d2);
        Double.isNaN(d);
        float round3 = (float) Math.round(d * sin);
        this.f1379i.rewind();
        float strokeWidth = this.f1377g + this.f1373c.getStrokeWidth();
        float f12 = strokeWidth + (((-this.f1381k) - strokeWidth) * this.f1372a);
        float f13 = (-f6) / 2.0f;
        this.f1379i.moveTo(f13 + round, 0.0f);
        this.f1379i.rLineTo(f6 - (round + round), 0.0f);
        this.f1379i.moveTo(f13, f12);
        this.f1379i.rLineTo(round2, round3);
        this.f1379i.moveTo(f13, -f12);
        this.f1379i.rLineTo(round2, -round3);
        this.f1379i.close();
        canvas.save();
        float strokeWidth2 = this.f1373c.getStrokeWidth();
        int height = bounds.height();
        float f14 = this.f1377g;
        int i2 = ((int) ((((float) height) - (3.0f * strokeWidth2)) - (f14 + f14))) / 4;
        canvas2.translate((float) bounds.centerX(), ((float) (i2 + i2)) + (strokeWidth2 * 1.5f) + f14);
        if (this.f1378h) {
            canvas2.rotate(f11 * ((float) (true != z ? 1 : -1)));
        } else if (z) {
            canvas2.rotate(180.0f);
        }
        canvas2.drawPath(this.f1379i, this.f1373c);
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return this.f1380j;
    }

    public final int getIntrinsicWidth() {
        return this.f1380j;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        if (i != this.f1373c.getAlpha()) {
            this.f1373c.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1373c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
