package android.support.p033v7.widget;

/* renamed from: android.support.v7.widget.go */
/* compiled from: PG */
final class C0680go {

    /* renamed from: a */
    public int f2492a = 0;

    /* renamed from: b */
    public int f2493b = 0;

    /* renamed from: c */
    public int f2494c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d */
    public int f2495d = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: e */
    public int f2496e = 0;

    /* renamed from: f */
    public int f2497f = 0;

    /* renamed from: g */
    public boolean f2498g = false;

    /* renamed from: h */
    public boolean f2499h = false;

    /* renamed from: a */
    public final void mo3148a(int i, int i2) {
        this.f2494c = i;
        this.f2495d = i2;
        this.f2499h = true;
        if (this.f2498g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2492a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2493b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2492a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2493b = i2;
        }
    }
}
