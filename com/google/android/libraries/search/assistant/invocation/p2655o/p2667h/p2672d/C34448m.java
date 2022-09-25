package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2672d;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34060bw;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.service.platform.PerConnectionPlatformConfigurationTracker$tracking$3", mo61344c = "PlatformConfigurationTracker.kt", mo61345d = "invokeSuspend", mo61346e = {141})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.d.m */
/* compiled from: PG */
final class C34448m extends C69572j implements C69630p {

    /* renamed from: a */
    int f91540a;

    /* renamed from: b */
    /* synthetic */ Object f91541b;

    /* renamed from: c */
    final /* synthetic */ C34449n f91542c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34448m(C34449n nVar, C69577g gVar) {
        super(2, gVar);
        this.f91542c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34448m) mo5194c((C69685i) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91540a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C34354a aVar2 = this.f91542c.f91544b;
            this.f91540a = 1;
            if (aVar2.mo39321b((C34060bw) ((C69685i) this.f91541b).f186053b, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34448m mVar = new C34448m(this.f91542c, gVar);
        mVar.f91541b = obj;
        return mVar;
    }
}
