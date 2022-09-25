package androidx.media3.exoplayer.p145h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.exoplayer.p151k.C3232a;
import androidx.media3.exoplayer.p151k.C3241g;
import androidx.media3.extractor.C3367be;
import androidx.media3.p134c.C2524b;
import androidx.media3.p134c.C2525c;
import androidx.media3.p134c.C2529g;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: androidx.media3.exoplayer.h.ca */
/* compiled from: PG */
public final class C3090ca {

    /* renamed from: a */
    public final C2604ac f9022a = new C2604ac(32);

    /* renamed from: b */
    public C3088bz f9023b;

    /* renamed from: c */
    public C3088bz f9024c;

    /* renamed from: d */
    public C3088bz f9025d;

    /* renamed from: e */
    public long f9026e;

    /* renamed from: f */
    public final C3241g f9027f;

    public C3090ca(C3241g gVar) {
        this.f9027f = gVar;
        C3088bz bzVar = new C3088bz(0);
        this.f9023b = bzVar;
        this.f9024c = bzVar;
        this.f9025d = bzVar;
    }

    /* renamed from: b */
    public static C3088bz m8922b(C3088bz bzVar, C2529g gVar, C3091cb cbVar, C2604ac acVar) {
        if (gVar.mo5954fh(1073741824)) {
            long j = cbVar.f9029b;
            int i = 1;
            acVar.mo6156x(1);
            C3088bz h = m8925h(bzVar, j, acVar.f7234a, 1);
            long j2 = j + 1;
            byte b = acVar.f7234a[0];
            boolean z = (b & 128) != 0;
            byte b2 = b & Byte.MAX_VALUE;
            C2525c cVar = gVar.f6954b;
            byte[] bArr = cVar.f6944a;
            if (bArr == null) {
                cVar.f6944a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            bzVar = m8925h(h, j2, cVar.f6944a, b2);
            long j3 = j2 + ((long) b2);
            if (z) {
                acVar.mo6156x(2);
                bzVar = m8925h(bzVar, j3, acVar.f7234a, 2);
                j3 += 2;
                i = acVar.mo6142j();
            }
            int[] iArr = cVar.f6947d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = cVar.f6948e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i2 = i * 6;
                acVar.mo6156x(i2);
                bzVar = m8925h(bzVar, j3, acVar.f7234a, i2);
                j3 += (long) i2;
                acVar.mo6131A(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr[i3] = acVar.mo6142j();
                    iArr2[i3] = acVar.mo6141i();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cbVar.f9028a - ((int) (j3 - cbVar.f9029b));
            }
            C3367be beVar = cbVar.f9030c;
            int i4 = C2612ak.f7249a;
            byte[] bArr2 = beVar.f10177b;
            byte[] bArr3 = cVar.f6944a;
            int i5 = beVar.f10176a;
            int i6 = beVar.f10178c;
            int i7 = beVar.f10179d;
            cVar.f6949f = i;
            cVar.f6947d = iArr;
            cVar.f6948e = iArr2;
            cVar.f6945b = bArr2;
            cVar.f6946c = i5;
            cVar.f6950g = i6;
            cVar.f6951h = i7;
            cVar.f6952i.numSubSamples = i;
            cVar.f6952i.numBytesOfClearData = iArr;
            cVar.f6952i.numBytesOfEncryptedData = iArr2;
            cVar.f6952i.key = bArr2;
            cVar.f6952i.iv = bArr3;
            cVar.f6952i.mode = i5;
            C2524b bVar = cVar.f6953j;
            bVar.f6943b.set(i6, i7);
            bVar.f6942a.setPattern(bVar.f6943b);
            long j4 = cbVar.f9029b;
            int i8 = (int) (j3 - j4);
            cbVar.f9029b = j4 + ((long) i8);
            cbVar.f9028a -= i8;
        }
        if (gVar.mo5954fh(268435456)) {
            acVar.mo6156x(4);
            C3088bz h2 = m8925h(bzVar, cbVar.f9029b, acVar.f7234a, 4);
            int i9 = acVar.mo6141i();
            cbVar.f9029b += 4;
            cbVar.f9028a -= 4;
            gVar.mo5960c(i9);
            C3088bz g = m8924g(h2, cbVar.f9029b, gVar.f6955c, i9);
            cbVar.f9029b += (long) i9;
            int i10 = cbVar.f9028a - i9;
            cbVar.f9028a = i10;
            ByteBuffer byteBuffer = gVar.f6958f;
            if (byteBuffer == null || byteBuffer.capacity() < i10) {
                gVar.f6958f = ByteBuffer.allocate(i10);
            } else {
                gVar.f6958f.clear();
            }
            return m8924g(g, cbVar.f9029b, gVar.f6958f, cbVar.f9028a);
        }
        gVar.mo5960c(cbVar.f9028a);
        return m8924g(bzVar, cbVar.f9029b, gVar.f6955c, cbVar.f9028a);
    }

    /* renamed from: f */
    private static C3088bz m8923f(C3088bz bzVar, long j) {
        while (j >= bzVar.f9016b) {
            bzVar = bzVar.f9018d;
        }
        return bzVar;
    }

    /* renamed from: g */
    private static C3088bz m8924g(C3088bz bzVar, long j, ByteBuffer byteBuffer, int i) {
        C3088bz f = m8923f(bzVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (f.f9016b - j));
            byteBuffer.put(f.f9017c.f9718a, f.mo7061a(j), min);
            i -= min;
            j += (long) min;
            if (j == f.f9016b) {
                f = f.f9018d;
            }
        }
        return f;
    }

    /* renamed from: h */
    private static C3088bz m8925h(C3088bz bzVar, long j, byte[] bArr, int i) {
        C3088bz f = m8923f(bzVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (f.f9016b - j));
            System.arraycopy(f.f9017c.f9718a, f.mo7061a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == f.f9016b) {
                f = f.f9018d;
            }
        }
        return f;
    }

    /* renamed from: a */
    public final int mo7064a(int i) {
        C3088bz bzVar = this.f9025d;
        if (bzVar.f9017c == null) {
            C3232a b = this.f9027f.mo7235b();
            C3088bz bzVar2 = new C3088bz(this.f9025d.f9016b);
            bzVar.f9017c = b;
            bzVar.f9018d = bzVar2;
        }
        return Math.min(i, (int) (this.f9025d.f9016b - this.f9026e));
    }

    /* renamed from: c */
    public final void mo7065c(C3088bz bzVar) {
        if (bzVar.f9017c != null) {
            this.f9027f.mo7240g(bzVar);
            bzVar.mo7062b();
        }
    }

    /* renamed from: d */
    public final void mo7066d(long j) {
        C3088bz bzVar;
        if (j != -1) {
            while (true) {
                bzVar = this.f9023b;
                if (j < bzVar.f9016b) {
                    break;
                }
                this.f9027f.mo7236c(bzVar.f9017c);
                this.f9023b = this.f9023b.mo7062b();
            }
            if (this.f9024c.f9015a < bzVar.f9015a) {
                this.f9024c = bzVar;
            }
        }
    }

    /* renamed from: e */
    public final void mo7067e(int i) {
        long j = this.f9026e + ((long) i);
        this.f9026e = j;
        C3088bz bzVar = this.f9025d;
        if (j == bzVar.f9016b) {
            this.f9025d = bzVar.f9018d;
        }
    }
}
