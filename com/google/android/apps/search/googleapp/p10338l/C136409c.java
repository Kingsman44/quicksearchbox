package com.google.android.apps.search.googleapp.p10338l;

import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.DebuggableBuilderKt$collectDebuggableList$2$1$1", mo61344c = "DebuggableBuilder.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.apps.search.googleapp.l.c */
/* compiled from: PG */
final class C136409c extends C69572j implements C69630p {

    /* renamed from: a */
    int f371371a;

    /* renamed from: b */
    final /* synthetic */ C136376a f371372b;

    /* renamed from: c */
    private /* synthetic */ Object f371373c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136409c(C136376a aVar, C69577g gVar) {
        super(2, gVar);
        this.f371372b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136409c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f371371a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f371373c;
            C136376a aVar2 = this.f371372b;
            this.f371371a = 1;
            obj = aVar2.mo112952a();
            if (obj == aVar) {
                return aVar;
            }
        }
        obj2 = (C136417k) obj;
        return new C69702k(obj2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C136409c cVar = new C136409c(this.f371372b, gVar);
        cVar.f371373c = obj;
        return cVar;
    }
}
