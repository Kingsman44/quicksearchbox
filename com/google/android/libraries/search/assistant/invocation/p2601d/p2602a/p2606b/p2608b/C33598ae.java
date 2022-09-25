package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.b.ae */
/* compiled from: PG */
public final class C33598ae {

    /* renamed from: a */
    public static volatile C70716eu f89818a;

    /* renamed from: b */
    private static volatile C70338di f89819b;

    /* renamed from: c */
    private static volatile C70338di f89820c;

    private C33598ae() {
    }

    /* renamed from: a */
    public static C70338di m62197a() {
        C70338di diVar = f89819b;
        if (diVar == null) {
            synchronized (C33598ae.class) {
                diVar = f89819b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.audio.focus.service.proto.AudioFocusInternalService", "CreateAudioFocusStreaming");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33622p.f89851c);
                    d.f187486b = C70850d.m103697c(C33624r.f89856c);
                    diVar = d.mo62040a();
                    f89819b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m62198b() {
        C70338di diVar = f89820c;
        if (diVar == null) {
            synchronized (C33598ae.class) {
                diVar = f89820c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.invocation.audio.focus.service.proto.AudioFocusInternalService", "ReleaseSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C33630x.f89865b);
                    d.f187486b = C70850d.m103697c(C33595ab.f89813c);
                    diVar = d.mo62040a();
                    f89820c = diVar;
                }
            }
        }
        return diVar;
    }
}
