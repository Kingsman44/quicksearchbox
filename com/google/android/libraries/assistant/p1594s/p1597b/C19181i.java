package com.google.android.libraries.assistant.p1594s.p1597b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.s.b.i */
/* compiled from: PG */
public final class C19181i {

    /* renamed from: a */
    public static volatile C70716eu f53718a;

    /* renamed from: b */
    private static volatile C70338di f53719b;

    /* renamed from: c */
    private static volatile C70338di f53720c;

    /* renamed from: d */
    private static volatile C70338di f53721d;

    private C19181i() {
    }

    /* renamed from: a */
    public static C70338di m36583a() {
        C70338di diVar = f53720c;
        if (diVar == null) {
            synchronized (C19181i.class) {
                diVar = f53720c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.AssistantTapasService", "ClientStatusUpdated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19185m.f53723f);
                    d.f187486b = C70850d.m103697c(C19187o.f53730c);
                    diVar = d.mo62040a();
                    f53720c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m36584b() {
        C70338di diVar = f53719b;
        if (diVar == null) {
            synchronized (C19181i.class) {
                diVar = f53719b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.AssistantTapasService", "GetSuggestions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19169bc.f53691g);
                    d.f187486b = C70850d.m103697c(C19171be.f53699b);
                    diVar = d.mo62040a();
                    f53719b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m36585c() {
        C70338di diVar = f53721d;
        if (diVar == null) {
            synchronized (C19181i.class) {
                diVar = f53721d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.AssistantTapasService", "GetTapasEligibility");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19159at.f53655b);
                    d.f187486b = C70850d.m103697c(C19162aw.f53660d);
                    diVar = d.mo62040a();
                    f53721d = diVar;
                }
            }
        }
        return diVar;
    }
}
