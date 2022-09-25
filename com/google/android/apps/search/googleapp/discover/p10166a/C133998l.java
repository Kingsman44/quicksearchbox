package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.android.apps.search.googleapp.discover.p10244v.C135182c;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.DismissActionApi$commit$1$1", mo61344c = "DismissActionApi.kt", mo61345d = "invokeSuspend", mo61346e = {120})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.l */
/* compiled from: PG */
public final class C133998l extends C69572j implements C69630p {

    /* renamed from: a */
    int f364997a;

    /* renamed from: b */
    final /* synthetic */ C134002p f364998b;

    /* renamed from: c */
    final /* synthetic */ C135182c f364999c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C133998l(C134002p pVar, C135182c cVar, C69577g gVar) {
        super(2, gVar);
        this.f364998b = pVar;
        this.f364999c = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C133998l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f364997a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135200t tVar = this.f364998b.f365017e;
            C135182c cVar = this.f364999c;
            this.f364997a = 1;
            obj = tVar.mo112153a(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C133998l(this.f364998b, this.f364999c, gVar);
    }
}
