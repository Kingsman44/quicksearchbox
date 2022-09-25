package com.google.ads.interactivemedia.p367v3.internal;

import java.math.BigInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajq */
/* compiled from: PG */
final class ajq extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return new BigInteger(alb.mo14829g());
        } catch (NumberFormatException e) {
            throw new agq((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14854j((BigInteger) obj);
    }
}
