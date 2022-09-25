package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.android.libraries.search.assistant.p2783s.p2785b.C36383b;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5208h.C66599by;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.cloudlookups.serverfallback.service.S3RequestProducerModule$produceClientInfo$1$createInitialRequestMutator$1", mo61344c = "S3RequestProducerModule.kt", mo61345d = "invokeSuspend", mo61346e = {76})
/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.p */
/* compiled from: PG */
final class C123243p extends C69572j implements C69630p {

    /* renamed from: a */
    int f340960a;

    /* renamed from: b */
    final /* synthetic */ C36383b f340961b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123243p(C36383b bVar, C69577g gVar) {
        super(2, gVar);
        this.f340961b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123243p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f340960a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z a = C71394aa.m104159a((Object) null);
            C36383b bVar = this.f340961b;
            C71816z a2 = C71394aa.m104159a(C58485gu.m89845m());
            this.f340960a = 1;
            obj = bVar.mo40151a("assistant-text", a, a2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C123242o((C66599by) obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123243p(this.f340961b, gVar);
    }
}
