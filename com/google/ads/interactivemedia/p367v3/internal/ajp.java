package com.google.ads.interactivemedia.p367v3.internal;

import java.math.BigDecimal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajp */
/* compiled from: PG */
final class ajp extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            return new BigDecimal(alb.mo14829g());
        } catch (NumberFormatException e) {
            throw new agq((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14854j((BigDecimal) obj);
    }
}
