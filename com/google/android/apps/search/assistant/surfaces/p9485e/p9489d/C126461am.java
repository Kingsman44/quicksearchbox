package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.Network$run$2$3", mo61344c = "Network.kt", mo61345d = "invokeSuspend", mo61346e = {126})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.am */
/* compiled from: PG */
final class C126461am extends C69572j implements C69630p {

    /* renamed from: a */
    int f348283a;

    /* renamed from: b */
    final /* synthetic */ C71604be f348284b;

    /* renamed from: c */
    final /* synthetic */ C126473ay f348285c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126461am(C71604be beVar, C126473ay ayVar, C69577g gVar) {
        super(2, gVar);
        this.f348284b = beVar;
        this.f348285c = ayVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126461am) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348283a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f348284b;
            this.f348283a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (!((Optional) obj).isPresent()) {
            this.f348285c.f348320d.mo20123c(C126558c.m206922d(C126460al.f348282a));
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126461am(this.f348284b, this.f348285c, gVar);
    }
}
