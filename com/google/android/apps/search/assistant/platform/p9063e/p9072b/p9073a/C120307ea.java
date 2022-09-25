package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66615cm;
import dagger.p5295b.C68283d;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.network.onlineprocessing.impl.S3UserInfoProducerModule$produceUserInfoProducer$1$createInitialRequestMutator$1", mo61344c = "S3UserInfoProducerModule.kt", mo61345d = "invokeSuspend", mo61346e = {109})
/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.ea */
/* compiled from: PG */
final class C120307ea extends C69572j implements C69630p {

    /* renamed from: a */
    int f334731a;

    /* renamed from: b */
    final /* synthetic */ C68283d f334732b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120307ea(C68283d dVar, C69577g gVar) {
        super(2, gVar);
        this.f334732b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120307ea) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334731a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx gq = this.f334732b.mo60297gq();
            C69664n.m101060f(gq, "userInfoProducer.get()");
            this.f334731a = 1;
            obj = C71663i.m104690c(gq, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return new C120298dz((C66615cm) obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120307ea(this.f334732b, gVar);
    }
}
