package com.google.apps.tiktok.coroutines.p3632a;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.apps.tiktok.coroutines.flow.CongestionControlOperatorsKt$networkOptimizedWindowing$1$1", mo61344c = "CongestionControlOperators.kt", mo61345d = "invokeSuspend", mo61346e = {126})
/* renamed from: com.google.apps.tiktok.coroutines.a.o */
/* compiled from: PG */
final class C46637o extends C69572j implements C69630p {

    /* renamed from: a */
    int f121875a;

    /* renamed from: b */
    final /* synthetic */ C71587n f121876b;

    /* renamed from: c */
    final /* synthetic */ C71788b f121877c;

    /* renamed from: d */
    final /* synthetic */ C69648ae f121878d;

    /* renamed from: e */
    final /* synthetic */ C69631q f121879e;

    /* renamed from: f */
    final /* synthetic */ C69626l f121880f;

    /* renamed from: g */
    final /* synthetic */ List f121881g;

    /* renamed from: h */
    final /* synthetic */ C71361ao f121882h;

    /* renamed from: i */
    private /* synthetic */ Object f121883i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46637o(C71587n nVar, C71788b bVar, C69648ae aeVar, C69631q qVar, C69626l lVar, List list, C71361ao aoVar, C69577g gVar) {
        super(2, gVar);
        this.f121876b = nVar;
        this.f121877c = bVar;
        this.f121878d = aeVar;
        this.f121879e = qVar;
        this.f121880f = lVar;
        this.f121881g = list;
        this.f121882h = aoVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C46637o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f121875a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71587n nVar = this.f121876b;
            C46636n nVar2 = new C46636n((C71422aw) this.f121883i, this.f121877c, this.f121878d, this.f121879e, this.f121880f, this.f121881g, this.f121882h);
            this.f121875a = 1;
            if (nVar.mo38165mp(nVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C46637o oVar = new C46637o(this.f121876b, this.f121877c, this.f121878d, this.f121879e, this.f121880f, this.f121881g, this.f121882h, gVar);
        oVar.f121883i = obj;
        return oVar;
    }
}
