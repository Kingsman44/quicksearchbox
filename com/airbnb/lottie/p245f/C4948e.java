package com.airbnb.lottie.p245f;

import android.animation.Animator;
import android.view.Choreographer;
import com.airbnb.lottie.C4838b;
import com.airbnb.lottie.C4964k;

/* renamed from: com.airbnb.lottie.f.e */
/* compiled from: PG */
public final class C4948e extends C4944a implements Choreographer.FrameCallback {

    /* renamed from: b */
    public float f15712b = 1.0f;

    /* renamed from: c */
    public long f15713c = 0;

    /* renamed from: d */
    public float f15714d = 0.0f;

    /* renamed from: e */
    public int f15715e = 0;

    /* renamed from: f */
    public float f15716f = -2.14748365E9f;

    /* renamed from: g */
    public float f15717g = 2.14748365E9f;

    /* renamed from: h */
    public C4964k f15718h;

    /* renamed from: i */
    public boolean f15719i = false;

    /* renamed from: j */
    private boolean f15720j = false;

    public final void cancel() {
        mo9860a();
        mo9883i(true);
    }

    /* renamed from: d */
    public final float mo9874d() {
        C4964k kVar = this.f15718h;
        if (kVar == null) {
            return 0.0f;
        }
        float f = this.f15714d;
        float f2 = kVar.f15760i;
        return (f - f2) / (kVar.f15761j - f2);
    }

    public final void doFrame(long j) {
        float f;
        mo9882h();
        C4964k kVar = this.f15718h;
        if (kVar != null && this.f15719i) {
            long j2 = this.f15713c;
            long j3 = 0;
            if (j2 != 0) {
                j3 = j - j2;
            }
            float abs = ((float) j3) / ((1.0E9f / kVar.f15762k) / Math.abs(this.f15712b));
            float f2 = this.f15714d;
            if (mo9888m()) {
                abs = -abs;
            }
            float f3 = f2 + abs;
            this.f15714d = f3;
            boolean i = C4949f.m13715i(f3, mo9877f(), mo9876e());
            this.f15714d = C4949f.m13708b(this.f15714d, mo9877f(), mo9876e());
            this.f15713c = j;
            mo9864c();
            if (!i) {
                if (getRepeatCount() == -1 || this.f15715e < getRepeatCount()) {
                    for (Animator.AnimatorListener onAnimationRepeat : this.f15708a) {
                        onAnimationRepeat.onAnimationRepeat(this);
                    }
                    this.f15715e++;
                    if (getRepeatMode() == 2) {
                        this.f15720j = !this.f15720j;
                        mo9885j();
                    } else {
                        this.f15714d = mo9888m() ? mo9876e() : mo9877f();
                    }
                    this.f15713c = j;
                } else {
                    if (this.f15712b < 0.0f) {
                        f = mo9877f();
                    } else {
                        f = mo9876e();
                    }
                    this.f15714d = f;
                    mo9883i(true);
                    mo9863b(mo9888m());
                }
            }
            if (this.f15718h != null) {
                float f4 = this.f15714d;
                float f5 = this.f15716f;
                if (f4 < f5 || f4 > this.f15717g) {
                    throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(f5), Float.valueOf(this.f15717g), Float.valueOf(f4)}));
                }
            }
            C4838b.m13493a();
        }
    }

    /* renamed from: e */
    public final float mo9876e() {
        C4964k kVar = this.f15718h;
        if (kVar == null) {
            return 0.0f;
        }
        float f = this.f15717g;
        return f == 2.14748365E9f ? kVar.f15761j : f;
    }

    /* renamed from: f */
    public final float mo9877f() {
        C4964k kVar = this.f15718h;
        if (kVar == null) {
            return 0.0f;
        }
        float f = this.f15716f;
        return f == -2.14748365E9f ? kVar.f15760i : f;
    }

    /* renamed from: g */
    public final void mo9878g() {
        mo9883i(true);
        mo9863b(mo9888m());
    }

    public final float getAnimatedFraction() {
        float f;
        float f2;
        if (this.f15718h == null) {
            return 0.0f;
        }
        if (mo9888m()) {
            f = mo9876e();
            f2 = this.f15714d;
        } else {
            f = this.f15714d;
            f2 = mo9877f();
        }
        return (f - f2) / (mo9876e() - mo9877f());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo9874d());
    }

    public final long getDuration() {
        C4964k kVar = this.f15718h;
        if (kVar == null) {
            return 0;
        }
        return (long) kVar.mo9905a();
    }

    /* renamed from: h */
    public final void mo9882h() {
        if (this.f15719i) {
            mo9883i(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: i */
    public final void mo9883i(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f15719i = false;
        }
    }

    public final boolean isRunning() {
        return this.f15719i;
    }

    /* renamed from: j */
    public final void mo9885j() {
        this.f15712b = -this.f15712b;
    }

    /* renamed from: k */
    public final void mo9886k(float f) {
        if (this.f15714d != f) {
            this.f15714d = C4949f.m13708b(f, mo9877f(), mo9876e());
            this.f15713c = 0;
            mo9864c();
        }
    }

    /* renamed from: l */
    public final void mo9887l(float f, float f2) {
        float f3;
        if (f <= f2) {
            C4964k kVar = this.f15718h;
            if (kVar == null) {
                f3 = -3.4028235E38f;
            } else {
                f3 = kVar.f15760i;
            }
            float f4 = kVar == null ? Float.MAX_VALUE : kVar.f15761j;
            float b = C4949f.m13708b(f, f3, f4);
            float b2 = C4949f.m13708b(f2, f3, f4);
            if (b != this.f15716f || b2 != this.f15717g) {
                this.f15716f = b;
                this.f15717g = b2;
                mo9886k((float) ((int) C4949f.m13708b(this.f15714d, b, b2)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
    }

    /* renamed from: m */
    public final boolean mo9888m() {
        return this.f15712b < 0.0f;
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f15720j) {
            this.f15720j = false;
            mo9885j();
        }
    }
}
