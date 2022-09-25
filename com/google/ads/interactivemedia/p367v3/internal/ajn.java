package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajn */
/* compiled from: PG */
final class ajn extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        String g = alb.mo14829g();
        if (g.length() == 1) {
            return Character.valueOf(g.charAt(0));
        }
        throw new agq("Expecting character, got: ".concat(String.valueOf(g)));
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Character ch = (Character) obj;
        ald.mo14855k(ch == null ? null : ch.toString());
    }
}
