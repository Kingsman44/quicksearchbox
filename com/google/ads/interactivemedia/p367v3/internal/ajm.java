package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajm */
/* compiled from: PG */
final class ajm extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        int p = alb.mo14838p();
        int i = p - 1;
        if (p == 0) {
            throw null;
        } else if (i == 5 || i == 6) {
            return new ahu(alb.mo14829g());
        } else {
            if (i == 8) {
                alb.mo14831i();
                return null;
            }
            throw new agq("Expecting number, got: ".concat(alc.m18902a(p)));
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14854j((Number) obj);
    }
}
