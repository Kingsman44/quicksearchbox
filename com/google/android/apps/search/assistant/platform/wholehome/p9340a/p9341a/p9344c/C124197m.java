package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.a.c.m */
/* compiled from: PG */
public final class C124197m {

    /* renamed from: a */
    private static volatile C70338di f342953a;

    /* renamed from: b */
    private static volatile C70716eu f342954b;

    private C124197m() {
    }

    /* renamed from: a */
    public static C70338di m203641a() {
        C70338di diVar = f342953a;
        if (diVar == null) {
            synchronized (C124197m.class) {
                diVar = f342953a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.BIDI_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.apps.search.assistant.platform.wholehome.crossdevice.api.proto.CrossDeviceService", "Connect");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C124190f.f342945c);
                    d.f187486b = C70850d.m103697c(C124210z.f342970c);
                    diVar = d.mo62040a();
                    f342953a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m203642b() {
        C70716eu euVar = f342954b;
        if (euVar == null) {
            synchronized (C124197m.class) {
                euVar = f342954b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.apps.search.assistant.platform.wholehome.crossdevice.api.proto.CrossDeviceService");
                    etVar.mo62433a(m203641a());
                    euVar = new C70716eu(etVar);
                    f342954b = euVar;
                }
            }
        }
        return euVar;
    }
}
