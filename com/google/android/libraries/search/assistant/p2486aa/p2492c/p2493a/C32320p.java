package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.C69685i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.impl.ContextFetcher$fetchSpeechBiasingContext$2$1", mo61344c = "ContextFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.p */
/* compiled from: PG */
final class C32320p extends C69572j implements C69630p {

    /* renamed from: a */
    int f86601a;

    /* renamed from: b */
    /* synthetic */ Object f86602b;

    /* renamed from: c */
    final /* synthetic */ C32324t f86603c;

    /* renamed from: d */
    final /* synthetic */ C32849cq f86604d;

    /* renamed from: e */
    final /* synthetic */ C32603b f86605e;

    /* renamed from: f */
    final /* synthetic */ int f86606f;

    /* renamed from: g */
    final /* synthetic */ Duration f86607g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32320p(C32324t tVar, C32849cq cqVar, C32603b bVar, int i, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f86603c = tVar;
        this.f86604d = cqVar;
        this.f86605e = bVar;
        this.f86606f = i;
        this.f86607g = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32320p) mo5194c((C32781ac) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C32796ar arVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f86601a != 0) {
            arVar = (C32796ar) this.f86602b;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32781ac acVar = (C32781ac) this.f86602b;
            C32796ar arVar2 = acVar.f87953b;
            if (arVar2 == null) {
                arVar2 = C32796ar.f87973c;
            }
            C32324t tVar = this.f86603c;
            C32849cq cqVar = this.f86604d;
            C32603b bVar = this.f86605e;
            Optional of = Optional.m71637of(new Integer(this.f86606f));
            C69664n.m101060f(of, "of(requestId)");
            Duration duration = this.f86607g;
            this.f86602b = arVar2;
            this.f86601a = 1;
            Object a = tVar.mo38038a(cqVar, bVar, acVar, of, duration, this);
            if (a == aVar) {
                return aVar;
            }
            arVar = arVar2;
            obj = a;
        }
        return new C69685i(arVar, obj);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32320p pVar = new C32320p(this.f86603c, this.f86604d, this.f86605e, this.f86606f, this.f86607g, gVar);
        pVar.f86602b = obj;
        return pVar;
    }
}
