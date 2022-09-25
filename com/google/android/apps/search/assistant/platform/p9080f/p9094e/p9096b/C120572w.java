package com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.execution.session.FulfillmentSession$deferredResults$1$invokeSuspend$$inlined$transform$2", mo61344c = "FulfillmentSession.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.platform.f.e.b.w */
/* compiled from: PG */
public final class C120572w extends C69572j implements C69630p {

    /* renamed from: a */
    int f335352a;

    /* renamed from: b */
    final /* synthetic */ C71587n f335353b;

    /* renamed from: c */
    final /* synthetic */ C120546ac f335354c;

    /* renamed from: d */
    private /* synthetic */ Object f335355d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120572w(C71587n nVar, C69577g gVar, C120546ac acVar) {
        super(2, gVar);
        this.f335353b = nVar;
        this.f335354c = acVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120572w) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335352a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f335353b;
            C120571v vVar = new C120571v((C71588o) this.f335355d, this.f335354c);
            this.f335352a = 1;
            if (nVar.mo38165mp(vVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120572w wVar = new C120572w(this.f335353b, gVar, this.f335354c);
        wVar.f335355d = obj;
        return wVar;
    }
}
