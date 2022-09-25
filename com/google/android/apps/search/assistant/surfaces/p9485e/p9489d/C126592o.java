package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.InitialRequestFactory$createNew$2$1$userInfoAsync$1", mo61344c = "InitialRequestFactory.kt", mo61345d = "invokeSuspend", mo61346e = {115})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.o */
/* compiled from: PG */
final class C126592o extends C69572j implements C69630p {

    /* renamed from: a */
    int f348609a;

    /* renamed from: b */
    final /* synthetic */ C126449aa f348610b;

    /* renamed from: c */
    final /* synthetic */ boolean f348611c;

    /* renamed from: d */
    final /* synthetic */ C71604be f348612d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126592o(C126449aa aaVar, boolean z, C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f348610b = aaVar;
        this.f348611c = z;
        this.f348612d = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126592o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348609a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126449aa aaVar = this.f348610b;
            boolean z = this.f348611c;
            C71604be beVar = this.f348612d;
            this.f348609a = 1;
            obj = C71423ax.m104196a(new C126597t(aaVar, z, beVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126592o(this.f348610b, this.f348611c, this.f348612d, gVar);
    }
}
