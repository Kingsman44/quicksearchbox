package android.support.p033v7.widget;

import android.util.SparseArray;
import java.util.List;

/* renamed from: android.support.v7.widget.jn */
/* compiled from: PG */
public final class C0760jn implements C0762jp {

    /* renamed from: a */
    final SparseArray f2652a = new SparseArray();

    /* renamed from: a */
    public final C0622ek mo3273a(int i) {
        List list = (List) this.f2652a.get(i);
        if (list != null && !list.isEmpty()) {
            return (C0622ek) list.get(0);
        }
        throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
    }

    /* renamed from: b */
    public final C0761jo mo3274b(C0622ek ekVar) {
        return new C0759jm(this, ekVar);
    }
}
