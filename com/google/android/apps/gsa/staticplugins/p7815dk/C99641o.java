package com.google.android.apps.gsa.staticplugins.p7815dk;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.c;
import com.google.android.apps.gsa.assistant.shared.n.j;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.m;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.n.v;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73892d;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73893f;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.apps.gsa.p6487s3.C84294l;
import com.google.android.apps.gsa.p6487s3.C84295m;
import com.google.android.apps.gsa.p6487s3.C84335x;
import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89045bp;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C90768bl;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.p7761cz.C99248f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C50137ly;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.C50153mn;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acv;
import com.google.assistant.p3861at.acx;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.p5209a.C66531b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.dk.o */
/* compiled from: PG */
public final class C99641o implements l {

    /* renamed from: a */
    public static final C59071e f278814a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dk.o");

    /* renamed from: b */
    String f278815b = null;

    /* renamed from: c */
    public C49875cf f278816c = null;

    /* renamed from: d */
    private final C22871g f278817d;

    /* renamed from: e */
    private final v f278818e;

    /* renamed from: f */
    private final C89012aj f278819f;

    /* renamed from: g */
    private final C86074p f278820g;

    /* renamed from: h */
    private final C86124t f278821h;

    /* renamed from: i */
    private final C99248f f278822i;

    public C99641o(C99248f fVar, C22871g gVar, v vVar, C86074p pVar, C86124t tVar, C89012aj ajVar) {
        this.f278822i = fVar;
        this.f278817d = gVar;
        this.f278818e = vVar;
        this.f278820g = pVar;
        this.f278821h = tVar;
        this.f278819f = ajVar;
    }

    /* renamed from: p */
    public static void m165232p(C66611ci ciVar, k kVar, k kVar2) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C66531b.f180944b);
        ciVar.mo58887l(r0);
        if (ciVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C66531b.f180944b);
            ciVar.mo58887l(r02);
            Object l = ciVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C50137ly lyVar = (C50137ly) obj;
            if ((lyVar.f130341a & 1) != 0) {
                act act = lyVar.f130342b;
                if (act == null) {
                    act = act.f128872P;
                }
                C58976aa aaVar = C58975e.f156826a;
                kVar.go(act);
            } else {
                C59104x c = f278814a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "SettingsServerClient");
                ((C59052c) ((C59052c) c).mo56372aa(32835)).mo56386p("Settings response did not contain UI settings.");
                kVar.gn(new RuntimeException("Invalid get settings response."));
            }
            if (kVar2 != null) {
                if ((lyVar.f130341a & 2) != 0) {
                    C50153mn mnVar = lyVar.f130343c;
                    if (mnVar == null) {
                        mnVar = C50153mn.f130384d;
                    }
                    kVar2.go(mnVar);
                } else {
                    C59104x c2 = f278814a.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "SettingsServerClient");
                    ((C59052c) ((C59052c) c2).mo56372aa(32836)).mo56386p("Response header was null.");
                    kVar2.gn(new RuntimeException("Response header missing."));
                }
            }
        }
        C66610ch a = C66610ch.m97260a(ciVar.f181209b);
        if (a == null) {
            a = C66610ch.IN_PROGRESS;
        }
        if (a == C66610ch.DONE_SUCCESS || a == C66610ch.DONE_ERROR) {
            kVar.gk();
        }
    }

    /* renamed from: q */
    private final C99639m m165233q(Account account, C66595bu buVar, C58881cr crVar, k kVar) {
        C22871g gVar = this.f278817d;
        C99640n nVar = new C99640n(kVar);
        C99248f fVar = this.f278822i;
        v vVar = this.f278818e;
        C90931ca caVar = (C90931ca) vVar.a.mo17428b();
        caVar.getClass();
        C89037bh bhVar = (C89037bh) vVar.b.mo17428b();
        bhVar.getClass();
        C89045bp bpVar = (C89045bp) vVar.c.mo17428b();
        bpVar.getClass();
        C92302a aVar = (C92302a) vVar.d.mo17428b();
        aVar.getClass();
        C89994f fVar2 = (C89994f) vVar.e.mo17428b();
        fVar2.getClass();
        C92461a aVar2 = (C92461a) vVar.f.mo17428b();
        aVar2.getClass();
        C86124t tVar = (C86124t) vVar.g.mo17428b();
        tVar.getClass();
        String str = (String) vVar.h.mo17428b();
        str.getClass();
        String str2 = (String) vVar.i.mo17428b();
        str2.getClass();
        String str3 = (String) vVar.j.mo17428b();
        str3.getClass();
        crVar.getClass();
        j jVar = r4;
        j jVar2 = new j(account, buVar, caVar, bhVar, bpVar, aVar, fVar2, aVar2, tVar, str, str2, str3, crVar);
        C84294l a = fVar.mo91390a((C84295m) C90768bl.m148268a(gVar, C84295m.class, nVar), jVar, new C84335x(), this.f278819f);
        a.mo77824a();
        return new C99639m(a);
    }

    /* renamed from: r */
    private final C99639m m165234r(C73894n nVar) {
        C58976aa aaVar = C58975e.f156826a;
        nVar.mo65392d().mo56111f();
        nVar.mo65391c();
        nVar.mo65395g();
        return m165233q((Account) nVar.mo65392d().mo56111f(), (C66595bu) nVar.mo65396h().mo56111f(), new C99627a(this, nVar), new C99637k(this, nVar));
    }

    /* renamed from: s */
    private final void m165235s(String str, SettableFuture settableFuture, C99639m mVar, long j, TimeUnit timeUnit) {
        this.f278817d.mo28213m(str, timeUnit.toMillis(j), new C99629c(mVar, settableFuture));
    }

    /* renamed from: a */
    public final C60870cx mo91530a(c cVar, long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        ((p) cVar).a = new C99633g(settableFuture);
        m165235s("GetRequestTimeout", settableFuture, mo91537h(cVar.a()), j, timeUnit);
        return settableFuture;
    }

    /* renamed from: b */
    public final C60870cx mo91531b(C73893f fVar) {
        SettableFuture settableFuture = new SettableFuture();
        m165235s("LinkRequestTimeout", settableFuture, m165233q(fVar.mo65379a(), fVar.mo65381d(), new C99631e(this, fVar), new C99638l(this, settableFuture)), fVar.mo65389l().f191964b, TimeUnit.MILLISECONDS);
        return settableFuture;
    }

    /* renamed from: c */
    public final C60870cx mo91532c(m mVar, long j, TimeUnit timeUnit) {
        SettableFuture settableFuture = new SettableFuture();
        ((t) mVar).b = new C99636j(settableFuture);
        m165235s("UpdateRequestTimeout", settableFuture, m165234r(mVar.a()), j, timeUnit);
        return settableFuture;
    }

    /* renamed from: d */
    public final C60870cx mo91533d(Account account, acx acx, long j, TimeUnit timeUnit, String str) {
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(account);
        b.c(acx);
        tVar.j = C58833ax.m90833j(str);
        return mo91532c(b, j, timeUnit);
    }

    /* renamed from: e */
    public final String mo91534e() {
        return this.f278815b;
    }

    /* renamed from: f */
    public final void mo91535f(C49875cf cfVar) {
        this.f278816c = cfVar;
    }

    /* renamed from: g */
    public final void mo91536g(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f278815b = str;
    }

    /* renamed from: h */
    public final C99639m mo91537h(C73892d dVar) {
        C58976aa aaVar = C58975e.f156826a;
        return m165233q((Account) dVar.mo65372d().mo56111f(), (C66595bu) dVar.mo65375g().mo56111f(), new C99628b(this, dVar), new C99632f(dVar));
    }

    /* renamed from: i */
    public final C99639m mo91538i(Account account, acv acv, C50144me meVar, k kVar, k kVar2, String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
        return m165233q(account, (C66595bu) null, new C99630d(this, acv, meVar, str, str2), new C99634h(kVar, kVar2));
    }

    /* renamed from: j */
    public final C60870cx mo91539j(Account account, acv acv, C50144me meVar, long j, TimeUnit timeUnit, String str) {
        SettableFuture settableFuture = new SettableFuture();
        SettableFuture settableFuture2 = settableFuture;
        m165235s("GetRequestTimeout", settableFuture2, mo91538i(account, acv, meVar, new C99635i(settableFuture), (k) null, (String) null, str), j, timeUnit);
        return settableFuture;
    }

    /* renamed from: k */
    public final C60870cx mo91540k(Account account, C66595bu buVar, acx acx, long j, TimeUnit timeUnit, String str) {
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(account);
        tVar.d = C58833ax.m90833j(buVar);
        tVar.e = C58833ax.m90833j((Object) null);
        b.c(acx);
        tVar.j = C58833ax.m90833j(str);
        return mo91532c(b, j, timeUnit);
    }

    /* renamed from: l */
    public final void mo91541l(Account account, C49875cf cfVar, acx acx, k kVar, String str) {
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(account);
        tVar.e = C58833ax.m90833j(cfVar);
        b.c(acx);
        tVar.b = kVar;
        tVar.j = C58833ax.m90833j(str);
        m165234r(b.a());
    }

    /* renamed from: m */
    public final C99639m mo91542m(Account account, C66595bu buVar, acx acx, k kVar, String str) {
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(account);
        tVar.d = C58833ax.m90833j(buVar);
        tVar.e = C58833ax.m90833j((Object) null);
        b.c(acx);
        if (kVar != null) {
            tVar.b = kVar;
            tVar.j = C58833ax.m90833j(str);
            return m165234r(b.a());
        }
        throw new NullPointerException("Null resultCallback");
    }

    /* renamed from: n */
    public final void mo91543n(Account account, acx acx, k kVar, String str) {
        t b = C73894n.m108499b();
        t tVar = b;
        tVar.c = C58833ax.m90833j(account);
        b.c(acx);
        tVar.b = kVar;
        tVar.j = C58833ax.m90833j(str);
        m165234r(b.a());
    }

    /* renamed from: o */
    public final C58833ax mo91544o() {
        return this.f278821h.mo79746e(C90059dk.f249021K) ? C58833ax.m90834k(this.f278820g) : C58836b.f156633a;
    }
}
