package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9068b.p9069a;

import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.network.impl.clientinfo.s3requestproducers.ClientInfoS3RequestProducer$createInitialRequestMutator$1$userAgent$1", mo61344c = "ClientInfoS3RequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.assistant.platform.e.a.b.a.b */
/* compiled from: PG */
final class C120172b extends C69572j implements C69630p {

    /* renamed from: a */
    int f334445a;

    /* renamed from: b */
    final /* synthetic */ C120174d f334446b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120172b(C120174d dVar, C69577g gVar) {
        super(2, gVar);
        this.f334446b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120172b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334445a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx cxVar = this.f334446b.f334452c;
            this.f334445a = 1;
            obj = C71663i.m104690c(cxVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return ((C119937f) obj).mo104573c().orElse(null);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120172b(this.f334446b, gVar);
    }
}
