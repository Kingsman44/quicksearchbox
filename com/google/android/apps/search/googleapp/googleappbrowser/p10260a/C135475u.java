package com.google.android.apps.search.googleapp.googleappbrowser.p10260a;

import com.google.android.apps.gsa.p8867w.p8879i.C118809j;
import com.google.android.apps.search.googleapp.p10310h.C136139t;
import com.google.android.libraries.kids.p1982a.p1983a.C24030j;
import com.google.android.libraries.search.integrations.p3019d.p3020a.C38510a;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.a.u */
/* compiled from: PG */
public final class C135475u {

    /* renamed from: a */
    public static final C59071e f369090a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.a.u");

    /* renamed from: b */
    public final C60887da f369091b;

    /* renamed from: c */
    public final C44127c f369092c;

    /* renamed from: d */
    public final C136139t f369093d;

    /* renamed from: e */
    private final AccountId f369094e;

    /* renamed from: f */
    private final C46180e f369095f;

    /* renamed from: g */
    private final boolean f369096g;

    /* renamed from: h */
    private final boolean f369097h;

    /* renamed from: i */
    private final boolean f369098i;

    /* renamed from: j */
    private final C24030j f369099j;

    /* renamed from: k */
    private final C118809j f369100k;

    public C135475u(AccountId accountId, C118809j jVar, C60887da daVar, C44127c cVar, C46180e eVar, C136139t tVar, boolean z, boolean z2, boolean z3, C24030j jVar2) {
        this.f369100k = jVar;
        this.f369094e = accountId;
        this.f369091b = daVar;
        this.f369092c = cVar;
        this.f369095f = eVar;
        this.f369093d = tVar;
        this.f369096g = z;
        this.f369097h = z2;
        this.f369098i = z3;
        this.f369099j = jVar2;
    }

    /* renamed from: g */
    private final C60870cx m219655g() {
        return C47633f.m84733g(this.f369099j.mo29426a(this.f369094e, false)).mo51516i(new C135472r(this), this.f369091b).mo51513e(IOException.class, C135473s.f369088a, this.f369091b);
    }

    /* renamed from: h */
    private final boolean m219656h(C135476v vVar) {
        if (this.f369097h) {
            return false;
        }
        if (vVar.f369103c == C38510a.OPT_IN) {
            return true;
        }
        if (vVar.f369103c == C38510a.OPT_OUT) {
            return false;
        }
        return this.f369096g;
    }

    /* renamed from: i */
    private final boolean m219657i() {
        return !this.f369098i;
    }

    /* renamed from: a */
    public final C60870cx mo112358a() {
        C60870cx b = mo112359b();
        C135469o oVar = new C135469o(this);
        return C60922j.m93045h(b, C47810es.m84966f(oVar), this.f369091b);
    }

    /* renamed from: b */
    public final C60870cx mo112359b() {
        C60870cx a = this.f369095f.mo50251a();
        C60870cx a2 = this.f369100k.mo103975a();
        return C47638k.m84751b(a, a2).mo51520a(new C135467m(this, a, a2), this.f369091b);
    }

    /* renamed from: c */
    public final C60870cx mo112360c(C135476v vVar) {
        if (vVar.f369101a || !m219656h(vVar) || vVar.f369102b) {
            return C60856cj.m92900i(false);
        }
        return m219655g();
    }

    /* renamed from: d */
    public final C60870cx mo112361d() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx b = mo112359b();
        C135474t tVar = new C135474t(this);
        return C60922j.m93045h(b, C47810es.m84966f(tVar), this.f369091b);
    }

    /* renamed from: e */
    public final C60870cx mo112362e(C135476v vVar) {
        if (mo112363f(vVar)) {
            return C60856cj.m92900i(true);
        }
        if (vVar.f369101a && !m219657i()) {
            return C60856cj.m92900i(false);
        }
        if (!m219656h(vVar) || !vVar.f369102b) {
            return C60856cj.m92900i(false);
        }
        return m219655g();
    }

    /* renamed from: f */
    public final boolean mo112363f(C135476v vVar) {
        return vVar.f369101a && m219657i();
    }
}
