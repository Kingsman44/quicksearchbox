package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9017b.p9020c;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.b.c.e */
/* compiled from: PG */
public final class C119700e {

    /* renamed from: a */
    private static volatile C70338di f333511a;

    /* renamed from: b */
    private static volatile C70716eu f333512b;

    private C119700e() {
    }

    /* renamed from: a */
    public static C70338di m198619a() {
        C70338di diVar = f333511a;
        if (diVar == null) {
            synchronized (C119700e.class) {
                diVar = f333511a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.conversation.api.extensions.mic.proto.MicUpdateService", "RequestMicReopen");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62912at.f169862a);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f333511a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m198620b() {
        C70716eu euVar = f333512b;
        if (euVar == null) {
            synchronized (C119700e.class) {
                euVar = f333512b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.conversation.api.extensions.mic.proto.MicUpdateService");
                    etVar.mo62433a(m198619a());
                    euVar = new C70716eu(etVar);
                    f333512b = euVar;
                }
            }
        }
        return euVar;
    }
}
