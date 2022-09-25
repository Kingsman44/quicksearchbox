package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p068c.C1233i;
import androidx.camera.camera2.p068c.C1234j;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.C1302ap;
import androidx.camera.core.p069a.C1320bg;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1358cr;
import androidx.camera.core.p069a.C1384k;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.core.p097i.C1974i;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.camera.camera2.b.dm */
/* compiled from: PG */
final class C1171dm implements C1148cq {

    /* renamed from: a */
    public static final List f3423a = new ArrayList();

    /* renamed from: m */
    private static int f3424m = 0;

    /* renamed from: b */
    public final C1358cr f3425b;

    /* renamed from: c */
    final Executor f3426c;

    /* renamed from: d */
    public final C1147cp f3427d = new C1147cp();

    /* renamed from: e */
    public List f3428e = new ArrayList();

    /* renamed from: f */
    public C1357cq f3429f;

    /* renamed from: g */
    public C1126bv f3430g;

    /* renamed from: h */
    public C1357cq f3431h;

    /* renamed from: i */
    public volatile C1302ap f3432i = null;

    /* renamed from: j */
    volatile boolean f3433j = false;

    /* renamed from: k */
    public int f3434k = 0;

    /* renamed from: l */
    public int f3435l;

    /* renamed from: n */
    private final ScheduledExecutorService f3436n;

    /* renamed from: o */
    private C1234j f3437o = new C1233i().mo4062c();

    /* renamed from: p */
    private C1234j f3438p = new C1233i().mo4062c();

    public C1171dm(C1358cr crVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f3425b = crVar;
        this.f3426c = executor;
        this.f3436n = scheduledExecutorService;
        this.f3435l = 1;
        int i = f3424m;
        f3424m = i + 1;
        this.f3434k = i;
        C1477bw.m3978a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f3434k + ")");
    }

    /* renamed from: c */
    private static void m3242c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (C1384k a : ((C1302ap) it.next()).f3752f) {
                a.mo3868a();
            }
        }
    }

    /* renamed from: e */
    private final void m3243e(C1234j jVar, C1234j jVar2) {
        C0988a aVar = new C0988a();
        aVar.mo3738c(jVar);
        aVar.mo3738c(jVar2);
        C1358cr crVar = this.f3425b;
        aVar.mo3736a();
        crVar.mo4247e();
    }

    /* renamed from: a */
    public final C1357cq mo3920a() {
        return this.f3429f;
    }

    /* renamed from: b */
    public final C60870cx mo3921b(C1357cq cqVar, CameraDevice cameraDevice, C1189ed edVar) {
        boolean z = this.f3435l == 1;
        int i = this.f3435l;
        C1170dl.m3241a(i);
        C1974i.m5314b(z, "Invalid state state:".concat(C1170dl.m3241a(i)));
        C1974i.m5314b(!cqVar.mo4242b().isEmpty(), "SessionConfig contains no surfaces");
        C1477bw.m3978a("ProcessingCaptureSession", "open (id=" + this.f3434k + ")");
        List b = cqVar.mo4242b();
        this.f3428e = b;
        return C1263l.m3433e(C1263l.m3434f(C1257f.m3422a(C1320bg.m3529c(b, this.f3426c, this.f3436n)), new C1167di(this, cqVar, cameraDevice, edVar), this.f3426c), new C1168dj(this), this.f3426c);
    }

    /* renamed from: d */
    public final List mo3923d() {
        if (this.f3432i == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(new C1302ap[]{this.f3432i});
    }

    /* renamed from: f */
    public final void mo3925f() {
        C1477bw.m3978a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f3434k + ")");
        if (this.f3432i != null) {
            for (C1384k a : this.f3432i.f3752f) {
                a.mo3868a();
            }
            this.f3432i = null;
        }
    }

    /* renamed from: g */
    public final void mo3926g() {
        C1477bw.m3978a("ProcessingCaptureSession", "close (id=" + this.f3434k + ") state=" + C1170dl.m3241a(this.f3435l));
        int i = this.f3435l;
        int i2 = i + -1;
        if (i != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    this.f3425b.mo4244b();
                    C1126bv bvVar = this.f3430g;
                    if (bvVar != null) {
                        bvVar.f3339a = true;
                    }
                    this.f3435l = 4;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        return;
                    }
                    this.f3435l = 5;
                    this.f3427d.mo3926g();
                    return;
                }
            }
            this.f3425b.mo4243a();
            this.f3435l = 5;
            this.f3427d.mo3926g();
            return;
        }
        throw null;
    }

    /* renamed from: i */
    public final void mo3928i(List list) {
        if (!list.isEmpty()) {
            if (list.size() > 1 || list.isEmpty()) {
                m3242c(list);
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C1302ap) it.next()).f3751e != 2) {
                    m3242c(list);
                    return;
                }
            }
            if (this.f3432i != null || this.f3433j) {
                m3242c(list);
                return;
            }
            C1302ap apVar = (C1302ap) list.get(0);
            C1477bw.m3978a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f3434k + ") + state =" + C1170dl.m3241a(this.f3435l));
            int i = this.f3435l;
            int i2 = i + -1;
            if (i == 0) {
                throw null;
            } else if (i2 == 0 || i2 == 1) {
                this.f3432i = apVar;
            } else if (i2 == 2) {
                this.f3433j = true;
                C1233i a = C1233i.m3390a(apVar.f3750d);
                if (apVar.f3750d.mo3960j(C1302ap.f3747a)) {
                    a.mo4063d(CaptureRequest.JPEG_ORIENTATION, (Integer) apVar.f3750d.mo3953E(C1302ap.f3747a));
                }
                if (apVar.f3750d.mo3960j(C1302ap.f3748b)) {
                    a.mo4063d(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) apVar.f3750d.mo3953E(C1302ap.f3748b)).byteValue()));
                }
                C1234j c = a.mo4062c();
                this.f3438p = c;
                m3243e(this.f3437o, c);
                this.f3425b.mo4248f();
            } else if (i2 == 3 || i2 == 4) {
                int i3 = this.f3435l;
                C1170dl.m3241a(i3);
                C1477bw.m3978a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = ".concat(C1170dl.m3241a(i3)));
                m3242c(list);
            }
        }
    }

    /* renamed from: k */
    public final void mo3930k(C1357cq cqVar) {
        C1477bw.m3978a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f3434k + ")");
        this.f3429f = cqVar;
        if (cqVar != null) {
            C1126bv bvVar = this.f3430g;
            if (bvVar != null) {
                bvVar.f3340b = cqVar;
            }
            if (this.f3435l == 3) {
                C1234j c = C1233i.m3390a(cqVar.f3847f.f3750d).mo4062c();
                this.f3437o = c;
                m3243e(c, this.f3438p);
                this.f3425b.mo4249g();
            }
        }
    }

    /* renamed from: o */
    public final C60870cx mo3934o() {
        C1974i.m5315c(this.f3435l == 5, "release() can only be called in CLOSED state");
        C1477bw.m3978a("ProcessingCaptureSession", "release (id=" + this.f3434k + ")");
        return this.f3427d.mo3934o();
    }
}
