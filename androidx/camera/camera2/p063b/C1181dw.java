package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.camera2.b.dw */
/* compiled from: PG */
final class C1181dw extends CameraCaptureSession.StateCallback {

    /* renamed from: a */
    final /* synthetic */ C1182dx f3473a;

    public C1181dw(C1182dx dxVar) {
        this.f3473a = dxVar;
    }

    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f3473a.mo4002t(cameraCaptureSession);
        C1182dx dxVar = this.f3473a;
        dxVar.mo3977e(dxVar);
    }

    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f3473a.mo4002t(cameraCaptureSession);
        C1182dx dxVar = this.f3473a;
        dxVar.mo3978f(dxVar);
    }

    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f3473a.mo4002t(cameraCaptureSession);
        C1182dx dxVar = this.f3473a;
        dxVar.mo3979g(dxVar);
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        C2164c cVar;
        try {
            this.f3473a.mo4002t(cameraCaptureSession);
            C1182dx dxVar = this.f3473a;
            dxVar.mo3916a(dxVar);
            synchronized (this.f3473a.f3474a) {
                C1974i.m5319g(this.f3473a.f3480g, "OpenCaptureSession completer should not null");
                C1182dx dxVar2 = this.f3473a;
                cVar = dxVar2.f3480g;
                dxVar2.f3480g = null;
            }
            cVar.mo5439d(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.f3473a.f3474a) {
                C1974i.m5319g(this.f3473a.f3480g, "OpenCaptureSession completer should not null");
                C1182dx dxVar3 = this.f3473a;
                C2164c cVar2 = dxVar3.f3480g;
                dxVar3.f3480g = null;
                cVar2.mo5439d(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C2164c cVar;
        try {
            this.f3473a.mo4002t(cameraCaptureSession);
            C1182dx dxVar = this.f3473a;
            dxVar.mo3917b(dxVar);
            synchronized (this.f3473a.f3474a) {
                C1974i.m5319g(this.f3473a.f3480g, "OpenCaptureSession completer should not null");
                C1182dx dxVar2 = this.f3473a;
                cVar = dxVar2.f3480g;
                dxVar2.f3480g = null;
            }
            cVar.mo5437b((Object) null);
        } catch (Throwable th) {
            synchronized (this.f3473a.f3474a) {
                C1974i.m5319g(this.f3473a.f3480g, "OpenCaptureSession completer should not null");
                C1182dx dxVar3 = this.f3473a;
                C2164c cVar2 = dxVar3.f3480g;
                dxVar3.f3480g = null;
                cVar2.mo5437b((Object) null);
                throw th;
            }
        }
    }

    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f3473a.mo4002t(cameraCaptureSession);
        C1182dx dxVar = this.f3473a;
        dxVar.mo3918c(dxVar);
    }

    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f3473a.mo4002t(cameraCaptureSession);
        C1182dx dxVar = this.f3473a;
        dxVar.mo3980h(dxVar, surface);
    }
}
