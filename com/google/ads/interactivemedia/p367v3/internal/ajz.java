package com.google.ads.interactivemedia.p367v3.internal;

import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajz */
/* compiled from: PG */
final class ajz extends agt {

    /* renamed from: a */
    final /* synthetic */ agt f20771a;

    public ajz(agt agt) {
        this.f20771a = agt;
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        Date date = (Date) this.f20771a.read(alb);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        this.f20771a.write(ald, (Timestamp) obj);
    }
}
