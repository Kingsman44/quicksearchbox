package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.libraries.p8979j.p8980a.C119410a;
import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$1", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {113})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.ai */
/* compiled from: PG */
final class C126457ai extends C69572j implements C69630p {

    /* renamed from: a */
    int f348275a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348276b;

    /* renamed from: c */
    final /* synthetic */ C126473ay f348277c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126457ai(C71604be beVar, C126473ay ayVar, C69577g gVar) {
        super(2, gVar);
        this.f348276b = beVar;
        this.f348277c = ayVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126457ai) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348275a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348276b;
            this.f348275a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C119410a aVar2 = (C119410a) obj;
        if (aVar2 != null && aVar2.mo104331c()) {
            this.f348277c.f348320d.mo20123c(C126558c.m206924f(C126456ah.f348274a));
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126457ai(this.f348276b, this.f348277c, gVar);
    }
}
