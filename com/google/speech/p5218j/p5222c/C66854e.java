package com.google.speech.p5218j.p5222c;

import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67105lf;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.speech.j.c.e */
/* compiled from: PG */
public final class C66854e {

    /* renamed from: a */
    public static volatile C70716eu f181776a;

    /* renamed from: b */
    private static volatile C70338di f181777b;

    private C66854e() {
    }

    /* renamed from: a */
    public static C70338di m97364a() {
        C70338di diVar = f181777b;
        if (diVar == null) {
            synchronized (C66854e.class) {
                diVar = f181777b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("speech.soda.grpc.SodaService", "Session");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C67105lf.f182433a);
                    d.f187486b = C70850d.m103697c(C67087ko.f182366n);
                    diVar = d.mo62040a();
                    f181777b = diVar;
                }
            }
        }
        return diVar;
    }
}
