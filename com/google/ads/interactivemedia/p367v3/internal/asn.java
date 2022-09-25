package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asn */
/* compiled from: PG */
public final class asn {
    /* renamed from: a */
    static int m19514a(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* renamed from: b */
    public static HashSet m19515b() {
        return new HashSet(m19521h(4));
    }

    /* renamed from: c */
    static asm m19516c(Class cls, String str) {
        try {
            return new asm(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    static Object[] m19518e(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    /* renamed from: f */
    static void m19519f(Object obj, int i) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(20);
            sb.append("at index ");
            sb.append(i);
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: g */
    public static HashMap m19520g(int i) {
        return new HashMap(m19521h(i));
    }

    /* renamed from: h */
    static int m19521h(int i) {
        if (i < 3) {
            ary.m19461n(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r7 != r1.f22609f) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        if ((r17.mo14560n() * 1000) == r3) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        if (r4 == r3) goto L_0x009d;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m19522i(com.google.ads.interactivemedia.p367v3.internal.aee r17, com.google.ads.interactivemedia.p367v3.internal.C7063kh r18, int r19, com.google.ads.interactivemedia.p367v3.internal.C7059kd r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.mo14553g()
            long r3 = r17.mo14566t()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0019
            return r9
        L_0x0019:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0023
            r5 = 1
            goto L_0x0024
        L_0x0023:
            r5 = 0
        L_0x0024:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L_0x004b
            int r11 = r1.f22610g
            int r11 = r11 + r13
            if (r6 != r11) goto L_0x00b1
            goto L_0x0054
        L_0x004b:
            r11 = 10
            if (r6 > r11) goto L_0x00b1
            int r6 = r1.f22610g
            r11 = 2
            if (r6 != r11) goto L_0x00b1
        L_0x0054:
            if (r8 != 0) goto L_0x0059
        L_0x0056:
            r14 = 1
            goto L_0x005e
        L_0x0059:
            int r6 = r1.f22612i
            if (r8 != r6) goto L_0x00b1
            goto L_0x0056
        L_0x005e:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x00b1
            r3 = r20
            boolean r3 = m19533t(r0, r1, r5, r3)
            if (r3 == 0) goto L_0x00b1
            int r3 = m19523j(r0, r12)
            if (r3 == r13) goto L_0x00b1
            int r4 = r1.f22605b
            if (r3 > r4) goto L_0x00b1
            int r3 = r1.f22608e
            if (r7 != 0) goto L_0x0079
            goto L_0x009d
        L_0x0079:
            r4 = 11
            if (r7 > r4) goto L_0x0082
            int r1 = r1.f22609f
            if (r7 == r1) goto L_0x009d
            goto L_0x00b1
        L_0x0082:
            r1 = 12
            if (r7 != r1) goto L_0x008f
            int r1 = r17.mo14560n()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00b1
            goto L_0x009d
        L_0x008f:
            r1 = 14
            if (r7 > r1) goto L_0x00b1
            int r4 = r17.mo14561o()
            if (r7 != r1) goto L_0x009b
            int r4 = r4 * 10
        L_0x009b:
            if (r4 != r3) goto L_0x00b1
        L_0x009d:
            int r1 = r17.mo14560n()
            int r3 = r17.mo14553g()
            byte[] r0 = r17.mo14555i()
            int r3 = r3 + r13
            int r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18525ap(r0, r2, r3)
            if (r1 != r0) goto L_0x00b1
            return r10
        L_0x00b1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.asn.m19522i(com.google.ads.interactivemedia.v3.internal.aee, com.google.ads.interactivemedia.v3.internal.kh, int, com.google.ads.interactivemedia.v3.internal.kd):boolean");
    }

    /* renamed from: j */
    public static int m19523j(aee aee, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return aee.mo14560n() + 1;
            case 7:
                return aee.mo14561o() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* renamed from: k */
    public static boolean m19524k(C7050jv jvVar, C7063kh khVar, int i, C7059kd kdVar) {
        long k = jvVar.mo16098k();
        byte[] bArr = new byte[2];
        jvVar.mo16094g(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            jvVar.mo16097j();
            jvVar.mo16096i((int) (k - jvVar.mo16099l()));
            return false;
        }
        aee aee = new aee(16);
        System.arraycopy(bArr, 0, aee.mo14555i(), 0, 2);
        aee.mo14552f(m19527n(jvVar, aee.mo14555i(), 2, 14));
        jvVar.mo16097j();
        jvVar.mo16096i((int) (k - jvVar.mo16099l()));
        return m19522i(aee, khVar, i, kdVar);
    }

    /* renamed from: l */
    public static long m19525l(C7050jv jvVar, C7063kh khVar) {
        jvVar.mo16097j();
        boolean z = true;
        jvVar.mo16096i(1);
        byte[] bArr = new byte[1];
        jvVar.mo16094g(bArr, 0, 1);
        byte b = bArr[0] & 1;
        jvVar.mo16096i(2);
        int i = 1 != b ? 6 : 7;
        aee aee = new aee(i);
        aee.mo14552f(m19527n(jvVar, aee.mo14555i(), 0, i));
        jvVar.mo16097j();
        C7059kd kdVar = new C7059kd();
        if (1 != b) {
            z = false;
        }
        if (m19533t(aee, khVar, z, kdVar)) {
            return kdVar.f22598a;
        }
        throw new C6886dt();
    }

    /* renamed from: m */
    public static C7053jy[] m19526m(C7058kc kcVar) {
        return kcVar.mo15118a();
    }

    /* renamed from: n */
    public static int m19527n(C7050jv jvVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int e = jvVar.mo16092e(bArr, i + i3, i2 - i3);
            if (e == -1) {
                break;
            }
            i3 += e;
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (r2 == 47) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075 A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m19528o(long r10, com.google.ads.interactivemedia.p367v3.internal.aee r12, com.google.ads.interactivemedia.p367v3.internal.C7073kr[] r13) {
        /*
        L_0x0000:
            int r0 = r12.mo14550d()
            r1 = 1
            if (r0 <= r1) goto L_0x0079
            int r0 = m19534u(r12)
            int r2 = m19534u(r12)
            int r3 = r12.mo14553g()
            int r3 = r3 + r2
            r4 = -1
            if (r2 == r4) goto L_0x006a
            int r4 = r12.mo14550d()
            if (r2 <= r4) goto L_0x001e
            goto L_0x006a
        L_0x001e:
            r4 = 4
            if (r0 != r4) goto L_0x0075
            r0 = 8
            if (r2 < r0) goto L_0x0075
            int r0 = r12.mo14560n()
            int r2 = r12.mo14561o()
            r4 = 49
            r5 = 0
            if (r2 != r4) goto L_0x003a
            int r2 = r12.mo14568v()
            r6 = r2
            r2 = 49
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            int r7 = r12.mo14560n()
            r8 = 47
            if (r2 != r8) goto L_0x0048
            r12.mo14557k(r1)
            r2 = 47
        L_0x0048:
            r9 = 181(0xb5, float:2.54E-43)
            if (r0 != r9) goto L_0x0059
            if (r2 == r4) goto L_0x0051
            if (r2 != r8) goto L_0x0059
            goto L_0x0052
        L_0x0051:
            r8 = r2
        L_0x0052:
            r0 = 3
            if (r7 != r0) goto L_0x0058
            r2 = r8
            r0 = 1
            goto L_0x005a
        L_0x0058:
            r2 = r8
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r2 != r4) goto L_0x0064
            r2 = 1195456820(0x47413934, float:49465.203)
            if (r6 != r2) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            r0 = r0 & r1
        L_0x0064:
            if (r0 == 0) goto L_0x0075
            m19529p(r10, r12, r13)
            goto L_0x0075
        L_0x006a:
            java.lang.String r0 = "CeaUtil"
            java.lang.String r1 = "Skipping remainder of malformed SEI NAL unit."
            android.util.Log.w(r0, r1)
            int r3 = r12.mo14551e()
        L_0x0075:
            r12.mo14554h(r3)
            goto L_0x0000
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.asn.m19528o(long, com.google.ads.interactivemedia.v3.internal.aee, com.google.ads.interactivemedia.v3.internal.kr[]):void");
    }

    /* renamed from: p */
    public static void m19529p(long j, aee aee, C7073kr[] krVarArr) {
        int n = aee.mo14560n();
        if ((n & 64) != 0) {
            aee.mo14557k(1);
            int i = (n & 31) * 3;
            int g = aee.mo14553g();
            for (C7073kr krVar : krVarArr) {
                aee.mo14554h(g);
                krVar.mo16105d(aee, i);
                krVar.mo16103b(j, 1, i, 0, (C7072kq) null);
            }
        }
    }

    /* renamed from: q */
    public static int m19530q(int i) {
        return i;
    }

    /* renamed from: r */
    public static int m19531r(int i) {
        return i & 7;
    }

    /* renamed from: s */
    public static void m19532s(String str, Exception exc) {
        if (C6812b.f21577a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }

    /* renamed from: t */
    private static boolean m19533t(aee aee, C7063kh khVar, boolean z, C7059kd kdVar) {
        try {
            long J = aee.mo14546J();
            if (!z) {
                J *= (long) khVar.f22605b;
            }
            kdVar.f22598a = J;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: u */
    private static int m19534u(aee aee) {
        int i = 0;
        while (aee.mo14550d() != 0) {
            int n = aee.mo14560n();
            i += n;
            if (n != 255) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m19517d(Object[] objArr, Object obj) {
        int i;
        if (objArr != null) {
            if (obj == null) {
                i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    } else if (objArr[i] == null) {
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= objArr.length) {
                        break;
                    } else if (obj.equals(objArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i != -1) {
                return true;
            }
        }
        return false;
    }
}
