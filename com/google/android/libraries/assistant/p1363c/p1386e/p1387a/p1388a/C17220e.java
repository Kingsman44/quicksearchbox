package com.google.android.libraries.assistant.p1363c.p1386e.p1387a.p1388a;

import com.google.android.libraries.search.integrations.p3013a.p3014a.C38487e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.network.apas3client.commons3request.CommonS3RequestProducer$produceDeviceArbitrationInfo$1$createInitialRequestMutator$1$deviceIdDeferred$1", mo61344c = "CommonS3RequestProducer.kt", mo61345d = "invokeSuspend", mo61346e = {52})
/* renamed from: com.google.android.libraries.assistant.c.e.a.a.e */
/* compiled from: PG */
final class C17220e extends C69572j implements C69630p {

    /* renamed from: a */
    int f49966a;

    /* renamed from: b */
    final /* synthetic */ C38487e f49967b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17220e(C38487e eVar, C69577g gVar) {
        super(2, gVar);
        this.f49967b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17220e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f49966a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C47633f a = this.f49967b.mo41441a();
            C69664n.m101060f(a, "clientInstanceIdGenerator.generate()");
            this.f49966a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17220e(this.f49967b, gVar);
    }
}
