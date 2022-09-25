package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1558h;
import androidx.camera.core.C1571u;
import androidx.core.p097i.C1974i;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.b.al */
/* compiled from: PG */
final class C1089al extends CameraDevice.StateCallback {

    /* renamed from: a */
    ScheduledFuture f3236a;

    /* renamed from: b */
    public final C1086ai f3237b = new C1086ai(this);

    /* renamed from: c */
    final /* synthetic */ C1091an f3238c;

    /* renamed from: d */
    private final Executor f3239d;

    /* renamed from: e */
    private final ScheduledExecutorService f3240e;

    /* renamed from: f */
    private C1088ak f3241f;

    public C1089al(C1091an anVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f3238c = anVar;
        this.f3239d = executor;
        this.f3240e = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3804a() {
        boolean z = true;
        C1974i.m5315c(this.f3241f == null, (String) null);
        if (this.f3236a != null) {
            z = false;
        }
        C1974i.m5315c(z, (String) null);
        C1086ai aiVar = this.f3237b;
        if (aiVar.mo3801c() >= ((long) aiVar.mo3800b())) {
            aiVar.f3230a = -1;
            C1477bw.m3980c("Camera2CameraImpl", "Camera reopening attempted for " + this.f3237b.mo3800b() + "ms without success.");
            this.f3238c.mo3838w(2, (C1571u) null, false);
            return;
        }
        this.f3241f = new C1088ak(this, this.f3239d);
        C1091an anVar = this.f3238c;
        anVar.mo3822h("Attempting camera re-open in " + this.f3237b.mo3799a() + "ms: " + this.f3241f + " activeResuming = " + this.f3238c.f3252k, (Throwable) null);
        this.f3236a = this.f3240e.schedule(this.f3241f, (long) this.f3237b.mo3799a(), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo3805b() {
        if (this.f3236a == null) {
            return false;
        }
        C1091an anVar = this.f3238c;
        StringBuilder sb = new StringBuilder("Cancelling scheduled re-open: ");
        C1088ak akVar = this.f3241f;
        sb.append(akVar);
        anVar.mo3822h("Cancelling scheduled re-open: ".concat(String.valueOf(akVar)), (Throwable) null);
        this.f3241f.f3233a = true;
        this.f3241f = null;
        this.f3236a.cancel(false);
        this.f3236a = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo3806c() {
        C1091an anVar = this.f3238c;
        if (!anVar.f3252k) {
            return false;
        }
        int i = anVar.f3247f;
        return i == 1 || i == 2;
    }

    public final void onClosed(CameraDevice cameraDevice) {
        this.f3238c.mo3822h("CameraDevice.onClosed()", (Throwable) null);
        boolean z = this.f3238c.f3246e == null;
        new StringBuilder("Unexpected onClose callback on camera device: ").append(cameraDevice);
        C1974i.m5315c(z, "Unexpected onClose callback on camera device: ".concat(String.valueOf(cameraDevice)));
        int i = this.f3238c.f3253l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 4) {
                if (i2 == 5) {
                    C1091an anVar = this.f3238c;
                    int i3 = anVar.f3247f;
                    if (i3 != 0) {
                        anVar.mo3822h("Camera closed due to error: ".concat(C1091an.m3072d(i3)), (Throwable) null);
                        mo3804a();
                        return;
                    }
                    anVar.mo3833s(false);
                    return;
                } else if (i2 != 6) {
                    int i4 = this.f3238c.f3253l;
                    C1085ah.m3057a(i4);
                    throw new IllegalStateException("Camera closed while in state: ".concat(C1085ah.m3057a(i4)));
                }
            }
            C1974i.m5315c(this.f3238c.mo3837v(), (String) null);
            this.f3238c.mo3824j();
            return;
        }
        throw null;
    }

    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f3238c.mo3822h("CameraDevice.onDisconnected()", (Throwable) null);
        onError(cameraDevice, 1);
    }

    public final void onOpened(CameraDevice cameraDevice) {
        this.f3238c.mo3822h("CameraDevice.onOpened()", (Throwable) null);
        C1091an anVar = this.f3238c;
        anVar.f3246e = cameraDevice;
        anVar.f3247f = 0;
        this.f3237b.f3230a = -1;
        int i = anVar.f3253l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            int i3 = this.f3238c.f3253l;
                            C1085ah.m3057a(i3);
                            throw new IllegalStateException("onOpened() should not be possible from state: ".concat(C1085ah.m3057a(i3)));
                        }
                    }
                }
                C1974i.m5315c(this.f3238c.mo3837v(), (String) null);
                this.f3238c.f3246e.close();
                this.f3238c.f3246e = null;
                return;
            }
            this.f3238c.mo3838w(4, (C1571u) null, true);
            this.f3238c.mo3829o();
            return;
        }
        throw null;
    }

    public final void onError(CameraDevice cameraDevice, int i) {
        C1091an anVar = this.f3238c;
        anVar.f3246e = cameraDevice;
        anVar.f3247f = i;
        int i2 = anVar.f3253l;
        int i3 = i2 - 1;
        if (i2 != 0) {
            int i4 = 6;
            boolean z = false;
            int i5 = 3;
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            int i6 = this.f3238c.f3253l;
                            C1085ah.m3057a(i6);
                            throw new IllegalStateException("onError() should not be possible from state: ".concat(C1085ah.m3057a(i6)));
                        }
                    }
                }
                Object[] objArr = new Object[3];
                objArr[0] = cameraDevice.getId();
                objArr[1] = C1091an.m3072d(i);
                int i7 = this.f3238c.f3253l;
                String a = C1085ah.m3057a(i7);
                if (i7 != 0) {
                    objArr[2] = a;
                    C1477bw.m3980c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", objArr));
                    this.f3238c.mo3839x();
                    return;
                }
                throw null;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = cameraDevice.getId();
            objArr2[1] = C1091an.m3072d(i);
            int i8 = this.f3238c.f3253l;
            String a2 = C1085ah.m3057a(i8);
            if (i8 != 0) {
                objArr2[2] = a2;
                C1477bw.m3978a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", objArr2));
                boolean z2 = this.f3238c.f3253l == 3 || this.f3238c.f3253l == 4 || this.f3238c.f3253l == 6;
                int i9 = this.f3238c.f3253l;
                C1085ah.m3057a(i9);
                C1974i.m5315c(z2, "Attempt to handle open error from non open state: ".concat(C1085ah.m3057a(i9)));
                if (i == 1 || i == 2 || i == 4) {
                    C1477bw.m3978a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), C1091an.m3072d(i)}));
                    if (this.f3238c.f3247f != 0) {
                        z = true;
                    }
                    C1974i.m5315c(z, "Can only reopen camera device after error if the camera device is actually in an error state.");
                    if (i == 1) {
                        i5 = 2;
                    } else if (i == 2) {
                        i5 = 1;
                    }
                    this.f3238c.mo3838w(6, new C1558h(i5, (Throwable) null), true);
                    this.f3238c.mo3839x();
                    return;
                }
                C1477bw.m3980c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C1091an.m3072d(i) + " closing camera.");
                if (i == 3) {
                    i4 = 5;
                }
                this.f3238c.mo3838w(5, new C1558h(i4, (Throwable) null), true);
                this.f3238c.mo3839x();
                return;
            }
            throw null;
        }
        throw null;
    }
}
