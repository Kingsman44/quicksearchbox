package com.google.android.libraries.p10982ad;

/* renamed from: com.google.android.libraries.ad.m */
/* compiled from: PG */
final class C147449m extends C147451o {

    /* renamed from: d */
    private final float f398010d;

    /* renamed from: e */
    private final float f398011e;

    public C147449m(long j, float f, float f2, C147448l lVar) {
        super(j, f + (f2 / lVar.f398009a));
        this.f398010d = lVar.f398009a;
        this.f398011e = -f2;
    }

    /* renamed from: a */
    public final float mo124190a(long j) {
        long j2 = this.f398014a;
        double d = (double) this.f398011e;
        double exp = Math.exp((double) ((-this.f398010d) * ((float) (j - j2)) * 0.001f));
        Double.isNaN(d);
        double d2 = d * exp;
        double d3 = (double) this.f398010d;
        Double.isNaN(d3);
        return (float) (d2 / d3);
    }

    /* renamed from: b */
    public final float mo124191b(long j) {
        long j2 = this.f398014a;
        double d = (double) (-this.f398011e);
        double exp = Math.exp((double) ((-this.f398010d) * ((float) (j - j2)) * 0.001f));
        Double.isNaN(d);
        return (float) (d * exp);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo124192c(float f) {
        float f2 = this.f398015b;
        double d = (double) this.f398010d;
        Double.isNaN(d);
        return ((long) (((float) ((-Math.log((double) ((this.f398010d * (f - f2)) / this.f398011e))) / d)) / 0.001f)) + this.f398014a;
    }
}
