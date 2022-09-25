package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.c.b.c.au */
/* compiled from: PG */
public final class C17054au {

    /* renamed from: a */
    private static volatile C70338di f49663a;

    /* renamed from: b */
    private static volatile C70716eu f49664b;

    private C17054au() {
    }

    /* renamed from: a */
    public static C70338di m34220a() {
        C70338di diVar = f49663a;
        if (diVar == null) {
            synchronized (C17054au.class) {
                diVar = f49663a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.apa.datadownload.grpc.TemporaryModelPromptService", "EnsureRequiredGroups");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17080y.f49722c);
                    d.f187486b = C70850d.m103697c(C17034aa.f49636c);
                    diVar = d.mo62040a();
                    f49663a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m34221b() {
        C70716eu euVar = f49664b;
        if (euVar == null) {
            synchronized (C17054au.class) {
                euVar = f49664b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.assistant.apa.datadownload.grpc.TemporaryModelPromptService");
                    etVar.mo62433a(m34220a());
                    euVar = new C70716eu(etVar);
                    f49664b = euVar;
                }
            }
        }
        return euVar;
    }
}
