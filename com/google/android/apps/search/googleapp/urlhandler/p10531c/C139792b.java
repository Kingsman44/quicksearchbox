package com.google.android.apps.search.googleapp.urlhandler.p10531c;

import com.google.android.apps.gsa.p8867w.p8879i.C118803d;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135468n;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135475u;
import com.google.apps.tiktok.account.data.p3613b.C46180e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.c.b */
/* compiled from: PG */
public final class C139792b {

    /* renamed from: a */
    private final C135475u f379939a;

    /* renamed from: b */
    private final C46180e f379940b;

    /* renamed from: c */
    private final Executor f379941c;

    /* renamed from: d */
    private final C118803d f379942d;

    public C139792b(C118803d dVar, C135475u uVar, C46180e eVar, Executor executor) {
        this.f379940b = eVar;
        this.f379942d = dVar;
        this.f379939a = uVar;
        this.f379941c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo115249a() {
        C60870cx a = this.f379940b.mo50251a();
        C60870cx b = this.f379942d.mo103973b();
        C135475u uVar = this.f379939a;
        C60870cx b2 = uVar.mo112359b();
        C135468n nVar = new C135468n(uVar);
        C60870cx h = C60922j.m93045h(b2, C47810es.m84966f(nVar), uVar.f369091b);
        return C47638k.m84753d(a, b, h).mo51520a(new C139791a(a, b, h), this.f379941c);
    }
}
