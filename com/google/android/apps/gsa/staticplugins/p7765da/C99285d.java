package com.google.android.apps.gsa.staticplugins.p7765da;

import android.accounts.Account;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6662co.C85167c;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7088g.C90242g;
import com.google.android.apps.gsa.shared.util.debug.C91032p;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.p7765da.p7767b.C99278a;
import com.google.android.apps.gsa.staticplugins.p7765da.p7767b.C99282e;
import com.google.android.apps.gsa.staticplugins.p7765da.p7769d.C99286a;
import com.google.android.apps.gsa.staticplugins.p7765da.p7769d.C99288c;
import com.google.android.apps.gsa.staticplugins.p7765da.p7769d.C99290e;
import com.google.android.apps.gsa.staticplugins.p7765da.p7769d.C99291f;
import com.google.android.apps.gsa.staticplugins.p7765da.p7771f.C99316a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57566aj;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57572ap;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57663x;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.da.d */
/* compiled from: PG */
public final class C99285d extends C86734a implements C85167c {

    /* renamed from: a */
    private final C91097g f277731a;

    /* renamed from: b */
    private final C99291f f277732b;

    /* renamed from: c */
    private final C22871g f277733c;

    /* renamed from: f */
    private final C99282e f277734f;

    /* renamed from: g */
    private final C99288c f277735g;

    /* renamed from: h */
    private final C99316a f277736h;

    /* renamed from: i */
    private final C84515a f277737i;

    public C99285d(C91097g gVar, C99291f fVar, C22871g gVar2, C99282e eVar, C99316a aVar, C84515a aVar2, C99288c cVar) {
        super(C118575h.WORKER_SAVEV2, "savev2");
        this.f277731a = gVar;
        this.f277732b = fVar;
        this.f277733c = gVar2;
        this.f277734f = eVar;
        this.f277736h = aVar;
        this.f277735g = cVar;
        this.f277737i = aVar2;
    }

    /* renamed from: m */
    private final C60870cx m164647m(C60870cx cxVar) {
        return this.f277733c.mo28209i(cxVar, "Transform to inner result", C99274a.f277718a);
    }

    /* renamed from: a */
    public final C60870cx mo78746a(C57566aj ajVar, C57569am amVar, C58833ax axVar, String str) {
        return this.f277736h.mo91400a(ajVar, amVar, axVar, str);
    }

    /* renamed from: b */
    public final C60870cx mo78747b() {
        C99291f fVar = this.f277732b;
        return fVar.f277744b.mo28201a("clear collections cache", new C99290e(fVar));
    }

    /* renamed from: c */
    public final C60870cx mo78748c(String str, String str2) {
        return this.f277736h.mo91401b(str, str2);
    }

    /* renamed from: d */
    public final C60870cx mo78749d(C57572ap apVar, String str) {
        C99288c cVar = this.f277735g;
        return cVar.f277741b.mo28209i(C90877ak.m148471e(cVar.f277740a.mo91402c(apVar, str), 30, TimeUnit.SECONDS, cVar.f277741b), "Sort by update time", C99286a.f277738a);
    }

    /* renamed from: e */
    public final C60870cx mo78750e(C57663x xVar, String str) {
        return m164647m(this.f277736h.mo91404e(xVar, str));
    }

    /* renamed from: f */
    public final C60870cx mo78751f(C57566aj ajVar, Set set, String str) {
        return this.f277733c.mo28209i(this.f277736h.mo91405f(ajVar, set, str), "Transform to Done", C99283c.f277730a);
    }

    /* renamed from: g */
    public final C60870cx mo78752g(Uri uri) {
        C99282e eVar = this.f277734f;
        Account a = eVar.f277728c.mo79668a();
        if (a == null) {
            return C60856cj.m92899h(new IllegalStateException("No account"));
        }
        return eVar.f277727b.mo28210j(eVar.f277728c.mo79671e("oauth2:https://www.googleapis.com/auth/photos.firstparty.upload", a, new C91032p()), "Retrieving oAuth token", new C99278a(eVar, uri));
    }

    /* renamed from: h */
    public final void mo78753h(int i, C58833ax axVar, C58833ax axVar2) {
        this.f277731a.mo65089a(this.f277737i.mo78225h(C90242g.m146778a(i), (String) axVar2.mo56111f(), axVar));
    }

    /* renamed from: i */
    public final C60870cx mo78754i(Set set, String str) {
        return this.f277735g.f277740a.mo91406g(set, str);
    }

    /* renamed from: j */
    public final C60870cx mo78755j(C57566aj ajVar, String str, C58833ax axVar, String str2, int i) {
        return this.f277736h.mo91410k(ajVar, str, str2, i);
    }

    /* renamed from: k */
    public final C60870cx mo78756k(String str, boolean z, String str2, int i) {
        return m164647m(this.f277736h.mo91407h(str, z, str2, i));
    }

    /* renamed from: l */
    public final C60870cx mo78757l(C57566aj ajVar, String str, String str2, int i) {
        return this.f277733c.mo28209i(this.f277736h.mo91408i(ajVar, str, str2, i), "Transform to Done", C99277b.f277720a);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
