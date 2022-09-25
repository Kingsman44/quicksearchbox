package com.google.ads.interactivemedia.p367v3.internal;

import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajv */
/* compiled from: PG */
final class ajv extends agt {
    /* renamed from: a */
    public static final URI m18840a(alb alb) {
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        try {
            String g = alb.mo14829g();
            if ("null".equals(g)) {
                return null;
            }
            return new URI(g);
        } catch (URISyntaxException e) {
            throw new agk((Throwable) e);
        }
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        return m18840a(alb);
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        URI uri = (URI) obj;
        ald.mo14855k(uri == null ? null : uri.toASCIIString());
    }
}
