package com.google.android.libraries.lens.view.p2113h.p2122e;

import com.google.android.libraries.lens.view.p2113h.p2121d.C26774z;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.h.e.ak */
/* compiled from: PG */
public final /* synthetic */ class C26786ak implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C26788am f73035a;

    public /* synthetic */ C26786ak(C26788am amVar) {
        this.f73035a = amVar;
    }

    public final Object call() {
        C26788am amVar = this.f73035a;
        C26774z zVar = (C26774z) amVar.f73038b.mo17428b();
        boolean z = false;
        if (zVar != C26774z.LENS_CAMERA_1_EXP && zVar != C26774z.LENS_CAMERA_2) {
            ((C58970a) ((C58970a) C26788am.f73037a.mo56224b()).mo56372aa(49184)).mo56389s("Skipping camera early start: cameraType=%s", zVar);
        } else if (!amVar.f73042f.mo30543a("android.permission.CAMERA")) {
            ((C58970a) ((C58970a) C26788am.f73037a.mo56224b()).mo56372aa(49183)).mo56386p("Skipping camera early start: no camera permission");
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
