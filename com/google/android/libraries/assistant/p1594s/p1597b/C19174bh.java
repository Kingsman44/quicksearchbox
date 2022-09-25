package com.google.android.libraries.assistant.p1594s.p1597b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.s.b.bh */
/* compiled from: PG */
public final class C19174bh {

    /* renamed from: a */
    private static volatile C70338di f53704a;

    /* renamed from: b */
    private static volatile C70338di f53705b;

    /* renamed from: c */
    private static volatile C70338di f53706c;

    /* renamed from: d */
    private static volatile C70338di f53707d;

    /* renamed from: e */
    private static volatile C70716eu f53708e;

    private C19174bh() {
    }

    /* renamed from: a */
    public static C70338di m36569a() {
        C70338di diVar = f53705b;
        if (diVar == null) {
            synchronized (C19174bh.class) {
                diVar = f53705b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.TngAssistantTapasService", "ClientStatusUpdated");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19185m.f53723f);
                    d.f187486b = C70850d.m103697c(C19187o.f53730c);
                    diVar = d.mo62040a();
                    f53705b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m36570b() {
        C70338di diVar = f53704a;
        if (diVar == null) {
            synchronized (C19174bh.class) {
                diVar = f53704a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.TngAssistantTapasService", "GetSuggestions");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19169bc.f53691g);
                    d.f187486b = C70850d.m103697c(C19171be.f53699b);
                    diVar = d.mo62040a();
                    f53704a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m36571c() {
        C70338di diVar = f53707d;
        if (diVar == null) {
            synchronized (C19174bh.class) {
                diVar = f53707d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.TngAssistantTapasService", "GetTapasEligibility");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19159at.f53655b);
                    d.f187486b = C70850d.m103697c(C19162aw.f53660d);
                    diVar = d.mo62040a();
                    f53707d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m36572d() {
        C70338di diVar = f53706c;
        if (diVar == null) {
            synchronized (C19174bh.class) {
                diVar = f53706c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.tapas.TngAssistantTapasService", "LogFulfillment");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C19189q.f53734e);
                    d.f187486b = C70850d.m103697c(C19191s.f53741a);
                    diVar = d.mo62040a();
                    f53706c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70716eu m36573e() {
        C70716eu euVar = f53708e;
        if (euVar == null) {
            synchronized (C19174bh.class) {
                euVar = f53708e;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.tapas.TngAssistantTapasService");
                    etVar.mo62433a(m36570b());
                    etVar.mo62433a(m36569a());
                    etVar.mo62433a(m36572d());
                    etVar.mo62433a(m36571c());
                    euVar = new C70716eu(etVar);
                    f53708e = euVar;
                }
            }
        }
        return euVar;
    }
}
