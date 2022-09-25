package com.google.common.p4535g;

/* renamed from: com.google.common.g.o */
/* compiled from: PG */
public final class C59221o {

    /* renamed from: a */
    public final double f157308a;

    public C59221o(double d) {
        this.f157308a = d;
    }

    /* renamed from: a */
    public final int mo56639a(double d) {
        if (d <= C59203do.f157270a) {
            return 30;
        }
        return Math.max(0, Math.min(30, Math.getExponent(this.f157308a / d)));
    }
}
