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
import p5462h.p5473f.p5475b.C69645ab;
import p5462h.p5473f.p5475b.C69646ac;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.audio.AudioStats$asLevels$1", mo61344c = "AudioStats.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.a.am */
/* compiled from: PG */
public final class C126385am extends C69572j implements C69630p {

    /* renamed from: a */
    int f348111a;

    /* renamed from: b */
    final /* synthetic */ C71587n f348112b;

    /* renamed from: c */
    final /* synthetic */ int f348113c;

    /* renamed from: d */
    private /* synthetic */ Object f348114d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126385am(C71587n nVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f348112b = nVar;
        this.f348113c = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126385am) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348111a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69645ab abVar = new C69645ab();
            abVar.f186024a = 75.0d;
            C69646ac acVar = new C69646ac();
            C71587n nVar = this.f348112b;
            C126384al alVar = new C126384al(abVar, acVar, this.f348113c, (C71588o) this.f348114d);
            this.f348111a = 1;
            if (nVar.mo38165mp(alVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126385am amVar = new C126385am(this.f348112b, this.f348113c, gVar);
        amVar.f348114d = obj;
        return amVar;
    }
}
