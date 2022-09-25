package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.routing.restricted.impl.AudioRouteDisconnectorImpl$sequenced$1$1", mo61344c = "AudioRouteDisconnectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {213})
/* renamed from: com.google.android.libraries.search.c.w.b.a.e */
/* compiled from: PG */
final class C38145e extends C69572j implements C69630p {

    /* renamed from: a */
    int f101067a;

    /* renamed from: b */
    final /* synthetic */ C69626l f101068b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38145e(C69626l lVar, C69577g gVar) {
        super(2, gVar);
        this.f101068b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38145e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101067a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69626l lVar = this.f101068b;
            this.f101067a = 1;
            obj = lVar.mo5761a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38145e(this.f101068b, gVar);
    }
}
