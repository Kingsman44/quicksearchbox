package com.google.android.libraries.material.progress;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.animation.LinearInterpolator;
import com.google.android.libraries.material.p2205a.C28488a;
import com.google.android.libraries.material.p2205a.C28491d;
import com.google.android.libraries.material.p2205a.C28497j;
import java.util.ArrayList;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.material.progress.h */
/* compiled from: PG */
public final class C28582h extends Drawable implements Animatable, C28575a {

    /* renamed from: d */
    private static final LinearInterpolator f77719d = new LinearInterpolator();

    /* renamed from: A */
    private long f77720A;

    /* renamed from: B */
    private long f77721B;

    /* renamed from: C */
    private long f77722C;

    /* renamed from: a */
    public final AnimatorSet f77723a;

    /* renamed from: b */
    public boolean f77724b;

    /* renamed from: c */
    public Runnable f77725c;

    /* renamed from: e */
    private final RectF f77726e = new RectF();

    /* renamed from: f */
    private final Rect f77727f = new Rect();

    /* renamed from: g */
    private final ValueAnimator f77728g;

    /* renamed from: h */
    private final ValueAnimator f77729h;

    /* renamed from: i */
    private final ValueAnimator f77730i;

    /* renamed from: j */
    private final ValueAnimator f77731j;

    /* renamed from: k */
    private final ValueAnimator f77732k;

    /* renamed from: l */
    private final ValueAnimator f77733l;

    /* renamed from: m */
    private final ArrayList f77734m;

    /* renamed from: n */
    private float f77735n;

    /* renamed from: o */
    private float f77736o;

    /* renamed from: p */
    private float f77737p;

    /* renamed from: q */
    private float f77738q;

    /* renamed from: r */
    private float f77739r;

    /* renamed from: s */
    private int f77740s;

    /* renamed from: t */
    private int f77741t;

    /* renamed from: u */
    private final Paint f77742u;

    /* renamed from: v */
    private int[] f77743v;

    /* renamed from: w */
    private int f77744w;

    /* renamed from: x */
    private int f77745x;

    /* renamed from: y */
    private int f77746y;

    /* renamed from: z */
    private final float f77747z;

    public C28582h(int i, int i2, int[] iArr) {
        this.f77745x = i;
        this.f77747z = -1.0f;
        this.f77746y = i2;
        this.f77743v = iArr;
        this.f77724b = false;
        ArrayList arrayList = new ArrayList();
        this.f77734m = arrayList;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "detentFraction", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(1332);
        LinearInterpolator linearInterpolator = f77719d;
        ofFloat.setInterpolator(linearInterpolator);
        this.f77728g = ofFloat;
        arrayList.add(ofFloat);
        int[] iArr2 = this.f77743v;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this, "currentColor", new int[]{iArr2[this.f77740s], iArr2[m53471f()]});
        ofInt.setEvaluator(C28488a.f77317a);
        ofInt.setStartDelay(999);
        ofInt.setDuration(333);
        ofInt.setInterpolator(linearInterpolator);
        this.f77741t = this.f77743v[this.f77740s];
        this.f77731j = ofInt;
        arrayList.add(ofInt);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "headFraction", new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(666);
        ofFloat2.setInterpolator(C28497j.f77331c);
        this.f77729h = ofFloat2;
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "tailFraction", new float[]{0.0f, 1.0f});
        ofFloat3.setStartDelay(666);
        ofFloat3.setDuration(666);
        ofFloat3.setInterpolator(C28497j.f77331c);
        this.f77730i = ofFloat3;
        arrayList.add(ofFloat3);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{0.0f, 1.0f});
        ofFloat4.addListener(new C28580f(this));
        ofFloat4.setDuration(750);
        ofFloat4.setInterpolator(linearInterpolator);
        this.f77732k = ofFloat4;
        arrayList.add(ofFloat4);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this, "alphaFraction", new float[]{1.0f, 0.0f});
        ofFloat5.addListener(new C28581g(this));
        ofFloat5.setDuration(750);
        ofFloat5.setInterpolator(linearInterpolator);
        this.f77733l = ofFloat5;
        arrayList.add(ofFloat5);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofInt});
        boolean z = C28592r.f77792a;
        boolean z2 = C28592r.f77793b;
        C28491d.m53263b(animatorSet, new C28579e(this));
        this.f77723a = animatorSet;
        Paint paint = new Paint();
        this.f77742u = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        this.f77744w = PrivateKeyType.INVALID;
        setVisible(false, false);
        mo34199d();
    }

    /* renamed from: f */
    private final int m53471f() {
        return (this.f77740s + 1) % this.f77743v.length;
    }

    /* renamed from: g */
    private final void m53472g() {
        this.f77731j.setStartDelay(999);
        this.f77730i.setStartDelay(666);
    }

    /* renamed from: a */
    public final void mo34174a(Runnable runnable) {
        this.f77725c = runnable;
        setVisible(false);
    }

    /* renamed from: b */
    public final void mo34175b() {
        setVisible(false);
        mo34199d();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo34198c() {
        m53472g();
        this.f77738q = 0.0f;
        this.f77735n = (this.f77735n + 216.0f) % 360.0f;
        int f = m53471f();
        this.f77740s = f;
        int[] iArr = this.f77743v;
        int i = iArr[f];
        this.f77741t = i;
        this.f77731j.setIntValues(new int[]{i, iArr[m53471f()]});
    }

    /* renamed from: d */
    public final void mo34199d() {
        super.setVisible(this.f77724b, false);
        if (this.f77723a.isStarted()) {
            this.f77723a.cancel();
        }
        ArrayList arrayList = this.f77734m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator.isStarted()) {
                animator.cancel();
            }
        }
        m53472g();
        this.f77737p = 0.0f;
        this.f77738q = 0.0f;
        this.f77736o = 0.0f;
        this.f77735n = 0.0f;
        this.f77740s = 0;
        int[] iArr = this.f77743v;
        int i2 = iArr[0];
        this.f77741t = i2;
        this.f77731j.setIntValues(new int[]{i2, iArr[m53471f()]});
        this.f77739r = 0.0f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        if (getBounds().isEmpty()) {
            return;
        }
        if (isVisible() || this.f77733l.isRunning()) {
            if (this.f77747z == -1.0f) {
                rect = getBounds();
            } else {
                Rect bounds = getBounds();
                int centerX = bounds.centerX();
                int centerY = bounds.centerY();
                this.f77727f.left = centerX - (getIntrinsicWidth() / 2);
                this.f77727f.right = centerX + (getIntrinsicWidth() / 2);
                this.f77727f.top = centerY - (getIntrinsicHeight() / 2);
                this.f77727f.bottom = centerY + (getIntrinsicHeight() / 2);
                rect = this.f77727f;
            }
            int i = this.f77745x;
            float f = this.f77739r;
            float f2 = ((float) i) * f;
            int i2 = this.f77744w;
            float f3 = ((float) (this.f77746y + i)) - (f2 / 2.0f);
            this.f77742u.setColor(this.f77741t);
            this.f77742u.setAlpha((int) (((float) i2) * f));
            this.f77742u.setStrokeWidth(f2);
            this.f77726e.set(rect);
            this.f77726e.inset(f3, f3);
            float width = this.f77726e.width();
            float f4 = this.f77738q * 290.0f;
            float abs = Math.abs((this.f77737p * 290.0f) - f4);
            double d = (double) ((width / 2.0f) - f2);
            Double.isNaN(d);
            double d2 = (double) (f2 * 180.0f);
            Double.isNaN(d2);
            float max = Math.max(abs, (float) ((d * 3.141592653589793d) / d2));
            float f5 = this.f77736o;
            Canvas canvas2 = canvas;
            canvas2.drawArc(this.f77726e, (f4 + (this.f77735n + (f5 * 286.0f))) - 0.049804688f, max, false, this.f77742u);
        }
    }

    public float getAlphaFraction() {
        return this.f77739r;
    }

    public int getCurrentColor() {
        return this.f77741t;
    }

    public float getDetentFraction() {
        return this.f77736o;
    }

    public float getHeadFraction() {
        return this.f77737p;
    }

    public int getIntrinsicHeight() {
        float f = this.f77747z;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        float f = this.f77747z;
        return f != -1.0f ? (int) (f + f) : super.getIntrinsicWidth();
    }

    public int getOpacity() {
        return -3;
    }

    public float getTailFraction() {
        return this.f77738q;
    }

    public final boolean isRunning() {
        return this.f77723a.isRunning() || this.f77732k.isRunning();
    }

    public void setAlpha(int i) {
        if (i != this.f77744w) {
            this.f77744w = i;
            invalidateSelf();
        }
    }

    public void setAlphaFraction(float f) {
        this.f77739r = f;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f77742u.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColors(int[] iArr) {
        int[] iArr2 = this.f77743v;
        int i = this.f77740s;
        int i2 = iArr2[i];
        this.f77743v = iArr;
        int length = i % iArr.length;
        this.f77740s = length;
        this.f77741t = iArr[length];
        this.f77731j.setIntValues(new int[]{i2, iArr[length]});
        invalidateSelf();
    }

    public void setCurrentColor(int i) {
        this.f77741t = i;
        invalidateSelf();
    }

    public void setDetentFraction(float f) {
        this.f77736o = f;
        invalidateSelf();
    }

    public void setHeadFraction(float f) {
        this.f77737p = f;
        invalidateSelf();
    }

    public void setInnerBounds(int i, int i2, int i3, int i4) {
        int min = (Math.min(i3 - i, i4 - i2) / 2) + this.f77745x;
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        setBounds(i5 - min, i6 - min, i5 + min, i6 + min);
    }

    public void setInset(int i) {
        if (i != this.f77746y) {
            this.f77746y = i;
            invalidateSelf();
        }
    }

    public void setNextStartDelayMs(int i) {
        if (i >= 0) {
            long j = (long) i;
            this.f77720A = j;
            this.f77721B = j;
            return;
        }
        throw new IllegalStateException();
    }

    public void setStrokeWidth(int i) {
        if (i != this.f77745x) {
            this.f77745x = i;
            invalidateSelf();
        }
    }

    public void setTailFraction(float f) {
        this.f77738q = f;
        invalidateSelf();
    }

    public void setVisible(boolean z) {
        setVisible(z, true);
    }

    public final void start() {
        setVisible(true);
    }

    public final void stop() {
        setVisible(false);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3 = z != this.f77724b;
        if (!z3 && !z2) {
            return false;
        }
        this.f77724b = z;
        if (z) {
            super.setVisible(true, z2);
            if (this.f77733l.isRunning()) {
                if (this.f77720A == 0) {
                    this.f77732k.setCurrentPlayTime(750 - this.f77733l.getCurrentPlayTime());
                }
                this.f77733l.cancel();
            }
            if (z2) {
                mo34199d();
                this.f77732k.setStartDelay(this.f77720A);
                this.f77732k.start();
                this.f77721B = this.f77720A;
                this.f77720A = 0;
            } else {
                long max = Math.max(0, this.f77721B - (SystemClock.elapsedRealtime() - this.f77722C));
                this.f77721B = max;
                this.f77732k.setStartDelay(max);
                this.f77732k.start();
            }
            this.f77722C = SystemClock.elapsedRealtime();
            this.f77725c = null;
        } else if (z3) {
            if (this.f77732k.isRunning()) {
                this.f77733l.setCurrentPlayTime(750 - this.f77732k.getCurrentPlayTime());
                this.f77732k.cancel();
            }
            this.f77733l.start();
        } else {
            mo34199d();
        }
        return z3;
    }
}
