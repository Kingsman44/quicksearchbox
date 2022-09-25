package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.dv */
/* compiled from: PG */
public final class C6888dv {

    /* renamed from: a */
    public static final C6888dv f21944a = new C6888dv(1.0f, 1.0f);

    /* renamed from: b */
    public final float f21945b;

    /* renamed from: c */
    public final float f21946c;

    /* renamed from: d */
    private final int f21947d;

    public C6888dv(float f, float f2) {
        boolean z = true;
        ary.m19462o(f > 0.0f);
        ary.m19462o(f2 <= 0.0f ? false : z);
        this.f21945b = f;
        this.f21946c = f2;
        this.f21947d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo15739a(long j) {
        return j * ((long) this.f21947d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6888dv dvVar = (C6888dv) obj;
            return this.f21945b == dvVar.f21945b && this.f21946c == dvVar.f21946c;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f21945b) + 527) * 31) + Float.floatToRawIntBits(this.f21946c);
    }

    public final String toString() {
        return aeu.m18487E("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f21945b), Float.valueOf(this.f21946c));
    }
}
