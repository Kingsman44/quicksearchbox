package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.p9312g.p9313a.p9314a;

import com.google.android.libraries.search.assistant.p2783s.p2785b.C36404w;
import com.google.common.p4522b.C58485gu;
import com.google.speech.p5208h.C66615cm;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.cloudlookups.serverfallback.service.S3RequestProducerModule$produceUserInfo$1$createInitialRequestMutator$1", mo61344c = "S3RequestProducerModule.kt", mo61345d = "invokeSuspend", mo61346e = {98})
/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.g.a.a.s */
/* compiled from: PG */
final class C123246s extends C69572j implements C69630p {

    /* renamed from: a */
    int f340965a;

    /* renamed from: b */
    final /* synthetic */ C36404w f340966b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C123246s(C36404w wVar, C69577g gVar) {
        super(2, gVar);
        this.f340966b = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C123246s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f340965a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36404w wVar = this.f340966b;
            C71816z a = C71394aa.m104159a("en-US");
            C71816z a2 = C71394aa.m104159a("en-US");
            C71816z a3 = C71394aa.m104159a(C58485gu.m89845m());
            this.f340965a = 1;
            obj = wVar.mo40159b(true, a, a2, a3, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C123245r((C66615cm) obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C123246s(this.f340966b, gVar);
    }
}
