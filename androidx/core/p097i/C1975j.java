package androidx.core.p097i;

import android.util.SparseArray;
import p5462h.p5463a.C69502as;

/* renamed from: androidx.core.i.j */
/* compiled from: PG */
public final class C1975j extends C69502as {

    /* renamed from: a */
    final /* synthetic */ SparseArray f5893a;

    /* renamed from: b */
    private int f5894b;

    public C1975j(SparseArray sparseArray) {
        this.f5893a = sparseArray;
    }

    /* renamed from: a */
    public final int mo5128a() {
        SparseArray sparseArray = this.f5893a;
        int i = this.f5894b;
        this.f5894b = i + 1;
        return sparseArray.keyAt(i);
    }

    public final boolean hasNext() {
        return this.f5894b < this.f5893a.size();
    }
}
