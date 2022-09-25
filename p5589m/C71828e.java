package p5589m;

import com.evernote.android.state.BuildConfig;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.chromium.net.PrivateKeyType;
import p5462h.p5463a.C69531o;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69755d;

/* renamed from: m.e */
/* compiled from: PG */
public final class C71828e implements Cloneable, ByteChannel, C71830g, C71829f {

    /* renamed from: a */
    public C71842s f191355a;

    /* renamed from: b */
    public long f191356b;

    /* renamed from: A */
    public final void mo63059A(String str) {
        C69664n.m101061g(str, "string");
        mo63092z(str, 0, str.length());
    }

    /* renamed from: B */
    public final /* bridge */ /* synthetic */ void mo63060B(String str) {
        throw null;
    }

    /* renamed from: a */
    public final long mo62472a(C71828e eVar, long j) {
        if (j >= 0) {
            long j2 = this.f191356b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            eVar.mo62538mq(this, j);
            return j;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    /* renamed from: b */
    public final byte mo63061b(long j) {
        C71824ab.m105127a(this.f191356b, j, 1);
        C71842s sVar = this.f191355a;
        if (sVar != null) {
            long j2 = this.f191356b;
            if (j2 - j < j) {
                while (j2 > j) {
                    sVar = sVar.f191379g;
                    C69664n.m101058d(sVar);
                    j2 -= (long) (sVar.f191375c - sVar.f191374b);
                }
                C69664n.m101058d(sVar);
                return sVar.f191373a[(int) ((((long) sVar.f191374b) + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                long j4 = ((long) (sVar.f191375c - sVar.f191374b)) + j3;
                if (j4 <= j) {
                    sVar = sVar.f191378f;
                    C69664n.m101058d(sVar);
                    j3 = j4;
                } else {
                    C69664n.m101058d(sVar);
                    return sVar.f191373a[(int) ((((long) sVar.f191374b) + j) - j3)];
                }
            }
        } else {
            C69664n.m101058d((Object) null);
            throw null;
        }
    }

    /* renamed from: c */
    public final byte mo63062c() {
        if (this.f191356b != 0) {
            C71842s sVar = this.f191355a;
            C69664n.m101058d(sVar);
            int i = sVar.f191374b;
            int i2 = sVar.f191375c;
            int i3 = i + 1;
            byte b = sVar.f191373a[i];
            this.f191356b--;
            if (i3 == i2) {
                this.f191355a = sVar.mo63123a();
                C71843t.m105211b(sVar);
            } else {
                sVar.f191374b = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    public final /* synthetic */ Object clone() {
        C71828e eVar = new C71828e();
        if (this.f191356b != 0) {
            C71842s sVar = this.f191355a;
            C69664n.m101058d(sVar);
            C71842s b = sVar.mo63124b();
            eVar.f191355a = b;
            b.f191379g = b;
            b.f191378f = b.f191379g;
            for (C71842s sVar2 = sVar.f191378f; sVar2 != sVar; sVar2 = sVar2.f191378f) {
                C71842s sVar3 = b.f191379g;
                C69664n.m101058d(sVar3);
                C69664n.m101058d(sVar2);
                sVar3.mo63126d(sVar2.mo63124b());
            }
            eVar.f191356b = this.f191356b;
        }
        return eVar;
    }

    public final void close() {
    }

    /* renamed from: d */
    public final int mo63064d(byte[] bArr, int i, int i2) {
        C69664n.m101061g(bArr, "sink");
        C71824ab.m105127a((long) bArr.length, (long) i, (long) i2);
        C71842s sVar = this.f191355a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(i2, sVar.f191375c - sVar.f191374b);
        byte[] bArr2 = sVar.f191373a;
        int i3 = sVar.f191374b;
        C69531o.m100926d(bArr2, bArr, i, i3, i3 + min);
        int i4 = sVar.f191374b + min;
        sVar.f191374b = i4;
        this.f191356b -= (long) min;
        if (i4 != sVar.f191375c) {
            return min;
        }
        this.f191355a = sVar.mo63123a();
        C71843t.m105211b(sVar);
        return min;
    }

    /* renamed from: e */
    public final int mo63065e() {
        if (this.f191356b >= 4) {
            C71842s sVar = this.f191355a;
            C69664n.m101058d(sVar);
            int i = sVar.f191374b;
            int i2 = sVar.f191375c;
            if (((long) (i2 - i)) < 4) {
                return ((mo63062c() & 255) << 24) | ((mo63062c() & 255) << 16) | ((mo63062c() & 255) << 8) | (mo63062c() & 255);
            }
            byte[] bArr = sVar.f191373a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
            this.f191356b -= 4;
            if (i6 == i2) {
                this.f191355a = sVar.mo63123a();
                C71843t.m105211b(sVar);
            } else {
                sVar.f191374b = i6;
            }
            return b;
        }
        throw new EOFException();
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x0079
        L_0x0009:
            boolean r3 = r1 instanceof p5589m.C71828e
            r4 = 0
            if (r3 != 0) goto L_0x0011
        L_0x000e:
            r2 = 0
            goto L_0x0079
        L_0x0011:
            long r5 = r0.f191356b
            m.e r1 = (p5589m.C71828e) r1
            long r7 = r1.f191356b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001c
            goto L_0x000e
        L_0x001c:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0023
            goto L_0x0006
        L_0x0023:
            m.s r3 = r0.f191355a
            p5462h.p5473f.p5475b.C69664n.m101058d(r3)
            m.s r1 = r1.f191355a
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            int r5 = r3.f191374b
            int r6 = r1.f191374b
            r9 = r7
        L_0x0032:
            long r11 = r0.f191356b
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0006
            int r11 = r3.f191375c
            int r11 = r11 - r5
            int r12 = r1.f191375c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x0044:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x005e
            int r15 = r5 + 1
            int r16 = r6 + 1
            byte[] r2 = r3.f191373a
            byte r2 = r2[r5]
            byte[] r5 = r1.f191373a
            byte r5 = r5[r6]
            if (r2 == r5) goto L_0x0057
            goto L_0x000e
        L_0x0057:
            r5 = 1
            long r13 = r13 + r5
            r5 = r15
            r6 = r16
            goto L_0x0044
        L_0x005e:
            int r2 = r3.f191375c
            if (r5 != r2) goto L_0x006b
            m.s r2 = r3.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r2)
            int r3 = r2.f191374b
            r5 = r3
            r3 = r2
        L_0x006b:
            int r2 = r1.f191375c
            if (r6 != r2) goto L_0x0077
            m.s r1 = r1.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r1)
            int r2 = r1.f191374b
            r6 = r2
        L_0x0077:
            long r9 = r9 + r11
            goto L_0x0032
        L_0x0079:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p5589m.C71828e.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final long mo63067f() {
        long j = this.f191356b;
        if (j == 0) {
            return 0;
        }
        C71842s sVar = this.f191355a;
        C69664n.m101058d(sVar);
        C71842s sVar2 = sVar.f191379g;
        C69664n.m101058d(sVar2);
        int i = sVar2.f191375c;
        if (i < 8192 && sVar2.f191377e) {
            j -= (long) (i - sVar2.f191374b);
        }
        return j;
    }

    public final void flush() {
    }

    /* renamed from: g */
    public final long mo63068g(C71832i iVar) {
        throw null;
    }

    public final int hashCode() {
        C71842s sVar = this.f191355a;
        if (sVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = sVar.f191375c;
            for (int i3 = sVar.f191374b; i3 < i2; i3++) {
                i = (i * 31) + sVar.f191373a[i3];
            }
            sVar = sVar.f191378f;
            C69664n.m101058d(sVar);
        } while (sVar != this.f191355a);
        return i;
    }

    /* renamed from: i */
    public final String mo63071i() {
        return mo63069h(this.f191356b, C69755d.f186125a);
    }

    public final boolean isOpen() {
        return true;
    }

    /* renamed from: k */
    public final C71832i mo63074k() {
        long j = this.f191356b;
        if (j <= 2147483647L) {
            return mo63075l((int) j);
        }
        throw new IllegalStateException("size > Int.MAX_VALUE: " + j);
    }

    /* renamed from: mq */
    public final void mo62538mq(C71828e eVar, long j) {
        C71842s sVar;
        C69664n.m101061g(eVar, "source");
        if (eVar != this) {
            C71824ab.m105127a(eVar.f191356b, 0, j);
            while (j > 0) {
                C71842s sVar2 = eVar.f191355a;
                C69664n.m101058d(sVar2);
                int i = sVar2.f191375c;
                C71842s sVar3 = eVar.f191355a;
                C69664n.m101058d(sVar3);
                int i2 = 0;
                if (j < ((long) (i - sVar3.f191374b))) {
                    C71842s sVar4 = this.f191355a;
                    C71842s sVar5 = sVar4 != null ? sVar4.f191379g : null;
                    if (sVar5 != null && sVar5.f191377e) {
                        if ((((long) sVar5.f191375c) + j) - ((long) (sVar5.f191376d ? 0 : sVar5.f191374b)) <= 8192) {
                            C71842s sVar6 = eVar.f191355a;
                            C69664n.m101058d(sVar6);
                            sVar6.mo63125c(sVar5, (int) j);
                            eVar.f191356b -= j;
                            this.f191356b += j;
                            return;
                        }
                    }
                    C71842s sVar7 = eVar.f191355a;
                    C69664n.m101058d(sVar7);
                    int i3 = (int) j;
                    if (i3 <= sVar7.f191375c - sVar7.f191374b) {
                        if (i3 >= 1024) {
                            sVar = sVar7.mo63124b();
                        } else {
                            sVar = C71843t.m105210a();
                            byte[] bArr = sVar7.f191373a;
                            byte[] bArr2 = sVar.f191373a;
                            int i4 = sVar7.f191374b;
                            C69531o.m100926d(bArr, bArr2, 0, i4, i4 + i3);
                        }
                        sVar.f191375c = sVar.f191374b + i3;
                        sVar7.f191374b += i3;
                        C71842s sVar8 = sVar7.f191379g;
                        C69664n.m101058d(sVar8);
                        sVar8.mo63126d(sVar);
                        eVar.f191355a = sVar;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range");
                    }
                }
                C71842s sVar9 = eVar.f191355a;
                C69664n.m101058d(sVar9);
                long j2 = (long) (sVar9.f191375c - sVar9.f191374b);
                eVar.f191355a = sVar9.mo63123a();
                C71842s sVar10 = this.f191355a;
                if (sVar10 == null) {
                    this.f191355a = sVar9;
                    sVar9.f191379g = sVar9;
                    sVar9.f191378f = sVar9.f191379g;
                } else {
                    C71842s sVar11 = sVar10.f191379g;
                    C69664n.m101058d(sVar11);
                    sVar11.mo63126d(sVar9);
                    C71842s sVar12 = sVar9.f191379g;
                    if (sVar12 != sVar9) {
                        C69664n.m101058d(sVar12);
                        if (sVar12.f191377e) {
                            int i5 = sVar9.f191375c - sVar9.f191374b;
                            C71842s sVar13 = sVar9.f191379g;
                            C69664n.m101058d(sVar13);
                            int i6 = 8192 - sVar13.f191375c;
                            C71842s sVar14 = sVar9.f191379g;
                            C69664n.m101058d(sVar14);
                            if (!sVar14.f191376d) {
                                C71842s sVar15 = sVar9.f191379g;
                                C69664n.m101058d(sVar15);
                                i2 = sVar15.f191374b;
                            }
                            if (i5 <= i6 + i2) {
                                C71842s sVar16 = sVar9.f191379g;
                                C69664n.m101058d(sVar16);
                                sVar9.mo63125c(sVar16, i5);
                                sVar9.mo63123a();
                                C71843t.m105211b(sVar9);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact");
                    }
                }
                eVar.f191356b -= j2;
                this.f191356b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    /* renamed from: n */
    public final void mo63077n(long j) {
        throw null;
    }

    /* renamed from: p */
    public final boolean mo63079p() {
        return this.f191356b == 0;
    }

    /* renamed from: q */
    public final boolean mo63080q(long j) {
        throw null;
    }

    public final int read(ByteBuffer byteBuffer) {
        C69664n.m101061g(byteBuffer, "sink");
        C71842s sVar = this.f191355a;
        if (sVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), sVar.f191375c - sVar.f191374b);
        byteBuffer.put(sVar.f191373a, sVar.f191374b, min);
        int i = sVar.f191374b + min;
        sVar.f191374b = i;
        this.f191356b -= (long) min;
        if (i == sVar.f191375c) {
            this.f191355a = sVar.mo63123a();
            C71843t.m105211b(sVar);
        }
        return min;
    }

    /* renamed from: s */
    public final void mo63083s(C71832i iVar) {
        C69664n.m101061g(iVar, "byteString");
        iVar.mo63106k(this, iVar.mo63094b());
    }

    /* renamed from: t */
    public final void mo63084t(byte[] bArr, int i, int i2) {
        C69664n.m101061g(bArr, "source");
        long j = (long) i2;
        C71824ab.m105127a((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            C71842s m = mo63076m(1);
            int min = Math.min(i3 - i, 8192 - m.f191375c);
            int i4 = i + min;
            C69531o.m100926d(bArr, m.f191373a, m.f191375c, i, i4);
            m.f191375c += min;
            i = i4;
        }
        this.f191356b += j;
    }

    public final String toString() {
        return mo63074k().toString();
    }

    /* renamed from: u */
    public final void mo63086u(C71847x xVar) {
        do {
        } while (xVar.mo62472a(this, 8192) != -1);
    }

    /* renamed from: v */
    public final void mo63087v(int i) {
        C71842s m = mo63076m(1);
        byte[] bArr = m.f191373a;
        int i2 = m.f191375c;
        m.f191375c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f191356b++;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo63088w(int i) {
        throw null;
    }

    public final int write(ByteBuffer byteBuffer) {
        C69664n.m101061g(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C71842s m = mo63076m(1);
            int min = Math.min(i, 8192 - m.f191375c);
            byteBuffer.get(m.f191373a, m.f191375c, min);
            i -= min;
            m.f191375c += min;
        }
        this.f191356b += (long) remaining;
        return remaining;
    }

    /* renamed from: x */
    public final void mo63090x(int i) {
        C71842s m = mo63076m(4);
        byte[] bArr = m.f191373a;
        int i2 = m.f191375c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & PrivateKeyType.INVALID);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i5] = (byte) (i & PrivateKeyType.INVALID);
        m.f191375c = i5 + 1;
        this.f191356b += 4;
    }

    /* renamed from: y */
    public final /* bridge */ /* synthetic */ void mo63091y(int i) {
        throw null;
    }

    /* renamed from: z */
    public final void mo63092z(String str, int i, int i2) {
        char charAt;
        C69664n.m101061g(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C71842s m = mo63076m(1);
                    byte[] bArr = m.f191373a;
                    int i3 = m.f191375c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i5 = m.f191375c;
                            int i6 = (i3 + i) - i5;
                            m.f191375c = i5 + i6;
                            this.f191356b += (long) i6;
                        } else {
                            i4 = i + 1;
                            bArr[i + i3] = (byte) charAt;
                        }
                    }
                    int i52 = m.f191375c;
                    int i62 = (i3 + i) - i52;
                    m.f191375c = i52 + i62;
                    this.f191356b += (long) i62;
                } else {
                    if (charAt2 < 2048) {
                        C71842s m2 = mo63076m(2);
                        byte[] bArr2 = m2.f191373a;
                        int i7 = m2.f191375c;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        m2.f191375c = i7 + 2;
                        this.f191356b += 2;
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        C71842s m3 = mo63076m(3);
                        byte[] bArr3 = m3.f191373a;
                        int i8 = m3.f191375c;
                        bArr3[i8] = (byte) ((charAt2 >> 12) | 224);
                        bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                        m3.f191375c = i8 + 3;
                        this.f191356b += 3;
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 >= 57344) {
                            mo63087v(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 0;
                            C71842s m4 = mo63076m(4);
                            byte[] bArr4 = m4.f191373a;
                            int i11 = m4.f191375c;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            m4.f191375c = i11 + 4;
                            this.f191356b += 4;
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: h */
    public final String mo63069h(long j, Charset charset) {
        C69664n.m101061g(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.f191356b < j) {
            throw new EOFException();
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            C71842s sVar = this.f191355a;
            C69664n.m101058d(sVar);
            int i = sVar.f191374b;
            int i2 = sVar.f191375c;
            if (((long) i) + j > ((long) i2)) {
                return new String(mo63081r(j), charset);
            }
            int i3 = (int) j;
            String str = new String(sVar.f191373a, i, i3, charset);
            int i4 = i + i3;
            sVar.f191374b = i4;
            this.f191356b -= j;
            if (i4 == i2) {
                this.f191355a = sVar.mo63123a();
                C71843t.m105211b(sVar);
            }
            return str;
        }
    }

    /* renamed from: j */
    public final C71832i mo63073j(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.f191356b < j) {
            throw new EOFException();
        } else if (j < 4096) {
            return new C71832i(mo63081r(j));
        } else {
            C71832i l = mo63075l((int) j);
            mo63078o(j);
            return l;
        }
    }

    /* renamed from: m */
    public final C71842s mo63076m(int i) {
        if (i > 0) {
            C71842s sVar = this.f191355a;
            if (sVar == null) {
                C71842s a = C71843t.m105210a();
                this.f191355a = a;
                a.f191379g = a;
                a.f191378f = a;
                return a;
            }
            C71842s sVar2 = sVar.f191379g;
            C69664n.m101058d(sVar2);
            if (sVar2.f191375c + i <= 8192 && sVar2.f191377e) {
                return sVar2;
            }
            C71842s a2 = C71843t.m105210a();
            sVar2.mo63126d(a2);
            return a2;
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    /* renamed from: r */
    public final byte[] mo63081r(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException("byteCount: " + j);
        } else if (this.f191356b >= j) {
            int i = (int) j;
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int d = mo63064d(bArr, i2, i - i2);
                if (d != -1) {
                    i2 += d;
                } else {
                    throw new EOFException();
                }
            }
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public final void mo63078o(long j) {
        while (j > 0) {
            C71842s sVar = this.f191355a;
            if (sVar != null) {
                int min = (int) Math.min(j, (long) (sVar.f191375c - sVar.f191374b));
                long j2 = (long) min;
                this.f191356b -= j2;
                j -= j2;
                int i = sVar.f191374b + min;
                sVar.f191374b = i;
                if (i == sVar.f191375c) {
                    this.f191355a = sVar.mo63123a();
                    C71843t.m105211b(sVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: l */
    public final C71832i mo63075l(int i) {
        if (i == 0) {
            return C71832i.f191357a;
        }
        C71824ab.m105127a(this.f191356b, 0, (long) i);
        C71842s sVar = this.f191355a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C69664n.m101058d(sVar);
            int i5 = sVar.f191375c;
            int i6 = sVar.f191374b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                sVar = sVar.f191378f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 + i4)];
        C71842s sVar2 = this.f191355a;
        int i7 = 0;
        while (i2 < i) {
            C69664n.m101058d(sVar2);
            bArr[i7] = sVar2.f191373a;
            i2 += sVar2.f191375c - sVar2.f191374b;
            iArr[i7] = Math.min(i2, i);
            iArr[((Object[]) bArr).length + i7] = sVar2.f191374b;
            sVar2.f191376d = true;
            i7++;
            sVar2 = sVar2.f191378f;
        }
        return new C71844u(bArr, iArr);
    }
}
