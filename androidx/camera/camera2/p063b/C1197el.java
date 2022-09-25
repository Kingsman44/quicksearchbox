package androidx.camera.camera2.p063b;

import androidx.camera.core.C1555ee;

/* renamed from: androidx.camera.camera2.b.el */
/* compiled from: PG */
public final class C1197el implements C1555ee {

    /* renamed from: a */
    public float f3520a;

    /* renamed from: b */
    public final float f3521b;

    /* renamed from: c */
    public final float f3522c;

    /* renamed from: d */
    public float f3523d;

    public C1197el(float f, float f2) {
        this.f3521b = f;
        this.f3522c = f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4016a() {
        float f = this.f3521b;
        float f2 = 1.0f;
        if (f >= 1.0f) {
            float f3 = this.f3522c;
            if (f3 <= 1.0f) {
                this.f3520a = 1.0f;
                if (f != f3) {
                    if (f != 1.0f) {
                        if (f3 != 1.0f) {
                            float f4 = 1.0f / f3;
                            f2 = (1.0f - f4) / ((1.0f / f) - f4);
                        }
                    }
                    this.f3523d = f2;
                    return;
                }
                f2 = 0.0f;
                this.f3523d = f2;
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + this.f3522c + " , " + this.f3521b + "]");
    }
}
