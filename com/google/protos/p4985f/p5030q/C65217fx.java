package com.google.protos.p4985f.p5030q;

import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66611ci;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.protos.f.q.fx */
/* compiled from: PG */
public final class C65217fx {

    /* renamed from: a */
    private static volatile C70338di f176499a;

    /* renamed from: b */
    private static volatile C70716eu f176500b;

    private C65217fx() {
    }

    /* renamed from: a */
    public static C70338di m96604a() {
        C70338di diVar = f176499a;
        if (diVar == null) {
            synchronized (C65217fx.class) {
                diVar = f176499a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("assistant.portable.PortableAssistantServerFallback", "GetServerFallbackResponse");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C66607ce.f181191f);
                    d.f187486b = C70850d.m103697c(C66611ci.f181206g);
                    diVar = d.mo62040a();
                    f176499a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m96605b() {
        C70716eu euVar = f176500b;
        if (euVar == null) {
            synchronized (C65217fx.class) {
                euVar = f176500b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.portable.PortableAssistantServerFallback");
                    etVar.mo62433a(m96604a());
                    euVar = new C70716eu(etVar);
                    f176500b = euVar;
                }
            }
        }
        return euVar;
    }
}
