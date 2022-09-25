package androidx.camera.camera2.p063b;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.p066b.C1027l;
import androidx.camera.camera2.p063b.p064a.p066b.C1035t;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1324bk;
import androidx.camera.core.p069a.C1348ch;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.db */
/* compiled from: PG */
final class C1160db extends C1097at {

    /* renamed from: b */
    static final C1160db f3406b = new C1160db();

    private C1160db() {
    }

    /* renamed from: a */
    public final void mo3859a(C1373df dfVar, C1300an anVar) {
        super.mo3859a(dfVar, anVar);
        if (dfVar instanceof C1324bk) {
            C0988a aVar = new C0988a();
            if (C1348ch.m3679g(dfVar, C1324bk.f3795a)) {
                int A = ((C1324bk) dfVar).mo4193A();
                if (((C1035t) C1027l.f3156a.mo4225a(C1035t.class)) != null) {
                    if (A == 0) {
                        aVar.mo3739d(CaptureRequest.CONTROL_ENABLE_ZSL, true);
                    } else if (A == 1) {
                        aVar.mo3739d(CaptureRequest.CONTROL_ENABLE_ZSL, false);
                    }
                }
            }
            anVar.mo4161e(aVar.mo3736a());
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
