package androidx.media3.exoplayer.p137a;

import android.util.SparseArray;
import androidx.media3.common.C2677u;

/* renamed from: androidx.media3.exoplayer.a.c */
/* compiled from: PG */
public final class C2732c {

    /* renamed from: a */
    public final C2677u f7608a;

    /* renamed from: b */
    private final SparseArray f7609b;

    public C2732c(C2677u uVar, SparseArray sparseArray) {
        this.f7608a = uVar;
        SparseArray sparseArray2 = new SparseArray(uVar.f7443a.size());
        for (int i = 0; i < uVar.f7443a.size(); i++) {
            int a = uVar.mo6352a(i);
            C2711b bVar = (C2711b) sparseArray.get(a);
            bVar.getClass();
            sparseArray2.append(a, bVar);
        }
        this.f7609b = sparseArray2;
    }

    /* renamed from: a */
    public final C2711b mo6451a(int i) {
        C2711b bVar = (C2711b) this.f7609b.get(i);
        bVar.getClass();
        return bVar;
    }
}
