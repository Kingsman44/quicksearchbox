package androidx.camera.camera2.p063b;

import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0988a;
import androidx.camera.camera2.p063b.p064a.p066b.C1027l;
import androidx.camera.camera2.p063b.p064a.p066b.C1041z;
import androidx.camera.core.p069a.C1300an;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1328bo;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1351ck;
import androidx.camera.core.p069a.C1373df;
import androidx.camera.core.p069a.C1376di;

/* renamed from: androidx.camera.camera2.b.bx */
/* compiled from: PG */
public final class C1128bx implements C1376di {

    /* renamed from: a */
    final C1153cv f3342a;

    public C1128bx(Context context) {
        this.f3342a = C1153cv.m3205d(context);
    }

    /* renamed from: a */
    public final C1308av mo3876a(int i, int i2) {
        Object obj;
        C1339bz g = C1339bz.m3625g();
        C1351ck ckVar = new C1351ck();
        int i3 = i - 1;
        int i4 = 5;
        if (i3 != 0) {
            ckVar.f3832b.f3742c = 1;
        } else {
            ckVar.f3832b.f3742c = i2 == 2 ? 5 : 1;
        }
        if (i == 2 && ((C1041z) C1027l.f3156a.mo4225a(C1041z.class)) != null) {
            C0988a aVar = new C0988a();
            aVar.mo3739d(CaptureRequest.TONEMAP_MODE, 2);
            ckVar.f3832b.mo4161e(aVar.mo3736a());
        }
        g.mo4216c(C1373df.f3865l, C1339bz.f3819a, ckVar.mo4227b());
        g.mo4216c(C1373df.f3867n, C1339bz.f3819a, C1127bw.f3341a);
        C1300an anVar = new C1300an();
        if (i3 != 0) {
            anVar.f3742c = 1;
        } else {
            if (i2 != 2) {
                i4 = 2;
            }
            anVar.f3742c = i4;
        }
        g.mo4216c(C1373df.f3866m, C1339bz.f3819a, anVar.mo4157a());
        C1306at atVar = C1373df.f3868o;
        if (i == 1) {
            obj = C1160db.f3406b;
        } else {
            obj = C1097at.f3277a;
        }
        g.mo4216c(atVar, C1339bz.f3819a, obj);
        if (i == 2) {
            g.mo4216c(C1328bo.f3809C, C1339bz.f3819a, this.f3342a.mo3946b());
        }
        g.mo4216c(C1328bo.f3812y, C1339bz.f3819a, Integer.valueOf(this.f3342a.mo3947c().getRotation()));
        return C1343cc.m3633m(g);
    }
}
