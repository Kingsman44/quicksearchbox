package com.google.android.apps.gsa.shared.bisto.latencymeasurement;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.bisto.latencymeasurement.jni.JingleNativeDetector;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.shared.bisto.latencymeasurement.j */
/* compiled from: PG */
public final class C89667j extends C89665h {

    /* renamed from: h */
    private static final C59071e f242784h = C59071e.m91332i("com.google.android.apps.gsa.shared.bisto.latencymeasurement.j");

    /* renamed from: i */
    private final C89669l f242785i;

    public C89667j(C89671n nVar, C89670m mVar, C60870cx cxVar, int i, C22871g gVar, C89669l lVar) {
        super(gVar, nVar, mVar, cxVar, i, lVar);
        this.f242785i = lVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo83563a() {
        C89669l lVar = this.f242785i;
        float[] fArr = this.f242780g;
        int a = this.f242777d.mo83568a();
        if (!lVar.mo83579d()) {
            C59104x c = C89669l.f242788a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "JingleDetectorNative");
            ((C59052c) ((C59052c) c).mo56372aa(10497)).mo56386p("Failed to load jingle native library!");
            return C60856cj.m92899h(new Exception("Failed to init audio"));
        }
        JingleNativeDetector.initJingleDetector(fArr, a);
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: b */
    public final C60870cx mo83564b() {
        if (!this.f242785i.mo83579d()) {
            return C60856cj.m92899h(new Exception("Failed to load native library"));
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* renamed from: d */
    public final Optional mo83566d() {
        int detectJingle = JingleNativeDetector.detectJingle(this.f242776c.mo83576c());
        C59104x b = f242784h.mo56224b();
        b.mo56378ag(C58975e.f156826a, "JingleDetector");
        ((C59052c) ((C59052c) b).mo56372aa(10496)).mo56387q("delayInMs=%d", detectJingle);
        return detectJingle >= 0 ? Optional.m71637of(Integer.valueOf(detectJingle)) : Optional.empty();
    }
}
