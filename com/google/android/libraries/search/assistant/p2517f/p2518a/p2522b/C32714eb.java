package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.SessionImpl$recordStartupLatency$1", mo61344c = "SessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {154})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.eb */
/* compiled from: PG */
final class C32714eb extends C69572j implements C69630p {

    /* renamed from: a */
    int f87676a;

    /* renamed from: b */
    final /* synthetic */ C32716ed f87677b;

    /* renamed from: c */
    final /* synthetic */ Duration f87678c;

    /* renamed from: d */
    private /* synthetic */ Object f87679d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32714eb(C32716ed edVar, Duration duration, C69577g gVar) {
        super(2, gVar);
        this.f87677b = edVar;
        this.f87678c = duration;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32714eb) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87676a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f87679d;
            C32716ed edVar = this.f87677b;
            Duration duration = this.f87678c;
            C32750fk fkVar = edVar.f87689f;
            this.f87676a = 1;
            if (fkVar.mo38276i(duration, this) == aVar) {
                return aVar;
            }
        }
        obj2 = C69788q.f186170a;
        C32716ed edVar2 = this.f87677b;
        Throwable a = C69702k.m101124a(obj2);
        if (a != null) {
            C59052c cVar = (C59052c) C32716ed.f87685b.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Context.Source");
            C59104x g = cVar.mo56382g(a);
            C69664n.m101060f(g, "logger.atWarning().withCause(it)");
            C59052c a2 = C32692dg.m60595a((C59052c) g, edVar2.f87687d);
            a2.mo56379ah(new C59094n(50597));
            a2.mo56386p("Session startup latency logging failed.");
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32714eb ebVar = new C32714eb(this.f87677b, this.f87678c, gVar);
        ebVar.f87679d = obj;
        return ebVar;
    }
}
