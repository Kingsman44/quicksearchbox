package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.c.c.i */
/* compiled from: PG */
public final class C119716i {

    /* renamed from: a */
    private static volatile C70338di f333532a;

    /* renamed from: b */
    private static volatile C70716eu f333533b;

    private C119716i() {
    }

    /* renamed from: a */
    public static C70338di m198629a() {
        C70338di diVar = f333532a;
        if (diVar == null) {
            synchronized (C119716i.class) {
                diVar = f333532a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.conversation.api.extensions.s3responsestream.proto.OpaHandoverStreamStore", "Fetch");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119709b.f333525a);
                    d.f187486b = C70850d.m103697c(C119711d.f333527b);
                    diVar = d.mo62040a();
                    f333532a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m198630b() {
        C70716eu euVar = f333533b;
        if (euVar == null) {
            synchronized (C119716i.class) {
                euVar = f333533b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.conversation.api.extensions.s3responsestream.proto.OpaHandoverStreamStore");
                    etVar.mo62433a(m198629a());
                    euVar = new C70716eu(etVar);
                    f333533b = euVar;
                }
            }
        }
        return euVar;
    }
}
