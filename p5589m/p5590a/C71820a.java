package p5589m.p5590a;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69755d;
import p5589m.C71823aa;
import p5589m.C71828e;
import p5589m.C71837n;
import p5589m.C71842s;

/* renamed from: m.a.a */
/* compiled from: PG */
public final class C71820a {

    /* renamed from: a */
    public static final byte[] f191350a = C71823aa.m105126b("0123456789abcdef");

    /* renamed from: a */
    public static final String m105121a(C71828e eVar, long j) {
        if (j > 0) {
            long j2 = -1 + j;
            if (eVar.mo63061b(j2) == 13) {
                String h = eVar.mo63069h(j2, C69755d.f186125a);
                eVar.mo63078o(2);
                return h;
            }
        }
        String h2 = eVar.mo63069h(j, C69755d.f186125a);
        eVar.mo63078o(1);
        return h2;
    }

    /* renamed from: b */
    public static final boolean m105122b(C71842s sVar, int i, byte[] bArr, int i2) {
        C69664n.m101061g(sVar, "segment");
        C69664n.m101061g(bArr, "bytes");
        int i3 = sVar.f191375c;
        byte[] bArr2 = sVar.f191373a;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                sVar = sVar.f191378f;
                C69664n.m101058d(sVar);
                byte[] bArr3 = sVar.f191373a;
                int i5 = sVar.f191374b;
                bArr2 = bArr3;
                i = i5;
                i3 = sVar.f191375c;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: c */
    public static final int m105123c(C71828e eVar, C71837n nVar) {
        int i;
        int i2;
        int i3;
        int i4;
        C71842s sVar;
        C71842s sVar2 = eVar.f191355a;
        if (sVar2 == null) {
            return -2;
        }
        byte[] bArr = sVar2.f191373a;
        int i5 = sVar2.f191374b;
        int i6 = sVar2.f191375c;
        int[] iArr = nVar.f191364c;
        C71842s sVar3 = sVar2;
        int i7 = 0;
        int i8 = -1;
        loop0:
        while (true) {
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (sVar3 == null) {
                break;
            }
            if (i10 < 0) {
                int i13 = i11 + (-i10);
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != iArr[i11]) {
                        return i8;
                    }
                    boolean z = true;
                    boolean z2 = i15 == i13;
                    if (i14 == i6) {
                        C69664n.m101058d(sVar3);
                        C71842s sVar4 = sVar3.f191378f;
                        C69664n.m101058d(sVar4);
                        i2 = sVar4.f191374b;
                        byte[] bArr2 = sVar4.f191373a;
                        i4 = sVar4.f191375c;
                        if (sVar4 == sVar2) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            sVar = null;
                        } else {
                            z = z2;
                            byte[] bArr3 = bArr2;
                            sVar = sVar4;
                            bArr = bArr3;
                        }
                    } else {
                        z = z2;
                        C71842s sVar5 = sVar3;
                        i4 = i6;
                        i2 = i14;
                        sVar = sVar5;
                    }
                    if (z) {
                        i3 = iArr[i15];
                        int i16 = i4;
                        sVar3 = sVar;
                        i = i16;
                        break;
                    }
                    i5 = i2;
                    i6 = i4;
                    i11 = i15;
                    sVar3 = sVar;
                }
            } else {
                int i17 = i5 + 1;
                byte b = bArr[i5] & 255;
                int i18 = i11 + i10;
                while (i11 != i18) {
                    if (b == iArr[i11]) {
                        i3 = iArr[i11 + i10];
                        if (i17 == i6) {
                            sVar3 = sVar3.f191378f;
                            C69664n.m101058d(sVar3);
                            int i19 = sVar3.f191374b;
                            byte[] bArr4 = sVar3.f191373a;
                            i = sVar3.f191375c;
                            if (sVar3 == sVar2) {
                                sVar3 = null;
                            }
                            byte[] bArr5 = bArr4;
                            i2 = i19;
                            bArr = bArr5;
                        } else {
                            i = i6;
                            i2 = i17;
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            if (i3 >= 0) {
                return i3;
            }
            int i20 = i;
            i7 = -i3;
            i5 = i2;
            i6 = i20;
        }
        return -2;
    }
}
