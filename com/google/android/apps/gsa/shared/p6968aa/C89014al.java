package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91005e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.shared.aa.al */
/* compiled from: PG */
public final class C89014al {

    /* renamed from: c */
    private static final C58528ij f241215c = C58528ij.m90015O("Accept".toLowerCase(Locale.US), "Accept-Charset".toLowerCase(Locale.US), "Accept-Encoding".toLowerCase(Locale.US), "Accept-Language".toLowerCase(Locale.US), "Accept-Ranges".toLowerCase(Locale.US), "Access-Control-Allow-Credentials".toLowerCase(Locale.US), "Access-Control-Allow-Headers".toLowerCase(Locale.US), "Access-Control-Allow-Methods".toLowerCase(Locale.US), "Access-Control-Allow-Origin".toLowerCase(Locale.US), "Access-Control-Expose-Headers".toLowerCase(Locale.US), "Access-Control-Max-Age".toLowerCase(Locale.US), "Access-Control-Request-Headers".toLowerCase(Locale.US), "Access-Control-Request-Method".toLowerCase(Locale.US), "Age".toLowerCase(Locale.US), "Allow".toLowerCase(Locale.US), "alt-svc", "alternate-protocol", "Cache-Control".toLowerCase(Locale.US), "Connection".toLowerCase(Locale.US), "Content-Disposition".toLowerCase(Locale.US), "Content-Encoding".toLowerCase(Locale.US), "Content-Language".toLowerCase(Locale.US), "Content-Length".toLowerCase(Locale.US), "Content-MD5".toLowerCase(Locale.US), "Content-Range".toLowerCase(Locale.US), "Content-Type".toLowerCase(Locale.US), "Date".toLowerCase(Locale.US), "DNT".toLowerCase(Locale.US), "ETag".toLowerCase(Locale.US), "Expect".toLowerCase(Locale.US), "Expires".toLowerCase(Locale.US), "Host".toLowerCase(Locale.US), "If-Match".toLowerCase(Locale.US), "If-Modified-Since".toLowerCase(Locale.US), "If-None-Match".toLowerCase(Locale.US), "If-Range".toLowerCase(Locale.US), "If-Unmodified-Since".toLowerCase(Locale.US), "Last-Event-ID".toLowerCase(Locale.US), "Last-Modified".toLowerCase(Locale.US), "Max-Forwards".toLowerCase(Locale.US), "Origin".toLowerCase(Locale.US), "P3P".toLowerCase(Locale.US), "Pragma".toLowerCase(Locale.US), "Proxy-Authenticate".toLowerCase(Locale.US), "Range".toLowerCase(Locale.US), "Retry-After".toLowerCase(Locale.US), "save-data", "Server".toLowerCase(Locale.US), "status", "TE".toLowerCase(Locale.US), "Trailer".toLowerCase(Locale.US), "Transfer-Encoding".toLowerCase(Locale.US), "Upgrade".toLowerCase(Locale.US), "User-Agent".toLowerCase(Locale.US), "Vary".toLowerCase(Locale.US), "Via".toLowerCase(Locale.US), "Warning".toLowerCase(Locale.US), "WWW-Authenticate".toLowerCase(Locale.US), "X-Content-Type-Options".toLowerCase(Locale.US), "X-Device-Elapsed-Time".toLowerCase(Locale.US), "X-Device-Boot-Count".toLowerCase(Locale.US), "X-Do-Not-Track".toLowerCase(Locale.US), "X-Forwarded-Proto".toLowerCase(Locale.US), "X-Frame-Options".toLowerCase(Locale.US), "X-Powered-By".toLowerCase(Locale.US), "X-Requested-With".toLowerCase(Locale.US), "X-XSS-Protection".toLowerCase(Locale.US));

    /* renamed from: d */
    private static final C58528ij f241216d = C58528ij.m90012L("Authorization".toLowerCase(Locale.US), "Cookie".toLowerCase(Locale.US), "Proxy-Authorization".toLowerCase(Locale.US));

    /* renamed from: e */
    private static final C58528ij f241217e = new C58759qy("X-Client-Data".toLowerCase(Locale.US));

    /* renamed from: a */
    public final String f241218a;

    /* renamed from: b */
    public final String f241219b;

    public C89014al(String str, String str2) {
        str.getClass();
        this.f241218a = str;
        str2.getClass();
        this.f241219b = str2;
    }

    /* renamed from: a */
    static void m144738a(C91005e eVar, List list) {
        eVar.mo85277b("{", new C90752i[0]);
        int min = Math.min(15, list.size());
        for (int i = 0; i < min; i++) {
            C89014al alVar = (C89014al) list.get(i);
            String lowerCase = alVar.f241218a.toLowerCase(Locale.US);
            if (((C58759qy) f241217e).f156534a.equals(lowerCase)) {
                eVar.mo85277b("%s: [length: %d]", C90752i.m148229c(alVar.f241218a), C90752i.m148230d(Integer.valueOf(alVar.f241219b.length())));
            } else if (f241215c.contains(lowerCase)) {
                eVar.mo85277b("%s: %s", C90752i.m148229c(alVar.f241218a), C90752i.m148229c(alVar.f241219b));
            } else if (!f241216d.contains(lowerCase)) {
                eVar.mo85277b("%s: %s", C90752i.m148229c(alVar.f241218a), C90752i.m148233g(alVar.f241219b));
            } else {
                eVar.mo85277b("%s: [length: %d]", C90752i.m148229c(alVar.f241218a), C90752i.m148230d(Integer.valueOf(alVar.f241219b.length())));
            }
            if (i < min - 1) {
                eVar.mo85277b("; ", new C90752i[0]);
            }
        }
        if (min < list.size()) {
            eVar.mo85277b("; (%d more)", C90752i.m148230d(Integer.valueOf(list.size() - min)));
        }
        eVar.mo85277b("}", new C90752i[0]);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C89014al) {
            C89014al alVar = (C89014al) obj;
            if (!this.f241218a.equals(alVar.f241218a) || !this.f241219b.equals(alVar.f241219b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f241218a.hashCode() ^ (this.f241219b.hashCode() * 1237);
    }

    public final String toString() {
        return String.format("HttpHeaderEntry(%s: %s)", new Object[]{this.f241218a, this.f241219b});
    }
}
