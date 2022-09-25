package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c.p8539a;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a.u */
/* compiled from: PG */
public final /* synthetic */ class C111927u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111929w f310956a;

    /* renamed from: b */
    public final /* synthetic */ C111932z f310957b;

    public /* synthetic */ C111927u(C111929w wVar, C111932z zVar) {
        this.f310956a = wVar;
        this.f310957b = zVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C111929w wVar = this.f310956a;
        C111932z zVar = this.f310957b;
        C111917k kVar = (C111917k) obj;
        C121537f fVar = C111890ab.f310909b;
        String c = kVar.mo99296c();
        if (c.isEmpty()) {
            str = zVar.mo99302b() + "_" + wVar.f310960a;
        } else {
            str = zVar.mo99302b() + "_" + wVar.f310960a + "_" + c;
        }
        return (C111889aa) fVar.mo105235d(str, new C111928v(kVar, zVar));
    }
}
