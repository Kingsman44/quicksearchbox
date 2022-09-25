package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70852a;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.c.i */
/* compiled from: PG */
public final class C119735i {

    /* renamed from: a */
    private static volatile C70338di f333560a;

    /* renamed from: b */
    private static volatile C70716eu f333561b;

    private C119735i() {
    }

    /* renamed from: a */
    public static C119734h m198650a(C70888j jVar) {
        return (C119734h) C70852a.m103707c(new C119731e(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m198651b() {
        C70338di diVar = f333560a;
        if (diVar == null) {
            synchronized (C119735i.class) {
                diVar = f333560a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.conversation.api.extensions.ttsstream.proto.TtsStreamStore", "Fetch");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C119728b.f333553a);
                    d.f187486b = C70850d.m103697c(C119730d.f333555b);
                    diVar = d.mo62040a();
                    f333560a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m198652c() {
        C70716eu euVar = f333561b;
        if (euVar == null) {
            synchronized (C119735i.class) {
                euVar = f333561b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.conversation.api.extensions.ttsstream.proto.TtsStreamStore");
                    etVar.mo62433a(m198651b());
                    euVar = new C70716eu(etVar);
                    f333561b = euVar;
                }
            }
        }
        return euVar;
    }
}
