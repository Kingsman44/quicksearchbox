package com.google.android.libraries.search.p2476a.p2483e;

import android.net.Uri;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58869cf;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.a.e.l */
/* compiled from: PG */
public final class C32230l implements C32221c {

    /* renamed from: a */
    public static final /* synthetic */ int f86442a = 0;

    /* renamed from: b */
    private static final Pattern f86443b = Pattern.compile("^(?i:Set-Cookie):\\s*NID=([^\r\n;]*)", 8);

    /* renamed from: c */
    private final C42876ab f86444c;

    /* renamed from: d */
    private final Optional f86445d;

    public C32230l(C42876ab abVar, Optional optional) {
        this.f86444c = abVar;
        this.f86445d = optional;
    }

    /* renamed from: a */
    public final C60870cx mo38001a(String str) {
        C60870cx e = mo38005e();
        C32222d dVar = new C32222d(str);
        return C60922j.m93044g(e, C47810es.m84963c(dVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo38002b() {
        if (this.f86445d.isPresent()) {
            ((C32220b) this.f86445d.get()).mo38000a((String) null);
        }
        return this.f86444c.mo46039a(C32229k.f86441a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo38003c() {
        C60870cx e = mo38005e();
        C32228j jVar = C32228j.f86440a;
        return C60922j.m93044g(e, C47810es.m84963c(jVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo38004d(Uri uri) {
        C60870cx cxVar;
        String host = uri.getHost();
        if (host == null || (!host.equals("google.com") && !host.endsWith(".google.com"))) {
            cxVar = C60856cj.m92900i(C58485gu.m89845m());
        } else {
            C60870cx c = mo38003c();
            C32224f fVar = C32224f.f86437a;
            cxVar = C60922j.m93044g(c, C47810es.m84963c(fVar), C60826bg.f164896a);
        }
        C32226h hVar = C32226h.f86439a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(hVar), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo38005e() {
        C60870cx d = this.f86444c.mo46042d();
        C32227i iVar = new C32227i();
        return C60922j.m93044g(d, C47810es.m84963c(iVar), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo38006f(String str) {
        if (this.f86445d.isPresent()) {
            ((C32220b) this.f86445d.get()).mo38000a("NID=".concat(String.valueOf(str)));
        }
        return this.f86444c.mo46039a(new C32225g(str), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo38007g(String str) {
        for (String str2 : C58869cf.m90938d("; ").mo56153g(str)) {
            if (str2.startsWith("NID=")) {
                return mo38006f(str2.substring(4));
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: h */
    public final C60870cx mo38008h(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("NID=")) {
                int indexOf = str.indexOf(59, 4);
                if (indexOf == -1) {
                    indexOf = str.length();
                }
                return mo38006f(str.substring(4, indexOf));
            }
        }
        return C60866ct.f164955a;
    }

    /* renamed from: i */
    public final void mo38009i(String str) {
        String group;
        Matcher matcher = f86443b.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            C60870cx cxVar = C60866ct.f164955a;
        } else {
            mo38006f(group);
        }
    }
}
