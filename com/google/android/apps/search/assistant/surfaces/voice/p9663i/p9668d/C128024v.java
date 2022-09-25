package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.v */
/* compiled from: PG */
public final class C128024v {

    /* renamed from: a */
    public static volatile C70716eu f352296a;

    /* renamed from: b */
    private static volatile C70338di f352297b;

    /* renamed from: c */
    private static volatile C70338di f352298c;

    private C128024v() {
    }

    /* renamed from: a */
    public static C70338di m209159a() {
        C70338di diVar = f352297b;
        if (diVar == null) {
            synchronized (C128024v.class) {
                diVar = f352297b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.handsfree.motion.MotionSignalsService", "GetPositionalAttributes");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128005c.f352273e);
                    d.f187486b = C70850d.m103697c(C128007e.f352279b);
                    diVar = d.mo62040a();
                    f352297b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m209160b() {
        C70338di diVar = f352298c;
        if (diVar == null) {
            synchronized (C128024v.class) {
                diVar = f352298c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.handsfree.motion.MotionSignalsService", "UpdatePositionalAttributes");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C128003an.f352266e);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f352298c = diVar;
                }
            }
        }
        return diVar;
    }
}
