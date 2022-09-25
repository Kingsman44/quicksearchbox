package com.google.android.libraries.mdi.download.p2248h.p2250b;

import android.content.Context;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58889cz;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.h.b.ar */
/* compiled from: PG */
public final class C29537ar {

    /* renamed from: a */
    public Context f80038a;

    /* renamed from: b */
    public C65753ak f80039b;

    /* renamed from: c */
    public Executor f80040c;

    /* renamed from: d */
    public C58881cr f80041d;

    /* renamed from: e */
    public C58881cr f80042e;

    /* renamed from: f */
    public final C58881cr f80043f = C29534ao.f80035a;

    /* renamed from: g */
    public C58881cr f80044g = C29535ap.f80036a;

    /* renamed from: h */
    public C58881cr f80045h = C29536aq.f80037a;

    /* renamed from: i */
    public C29553bf f80046i;

    /* renamed from: j */
    public C29551bd f80047j;

    /* renamed from: k */
    public String f80048k;

    /* renamed from: l */
    public C28787cb f80049l;

    /* renamed from: m */
    public C21942ah f80050m = new C29541av();

    /* renamed from: n */
    public final C58889cz f80051n = C58274c.f155808a;

    /* renamed from: o */
    public C58833ax f80052o = C58836b.f156633a;

    /* renamed from: p */
    public C29404a f80053p;

    /* renamed from: a */
    public final C29538as mo34762a() {
        C58838bb.m90866a(this.f80038a, "Must call setContext() before build().");
        C58838bb.m90866a(this.f80040c, "Must call setBackgroundExecutor() before build().");
        C58838bb.m90866a(this.f80039b, "Must call setCorpus() before build().");
        C58838bb.m90866a(this.f80053p, "Must call setLogger() before build().");
        C58838bb.m90866a(this.f80041d, "Must call setGellerSyncRunner() or  setGellerSyncRunnerFutureSupplier() before build().");
        C58838bb.m90866a(this.f80042e, "Must call setAccountsSupplier() before build().");
        C58838bb.m90866a(this.f80046i, "Must call setOAuthTokenProvider() before build().");
        C58838bb.m90866a(this.f80047j, "Must call setMddSyncContextGenerator() before build().");
        C58838bb.m90866a(this.f80048k, "Must call setApiKey() before build().");
        C58838bb.m90866a(this.f80049l, "Must call setFlags() before build().");
        return new C29538as(this);
    }

    /* renamed from: b */
    public final void mo34763b(C58881cr crVar) {
        this.f80041d = new C29533an(crVar);
    }
}
