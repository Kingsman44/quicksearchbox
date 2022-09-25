package com.google.android.apps.gsa.staticplugins.avocado;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.z */
/* compiled from: PG */
final class C94339z extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a */
    final /* synthetic */ C94170an f263617a;

    public C94339z(C94170an anVar) {
        this.f263617a = anVar;
    }

    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        this.f263617a.f263049A = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
    }

    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        C59071e eVar = C94170an.f263048b;
        captureResult.get(CaptureResult.CONTROL_AE_STATE);
    }
}
