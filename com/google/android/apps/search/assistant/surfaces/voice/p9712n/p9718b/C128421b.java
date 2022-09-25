package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9718b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.voicesearch.handover.OpaHandoverPrefetchSession$commit$1", mo61344c = "OpaHandoverPrefetchSession.kt", mo61345d = "invokeSuspend", mo61346e = {48, 49})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.b.b */
/* compiled from: PG */
final class C128421b extends C69572j implements C69630p {

    /* renamed from: a */
    int f353183a;

    /* renamed from: b */
    final /* synthetic */ C128422c f353184b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128421b(C128422c cVar, C69577g gVar) {
        super(2, gVar);
        this.f353184b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128421b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f353183a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C128422c cVar = this.f353184b;
            C60870cx l = C60856cj.m92903l(C47810es.m84977q(new C128420a(cVar.f353185a)), cVar.f353186b);
            this.f353183a = 1;
            if (C71663i.m104690c(l, this) == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
        }
        C60870cx a = this.f353184b.f353187c.mo104299a();
        this.f353183a = 2;
        obj = C71663i.m104690c(a, this);
        return obj == aVar ? aVar : obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128421b(this.f353184b, gVar);
    }
}
