package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bg */
/* compiled from: PG */
public final class C123740bg {

    /* renamed from: a */
    private static volatile C70338di f341795a;

    /* renamed from: b */
    private static volatile C70338di f341796b;

    /* renamed from: c */
    private static volatile C70338di f341797c;

    /* renamed from: d */
    private static volatile C70338di f341798d;

    /* renamed from: e */
    private static volatile C70716eu f341799e;

    private C123740bg() {
    }

    /* renamed from: a */
    public static C70338di m203093a() {
        C70338di diVar = f341796b;
        if (diVar == null) {
            synchronized (C123740bg.class) {
                diVar = f341796b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService", "GetProactiveContent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C123735bb.f341782d);
                    d.f187486b = C70850d.m103697c(C123737bd.f341788c);
                    diVar = d.mo62040a();
                    f341796b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m203094b() {
        C70338di diVar = f341795a;
        if (diVar == null) {
            synchronized (C123740bg.class) {
                diVar = f341795a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService", "GetProactiveContentStream");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C123735bb.f341782d);
                    d.f187486b = C70850d.m103697c(C123737bd.f341788c);
                    diVar = d.mo62040a();
                    f341795a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m203095c() {
        C70338di diVar = f341797c;
        if (diVar == null) {
            synchronized (C123740bg.class) {
                diVar = f341797c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService", "RegisterListener");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C123716aj.f341727c);
                    d.f187486b = C70850d.m103697c(C123718al.f341732c);
                    diVar = d.mo62040a();
                    f341797c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m203096d() {
        C70338di diVar = f341798d;
        if (diVar == null) {
            synchronized (C123740bg.class) {
                diVar = f341798d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService", "UnregisterListener");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C123716aj.f341727c);
                    d.f187486b = C70850d.m103697c(C123718al.f341732c);
                    diVar = d.mo62040a();
                    f341798d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70716eu m203097e() {
        C70716eu euVar = f341799e;
        if (euVar == null) {
            synchronized (C123740bg.class) {
                euVar = f341799e;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.pcp.proto.PcpDataService");
                    etVar.mo62433a(m203094b());
                    etVar.mo62433a(m203093a());
                    etVar.mo62433a(m203095c());
                    etVar.mo62433a(m203096d());
                    euVar = new C70716eu(etVar);
                    f341799e = euVar;
                }
            }
        }
        return euVar;
    }
}
