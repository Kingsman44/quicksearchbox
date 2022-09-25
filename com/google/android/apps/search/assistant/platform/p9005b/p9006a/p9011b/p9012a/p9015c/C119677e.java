package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9015c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.a.c.e */
/* compiled from: PG */
public final class C119677e {

    /* renamed from: a */
    private static volatile C70338di f333472a;

    /* renamed from: b */
    private static volatile C70716eu f333473b;

    private C119677e() {
    }

    /* renamed from: a */
    public static C70338di m198605a() {
        C70338di diVar = f333472a;
        if (diVar == null) {
            synchronized (C119677e.class) {
                diVar = f333472a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.conversation.api.extensions.assistantstream.proto.AssistantStreamStore", "Fetch");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119679g.f333474b);
                    d.f187486b = C70850d.m103697c(C119681i.f333477b);
                    diVar = d.mo62040a();
                    f333472a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m198606b() {
        C70716eu euVar = f333473b;
        if (euVar == null) {
            synchronized (C119677e.class) {
                euVar = f333473b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.conversation.api.extensions.assistantstream.proto.AssistantStreamStore");
                    etVar.mo62433a(m198605a());
                    euVar = new C70716eu(etVar);
                    f333473b = euVar;
                }
            }
        }
        return euVar;
    }
}
