package com.google.android.apps.search.fedora.p10096d.p10098b;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.fedora.d.b.e */
/* compiled from: PG */
public final class C132760e {

    /* renamed from: a */
    private static volatile C70338di f362199a;

    /* renamed from: b */
    private static volatile C70338di f362200b;

    /* renamed from: c */
    private static volatile C70338di f362201c;

    /* renamed from: d */
    private static volatile C70338di f362202d;

    /* renamed from: e */
    private static volatile C70716eu f362203e;

    private C132760e() {
    }

    /* renamed from: a */
    public static C70338di m215780a() {
        C70338di diVar = f362201c;
        if (diVar == null) {
            synchronized (C132760e.class) {
                diVar = f362201c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.fedora.entrypoints.proto.FedoraSettingsService", "LogSheldonAuditRecord");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132762g.f362204d);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f362201c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m215781b() {
        C70338di diVar = f362199a;
        if (diVar == null) {
            synchronized (C132760e.class) {
                diVar = f362199a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.fedora.entrypoints.proto.FedoraSettingsService", "SetFedHotOptInEnabled");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132764i.f362209c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f362199a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m215782c() {
        C70338di diVar = f362200b;
        if (diVar == null) {
            synchronized (C132760e.class) {
                diVar = f362200b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.fedora.entrypoints.proto.FedoraSettingsService", "SetSheldonOptInEnabled");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132766k.f362213c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f362200b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m215783d() {
        C70338di diVar = f362202d;
        if (diVar == null) {
            synchronized (C132760e.class) {
                diVar = f362202d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.fedora.entrypoints.proto.FedoraSettingsService", "SetUnintendedOptInEnabled");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C132768m.f362217b);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f362202d = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: e */
    public static C70716eu m215784e() {
        C70716eu euVar = f362203e;
        if (euVar == null) {
            synchronized (C132760e.class) {
                euVar = f362203e;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.fedora.entrypoints.proto.FedoraSettingsService");
                    etVar.mo62433a(m215781b());
                    etVar.mo62433a(m215782c());
                    etVar.mo62433a(m215780a());
                    etVar.mo62433a(m215783d());
                    euVar = new C70716eu(etVar);
                    f362203e = euVar;
                }
            }
        }
        return euVar;
    }
}
