package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.p063b.p064a.C1063f;
import androidx.camera.camera2.p063b.p064a.C1064g;
import androidx.camera.camera2.p063b.p064a.C1069l;
import androidx.camera.camera2.p063b.p064a.p065a.C1008m;
import androidx.camera.core.p069a.C1320bg;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.camera.core.p069a.p070a.p072b.C1264m;
import androidx.camera.core.p069a.p070a.p072b.C1266o;
import androidx.core.p097i.C1974i;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Objects;

/* renamed from: androidx.camera.camera2.b.dx */
/* compiled from: PG */
class C1182dx extends C1173do implements C1174dp, C1188ec {

    /* renamed from: a */
    final Object f3474a = new Object();

    /* renamed from: b */
    final C1151ct f3475b;

    /* renamed from: c */
    final Executor f3476c;

    /* renamed from: d */
    C1173do f3477d;

    /* renamed from: e */
    C1063f f3478e;

    /* renamed from: f */
    C60870cx f3479f;

    /* renamed from: g */
    C2164c f3480g;

    /* renamed from: h */
    public List f3481h = null;

    /* renamed from: i */
    private final ScheduledExecutorService f3482i;

    /* renamed from: j */
    private C60870cx f3483j;

    /* renamed from: k */
    private boolean f3484k = false;

    /* renamed from: l */
    private boolean f3485l = false;

    /* renamed from: m */
    private boolean f3486m = false;

    public C1182dx(C1151ct ctVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f3475b = ctVar;
        this.f3476c = executor;
        this.f3482i = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo3916a(C1174dp dpVar) {
        Objects.requireNonNull(this.f3477d);
        mo4003u();
        this.f3475b.mo3944e(this);
        this.f3477d.mo3916a(dpVar);
    }

    /* renamed from: b */
    public void mo3917b(C1174dp dpVar) {
        Objects.requireNonNull(this.f3477d);
        C1151ct ctVar = this.f3475b;
        synchronized (ctVar.f3381b) {
            ctVar.f3382c.add(this);
            ctVar.f3384e.remove(this);
        }
        ctVar.mo3943d(this);
        this.f3477d.mo3917b(dpVar);
    }

    /* renamed from: c */
    public final void mo3918c(C1174dp dpVar) {
        Objects.requireNonNull(this.f3477d);
        this.f3477d.mo3918c(dpVar);
    }

    /* renamed from: d */
    public final void mo3919d(C1174dp dpVar) {
        C60870cx cxVar;
        synchronized (this.f3474a) {
            if (!this.f3486m) {
                this.f3486m = true;
                C1974i.m5319g(this.f3479f, "Need to call openCaptureSession before using this API.");
                cxVar = this.f3479f;
            } else {
                cxVar = null;
            }
        }
        if (cxVar != null) {
            ((C2168g) cxVar).f6144b.mo4106b(new C1175dq(this, dpVar), C1238a.m3410a());
        }
    }

    /* renamed from: e */
    public final void mo3977e(C1174dp dpVar) {
        Objects.requireNonNull(this.f3477d);
        this.f3477d.mo3977e(dpVar);
    }

    /* renamed from: f */
    public final void mo3978f(C1174dp dpVar) {
        Objects.requireNonNull(this.f3477d);
        this.f3477d.mo3978f(dpVar);
    }

    /* renamed from: g */
    public void mo3979g(C1174dp dpVar) {
        C60870cx cxVar;
        synchronized (this.f3474a) {
            if (!this.f3484k) {
                this.f3484k = true;
                C1974i.m5319g(this.f3479f, "Need to call openCaptureSession before using this API.");
                cxVar = this.f3479f;
            } else {
                cxVar = null;
            }
        }
        mo4003u();
        if (cxVar != null) {
            ((C2168g) cxVar).f6144b.mo4106b(new C1178dt(this, dpVar), C1238a.m3410a());
        }
    }

    /* renamed from: h */
    public final void mo3980h(C1174dp dpVar, Surface surface) {
        Objects.requireNonNull(this.f3477d);
        this.f3477d.mo3980h(dpVar, surface);
    }

    /* renamed from: i */
    public int mo3981i(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C1974i.m5319g(this.f3478e, "Need to call openCaptureSession before using this API.");
        C1063f fVar = this.f3478e;
        return ((C1064g) fVar.f3204a).f3205a.setSingleRepeatingRequest(captureRequest, this.f3476c, captureCallback);
    }

    /* renamed from: k */
    public final C1173do mo3983k() {
        return this;
    }

    /* renamed from: l */
    public final C1063f mo3984l() {
        C1063f fVar = this.f3478e;
        fVar.getClass();
        return fVar;
    }

    /* renamed from: m */
    public C60870cx mo3985m() {
        return C1266o.f3667a;
    }

    /* renamed from: n */
    public void mo3986n() {
        C1974i.m5319g(this.f3478e, "Need to call openCaptureSession before using this API.");
        C1151ct ctVar = this.f3475b;
        synchronized (ctVar.f3381b) {
            ctVar.f3383d.add(this);
        }
        this.f3478e.f3204a.f3205a.close();
        this.f3476c.execute(new C1179du(this));
    }

    /* renamed from: o */
    public final void mo3987o() {
        mo4003u();
    }

    /* renamed from: p */
    public final void mo3988p() {
        C1974i.m5319g(this.f3478e, "Need to call openCaptureSession before using this API.");
        this.f3478e.f3204a.f3205a.stopRepeating();
    }

    /* renamed from: q */
    public final void mo3989q(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        C1974i.m5319g(this.f3478e, "Need to call openCaptureSession before using this API.");
        C1063f fVar = this.f3478e;
        ((C1064g) fVar.f3204a).f3205a.captureBurstRequests(list, this.f3476c, captureCallback);
    }

    /* renamed from: r */
    public C60870cx mo4000r(CameraDevice cameraDevice, C1008m mVar, List list) {
        synchronized (this.f3474a) {
            if (this.f3485l) {
                C1264m mVar2 = new C1264m(new CancellationException("Opener is disabled"));
                return mVar2;
            }
            C1151ct ctVar = this.f3475b;
            synchronized (ctVar.f3381b) {
                ctVar.f3384e.add(this);
            }
            C60870cx a = C2169h.m6027a(new C1177ds(this, list, new C1069l(cameraDevice), mVar));
            this.f3479f = a;
            C1263l.m3436h(a, new C1180dv(this), C1238a.m3410a());
            C60870cx c = C1263l.m3431c(this.f3479f);
            return c;
        }
    }

    /* renamed from: s */
    public final Executor mo4001s() {
        return this.f3476c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo4002t(CameraCaptureSession cameraCaptureSession) {
        if (this.f3478e == null) {
            this.f3478e = new C1063f(cameraCaptureSession);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo4003u() {
        synchronized (this.f3474a) {
            List list = this.f3481h;
            if (list != null) {
                C1320bg.m3527a(list);
                this.f3481h = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo4004v() {
        boolean z;
        synchronized (this.f3474a) {
            z = this.f3479f != null;
        }
        return z;
    }

    /* renamed from: w */
    public boolean mo4005w() {
        boolean z;
        C60870cx cxVar = null;
        try {
            synchronized (this.f3474a) {
                if (!this.f3485l) {
                    C60870cx cxVar2 = this.f3483j;
                    if (cxVar2 != null) {
                        cxVar = cxVar2;
                    }
                    this.f3485l = true;
                }
                z = !mo4004v();
            }
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            return z;
        } catch (Throwable th) {
            if (cxVar != null) {
                cxVar.cancel(true);
            }
            throw th;
        }
    }

    /* renamed from: x */
    public final C1008m mo4006x(List list, C1173do doVar) {
        this.f3477d = doVar;
        return new C1008m(list, this.f3476c, new C1181dw(this));
    }

    /* renamed from: j */
    public final CameraDevice mo3982j() {
        C1063f fVar = this.f3478e;
        fVar.getClass();
        return fVar.f3204a.f3205a.getDevice();
    }

    /* renamed from: y */
    public C60870cx mo4007y(List list) {
        synchronized (this.f3474a) {
            if (this.f3485l) {
                C1264m mVar = new C1264m(new CancellationException("Opener is disabled"));
                return mVar;
            }
            C60870cx f = C1263l.m3434f(C1257f.m3422a(C1320bg.m3529c(list, this.f3476c, this.f3482i)), new C1176dr(this, list), this.f3476c);
            this.f3483j = f;
            C60870cx c = C1263l.m3431c(f);
            return c;
        }
    }
}
