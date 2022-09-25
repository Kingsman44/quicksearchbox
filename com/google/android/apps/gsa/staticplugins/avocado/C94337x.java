package com.google.android.apps.gsa.staticplugins.avocado;

import android.hardware.camera2.CameraDevice;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.x */
/* compiled from: PG */
final class C94337x extends CameraDevice.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C94170an f263615a;

    public C94337x(C94170an anVar) {
        this.f263615a = anVar;
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        ((C59052c) ((C59052c) C94170an.f263048b.mo56224b()).mo56372aa(14116)).mo56386p("#onDisconnected");
        this.f263615a.f263096e.release();
        cameraDevice.close();
        this.f263615a.f263061M = null;
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f263615a.f263096e.release();
        cameraDevice.close();
        this.f263615a.f263061M = null;
        ((C59052c) ((C59052c) C94170an.f263048b.mo56225c()).mo56372aa(14117)).mo56387q("#onError: %d", i);
        this.f263615a.f263084aj.mo88359a(AvocadoUtils.m155379c(C94303fa.CAMERA_ERROR));
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f263615a.f263096e.release();
        C94170an anVar = this.f263615a;
        anVar.f263061M = cameraDevice;
        anVar.mo88363g();
    }
}
