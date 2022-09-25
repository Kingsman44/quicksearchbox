package com.google.android.apps.search.googleapp.discover.p10203o;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.minusone.MinusOneDataManager$updateLastLoadTime$2", mo61344c = "MinusOneDataManager.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.apps.search.googleapp.discover.o.c */
/* compiled from: PG */
public final class C134474c extends C69572j implements C69630p {

    /* renamed from: a */
    int f366230a;

    /* renamed from: b */
    final /* synthetic */ C134475d f366231b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134474c(C134475d dVar, C69577g gVar) {
        super(2, gVar);
        this.f366231b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134474c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f366230a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134475d dVar = this.f366231b;
            Instant a = dVar.f366236e.mo57444a();
            C69664n.m101060f(a, "timeSource.now()");
            this.f366230a = 1;
            C60870cx a2 = dVar.f366233b.mo46039a(new C134473b(a), dVar.f366234c);
            C69664n.m101060f(a2, "lastLoadTime: Instant) {…\n        executor\n      )");
            Object c = C71663i.m104690c(a2, this);
            if (c != C69554a.COROUTINE_SUSPENDED) {
                c = C69788q.f186170a;
            }
            if (c == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134474c(this.f366231b, gVar);
    }
}
