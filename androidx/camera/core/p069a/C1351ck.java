package androidx.camera.core.p069a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* renamed from: androidx.camera.core.a.ck */
/* compiled from: PG */
public final class C1351ck extends C1350cj {
    /* renamed from: a */
    public static C1351ck m3687a(C1373df dfVar) {
        C1353cm n = dfVar.mo3964n();
        if (n != null) {
            C1351ck ckVar = new C1351ck();
            n.mo3875a(dfVar, ckVar);
            return ckVar;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for ".concat(String.valueOf(dfVar.mo3957g(dfVar.toString()))));
    }

    /* renamed from: b */
    public final C1357cq mo4227b() {
        return new C1357cq(new ArrayList(this.f3831a), this.f3833c, this.f3834d, this.f3836f, this.f3835e, this.f3832b.mo4157a(), this.f3837g);
    }

    /* renamed from: c */
    public final void mo4228c(C1384k kVar) {
        this.f3832b.mo4159c(kVar);
        if (!this.f3836f.contains(kVar)) {
            this.f3836f.add(kVar);
        }
    }

    /* renamed from: d */
    public final void mo4229d(CameraDevice.StateCallback stateCallback) {
        if (!this.f3833c.contains(stateCallback)) {
            this.f3833c.add(stateCallback);
        }
    }

    /* renamed from: e */
    public final void mo4230e(C1352cl clVar) {
        this.f3835e.add(clVar);
    }

    /* renamed from: f */
    public final void mo4231f(CameraCaptureSession.StateCallback stateCallback) {
        if (!this.f3834d.contains(stateCallback)) {
            this.f3834d.add(stateCallback);
        }
    }

    /* renamed from: g */
    public final void mo4232g(C1314ba baVar) {
        this.f3831a.add(C1355co.m3697e(baVar).mo4234a());
        this.f3832b.mo4162f(baVar);
    }
}
