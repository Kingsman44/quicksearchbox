package com.google.android.libraries.assistant.p1522k.p1523a.p1524a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.k.a.a.i */
/* compiled from: PG */
public final class C18405i {

    /* renamed from: a */
    public static volatile C70716eu f52236a;

    /* renamed from: b */
    private static volatile C70338di f52237b;

    private C18405i() {
    }

    /* renamed from: a */
    public static C70338di m35848a() {
        C70338di diVar = f52237b;
        if (diVar == null) {
            synchronized (C18405i.class) {
                diVar = f52237b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.gmm.grpc.gmmstartup.proto.AssistantStateService", "FetchAssistantState");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C18400d.f52227b);
                    d.f187486b = C70850d.m103697c(C18402f.f52231c);
                    diVar = d.mo62040a();
                    f52237b = diVar;
                }
            }
        }
        return diVar;
    }
}
