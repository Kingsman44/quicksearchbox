package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2746a;

import android.hardware.camera2.CameraManager;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.a.d */
/* compiled from: PG */
final class C35792d extends CameraManager.TorchCallback {

    /* renamed from: a */
    final /* synthetic */ C35794f f93764a;

    public C35792d(C35794f fVar) {
        this.f93764a = fVar;
    }

    public final void onTorchModeChanged(String str, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f93764a.f93766a) && this.f93764a.f93767b != z) {
            this.f93764a.f93767b = z;
            C35790b bVar = this.f93764a.f93768c;
        }
    }

    public final void onTorchModeUnavailable(String str) {
        C58976aa aaVar = C58975e.f156826a;
        if (str.equals(this.f93764a.f93766a) && this.f93764a.f93767b) {
            this.f93764a.f93767b = false;
            C35790b bVar = this.f93764a.f93768c;
        }
    }
}
