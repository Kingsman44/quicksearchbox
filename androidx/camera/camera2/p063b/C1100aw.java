package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.p063b.p064a.p067c.C1051i;
import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1257f;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import androidx.p104d.p105a.C2169h;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.camera.camera2.b.aw */
/* compiled from: PG */
final class C1100aw implements C1113bi {

    /* renamed from: a */
    public final C1217t f3280a;

    /* renamed from: b */
    public final C1051i f3281b;

    /* renamed from: c */
    private final int f3282c;

    /* renamed from: d */
    private boolean f3283d = false;

    public C1100aw(C1217t tVar, int i, C1051i iVar) {
        this.f3280a = tVar;
        this.f3282c = i;
        this.f3281b = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo3860a(TotalCaptureResult totalCaptureResult) {
        if (!C1122br.m3145c(this.f3282c, totalCaptureResult)) {
            return C1263l.m3430b(false);
        }
        C1477bw.m3978a("Camera2CapturePipeline", "Trigger AE");
        this.f3283d = true;
        return C1263l.m3433e(C1257f.m3422a(C2169h.m6027a(new C1098au(this))), C1099av.f3279a, C1238a.m3410a());
    }

    /* renamed from: b */
    public final void mo3861b() {
        if (this.f3283d) {
            C1477bw.m3978a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
            this.f3280a.f3564c.mo3949a(false, true);
            this.f3281b.f3182b = false;
        }
    }

    /* renamed from: c */
    public final boolean mo3862c() {
        return this.f3282c == 0;
    }
}
