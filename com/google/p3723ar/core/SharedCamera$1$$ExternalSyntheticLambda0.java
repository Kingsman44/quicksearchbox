package com.google.p3723ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda0 */
/* compiled from: PG */
public final /* synthetic */ class SharedCamera$1$$ExternalSyntheticLambda0 implements Runnable {
    public /* synthetic */ CameraDevice.StateCallback f$0;
    public /* synthetic */ CameraDevice f$1;
    public /* synthetic */ int f$2;

    public /* synthetic */ SharedCamera$1$$ExternalSyntheticLambda0(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice, int i) {
        this.f$0 = stateCallback;
        this.f$1 = cameraDevice;
        this.f$2 = i;
    }

    public final void run() {
        CameraDevice.StateCallback stateCallback = this.f$0;
        CameraDevice cameraDevice = this.f$1;
        int i = this.f$2;
        int i2 = C47966w.f124136d;
        stateCallback.onError(cameraDevice, i);
    }
}
