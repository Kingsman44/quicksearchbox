package com.google.android.libraries.search.assistant.p2704m;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.libraries.search.assistant.m.g */
/* compiled from: PG */
public final class C34812g {

    /* renamed from: a */
    private static volatile C70338di f92347a;

    /* renamed from: b */
    private static volatile C70716eu f92348b;

    private C34812g() {
    }

    /* renamed from: a */
    public static C70338di m63574a() {
        C70338di diVar = f92347a;
        if (diVar == null) {
            synchronized (C34812g.class) {
                diVar = f92347a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.libraries.search.assistant.eligibility.AssistantEligibilityService", "GetAssistantEligibility");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C34816k.f92352a);
                    d.f187486b = C70850d.m103697c(C34818m.f92354c);
                    diVar = d.mo62040a();
                    f92347a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: b */
    public static C70716eu m63575b() {
        C70716eu euVar = f92348b;
        if (euVar == null) {
            synchronized (C34812g.class) {
                euVar = f92348b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("java.com.google.android.libraries.search.assistant.eligibility.AssistantEligibilityService");
                    etVar.mo62433a(m63574a());
                    euVar = new C70716eu(etVar);
                    f92348b = euVar;
                }
            }
        }
        return euVar;
    }
}
