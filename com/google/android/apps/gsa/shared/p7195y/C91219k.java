package com.google.android.apps.gsa.shared.p7195y;

/* renamed from: com.google.android.apps.gsa.shared.y.k */
/* compiled from: PG */
final class C91219k extends C91230v {

    /* renamed from: b */
    private final float f254608b = Float.MAX_VALUE;

    /* renamed from: c */
    private final long f254609c = Long.MAX_VALUE;

    /* renamed from: d */
    private final boolean f254610d = true;

    public C91219k(float f, long j, boolean z) {
    }

    /* renamed from: a */
    public final float mo85493a() {
        return Float.MAX_VALUE;
    }

    /* renamed from: b */
    public final long mo85494b() {
        return Long.MAX_VALUE;
    }

    /* renamed from: c */
    public final boolean mo85495c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C91230v) {
            C91230v vVar = (C91230v) obj;
            return Float.floatToIntBits(Float.MAX_VALUE) == Float.floatToIntBits(vVar.mo85493a()) && vVar.mo85494b() == Long.MAX_VALUE && vVar.mo85495c();
        }
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(Float.MAX_VALUE) ^ 1000003) * 1000003) ^ ((int) 9223372034707292160L)) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "DownsampleParameters{maxTargetScalingFactor=3.4028235E38, maxPixels=9223372036854775807, allowUpscale=true}";
    }
}
