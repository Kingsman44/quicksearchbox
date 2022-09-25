package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.google.ads.interactivemedia.v3.internal.atv */
/* compiled from: PG */
public final class atv {
    /* renamed from: a */
    public static ats m19609a(ExecutorService executorService) {
        ats ats;
        if (executorService instanceof ats) {
            return (ats) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            ats = new atu((ScheduledExecutorService) executorService);
        } else {
            ats = new atj(executorService);
        }
        return ats;
    }

    /* renamed from: b */
    public static void m19610b(atr atr, atn atn, Executor executor) {
        atr.mo15391b(new ato(atr, atn), executor);
    }

    /* renamed from: c */
    public static boolean m19611c(XmlPullParser xmlPullParser, String str) {
        return m19612d(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: d */
    public static boolean m19612d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 3;
    }

    /* renamed from: e */
    public static boolean m19613e(XmlPullParser xmlPullParser, String str) {
        return m19614f(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    /* renamed from: f */
    public static boolean m19614f(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    /* renamed from: g */
    public static String m19615g(XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (m19629u(xmlPullParser.getAttributeName(i)).equals("default_KID")) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: h */
    public static boolean m19616h(XmlPullParser xmlPullParser) {
        return m19614f(xmlPullParser) && m19629u(xmlPullParser.getName()).equals("pssh");
    }

    /* renamed from: i */
    public static Uri m19617i(String str, String str2) {
        return Uri.parse(m19618j(str, str2));
    }

    /* renamed from: j */
    public static String m19618j(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        int[] w = m19631w(str2);
        if (w[0] != -1) {
            sb.append(str2);
            m19630v(sb, w[1], w[2]);
            return sb.toString();
        }
        int[] w2 = m19631w(str);
        if (w[3] == 0) {
            sb.append(str, 0, w2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (w[2] == 0) {
            sb.append(str, 0, w2[2]);
            sb.append(str2);
            return sb.toString();
        } else if (w[1] != 0) {
            int i = w2[0] + 1;
            sb.append(str, 0, i);
            sb.append(str2);
            return m19630v(sb, w[1] + i, i + w[2]);
        } else if (str2.charAt(0) == '/') {
            sb.append(str, 0, w2[1]);
            sb.append(str2);
            int i2 = w2[1];
            return m19630v(sb, i2, w[2] + i2);
        } else {
            int i3 = w2[0];
            int i4 = w2[1];
            if (i3 + 2 >= i4 || i4 != w2[2]) {
                int lastIndexOf = str.lastIndexOf(47, w2[2] - 1);
                int i5 = lastIndexOf == -1 ? w2[1] : lastIndexOf + 1;
                sb.append(str, 0, i5);
                sb.append(str2);
                return m19630v(sb, w2[1], i5 + w[2]);
            }
            sb.append(str, 0, i4);
            sb.append('/');
            sb.append(str2);
            int i6 = w2[1];
            return m19630v(sb, i6, w[2] + i6 + 1);
        }
    }

    /* renamed from: k */
    public static void m19619k(String str) {
        if (aeu.f20466a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: l */
    public static void m19620l() {
        if (aeu.f20466a >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: m */
    public static int m19621m(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: n */
    public static C7075kt m19622n(aee aee, boolean z, boolean z2) {
        if (z) {
            m19623o(3, aee, false);
        }
        aee.mo14541E((int) aee.mo14567u());
        long u = aee.mo14567u();
        String[] strArr = new String[((int) u)];
        for (int i = 0; ((long) i) < u; i++) {
            strArr[i] = aee.mo14541E((int) aee.mo14567u());
        }
        if (!z2 || (aee.mo14560n() & 1) != 0) {
            return new C7075kt(strArr);
        }
        throw new C6886dt("framing bit expected to be set");
    }

    /* renamed from: o */
    public static boolean m19623o(int i, aee aee, boolean z) {
        if (aee.mo14550d() < 7) {
            if (z) {
                return false;
            }
            int d = aee.mo14550d();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(d);
            throw new C6886dt(sb.toString());
        } else if (aee.mo14560n() != i) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i));
            throw new C6886dt(valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (aee.mo14560n() == 118 && aee.mo14560n() == 111 && aee.mo14560n() == 114 && aee.mo14560n() == 98 && aee.mo14560n() == 105 && aee.mo14560n() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C6886dt("expected characters 'vorbis'");
        }
    }

    /* renamed from: p */
    public static C7076ku[] m19624p(aee aee, int i) {
        int i2;
        int i3;
        long j;
        int i4 = i;
        int i5 = 5;
        int i6 = 0;
        m19623o(5, aee, false);
        int n = aee.mo14560n() + 1;
        C7074ks ksVar = new C7074ks(aee.mo14555i());
        ksVar.mo16138c(aee.mo14553g() * 8);
        int i7 = 0;
        while (i7 < n) {
            if (ksVar.mo16137b(24) == 5653314) {
                int b = ksVar.mo16137b(16);
                int b2 = ksVar.mo16137b(24);
                long[] jArr = new long[b2];
                if (!ksVar.mo16136a()) {
                    boolean a = ksVar.mo16136a();
                    while (i6 < b2) {
                        if (!a) {
                            jArr[i6] = (long) (ksVar.mo16137b(5) + 1);
                        } else if (ksVar.mo16136a()) {
                            jArr[i6] = (long) (ksVar.mo16137b(5) + 1);
                        } else {
                            jArr[i6] = 0;
                        }
                        i6++;
                    }
                } else {
                    int b3 = ksVar.mo16137b(5) + 1;
                    int i8 = 0;
                    while (i8 < b2) {
                        int b4 = ksVar.mo16137b(m19621m(b2 - i8));
                        for (int i9 = 0; i9 < b4 && i8 < b2; i9++) {
                            jArr[i8] = (long) b3;
                            i8++;
                        }
                        b3++;
                    }
                }
                int b5 = ksVar.mo16137b(4);
                if (b5 <= 2) {
                    if (b5 == 1) {
                        i3 = b5;
                    } else if (b5 == 2) {
                        i3 = 2;
                    } else {
                        i7++;
                        i6 = 0;
                    }
                    ksVar.mo16138c(32);
                    ksVar.mo16138c(32);
                    int b6 = ksVar.mo16137b(4) + 1;
                    ksVar.mo16138c(1);
                    if (i3 != 1) {
                        j = ((long) b2) * ((long) b);
                    } else if (b != 0) {
                        double d = (double) ((long) b);
                        Double.isNaN(d);
                        j = (long) Math.floor(Math.pow((double) ((long) b2), 1.0d / d));
                    } else {
                        j = 0;
                    }
                    ksVar.mo16138c((int) (j * ((long) b6)));
                    i7++;
                    i6 = 0;
                } else {
                    StringBuilder sb = new StringBuilder(53);
                    sb.append("lookup type greater than 2 not decodable: ");
                    sb.append(b5);
                    throw new C6886dt(sb.toString());
                }
            } else {
                int d2 = ksVar.mo16139d();
                StringBuilder sb2 = new StringBuilder(66);
                sb2.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                sb2.append(d2);
                throw new C6886dt(sb2.toString());
            }
        }
        int b7 = ksVar.mo16137b(6) + 1;
        int i10 = 0;
        while (i10 < b7) {
            if (ksVar.mo16137b(16) == 0) {
                i10++;
            } else {
                throw new C6886dt("placeholder of time domain transforms not zeroed out");
            }
        }
        int b8 = ksVar.mo16137b(6) + 1;
        int i11 = 0;
        while (true) {
            int i12 = 3;
            if (i11 < b8) {
                int b9 = ksVar.mo16137b(16);
                if (b9 == 0) {
                    int i13 = 8;
                    ksVar.mo16138c(8);
                    ksVar.mo16138c(16);
                    ksVar.mo16138c(16);
                    ksVar.mo16138c(6);
                    ksVar.mo16138c(8);
                    int b10 = ksVar.mo16137b(4) + 1;
                    int i14 = 0;
                    while (i14 < b10) {
                        ksVar.mo16138c(i13);
                        i14++;
                        i13 = 8;
                    }
                } else if (b9 == 1) {
                    int b11 = ksVar.mo16137b(i5);
                    int[] iArr = new int[b11];
                    int i15 = -1;
                    for (int i16 = 0; i16 < b11; i16++) {
                        int b12 = ksVar.mo16137b(4);
                        iArr[i16] = b12;
                        if (b12 > i15) {
                            i15 = b12;
                        }
                    }
                    int i17 = i15 + 1;
                    int[] iArr2 = new int[i17];
                    int i18 = 0;
                    while (i18 < i17) {
                        iArr2[i18] = ksVar.mo16137b(i12) + 1;
                        int b13 = ksVar.mo16137b(2);
                        if (b13 > 0) {
                            i2 = 8;
                            ksVar.mo16138c(8);
                        } else {
                            i2 = 8;
                        }
                        int i19 = 0;
                        while (i19 < (1 << b13)) {
                            ksVar.mo16138c(i2);
                            i19++;
                            i2 = 8;
                        }
                        i18++;
                        i12 = 3;
                    }
                    ksVar.mo16138c(2);
                    int b14 = ksVar.mo16137b(4);
                    int i20 = 0;
                    int i21 = 0;
                    for (int i22 = 0; i22 < b11; i22++) {
                        i20 += iArr2[iArr[i22]];
                        while (i21 < i20) {
                            ksVar.mo16138c(b14);
                            i21++;
                        }
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder(52);
                    sb3.append("floor type greater than 1 not decodable: ");
                    sb3.append(b9);
                    throw new C6886dt(sb3.toString());
                }
                i11++;
                i5 = 5;
            } else {
                int b15 = ksVar.mo16137b(6) + 1;
                int i23 = 0;
                while (i23 < b15) {
                    if (ksVar.mo16137b(16) <= 2) {
                        ksVar.mo16138c(24);
                        ksVar.mo16138c(24);
                        ksVar.mo16138c(24);
                        int b16 = ksVar.mo16137b(6) + 1;
                        int i24 = 8;
                        ksVar.mo16138c(8);
                        int[] iArr3 = new int[b16];
                        for (int i25 = 0; i25 < b16; i25++) {
                            iArr3[i25] = ((ksVar.mo16136a() ? ksVar.mo16137b(5) : 0) * 8) + ksVar.mo16137b(3);
                        }
                        int i26 = 0;
                        while (i26 < b16) {
                            int i27 = 0;
                            while (i27 < i24) {
                                if ((iArr3[i26] & (1 << i27)) != 0) {
                                    ksVar.mo16138c(i24);
                                }
                                i27++;
                                i24 = 8;
                            }
                            i26++;
                            i24 = 8;
                        }
                        i23++;
                    } else {
                        throw new C6886dt("residueType greater than 2 is not decodable");
                    }
                }
                int b17 = ksVar.mo16137b(6) + 1;
                for (int i28 = 0; i28 < b17; i28++) {
                    int b18 = ksVar.mo16137b(16);
                    if (b18 != 0) {
                        StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("mapping type other than 0 not supported: ");
                        sb4.append(b18);
                        Log.e("VorbisUtil", sb4.toString());
                    } else {
                        int b19 = ksVar.mo16136a() ? ksVar.mo16137b(4) + 1 : 1;
                        if (ksVar.mo16136a()) {
                            int b20 = ksVar.mo16137b(8) + 1;
                            for (int i29 = 0; i29 < b20; i29++) {
                                int i30 = i4 - 1;
                                ksVar.mo16138c(m19621m(i30));
                                ksVar.mo16138c(m19621m(i30));
                            }
                        }
                        if (ksVar.mo16137b(2) == 0) {
                            if (b19 > 1) {
                                for (int i31 = 0; i31 < i4; i31++) {
                                    ksVar.mo16138c(4);
                                }
                            }
                            for (int i32 = 0; i32 < b19; i32++) {
                                ksVar.mo16138c(8);
                                ksVar.mo16138c(8);
                                ksVar.mo16138c(8);
                            }
                        } else {
                            throw new C6886dt("to reserved bits must be zero after mapping coupling steps");
                        }
                    }
                }
                int b21 = ksVar.mo16137b(6) + 1;
                C7076ku[] kuVarArr = new C7076ku[b21];
                for (int i33 = 0; i33 < b21; i33++) {
                    boolean a2 = ksVar.mo16136a();
                    ksVar.mo16137b(16);
                    ksVar.mo16137b(16);
                    ksVar.mo16137b(8);
                    kuVarArr[i33] = new C7076ku(a2);
                }
                if (ksVar.mo16136a()) {
                    return kuVarArr;
                }
                throw new C6886dt("framing bit after modes not set as expected");
            }
        }
    }

    /* renamed from: q */
    public static int m19625q(C7073kr krVar, abu abu, int i, boolean z) {
        return krVar.mo16106e(abu, i, z);
    }

    /* renamed from: r */
    public static void m19626r(C7073kr krVar, aee aee, int i) {
        krVar.mo16107f(aee, i);
    }

    /* renamed from: s */
    public static C7062kg m19627s(aee aee) {
        aee.mo14557k(1);
        int r = aee.mo14564r();
        long g = ((long) aee.mo14553g()) + ((long) r);
        int i = r / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long x = aee.mo14570x();
            if (x == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = x;
            jArr2[i2] = aee.mo14570x();
            aee.mo14557k(2);
            i2++;
        }
        aee.mo14557k((int) (g - ((long) aee.mo14553g())));
        return new C7062kg(jArr, jArr2);
    }

    /* renamed from: u */
    private static String m19629u(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: v */
    private static String m19630v(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    /* renamed from: w */
    private static int[] m19631w(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    /* renamed from: t */
    public static C7243qz m19628t(C7050jv jvVar, boolean z) {
        C7243qz a = new C7065kj().mo16125a(jvVar, z ? null : C7272sa.f23737a);
        if (a == null || a.mo16341a() == 0) {
            return null;
        }
        return a;
    }
}
