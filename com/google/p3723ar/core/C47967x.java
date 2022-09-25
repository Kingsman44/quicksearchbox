package com.google.p3723ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* renamed from: com.google.ar.core.x */
/* compiled from: PG */
final class C47967x extends CameraCaptureSession.StateCallback {

    /* renamed from: d */
    public static final /* synthetic */ int f124140d = 0;

    /* renamed from: a */
    final /* synthetic */ Handler f124141a;

    /* renamed from: b */
    final /* synthetic */ CameraCaptureSession.StateCallback f124142b;

    /* renamed from: c */
    final /* synthetic */ SharedCamera f124143c;

    public C47967x(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.f124143c = sharedCamera;
        this.f124141a = handler;
        this.f124142b = stateCallback;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f124141a.post(new SharedCamera$2$$ExternalSyntheticLambda0(this.f124142b, cameraCaptureSession));
        this.f124143c.onCaptureSessionActive(cameraCaptureSession);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f124141a.post(new SharedCamera$2$$ExternalSyntheticLambda1(this.f124142b, cameraCaptureSession));
        this.f124143c.onCaptureSessionClosed(cameraCaptureSession);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f124141a.post(new SharedCamera$2$$ExternalSyntheticLambda3(this.f124142b, cameraCaptureSession));
        this.f124143c.onCaptureSessionConfigureFailed(cameraCaptureSession);
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C47968y unused = this.f124143c.sharedCameraInfo;
        this.f124141a.post(new SharedCamera$2$$ExternalSyntheticLambda4(this.f124142b, cameraCaptureSession));
        this.f124143c.onCaptureSessionConfigured(cameraCaptureSession);
        if (this.f124143c.sharedCameraInfo.f124144a != null) {
            this.f124143c.setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f124141a.post(new SharedCamera$2$$ExternalSyntheticLambda2(this.f124142b, cameraCaptureSession));
        this.f124143c.onCaptureSessionReady(cameraCaptureSession);
    }
}
