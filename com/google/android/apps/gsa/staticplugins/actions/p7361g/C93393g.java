package com.google.android.apps.gsa.staticplugins.actions.p7361g;

import android.hardware.camera2.CameraManager;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g.g */
/* compiled from: PG */
final class C93393g extends CameraManager.TorchCallback {

    /* renamed from: a */
    final /* synthetic */ C93394h f260478a;

    public C93393g(C93394h hVar) {
        this.f260478a = hVar;
    }

    public final void onTorchModeChanged(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f260478a.f260481f)) {
            C93394h hVar = this.f260478a;
            boolean z2 = hVar.f260466a;
            if (hVar.f260466a != z) {
                this.f260478a.f260466a = z;
                this.f260478a.mo87650g();
            }
        }
    }

    public final void onTorchModeUnavailable(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f260478a.f260481f)) {
            C93394h hVar = this.f260478a;
            boolean z = hVar.f260466a;
            if (hVar.f260466a) {
                this.f260478a.f260466a = false;
                this.f260478a.mo87650g();
            }
        }
    }
}
