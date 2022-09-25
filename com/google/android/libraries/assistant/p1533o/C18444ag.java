package com.google.android.libraries.assistant.p1533o;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;

/* renamed from: com.google.android.libraries.assistant.o.ag */
/* compiled from: PG */
public final class C18444ag {

    /* renamed from: a */
    private static volatile C70338di f52343a;

    /* renamed from: b */
    private static volatile C70338di f52344b;

    /* renamed from: c */
    private static volatile C70716eu f52345c;

    private C18444ag() {
    }

    /* renamed from: a */
    public static C18443af m35920a(C70888j jVar) {
        return (C18443af) C70852a.m103707c(new C18440ac(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m35921b() {
        C70338di diVar = f52343a;
        if (diVar == null) {
            synchronized (C18444ag.class) {
                diVar = f52343a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.searchhandover.proto.SearchApp", "GetVoiceSearchParams");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C18494l.f52434c);
                    d.f187486b = C70850d.m103697c(C18496n.f52438d);
                    diVar = d.mo62040a();
                    f52343a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m35922c() {
        C70338di diVar = f52344b;
        if (diVar == null) {
            synchronized (C18444ag.class) {
                diVar = f52344b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.CLIENT_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.searchhandover.proto.SearchApp", "StartHandover");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C18454aq.f52369c);
                    d.f187486b = C70850d.m103697c(C18456as.f52374a);
                    diVar = d.mo62040a();
                    f52344b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70716eu m35923d() {
        C70716eu euVar = f52345c;
        if (euVar == null) {
            synchronized (C18444ag.class) {
                euVar = f52345c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.assistant.searchhandover.proto.SearchApp");
                    etVar.mo62433a(m35921b());
                    etVar.mo62433a(m35922c());
                    euVar = new C70716eu(etVar);
                    f52345c = euVar;
                }
            }
        }
        return euVar;
    }
}
