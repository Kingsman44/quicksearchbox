package androidx.camera.core.p069a;

import android.util.Size;
import androidx.camera.core.p073b.p077b.C1438d;

/* renamed from: androidx.camera.core.a.cv */
/* compiled from: PG */
public abstract class C1362cv {
    /* renamed from: c */
    public static C1362cv m3720c(int i, Size size, C1363cw cwVar) {
        int i2;
        int d = m3721d(i);
        int a = C1438d.m3898a(size);
        C1383j jVar = (C1383j) cwVar;
        if (a <= C1438d.m3898a(jVar.f3894a)) {
            i2 = 1;
        } else if (a <= C1438d.m3898a(jVar.f3895b)) {
            i2 = 2;
        } else {
            i2 = a <= C1438d.m3898a(jVar.f3896c) ? 3 : 4;
        }
        return new C1382i(d, i2);
    }

    /* renamed from: d */
    public static int m3721d(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        return i == 32 ? 4 : 1;
    }

    /* renamed from: a */
    public abstract int mo4252a();

    /* renamed from: b */
    public abstract int mo4253b();
}
