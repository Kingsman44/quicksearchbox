package com.google.ads.interactivemedia.p367v3.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.google.common.p4535g.C59203do;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aeu */
/* compiled from: PG */
public final class aeu {

    /* renamed from: a */
    public static final int f20466a;

    /* renamed from: b */
    public static final String f20467b;

    /* renamed from: c */
    public static final String f20468c;

    /* renamed from: d */
    public static final String f20469d;

    /* renamed from: e */
    public static final String f20470e;

    /* renamed from: f */
    public static final byte[] f20471f = new byte[0];

    /* renamed from: g */
    private static final Pattern f20472g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f20473h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f20474i = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");

    /* renamed from: j */
    private static HashMap f20475j;

    /* renamed from: k */
    private static final String[] f20476k = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: l */
    private static final String[] f20477l = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: m */
    private static final int[] f20478m = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: n */
    private static final int[] f20479n = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, PrivateKeyType.INVALID, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i;
        if ("S".equals(Build.VERSION.CODENAME)) {
            i = 31;
        } else {
            i = "R".equals(Build.VERSION.CODENAME) ? 30 : Build.VERSION.SDK_INT;
        }
        f20466a = i;
        String str = Build.DEVICE;
        f20467b = str;
        String str2 = Build.MANUFACTURER;
        f20468c = str2;
        String str3 = Build.MODEL;
        f20469d = str3;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str3).length() + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        f20470e = sb.toString();
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* renamed from: A */
    public static String[] m18483A(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: B */
    public static boolean m18484B(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: C */
    public static String m18485C(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.US);
    }

    /* renamed from: D */
    public static String m18486D(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.US);
    }

    /* renamed from: E */
    public static String m18487E(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: F */
    public static int m18488F(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: G */
    public static long m18489G(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: H */
    public static int m18490H(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: I */
    public static long m18491I(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: J */
    public static float m18492J(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: K */
    public static int m18493K(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    /* renamed from: L */
    public static long m18494L(String str) {
        Matcher matcher = f20473h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = C59203do.f157270a;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j = (long) ((parseDouble5 + d) * 1000.0d);
        return isEmpty ? -j : j;
    }

    /* renamed from: M */
    public static long m18495M(String str) {
        Matcher matcher = f20472g.matcher(str);
        if (!matcher.matches()) {
            String valueOf = String.valueOf(str);
            throw new C6886dt(valueOf.length() != 0 ? "Invalid date/time format: ".concat(valueOf) : new String("Invalid date/time format: "));
        }
        int i = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i = -i;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            String valueOf2 = String.valueOf(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(valueOf2.length() != 0 ? "0.".concat(valueOf2) : new String("0.")).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
    }

    /* renamed from: N */
    public static long m18496N(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j;
        double d2 = (double) j2;
        double d3 = (double) j3;
        Double.isNaN(d2);
        Double.isNaN(d3);
        Double.isNaN(d);
        return (long) (d * (d2 / d3));
    }

    /* renamed from: O */
    public static long m18497O(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: P */
    public static long m18498P(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: Q */
    public static long m18499Q(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: R */
    public static long m18500R(int i, int i2) {
        return m18499Q(i2) | (m18499Q(i) << 32);
    }

    /* renamed from: S */
    public static String m18501S(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int length = objArr.length;
            if (i >= length) {
                return sb.toString();
            }
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    /* renamed from: T */
    public static String m18502T(String str, int i) {
        if (r0 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m18503U(str)) {
            if (i == adz.m18358j(adz.m18356h(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: U */
    public static String[] m18503U(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m18556z(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: V */
    public static C6864cy m18504V(int i, int i2, int i3) {
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("audio/raw");
        cxVar.mo15606H(i2);
        cxVar.mo15631af(i3);
        cxVar.mo15623Y(i);
        return cxVar.mo15625a();
    }

    /* renamed from: W */
    public static int m18505W(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: X */
    public static boolean m18506X(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: Y */
    public static boolean m18507Y(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: Z */
    public static int m18508Z(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                int i2 = f20466a;
                return (i2 < 23 && i2 < 21) ? 0 : 6396;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static byte[] m18509a(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: aa */
    public static int m18510aa(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 + i2;
    }

    /* renamed from: ab */
    public static int m18511ab(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return 3;
        }
        String C = m18485C(path);
        if (!C.endsWith(".mpd")) {
            if (!C.endsWith(".m3u8")) {
                Matcher matcher = f20474i.matcher(C);
                if (!matcher.matches()) {
                    return 3;
                }
                String group = matcher.group(2);
                if (group == null) {
                    return 1;
                }
                if (!group.contains("format=mpd-time-csf")) {
                    if (group.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                    return 1;
                }
            }
            return 2;
        }
        return 0;
    }

    /* renamed from: ac */
    public static int m18512ac(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: ad */
    public static int m18513ad(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return 1;
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (!(type == 4 || type == 5)) {
                    if (type != 6) {
                        return type != 9 ? 8 : 7;
                    }
                    return 5;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                case 2:
                    return 3;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 14:
                case 15:
                case 17:
                    return 4;
                case 13:
                    return 5;
                case 18:
                    return 2;
                case 20:
                    if (f20466a < 29) {
                        return 0;
                    }
                    return 9;
                default:
                    return 6;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    /* renamed from: ae */
    public static String m18514ae(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return m18486D(networkCountryIso);
            }
        }
        return m18486D(Locale.getDefault().getCountry());
    }

    /* renamed from: af */
    public static String[] m18515af() {
        String[] strArr;
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f20466a >= 24) {
            strArr = m18556z(configuration.getLocales().toLanguageTags(), ",");
        } else {
            strArr = new String[]{m18551u(configuration.locale)};
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = m18552v(strArr[i]);
        }
        return strArr;
    }

    /* renamed from: ag */
    public static boolean m18516ag(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: ah */
    public static Point m18517ah(Context context) {
        String str;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        ary.m19467t(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        int i = f20466a;
        if (i <= 29 && defaultDisplay.getDisplayId() == 0 && m18516ag(context)) {
            if ("Sony".equals(f20468c) && f20469d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
            if (i < 28) {
                str = m18530au("sys.display-size");
            } else {
                str = m18530au("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] z = m18556z(str.trim(), "x");
                    if (z.length == 2) {
                        int parseInt = Integer.parseInt(z[0]);
                        int parseInt2 = Integer.parseInt(z[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                String valueOf = String.valueOf(str);
                Log.e("Util", valueOf.length() != 0 ? "Invalid display size: ".concat(valueOf) : new String("Invalid display size: "));
            }
        }
        Point point = new Point();
        int i2 = f20466a;
        if (i2 >= 23) {
            Display.Mode mode = defaultDisplay.getMode();
            point.x = mode.getPhysicalWidth();
            point.y = mode.getPhysicalHeight();
            return point;
        } else if (i2 >= 17) {
            defaultDisplay.getRealSize(point);
            return point;
        } else {
            defaultDisplay.getSize(point);
            return point;
        }
    }

    /* renamed from: ai */
    public static long m18518ai(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: aj */
    public static long m18519aj(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: ak */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m18520ak(long[] r4, long r5, boolean r7) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0009
            r4 = r0 ^ -1
            goto L_0x0017
        L_0x0009:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0009
        L_0x0014:
            if (r7 != 0) goto L_0x0018
            r4 = r0
        L_0x0017:
            return r4
        L_0x0018:
            int r0 = r0 + -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.aeu.m18520ak(long[], long, boolean):int");
    }

    /* renamed from: al */
    public static int m18521al(List list, Comparable comparable, boolean z) {
        int i;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || ((Comparable) list.get(binarySearch)).compareTo(comparable) != 0) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (((Comparable) list.get(binarySearch)).compareTo(comparable) != 0);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: am */
    public static int m18522am(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch < 0) {
            return -(binarySearch + 2);
        }
        do {
            binarySearch--;
            if (binarySearch < 0 || iArr[binarySearch] != i) {
            }
            binarySearch--;
            break;
        } while (iArr[binarySearch] != i);
        return binarySearch;
    }

    /* renamed from: an */
    public static int m18523an(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    /* renamed from: ao */
    public static int m18524ao(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f20478m[(i2 >>> 24) ^ (bArr[i3] & 255)] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: ap */
    public static int m18525ap(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = f20479n[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: aq */
    public static String m18526aq(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        String str2 = Build.VERSION.RELEASE;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(str2).length());
        sb.append("IMA SDK ExoPlayer/");
        sb.append(str);
        sb.append(" (Linux;Android ");
        sb.append(str2);
        sb.append(") ExoPlayerLib/2.12.1");
        return sb.toString();
    }

    /* renamed from: ar */
    public static void m18527ar(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: at */
    public static long m18529at(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* renamed from: au */
    private static String m18530au(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            adu.m18341b("Util", str.length() != 0 ? "Failed to read system property ".concat(str) : new String("Failed to read system property "), e);
            return null;
        }
    }

    /* renamed from: av */
    private static HashMap m18531av() {
        int length = f20476k.length;
        HashMap hashMap = new HashMap(r2 + 86);
        int i = 0;
        for (String str : Locale.getISOLanguages()) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f20476k;
            int length2 = strArr.length;
            if (i >= 86) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: b */
    public static boolean m18532b(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: c */
    public static boolean m18533c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m18534d(Object[] objArr, Object obj) {
        for (Object c : objArr) {
            if (m18533c(c, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m18535e(List list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: f */
    public static Object m18536f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public static Object[] m18537g(Object[] objArr) {
        return objArr;
    }

    /* renamed from: h */
    public static Object[] m18538h(Object[] objArr, int i) {
        ary.m19462o(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: i */
    public static Object[] m18539i(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    /* renamed from: j */
    public static Object[] m18540j(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: k */
    public static Handler m18541k() {
        return m18542l((Handler.Callback) null);
    }

    /* renamed from: l */
    public static Handler m18542l(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        ary.m19466s(myLooper);
        return m18544n(myLooper, callback);
    }

    /* renamed from: m */
    public static Handler m18543m() {
        return m18544n(m18545o(), (Handler.Callback) null);
    }

    /* renamed from: n */
    public static Handler m18544n(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: o */
    public static Looper m18545o() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: p */
    public static ExecutorService m18546p(String str) {
        return Executors.newSingleThreadExecutor(new aet(str));
    }

    /* renamed from: q */
    public static void m18547q(abx abx) {
        if (abx != null) {
            try {
                abx.mo14391f();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: r */
    public static void m18548r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: s */
    public static boolean m18549s(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: t */
    public static void m18550t(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: u */
    public static String m18551u(Locale locale) {
        if (f20466a >= 21) {
            return locale.toLanguageTag();
        }
        return locale.toString();
    }

    /* renamed from: v */
    public static String m18552v(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String C = m18485C(str);
        int i = 0;
        String str2 = m18483A(C, "-")[0];
        if (f20475j == null) {
            f20475j = m18531av();
        }
        String str3 = (String) f20475j.get(str2);
        if (str3 != null) {
            String valueOf = String.valueOf(C.substring(str2.length()));
            C = valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3);
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return C;
        }
        while (true) {
            String[] strArr = f20477l;
            int length = strArr.length;
            if (i >= 18) {
                return C;
            }
            if (C.startsWith(strArr[i])) {
                String valueOf2 = String.valueOf(strArr[i + 1]);
                String valueOf3 = String.valueOf(C.substring(strArr[i].length()));
                return valueOf3.length() != 0 ? valueOf2.concat(valueOf3) : new String(valueOf2);
            }
            i += 2;
        }
    }

    /* renamed from: w */
    public static String m18553w(byte[] bArr) {
        return new String(bArr, apv.f21364b);
    }

    /* renamed from: x */
    public static String m18554x(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, apv.f21364b);
    }

    /* renamed from: y */
    public static byte[] m18555y(String str) {
        return str.getBytes(apv.f21364b);
    }

    /* renamed from: z */
    public static String[] m18556z(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: as */
    public static void m18528as(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            long j2 = j / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j2;
                i++;
            }
        } else if (j >= 1000000 || 1000000 % j != 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                double d3 = (double) jArr[i];
                Double.isNaN(d3);
                jArr[i] = (long) (d3 * d2);
                i++;
            }
        } else {
            long j3 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
        }
    }
}
