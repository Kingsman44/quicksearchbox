package com.google.android.apps.search.googleapp.p10338l.p10339a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDump$getAllData$2$withDeferred$1$1", mo61344c = "StateDump.kt", mo61345d = "invokeSuspend", mo61346e = {94})
/* renamed from: com.google.android.apps.search.googleapp.l.a.s */
/* compiled from: PG */
final class C136400s extends C69572j implements C69630p {

    /* renamed from: a */
    int f371342a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371343b;

    /* renamed from: c */
    final /* synthetic */ C136399r f371344c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136400s(C136378aa aaVar, C136399r rVar, C69577g gVar) {
        super(2, gVar);
        this.f371343b = aaVar;
        this.f371344c = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136400s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f371342a != 0) {
            C69714l.m101134b(obj);
            obj2 = ((C69702k) obj).f186073a;
        } else {
            C69714l.m101134b(obj);
            C136378aa aaVar = this.f371343b;
            C136399r rVar = this.f371344c;
            this.f371342a = 1;
            obj2 = aaVar.mo112955b(rVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        }
        return new C69702k(obj2);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136400s(this.f371343b, this.f371344c, gVar);
    }
}
