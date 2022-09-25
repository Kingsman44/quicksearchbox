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

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.session.FeedStorageManager$getSessionStateFromJava$1", mo61344c = "FeedStorageManager.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.apps.search.googleapp.discover.v.o */
/* compiled from: PG */
public final class C135195o extends C69572j implements C69630p {

    /* renamed from: a */
    int f368270a;

    /* renamed from: b */
    final /* synthetic */ C135200t f368271b;

    /* renamed from: c */
    final /* synthetic */ C134755f f368272c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C135195o(C135200t tVar, C134755f fVar, C69577g gVar) {
        super(2, gVar);
        this.f368271b = tVar;
        this.f368272c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C135195o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f368270a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C135200t tVar = this.f368271b;
            C134755f fVar = this.f368272c;
            this.f368270a = 1;
            obj = tVar.mo112156d(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C135195o(this.f368271b, this.f368272c, gVar);
    }
}
