package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34121c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34327l;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34330o;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import java.util.Set;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSinkGrpcService$onInvocation$2", mo61344c = "InvocationSinkImpl.kt", mo61345d = "invokeSuspend", mo61346e = {99, 145})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.af */
/* compiled from: PG */
final class C34223af extends C69572j implements C69626l {

    /* renamed from: a */
    Object f91054a;

    /* renamed from: b */
    Object f91055b;

    /* renamed from: c */
    int f91056c;

    /* renamed from: d */
    final /* synthetic */ C34299i f91057d;

    /* renamed from: e */
    final /* synthetic */ C34227aj f91058e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34223af(C34299i iVar, C34227aj ajVar, C69577g gVar) {
        super(1, gVar);
        this.f91057d = iVar;
        this.f91058e = ajVar;
    }

    /* renamed from: e */
    static /* synthetic */ void m62856e(C58872ci ciVar, C34227aj ajVar, C34684d dVar, C34053bp bpVar, Throwable th, int i) {
        if ((i & 8) != 0) {
            bpVar = null;
        }
        if ((i & 16) != 0) {
            th = null;
        }
        Duration ofNanos = Duration.ofNanos(ciVar.mo56159b());
        C69664n.m101060f(ofNanos, "stopwatch.elapsed()");
        String str = th == null ? "SUCCESS" : "FAILURE";
        C59052c cVar = (C59052c) C34227aj.f91065a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.InvocationSink");
        String a = bpVar != null ? C34711b.m63445a(bpVar) : "n/a";
        cVar.mo56379ah(new C59094n(51343));
        cVar.mo56359L("Invocation propagation completed: token(%s), duration(%s), outcome(%s).", a, ofNanos, str);
        C39141kp kpVar = ajVar.f91067c;
        double millis = (double) ofNanos.toMillis();
        C34043bf a2 = C34043bf.m62692a(dVar.f92093b);
        if (a2 == null) {
            a2 = C34043bf.ENTRYPOINT_UNKNOWN;
        }
        ((C19569f) kpVar.f103051w.mo6453a()).mo24824b(millis, a2.name(), str);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34223af(this.f91057d, this.f91058e, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        int i = this.f91056c;
        if (i == 0) {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C34227aj.f91065a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.InvocationSink");
            C34684d dVar = this.f91057d.f91215a;
            if (dVar == null) {
                dVar = C34684d.f92090g;
            }
            C34043bf a = C34043bf.m62692a(dVar.f92093b);
            if (a == null) {
                a = C34043bf.ENTRYPOINT_UNKNOWN;
            }
            String name = a.name();
            cVar.mo56379ah(new C59094n(51342));
            cVar.mo56389s("Starting invocation propagation from invocation source(%s).", name);
            C69626l lVar = this.f91058e.f91073i;
            this.f91056c = 1;
            obj = lVar.mo5761a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i != 1) {
            obj3 = this.f91055b;
            Object obj6 = this.f91054a;
            try {
                obj5 = obj6;
                C69714l.m101134b(obj);
                obj5 = obj6;
                obj4 = obj6;
                obj5 = obj4;
                C34053bp bpVar = (C34053bp) obj;
                m62856e((C58872ci) obj3, this.f91058e, (C34684d) obj4, bpVar, (Throwable) null, 16);
                C34300j jVar = (C34300j) C34304n.f91228c.createBuilder();
                C69664n.m101060f(jVar, "newBuilder()");
                C34287cp a2 = C69664n.m101061g(jVar, "builder");
                C69664n.m101061g(bpVar, "value");
                C34300j jVar2 = a2.f91197a;
                jVar2.copyOnWrite();
                C34304n nVar = (C34304n) jVar2.instance;
                bpVar.getClass();
                nVar.f91231b = bpVar;
                nVar.f91230a = 1;
                return a2.mo39300a();
            } catch (Throwable th) {
                th = th;
                obj2 = obj5;
            }
        } else {
            C69714l.m101134b(obj);
        }
        Set set = (Set) obj;
        C34684d dVar2 = this.f91057d.f91215a;
        if (dVar2 == null) {
            dVar2 = C34684d.f92090g;
        }
        C34043bf a3 = C34043bf.m62692a(dVar2.f92093b);
        if (a3 == null) {
            a3 = C34043bf.ENTRYPOINT_UNKNOWN;
        }
        if (!set.contains(a3)) {
            C34299i iVar = this.f91057d;
            C34300j jVar3 = (C34300j) C34304n.f91228c.createBuilder();
            C69664n.m101060f(jVar3, "newBuilder()");
            C34287cp a4 = C69664n.m101061g(jVar3, "builder");
            C34301k kVar = (C34301k) C34303m.f91223d.createBuilder();
            C69664n.m101060f(kVar, "newBuilder()");
            C34289cr a5 = C69664n.m101061g(kVar, "builder");
            a5.mo39304c(C34302l.NO_ELIGIBLE_INVOCATION_CLIENT);
            C34684d dVar3 = iVar.f91215a;
            if (dVar3 == null) {
                dVar3 = C34684d.f92090g;
            }
            C34043bf a6 = C34043bf.m62692a(dVar3.f92093b);
            if (a6 == null) {
                a6 = C34043bf.ENTRYPOINT_UNKNOWN;
            }
            String name2 = a6.name();
            a5.mo39303b("Invocation source " + name2 + " is not enabled");
            a4.mo39301b(a5.mo39302a());
            return a4.mo39300a();
        }
        C34684d dVar4 = this.f91057d.f91215a;
        if (dVar4 == null) {
            dVar4 = C34684d.f92090g;
        }
        C34684d dVar5 = dVar4;
        C69664n.m101060f(dVar5, "request.invocationInput");
        C62910ar arVar = this.f91057d.f91216b;
        if (arVar == null) {
            arVar = C62910ar.f169858c;
        }
        Duration d = C62950b.m95473d(arVar);
        C69664n.m101060f(d, "toJavaDuration(request.i…tionInputElapsedRealtime)");
        C34227aj ajVar = this.f91058e;
        C39141kp kpVar = ajVar.f91067c;
        double c = (double) (ajVar.f91069e.mo26871c() - d.toMillis());
        C34043bf a7 = C34043bf.m62692a(dVar5.f92093b);
        if (a7 == null) {
            a7 = C34043bf.ENTRYPOINT_UNKNOWN;
        }
        ((C19569f) kpVar.f103050v.mo6453a()).mo24824b(c, a7.name());
        Object d2 = C58872ci.m90947d(this.f91058e.f91068d);
        try {
            C34327l lVar2 = new C34327l(d);
            C34330o oVar = this.f91058e.f91066b;
            this.f91054a = dVar5;
            this.f91055b = d2;
            this.f91056c = 2;
            obj = oVar.mo39315a(dVar5, lVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            obj3 = d2;
            obj4 = dVar5;
            obj5 = obj4;
            C34053bp bpVar2 = (C34053bp) obj;
            m62856e((C58872ci) obj3, this.f91058e, (C34684d) obj4, bpVar2, (Throwable) null, 16);
            C34300j jVar4 = (C34300j) C34304n.f91228c.createBuilder();
            C69664n.m101060f(jVar4, "newBuilder()");
            C34287cp a22 = C69664n.m101061g(jVar4, "builder");
            C69664n.m101061g(bpVar2, "value");
            C34300j jVar22 = a22.f91197a;
            jVar22.copyOnWrite();
            C34304n nVar2 = (C34304n) jVar22.instance;
            bpVar2.getClass();
            nVar2.f91231b = bpVar2;
            nVar2.f91230a = 1;
            return a22.mo39300a();
        } catch (Throwable th2) {
            th = th2;
            obj3 = d2;
            obj2 = dVar5;
            m62856e((C58872ci) obj3, this.f91058e, (C34684d) obj2, (C34053bp) null, th, 8);
            C34300j jVar5 = (C34300j) C34304n.f91228c.createBuilder();
            C69664n.m101060f(jVar5, "newBuilder()");
            C34287cp a8 = C69664n.m101061g(jVar5, "builder");
            C34301k kVar2 = (C34301k) C34303m.f91223d.createBuilder();
            C69664n.m101060f(kVar2, "newBuilder()");
            C34289cr a9 = C69664n.m101061g(kVar2, "builder");
            String message = th.getMessage();
            if (message == null) {
                message = BuildConfig.FLAVOR;
            }
            a9.mo39303b(message);
            if (th instanceof C34121c) {
                a9.mo39304c(C34302l.NO_ELIGIBLE_INVOCATION_CLIENT);
            }
            a8.mo39301b(a9.mo39302a());
            return a8.mo39300a();
        }
    }
}
