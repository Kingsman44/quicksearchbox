package com.google.android.apps.search.googleapp.p10369o;

import android.net.Uri;
import com.google.common.base.C58890d;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69762k;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.googleapp.o.c */
/* compiled from: PG */
public final class C136832c {

    /* renamed from: a */
    public static final /* synthetic */ int f372447a = 0;

    /* renamed from: b */
    private static final List f372448b = C69540x.m100947e("/search", "/m/search", "/webhp", "/s");

    /* renamed from: c */
    private static final String[] f372449c = {"url", "q"};

    /* renamed from: d */
    private final String f372450d;

    /* renamed from: e */
    private final C65603f f372451e;

    /* renamed from: f */
    private final C65603f f372452f;

    /* renamed from: g */
    private final Optional f372453g;

    public C136832c(String str, C65603f fVar, C65603f fVar2, Optional optional) {
        C69664n.m101061g(optional, "debugPropertyLookupOptional");
        this.f372450d = str;
        this.f372451e = fVar;
        this.f372452f = fVar2;
        this.f372453g = optional;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0074  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.apps.search.googleapp.p10369o.C136830a m222514l(android.net.Uri r7) {
        /*
            r6 = this;
            boolean r0 = r6.m222516n(r7)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r7.getAuthority()
            if (r0 == 0) goto L_0x0124
            java.lang.String r0 = com.google.common.base.C58809a.m90792a(r0)
            java.lang.String r2 = r6.m222515m()
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "www.google.com"
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "google.com"
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "www.google.com.hk"
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r2 != 0) goto L_0x009d
            java.lang.String r2 = "google.com.hk"
            boolean r2 = p5462h.p5473f.p5475b.C69664n.m101066l(r0, r2)
            if (r2 == 0) goto L_0x003d
            goto L_0x009d
        L_0x003d:
            java.lang.String r7 = ".google.com"
            boolean r2 = p5462h.p5483m.C69764m.m101230i(r0, r7)
            if (r2 == 0) goto L_0x004a
            java.lang.String r7 = p5462h.p5483m.C69764m.m101199s(r0, r7)
            goto L_0x0056
        L_0x004a:
            java.lang.String r7 = ".google.com.hk"
            boolean r2 = p5462h.p5483m.C69764m.m101230i(r0, r7)
            if (r2 == 0) goto L_0x009c
            java.lang.String r7 = p5462h.p5483m.C69764m.m101199s(r0, r7)
        L_0x0056:
            com.google.protos.m.a.f r0 = r6.f372451e
            com.google.protobuf.cq r0 = r0.f178307a
            java.lang.String r2 = "searchSubdomainDenylist.elementList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x006a
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x006a
            goto L_0x0091
        L_0x006a:
            java.util.Iterator r0 = r0.iterator()
        L_0x006e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0091
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r7, r2)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = "."
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r3.concat(r2)
            boolean r2 = p5462h.p5483m.C69764m.m101230i(r7, r2)
            if (r2 == 0) goto L_0x006e
            goto L_0x009c
        L_0x0091:
            com.google.android.apps.search.googleapp.o.a r1 = new com.google.android.apps.search.googleapp.o.a
            java.lang.String r0 = "www."
            java.lang.String r7 = p5462h.p5483m.C69764m.m101198r(r7, r0)
            r1.<init>(r7)
        L_0x009c:
            return r1
        L_0x009d:
            com.google.protos.m.a.f r0 = r6.f372452f
            com.google.protobuf.cq r0 = r0.f178307a
            java.lang.String r2 = "searchPathSegmentsDenylist.elementList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x00b1
            goto L_0x011e
        L_0x00b1:
            java.util.Iterator r0 = r0.iterator()
        L_0x00b5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x011e
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "deniedPathSegments"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            java.lang.String r5 = "/"
            r3[r4] = r5
            java.util.List r2 = p5462h.p5483m.C69764m.m101188E(r2, r3)
            java.lang.Iterable r2 = p5462h.p5463a.C69540x.m100855y(r2)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x00e4
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00e4
            goto L_0x0124
        L_0x00e4:
            java.util.Iterator r2 = r2.iterator()
        L_0x00e8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0124
            java.lang.Object r3 = r2.next()
            h.a.ap r3 = (p5462h.p5463a.C69499ap) r3
            int r4 = r3.f185921a
            java.lang.Object r3 = r3.f185922b
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r5 = r7.getPathSegments()
            int r5 = r5.size()
            if (r5 <= r4) goto L_0x00b5
            java.util.List r5 = r7.getPathSegments()
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r5 = "pathSegments.get(index)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = com.google.common.base.C58809a.m90792a(r4)
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r3)
            if (r3 == 0) goto L_0x00b5
            goto L_0x00e8
        L_0x011e:
            com.google.android.apps.search.googleapp.o.a r7 = new com.google.android.apps.search.googleapp.o.a
            r7.<init>(r1)
            r1 = r7
        L_0x0124:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.p10369o.C136832c.m222514l(android.net.Uri):com.google.android.apps.search.googleapp.o.a");
    }

    /* renamed from: m */
    private final String m222515m() {
        Optional flatMap = this.f372453g.flatMap(C136831b.f372446a);
        String str = this.f372450d;
        if (true == C69764m.m101229h(str)) {
            str = null;
        }
        String str2 = (String) flatMap.orElse(str);
        if (str2 != null) {
            return C58890d.m90988c(str2);
        }
        return null;
    }

    /* renamed from: n */
    private final boolean m222516n(Uri uri) {
        String authority;
        String authority2;
        if (m222517o(uri.getScheme())) {
            return true;
        }
        if (((m222515m() == null || !C69664n.m101066l(uri.getAuthority(), m222515m())) && ((authority2 = uri.getAuthority()) == null || C69764m.m101187D(authority2, ':') != -1)) || (authority = uri.getAuthority()) == null) {
            return false;
        }
        return (C69764m.m101187D(authority, '\\') == -1 && C69764m.m101187D(authority, '@') == -1) ? false : true;
    }

    /* renamed from: o */
    private static final boolean m222517o(String str) {
        return str != null && !C58890d.m90990e(str, "https") && !C58890d.m90990e(str, "http");
    }

    /* renamed from: a */
    public final Uri mo113395a(Uri uri) {
        String str;
        C69664n.m101061g(uri, "uri");
        if (mo113399e(uri) && C69664n.m101066l(uri.getPath(), "/url")) {
            String[] strArr = f372449c;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= 2) {
                    break;
                }
                str = uri.getQueryParameter(strArr[i]);
                if (str != null && str.length() != 0) {
                    break;
                }
                i++;
            }
        }
        str = null;
        if (str == null) {
            return null;
        }
        if (C69764m.m101234m(str, "/")) {
            str = C69764m.m101231j(str, ":", "%3A");
        }
        Uri parse = Uri.parse(str);
        C69664n.m101060f(parse, "parse(sanitized)");
        if (!parse.isRelative()) {
            return parse;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        String scheme = uri.getScheme();
        C69664n.m101058d(scheme);
        Uri build = buildUpon.scheme(scheme).encodedAuthority(uri.getEncodedAuthority()).build();
        C69664n.m101060f(build, "{\n      // scheme should…y)\n        .build()\n    }");
        return build;
    }

    /* renamed from: b */
    public final String mo113396b(Uri uri) {
        C69664n.m101061g(uri, "uri");
        String queryParameter = uri.getQueryParameter("q");
        if (!mo113403i(uri) || queryParameter == null || C69764m.m101229h(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    /* renamed from: c */
    public final String mo113397c(Uri uri) {
        C69664n.m101061g(uri, "uri");
        C136830a l = m222514l(uri);
        if (l != null) {
            return l.f372445a;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* renamed from: d */
    public final boolean mo113398d(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return m222514l(uri) != null;
    }

    /* renamed from: e */
    public final boolean mo113399e(Uri uri) {
        C69664n.m101061g(uri, "uri");
        C136830a l = m222514l(uri);
        return l != null && l.f372445a == null;
    }

    /* renamed from: f */
    public final boolean mo113400f(Uri uri) {
        String authority;
        C69664n.m101061g(uri, "uri");
        if (m222516n(uri) || (authority = uri.getAuthority()) == null) {
            return false;
        }
        C69762k kVar = new C69762k("(?:www\\.|)googleadservices.com");
        String c = C58890d.m90988c(authority);
        C69664n.m101060f(c, "toLowerCase(it)");
        return kVar.mo61434b(c);
    }

    /* renamed from: g */
    public final boolean mo113401g(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return mo113402h(uri) || mo113400f(uri);
    }

    /* renamed from: h */
    public final boolean mo113402h(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return mo113399e(uri) && "/aclk".equals(uri.getPath());
    }

    /* renamed from: i */
    public final boolean mo113403i(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return !m222516n(uri) && mo113399e(uri) && C69540x.m100848ad(f372448b, uri.getPath());
    }

    /* renamed from: j */
    public final boolean mo113404j(Uri uri) {
        C69664n.m101061g(uri, "uri");
        return mo113396b(uri) != null;
    }

    /* renamed from: k */
    public final Uri.Builder mo113405k() {
        String str = "https";
        if (!m222517o(str)) {
            Uri.Builder builder = new Uri.Builder();
            String m = m222515m();
            String str2 = null;
            if (m != null && true == C69764m.m101234m(m, "localhost:")) {
                str2 = "http";
            }
            if (str2 != null) {
                str = str2;
            }
            Uri.Builder scheme = builder.scheme(str);
            String m2 = m222515m();
            if (m2 == null) {
                m2 = "www.google.com";
            }
            Uri.Builder encodedAuthority = scheme.encodedAuthority(m2);
            C69664n.m101060f(encodedAuthority, "Builder()\n      .scheme(…ide ?: WWW_GOOGLE_DOMAIN)");
            return encodedAuthority;
        }
        throw new IllegalStateException("Check failed.");
    }
}
