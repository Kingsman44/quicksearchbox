package androidx.camera.camera2.p062a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p068c.C1233i;
import androidx.camera.camera2.p068c.C1234j;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1367d;

/* renamed from: androidx.camera.camera2.a.b */
/* compiled from: PG */
public final class C0989b extends C1234j {

    /* renamed from: a */
    public static final C1306at f3132a = new C1367d("camera2.captureRequest.templateType", Integer.TYPE, (Object) null);

    /* renamed from: b */
    public static final C1306at f3133b = new C1367d("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, (Object) null);

    /* renamed from: c */
    public static final C1306at f3134c = new C1367d("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, (Object) null);

    /* renamed from: d */
    public static final C1306at f3135d = new C1367d("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, (Object) null);

    /* renamed from: e */
    public static final C1306at f3136e = new C1367d("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, (Object) null);

    /* renamed from: f */
    public static final C1306at f3137f = new C1367d("camera2.cameraEvent.callback", C0992e.class, (Object) null);

    /* renamed from: g */
    public static final C1306at f3138g = new C1367d("camera2.captureRequest.tag", Object.class, (Object) null);

    /* renamed from: h */
    public static final C1306at f3139h = new C1367d("camera2.cameraCaptureSession.physicalCameraId", String.class, (Object) null);

    public C0989b(C1308av avVar) {
        super(avVar);
    }

    /* renamed from: e */
    public static C1306at m2990e(CaptureRequest.Key key) {
        return new C1367d("camera2.captureRequest.option.".concat(String.valueOf(key.getName())), Object.class, key);
    }

    /* renamed from: a */
    public final int mo3740a(int i) {
        return ((Integer) this.f3624i.mo3954F(f3132a, Integer.valueOf(i))).intValue();
    }

    /* renamed from: b */
    public final CameraCaptureSession.CaptureCallback mo3741b(CameraCaptureSession.CaptureCallback captureCallback) {
        return (CameraCaptureSession.CaptureCallback) this.f3624i.mo3954F(f3136e, captureCallback);
    }

    /* renamed from: c */
    public final C0992e mo3742c(C0992e eVar) {
        return (C0992e) this.f3624i.mo3954F(f3137f, eVar);
    }

    /* renamed from: d */
    public final C1234j mo3743d() {
        return C1233i.m3390a(this.f3624i).mo4062c();
    }

    /* renamed from: f */
    public final String mo3744f() {
        return (String) this.f3624i.mo3954F(f3139h, (Object) null);
    }
}
