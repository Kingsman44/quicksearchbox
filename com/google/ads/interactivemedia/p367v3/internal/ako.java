package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ako */
/* compiled from: PG */
final class ako extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return Byte.valueOf((byte) alb.mo14834l());
        } catch (NumberFormatException e) {
            throw new agq((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14854j((Number) obj);
    }
}
