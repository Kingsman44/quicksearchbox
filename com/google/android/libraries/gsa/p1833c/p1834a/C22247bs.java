package com.google.android.libraries.gsa.p1833c.p1834a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89046bq;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.c.a.bs */
/* compiled from: PG */
final class C22247bs implements C22244bp {

    /* renamed from: a */
    private static final C59071e f61442a = C59071e.m91332i("com.google.android.libraries.gsa.c.a.bs");

    /* renamed from: b */
    private final C89020ar f61443b;

    /* renamed from: c */
    private final C58833ax f61444c;

    /* renamed from: d */
    private final C89046bq f61445d;

    /* renamed from: e */
    private final C22245bq f61446e;

    /* renamed from: f */
    private int f61447f;

    /* renamed from: g */
    private URL f61448g;

    /* renamed from: h */
    private C89068x f61449h;

    /* renamed from: i */
    private final List f61450i = new ArrayList();

    public C22247bs(C89020ar arVar, C89068x xVar, int i, C58833ax axVar, C89046bq bqVar, C22245bq bqVar2) {
        this.f61443b = arVar;
        this.f61447f = i;
        this.f61444c = axVar;
        this.f61445d = bqVar;
        this.f61448g = arVar.f241257f;
        this.f61449h = xVar;
        this.f61446e = bqVar2;
    }

    /* renamed from: c */
    private static URL m41604c(C89046bq bqVar, int i, URL url, C89019aq aqVar, boolean z) {
        String url2 = url.toString();
        String a = bqVar.mo79629a(i, url2);
        try {
            URL url3 = new URL(a);
            aqVar.f241236b = url3;
            for (Map.Entry entry : bqVar.mo79630b(i, url2).entrySet()) {
                aqVar.mo82993e((String) entry.getKey(), (String) entry.getValue());
            }
            return url3;
        } catch (MalformedURLException e) {
            MalformedURLException malformedURLException = e;
            if (z) {
                ((C59052c) ((C59052c) ((C59052c) f61442a.mo56226d()).mo56382g(malformedURLException)).mo56372aa(48507)).mo56354G("Bad rewritten URL: '%s' to '%s'", url2, a);
                int i2 = C90755l.f253831a;
            } else {
                ((C59052c) ((C59052c) ((C59052c) f61442a.mo56226d()).mo56382g(malformedURLException)).mo56372aa(48506)).mo56386p("Bad rewritten URL");
                int i3 = C90755l.f253831a;
            }
            return url;
        }
    }

    /* renamed from: d */
    private static void m41605d(C89021as asVar) {
        try {
            asVar.mo82997b().mo27475d();
        } catch (C89013ak | C90457d unused) {
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx apply(C89021as asVar) {
        try {
            C89022at g = asVar.mo82999g();
            if (!g.mo83002d() || !this.f61443b.f241262k) {
                if (!this.f61450i.isEmpty()) {
                    asVar = asVar.mo82998c(this.f61450i);
                }
                return C60856cj.m92900i(asVar);
            } else if (this.f61447f > 0) {
                URL url = new URL(this.f61448g, g.mo83000a("Location", BuildConfig.FLAVOR));
                if (!this.f61443b.f241263l && this.f61448g.getProtocol().equals("https")) {
                    if (url.getProtocol().equals("http")) {
                        throw new C90457d(C89885b.HTTP_INSECURE_REDIRECT_FROM_HTTPS_VALUE);
                    }
                }
                if (this.f61449h.mo27477f()) {
                    this.f61447f--;
                    this.f61448g = url;
                    this.f61450i.add(url);
                    this.f61449h.mo27475d();
                    this.f61449h = this.f61449h.mo27476e();
                    m41605d(asVar);
                    return mo27489b();
                }
                throw new C90457d(C89885b.HTTP_UPLOAD_SOURCE_NOT_CLONEABLE_VALUE);
            } else {
                throw new C90457d(C89885b.HTTP_TOO_MANY_REDIRECTS_VALUE);
            }
        } catch (MalformedURLException e) {
            throw new C90457d((Throwable) e, (int) C89885b.HTTP_MALFORMED_REDIRECT_URL_VALUE);
        } catch (C90457d e2) {
            m41605d(asVar);
            return C60856cj.m92900i(new C89057m(e2));
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27489b() {
        C89019aq aqVar;
        C89020ar arVar = this.f61443b;
        aqVar = new C89019aq(arVar, arVar.f241260i);
        URL url = this.f61448g;
        aqVar.f241236b = url;
        C89020ar arVar2 = this.f61443b;
        boolean z = arVar2.f241266o;
        int i = arVar2.f241267p;
        if (z && this.f61444c.mo56113h()) {
            url = m41604c((C89046bq) this.f61444c.mo56107c(), i, url, aqVar, false);
        }
        C89046bq bqVar = this.f61445d;
        if (bqVar != null) {
            url = m41604c(bqVar, i, url, aqVar, true);
        }
        this.f61448g = url;
        aqVar.f241239e = false;
        int i2 = this.f61443b.f241267p;
        return C60922j.m93045h(this.f61446e.mo27491a(aqVar.mo82989a(), this.f61449h).mo27489b(), this, C60826bg.f164896a);
    }
}
