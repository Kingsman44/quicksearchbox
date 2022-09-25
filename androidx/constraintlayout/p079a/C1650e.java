package androidx.constraintlayout.p079a;

/* renamed from: androidx.constraintlayout.a.e */
/* compiled from: PG */
final class C1650e {

    /* renamed from: a */
    public final Object[] f4779a = new Object[256];

    /* renamed from: b */
    public int f4780b;

    /* renamed from: a */
    public final Object mo4687a() {
        int i = this.f4780b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f4779a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f4780b = i2;
        return obj;
    }

    /* renamed from: b */
    public final void mo4688b(Object obj) {
        int i = this.f4780b;
        if (i < 256) {
            this.f4779a[i] = obj;
            this.f4780b = i + 1;
        }
    }
}
