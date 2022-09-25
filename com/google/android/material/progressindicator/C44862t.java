package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.p198v.p199a.p200a.C4244c;
import com.google.android.material.p3504a.C44497b;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.material.progressindicator.t */
/* compiled from: PG */
abstract class C44862t extends Drawable implements Animatable {

    /* renamed from: a */
    private static final Property f117052a = new C44861s(Float.class);

    /* renamed from: b */
    private ValueAnimator f117053b;

    /* renamed from: c */
    private ValueAnimator f117054c;

    /* renamed from: d */
    final Context f117055d;

    /* renamed from: e */
    final C44849g f117056e;

    /* renamed from: f */
    public List f117057f;

    /* renamed from: g */
    public boolean f117058g;

    /* renamed from: h */
    final Paint f117059h = new Paint();

    /* renamed from: i */
    public int f117060i;

    /* renamed from: j */
    private float f117061j;

    public C44862t(Context context, C44849g gVar) {
        this.f117055d = context;
        this.f117056e = gVar;
        this.f117060i = PrivateKeyType.INVALID;
        invalidateSelf();
    }

    /* renamed from: j */
    private final void m79616j(ValueAnimator... valueAnimatorArr) {
        boolean z = this.f117058g;
        this.f117058g = true;
        valueAnimatorArr[0].end();
        this.f117058g = z;
    }

    /* renamed from: a */
    public boolean mo48304a(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (this.f117053b == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f117052a, new float[]{0.0f, 1.0f});
            this.f117053b = ofFloat;
            ofFloat.setDuration(500);
            this.f117053b.setInterpolator(C44497b.f115651b);
            ValueAnimator valueAnimator3 = this.f117053b;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.f117053b = valueAnimator3;
                valueAnimator3.addListener(new C44859q(this));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.f117054c == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f117052a, new float[]{1.0f, 0.0f});
            this.f117054c = ofFloat2;
            ofFloat2.setDuration(500);
            this.f117054c.setInterpolator(C44497b.f115651b);
            ValueAnimator valueAnimator4 = this.f117054c;
            if (valueAnimator4 == null || !valueAnimator4.isRunning()) {
                this.f117054c = valueAnimator4;
                valueAnimator4.addListener(new C44860r(this));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f117053b;
        } else {
            valueAnimator = this.f117054c;
        }
        if (z) {
            valueAnimator2 = this.f117054c;
        } else {
            valueAnimator2 = this.f117053b;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                ValueAnimator[] valueAnimatorArr = new ValueAnimator[1];
                boolean z4 = this.f117058g;
                this.f117058g = true;
                valueAnimator2.cancel();
                this.f117058g = z4;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m79616j(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (valueAnimator.isRunning()) {
            return false;
        } else {
            boolean z5 = !z || super.setVisible(true, false);
            if (!(z ? this.f117056e.mo48292c() : this.f117056e.mo48291b())) {
                m79616j(valueAnimator);
                return z5;
            }
            if (z2 || !valueAnimator.isPaused()) {
                valueAnimator.start();
            } else {
                valueAnimator.resume();
            }
            return z5;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo48314b() {
        if (this.f117056e.mo48292c() || this.f117056e.mo48291b()) {
            return this.f117061j;
        }
        return 1.0f;
    }

    /* renamed from: c */
    public final void mo48315c(C4244c cVar) {
        if (this.f117057f == null) {
            this.f117057f = new ArrayList();
        }
        if (!this.f117057f.contains(cVar)) {
            this.f117057f.add(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48316d(float f) {
        if (this.f117061j != f) {
            this.f117061j = f;
            invalidateSelf();
        }
    }

    /* renamed from: e */
    public final boolean mo48317e() {
        ValueAnimator valueAnimator = this.f117054c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: f */
    public final boolean mo48318f() {
        ValueAnimator valueAnimator = this.f117053b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* renamed from: g */
    public final boolean mo48319g(boolean z, boolean z2, boolean z3) {
        float a = C44836a.m79572a(this.f117055d.getContentResolver());
        boolean z4 = false;
        if (z3 && a > 0.0f) {
            z4 = true;
        }
        return mo48304a(z, z2, z4);
    }

    public final int getAlpha() {
        return this.f117060i;
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: i */
    public final void mo48322i(C4244c cVar) {
        List list = this.f117057f;
        if (list != null && list.contains(cVar)) {
            this.f117057f.remove(cVar);
            if (this.f117057f.isEmpty()) {
                this.f117057f = null;
            }
        }
    }

    public final boolean isRunning() {
        return mo48318f() || mo48317e();
    }

    public final void setAlpha(int i) {
        this.f117060i = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f117059h.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z, boolean z2) {
        return mo48319g(z, z2, true);
    }

    public final void start() {
        mo48304a(true, true, false);
    }

    public final void stop() {
        mo48304a(false, true, false);
    }
}
