package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a;

import com.google.android.apps.gsa.binaries.satin.app.ask;
import com.google.android.apps.gsa.binaries.satin.app.asl;
import com.google.android.apps.gsa.binaries.satin.app.aso;
import com.google.android.libraries.search.p2904c.p2967t.p2969b.C38055z;
import com.google.android.libraries.search.p2904c.p2982x.C38248g;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.function.Consumer;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.input.api.impl.AudioInputAccessorImpl$open$1", mo61344c = "AudioInputAccessorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.a.a.b */
/* compiled from: PG */
public final class C33641b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f89892a;

    /* renamed from: b */
    int f89893b;

    /* renamed from: c */
    final /* synthetic */ C33643d f89894c;

    /* renamed from: d */
    final /* synthetic */ Consumer f89895d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33641b(C33643d dVar, Consumer consumer, C69577g gVar) {
        super(2, gVar);
        this.f89894c = dVar;
        this.f89895d = consumer;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33641b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89893b != 0) {
            Object obj2 = this.f89892a;
            C69714l.m101134b(obj);
            return obj2;
        }
        C69714l.m101134b(obj);
        C33643d dVar = this.f89894c;
        ask ask = dVar.f89900d;
        aso aso = ask.f201459a.a.d;
        C33651l lVar = new C33651l(dVar.f89897a, (asl) ask.f201459a.a.d.f201690dq.mo17428b(), new C38055z((C38248g) aso.f201488a.b.f200050cK.mo17428b(), aso.f201691dr, (C71422aw) aso.f201488a.H.mo17428b()), (C71422aw) ask.f201459a.a.H.mo17428b(), (Executor) ask.f201459a.a.n.mo17428b(), (C71422aw) ask.f201459a.a.ft.mo17428b());
        Consumer consumer = this.f89895d;
        this.f89892a = lVar;
        this.f89893b = 1;
        return lVar.mo39018f(consumer, this) != aVar ? lVar : aVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C33641b(this.f89894c, this.f89895d, gVar);
    }
}
