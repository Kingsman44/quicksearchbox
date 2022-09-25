package com.google.android.apps.gsa.assistant.settings.features.p529a;

import android.accounts.Account;
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
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.a.c */
/* compiled from: PG */
public final class C9780c implements C21851cg {

    /* renamed from: a */
    public static final C58974d f33751a = C58974d.m91134h("A11ySettingsStatus");

    /* renamed from: b */
    public final Optional f33752b;

    /* renamed from: c */
    public AtomicBoolean f33753c;

    /* renamed from: d */
    public AtomicBoolean f33754d;

    /* renamed from: e */
    private final C22871g f33755e;

    /* renamed from: f */
    private final C86054o f33756f;

    /* renamed from: g */
    private final i f33757g;

    public C9780c(i iVar, C22871g gVar, C86054o oVar, Optional optional) {
        this.f33757g = iVar;
        this.f33755e = gVar;
        this.f33756f = oVar;
        this.f33752b = optional;
    }

    /* renamed from: a */
    public final void mo18033a() {
        if (this.f33756f.mo79659F() != null) {
            i iVar = this.f33757g;
            String F = this.f33756f.mo79659F();
            F.getClass();
            new C90873ag(iVar.a(F, C65753ak.ASSISTANT_SETTINGS, "accessibility_settings", C63662ac.f172144a, C65849r.f179002c), this.f33755e, "[Nga] fetchA11ySettings", new C9774a(this)).mo85223a(C9777b.f33745a);
        }
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.ASSISTANT_SETTINGS && account != null) {
            mo18033a();
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
