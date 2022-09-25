package com.google.android.libraries.lens.view.p2059ah.p2060a.p2062b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.ah.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C25123c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C25128h f68422a;

    public /* synthetic */ C25123c(C25128h hVar) {
        this.f68422a = hVar;
    }

    public final C60870cx apply(Object obj) {
        C25128h hVar = this.f68422a;
        if (!((Boolean) obj).booleanValue()) {
            return C60856cj.m92900i(false);
        }
        if (!hVar.f68430d.mo29460c()) {
            hVar.f68430d.mo29462e();
        }
        C60870cx a = hVar.f68431e.mo29905a((C58485gu) Collection.EL.stream(hVar.f68432f.mo31240b().entrySet()).map(C25121a.f68419a).collect(C58370cn.f155946a));
        C25124d dVar = new C25124d(hVar);
        return C60922j.m93044g(a, C47810es.m84963c(dVar), hVar.f68429c);
    }
}
