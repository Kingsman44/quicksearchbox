package com.google.android.apps.search.googleapp.p10253e;

import com.google.android.libraries.p1635au.C19567d;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.e.f */
/* compiled from: PG */
public final class C135375f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C135379j f368843a;

    /* renamed from: b */
    final /* synthetic */ C69648ae f368844b;

    public C135375f(C135379j jVar, C69648ae aeVar) {
        this.f368843a = jVar;
        this.f368844b = aeVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, "throwable");
        ((C19567d) this.f368843a.f368853f.f102821aE.mo6453a()).mo24822a(1, new Object[0]);
        C59052c cVar = (C59052c) ((C59052c) C135379j.f368848a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40195));
        cVar.mo56386p("Failed to update data in ProtoDataStore.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C135379j jVar = this.f368843a;
        C135374e eVar = new C135374e(this.f368844b);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(eVar), jVar.f368852e), "Failed to notify listeners.", new Object[0]);
    }
}
