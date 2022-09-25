package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.lifecyclemanager.InvocationResourceCleanup$launchSearchProcessMonitorJob$1$2", mo61344c = "InvocationResourceCleanup.kt", mo61345d = "invokeSuspend", mo61346e = {207})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.h */
/* compiled from: PG */
final class C127575h extends C69572j implements C69631q {

    /* renamed from: a */
    int f351248a;

    /* renamed from: b */
    /* synthetic */ Object f351249b;

    /* renamed from: c */
    final /* synthetic */ C127579l f351250c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127575h(C127579l lVar, C69577g gVar) {
        super(3, gVar);
        this.f351250c = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C127575h hVar = new C127575h(this.f351250c, (C69577g) obj3);
        hVar.f351249b = (Throwable) obj2;
        return hVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351248a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) ((C59052c) C127579l.f351260a.mo56225c()).mo56382g((Throwable) this.f351249b);
            cVar.mo56379ah(new C59094n(37491));
            cVar.mo56386p("Search process possibly died. Closing all invocations");
            C127579l lVar = this.f351250c;
            this.f351248a = 1;
            if (lVar.mo108137d(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
