package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.c.m */
/* compiled from: PG */
public final class C32344m {

    /* renamed from: a */
    private static volatile C70338di f86691a;

    /* renamed from: b */
    private static volatile C70338di f86692b;

    /* renamed from: c */
    private static volatile C70716eu f86693c;

    private C32344m() {
    }

    /* renamed from: a */
    public static C70338di m60139a() {
        C70338di diVar = f86691a;
        if (diVar == null) {
            synchronized (C32344m.class) {
                diVar = f86691a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.speechbiasingcontext.service.proto.SbcpInternalService", "FetchSpeechBiasingContext");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C32337f.f86678b);
                    d.f187486b = C70850d.m103697c(C32339h.f86681c);
                    diVar = d.mo62040a();
                    f86691a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m60140b() {
        C70338di diVar = f86692b;
        if (diVar == null) {
            synchronized (C32344m.class) {
                diVar = f86692b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.speechbiasingcontext.service.proto.SbcpInternalService", "RegisterSpeechBiasingContextSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C32341j.f86686b);
                    d.f187486b = C70850d.m103697c(C32343l.f86689a);
                    diVar = d.mo62040a();
                    f86692b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m60141c() {
        C70716eu euVar = f86693c;
        if (euVar == null) {
            synchronized (C32344m.class) {
                euVar = f86693c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.speechbiasingcontext.service.proto.SbcpInternalService");
                    etVar.mo62433a(m60139a());
                    etVar.mo62433a(m60140b());
                    euVar = new C70716eu(etVar);
                    f86693c = euVar;
                }
            }
        }
        return euVar;
    }
}
