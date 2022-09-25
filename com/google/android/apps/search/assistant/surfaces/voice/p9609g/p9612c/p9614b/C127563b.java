package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9614b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.impl.SearchProcessMonitoring$emitWithDelay$2", mo61344c = "SearchProcessMonitoring.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.b.b */
/* compiled from: PG */
final class C127563b extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f351215a;

    public C127563b(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C127563b bVar = new C127563b((C69577g) obj3);
        bVar.f351215a = (Throwable) obj2;
        return bVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f351215a;
        if (obj2 == null || (obj2 instanceof CancellationException)) {
            C59052c cVar = (C59052c) C127565d.f351219a.mo56224b();
            cVar.mo56379ah(new C59094n(37502));
            cVar.mo56386p("Collector cancelled the collection of flow");
        } else {
            C59052c cVar2 = (C59052c) ((C59052c) C127565d.f351219a.mo56225c()).mo56382g((Throwable) obj2);
            cVar2.mo56379ah(new C59094n(37503));
            cVar2.mo56386p("Completed with an exception");
        }
        return C69788q.f186170a;
    }
}
