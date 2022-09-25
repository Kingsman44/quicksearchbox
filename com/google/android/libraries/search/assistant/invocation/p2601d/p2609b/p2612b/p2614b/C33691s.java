package com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2612b.p2614b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.b.b.b.s */
/* compiled from: PG */
public final class C33691s {

    /* renamed from: a */
    public static volatile C70716eu f90015a;

    /* renamed from: b */
    private static volatile C70338di f90016b;

    private C33691s() {
    }

    /* renamed from: a */
    public static C70338di m62280a() {
        C70338di diVar = f90016b;
        if (diVar == null) {
            synchronized (C33691s.class) {
                diVar = f90016b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.audio.input.service.proto.AudioInputInternalService", "OpenSessionStreaming");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33688p.f90006c);
                    d.f187486b = C70850d.m103697c(C33690r.f90011c);
                    diVar = d.mo62040a();
                    f90016b = diVar;
                }
            }
        }
        return diVar;
    }
}
