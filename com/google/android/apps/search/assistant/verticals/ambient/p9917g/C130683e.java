package com.google.android.apps.search.assistant.verticals.ambient.p9917g;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.g.e */
/* compiled from: PG */
public final class C130683e {

    /* renamed from: a */
    public static volatile C70716eu f357844a;

    /* renamed from: b */
    private static volatile C70338di f357845b;

    /* renamed from: c */
    private static volatile C70338di f357846c;

    /* renamed from: d */
    private static volatile C70338di f357847d;

    private C130683e() {
    }

    /* renamed from: a */
    public static C70338di m213077a() {
        C70338di diVar = f357846c;
        if (diVar == null) {
            synchronized (C130683e.class) {
                diVar = f357846c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.ambient.AmbientAssistant", "DismissCard");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C130685g.f357848c);
                    d.f187486b = C70850d.m103697c(C130687i.f357852a);
                    diVar = d.mo62040a();
                    f357846c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m213078b() {
        C70338di diVar = f357847d;
        if (diVar == null) {
            synchronized (C130683e.class) {
                diVar = f357847d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.ambient.AmbientAssistant", "Enable");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C130689k.f357854c);
                    d.f187486b = C70850d.m103697c(C130691m.f357858a);
                    diVar = d.mo62040a();
                    f357847d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m213079c() {
        C70338di diVar = f357845b;
        if (diVar == null) {
            synchronized (C130683e.class) {
                diVar = f357845b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.ambient.AmbientAssistant", "ForwardTriggeringEvent");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C130693o.f357860d);
                    d.f187486b = C70850d.m103697c(C130695q.f357866a);
                    diVar = d.mo62040a();
                    f357845b = diVar;
                }
            }
        }
        return diVar;
    }
}
