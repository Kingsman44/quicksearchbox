package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34121c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4750c.C62948a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.InvocationSinkImpl$onInvocation$1", mo61344c = "InvocationSinkImpl.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.al */
/* compiled from: PG */
final class C34229al extends C69572j implements C69630p {

    /* renamed from: a */
    int f91075a;

    /* renamed from: b */
    final /* synthetic */ C34684d f91076b;

    /* renamed from: c */
    final /* synthetic */ C34230am f91077c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34229al(C34684d dVar, C34230am amVar, C69577g gVar) {
        super(2, gVar);
        this.f91076b = dVar;
        this.f91077c = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34229al) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C34303m mVar;
        Throwable th;
        C34303m mVar2;
        C34303m mVar3;
        C34053bp bpVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91075a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C34230am.f91078a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "TRG.InvocationSink");
            C34043bf a = C34043bf.m62692a(this.f91076b.f92093b);
            if (a == null) {
                a = C34043bf.ENTRYPOINT_UNKNOWN;
            }
            String name = a.name();
            cVar.mo56379ah(new C59094n(51344));
            cVar.mo56389s("On new invocation request(%s).", name);
            C34684d dVar = this.f91076b;
            C34230am amVar = this.f91077c;
            C34298h hVar = (C34298h) C34299i.f91213c.createBuilder();
            C69664n.m101060f(hVar, "newBuilder()");
            C69664n.m101061g(hVar, "builder");
            C69664n.m101061g(dVar, "value");
            hVar.copyOnWrite();
            dVar.getClass();
            ((C34299i) hVar.instance).f91215a = dVar;
            C62910ar l = C62948a.m95461l(amVar.f91080c.mo26872d());
            C69664n.m101060f(l, "fromNanos(clock.elapsedRealtimeNanos())");
            C69664n.m101061g(l, "value");
            hVar.copyOnWrite();
            l.getClass();
            ((C34299i) hVar.instance).f91216b = l;
            C62942bv build = hVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C34222ae aeVar = this.f91077c.f91079b;
            this.f91075a = 1;
            obj = aeVar.mo39275b((C34299i) build, new C70334de(), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C34304n nVar = (C34304n) obj;
        int i = nVar.f91230a;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        int[] iArr = C34228ak.f91074a;
        if (i2 == 0) {
            throw null;
        } else if (iArr[i3] == 1) {
            if (nVar.f91230a == 1) {
                bpVar = (C34053bp) nVar.f91231b;
            } else {
                bpVar = C34053bp.f90753a;
            }
            C69664n.m101060f(bpVar, "token");
            return bpVar;
        } else {
            if (nVar.f91230a == 2) {
                mVar = (C34303m) nVar.f91231b;
            } else {
                mVar = C34303m.f91223d;
            }
            C34302l a2 = C34302l.m62963a(mVar.f91226b);
            if (a2 == null) {
                a2 = C34302l.UNRECOGNIZED;
            }
            if (a2 == C34302l.NO_ELIGIBLE_INVOCATION_CLIENT) {
                if (nVar.f91230a == 2) {
                    mVar3 = (C34303m) nVar.f91231b;
                } else {
                    mVar3 = C34303m.f91223d;
                }
                th = new C34121c(mVar3.f91227c);
            } else {
                Status status = Status.f186905c;
                if (nVar.f91230a == 2) {
                    mVar2 = (C34303m) nVar.f91231b;
                } else {
                    mVar2 = C34303m.f91223d;
                }
                th = status.withDescription(mVar2.f91227c).asException();
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34229al(this.f91076b, this.f91077c, gVar);
    }
}
