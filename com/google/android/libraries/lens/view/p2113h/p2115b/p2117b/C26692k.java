package com.google.android.libraries.lens.view.p2113h.p2115b.p2117b;

import android.databinding.C0118a;
import android.hardware.camera2.CameraDevice;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.h.b.b.k */
/* compiled from: PG */
final class C26692k extends CameraDevice.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C26701t f72771a;

    public C26692k(C26701t tVar) {
        this.f72771a = tVar;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f72771a.mo32008f("cameraCallback.onClosed");
        if (cameraDevice == this.f72771a.f72795h) {
            ((C59052c) ((C59052c) C26701t.f72779a.mo56226d()).mo56372aa(49069)).mo56386p("activeCamera closed.");
        }
        this.f72771a.mo32007e();
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        C59071e eVar = C26701t.f72779a;
        this.f72771a.mo32008f("cameraCallback.onDisconnected");
        C26701t tVar = this.f72771a;
        CameraDevice cameraDevice2 = tVar.f72795h;
        boolean z = true;
        boolean z2 = cameraDevice2 == cameraDevice;
        boolean z3 = !z2 && cameraDevice2 != null;
        if (!z2 || tVar.f72792e.mo32017e()) {
            z = false;
        }
        if (z2) {
            this.f72771a.mo32005a();
        } else {
            cameraDevice.close();
        }
        if (!z3) {
            C26701t tVar2 = this.f72771a;
            if (tVar2.f72781A == 2) {
                C0118a.m108p(C26701t.f72779a.mo56226d(), "onDisconnected called after CLOSED state requested.", 49072, C38505d.f101864b, 156126557);
            } else if (z) {
                tVar2.mo32005a();
                C0118a.m108p(C26701t.f72779a.mo56226d(), "onDisconnected called while streaming.", 49071, C38505d.f101864b, 156126358);
            } else {
                tVar2.mo32009g(new C26700s());
            }
        }
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f72771a.mo32008f("cameraCallback.onError");
        ((C59052c) ((C59052c) C26701t.f72779a.mo56225c()).mo56372aa(49073)).mo56387q("Camera error: %s", i);
        cameraDevice.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        C59071e eVar = C26701t.f72779a;
        this.f72771a.mo32008f("cameraCallback.onOpened");
        C26701t tVar = this.f72771a;
        tVar.f72795h = cameraDevice;
        if (tVar.f72781A == 2) {
            tVar.mo32005a();
        } else {
            tVar.mo32006b();
        }
    }
}
