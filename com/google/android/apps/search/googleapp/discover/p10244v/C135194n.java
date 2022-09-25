package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$getSessionState$2", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {56})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.n */
/* compiled from: PG */
final class C135194n extends C69572j implements C69630p {

    /* renamed from: a */
    int f368267a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368268b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368269c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135194n(C135200t tVar, C134755f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368268b = tVar;
        this.f368269c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135194n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368267a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135171bp bpVar = this.f368268b.f368289c;
            C134755f fVar = this.f368269c;
            this.f368267a = 1;
            obj = bpVar.mo112142c(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135194n(this.f368268b, this.f368269c, gVar);
    }
}
