package androidx.camera.camera2.p063b;

import androidx.camera.core.C1477bw;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import java.util.concurrent.CancellationException;

/* renamed from: androidx.camera.camera2.b.cl */
/* compiled from: PG */
final class C1143cl implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1147cp f3358a;

    public C1143cl(C1147cp cpVar) {
        this.f3358a = cpVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        synchronized (this.f3358a.f3361a) {
            this.f3358a.f3362b.mo4014b();
            int i = this.f3358a.f3372l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (i2 == 3 || i2 == 5 || i2 == 6) {
                if (!(th instanceof CancellationException)) {
                    C1477bw.m3984g("CaptureSession", "Opening session with fail " + C1145cn.m3165a(this.f3358a.f3372l), th);
                    this.f3358a.mo3927h();
                }
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Void voidR = (Void) obj;
    }
}
