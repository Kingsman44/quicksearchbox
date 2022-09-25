package com.google.android.apps.search.podcasts.p10571i;

import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.i.b */
/* compiled from: PG */
public final class C140407b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C140415j f381392a;

    public C140407b(C140415j jVar) {
        this.f381392a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C140415j.f381406a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(41597));
        cVar.mo56386p("Failed to retrieve playbackInfo for session release.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((C140787e) obj) == null) {
            this.f381392a.mo115658d(false);
        }
    }
}
