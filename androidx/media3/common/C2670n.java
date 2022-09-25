package androidx.media3.common;

import java.util.Arrays;

/* renamed from: androidx.media3.common.n */
/* compiled from: PG */
public final class C2670n implements C2668l {

    /* renamed from: a */
    public final int f7433a;

    /* renamed from: b */
    public final int f7434b;

    /* renamed from: c */
    public final int f7435c;

    /* renamed from: d */
    public final byte[] f7436d;

    /* renamed from: e */
    private int f7437e;

    public C2670n(int i, int i2, int i3, byte[] bArr) {
        this.f7433a = i;
        this.f7434b = i2;
        this.f7435c = i3;
        this.f7436d = bArr;
    }

    /* renamed from: a */
    public static int m7234a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    /* renamed from: b */
    public static int m7235b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2670n nVar = (C2670n) obj;
            return this.f7433a == nVar.f7433a && this.f7434b == nVar.f7434b && this.f7435c == nVar.f7435c && Arrays.equals(this.f7436d, nVar.f7436d);
        }
    }

    public final int hashCode() {
        int i = this.f7437e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f7433a + 527) * 31) + this.f7434b) * 31) + this.f7435c) * 31) + Arrays.hashCode(this.f7436d);
        this.f7437e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f7433a;
        int i2 = this.f7434b;
        int i3 = this.f7435c;
        boolean z = this.f7436d != null;
        return "ColorInfo(" + i + ", " + i2 + ", " + i3 + ", " + z + ")";
    }
}
