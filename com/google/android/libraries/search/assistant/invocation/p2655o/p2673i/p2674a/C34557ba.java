package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$shutdownAction$2", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {218})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.ba */
/* compiled from: PG */
final class C34557ba extends C69572j implements C69626l {

    /* renamed from: a */
    int f91813a;

    /* renamed from: b */
    final /* synthetic */ C39379a f91814b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34557ba(C39379a aVar, C69577g gVar) {
        super(1, gVar);
        this.f91814b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34557ba(this.f91814b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91813a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f91814b.mo41787b();
            C69664n.m101060f(b, "delegate.shutdown()");
            this.f91813a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
