package com.google.android.apps.gsa.assistant.settings.features.p532aa;

import android.accounts.Account;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aa.c */
/* compiled from: PG */
public final class C9785c implements C21851cg {

    /* renamed from: a */
    public static final C58974d f33760a = C58974d.m91136j();

    /* renamed from: b */
    public final C86054o f33761b;

    /* renamed from: c */
    public final ConcurrentHashMap f33762c = new ConcurrentHashMap();

    /* renamed from: d */
    private final C22871g f33763d;

    /* renamed from: e */
    private final i f33764e;

    public C9785c(i iVar, C22871g gVar, C86054o oVar) {
        this.f33764e = iVar;
        this.f33763d = gVar;
        this.f33761b = oVar;
        for (Account b : oVar.mo79684r()) {
            m24539b(b);
        }
    }

    /* renamed from: b */
    private final void m24539b(Account account) {
        if (account != null) {
            i iVar = this.f33764e;
            String str = account.name;
            str.getClass();
            new C90873ag(iVar.a(str, C65753ak.ASSISTANT_SETTINGS, "language_partner_settings", C63662ac.f172144a, C65849r.f179002c), this.f33763d, "[Nga] fetchLanguagePartnerSettings", new C9782a(this)).mo85223a(C9784b.f33759a);
        }
    }

    /* renamed from: a */
    public final String mo18034a() {
        String F = this.f33761b.mo79659F();
        if (F == null) {
            return BuildConfig.FLAVOR;
        }
        return (String) ConcurrentMap.EL.getOrDefault(this.f33762c, F, BuildConfig.FLAVOR);
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.ASSISTANT_SETTINGS && account != null) {
            m24539b(account);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
