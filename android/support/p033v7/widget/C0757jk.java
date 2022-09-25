package android.support.p033v7.widget;

import android.util.SparseIntArray;

/* renamed from: android.support.v7.widget.jk */
/* compiled from: PG */
final class C0757jk implements C0761jo {

    /* renamed from: a */
    final C0622ek f2644a;

    /* renamed from: b */
    final /* synthetic */ C0758jl f2645b;

    /* renamed from: c */
    private final SparseIntArray f2646c = new SparseIntArray(1);

    /* renamed from: d */
    private final SparseIntArray f2647d = new SparseIntArray(1);

    public C0757jk(C0758jl jlVar, C0622ek ekVar) {
        this.f2645b = jlVar;
        this.f2644a = ekVar;
    }

    /* renamed from: a */
    public final int mo3271a(int i) {
        int indexOfKey = this.f2647d.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.f2647d.valueAt(indexOfKey);
        }
        throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.f2644a.f2381c);
    }

    /* renamed from: b */
    public final int mo3272b(int i) {
        int indexOfKey = this.f2646c.indexOfKey(i);
        if (indexOfKey >= 0) {
            return this.f2646c.valueAt(indexOfKey);
        }
        C0758jl jlVar = this.f2645b;
        C0622ek ekVar = this.f2644a;
        int i2 = jlVar.f2649b;
        jlVar.f2649b = i2 + 1;
        jlVar.f2648a.put(i2, ekVar);
        this.f2646c.put(i, i2);
        this.f2647d.put(i2, i);
        return i2;
    }
}
