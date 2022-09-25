package com.google.android.apps.gsa.staticplugins.opa.p8375l;

import android.accounts.Account;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.p8377b.C109403d;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.al */
/* compiled from: PG */
public final class C109388al implements C21851cg {

    /* renamed from: a */
    public static final C59071e f304669a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.l.al");

    /* renamed from: b */
    public final C22871g f304670b;

    /* renamed from: c */
    public final C109403d f304671c;

    /* renamed from: d */
    private final C22871g f304672d;

    /* renamed from: e */
    private final i f304673e;

    /* renamed from: f */
    private final C86054o f304674f;

    public C109388al(C22871g gVar, C22871g gVar2, i iVar, C86054o oVar, C109403d dVar) {
        this.f304672d = gVar;
        this.f304670b = gVar2;
        this.f304673e = iVar;
        this.f304674f = oVar;
        this.f304671c = dVar;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        String F;
        if (akVar.equals(C65753ak.CHALKBOARD) && (F = this.f304674f.mo79659F()) != null && account != null && F.equals(account.name)) {
            C58976aa aaVar = C58975e.f156826a;
            if (!cfVar.mo27153c().isEmpty()) {
                this.f304670b.mo28211k(this.f304672d.mo28209i(this.f304673e.c(F, akVar, "PREFETCH", C63662ac.f172144a, C53606o.f140698f), "Read Geller Chalkboard response", C109385ai.f304667a), "Handling Chalkboard prefetch response", new C109387ak(this));
            }
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
