package com.google.android.apps.gsa.nga.engine.p6098r.p6099a;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.gsa.nga.engine.r.a.q */
/* compiled from: PG */
public final class C77490q {

    /* renamed from: a */
    public static volatile C70716eu f213537a;

    /* renamed from: b */
    private static volatile C70338di f213538b;

    private C77490q() {
    }

    /* renamed from: a */
    public static C70338di m124307a() {
        C70338di diVar = f213538b;
        if (diVar == null) {
            synchronized (C77490q.class) {
                diVar = f213538b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.gsa.nga.engine.handsfree.service.HandsfreeService", "GoBack");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f213538b = diVar;
                }
            }
        }
        return diVar;
    }
}
