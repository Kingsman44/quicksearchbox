package org.p5610a.p5611a.p5612a.p5617e;

/* renamed from: org.a.a.a.e.d */
/* compiled from: PG */
public final class C71985d extends C71982a {
    public C71985d() {
        this((byte[]) null);
    }

    /* renamed from: b */
    public final byte[] mo63170b() {
        return mo63171c();
    }

    public final void write(int i) {
        int i2 = this.f191694c;
        int i3 = i2 - this.f191692a;
        if (i3 == this.f191693b.length) {
            mo63169a(i2 + 1);
            i3 = 0;
        }
        this.f191693b[i3] = (byte) i;
        this.f191694c++;
    }

    public C71985d(byte[] bArr) {
        mo63169a(1024);
    }

    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (i2 != 0) {
            int i4 = this.f191694c;
            int i5 = i4 + i2;
            int i6 = i4 - this.f191692a;
            while (i2 > 0) {
                int min = Math.min(i2, this.f191693b.length - i6);
                System.arraycopy(bArr, i3 - i2, this.f191693b, i6, min);
                i2 -= min;
                if (i2 > 0) {
                    mo63169a(i5);
                    i6 = 0;
                }
            }
            this.f191694c = i5;
        }
    }
}
