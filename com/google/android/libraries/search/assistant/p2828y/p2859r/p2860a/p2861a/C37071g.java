package com.google.android.libraries.search.assistant.p2828y.p2859r.p2860a.p2861a;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.libraries.search.assistant.y.r.a.a.g */
/* compiled from: PG */
public final class C37071g {

    /* renamed from: a */
    public static volatile C70716eu f96559a;

    /* renamed from: b */
    private static volatile C70338di f96560b;

    private C37071g() {
    }

    /* renamed from: a */
    public static C37068d m65835a(C70888j jVar) {
        return (C37068d) C70864c.m103731e(new C37067c(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m65836b() {
        C70338di diVar = f96560b;
        if (diVar == null) {
            synchronized (C37071g.class) {
                diVar = f96560b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.requestcontext.shared.geller.proto.GellerCorpusSyncListenerService", "OnSyncCompleted");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C37066b.f96554c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f96560b = diVar;
                }
            }
        }
        return diVar;
    }
}
