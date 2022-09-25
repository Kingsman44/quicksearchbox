package com.google.android.apps.gsa.assistant.handoff;

import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.assistant.p3862au.C50517a;
import com.google.assistant.p3862au.C50518b;
import com.google.assistant.p3862au.C50519c;
import com.google.assistant.p3862au.C50522f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.w */
/* compiled from: PG */
final class C9490w extends C90878al {

    /* renamed from: a */
    final /* synthetic */ C50522f f32934a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9490w(C50522f fVar) {
        super("use HandoffServiceGrpc futureStub to send request", 1, 4);
        this.f32934a = fVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C70286co coVar = (C70286co) obj;
        if (coVar != null) {
            C50522f fVar = this.f32934a;
            C50518b bVar = (C50518b) C70864c.m103731e(new C50517a(), coVar, C70851i.f189015a);
            C70888j jVar = bVar.f189039a;
            C70338di diVar = C50519c.f131499a;
            if (diVar == null) {
                synchronized (C50519c.class) {
                    diVar = C50519c.f131499a;
                    if (diVar == null) {
                        C70335df d = C70338di.m102603d();
                        d.f187487c = C70337dh.UNARY;
                        d.f187488d = C70338di.m102602c("google.assistant.v1.HandoffService", "SubmitHandoffResult");
                        d.f187489e = true;
                        d.f187485a = C70850d.m103697c(C50522f.f131501d);
                        d.f187486b = C70850d.m103697c(C62912at.f169862a);
                        diVar = d.mo62040a();
                        C50519c.f131499a = diVar;
                    }
                }
            }
            return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), fVar);
        }
        C59104x c = C9492y.f32936a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GrpcHandoffSubmitter");
        ((C59052c) ((C59052c) c).mo56372aa(269)).mo56386p("Failed to create a grpc managed channel, can't perform handoff.");
        throw new RuntimeException("Can't create grpc channel.");
    }
}
