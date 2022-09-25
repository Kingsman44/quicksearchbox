package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.d.g */
/* compiled from: PG */
public final class C12017g {

    /* renamed from: a */
    public static volatile C70716eu f38543a;

    /* renamed from: b */
    private static volatile C70338di f38544b;

    /* renamed from: c */
    private static volatile C70338di f38545c;

    private C12017g() {
    }

    /* renamed from: a */
    public static C70338di m27909a() {
        C70338di diVar = f38544b;
        if (diVar == null) {
            synchronized (C12017g.class) {
                diVar = f38544b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.SERVER_STREAMING;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.auto.tng.assistant.service.audio.concurrentlistening.service.ConcurrentListeningService", "GetConcurrentListening");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C11989b.f38498a);
                    d.f187486b = C70850d.m103697c(C12023m.f38551c);
                    diVar = d.mo62040a();
                    f38544b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m27910b() {
        C70338di diVar = f38545c;
        if (diVar == null) {
            synchronized (C12017g.class) {
                diVar = f38545c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.auto.tng.assistant.service.audio.concurrentlistening.service.ConcurrentListeningService", "NotifyConcurrentListeningStopped");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C11989b.f38498a);
                    d.f187486b = C70850d.m103697c(C12021k.f38547c);
                    diVar = d.mo62040a();
                    f38545c = diVar;
                }
            }
        }
        return diVar;
    }
}
