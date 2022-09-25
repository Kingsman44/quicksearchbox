package com.google.android.apps.search.googleapp.search.srp.p10437g;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.g.b */
/* compiled from: PG */
public final class C137853b {

    /* renamed from: a */
    private final C136832c f375067a;

    public C137853b(C136832c cVar) {
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        this.f375067a = cVar;
    }

    /* renamed from: a */
    public final boolean mo114010a(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return this.f375067a.mo113403i(uri) && C69664n.m101066l("lnms", uri.getQueryParameter("source"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r2.getFragment();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo114011b(android.net.Uri r2) {
        /*
            r1 = this;
            java.lang.String r0 = "uri"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            com.google.android.apps.search.googleapp.o.c r0 = r1.f375067a
            boolean r0 = r0.mo113403i(r2)
            if (r0 == 0) goto L_0x0025
            java.lang.String r2 = r2.getFragment()
            if (r2 == 0) goto L_0x0025
            java.lang.String r0 = "\\bisRetry\\b"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            if (r2 == 0) goto L_0x0025
            r2 = 1
            return r2
        L_0x0025:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10437g.C137853b.mo114011b(android.net.Uri):boolean");
    }
}
