package android.support.constraint.p029a;

/* renamed from: android.support.constraint.a.g */
/* compiled from: PG */
public final class C0144g {

    /* renamed from: a */
    public int f527a = -1;

    /* renamed from: b */
    int f528b = -1;

    /* renamed from: c */
    public int f529c = 0;

    /* renamed from: d */
    public float f530d;

    /* renamed from: e */
    final float[] f531e = new float[6];

    /* renamed from: f */
    C0139b[] f532f = new C0139b[8];

    /* renamed from: g */
    int f533g = 0;

    /* renamed from: h */
    int f534h;

    public C0144g(int i) {
        this.f534h = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo184a(C0139b bVar) {
        int i = 0;
        int i2 = 0;
        while (i2 < this.f533g) {
            if (this.f532f[i2] == bVar) {
                while (true) {
                    int i3 = this.f533g;
                    if (i < (i3 - i2) - 1) {
                        C0139b[] bVarArr = this.f532f;
                        int i4 = i2 + i;
                        bVarArr[i4] = bVarArr[i4 + 1];
                        i++;
                    } else {
                        this.f533g = i3 - 1;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    /* renamed from: b */
    public final void mo185b() {
        this.f534h = 5;
        this.f529c = 0;
        this.f527a = -1;
        this.f528b = -1;
        this.f530d = 0.0f;
        this.f533g = 0;
    }

    public final String toString() {
        return "null";
    }
}
