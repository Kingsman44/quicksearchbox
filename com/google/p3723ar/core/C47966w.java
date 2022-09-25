package com.google.p3723ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* renamed from: com.google.ar.core.w */
/* compiled from: PG */
final class C47966w extends CameraDevice.StateCallback {

    /* renamed from: d */
    public static final /* synthetic */ int f124136d = 0;

    /* renamed from: a */
    final /* synthetic */ Handler f124137a;

    /* renamed from: b */
    final /* synthetic */ CameraDevice.StateCallback f124138b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f124139c;

    public C47966w(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.f124139c = sharedCamera;
        this.f124137a = handler;
        this.f124138b = stateCallback;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f124137a.post(new SharedCamera$1$$ExternalSyntheticLambda2(this.f124138b, cameraDevice));
        this.f124139c.onDeviceClosed(cameraDevice);
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f124137a.post(new SharedCamera$1$$ExternalSyntheticLambda1(this.f124138b, cameraDevice));
        this.f124139c.onDeviceDisconnected(cameraDevice);
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        this.f124137a.post(new SharedCamera$1$$ExternalSyntheticLambda0(this.f124138b, cameraDevice, i));
        this.f124139c.close();
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f124139c.sharedCameraInfo.f124144a = cameraDevice;
        this.f124137a.post(new SharedCamera$1$$ExternalSyntheticLambda3(this.f124138b, cameraDevice));
        this.f124139c.onDeviceOpened(cameraDevice);
        this.f124139c.sharedCameraInfo.f124146c = this.f124139c.getGpuSurfaceTexture();
        this.f124139c.sharedCameraInfo.f124147d = this.f124139c.getGpuSurface();
    }
}
