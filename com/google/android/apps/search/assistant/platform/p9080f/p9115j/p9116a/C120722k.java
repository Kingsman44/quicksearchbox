package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120750b;
import com.google.android.apps.search.assistant.platform.p9080f.p9125m.C120816a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.OnDeviceStreamingController$runAsr$1", mo61344c = "OnDeviceStreamingController.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.k */
/* compiled from: PG */
public final class C120722k extends C69572j implements C69630p {

    /* renamed from: a */
    int f335762a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335763b;

    /* renamed from: c */
    final /* synthetic */ C120816a f335764c;

    /* renamed from: d */
    private /* synthetic */ Object f335765d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120722k(C120723l lVar, C120816a aVar, C69577g gVar) {
        super(2, gVar);
        this.f335763b = lVar;
        this.f335764c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120722k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335762a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71803m.m105043d((C71422aw) this.f335765d, (C69585o) null, (C71424ay) null, new C120721j(this.f335763b, this.f335764c, (C69577g) null), 3);
            C71389v vVar = this.f335763b.f335772g;
            C120750b bVar = C120750b.f335858a;
            this.f335762a = 1;
            if (vVar.mo62729v(bVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120722k kVar = new C120722k(this.f335763b, this.f335764c, gVar);
        kVar.f335765d = obj;
        return kVar;
    }
}
