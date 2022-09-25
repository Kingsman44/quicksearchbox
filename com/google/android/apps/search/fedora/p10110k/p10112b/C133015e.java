package com.google.android.apps.search.fedora.p10110k.p10112b;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.apps.search.fedora.k.b.e */
/* compiled from: PG */
public final class C133015e {

    /* renamed from: a */
    public static volatile C70716eu f362729a;

    /* renamed from: b */
    private static volatile C70338di f362730b;

    /* renamed from: c */
    private static volatile C70338di f362731c;

    /* renamed from: d */
    private static volatile C70338di f362732d;

    private C133015e() {
    }

    /* renamed from: a */
    public static C133012b m215980a(C70888j jVar) {
        return (C133012b) C70864c.m103731e(new C133011a(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m215981b() {
        C70338di diVar = f362730b;
        if (diVar == null) {
            synchronized (C133015e.class) {
                diVar = f362730b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainregistrationservice.proto.FedoraTrainRegistrationService", "RegisterTraining");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C133017g.f362733b);
                    d.f187486b = C70850d.m103697c(C133019i.f362737a);
                    diVar = d.mo62040a();
                    f362730b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70338di m215982c() {
        C70338di diVar = f362731c;
        if (diVar == null) {
            synchronized (C133015e.class) {
                diVar = f362731c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainregistrationservice.proto.FedoraTrainRegistrationService", "UnRegisterTraining");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C133021k.f362739a);
                    d.f187486b = C70850d.m103697c(C133023m.f362741a);
                    diVar = d.mo62040a();
                    f362731c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: d */
    public static C70338di m215983d() {
        C70338di diVar = f362732d;
        if (diVar == null) {
            synchronized (C133015e.class) {
                diVar = f362732d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.fedora.trainregistrationservice.proto.FedoraTrainRegistrationService", "UpdateTrainingAccount");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C133025o.f362743c);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f362732d = diVar;
                }
            }
        }
        return diVar;
    }
}
