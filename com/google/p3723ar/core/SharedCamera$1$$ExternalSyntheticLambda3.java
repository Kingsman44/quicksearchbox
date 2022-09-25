package com.google.p3723ar.core;

import android.hardware.camera2.CameraDevice;

/* renamed from: com.google.ar.core.SharedCamera$1$$ExternalSyntheticLambda3 */
/* compiled from: PG */
public final /* synthetic */ class SharedCamera$1$$ExternalSyntheticLambda3 implements Runnable {
    public /* synthetic */ CameraDevice.StateCallback f$0;
    public /* synthetic */ CameraDevice f$1;

    public /* synthetic */ SharedCamera$1$$ExternalSyntheticLambda3(CameraDevice.StateCallback stateCallback, CameraDevice cameraDevice) {
        this.f$0 = stateCallback;
        this.f$1 = cameraDevice;
    }

    public final void run() {
        CameraDevice.StateCallback stateCallback = this.f$0;
        CameraDevice cameraDevice = this.f$1;
        int i = C47966w.f124136d;
        stateCallback.onOpened(cameraDevice);
    }
}
