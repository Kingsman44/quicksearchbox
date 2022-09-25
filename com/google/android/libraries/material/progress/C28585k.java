package com.google.android.libraries.material.progress;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.material.p2205a.C28498k;
import com.google.android.libraries.material.p2205a.C28501n;
import com.google.android.libraries.material.p2205a.C28502o;

/* renamed from: com.google.android.libraries.material.progress.k */
/* compiled from: PG */
public final class C28585k extends Drawable implements C28575a {

    /* renamed from: a */
    public boolean f77750a = isVisible();

    /* renamed from: b */
    public Runnable f77751b;

    /* renamed from: c */
    private final int f77752c;

    /* renamed from: d */
    private int f77753d;

    /* renamed from: e */
    private int f77754e;

    /* renamed from: f */
    private int f77755f;

    /* renamed from: g */
    private int f77756g;

    /* renamed from: h */
    private final Paint f77757h;

    /* renamed from: i */
    private final C28498k f77758i;

    /* renamed from: j */
    private final C28501n f77759j;

    /* renamed from: k */
    private final ObjectAnimator f77760k;

    /* renamed from: l */
    private final ObjectAnimator f77761l;

    /* renamed from: m */
    private final float f77762m;

    /* renamed from: n */
    private float f77763n;

    /* renamed from: o */
    private float f77764o = 1.0f;

    /* renamed from: p */
    private float f77765p = 0.0f;

    /* renamed from: q */
    private double f77766q;

    /* renamed from: r */
    private final C28502o f77767r;

    public C28585k(int i, int i2, int i3, float f, int i4) {
        C28584j jVar = new C28584j(this);
        this.f77767r = jVar;
        this.f77753d = i;
        this.f77754e = i2;
        this.f77755f = i3;
        this.f77752c = Math.round(f * 255.0f);
        this.f77756g = i4;
        Paint paint = new Paint();
        this.f77757h = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        float f2 = 1.0f;
        double level = (double) getLevel();
        Double.isNaN(level);
        this.f77766q = level / 10000.0d;
        this.f77762m = 1.0f;
        this.f77763n = i4 != 2 ? 0.0f : f2;
        C28498k kVar = new C28498k();
        this.f77758i = kVar;
        double level2 = (double) getLevel();
        Double.isNaN(level2);
        kVar.mo33956c(level2 / 10000.0d);
        kVar.mo33955b(getDisplayedLevel());
        kVar.f77343l = true;
        kVar.f77334c.add(jVar);
        this.f77759j = new C28501n(kVar);
        this.f77760k = C28586l.m53482a(this);
        ObjectAnimator b = C28586l.m53483b(this);
        b.addListener(new C28583i(this));
        this.f77761l = b;
    }

    /* renamed from: a */
    public final void mo34174a(Runnable runnable) {
        this.f77751b = runnable;
        setVisible(false, false);
    }

    /* renamed from: b */
    public final void mo34175b() {
        this.f77750a = false;
        if (super.setVisible(false, false)) {
            this.f77760k.cancel();
            this.f77761l.cancel();
            mo34227c();
            Runnable runnable = this.f77751b;
            if (runnable != null) {
                ((C28590p) runnable).f77790a.mo34160c();
            }
        }
        this.f77751b = null;
    }

    /* renamed from: c */
    public final void mo34227c() {
        C28498k kVar = this.f77758i;
        double level = (double) getLevel();
        Double.isNaN(level);
        kVar.mo33956c(level / 10000.0d);
        this.f77759j.mo33960c();
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && isVisible()) {
            canvas.save();
            Rect bounds = getBounds();
            float height = (float) bounds.height();
            float f = (float) this.f77753d;
            if (height > f) {
                canvas.translate(0.0f, (height - f) / 2.0f);
            }
            canvas.scale(((float) bounds.width()) / 10000.0f, ((float) this.f77753d) / 4.0f);
            canvas.translate(5000.0f, 2.0f);
            if (this.f77765p < 1.0f) {
                if (this.f77756g == 0) {
                    canvas.scale(1.0f, -1.0f);
                }
                canvas.translate(0.0f, (this.f77765p - 4.0f) * 4.0f * 0.5f);
                canvas.scale(1.0f, this.f77765p);
            }
            int i = this.f77755f;
            if (i != -1) {
                this.f77757h.setColor(i);
            } else {
                this.f77757h.setColor(this.f77754e);
            }
            this.f77757h.setAlpha((int) (((float) this.f77752c) * this.f77764o));
            canvas.drawRect(-5000.0f, -2.0f, 5000.0f, 2.0f, this.f77757h);
            this.f77757h.setColor(this.f77754e);
            this.f77757h.setAlpha((int) (this.f77764o * 255.0f));
            canvas.drawRect(-5000.0f, -2.0f, ((float) (this.f77766q * 10000.0d)) - 8.687973E-4f, 2.0f, this.f77757h);
            canvas.restore();
        }
    }

    public double getDisplayedLevel() {
        return this.f77766q;
    }

    public float getGrowScale() {
        return this.f77765p;
    }

    public int getIntrinsicHeight() {
        return this.f77753d;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        C28498k kVar = this.f77758i;
        double d = (double) i;
        Double.isNaN(d);
        kVar.mo33955b(d / 10000.0d);
        this.f77759j.mo33959b();
        return true;
    }

    public void setAlpha(int i) {
        this.f77764o = ((float) i) / 255.0f;
        invalidateSelf();
    }

    public void setBarHeight(int i) {
        this.f77753d = i;
        invalidateSelf();
    }

    public void setColor(int i) {
        this.f77754e = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f77757h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDisplayedLevel(double d) {
        this.f77766q = d;
        invalidateSelf();
    }

    public void setGrowMode(int i) {
        this.f77756g = i;
        float f = i != 2 ? 0.0f : 1.0f;
        this.f77763n = f;
        this.f77761l.setFloatValues(new float[]{f});
        invalidateSelf();
    }

    public void setGrowScale(float f) {
        this.f77765p = f;
        invalidateSelf();
    }

    public void setTrackColor(int i) {
        this.f77755f = i;
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f77750a;
        if (!z3 && !z2) {
            return false;
        }
        this.f77750a = z;
        if (z) {
            super.setVisible(true, z2);
            if (z2) {
                mo34227c();
                this.f77760k.cancel();
                this.f77761l.cancel();
                this.f77765p = this.f77763n;
            }
            this.f77761l.cancel();
            this.f77760k.setFloatValues(new float[]{this.f77762m});
            this.f77760k.start();
            this.f77751b = null;
        } else if (z3) {
            this.f77760k.cancel();
            this.f77761l.setFloatValues(new float[]{this.f77763n});
            this.f77761l.start();
        }
        return z3;
    }
}
