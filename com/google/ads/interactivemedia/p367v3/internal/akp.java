package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akp */
/* compiled from: PG */
final class akp extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return Short.valueOf((short) alb.mo14834l());
        } catch (NumberFormatException e) {
            throw new agq((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14854j((Number) obj);
    }
}
