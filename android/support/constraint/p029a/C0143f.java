package android.support.constraint.p029a;

/* renamed from: android.support.constraint.a.f */
/* compiled from: PG */
final class C0143f {

    /* renamed from: a */
    public final Object[] f525a = new Object[256];

    /* renamed from: b */
    public int f526b;

    /* renamed from: a */
    public final Object mo182a() {
        int i = this.f526b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f525a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f526b = i2;
        return obj;
    }

    /* renamed from: b */
    public final void mo183b(Object obj) {
        int i = this.f526b;
        if (i < 256) {
            this.f525a[i] = obj;
            this.f526b = i + 1;
        }
    }
}
