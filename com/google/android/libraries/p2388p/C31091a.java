package com.google.android.libraries.p2388p;

/* renamed from: com.google.android.libraries.p.a */
/* compiled from: PG */
public final class C31091a {

    /* renamed from: a */
    public int f83742a = 0;

    /* renamed from: b */
    public int f83743b = 0;

    /* renamed from: c */
    private byte[] f83744c = new byte[1];

    /* renamed from: c */
    public final void mo36825c(byte[] bArr, int i) {
        byte[] bArr2 = this.f83744c;
        int length = bArr2.length;
        int i2 = this.f83743b;
        if (length - i2 < i) {
            int i3 = this.f83742a;
            i2 -= i3;
            int i4 = i2 + i;
            if (i4 > length || i4 <= (length >> 1)) {
                byte[] bArr3 = new byte[i4];
                if (i2 > 0) {
                    System.arraycopy(bArr2, i3, bArr3, 0, i2);
                }
                this.f83744c = bArr3;
            } else if (i2 > 0) {
                System.arraycopy(bArr2, i3, bArr2, 0, i2);
            }
            this.f83742a = 0;
            this.f83743b = i2;
        }
        System.arraycopy(bArr, 0, this.f83744c, i2, i);
        this.f83743b += i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ByteDeque [ ");
        for (int i = 0; i <= this.f83744c.length; i++) {
            if (i == this.f83742a) {
                sb.append("{ ");
            }
            if (i == this.f83743b) {
                sb.append("} ");
            }
            byte[] bArr = this.f83744c;
            if (i < bArr.length) {
                sb.append(String.format("%02X ", new Object[]{Byte.valueOf(bArr[i])}));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final int mo36823a() {
        int i = this.f83742a;
        if (i < this.f83743b) {
            byte[] bArr = this.f83744c;
            this.f83742a = i + 1;
            return bArr[i] & 255;
        }
        throw new IllegalStateException("Byte queue is empty");
    }

    /* renamed from: b */
    public final byte[] mo36824b(int i) {
        int i2 = this.f83742a;
        if (i2 + i <= this.f83743b) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f83744c, i2, bArr, 0, i);
            this.f83742a += i;
            return bArr;
        }
        throw new IllegalStateException("Byte queue is too short");
    }
}
