package com.google.android.apps.search.fedora.p10104h;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.search.fedora.p10092a.C132701g;
import com.google.android.apps.search.fedora.p10092a.C132715u;
import com.google.android.apps.search.fedora.p10092a.C132716v;
import com.google.android.apps.search.fedora.p10092a.C132717w;
import com.google.android.apps.search.fedora.p10100f.C132838e;
import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.p1818f.C21851cg;
import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.protos.p5129p.p5131b.C65753ak;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.fedora.h.i */
/* compiled from: PG */
public final class C132899i implements C21851cg {

    /* renamed from: a */
    public static final C59071e f362538a = C59071e.m91332i("com.google.android.apps.search.fedora.h.i");

    /* renamed from: b */
    public final Context f362539b;

    /* renamed from: c */
    public final C132717w f362540c;

    /* renamed from: d */
    public final C69464a f362541d;

    /* renamed from: e */
    public final C60887da f362542e;

    /* renamed from: com.google.android.apps.search.fedora.h.i$a */
    /* compiled from: PG */
    public interface C132900a {
        /* renamed from: bE */
        C132838e mo110928bE();

        /* renamed from: fN */
        C38469m mo110929fN();
    }

    public C132899i(Context context, C132717w wVar, C69464a aVar, C60887da daVar) {
        this.f362539b = context;
        this.f362540c = wVar;
        this.f362541d = aVar;
        this.f362542e = daVar;
    }

    /* renamed from: e */
    public final void mo17956e(C65753ak akVar, Account account, C21850cf cfVar) {
        if (account != null && akVar == C65753ak.ASSISTANT_SETTINGS) {
            C132717w wVar = this.f362540c;
            C132715u uVar = new C132715u(wVar, account.name);
            Class<Throwable> cls = Throwable.class;
            C46459k.m82829b(C47633f.m84733g(C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(uVar), wVar.f362145e)).mo51515h(C132716v.f362140a, wVar.f362145e).mo51514f(cls, C132701g.f362116a, wVar.f362145e)).mo51516i(new C132896f(this), this.f362542e), "Failed to sync Sheldon email status", new Object[0]);
        }
    }

    /* renamed from: i */
    public final void mo17960i() {
    }
}
