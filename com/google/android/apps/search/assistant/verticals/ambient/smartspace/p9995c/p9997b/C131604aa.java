package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.protos.p5129p.p5131b.C65753ak;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$closeWithMutexHeld$3", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {253})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.aa */
/* compiled from: PG */
final class C131604aa extends C69572j implements C69630p {

    /* renamed from: a */
    int f359565a;

    /* renamed from: b */
    final /* synthetic */ C131614ak f359566b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131604aa(C131614ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f359566b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131604aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359565a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C131614ak akVar = this.f359566b;
            C65753ak akVar2 = C131614ak.f359606a;
            C69626l lVar = akVar.f359613g;
            this.f359565a = 1;
            if (lVar.mo5761a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131604aa(this.f359566b, gVar);
    }
}
