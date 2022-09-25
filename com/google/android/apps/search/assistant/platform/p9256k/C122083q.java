package com.google.android.apps.search.assistant.platform.p9256k;

import com.google.android.libraries.assistant.p1533o.C18439ab;
import com.google.android.libraries.assistant.p1533o.C18462ay;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.voicesearch.VoiceSearchRouterFactory$InstanceProvider$extractInstanceReference$1", mo61344c = "VoiceSearchRouterFactory.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.assistant.platform.k.q */
/* compiled from: PG */
final class C122083q extends C69572j implements C69630p {

    /* renamed from: a */
    int f338707a;

    /* renamed from: b */
    final /* synthetic */ C122085s f338708b;

    /* renamed from: c */
    final /* synthetic */ C70334de f338709c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122083q(C122085s sVar, C70334de deVar, C69577g gVar) {
        super(2, gVar);
        this.f338708b = sVar;
        this.f338709c = deVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C122083q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f338707a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            this.f338707a = 1;
            obj = this.f338708b.mo105526c((C18462ay) this.f338709c.mo62027b(C18439ab.f52340a), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C122083q(this.f338708b, this.f338709c, gVar);
    }
}
