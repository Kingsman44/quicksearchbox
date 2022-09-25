package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.if */
/* compiled from: PG */
public final class C7007if {

    /* renamed from: a */
    public static final /* synthetic */ int f22408a = 0;

    /* renamed from: b */
    private static final int[] f22409b = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: c */
    private static final int[] f22410c = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: d */
    private static final int[] f22411d = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: a */
    public static C6864cy m20719a(byte[] bArr, String str, String str2) {
        aed aed;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            aed = new aed(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            aed = new aed(copyOf);
            if (copyOf[0] == 31) {
                aed aed2 = new aed(copyOf);
                while (aed2.mo14526c() >= 16) {
                    aed2.mo14530g(2);
                    aed.mo14535l(aed2.mo14532i(14));
                }
            }
            aed.mo14524a(copyOf);
        }
        aed.mo14530g(60);
        int i5 = f22409b[aed.mo14532i(6)];
        int i6 = f22410c[aed.mo14532i(4)];
        int i7 = aed.mo14532i(5);
        if (i7 < 29) {
            i2 = (f22411d[i7] * 1000) / 2;
        }
        aed.mo14530g(10);
        if (aed.mo14532i(2) > 0) {
            i = 1;
        }
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S(str);
        cxVar.mo15630ae("audio/vnd.dts");
        cxVar.mo15605G(i2);
        cxVar.mo15606H(i5 + i);
        cxVar.mo15631af(i6);
        cxVar.mo15610L((C7031jc) null);
        cxVar.mo15620V(str2);
        return cxVar.mo15625a();
    }
}
