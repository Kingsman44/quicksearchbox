package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.common.p4580v.p4582b.C60942a;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71688dx;
import kotlinx.coroutines.C71745ea;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$ifOpenAsync$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {316, 316})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.v */
/* compiled from: PG */
final class C32769v extends C69572j implements C69630p {

    /* renamed from: a */
    int f87928a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87929b;

    /* renamed from: c */
    final /* synthetic */ Duration f87930c;

    /* renamed from: d */
    final /* synthetic */ C69630p f87931d;

    /* renamed from: e */
    private /* synthetic */ Object f87932e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32769v(C32607ac acVar, Duration duration, C69630p pVar, C69577g gVar) {
        super(2, gVar);
        this.f87929b = acVar;
        this.f87930c = duration;
        this.f87931d = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32769v) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87928a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (C71688dx e) {
                TimeoutException timeoutException = new TimeoutException(e.getMessage());
                timeoutException.initCause(e);
                throw timeoutException;
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f87932e;
            if (this.f87929b.f87319j.mo62867mj()) {
                Duration duration = this.f87930c;
                if (duration != null) {
                    C69630p pVar = this.f87931d;
                    this.f87928a = 1;
                    obj = C71745ea.m104929a(C60942a.m93083a(duration), pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    C69630p pVar2 = this.f87931d;
                    this.f87928a = 2;
                    obj = pVar2.mo5192a(awVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            } else {
                throw C34830d.m63594a(C34830d.m63595b(C32662cd.m60549a(this.f87929b.f87318i)));
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32769v vVar = new C32769v(this.f87929b, this.f87930c, this.f87931d, gVar);
        vVar.f87932e = obj;
        return vVar;
    }
}
