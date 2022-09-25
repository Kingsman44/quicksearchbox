package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.p079a.p080a.p081a.C1597g;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.motion.widget.al */
/* compiled from: PG */
final class C1713al {

    /* renamed from: a */
    final C1733r f4973a;

    /* renamed from: b */
    final int f4974b;

    /* renamed from: c */
    final C1597g f4975c = new C1597g();

    /* renamed from: d */
    final C1716ao f4976d;

    /* renamed from: e */
    final Interpolator f4977e;

    /* renamed from: f */
    boolean f4978f = false;

    /* renamed from: g */
    float f4979g;

    /* renamed from: h */
    float f4980h;

    /* renamed from: i */
    long f4981i;

    /* renamed from: j */
    final Rect f4982j = new Rect();

    /* renamed from: k */
    boolean f4983k = false;

    /* renamed from: l */
    private final int f4984l;

    /* renamed from: m */
    private final int f4985m;

    public C1713al(C1716ao aoVar, C1733r rVar, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.f4976d = aoVar;
        this.f4973a = rVar;
        this.f4974b = i2;
        this.f4981i = System.nanoTime();
        if (aoVar.f5011e == null) {
            aoVar.f5011e = new ArrayList();
        }
        aoVar.f5011e.add(this);
        this.f4977e = interpolator;
        this.f4984l = i4;
        this.f4985m = i5;
        if (i3 == 3) {
            this.f4983k = true;
        }
        this.f4980h = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
        mo4784a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo4785b() {
        this.f4978f = true;
        int i = this.f4974b;
        if (i != -1) {
            this.f4980h = i == 0 ? Float.MAX_VALUE : 1.0f / ((float) i);
        }
        this.f4976d.f5007a.invalidate();
        this.f4981i = System.nanoTime();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4784a() {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.f4978f) {
            long nanoTime = System.nanoTime();
            long j = this.f4981i;
            this.f4981i = nanoTime;
            float f5 = this.f4979g;
            double d = (double) (nanoTime - j);
            Double.isNaN(d);
            float f6 = f5 - (((float) (d * 1.0E-6d)) * this.f4980h);
            this.f4979g = f6;
            if (f6 < 0.0f) {
                this.f4979g = 0.0f;
                f6 = 0.0f;
                f3 = 0.0f;
            } else {
                f3 = f6;
            }
            Interpolator interpolator = this.f4977e;
            if (interpolator == null) {
                f4 = f3;
            } else {
                f4 = interpolator.getInterpolation(f6);
            }
            C1733r rVar = this.f4973a;
            boolean d2 = rVar.mo4809d(rVar.f5139b, f4, nanoTime, this.f4975c);
            if (this.f4979g <= 0.0f) {
                int i = this.f4984l;
                if (i != -1) {
                    this.f4973a.f5139b.setTag(i, Long.valueOf(System.nanoTime()));
                }
                int i2 = this.f4985m;
                if (i2 != -1) {
                    this.f4973a.f5139b.setTag(i2, (Object) null);
                }
                this.f4976d.f5012f.add(this);
            }
            if (this.f4979g > 0.0f || d2) {
                this.f4976d.f5007a.invalidate();
                return;
            }
            return;
        }
        long nanoTime2 = System.nanoTime();
        long j2 = this.f4981i;
        this.f4981i = nanoTime2;
        float f7 = this.f4979g;
        double d3 = (double) (nanoTime2 - j2);
        Double.isNaN(d3);
        float f8 = f7 + (((float) (d3 * 1.0E-6d)) * this.f4980h);
        this.f4979g = f8;
        if (f8 >= 1.0f) {
            this.f4979g = 1.0f;
            f8 = 1.0f;
            f = 1.0f;
        } else {
            f = f8;
        }
        Interpolator interpolator2 = this.f4977e;
        if (interpolator2 == null) {
            f2 = f;
        } else {
            f2 = interpolator2.getInterpolation(f8);
        }
        C1733r rVar2 = this.f4973a;
        boolean d4 = rVar2.mo4809d(rVar2.f5139b, f2, nanoTime2, this.f4975c);
        if (this.f4979g >= 1.0f) {
            int i3 = this.f4984l;
            if (i3 != -1) {
                this.f4973a.f5139b.setTag(i3, Long.valueOf(System.nanoTime()));
            }
            int i4 = this.f4985m;
            if (i4 != -1) {
                this.f4973a.f5139b.setTag(i4, (Object) null);
            }
            if (!this.f4983k) {
                this.f4976d.f5012f.add(this);
            }
        }
        if (this.f4979g < 1.0f || d4) {
            this.f4976d.f5007a.invalidate();
        }
    }
}
