package com.google.p3723ar.core;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ar.core.SharedCamera */
/* compiled from: PG */
public class SharedCamera {
    private static final String TAG = "ArSdk-SharedCamera";
    private boolean cameraSharedWithAr = false;
    private final Session session;
    private Handler sharedCameraHandler;
    /* access modifiers changed from: private */
    public final C47968y sharedCameraInfo = new C47968y();

    public SharedCamera(Session session2) {
        HandlerThread handlerThread = new HandlerThread("SharedCameraHandlerThread");
        handlerThread.start();
        this.sharedCameraHandler = new Handler(handlerThread.getLooper());
        this.session = session2;
    }

    /* access modifiers changed from: private */
    public void close() {
        this.sharedCameraHandler.removeCallbacksAndMessages((Object) null);
        this.sharedCameraHandler.getLooper().quit();
        this.sharedCameraHandler = null;
    }

    private ImageReader getCpuImageReader() {
        return nativeSharedCameraGetImageReader(this.session.nativeWrapperHandle, this.sharedCameraInfo.f124144a);
    }

    private ImageReader getCpuImageReaderMotionTracking() {
        return nativeSharedCameraGetImageReaderMotionTracking(this.session.nativeWrapperHandle, this.sharedCameraInfo.f124144a);
    }

    /* access modifiers changed from: private */
    public Surface getGpuSurface() {
        return nativeSharedCameraGetSurface(this.session.nativeWrapperHandle, this.sharedCameraInfo.f124144a);
    }

    /* access modifiers changed from: private */
    public SurfaceTexture getGpuSurfaceTexture() {
        return nativeSharedCameraGetSurfaceTexture(this.session.nativeWrapperHandle, this.sharedCameraInfo.f124144a);
    }

    static /* synthetic */ void lambda$setDummyOnImageAvailableListener$0(ImageReader imageReader) {
        Image acquireLatestImage = imageReader.acquireLatestImage();
        if (acquireLatestImage != null) {
            acquireLatestImage.close();
        }
    }

    private native void nativeSharedCameraCaptureSessionActive(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionClosed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigureFailed(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionConfigured(long j, CameraCaptureSession cameraCaptureSession);

    private native void nativeSharedCameraCaptureSessionReady(long j, CameraCaptureSession cameraCaptureSession);

    private native ImageReader nativeSharedCameraGetImageReader(long j, CameraDevice cameraDevice);

    private native ImageReader nativeSharedCameraGetImageReaderMotionTracking(long j, CameraDevice cameraDevice);

    private native Surface nativeSharedCameraGetSurface(long j, CameraDevice cameraDevice);

    private native SurfaceTexture nativeSharedCameraGetSurfaceTexture(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnClosed(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnDisconnected(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraOnOpened(long j, CameraDevice cameraDevice);

    private native void nativeSharedCameraSetAppSurfaces(long j, String str, List list);

    private native void nativeSharedCameraSetCaptureCallback(long j, CameraCaptureSession.CaptureCallback captureCallback, Handler handler);

    /* access modifiers changed from: private */
    public void onCaptureSessionActive(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionActive(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionClosed(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionClosed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigureFailed(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionConfigured(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionConfigured(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onCaptureSessionReady(CameraCaptureSession cameraCaptureSession) {
        nativeSharedCameraCaptureSessionReady(this.session.nativeWrapperHandle, cameraCaptureSession);
    }

    /* access modifiers changed from: private */
    public void onDeviceClosed(CameraDevice cameraDevice) {
        nativeSharedCameraOnClosed(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
    }

    /* access modifiers changed from: private */
    public void onDeviceDisconnected(CameraDevice cameraDevice) {
        nativeSharedCameraOnDisconnected(this.session.nativeWrapperHandle, cameraDevice);
        this.cameraSharedWithAr = false;
        this.sharedCameraInfo.f124144a = null;
    }

    /* access modifiers changed from: private */
    public void onDeviceOpened(CameraDevice cameraDevice) {
        this.sharedCameraInfo.f124144a = cameraDevice;
        this.cameraSharedWithAr = true;
        nativeSharedCameraOnOpened(this.session.nativeWrapperHandle, cameraDevice);
    }

    /* access modifiers changed from: private */
    public void setDummyListenerToAvoidImageBufferStarvation() {
        setDummyOnImageAvailableListener(getCpuImageReader());
        setDummyOnImageAvailableListener(getCpuImageReaderMotionTracking());
    }

    private void setDummyOnImageAvailableListener(ImageReader imageReader) {
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(SharedCamera$$ExternalSyntheticLambda0.INSTANCE, this.sharedCameraHandler);
        }
    }

    public CameraDevice.StateCallback createARDeviceStateCallback(CameraDevice.StateCallback stateCallback, Handler handler) {
        return new C47966w(this, handler, stateCallback);
    }

    public CameraCaptureSession.StateCallback createARSessionStateCallback(CameraCaptureSession.StateCallback stateCallback, Handler handler) {
        return new C47967x(this, handler, stateCallback);
    }

    public List getArCoreSurfaces() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.sharedCameraInfo.f124147d);
        ImageReader cpuImageReaderMotionTracking = getCpuImageReaderMotionTracking();
        if (cpuImageReaderMotionTracking != null) {
            arrayList.add(cpuImageReaderMotionTracking.getSurface());
        }
        arrayList.add(getCpuImageReader().getSurface());
        return arrayList;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.sharedCameraInfo.f124146c;
    }

    public void pause() {
        if (this.sharedCameraInfo.f124144a != null) {
            setDummyListenerToAvoidImageBufferStarvation();
        }
    }

    public void setAppSurfaces(String str, List list) {
        this.sharedCameraInfo.f124145b.put(str, list);
        nativeSharedCameraSetAppSurfaces(this.session.nativeWrapperHandle, str, list);
    }

    public void setCaptureCallback(CameraCaptureSession.CaptureCallback captureCallback, Handler handler) {
        nativeSharedCameraSetCaptureCallback(this.session.nativeWrapperHandle, captureCallback, handler);
    }
}
