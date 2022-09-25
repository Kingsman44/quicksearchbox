package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraAccessException;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1558h;
import androidx.camera.core.p069a.C1311ay;
import androidx.camera.core.p069a.C1314ba;
import androidx.camera.core.p069a.C1352cl;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.p070a.p071a.C1247j;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* renamed from: androidx.camera.camera2.b.ae */
/* compiled from: PG */
final class C1082ae implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1091an f3225a;

    public C1082ae(C1091an anVar) {
        this.f3225a = anVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        C1357cq cqVar = null;
        if (th instanceof C1311ay) {
            C1091an anVar = this.f3225a;
            C1314ba baVar = ((C1311ay) th).f3764a;
            Iterator it = anVar.f3242a.mo4265b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1357cq cqVar2 = (C1357cq) it.next();
                if (cqVar2.mo4242b().contains(baVar)) {
                    cqVar = cqVar2;
                    break;
                }
            }
            if (cqVar != null) {
                C1091an anVar2 = this.f3225a;
                ScheduledExecutorService a = C1247j.m3414a();
                List list = cqVar.f3846e;
                if (!list.isEmpty()) {
                    anVar2.mo3822h("Posting surface closed", new Throwable());
                    a.execute(new C1079ab((C1352cl) list.get(0)));
                }
            }
        } else if (th instanceof CancellationException) {
            this.f3225a.mo3822h("Unable to configure camera cancelled", (Throwable) null);
        } else {
            if (this.f3225a.f3253l == 4) {
                this.f3225a.mo3838w(4, new C1558h(4, th), true);
            }
            if (th instanceof CameraAccessException) {
                this.f3225a.mo3822h("Unable to configure camera due to ".concat(String.valueOf(th.getMessage())), (Throwable) null);
            } else if (th instanceof TimeoutException) {
                C1477bw.m3980c("Camera2CameraImpl", "Unable to configure camera " + this.f3225a.f3245d.f3271a + ", timeout!");
            }
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Void voidR = (Void) obj;
    }
}
