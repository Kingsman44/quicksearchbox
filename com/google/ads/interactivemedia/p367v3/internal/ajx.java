package com.google.ads.interactivemedia.p367v3.internal;

import java.util.UUID;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajx */
/* compiled from: PG */
final class ajx extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() != 9) {
            return UUID.fromString(alb.mo14829g());
        }
        alb.mo14831i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        UUID uuid = (UUID) obj;
        ald.mo14855k(uuid == null ? null : uuid.toString());
    }
}
