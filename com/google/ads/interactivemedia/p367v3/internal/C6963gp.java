package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.gp */
/* compiled from: PG */
public final class C6963gp {

    /* renamed from: a */
    public static final /* synthetic */ int f22211a = 0;

    /* renamed from: b */
    private static final int[] f22212b = {1, 2, 3, 6};

    /* renamed from: c */
    private static final int[] f22213c = {48000, 44100, 32000};

    /* renamed from: d */
    private static final int[] f22214d = {24000, 22050, 16000};

    /* renamed from: e */
    private static final int[] f22215e = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: f */
    private static final int[] f22216f = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: g */
    private static final int[] f22217g = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static C6864cy m20515a(aee aee, String str, String str2, C7031jc jcVar) {
        int i = f22213c[(aee.mo14560n() & 192) >> 6];
        int n = aee.mo14560n();
        int i2 = f22215e[(n & 56) >> 3];
        if ((n & 4) != 0) {
            i2++;
        }
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S(str);
        cxVar.mo15630ae("audio/ac3");
        cxVar.mo15606H(i2);
        cxVar.mo15631af(i);
        cxVar.mo15610L(jcVar);
        cxVar.mo15620V(str2);
        return cxVar.mo15625a();
    }

    /* renamed from: b */
    public static C6864cy m20516b(aee aee, String str, String str2, C7031jc jcVar) {
        aee.mo14557k(2);
        int i = f22213c[(aee.mo14560n() & 192) >> 6];
        int n = aee.mo14560n();
        int i2 = f22215e[(n & 14) >> 1];
        if ((n & 1) != 0) {
            i2++;
        }
        if (((aee.mo14560n() & 30) >> 1) > 0 && (2 & aee.mo14560n()) != 0) {
            i2 += 2;
        }
        String str3 = (aee.mo14550d() <= 0 || (aee.mo14560n() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc";
        C6863cx cxVar = new C6863cx();
        cxVar.mo15617S(str);
        cxVar.mo15630ae(str3);
        cxVar.mo15606H(i2);
        cxVar.mo15631af(i);
        cxVar.mo15610L(jcVar);
        cxVar.mo15620V(str2);
        return cxVar.mo15625a();
    }

    /* renamed from: c */
    public static C6962go m20517c(aed aed) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        aed aed2 = aed;
        int d = aed.mo14527d();
        aed2.mo14530g(40);
        int i10 = aed2.mo14532i(5);
        aed2.mo14528e(d);
        int i11 = -1;
        if (i10 > 10) {
            aed2.mo14530g(16);
            int i12 = aed2.mo14532i(2);
            if (i12 == 0) {
                i11 = 0;
            } else if (i12 == 1) {
                i11 = 1;
            } else if (i12 == 2) {
                i11 = 2;
            }
            aed2.mo14530g(3);
            int i13 = aed2.mo14532i(11) + 1;
            int i14 = i13 + i13;
            int i15 = aed2.mo14532i(2);
            if (i15 == 3) {
                i5 = f22214d[aed2.mo14532i(2)];
                i7 = 3;
                i6 = 6;
            } else {
                i7 = aed2.mo14532i(2);
                i6 = f22212b[i7];
                i5 = f22213c[i15];
            }
            int i16 = i6 * 256;
            int i17 = aed2.mo14532i(3);
            boolean h = aed.mo14531h();
            int i18 = f22215e[i17] + (h ? 1 : 0);
            aed2.mo14530g(10);
            if (aed.mo14531h()) {
                aed2.mo14530g(8);
            }
            if (i17 == 0) {
                aed2.mo14530g(5);
                if (aed.mo14531h()) {
                    aed2.mo14530g(8);
                }
                i8 = 0;
                i17 = 0;
            } else {
                i8 = i17;
            }
            if (i11 == 1) {
                if (aed.mo14531h()) {
                    aed2.mo14530g(16);
                }
                i11 = 1;
            }
            if (aed.mo14531h()) {
                if (i8 > 2) {
                    aed2.mo14530g(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    aed2.mo14530g(6);
                }
                if ((i8 & 4) != 0) {
                    aed2.mo14530g(6);
                }
                if (h && aed.mo14531h()) {
                    aed2.mo14530g(5);
                }
                if (i11 == 0) {
                    if (aed.mo14531h()) {
                        aed2.mo14530g(6);
                    }
                    if (i8 == 0 && aed.mo14531h()) {
                        aed2.mo14530g(6);
                    }
                    if (aed.mo14531h()) {
                        aed2.mo14530g(6);
                    }
                    int i19 = aed2.mo14532i(2);
                    if (i19 == 1) {
                        aed2.mo14530g(5);
                    } else if (i19 == 2) {
                        aed2.mo14530g(12);
                    } else if (i19 == 3) {
                        int i20 = aed2.mo14532i(5);
                        if (aed.mo14531h()) {
                            aed2.mo14530g(5);
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                aed2.mo14530g(4);
                            }
                            if (aed.mo14531h()) {
                                if (aed.mo14531h()) {
                                    aed2.mo14530g(4);
                                }
                                if (aed.mo14531h()) {
                                    aed2.mo14530g(4);
                                }
                            }
                        }
                        if (aed.mo14531h()) {
                            aed2.mo14530g(5);
                            if (aed.mo14531h()) {
                                aed2.mo14530g(7);
                                if (aed.mo14531h()) {
                                    aed2.mo14530g(8);
                                    aed2.mo14530g((i20 + 2) * 8);
                                    aed.mo14533j();
                                }
                            }
                        }
                        aed2.mo14530g((i20 + 2) * 8);
                        aed.mo14533j();
                    }
                    if (i8 < 2) {
                        if (aed.mo14531h()) {
                            aed2.mo14530g(14);
                        }
                        if (i17 == 0 && aed.mo14531h()) {
                            aed2.mo14530g(14);
                        }
                    }
                    if (aed.mo14531h()) {
                        if (i7 == 0) {
                            aed2.mo14530g(5);
                            i11 = 0;
                            i7 = 0;
                        } else {
                            for (int i21 = 0; i21 < i6; i21++) {
                                if (aed.mo14531h()) {
                                    aed2.mo14530g(5);
                                }
                            }
                        }
                    }
                    i11 = 0;
                }
            }
            if (aed.mo14531h()) {
                aed2.mo14530g(5);
                if (i8 == 2) {
                    aed2.mo14530g(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    aed2.mo14530g(2);
                }
                if (aed.mo14531h()) {
                    i9 = 8;
                    aed2.mo14530g(8);
                } else {
                    i9 = 8;
                }
                if (i8 == 0 && aed.mo14531h()) {
                    aed2.mo14530g(i9);
                }
                if (i15 < 3) {
                    aed.mo14529f();
                }
            }
            if (i11 == 0) {
                if (i7 != 3) {
                    aed.mo14529f();
                }
            } else if (i11 == 2 && (i7 == 3 || aed.mo14531h())) {
                aed2.mo14530g(6);
            }
            str = (aed.mo14531h() && aed2.mo14532i(6) == 1 && aed2.mo14532i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i14;
            i = i16;
            i3 = i5;
            i4 = i18;
        } else {
            aed2.mo14530g(32);
            int i22 = aed2.mo14532i(2);
            String str2 = i22 == 3 ? null : "audio/ac3";
            int f = m20520f(i22, aed2.mo14532i(6));
            aed2.mo14530g(8);
            int i23 = aed2.mo14532i(3);
            if (!((i23 & 1) == 0 || i23 == 1)) {
                aed2.mo14530g(2);
            }
            if ((i23 & 4) != 0) {
                aed2.mo14530g(2);
            }
            if (i23 == 2) {
                aed2.mo14530g(2);
            }
            if (i22 < 3) {
                i11 = f22213c[i22];
            }
            i3 = i11;
            str = str2;
            i2 = f;
            i4 = f22215e[i23] + (aed.mo14531h() ? 1 : 0);
            i = 1536;
        }
        return new C6962go(str, i4, i3, i2, i);
    }

    /* renamed from: d */
    public static int m20518d(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m20520f((b & 192) >> 6, b & 63);
    }

    /* renamed from: e */
    public static int m20519e(ByteBuffer byteBuffer) {
        int i = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) <= 10) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f22212b[i] * 256;
    }

    /* renamed from: f */
    private static int m20520f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = f22213c[i];
        if (i4 == 44100) {
            int i5 = f22217g[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f22216f[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
