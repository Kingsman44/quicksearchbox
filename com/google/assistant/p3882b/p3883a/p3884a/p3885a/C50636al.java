package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.assistant.b.a.a.a.al */
/* compiled from: PG */
public final class C50636al {

    /* renamed from: a */
    public static volatile C70716eu f131723a;

    /* renamed from: b */
    private static volatile C70338di f131724b;

    /* renamed from: c */
    private static volatile C70338di f131725c;

    private C50636al() {
    }

    /* renamed from: a */
    public static C70338di m85866a() {
        C70338di diVar = f131724b;
        if (diVar == null) {
            synchronized (C50636al.class) {
                diVar = f131724b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.assistant.agentdirectory.web.server.proto.UpdatesCenterOnDeviceService", "GetBadgeData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C50641d.f131739a);
                    d.f187486b = C70850d.m103697c(C50643f.f131741c);
                    diVar = d.mo62040a();
                    f131724b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m85867b() {
        C70338di diVar = f131725c;
        if (diVar == null) {
            synchronized (C50636al.class) {
                diVar = f131725c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.assistant.agentdirectory.web.server.proto.UpdatesCenterOnDeviceService", "IsEligible");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C50645h.f131745a);
                    d.f187486b = C70850d.m103697c(C50647j.f131747a);
                    diVar = d.mo62040a();
                    f131725c = diVar;
                }
            }
        }
        return diVar;
    }
}
