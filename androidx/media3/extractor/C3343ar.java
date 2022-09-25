package androidx.media3.extractor;

/* renamed from: androidx.media3.extractor.ar */
/* compiled from: PG */
public final class C3343ar {

    /* renamed from: a */
    public int f10084a;

    /* renamed from: b */
    public String f10085b;

    /* renamed from: c */
    public int f10086c;

    /* renamed from: d */
    public int f10087d;

    /* renamed from: e */
    public int f10088e;

    /* renamed from: f */
    public int f10089f;

    /* renamed from: g */
    public int f10090g;

    /* renamed from: a */
    public final boolean mo7335a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!C3344as.m9691d(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f10084a = i2;
        this.f10085b = C3344as.f10091a[3 - i3];
        int i8 = C3344as.f10092b[i5];
        this.f10087d = i8;
        int i9 = 2;
        if (i2 == 2) {
            i8 /= 2;
            this.f10087d = i8;
        } else if (i2 == 0) {
            i8 /= 4;
            this.f10087d = i8;
        }
        int i10 = (i >>> 9) & 1;
        this.f10090g = C3344as.m9689b(i2, i3);
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = C3344as.f10093c[i4 - 1];
            } else {
                i7 = C3344as.f10094d[i4 - 1];
            }
            this.f10089f = i7;
            this.f10086c = (((i7 * 12) / i8) + i10) * 4;
        } else {
            int i11 = 144;
            if (i2 == 3) {
                if (i3 == 2) {
                    i6 = C3344as.f10095e[i4 - 1];
                } else {
                    i6 = C3344as.f10096f[i4 - 1];
                }
                this.f10089f = i6;
                this.f10086c = ((i6 * 144) / i8) + i10;
            } else {
                int i12 = C3344as.f10097g[i4 - 1];
                this.f10089f = i12;
                if (i3 == 1) {
                    i11 = 72;
                }
                this.f10086c = ((i11 * i12) / i8) + i10;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i9 = 1;
        }
        this.f10088e = i9;
        return true;
    }
}
