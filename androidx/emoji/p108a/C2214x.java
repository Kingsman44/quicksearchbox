package androidx.emoji.p108a;

import android.util.SparseArray;

/* renamed from: androidx.emoji.a.x */
/* compiled from: PG */
final class C2214x {

    /* renamed from: a */
    public C2201k f6263a;

    /* renamed from: b */
    private final SparseArray f6264b;

    private C2214x() {
        this(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C2214x mo5528a(int i) {
        return (C2214x) this.f6264b.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5529b(C2201k kVar, int i, int i2) {
        C2214x a = mo5528a(kVar.mo5518a().mo8575a(i));
        if (a == null) {
            a = new C2214x(1);
            this.f6264b.put(kVar.mo5518a().mo8575a(i), a);
        }
        if (i2 > i) {
            a.mo5529b(kVar, i + 1, i2);
        } else {
            a.f6263a = kVar;
        }
    }

    public C2214x(int i) {
        this.f6264b = new SparseArray(i);
    }
}
