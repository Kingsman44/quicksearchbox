package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.e */
/* compiled from: PG */
public final class C33531e {

    /* renamed from: a */
    private static volatile C70338di f89699a;

    /* renamed from: b */
    private static volatile C70338di f89700b;

    /* renamed from: c */
    private static volatile C70716eu f89701c;

    private C33531e() {
    }

    /* renamed from: a */
    public static C70338di m62121a() {
        C70338di diVar = f89699a;
        if (diVar == null) {
            synchronized (C33531e.class) {
                diVar = f89699a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.invocation.assistdata.service.ApaAssistDataService", "GetAssistData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33536j.f89702b);
                    d.f187486b = C70850d.m103697c(C33538l.f89705a);
                    diVar = d.mo62040a();
                    f89699a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m62122b() {
        C70338di diVar = f89700b;
        if (diVar == null) {
            synchronized (C33531e.class) {
                diVar = f89700b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.search.assistant.invocation.assistdata.service.ApaAssistDataService", "GetScreenshot");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33540n.f89707b);
                    d.f187486b = C70850d.m103697c(C33542p.f89710a);
                    diVar = d.mo62040a();
                    f89700b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m62123c() {
        C70716eu euVar = f89701c;
        if (euVar == null) {
            synchronized (C33531e.class) {
                euVar = f89701c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.search.assistant.invocation.assistdata.service.ApaAssistDataService");
                    etVar.mo62433a(m62121a());
                    etVar.mo62433a(m62122b());
                    euVar = new C70716eu(etVar);
                    f89701c = euVar;
                }
            }
        }
        return euVar;
    }
}
