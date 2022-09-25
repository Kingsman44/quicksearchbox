package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9981n.p9984b;

import android.accounts.Account;
import com.google.android.apps.search.assistant.platform.p8988a.C119500b;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.b.c */
/* compiled from: PG */
public final class C131470c implements C21851cg {

    /* renamed from: a */
    private final C119500b f359306a;

    /* renamed from: b */
    private final C60887da f359307b;

    /* renamed from: c */
    private final boolean f359308c;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.n.b.c$a */
    /* compiled from: PG */
    public interface C131471a {
        /* renamed from: N */
        C123587c mo110180N();
    }

    public C131470c(C119500b bVar, C60887da daVar, boolean z) {
        this.f359306a = bVar;
        this.f359307b = daVar;
        this.f359308c = z;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.ASSISTANT_SETTINGS && cfVar.mo27153c().contains("notes_and_lists_settings") && this.f359308c) {
            C46459k.m82829b(C47633f.m84733g(this.f359306a.mo104411a(C131471a.class)).mo51515h(C131468a.f359304a, this.f359307b).mo51516i(C131469b.f359305a, this.f359307b), "Failed to fetch shopping list.", new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
