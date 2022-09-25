package com.google.android.libraries.search.assistant.invocation.p2650m;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5481k.C69706d;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.pinning.ApaPinningManager$onLifecycleAction$failures$1$1", mo61344c = "ApaPinningManager.kt", mo61345d = "invokeSuspend", mo61346e = {128})
/* renamed from: com.google.android.libraries.search.assistant.invocation.m.k */
/* compiled from: PG */
final class C33962k extends C69572j implements C69630p {

    /* renamed from: a */
    int f90560a;

    /* renamed from: b */
    final /* synthetic */ C69706d f90561b;

    /* renamed from: c */
    final /* synthetic */ C33952a f90562c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33962k(C69706d dVar, C33952a aVar, C69577g gVar) {
        super(2, gVar);
        this.f90561b = dVar;
        this.f90562c = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33962k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f90560a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f90560a = 1;
            obj = C71663i.m104690c((C60870cx) ((C69626l) this.f90561b).mo5761a(this.f90562c), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33962k(this.f90561b, this.f90562c, gVar);
    }
}
