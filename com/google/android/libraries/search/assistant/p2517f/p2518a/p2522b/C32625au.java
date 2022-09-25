package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71394aa;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionRootService$run$2$1$1$2", mo61344c = "AccessSessionRootService.kt", mo61345d = "invokeSuspend", mo61346e = {129})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.au */
/* compiled from: PG */
final class C32625au extends C69572j implements C69630p {

    /* renamed from: a */
    int f87424a;

    /* renamed from: b */
    final /* synthetic */ C32636be f87425b;

    /* renamed from: c */
    private /* synthetic */ Object f87426c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32625au(C32636be beVar, C69577g gVar) {
        super(2, gVar);
        this.f87425b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32625au) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C71816z zVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87424a != 0) {
            zVar = (C71816z) this.f87426c;
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f87426c;
            C32636be beVar = this.f87425b;
            C71816z zVar2 = beVar.f87467h;
            try {
                this.f87426c = zVar2;
                this.f87424a = 1;
                obj = beVar.mo38190c(this);
                if (obj == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } catch (Throwable th2) {
                th = th2;
                zVar = zVar2;
                obj2 = C69714l.m101133a(th);
                C71394aa.m104160b(zVar, obj2);
                return C69788q.f186170a;
            }
        }
        obj2 = (String) obj;
        C71394aa.m104160b(zVar, obj2);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32625au auVar = new C32625au(this.f87425b, gVar);
        auVar.f87426c = obj;
        return auVar;
    }
}
