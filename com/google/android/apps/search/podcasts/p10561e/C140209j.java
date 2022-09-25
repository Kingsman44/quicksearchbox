package com.google.android.apps.search.podcasts.p10561e;

import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.e.j */
/* compiled from: PG */
public final class C140209j implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140211l f380924a;

    public C140209j(C140211l lVar) {
        this.f380924a = lVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) this.f380924a.f380928c.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41581));
        cVar.mo56386p("Failed to create the intent and send broadcast to play episode in background.");
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        C59052c cVar = (C59052c) this.f380924a.f380928c.mo56224b();
        cVar.mo56379ah(new C59094n(41582));
        cVar.mo56386p("Succeeded to create the intent. Starts to send broadcast to play in background.");
    }
}
