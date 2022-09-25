package androidx.camera.camera2.p063b.p064a.p065a;

import android.hardware.camera2.CameraCaptureSession;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.b.a.a.m */
/* compiled from: PG */
public final class C1008m {

    /* renamed from: a */
    public final C1007l f3150a;

    public C1008m(List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f3150a = new C1007l(list, executor, stateCallback);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1008m)) {
            return false;
        }
        return this.f3150a.equals(((C1008m) obj).f3150a);
    }

    public final int hashCode() {
        return this.f3150a.f3149a.hashCode();
    }
}
