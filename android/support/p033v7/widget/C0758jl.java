package android.support.p033v7.widget;

import android.util.SparseArray;

/* renamed from: android.support.v7.widget.jl */
/* compiled from: PG */
public final class C0758jl implements C0762jp {

    /* renamed from: a */
    final SparseArray f2648a = new SparseArray();

    /* renamed from: b */
    int f2649b = 0;

    /* renamed from: a */
    public final C0622ek mo3273a(int i) {
        C0622ek ekVar = (C0622ek) this.f2648a.get(i);
        if (ekVar != null) {
            return ekVar;
        }
        throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
    }

    /* renamed from: b */
    public final C0761jo mo3274b(C0622ek ekVar) {
        return new C0757jk(this, ekVar);
    }
}
