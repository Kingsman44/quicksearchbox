package com.google.android.libraries.search.assistant.appactions.p2501a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69646ac;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.appactions.actionsservice.ActionsServiceSessionImpl$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {93})
/* renamed from: com.google.android.libraries.search.assistant.appactions.a.d */
/* compiled from: PG */
final class C32445d extends C69572j implements C69630p {

    /* renamed from: a */
    int f86927a;

    /* renamed from: b */
    final /* synthetic */ C32458q f86928b;

    /* renamed from: c */
    private /* synthetic */ Object f86929c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32445d(C32458q qVar, C69577g gVar) {
        super(2, gVar);
        this.f86928b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32445d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86927a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C69648ae aeVar = new C69648ae();
            C69646ac acVar = new C69646ac();
            C69648ae aeVar2 = new C69648ae();
            C71587n a = C71536cm.m104383a(this.f86928b.f86974c);
            C32444c cVar = new C32444c(aeVar2, this.f86928b, acVar, aeVar, (C71422aw) this.f86929c);
            this.f86927a = 1;
            if (a.mo38165mp(cVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32445d dVar = new C32445d(this.f86928b, gVar);
        dVar.f86929c = obj;
        return dVar;
    }
}
