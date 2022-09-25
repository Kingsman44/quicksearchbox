package com.google.ads.interactivemedia.p367v3.internal;

import java.net.InetAddress;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajw */
/* compiled from: PG */
final class ajw extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() != 9) {
            return InetAddress.getByName(alb.mo14829g());
        }
        alb.mo14831i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        ald.mo14855k(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
