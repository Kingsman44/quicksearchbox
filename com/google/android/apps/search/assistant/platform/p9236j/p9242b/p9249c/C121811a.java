package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121833ap;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121836as;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121838au;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121841ax;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a */
/* compiled from: PG */
public final class C121811a {

    /* renamed from: a */
    private static volatile C70338di f338041a;

    /* renamed from: b */
    private static volatile C70338di f338042b;

    /* renamed from: c */
    private static volatile C70716eu f338043c;

    private C121811a() {
    }

    /* renamed from: a */
    public static C70338di m201236a() {
        C70338di diVar = f338042b;
        if (diVar == null) {
            synchronized (C121811a.class) {
                diVar = f338042b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaActivityStarterService", "StartAssistantActivity");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121833ap.f338067b);
                    d.f187486b = C70850d.m103697c(C121836as.f338071c);
                    diVar = d.mo62040a();
                    f338042b = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70338di m201237b() {
        C70338di diVar = f338041a;
        if (diVar == null) {
            synchronized (C121811a.class) {
                diVar = f338041a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaActivityStarterService", "StartVoiceActivity");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C121838au.f338075b);
                    d.f187486b = C70850d.m103697c(C121841ax.f338079c);
                    diVar = d.mo62040a();
                    f338041a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m201238c() {
        C70716eu euVar = f338043c;
        if (euVar == null) {
            synchronized (C121811a.class) {
                euVar = f338043c;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.apps.search.assistant.platform.triggering.invocations.vis.activitystarter.ApaActivityStarterService");
                    etVar.mo62433a(m201237b());
                    etVar.mo62433a(m201236a());
                    euVar = new C70716eu(etVar);
                    f338043c = euVar;
                }
            }
        }
        return euVar;
    }
}
