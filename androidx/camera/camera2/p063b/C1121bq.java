package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.camera2.b.bq */
/* compiled from: PG */
final class C1121bq implements C1113bi {

    /* renamed from: a */
    public static final long f3323a = TimeUnit.SECONDS.toNanos(2);

    /* renamed from: b */
    public final C1217t f3324b;

    /* renamed from: c */
    private final int f3325c;

    /* renamed from: d */
    private boolean f3326d = false;

    /* renamed from: e */
    private final Executor f3327e;

    public C1121bq(C1217t tVar, int i, Executor executor) {
        this.f3324b = tVar;
        this.f3325c = i;
        this.f3327e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo3860a(TotalCaptureResult totalCaptureResult) {
        if (C1122br.m3145c(this.f3325c, totalCaptureResult)) {
            if (this.f3324b.f3569h) {
                C1477bw.m3978a("Camera2CapturePipeline", "Torch already on, not turn on");
            } else {
                C1477bw.m3978a("Camera2CapturePipeline", "Turn on torch");
                this.f3326d = true;
                return C1263l.m3433e(C1263l.m3434f(C1257f.m3422a(C2169h.m6027a(new C1118bn(this))), new C1119bo(this), this.f3327e), C1120bp.f3322a, C1238a.m3410a());
            }
        }
        return C1263l.m3430b(false);
    }

    /* renamed from: b */
    public final void mo3861b() {
        if (this.f3326d) {
            this.f3324b.f3565d.mo4015a((C2164c) null, false);
            C1477bw.m3978a("Camera2CapturePipeline", "Turn off torch");
        }
    }

    /* renamed from: c */
    public final boolean mo3862c() {
        return this.f3325c == 0;
    }
}
