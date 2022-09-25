package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akc */
/* compiled from: PG */
final class akc extends agt {
    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        String str = null;
        if (alb.mo14838p() == 9) {
            alb.mo14831i();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(alb.mo14829g(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        return (nextToken2 == null && str == null) ? new Locale(nextToken) : str == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, str);
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Locale locale = (Locale) obj;
        ald.mo14855k(locale == null ? null : locale.toString());
    }
}
