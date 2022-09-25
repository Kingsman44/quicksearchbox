package com.google.android.apps.gsa.shared.util.p7187ui;

import android.view.animation.Interpolator;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.util.ui.f */
/* compiled from: PG */
public final class C91107f implements Interpolator {

    /* renamed from: a */
    public static final Interpolator f254405a = m148858a(0.4f, 0.0f);

    /* renamed from: b */
    public static final Interpolator f254406b = m148858a(0.0f, 0.8f);

    /* renamed from: c */
    public static final Interpolator f254407c = m148858a(0.8f, 0.0f);

    /* renamed from: d */
    public static final Interpolator f254408d = m148858a(0.4f, 0.8f);

    /* renamed from: e */
    public static final Interpolator f254409e = m148859b(0.20678f, 0.58101f, 0.50935f, 1.0f);

    /* renamed from: f */
    public static final Interpolator f254410f = m148859b(0.56576f, 0.0f, 0.73142f, 0.48613f);

    /* renamed from: g */
    public static final Interpolator f254411g = m148859b(0.15054f, 0.48532f, 0.36576f, 1.0f);

    /* renamed from: h */
    public final float[] f254412h = new float[25];

    /* renamed from: i */
    private final C91106e f254413i;

    /* renamed from: j */
    private final C91106e f254414j;

    static {
        m148859b(0.55468f, 0.0f, 0.53248f, 0.61984f);
    }

    public C91107f(float f, float f2, float f3, float f4) {
        this.f254413i = new C91106e((double) f, (double) f3);
        this.f254414j = new C91106e((double) f2, (double) f4);
        for (int i = 0; i < 25; i++) {
            this.f254412h[i] = m148860c(((float) i) / 24.0f, 10, false);
        }
    }

    /* renamed from: a */
    public static Interpolator m148858a(float f, float f2) {
        return m148859b(f, 0.0f, 1.0f - f2, 1.0f);
    }

    /* renamed from: b */
    public static Interpolator m148859b(float f, float f2, float f3, float f4) {
        try {
            Interpolator interpolator = (Interpolator) Class.forName("android.view.animation.PathInterpolator").getConstructor(new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}).newInstance(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)});
            return interpolator != null ? interpolator : new C91107f(f, f2, f3, f4);
        } catch (Throwable unused) {
            return new C91107f(f, f2, f3, f4);
        }
    }

    /* renamed from: c */
    private final float m148860c(float f, int i, boolean z) {
        int i2 = (int) (24.0f * f);
        float f2 = z ? this.f254412h[i2] : f;
        float f3 = 1.0f;
        if (z && i2 < 24) {
            f3 = this.f254412h[i2 + 1];
        }
        for (int i3 = 0; i3 < i; i3++) {
            double d = (double) f2;
            float a = ((float) this.f254413i.mo85373a(d)) - f;
            if (Math.abs(a) <= 1.0E-4f) {
                return f2;
            }
            C91106e eVar = this.f254413i;
            float b = (float) C91106e.m148856b(d, eVar.f254403a, eVar.f254404b);
            f2 = b != 0.0f ? f2 - (a / b) : f2 + ((f3 - f2) / 2.0f);
        }
        return f2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C91107f)) {
            return false;
        }
        C91107f fVar = (C91107f) obj;
        return this.f254413i.equals(fVar.f254413i) && this.f254414j.equals(fVar.f254414j);
    }

    public final float getInterpolation(float f) {
        return (float) this.f254414j.mo85373a((double) m148860c(f, 3, true));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f254413i, this.f254414j});
    }
}
