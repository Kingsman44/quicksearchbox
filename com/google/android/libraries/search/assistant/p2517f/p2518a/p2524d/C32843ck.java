package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.ck */
/* compiled from: PG */
public final class C32843ck {

    /* renamed from: a */
    private static volatile C70338di f88054a;

    /* renamed from: b */
    private static volatile C70716eu f88055b;

    private C32843ck() {
    }

    /* renamed from: a */
    public static C70338di m60806a() {
        C70338di diVar = f88054a;
        if (diVar == null) {
            synchronized (C32843ck.class) {
                diVar = f88054a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.context.api.proto.RootParentSessionService", "GetRootParentSessionToken");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C32849cq.f88059c);
                    diVar = d.mo62040a();
                    f88054a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m60807b() {
        C70716eu euVar = f88055b;
        if (euVar == null) {
            synchronized (C32843ck.class) {
                euVar = f88055b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.context.api.proto.RootParentSessionService");
                    etVar.mo62433a(m60806a());
                    euVar = new C70716eu(etVar);
                    f88055b = euVar;
                }
            }
        }
        return euVar;
    }
}
