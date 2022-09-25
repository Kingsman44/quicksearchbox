package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2302d;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.swiperefreshlayout.widget.e */
/* compiled from: PG */
public final class C4176e extends Drawable implements Animatable {

    /* renamed from: d */
    private static final Interpolator f13560d = new LinearInterpolator();

    /* renamed from: e */
    private static final Interpolator f13561e = new C2300b();

    /* renamed from: f */
    private static final int[] f13562f = {-16777216};

    /* renamed from: a */
    public final C4175d f13563a;

    /* renamed from: b */
    float f13564b;

    /* renamed from: c */
    boolean f13565c;

    /* renamed from: g */
    private float f13566g;

    /* renamed from: h */
    private Resources f13567h;

    /* renamed from: i */
    private Animator f13568i;

    public C4176e(Context context) {
        context.getClass();
        this.f13567h = context.getResources();
        C4175d dVar = new C4175d();
        this.f13563a = dVar;
        dVar.mo8828d(f13562f);
        dVar.mo8830f(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C4173b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f13560d);
        ofFloat.addListener(new C4174c(this, dVar));
        this.f13568i = ofFloat;
    }

    /* renamed from: g */
    private final void m11996g(float f, float f2, float f3, float f4) {
        C4175d dVar = this.f13563a;
        float f5 = this.f13567h.getDisplayMetrics().density;
        dVar.mo8830f(f2 * f5);
        dVar.f13555q = f * f5;
        dVar.mo8827c(0);
        dVar.f13556r = (int) (f3 * f5);
        dVar.f13557s = (int) (f4 * f5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8832a(float f, C4175d dVar, boolean z) {
        float f2;
        float f3;
        if (this.f13565c) {
            m11995f(f, dVar);
            double floor = Math.floor((double) (dVar.f13551m / 0.8f));
            float f4 = dVar.f13549k;
            float f5 = dVar.f13550l;
            dVar.f13543e = f4 + (((-0.01f + f5) - f4) * f);
            dVar.f13544f = f5;
            float f6 = dVar.f13551m;
            dVar.f13545g = f6 + ((((float) (floor + 1.0d)) - f6) * f);
        } else if (f != 1.0f || z) {
            float f7 = dVar.f13551m;
            if (f < 0.5f) {
                f3 = dVar.f13549k;
                f2 = (C2302d.m6236a(C2300b.f6448a, f / 0.5f) * 0.79f) + 0.01f + f3;
            } else {
                float f8 = dVar.f13549k + 0.79f;
                f3 = f8 - (((1.0f - C2302d.m6236a(C2300b.f6448a, (-0.5f + f) / 0.5f)) * 0.79f) + 0.01f);
                f2 = f8;
            }
            float f9 = this.f13564b;
            dVar.f13543e = f3;
            dVar.f13544f = f2;
            dVar.f13545g = f7 + (0.20999998f * f);
            this.f13566g = (f + f9) * 216.0f;
        }
    }

    /* renamed from: b */
    public final void mo8833b(boolean z) {
        this.f13563a.mo8829e(z);
        invalidateSelf();
    }

    /* renamed from: c */
    public final void mo8834c(float f) {
        C4175d dVar = this.f13563a;
        if (f != dVar.f13554p) {
            dVar.f13554p = f;
        }
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo8835d(int i) {
        if (i == 0) {
            m11996g(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m11996g(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f13566g, bounds.exactCenterX(), bounds.exactCenterY());
        C4175d dVar = this.f13563a;
        RectF rectF = dVar.f13539a;
        float f = dVar.f13555q;
        float f2 = (dVar.f13546h / 2.0f) + f;
        if (f <= 0.0f) {
            f2 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) dVar.f13556r) * dVar.f13554p) / 2.0f, dVar.f13546h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f2, ((float) bounds.centerY()) - f2, ((float) bounds.centerX()) + f2, ((float) bounds.centerY()) + f2);
        float f3 = dVar.f13543e;
        float f4 = dVar.f13545g;
        float f5 = (f3 + f4) * 360.0f;
        float f6 = ((dVar.f13544f + f4) * 360.0f) - f5;
        dVar.f13540b.setColor(dVar.f13559u);
        dVar.f13540b.setAlpha(dVar.f13558t);
        float f7 = dVar.f13546h / 2.0f;
        rectF.inset(f7, f7);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f13542d);
        float f8 = -f7;
        rectF.inset(f8, f8);
        canvas.drawArc(rectF, f5, f6, false, dVar.f13540b);
        if (dVar.f13552n) {
            Path path = dVar.f13553o;
            if (path == null) {
                dVar.f13553o = new Path();
                dVar.f13553o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height());
            int i = dVar.f13556r;
            float f9 = dVar.f13554p;
            dVar.f13553o.moveTo(0.0f, 0.0f);
            dVar.f13553o.lineTo(((float) dVar.f13556r) * dVar.f13554p, 0.0f);
            Path path2 = dVar.f13553o;
            int i2 = dVar.f13556r;
            float f10 = dVar.f13554p;
            path2.lineTo((((float) i2) * f10) / 2.0f, ((float) dVar.f13557s) * f10);
            dVar.f13553o.offset(((min / 2.0f) + rectF.centerX()) - ((((float) i) * f9) / 2.0f), rectF.centerY() + (dVar.f13546h / 2.0f));
            dVar.f13553o.close();
            dVar.f13541c.setColor(dVar.f13559u);
            dVar.f13541c.setAlpha(dVar.f13558t);
            canvas.save();
            canvas.rotate(f5 + f6, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f13553o, dVar.f13541c);
            canvas.restore();
        }
        canvas.restore();
    }

    /* renamed from: e */
    public final void mo8837e(float f) {
        C4175d dVar = this.f13563a;
        dVar.f13543e = 0.0f;
        dVar.f13544f = f;
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f13563a.f13558t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.f13568i.isRunning();
    }

    public final void setAlpha(int i) {
        this.f13563a.f13558t = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13563a.f13540b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.f13568i.cancel();
        this.f13563a.mo8831g();
        C4175d dVar = this.f13563a;
        if (dVar.f13544f != dVar.f13543e) {
            this.f13565c = true;
            this.f13568i.setDuration(666);
            this.f13568i.start();
            return;
        }
        dVar.mo8827c(0);
        this.f13563a.mo8826b();
        this.f13568i.setDuration(1332);
        this.f13568i.start();
    }

    public final void stop() {
        this.f13568i.cancel();
        this.f13566g = 0.0f;
        this.f13563a.mo8829e(false);
        this.f13563a.mo8827c(0);
        this.f13563a.mo8826b();
        invalidateSelf();
    }

    /* renamed from: f */
    static final void m11995f(float f, C4175d dVar) {
        if (f > 0.75f) {
            float f2 = (f - 6.0f) / 0.25f;
            int[] iArr = dVar.f13547i;
            int i = iArr[dVar.f13548j];
            int i2 = iArr[dVar.mo8825a()];
            int i3 = (i >> 24) & PrivateKeyType.INVALID;
            int i4 = (i >> 16) & PrivateKeyType.INVALID;
            int i5 = (i >> 8) & PrivateKeyType.INVALID;
            int i6 = i & PrivateKeyType.INVALID;
            dVar.f13559u = ((i3 + ((int) (((float) (((i2 >> 24) & PrivateKeyType.INVALID) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & PrivateKeyType.INVALID) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & PrivateKeyType.INVALID) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & PrivateKeyType.INVALID) - i6)))));
            return;
        }
        dVar.f13559u = dVar.f13547i[dVar.f13548j];
    }
}
