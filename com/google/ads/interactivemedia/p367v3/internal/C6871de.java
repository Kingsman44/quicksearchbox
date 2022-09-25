package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.de */
/* compiled from: PG */
public final class C6871de {

    /* renamed from: a */
    public static final C6871de f21845a = new C6871de(-9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: b */
    public final long f21846b;

    /* renamed from: c */
    public final float f21847c;

    /* renamed from: d */
    public final float f21848d;

    public C6871de(long j, float f, float f2) {
        this.f21846b = j;
        this.f21847c = f;
        this.f21848d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6871de)) {
            return false;
        }
        C6871de deVar = (C6871de) obj;
        return this.f21846b == deVar.f21846b && this.f21847c == deVar.f21847c && this.f21848d == deVar.f21848d;
    }

    public final int hashCode() {
        long j = this.f21846b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        float f = this.f21847c;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f21848d;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }
}
