package com.google.p3723ar.core;

import android.hardware.camera2.CameraCaptureSession;

/* renamed from: com.google.ar.core.SharedCamera$2$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class SharedCamera$2$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ CameraCaptureSession.StateCallback f$0;
    public /* synthetic */ CameraCaptureSession f$1;

    public /* synthetic */ SharedCamera$2$$ExternalSyntheticLambda3(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        this.f$0 = stateCallback;
        this.f$1 = cameraCaptureSession;
    }

    public final void run() {
        CameraCaptureSession.StateCallback stateCallback = this.f$0;
        CameraCaptureSession cameraCaptureSession = this.f$1;
        int i = C47967x.f124140d;
        stateCallback.onConfigureFailed(cameraCaptureSession);
    }
}
