package androidx.lifecycle;

/* renamed from: androidx.lifecycle.ae */
/* compiled from: PG */
public final class C2330ae implements C2333ah {

    /* renamed from: a */
    public final LiveData f6527a;

    /* renamed from: b */
    final C2333ah f6528b;

    /* renamed from: c */
    int f6529c = -1;

    public C2330ae(LiveData liveData, C2333ah ahVar) {
        this.f6527a = liveData;
        this.f6528b = ahVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        int i = this.f6529c;
        int i2 = this.f6527a.f6498g;
        if (i != i2) {
            this.f6529c = i2;
            this.f6528b.mo774hX(obj);
        }
    }
}
