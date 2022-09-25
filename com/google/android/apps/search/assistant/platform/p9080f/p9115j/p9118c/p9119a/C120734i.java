package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

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
import p5462h.p5473f.p5475b.C69644aa;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.OnDeviceStreamingInterfaceImpl$process$job$1", mo61344c = "OnDeviceStreamingInterfaceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {47})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.i */
/* compiled from: PG */
final class C120734i extends C69572j implements C69630p {

    /* renamed from: a */
    int f335798a;

    /* renamed from: b */
    final /* synthetic */ C71587n f335799b;

    /* renamed from: c */
    final /* synthetic */ C71389v f335800c;

    /* renamed from: d */
    final /* synthetic */ C120737l f335801d;

    /* renamed from: e */
    final /* synthetic */ C71389v f335802e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120734i(C71587n nVar, C71389v vVar, C120737l lVar, C71389v vVar2, C69577g gVar) {
        super(2, gVar);
        this.f335799b = nVar;
        this.f335800c = vVar;
        this.f335801d = lVar;
        this.f335802e = vVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120734i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335798a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69644aa aaVar = new C69644aa();
            C71587n nVar = this.f335799b;
            C120733h hVar = new C120733h(this.f335800c, this.f335801d, aaVar, this.f335802e);
            this.f335798a = 1;
            if (nVar.mo38165mp(hVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120734i(this.f335799b, this.f335800c, this.f335801d, this.f335802e, gVar);
    }
}
