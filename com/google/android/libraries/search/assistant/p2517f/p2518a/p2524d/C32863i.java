package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.i */
/* compiled from: PG */
public final class C32863i {

    /* renamed from: a */
    private static volatile C70338di f88089a;

    /* renamed from: b */
    private static volatile C70338di f88090b;

    /* renamed from: c */
    private static volatile C70338di f88091c;

    /* renamed from: d */
    private static volatile C70716eu f88092d;

    private C32863i() {
    }

    /* renamed from: a */
    public static C70338di m60817a() {
        C70338di diVar = f88090b;
        if (diVar == null) {
            synchronized (C32863i.class) {
                diVar = f88090b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.context.api.proto.ApaContextService", "GetContext");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C32785ag.f87957e);
                    d.f187486b = C70850d.m103697c(C32821bp.f88014d);
                    diVar = d.mo62040a();
                    f88090b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m60818b() {
        C70338di diVar = f88089a;
        if (diVar == null) {
            synchronized (C32863i.class) {
                diVar = f88089a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.context.api.proto.ApaContextService", "GetSupportedKeys");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C32840ch.f88047e);
                    d.f187486b = C70850d.m103697c(C32855cw.f88074b);
                    diVar = d.mo62040a();
                    f88089a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m60819c() {
        C70338di diVar = f88091c;
        if (diVar == null) {
            synchronized (C32863i.class) {
                diVar = f88091c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.context.api.proto.ApaContextService", "ObserveInvalidations");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C32840ch.f88047e);
                    d.f187486b = C70850d.m103697c(C32825bt.f88021b);
                    diVar = d.mo62040a();
                    f88091c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m60820d() {
        C70716eu euVar = f88092d;
        if (euVar == null) {
            synchronized (C32863i.class) {
                euVar = f88092d;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.context.api.proto.ApaContextService");
                    etVar.mo62433a(m60818b());
                    etVar.mo62433a(m60817a());
                    etVar.mo62433a(m60819c());
                    euVar = new C70716eu(etVar);
                    f88092d = euVar;
                }
            }
        }
        return euVar;
    }
}
