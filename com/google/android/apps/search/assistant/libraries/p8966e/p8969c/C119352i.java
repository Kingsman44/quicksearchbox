package com.google.android.apps.search.assistant.libraries.p8966e.p8969c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c.C119711d;
import com.google.android.libraries.assistant.p1363c.p1394f.C17275a;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.speech.p5208h.C66611ci;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.libraries.e.c.i */
/* compiled from: PG */
public final class C119352i implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C17275a f332765a;

    public C119352i(C17275a aVar) {
        this.f332765a = aVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59071e eVar = C119354k.f332769a;
        this.f332765a.mo23263d((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C119354k.f332769a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(34391));
        cVar.mo56386p("Closing Connection with Error");
        this.f332765a.mo23263d(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C119711d dVar = (C119711d) obj;
        C69664n.m101061g(dVar, "value");
        C17275a aVar = this.f332765a;
        C66611ci ciVar = dVar.f333529a;
        if (ciVar == null) {
            ciVar = C66611ci.f181206g;
        }
        aVar.mo23264e(ciVar);
    }
}
