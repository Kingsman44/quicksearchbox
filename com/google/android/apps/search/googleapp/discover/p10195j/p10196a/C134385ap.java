package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.ap */
/* compiled from: PG */
final class C134385ap implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C134386aq f366087a;

    public C134385ap(C134386aq aqVar) {
        this.f366087a = aqVar;
    }

    public final void run() {
        C133939b bVar = this.f366087a.f366088a;
        C134228q qVar = C134228q.XUIKIT_REFRESH_FEED_COMMAND;
        C69664n.m101061g(qVar, "refreshReason");
        C59052c cVar = (C59052c) C133939b.f364792a.mo56224b();
        cVar.mo56379ah(new C59094n(40197));
        cVar.mo56389s("ActionApi#startRefresh(%s)", qVar);
        C47393f.m84236g(new C134709g(qVar), bVar.f364794c);
    }
}
