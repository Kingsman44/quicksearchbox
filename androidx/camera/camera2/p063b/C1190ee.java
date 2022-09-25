package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.camera.camera2.p063b.p064a.C1009b;
import androidx.camera.camera2.p063b.p064a.C1061d;

/* renamed from: androidx.camera.camera2.b.ee */
/* compiled from: PG */
final class C1190ee extends C1173do {

    /* renamed from: a */
    private final CameraCaptureSession.StateCallback f3504a;

    public C1190ee(CameraCaptureSession.StateCallback stateCallback) {
        this.f3504a = stateCallback;
    }

    /* renamed from: a */
    public final void mo3916a(C1174dp dpVar) {
        this.f3504a.onConfigureFailed(dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: b */
    public final void mo3917b(C1174dp dpVar) {
        this.f3504a.onConfigured(dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: c */
    public final void mo3918c(C1174dp dpVar) {
        this.f3504a.onReady(dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: d */
    public final void mo3919d(C1174dp dpVar) {
    }

    /* renamed from: e */
    public final void mo3977e(C1174dp dpVar) {
        this.f3504a.onActive(dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: f */
    public final void mo3978f(C1174dp dpVar) {
        C1061d.m3041b(this.f3504a, dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: g */
    public final void mo3979g(C1174dp dpVar) {
        this.f3504a.onClosed(dpVar.mo3984l().f3204a.f3205a);
    }

    /* renamed from: h */
    public final void mo3980h(C1174dp dpVar, Surface surface) {
        C1009b.m3020a(this.f3504a, dpVar.mo3984l().f3204a.f3205a, surface);
    }
}
