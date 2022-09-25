package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120752d;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.OnDeviceStreamingInterfaceImpl$handleSodaStream$job$1", mo61344c = "OnDeviceStreamingInterfaceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {93, 95})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.f */
/* compiled from: PG */
final class C120731f extends C69572j implements C69630p {

    /* renamed from: a */
    int f335788a;

    /* renamed from: b */
    final /* synthetic */ C71389v f335789b;

    /* renamed from: c */
    final /* synthetic */ C71587n f335790c;

    /* renamed from: d */
    final /* synthetic */ C71389v f335791d;

    /* renamed from: e */
    final /* synthetic */ C120737l f335792e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120731f(C71389v vVar, C71587n nVar, C71389v vVar2, C120737l lVar, C69577g gVar) {
        super(2, gVar);
        this.f335789b = vVar;
        this.f335790c = nVar;
        this.f335791d = vVar2;
        this.f335792e = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120731f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f335788a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C71389v vVar = this.f335789b;
            C120752d dVar = C120752d.f335859a;
            this.f335788a = 1;
            if (vVar.mo62729v(dVar, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C71587n nVar = this.f335790c;
        C120730e eVar = new C120730e(this.f335791d, this.f335792e);
        this.f335788a = 2;
        if (nVar.mo38165mp(eVar, this) == aVar) {
            return aVar;
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120731f(this.f335789b, this.f335790c, this.f335791d, this.f335792e, gVar);
    }
}
