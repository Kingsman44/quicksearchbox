package com.google.android.apps.search.googleapp.p10539y.p10540a;

import android.net.Uri;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.y.a.a */
/* compiled from: PG */
public final class C139883a {
    /* renamed from: a */
    public static final String m227489a(Uri uri) {
        C69664n.m101061g(uri, "url");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return BuildConfig.FLAVOR;
        }
        if (!C69540x.m100947e("collections", "save").contains(pathSegments.get(0))) {
            return BuildConfig.FLAVOR;
        }
        Uri.Builder builder = new Uri.Builder();
        for (String appendPath : pathSegments.subList(1, pathSegments.size())) {
            builder.appendPath(appendPath);
        }
        String uri2 = builder.build().toString();
        C69664n.m101060f(uri2, "pathSuffixBuilder.build().toString()");
        return uri2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r2 = new android.net.Uri.Builder().appendPath("list").appendPath(r2).build().getPath();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m227490b(com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj r2) {
        /*
            java.lang.String r0 = "listDescriptor"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r0)
            java.lang.String r2 = r2.f153793a
            java.lang.String r0 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r0)
            int r0 = r2.length()
            if (r0 > 0) goto L_0x0013
            r2 = 0
        L_0x0013:
            if (r2 == 0) goto L_0x0030
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "list"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            android.net.Uri$Builder r2 = r0.appendPath(r2)
            android.net.Uri r2 = r2.build()
            java.lang.String r2 = r2.getPath()
            if (r2 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            return r2
        L_0x0030:
            java.lang.String r2 = ""
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a.m227490b(com.google.bv.f.a.a.aj):java.lang.String");
    }

    /* renamed from: c */
    public static final boolean m227491c(Uri uri, C136832c cVar) {
        C69664n.m101061g(uri, "uri");
        C69664n.m101061g(cVar, "googleUrlAnalyzer");
        List<String> pathSegments = uri.getPathSegments();
        C69664n.m101060f(pathSegments, "uri.pathSegments");
        String str = (String) C69540x.m100821C(pathSegments);
        if (!C69664n.m101066l(str, "save") && !C69664n.m101066l(str, "collections")) {
            return false;
        }
        return cVar.mo113399e(uri);
    }
}
