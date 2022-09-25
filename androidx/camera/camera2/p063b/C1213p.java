package androidx.camera.camera2.p063b;

import android.util.ArrayMap;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.C1386m;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.camera.camera2.b.p */
/* compiled from: PG */
final class C1213p extends C1384k {

    /* renamed from: a */
    final Set f3556a = new HashSet();

    /* renamed from: b */
    final Map f3557b = new ArrayMap();

    /* renamed from: a */
    public final void mo3868a() {
        for (C1384k kVar : this.f3556a) {
            try {
                ((Executor) this.f3557b.get(kVar)).execute(new C1211n(kVar));
            } catch (RejectedExecutionException e) {
                C1477bw.m3981d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo3869b(C1386m mVar) {
        for (C1384k kVar : this.f3556a) {
            try {
                ((Executor) this.f3557b.get(kVar)).execute(new C1210m(kVar, mVar));
            } catch (RejectedExecutionException e) {
                C1477bw.m3981d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo3870c(C1131c cVar) {
        for (C1384k kVar : this.f3556a) {
            try {
                ((Executor) this.f3557b.get(kVar)).execute(new C1212o(kVar, cVar));
            } catch (RejectedExecutionException e) {
                C1477bw.m3981d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
            }
        }
    }
}
