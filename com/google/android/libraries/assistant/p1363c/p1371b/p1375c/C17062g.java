package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.c.b.c.g */
/* compiled from: PG */
public final class C17062g {

    /* renamed from: a */
    private static volatile C70338di f49670a;

    /* renamed from: b */
    private static volatile C70338di f49671b;

    /* renamed from: c */
    private static volatile C70716eu f49672c;

    private C17062g() {
    }

    /* renamed from: a */
    public static C70338di m34234a() {
        C70338di diVar = f49670a;
        if (diVar == null) {
            synchronized (C17062g.class) {
                diVar = f49670a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.apa.datadownload.grpc.DataDownloadRestrictedService", "DownloadFileGroup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17064i.f49673f);
                    d.f187486b = C70850d.m103697c(C17066k.f49681c);
                    diVar = d.mo62040a();
                    f49670a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m34235b() {
        C70338di diVar = f49671b;
        if (diVar == null) {
            synchronized (C17062g.class) {
                diVar = f49671b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.apa.datadownload.grpc.DataDownloadRestrictedService", "DownloadFileGroupsWithUpdates");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17078w.f49713g);
                    d.f187486b = C70850d.m103697c(C17074s.f49709b);
                    diVar = d.mo62040a();
                    f49671b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m34236c() {
        C70716eu euVar = f49672c;
        if (euVar == null) {
            synchronized (C17062g.class) {
                euVar = f49672c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.assistant.apa.datadownload.grpc.DataDownloadRestrictedService");
                    etVar.mo62433a(m34234a());
                    etVar.mo62433a(m34235b());
                    euVar = new C70716eu(etVar);
                    f49672c = euVar;
                }
            }
        }
        return euVar;
    }
}
