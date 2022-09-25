package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9922b.p9923a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.k */
/* compiled from: PG */
public final class C130715k implements C21851cg {

    /* renamed from: a */
    public static final C58974d f357894a = C58974d.m91136j();

    /* renamed from: b */
    public final Context f357895b;

    /* renamed from: c */
    private final C46128f f357896c;

    /* renamed from: d */
    private final ExecutorService f357897d;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.b.a.k$a */
    /* compiled from: PG */
    interface C130716a {
        /* renamed from: ju */
        Set mo109804ju();
    }

    public C130715k(C46128f fVar, ExecutorService executorService, Context context) {
        this.f357896c = fVar;
        this.f357897d = executorService;
        this.f357895b = context;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (akVar == C65753ak.HABITS_AA_PROFILES && account != null) {
            C60870cx c = this.f357896c.mo50216c(account.name);
            C130714j jVar = new C130714j(this, cfVar);
            C60856cj.m92911t(c, C47810es.m84974n(jVar), this.f357897d);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
