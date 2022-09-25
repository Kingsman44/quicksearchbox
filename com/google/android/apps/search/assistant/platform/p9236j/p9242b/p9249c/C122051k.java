package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121833ap;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121836as;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121838au;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121841ax;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.k */
/* compiled from: PG */
public final class C122051k {

    /* renamed from: a */
    public static volatile C70716eu f338610a;

    /* renamed from: b */
    private static volatile C70338di f338611b;

    /* renamed from: c */
    private static volatile C70338di f338612c;

    private C122051k() {
    }

    /* renamed from: a */
    public static C70338di m201570a() {
        C70338di diVar = f338612c;
        if (diVar == null) {
            synchronized (C122051k.class) {
                diVar = f338612c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterService", "StartAssistantActivity");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121833ap.f338067b);
                    d.f187486b = C70850d.m103697c(C121836as.f338071c);
                    diVar = d.mo62040a();
                    f338612c = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m201571b() {
        C70338di diVar = f338611b;
        if (diVar == null) {
            synchronized (C122051k.class) {
                diVar = f338611b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaInternalActivityStarterService", "StartVoiceActivity");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121838au.f338075b);
                    d.f187486b = C70850d.m103697c(C121841ax.f338079c);
                    diVar = d.mo62040a();
                    f338611b = diVar;
                }
            }
        }
        return diVar;
    }
}
