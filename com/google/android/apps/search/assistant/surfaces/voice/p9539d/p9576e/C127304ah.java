package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9576e;

import com.google.android.libraries.assistant.p1533o.C18496n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.searchparams.UpdateOptInContext$transform$1", mo61344c = "UpdateOptInContext.kt", mo61345d = "invokeSuspend", mo61346e = {40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.e.ah */
/* compiled from: PG */
final class C127304ah extends C69572j implements C69630p {

    /* renamed from: a */
    int f350595a;

    /* renamed from: b */
    final /* synthetic */ C127306aj f350596b;

    /* renamed from: c */
    final /* synthetic */ C18496n f350597c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127304ah(C127306aj ajVar, C18496n nVar, C69577g gVar) {
        super(2, gVar);
        this.f350596b = ajVar;
        this.f350597c = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127304ah) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350595a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127306aj ajVar = this.f350596b;
            C18496n nVar = this.f350597c;
            this.f350595a = 1;
            obj = ajVar.mo108010b(nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127304ah(this.f350596b, this.f350597c, gVar);
    }
}
