package com.google.android.libraries.search.assistant.p2486aa.p2492c;

import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32321q;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32324t;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.SbcpInternalServiceImpl$fetchLocaleAndRecognitionContext$context$1", mo61344c = "SbcpInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {215})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.d */
/* compiled from: PG */
final class C32351d extends C69572j implements C69630p {

    /* renamed from: a */
    int f86700a;

    /* renamed from: b */
    final /* synthetic */ C32357j f86701b;

    /* renamed from: c */
    final /* synthetic */ C32603b f86702c;

    /* renamed from: d */
    final /* synthetic */ C32849cq f86703d;

    /* renamed from: e */
    final /* synthetic */ int f86704e;

    /* renamed from: f */
    final /* synthetic */ Duration f86705f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32351d(C32357j jVar, C32603b bVar, C32849cq cqVar, int i, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f86701b = jVar;
        this.f86702c = bVar;
        this.f86703d = cqVar;
        this.f86704e = i;
        this.f86705f = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32351d) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86700a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32324t tVar = this.f86701b.f86731b;
            C32603b bVar = this.f86702c;
            C32849cq cqVar = this.f86703d;
            int i = this.f86704e;
            Duration duration = this.f86705f;
            this.f86700a = 1;
            obj = C71803m.m105040a(tVar.f86624a.mo5702lZ(), new C32321q(tVar, bVar, cqVar, i, duration, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32351d(this.f86701b, this.f86702c, this.f86703d, this.f86704e, this.f86705f, gVar);
    }
}
