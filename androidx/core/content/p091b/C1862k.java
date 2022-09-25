package androidx.core.content.p091b;

import java.util.List;

/* renamed from: androidx.core.content.b.k */
/* compiled from: PG */
final class C1862k {

    /* renamed from: a */
    final int[] f5743a;

    /* renamed from: b */
    final float[] f5744b;

    public C1862k(int i, int i2) {
        this.f5743a = new int[]{i, i2};
        this.f5744b = new float[]{0.0f, 1.0f};
    }

    public C1862k(int i, int i2, int i3) {
        this.f5743a = new int[]{i, i2, i3};
        this.f5744b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1862k(List list, List list2) {
        int size = list.size();
        this.f5743a = new int[size];
        this.f5744b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f5743a[i] = ((Integer) list.get(i)).intValue();
            this.f5744b[i] = ((Float) list2.get(i)).floatValue();
        }
    }
}
