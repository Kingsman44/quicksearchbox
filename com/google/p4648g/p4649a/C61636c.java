package com.google.p4648g.p4649a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5584j.C71788b;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.async.coroutines.ConditionImpl$await$2", mo61344c = "Condition.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.g.a.c */
/* compiled from: PG */
final class C61636c extends C69572j implements C69630p {

    /* renamed from: a */
    int f166533a;

    /* renamed from: b */
    final /* synthetic */ C61637d f166534b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61636c(C61637d dVar, C69577g gVar) {
        super(2, gVar);
        this.f166534b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C61636c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f166533a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71788b bVar = this.f166534b.f166535a;
            this.f166533a = 1;
            if (bVar.mo63025b((Object) null, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C61636c(this.f166534b, gVar);
    }
}
