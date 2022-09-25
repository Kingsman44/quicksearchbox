package org.p5623b.p5624a;

import org.p5623b.p5629b.C72131f;

/* renamed from: org.b.a.ax */
/* compiled from: PG */
public final class C72038ax extends C72097j {
    public C72038ax(byte[] bArr) {
        super(bArr);
    }

    /* renamed from: l */
    private final byte[] m105386l() {
        byte[] bArr = this.f191923a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!mo63284j()) {
            byte[] bArr2 = this.f191923a;
            int length = bArr2.length;
            byte[] bArr3 = new byte[(length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, length - 1);
            System.arraycopy(C72131f.m105666d("0000Z"), 0, bArr3, this.f191923a.length - 1, 5);
            return bArr3;
        } else if (!mo63285k()) {
            byte[] bArr4 = this.f191923a;
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[(length2 + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, length2 - 1);
            System.arraycopy(C72131f.m105666d("00Z"), 0, bArr5, this.f191923a.length - 1, 3);
            return bArr5;
        } else if (!mo63283i()) {
            return this.f191923a;
        } else {
            int length3 = this.f191923a.length - 2;
            while (length3 > 0 && this.f191923a[length3] == 48) {
                length3--;
            }
            byte[] bArr6 = this.f191923a;
            if (bArr6[length3] == 46) {
                byte[] bArr7 = new byte[(length3 + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length3);
                bArr7[length3] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length3 + 2)];
            int i = length3 + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }

    /* renamed from: a */
    public final int mo63217a() {
        int length = m105386l().length;
        return C72090ch.m105544a(length) + 1 + length;
    }

    /* renamed from: b */
    public final void mo63218b(C72106s sVar, boolean z) {
        sVar.mo63301e(z, 24, m105386l());
    }

    /* renamed from: f */
    public final C72108u mo63228f() {
        return this;
    }

    /* renamed from: h */
    public final C72108u mo63229h() {
        return this;
    }
}
