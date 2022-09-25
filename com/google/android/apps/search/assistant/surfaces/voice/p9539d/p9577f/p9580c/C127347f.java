package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9577f.p9580c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.f.c.f */
/* compiled from: PG */
public final class C127347f {

    /* renamed from: a */
    private static volatile C70338di f350703a;

    /* renamed from: b */
    private static volatile C70716eu f350704b;

    private C127347f() {
    }

    /* renamed from: a */
    public static C70338di m208278a() {
        C70338di diVar = f350703a;
        if (diVar == null) {
            synchronized (C127347f.class) {
                diVar = f350703a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.voice.context.speechbiasing.proto.SessionTokenService", "GetToken");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C127343b.f350697a);
                    d.f187486b = C70850d.m103697c(C127345d.f350699c);
                    diVar = d.mo62040a();
                    f350703a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m208279b() {
        C70716eu euVar = f350704b;
        if (euVar == null) {
            synchronized (C127347f.class) {
                euVar = f350704b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.surfaces.voice.context.speechbiasing.proto.SessionTokenService");
                    etVar.mo62433a(m208278a());
                    euVar = new C70716eu(etVar);
                    f350704b = euVar;
                }
            }
        }
        return euVar;
    }
}
