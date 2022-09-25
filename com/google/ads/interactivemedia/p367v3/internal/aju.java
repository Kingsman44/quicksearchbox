package com.google.ads.interactivemedia.p367v3.internal;

import java.net.URL;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aju */
/* compiled from: PG */
final class aju extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        String g = alb.mo14829g();
        if (!"null".equals(g)) {
            return new URL(g);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        URL url = (URL) obj;
        ald.mo14855k(url == null ? null : url.toExternalForm());
    }
}
