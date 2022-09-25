package com.google.android.libraries.assistant.contexttrigger.p1457c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.c.e */
/* compiled from: PG */
public final class C17641e {

    /* renamed from: a */
    public static volatile C70716eu f50760a;

    /* renamed from: b */
    private static volatile C70338di f50761b;

    /* renamed from: c */
    private static volatile C70338di f50762c;

    private C17641e() {
    }

    /* renamed from: a */
    public static C70338di m34937a() {
        C70338di diVar = f50761b;
        if (diVar == null) {
            synchronized (C17641e.class) {
                diVar = f50761b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.context_trigger.grpc.ContextTrigger", "ForwardTriggeringEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17655s.f50782c);
                    d.f187486b = C70850d.m103697c(C17657u.f50786a);
                    diVar = d.mo62040a();
                    f50761b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m34938b() {
        C70338di diVar = f50762c;
        if (diVar == null) {
            synchronized (C17641e.class) {
                diVar = f50762c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.context_trigger.grpc.ContextTrigger", "GetSignalsToRegister");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17645i.f50767a);
                    d.f187486b = C70850d.m103697c(C17648l.f50770c);
                    diVar = d.mo62040a();
                    f50762c = diVar;
                }
            }
        }
        return diVar;
    }
}
