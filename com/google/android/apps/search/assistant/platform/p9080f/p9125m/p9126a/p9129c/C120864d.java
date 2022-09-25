package com.google.android.apps.search.assistant.platform.p9080f.p9125m.p9126a.p9129c;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.f.m.a.c.d */
/* compiled from: PG */
final class C120864d {

    /* renamed from: b */
    private static final C59071e f336070b = C59071e.m91332i("com.google.android.apps.search.assistant.platform.f.m.a.c.d");

    /* renamed from: a */
    public final C120507d f336071a;

    /* renamed from: c */
    private final C70862aj f336072c;

    public C120864d(C120507d dVar, C70862aj ajVar) {
        this.f336071a = dVar;
        this.f336072c = ajVar;
    }

    /* renamed from: a */
    public final C60870cx mo104956a(C39670cx cxVar) {
        try {
            this.f336072c.mo20123c(cxVar);
        } catch (IllegalStateException e) {
            C59104x d = f336070b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ConvEngine.OnDeviceAsr");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(35612)).mo56386p("Error sending SodaAsrStartRequest, possibly due to SODA connection being shutdown.");
        }
        return C60866ct.f164955a;
    }
}
