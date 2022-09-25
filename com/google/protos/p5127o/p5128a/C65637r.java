package com.google.protos.p5127o.p5128a;

import com.google.nlp.p4730a.C62799s;
import com.google.nlp.p4730a.C62801u;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.protos.o.a.r */
/* compiled from: PG */
public final class C65637r {

    /* renamed from: a */
    public static volatile C70338di f178355a;

    /* renamed from: b */
    public static volatile C70338di f178356b;

    /* renamed from: c */
    public static volatile C70338di f178357c;

    /* renamed from: d */
    public static volatile C70716eu f178358d;

    /* renamed from: e */
    private static volatile C70338di f178359e;

    private C65637r() {
    }

    /* renamed from: a */
    public static C70338di m96770a() {
        C70338di diVar = f178359e;
        if (diVar == null) {
            synchronized (C65637r.class) {
                diVar = f178359e;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("gallium.api.GenXInterface", "Realize");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62799s.f169588g);
                    d.f187486b = C70850d.m103697c(C62801u.f169598d);
                    diVar = d.mo62040a();
                    f178359e = diVar;
                }
            }
        }
        return diVar;
    }
}
