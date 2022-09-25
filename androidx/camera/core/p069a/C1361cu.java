package androidx.camera.core.p069a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.camera.core.a.cu */
/* compiled from: PG */
public final class C1361cu {

    /* renamed from: a */
    public final List f3851a = new ArrayList();

    /* renamed from: a */
    public static void m3718a(List list, int i, int[] iArr, int i2) {
        if (i2 < iArr.length) {
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = 0;
                while (true) {
                    if (i4 >= i2) {
                        iArr[i2] = i3;
                        m3718a(list, i, iArr, i2 + 1);
                        break;
                    } else if (i3 == iArr[i4]) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            return;
        }
        list.add((int[]) iArr.clone());
    }

    /* renamed from: b */
    public final void mo4251b(C1362cv cvVar) {
        this.f3851a.add(cvVar);
    }
}
