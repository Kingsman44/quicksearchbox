package androidx.media3.extractor;

import java.util.Arrays;

/* renamed from: androidx.media3.extractor.be */
/* compiled from: PG */
public final class C3367be {

    /* renamed from: a */
    public final int f10176a;

    /* renamed from: b */
    public final byte[] f10177b;

    /* renamed from: c */
    public final int f10178c;

    /* renamed from: d */
    public final int f10179d;

    public C3367be(int i, byte[] bArr, int i2, int i3) {
        this.f10176a = i;
        this.f10177b = bArr;
        this.f10178c = i2;
        this.f10179d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3367be beVar = (C3367be) obj;
            return this.f10176a == beVar.f10176a && this.f10178c == beVar.f10178c && this.f10179d == beVar.f10179d && Arrays.equals(this.f10177b, beVar.f10177b);
        }
    }

    public final int hashCode() {
        return (((((this.f10176a * 31) + Arrays.hashCode(this.f10177b)) * 31) + this.f10178c) * 31) + this.f10179d;
    }
}
