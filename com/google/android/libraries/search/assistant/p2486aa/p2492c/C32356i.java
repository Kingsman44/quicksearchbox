package com.google.android.libraries.search.assistant.p2486aa.p2492c;

import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32327w;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.p3055n.C39275ay;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39353bb;
import com.google.android.libraries.search.p3055n.C39665cs;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.C39668cv;
import com.google.speech.p5218j.p5219a.C66722az;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.SbcpInternalServiceImpl$registerSpeechBiasingContextSession$job$1", mo61344c = "SbcpInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.i */
/* compiled from: PG */
final class C32356i extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C32357j f86725a;

    /* renamed from: b */
    final /* synthetic */ C66722az f86726b;

    /* renamed from: c */
    final /* synthetic */ String f86727c;

    /* renamed from: d */
    final /* synthetic */ C32849cq f86728d;

    /* renamed from: e */
    final /* synthetic */ int f86729e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32356i(C32357j jVar, C66722az azVar, String str, C32849cq cqVar, int i, C69577g gVar) {
        super(2, gVar);
        this.f86725a = jVar;
        this.f86726b = azVar;
        this.f86727c = str;
        this.f86728d = cqVar;
        this.f86729e = i;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32356i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C32327w wVar = this.f86725a.f86732c;
        C66722az azVar = this.f86726b;
        String str = this.f86727c;
        C32849cq cqVar = this.f86728d;
        Optional of = Optional.m71637of(new Integer(this.f86729e));
        C69664n.m101060f(of, "of(requestId)");
        C69664n.m101061g(azVar, "recognitionContext");
        C69664n.m101061g(str, "locale");
        C69664n.m101061g(cqVar, "sessionToken");
        C69664n.m101061g(of, "requestId");
        C39665cs csVar = (C39665cs) C39666ct.f104415e.createBuilder();
        C69664n.m101060f(csVar, "newBuilder()");
        C39668cv a = C69664n.m101061g(csVar, "builder");
        C69664n.m101061g(azVar, "value");
        C39665cs csVar2 = a.f104423a;
        csVar2.copyOnWrite();
        C39666ct ctVar = (C39666ct) csVar2.instance;
        azVar.getClass();
        ctVar.f104420c = azVar;
        ctVar.f104419b = 1;
        C39275ay ayVar = (C39275ay) C39276az.f103456b.createBuilder();
        C69664n.m101060f(ayVar, "newBuilder()");
        C39353bb a2 = C69664n.m101061g(ayVar, "builder");
        a2.mo41782c();
        a2.mo41781b(str);
        a.mo41981b(a2.mo41780a());
        wVar.mo38040a(a.mo41980a(), cqVar, of);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32356i(this.f86725a, this.f86726b, this.f86727c, this.f86728d, this.f86729e, gVar);
    }
}
