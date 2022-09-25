package com.google.ads.interactivemedia.p367v3.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akr */
/* compiled from: PG */
final class akr extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        try {
            return new AtomicInteger(alb.mo14834l());
        } catch (NumberFormatException e) {
            throw new agq((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        ald.mo14852h((long) ((AtomicInteger) obj).get());
    }
}
