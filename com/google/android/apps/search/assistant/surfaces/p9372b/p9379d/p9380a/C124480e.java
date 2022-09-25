package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.e */
/* compiled from: PG */
public final class C124480e {

    /* renamed from: a */
    private static volatile C70338di f343525a;

    /* renamed from: b */
    private static volatile C70716eu f343526b;

    private C124480e() {
    }

    /* renamed from: a */
    public static C124478c m203952a(C70888j jVar) {
        return (C124478c) C70852a.m103707c(new C124428a(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m203953b() {
        C70338di diVar = f343525a;
        if (diVar == null) {
            synchronized (C124480e.class) {
                diVar = f343525a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.nga.conversation.service.ControllerService", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C124484i.f343528c);
                    d.f187486b = C70850d.m103697c(C124460bc.f343475c);
                    diVar = d.mo62040a();
                    f343525a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m203954c() {
        C70716eu euVar = f343526b;
        if (euVar == null) {
            synchronized (C124480e.class) {
                euVar = f343526b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.nga.conversation.service.ControllerService");
                    etVar.mo62433a(m203953b());
                    euVar = new C70716eu(etVar);
                    f343526b = euVar;
                }
            }
        }
        return euVar;
    }
}
