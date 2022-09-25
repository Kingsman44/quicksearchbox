package androidx.camera.camera2.p063b;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.p069a.p070a.p071a.C1238a;
import androidx.camera.core.p069a.p070a.p072b.C1263l;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;

/* renamed from: androidx.camera.camera2.b.bf */
/* compiled from: PG */
final class C1110bf implements C1113bi {

    /* renamed from: a */
    final /* synthetic */ C1112bh f3301a;

    public C1110bf(C1112bh bhVar) {
        this.f3301a = bhVar;
    }

    /* renamed from: a */
    public final C60870cx mo3860a(TotalCaptureResult totalCaptureResult) {
        ArrayList arrayList = new ArrayList();
        for (C1113bi a : this.f3301a.f3311h) {
            arrayList.add(a.mo3860a(totalCaptureResult));
        }
        return C1263l.m3433e(C1263l.m3429a(arrayList), C1109be.f3300a, C1238a.m3410a());
    }

    /* renamed from: b */
    public final void mo3861b() {
        for (C1113bi b : this.f3301a.f3311h) {
            b.mo3861b();
        }
    }

    /* renamed from: c */
    public final boolean mo3862c() {
        for (C1113bi c : this.f3301a.f3311h) {
            if (c.mo3862c()) {
                return true;
            }
        }
        return false;
    }
}
