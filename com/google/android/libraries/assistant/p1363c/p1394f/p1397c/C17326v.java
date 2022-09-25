package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.c.f.c.v */
/* compiled from: PG */
public final class C17326v {

    /* renamed from: a */
    public static volatile C70716eu f50157a;

    /* renamed from: b */
    private static volatile C70338di f50158b;

    /* renamed from: c */
    private static volatile C70338di f50159c;

    /* renamed from: d */
    private static volatile C70338di f50160d;

    /* renamed from: e */
    private static volatile C70338di f50161e;

    private C17326v() {
    }

    /* renamed from: a */
    public static C70338di m34546a() {
        C70338di diVar = f50159c;
        if (diVar == null) {
            synchronized (C17326v.class) {
                diVar = f50159c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.apa.opahandover.proto.OpaHandoverService", "GetContext");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17306b.f50128a);
                    d.f187486b = C70850d.m103697c(C17308d.f50130c);
                    diVar = d.mo62040a();
                    f50159c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m34547b() {
        C70338di diVar = f50158b;
        if (diVar == null) {
            synchronized (C17326v.class) {
                diVar = f50158b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.apa.opahandover.proto.OpaHandoverService", "GetSupportedClientOps");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17303ab.f50123a);
                    d.f187486b = C70850d.m103697c(C17305ad.f50125b);
                    diVar = d.mo62040a();
                    f50158b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m34548c() {
        C70338di diVar = f50160d;
        if (diVar == null) {
            synchronized (C17326v.class) {
                diVar = f50160d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.apa.opahandover.proto.OpaHandoverService", "Prewarm");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17328x.f50162a);
                    d.f187486b = C70850d.m103697c(C17330z.f50164a);
                    diVar = d.mo62040a();
                    f50160d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m34549d() {
        C70338di diVar = f50161e;
        if (diVar == null) {
            synchronized (C17326v.class) {
                diVar = f50161e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.apa.opahandover.proto.OpaHandoverService", "StreamingHandover");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17313i.f50141c);
                    d.f187486b = C70850d.m103697c(C17317m.f50147c);
                    diVar = d.mo62040a();
                    f50161e = diVar;
                }
            }
        }
        return diVar;
    }
}
