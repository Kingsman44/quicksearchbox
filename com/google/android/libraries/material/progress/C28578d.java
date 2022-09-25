package com.google.android.libraries.material.progress;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.material.p2205a.C28498k;
import com.google.android.libraries.material.p2205a.C28501n;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.material.progress.d */
/* compiled from: PG */
public final class C28578d extends Drawable implements C28575a {

    /* renamed from: c */
    private static final LinearInterpolator f77699c = new LinearInterpolator();

    /* renamed from: a */
    public boolean f77700a;

    /* renamed from: b */
    public Runnable f77701b;

    /* renamed from: d */
    private final ValueAnimator f77702d;

    /* renamed from: e */
    private final ValueAnimator f77703e;

    /* renamed from: f */
    private float f77704f;

    /* renamed from: g */
    private final RectF f77705g = new RectF();

    /* renamed from: h */
    private final Rect f77706h = new Rect();

    /* renamed from: i */
    private int f77707i;

    /* renamed from: j */
    private final Paint f77708j;

    /* renamed from: k */
    private int f77709k;

    /* renamed from: l */
    private int f77710l;

    /* renamed from: m */
    private final float f77711m;

    /* renamed from: n */
    private final C28498k f77712n;

    /* renamed from: o */
    private final C28501n f77713o;

    /* renamed from: p */
    private float f77714p;

    /* renamed from: q */
    private int f77715q = PrivateKeyType.INVALID;

    public C28578d(int i, int i2, int i3) {
        this.f77709k = i;
        this.f77711m = -1.0f;
        this.f77710l = i2;
        this.f77707i = i3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(750);
        LinearInterpolator linearInterpolator = f77699c;
        ofFloat.setInterpolator(linearInterpolator);
        this.f77702d = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat2.addListener(new C28577c(this));
        ofFloat2.setDuration(750);
        ofFloat2.setInterpolator(linearInterpolator);
        this.f77703e = ofFloat2;
        Paint paint = new Paint();
        this.f77708j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.f77700a = false;
        this.f77714p = (float) (getLevel() / 10000);
        C28498k kVar = new C28498k();
        this.f77712n = kVar;
        double level = (double) getLevel();
        Double.isNaN(level);
        kVar.mo33956c(level / 10000.0d);
        kVar.mo33955b((double) getDisplayedLevel());
        kVar.f77343l = true;
        kVar.f77334c.add(new C28576b(this));
        this.f77713o = new C28501n(kVar);
        setVisible(false, false);
    }

    /* renamed from: a */
    public final void mo34174a(Runnable runnable) {
        this.f77701b = runnable;
        setVisible(false, false);
    }

    /* renamed from: b */
    public final void mo34175b() {
        this.f77700a = false;
        if (super.setVisible(false, false)) {
            Runnable runnable = this.f77701b;
            if (runnable != null) {
                ((C28590p) runnable).f77790a.mo34160c();
            }
            mo34177c();
        }
        this.f77701b = null;
    }

    /* renamed from: c */
    public final void mo34177c() {
        C28498k kVar = this.f77712n;
        double level = (double) getLevel();
        Double.isNaN(level);
        kVar.mo33956c(level / 10000.0d);
        this.f77713o.mo33960c();
    }

    /* renamed from: d */
    public final void mo34178d() {
        mo34177c();
        if (this.f77702d.isStarted()) {
            this.f77702d.cancel();
        }
        if (this.f77703e.isStarted()) {
            this.f77703e.cancel();
        }
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (!getBounds().isEmpty() && isVisible()) {
            if (this.f77711m == -1.0f) {
                rect = getBounds();
            } else {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.f77706h.left = centerX - (getIntrinsicWidth() / 2);
                this.f77706h.right = centerX + (getIntrinsicWidth() / 2);
                this.f77706h.top = centerY - (getIntrinsicHeight() / 2);
                this.f77706h.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.f77706h;
            }
            int i = this.f77709k;
            float f = this.f77704f;
            float f2 = ((float) i) * f;
            int i2 = (int) (((float) this.f77715q) * f);
            float f3 = ((float) (this.f77710l + i)) - (f2 / 2.0f);
            this.f77708j.setStrokeWidth(f2);
            this.f77705g.set(rect);
            this.f77705g.inset(f3, f3);
            float width = this.f77705g.width();
            float f4 = this.f77714p;
            this.f77708j.setColor(this.f77707i);
            this.f77708j.setAlpha((int) (((float) i2) * 0.2f));
            canvas.drawOval(this.f77705g, this.f77708j);
            this.f77708j.setAlpha(i2);
            double d = (double) ((width / 2.0f) - f2);
            Double.isNaN(d);
            double d2 = (double) (f2 * 180.0f);
            Double.isNaN(d2);
            float max = Math.max(f4 * 360.0f, (float) ((d * 3.141592653589793d) / d2));
            if (max >= 5.0f) {
                canvas.drawArc(this.f77705g, -90.0f, max, false, this.f77708j);
            }
        }
    }

    public float getAlphaFraction() {
        return this.f77704f;
    }

    public float getDisplayedLevel() {
        return this.f77714p;
    }

    public int getIntrinsicHeight() {
        float f = this.f77711m;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        float f = this.f77711m;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        C28498k kVar = this.f77712n;
        double d = (double) i;
        Double.isNaN(d);
        kVar.mo33955b(d / 10000.0d);
        this.f77713o.mo33959b();
        return true;
    }

    public void setAlpha(int i) {
        if (i != this.f77715q) {
            this.f77715q = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f77704f = f;
        invalidateSelf();
    }

    public void setColor(int i) {
        this.f77707i = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f77708j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDisplayedLevel(float f) {
        this.f77714p = f;
        invalidateSelf();
    }

    public void setInnerBounds(int i, int i2, int i3, int i4) {
        int min = (Math.min(i3 - i, i4 - i2) / 2) + this.f77709k;
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        setBounds(i5 - min, i6 - min, i5 + min, i6 + min);
    }

    public void setInset(int i) {
        if (i != this.f77710l) {
            this.f77710l = i;
            invalidateSelf();
        }
    }

    public void setStrokeWidth(int i) {
        if (i != this.f77709k) {
            this.f77709k = i;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f77700a;
        if (!z3 && !z2) {
            return false;
        }
        this.f77700a = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f77703e.isRunning()) {
                this.f77702d.setCurrentPlayTime(750 - this.f77703e.getCurrentPlayTime());
                this.f77703e.cancel();
            }
            if (z2) {
                mo34178d();
                this.f77702d.start();
            } else {
                this.f77702d.start();
            }
            this.f77701b = null;
        } else if (z3) {
            if (this.f77702d.isRunning()) {
                this.f77703e.setCurrentPlayTime(750 - this.f77702d.getCurrentPlayTime());
                this.f77702d.cancel();
            }
            this.f77703e.start();
        } else {
            mo34178d();
        }
        return z3;
    }
}
