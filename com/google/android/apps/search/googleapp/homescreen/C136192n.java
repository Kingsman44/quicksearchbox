package com.google.android.apps.search.googleapp.homescreen;

import com.google.android.apps.search.googleapp.homescreen.p10313c.C136150a;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p337aa.p338a.C6600b;
import com.google.p337aa.p338a.C6610l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.n */
/* compiled from: PG */
public final class C136192n implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C136193o f370886a;

    public C136192n(C136193o oVar) {
        this.f370886a = oVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C136193o.f370887a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(40694));
        cVar.mo56386p("Error while subscribing to doodle brightness data service");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C6610l lVar = (C6610l) obj;
        C69664n.m101061g(lVar, "image");
        C136150a aVar = this.f370886a.f370901N;
        if (aVar == null) {
            C69664n.m101065k("headerScrollBehavior");
            aVar = null;
        }
        int a = C6600b.m17998a(lVar.f19639h);
        if (a == 0) {
            a = 1;
        }
        aVar.f370800c = a;
        aVar.mo112803b();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
