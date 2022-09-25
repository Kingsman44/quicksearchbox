package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.ExternalHotwordVerificationAdapterImpl$hotwordArchitecture$1", mo61344c = "ExternalHotwordVerificationAdapter.kt", mo61345d = "invokeSuspend", mo61346e = {70})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.i */
/* compiled from: PG */
final class C34475i extends C69572j implements C69626l {

    /* renamed from: a */
    int f91604a;

    /* renamed from: b */
    final /* synthetic */ C34478l f91605b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34475i(C34478l lVar, C69577g gVar) {
        super(1, gVar);
        this.f91605b = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34475i(this.f91605b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91604a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f91605b.f91619b.mo39227a();
            this.f91604a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
