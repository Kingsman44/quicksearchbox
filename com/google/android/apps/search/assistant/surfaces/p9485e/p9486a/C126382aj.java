package com.google.android.apps.search.assistant.surfaces.p9485e.p9486a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69647ad;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.audio.AudioStats$asBuckets$1", mo61344c = "AudioStats.kt", mo61345d = "invokeSuspend", mo61346e = {45})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.aj */
/* compiled from: PG */
public final class C126382aj extends C69572j implements C69630p {

    /* renamed from: a */
    int f348099a;

    /* renamed from: b */
    final /* synthetic */ C71587n f348100b;

    /* renamed from: c */
    final /* synthetic */ C126379ag f348101c;

    /* renamed from: d */
    private /* synthetic */ Object f348102d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126382aj(C71587n nVar, C126379ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f348100b = nVar;
        this.f348101c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126382aj) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348099a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69647ad adVar = new C69647ad();
            C69647ad adVar2 = new C69647ad();
            C69646ac acVar = new C69646ac();
            C71587n nVar = this.f348100b;
            C126381ai aiVar = new C126381ai(this.f348101c, adVar, adVar2, acVar, (C71588o) this.f348102d);
            this.f348099a = 1;
            if (nVar.mo38165mp(aiVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126382aj ajVar = new C126382aj(this.f348100b, this.f348101c, gVar);
        ajVar.f348102d = obj;
        return ajVar;
    }
}
