package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9068b.p9069a;

import com.google.android.libraries.search.assistant.p2783s.p2785b.C36383b;
import com.google.speech.p5208h.C66599by;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.network.impl.clientinfo.s3requestproducers.ClientInfoS3RequestProducer$createInitialRequestMutator$1", mo61344c = "ClientInfoS3RequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.apps.search.assistant.platform.e.a.b.a.c */
/* compiled from: PG */
final class C120173c extends C69572j implements C69630p {

    /* renamed from: a */
    int f334447a;

    /* renamed from: b */
    final /* synthetic */ C120174d f334448b;

    /* renamed from: c */
    private /* synthetic */ Object f334449c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120173c(C120174d dVar, C69577g gVar) {
        super(2, gVar);
        this.f334448b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120173c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334447a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be c = C71803m.m105042c((C71422aw) this.f334449c, (C69585o) null, (C71424ay) null, new C120172b(this.f334448b, (C69577g) null), 3);
            C120174d dVar = this.f334448b;
            C36383b bVar = dVar.f334450a;
            String str = dVar.f334451b;
            C71604be d = C71663i.m104691d(dVar.f334453d);
            this.f334447a = 1;
            obj = bVar.mo40151a(str, c, d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C120171a((C66599by) obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120173c cVar = new C120173c(this.f334448b, gVar);
        cVar.f334449c = obj;
        return cVar;
    }
}
