package com.google.android.apps.gsa.p6487s3;

import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.search.p3024j.C38522a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.p4574q.C60735n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5208h.C66653dt;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70290cs;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.StatusException;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.s3.j */
/* compiled from: PG */
public final class C84292j {

    /* renamed from: a */
    public static final C59071e f229392a = C59071e.m91332i("com.google.android.apps.gsa.s3.j");

    /* renamed from: b */
    static final C70297cz f229393b = new C70290cs("X-Goog-Api-Key", C70334de.f187481c);

    /* renamed from: c */
    static final C70297cz f229394c = new C70290cs("X-Android-Package", C70334de.f187481c);

    /* renamed from: d */
    static final C70297cz f229395d = new C70290cs("X-Android-Cert", C70334de.f187481c);

    /* renamed from: e */
    public static final C58495hd f229396e = C58495hd.m89901o("com.google.android.googlequicksearchbox", "AIzaSyDbHU30I-v5OpOJm1-uff09-NJbd6I8InU", "com.google.android.carassistant", "AIzaSyDIhpFHhMpC-hUyiqpO1KzH2CRMXhuQd9A");

    /* renamed from: a */
    public static C60870cx m134449a(C58833ax axVar, C89012aj ajVar, C58833ax axVar2, C58833ax axVar3) {
        C60735n b = C38522a.m67775b("speechs3proto2-pa.googleapis.com");
        C60870cx g = C60922j.m93044g(ajVar.mo27494e((String) axVar2.mo56109e(b.f164743a), b.mo57123a(), 14), new C84291i(axVar, axVar3), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public static C70862aj m134450b(C84295m mVar, C70286co coVar) {
        return C66653dt.m97297a(coVar).mo59701b(new C84331t(coVar, mVar));
    }

    /* renamed from: c */
    public static void m134451c(C84295m mVar, Throwable th, int i) {
        C90523o oVar;
        if (th instanceof C90523o) {
            oVar = (C90523o) th;
        } else {
            if (th instanceof C70761fa) {
                i = C90454b.m147152b(((C70761fa) th).f188571a.getCode());
            }
            if (th instanceof StatusException) {
                i = C90454b.m147152b(((StatusException) th).f186943a.getCode());
            }
            oVar = new C90523o(th, i);
        }
        mVar.mo77831a(oVar);
    }
}
