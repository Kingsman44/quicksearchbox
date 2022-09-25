package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.OnDeviceStreamingController$runAsr$1$1", mo61344c = "OnDeviceStreamingController.kt", mo61345d = "invokeSuspend", mo61346e = {67})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.j */
/* compiled from: PG */
final class C120721j extends C69572j implements C69630p {

    /* renamed from: a */
    int f335759a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335760b;

    /* renamed from: c */
    final /* synthetic */ C120816a f335761c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120721j(C120723l lVar, C120816a aVar, C69577g gVar) {
        super(2, gVar);
        this.f335760b = lVar;
        this.f335761c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120721j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335759a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120723l lVar = this.f335760b;
            C120816a aVar2 = this.f335761c;
            this.f335759a = 1;
            Object a = C71423ax.m104196a(new C120719h(lVar, aVar2, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120721j(this.f335760b, this.f335761c, gVar);
    }
}
