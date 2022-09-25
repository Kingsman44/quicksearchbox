package com.google.android.libraries.gsa.p1833c.p1834a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89021as;
import com.google.android.apps.gsa.shared.p6968aa.C89022at;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89067w;
import com.google.android.apps.gsa.shared.p6968aa.C89068x;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.staticplugins.p7374ag.C93823d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.net.URL;

/* renamed from: com.google.android.libraries.gsa.c.a.m */
/* compiled from: PG */
final class C22261m implements C22244bp {

    /* renamed from: b */
    private static final C59071e f61501b = C59071e.m91332i("com.google.android.libraries.gsa.c.a.m");

    /* renamed from: a */
    public final C89020ar f61502a;

    /* renamed from: c */
    private final C68214a f61503c;

    /* renamed from: d */
    private final URL f61504d;

    /* renamed from: e */
    private final C58833ax f61505e;

    /* renamed from: f */
    private final C22266r f61506f;

    /* renamed from: g */
    private final C22871g f61507g;

    /* renamed from: h */
    private final C58833ax f61508h;

    /* renamed from: i */
    private final C22245bq f61509i;

    /* renamed from: j */
    private C89068x f61510j;

    /* renamed from: k */
    private boolean f61511k = false;

    public C22261m(C89020ar arVar, C89068x xVar, C68214a aVar, C58833ax axVar, C22266r rVar, C22871g gVar, C58833ax axVar2, C22245bq bqVar) {
        this.f61502a = arVar;
        this.f61510j = xVar;
        this.f61503c = aVar;
        this.f61505e = axVar;
        this.f61506f = rVar;
        this.f61507g = gVar;
        this.f61508h = axVar2;
        this.f61509i = bqVar;
        this.f61504d = arVar.f241257f;
    }

    /* renamed from: d */
    private final C60870cx m41625d(C89021as asVar) {
        ((C89067w) this.f61503c.mo27525b()).mo83051d();
        m41627f(asVar);
        return m41626e();
    }

    /* renamed from: e */
    private final synchronized C60870cx m41626e() {
        if (!this.f61510j.mo27477f()) {
            return C60856cj.m92900i(new C89057m(new C90457d(C89885b.HTTP_UPLOAD_SOURCE_NOT_CLONEABLE_AFTER_COOKIE_REFRESH_VALUE)));
        }
        this.f61510j.mo27475d();
        this.f61510j = this.f61510j.mo27476e();
        this.f61511k = true;
        return mo27489b();
    }

    /* renamed from: f */
    private static void m41627f(C89021as asVar) {
        try {
            asVar.mo82997b().mo27475d();
        } catch (C89013ak | C90457d unused) {
        }
    }

    /* renamed from: a */
    public final synchronized C60870cx apply(C89021as asVar) {
        if (!this.f61502a.f241261j) {
            return C60856cj.m92900i(asVar);
        }
        try {
            C89022at g = asVar.mo82999g();
            if (g.mo83000a("Refresh-Google-Creds", (String) null) != null) {
                ((C59052c) ((C59052c) f61501b.mo56226d()).mo56372aa(48435)).mo56386p("Got header to refresh cookies.");
                if (this.f61508h.mo56113h()) {
                    ((C89911f) ((C68214a) this.f61508h.mo56107c()).mo27525b()).mo83756b(new C90457d(true != this.f61511k ? C89885b.HTTP_REFRESH_CREDENTIALS_HEADER_VALUE : C89885b.HTTP_REFRESH_CREDENTIALS_HEADER_AFTER_COOKIE_REFRESH_VALUE)).mo83721a();
                }
                if (!this.f61511k) {
                    return m41625d(asVar);
                }
            }
            String a = g.mo83000a("Location", (String) null);
            if (this.f61502a.f241267p == 4 || !g.mo83002d() || a == null || !this.f61505e.mo56113h() || !((C93823d) ((C68214a) this.f61505e.mo56107c()).mo27525b()).mo88183a(Uri.parse(a))) {
                if (this.f61502a.f241261j) {
                    ((C89067w) this.f61503c.mo27525b()).mo83052e(this.f61504d.toExternalForm(), g.mo83004f());
                }
                return C60856cj.m92900i(asVar);
            } else if (!this.f61511k) {
                return m41625d(asVar);
            } else {
                throw new C90457d(C89885b.HTTP_LOGOUT_REDIRECT_AFTER_COOKIE_REFRESH_VALUE);
            }
        } catch (C90457d e) {
            m41627f(asVar);
            return C60856cj.m92900i(new C89057m(e));
        }
    }

    /* renamed from: b */
    public final synchronized C60870cx mo27489b() {
        C89020ar arVar = this.f61502a;
        if (!arVar.f241261j) {
            if (!this.f61511k) {
                return mo27516c(arVar);
            }
        }
        return this.f61507g.mo28210j(C60846c.m92878g(((C89067w) this.f61503c.mo27525b()).mo83048a(this.f61504d.toExternalForm()), C90457d.class, C22259k.f61499a, C60826bg.f164896a), "CookieWrapperTransformRequest", new C22260l(this));
    }

    /* renamed from: c */
    public final synchronized C60870cx mo27516c(C89020ar arVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f61506f.mo27461f();
        return C60922j.m93045h(this.f61509i.mo27491a(arVar, this.f61510j).mo27489b(), this, C60826bg.f164896a);
    }
}
