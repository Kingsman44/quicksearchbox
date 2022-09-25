package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.bh */
/* compiled from: PG */
public final class C3370bh {

    /* renamed from: a */
    public int f10187a;

    /* renamed from: b */
    public int f10188b;

    /* renamed from: c */
    private final byte[] f10189c;

    /* renamed from: d */
    private final int f10190d;

    public C3370bh(byte[] bArr) {
        this.f10189c = bArr;
        this.f10190d = bArr.length;
    }

    /* renamed from: a */
    public final int mo7362a(int i) {
        int i2 = this.f10187a;
        int min = Math.min(i, 8 - this.f10188b);
        int i3 = i2 + 1;
        int i4 = ((this.f10189c[i2] & 255) >> this.f10188b) & (PrivateKeyType.INVALID >> (8 - min));
        while (min < i) {
            i4 |= (this.f10189c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo7363b(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: b */
    public final void mo7363b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f10187a + i3;
        this.f10187a = i4;
        int i5 = this.f10188b + (i - (i3 * 8));
        this.f10188b = i5;
        if (i5 > 7) {
            i4++;
            this.f10187a = i4;
            i5 -= 8;
            this.f10188b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f10190d) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        C2601a.m6832d(z);
    }

    /* renamed from: c */
    public final boolean mo7364c() {
        byte b = this.f10189c[this.f10187a];
        int i = this.f10188b;
        mo7363b(1);
        if (1 != (((b & 255) >> i) & 1)) {
            return false;
        }
        return true;
    }
}
