package com.google.android.libraries.lens.view.p2113h.p2115b.p2116a;

import android.hardware.Camera;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.libraries.lens.view.h.b.a.l */
/* compiled from: PG */
public final /* synthetic */ class C26674l implements Camera.ErrorCallback {

    /* renamed from: a */
    public final /* synthetic */ C26679q f72721a;

    public /* synthetic */ C26674l(C26679q qVar) {
        this.f72721a = qVar;
    }

    public final void onError(int i, Camera camera) {
        C26679q qVar = this.f72721a;
        Camera camera2 = qVar.f72738l;
        if (camera2 == null || camera2 == camera) {
            ((C58970a) ((C58970a) C26679q.f72726a.mo56225c()).mo56372aa(49051)).mo56387q("Camera error: %s", i);
            qVar.f72738l = null;
            qVar.f72752z = 1;
        }
    }
}
