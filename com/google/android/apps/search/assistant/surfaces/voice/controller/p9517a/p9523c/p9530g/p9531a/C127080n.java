package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69596e;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.timeout.impl.TimeoutTracker$startTracking$1", mo61344c = "TimeoutTracker.kt", mo61345d = "invokeSuspend", mo61346e = {85})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.g.a.n */
/* compiled from: PG */
public final class C127080n extends C69572j implements C69630p {

    /* renamed from: a */
    int f349915a;

    /* renamed from: b */
    final /* synthetic */ C127081o f349916b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127080n(C127081o oVar, C69577g gVar) {
        super(2, gVar);
        this.f349916b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127080n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349915a == 0) {
            C69714l.m101134b(obj);
            C127081o oVar = this.f349916b;
            C71548cy cyVar = oVar.f349919c.f349746e;
            C127079m mVar = new C127079m(oVar);
            this.f349915a = 1;
            if (cyVar.mo38165mp(mVar, this) == aVar) {
                return aVar;
            }
        } else {
            C69714l.m101134b(obj);
        }
        throw new C69596e();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127080n(this.f349916b, gVar);
    }
}
