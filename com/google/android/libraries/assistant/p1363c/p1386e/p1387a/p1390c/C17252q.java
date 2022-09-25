package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1390c;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.impl.S3RequestProducersKt$streamToFlow$1", mo61344c = "S3RequestProducers.kt", mo61345d = "invokeSuspend", mo61346e = {34})
/* renamed from: com.google.android.libraries.assistant.c.e.a.c.q */
/* compiled from: PG */
final class C17252q extends C69572j implements C69630p {

    /* renamed from: a */
    int f50021a;

    /* renamed from: b */
    final /* synthetic */ C17266e f50022b;

    /* renamed from: c */
    private /* synthetic */ Object f50023c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17252q(C17266e eVar, C69577g gVar) {
        super(2, gVar);
        this.f50022b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17252q) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C71361ao aoVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50021a != 0) {
            aoVar = (C71361ao) this.f50023c;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar2 = (C71361ao) this.f50023c;
            C60870cx c = this.f50022b.mo23246c(new C17251p(aoVar2));
            C69664n.m101060f(c, "streamTo { s3Request: S3…traight through\n        }");
            this.f50023c = aoVar2;
            this.f50021a = 1;
            if (C71663i.m104690c(c, this) == aVar) {
                return aVar;
            }
            aoVar = aoVar2;
        }
        aoVar.mo62727D((Throwable) null);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C17252q qVar = new C17252q(this.f50022b, gVar);
        qVar.f50023c = obj;
        return qVar;
    }
}
