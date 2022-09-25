package androidx.media3.common.p136b;

import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.C2598ay;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2641bc;
import androidx.media3.common.C2642bd;
import androidx.media3.common.C2646bh;
import androidx.media3.common.C2676t;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58890d;
import com.google.common.base.C58913w;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.chromium.net.PrivateKeyType;
import p3186j$.util.DesugarTimeZone;

/* renamed from: androidx.media3.common.b.ak */
/* compiled from: PG */
public final class C2612ak {

    /* renamed from: a */
    public static final int f7249a;

    /* renamed from: b */
    public static final String f7250b;

    /* renamed from: c */
    public static final String f7251c;

    /* renamed from: d */
    public static final String f7252d;

    /* renamed from: e */
    public static final String f7253e;

    /* renamed from: f */
    public static final byte[] f7254f = new byte[0];

    /* renamed from: g */
    public static final Pattern f7255g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: h */
    private static final Pattern f7256h = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: i */
    private static final Pattern f7257i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static final Pattern f7258j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k */
    private static HashMap f7259k;

    /* renamed from: l */
    private static final String[] f7260l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m */
    private static final String[] f7261m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n */
    private static final int[] f7262n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o */
    private static final int[] f7263o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, PrivateKeyType.INVALID, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f7249a = i;
        String str = Build.DEVICE;
        f7250b = str;
        String str2 = Build.MANUFACTURER;
        f7251c = str2;
        String str3 = Build.MODEL;
        f7252d = str3;
        f7253e = str + ", " + str3 + ", " + str2 + ", " + i;
    }

    /* renamed from: A */
    public static long m6918A(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: B */
    public static Intent m6919B(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (f7249a < 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    /* renamed from: C */
    public static Point m6920C(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        String str = null;
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && m6959ai(context)) {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{"vendor.display-size"});
            } catch (Exception e) {
                C2633u.m7048c("Util", C2633u.m7046a("Failed to read system property vendor.display-size", e));
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] split = str.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C2633u.m7048c("Util", "Invalid display size: ".concat(String.valueOf(str)));
            }
            if ("Sony".equals(f7251c) && f7252d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    /* renamed from: D */
    public static Handler m6921D(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: E */
    public static Handler m6922E(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        C2601a.m6829a(myLooper);
        return new Handler(myLooper, callback);
    }

    /* renamed from: F */
    public static Looper m6923F() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return myLooper;
        }
        return Looper.getMainLooper();
    }

    /* renamed from: G */
    public static C2680x m6924G(int i, int i2, int i3) {
        C2679w wVar = new C2679w();
        wVar.f7459k = "audio/raw";
        wVar.f7472x = i2;
        wVar.f7473y = i3;
        wVar.f7474z = i;
        return new C2680x(wVar);
    }

    /* renamed from: H */
    public static C2642bd m6925H(C2646bh bhVar, C2642bd bdVar) {
        boolean Q = bhVar.mo5989Q();
        boolean au = bhVar.mo6275au();
        boolean aq = bhVar.mo6271aq();
        boolean ap = bhVar.mo6270ap();
        boolean at = bhVar.mo6274at();
        boolean as = bhVar.mo6273as();
        boolean o = bhVar.mo6014u().mo6304o();
        C2676t tVar = new C2676t();
        C2641bc.m7057b(bdVar, tVar);
        boolean z = !Q;
        tVar.mo6351d(4, z);
        boolean z2 = false;
        tVar.mo6351d(5, au && !Q);
        tVar.mo6351d(6, aq && !Q);
        tVar.mo6351d(7, !o && (aq || !at || au) && !Q);
        tVar.mo6351d(8, ap && !Q);
        tVar.mo6351d(9, !o && (ap || (at && as)) && !Q);
        tVar.mo6351d(10, z);
        tVar.mo6351d(11, au && !Q);
        if (au && !Q) {
            z2 = true;
        }
        tVar.mo6351d(12, z2);
        return C2641bc.m7056a(tVar);
    }

    /* renamed from: I */
    public static CharSequence m6926I(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    /* renamed from: J */
    public static Object m6927J(Object obj) {
        return obj;
    }

    /* renamed from: K */
    public static String m6928K(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: L */
    public static String m6929L(byte[] bArr) {
        return new String(bArr, C58913w.f156754c);
    }

    /* renamed from: M */
    public static String m6930M(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C58913w.f156754c);
    }

    /* renamed from: N */
    public static String m6931N(String str, int i) {
        if (r0 == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : m6969as(str)) {
            if (i == C2598ay.m6803b(C2598ay.m6807f(str2))) {
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

    /* renamed from: O */
    public static String m6932O(Object[] objArr) {
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

    /* renamed from: P */
    public static String m6933P(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C58890d.m90989d(networkCountryIso);
            }
        }
        return C58890d.m90989d(Locale.getDefault().getCountry());
    }

    /* renamed from: Q */
    public static String m6934Q(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: R */
    public static String m6935R(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        String str = j < 0 ? "-" : BuildConfig.FLAVOR;
        long abs = (Math.abs(j) + 500) / 1000;
        long j2 = abs % 60;
        long j3 = (abs / 60) % 60;
        long j4 = abs / 3600;
        sb.setLength(0);
        if (j4 > 0) {
            return formatter.format("%s%d:%02d:%02d", new Object[]{str, Long.valueOf(j4), Long.valueOf(j3), Long.valueOf(j2)}).toString();
        }
        return formatter.format("%s%02d:%02d", new Object[]{str, Long.valueOf(j3), Long.valueOf(j2)}).toString();
    }

    /* renamed from: S */
    public static String m6936S(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    /* renamed from: T */
    public static String m6937T(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        String str3 = Build.VERSION.RELEASE;
        return str + "/" + str2 + " (Linux;Android " + str3 + ") AndroidXMedia3/1.0.0-beta02";
    }

    /* renamed from: U */
    public static String m6938U(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c = C58890d.m90988c(str);
        int i = 0;
        String str2 = c.split("-", 2)[0];
        if (f7259k == null) {
            f7259k = m6950aF();
        }
        String str3 = (String) f7259k.get(str2);
        if (str3 != null) {
            c = str3.concat(String.valueOf(c.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c;
        }
        while (true) {
            String[] strArr = f7261m;
            int length = strArr.length;
            if (i >= 18) {
                return c;
            }
            if (c.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(c.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    /* renamed from: V */
    public static String m6939V(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) == '%') {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        int i4 = length - (i2 + i2);
        StringBuilder sb = new StringBuilder(i4);
        Matcher matcher = f7257i.matcher(str);
        while (i2 > 0 && matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group, 16);
            sb.append(str, i, matcher.start());
            sb.append((char) parseInt);
            i = matcher.end();
            i2--;
        }
        if (i < length) {
            sb.append(str, i, length);
        }
        if (sb.length() != i4) {
            return null;
        }
        return sb.toString();
    }

    /* renamed from: W */
    public static ExecutorService m6940W(String str) {
        return Executors.newSingleThreadExecutor(new C2611aj(str));
    }

    /* renamed from: X */
    public static void m6941X(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: Y */
    public static void m6942Y(List list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: Z */
    public static void m6943Z(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static float m6944a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: aA */
    public static void m6945aA(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    /* renamed from: aC */
    public static long m6947aC(long j, long j2) {
        long j3 = j - j2;
        if (((j ^ j3) & (j2 ^ j)) < 0) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    /* renamed from: aD */
    public static boolean m6948aD(SQLiteDatabase sQLiteDatabase) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0;
    }

    /* renamed from: aE */
    public static void m6949aE(InputStream inputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.toByteArray();
                return;
            }
        }
    }

    /* renamed from: aF */
    private static HashMap m6950aF() {
        int length = f7260l.length;
        HashMap hashMap = new HashMap(r2 + 88);
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
            String[] strArr = f7260l;
            int length2 = strArr.length;
            if (i >= 88) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: aa */
    public static boolean m6951aa(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: ab */
    public static boolean m6952ab(Object[] objArr, Object obj) {
        for (Object aa : objArr) {
            if (m6951aa(aa, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ac */
    public static boolean m6953ac(C2604ac acVar, C2604ac acVar2, Inflater inflater) {
        int i = acVar.f7236c - acVar.f7235b;
        if (i > 0) {
            if (acVar2.f7234a.length < i) {
                acVar2.mo6153u(i + i);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            byte[] bArr = acVar.f7234a;
            int i2 = acVar.f7235b;
            inflater.setInput(bArr, i2, acVar.f7236c - i2);
            int i3 = 0;
            while (true) {
                try {
                    byte[] bArr2 = acVar2.f7234a;
                    i3 += inflater.inflate(bArr2, i3, bArr2.length - i3);
                    if (inflater.finished()) {
                        acVar2.mo6158z(i3);
                        inflater.reset();
                        return true;
                    } else if (inflater.needsDictionary()) {
                        break;
                    } else if (inflater.needsInput()) {
                        break;
                    } else {
                        int length = acVar2.f7234a.length;
                        if (i3 == length) {
                            acVar2.mo6153u(length + length);
                        }
                    }
                } catch (DataFormatException unused) {
                } finally {
                    inflater.reset();
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: ad */
    public static boolean m6954ad(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: ae */
    public static boolean m6955ae(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: af */
    public static boolean m6956af(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: ag */
    public static boolean m6957ag(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: ah */
    public static boolean m6958ah(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: ai */
    public static boolean m6959ai(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: aj */
    public static boolean m6960aj(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: ak */
    public static byte[] m6961ak(String str) {
        return str.getBytes(C58913w.f156754c);
    }

    /* renamed from: al */
    public static Object[] m6962al(Object[] objArr) {
        return objArr;
    }

    /* renamed from: am */
    public static Object[] m6963am(Object[] objArr, Object obj) {
        int length = objArr.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + 1);
        copyOf[length] = obj;
        return copyOf;
    }

    /* renamed from: an */
    public static Object[] m6964an(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] copyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, copyOf, length, length2);
        return copyOf;
    }

    /* renamed from: ao */
    public static Object[] m6965ao(Object[] objArr, int i) {
        C2601a.m6830b(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    /* renamed from: ap */
    public static String[] m6966ap() {
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i = 0; i < split.length; i++) {
            split[i] = m6938U(split[i]);
        }
        return split;
    }

    /* renamed from: aq */
    public static String[] m6967aq(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: ar */
    public static String[] m6968ar(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: as */
    public static String[] m6969as(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return str.trim().split("(\\s*,\\s*)", -1);
    }

    /* renamed from: at */
    public static long m6970at(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j3) & (j2 ^ j3)) < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: au */
    public static int m6971au(List list, Comparable comparable) {
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        int size = list.size();
        do {
            binarySearch++;
            if (binarySearch >= size || ((Comparable) list.get(binarySearch)).compareTo(comparable) != 0) {
            }
            binarySearch++;
            break;
        } while (((Comparable) list.get(binarySearch)).compareTo(comparable) != 0);
        return binarySearch;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: av */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6972av(long[] r4, long r5, boolean r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2612ak.m6972av(long[], long, boolean):int");
    }

    /* renamed from: aw */
    public static int m6973aw(long[] jArr, long j, boolean z) {
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

    /* renamed from: ax */
    public static int m6974ax(byte[] bArr, int i) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = f7262n[(i2 >>> 24) ^ (bArr[i3] & 255)] ^ (i2 << 8);
        }
        return i2;
    }

    /* renamed from: ay */
    public static int m6975ay(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            i3 = f7263o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: az */
    public static Object[] m6976az(Object[] objArr, int i) {
        C2601a.m6830b(i <= objArr.length);
        return Arrays.copyOfRange(objArr, 1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6977b(java.util.List r2, java.lang.Comparable r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0020
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001a
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 == 0) goto L_0x000a
        L_0x001a:
            if (r4 == 0) goto L_0x001f
            int r2 = r0 + 1
            goto L_0x0020
        L_0x001f:
            r2 = r0
        L_0x0020:
            if (r5 == 0) goto L_0x0027
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2612ak.m6977b(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6978c(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0018
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0012
            r1 = r2[r0]
            if (r1 == r3) goto L_0x000a
        L_0x0012:
            if (r4 == 0) goto L_0x0017
            int r2 = r0 + 1
            goto L_0x0018
        L_0x0017:
            r2 = r0
        L_0x0018:
            if (r5 == 0) goto L_0x001f
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2612ak.m6978c(int[], int, boolean, boolean):int");
    }

    /* renamed from: d */
    public static int m6979d(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: e */
    public static int m6980e(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m6981f(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: g */
    public static int m6982g(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: h */
    public static int m6983h(int i) {
        if (i == 12) {
            return f7249a >= 32 ? 743676 : 0;
        }
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
                return 6396;
            default:
                return 0;
        }
    }

    /* renamed from: i */
    public static int m6984i(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: j */
    public static int m6985j(String str, int i) {
        int i2 = 0;
        for (String f : m6969as(str)) {
            if (i == C2598ay.m6803b(C2598ay.m6807f(f))) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: k */
    public static int m6986k(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return 6003;
        }
        switch (i) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: l */
    public static int m6987l(String str) {
        String[] split;
        int length;
        int i = 0;
        if (str == null || (length = split.length) < 2) {
            return 0;
        }
        String str2 = (split = str.split("_", -1))[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length + -2]);
        str2.getClass();
        try {
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    /* renamed from: m */
    public static int m6988m(int i) {
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

    /* renamed from: n */
    public static int m6989n(int i, int i2) {
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

    /* renamed from: o */
    public static int m6990o(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6991p(android.net.Uri r7) {
        /*
            java.lang.String r0 = r7.getScheme()
            r1 = 3
            if (r0 == 0) goto L_0x0011
            java.lang.String r2 = "rtsp"
            boolean r0 = com.google.common.base.C58890d.m90990e(r2, r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            return r1
        L_0x0011:
            java.lang.String r0 = r7.getLastPathSegment()
            r2 = 4
            if (r0 != 0) goto L_0x0019
            return r2
        L_0x0019:
            r3 = 46
            int r3 = r0.lastIndexOf(r3)
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 < 0) goto L_0x0071
            int r3 = r3 + r6
            java.lang.String r0 = r0.substring(r3)
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)
            int r3 = r0.hashCode()
            switch(r3) {
                case 104579: goto L_0x0053;
                case 108321: goto L_0x0049;
                case 3242057: goto L_0x003f;
                case 3299913: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x005d
        L_0x0035:
            java.lang.String r3 = "m3u8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 1
            goto L_0x005e
        L_0x003f:
            java.lang.String r3 = "isml"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 3
            goto L_0x005e
        L_0x0049:
            java.lang.String r3 = "mpd"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 0
            goto L_0x005e
        L_0x0053:
            java.lang.String r3 = "ism"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x005d
            r0 = 2
            goto L_0x005e
        L_0x005d:
            r0 = -1
        L_0x005e:
            if (r0 == 0) goto L_0x006c
            if (r0 == r6) goto L_0x006a
            if (r0 == r5) goto L_0x0068
            if (r0 == r1) goto L_0x0068
            r0 = 4
            goto L_0x006d
        L_0x0068:
            r0 = 1
            goto L_0x006d
        L_0x006a:
            r0 = 2
            goto L_0x006d
        L_0x006c:
            r0 = 0
        L_0x006d:
            if (r0 != r2) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            return r0
        L_0x0071:
            java.util.regex.Pattern r0 = f7258j
            java.lang.String r7 = r7.getPath()
            r7.getClass()
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.matches()
            if (r0 == 0) goto L_0x009d
            java.lang.String r7 = r7.group(r5)
            if (r7 == 0) goto L_0x009c
            java.lang.String r0 = "format=mpd-time-csf"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0093
            return r4
        L_0x0093:
            java.lang.String r0 = "format=m3u8-aapl"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x009c
            return r5
        L_0x009c:
            return r6
        L_0x009d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2612ak.m6991p(android.net.Uri):int");
    }

    @Deprecated
    /* renamed from: q */
    public static int m6992q(String str) {
        return m6991p(Uri.parse("file:///".concat(String.valueOf(str))));
    }

    /* renamed from: r */
    public static long m6993r(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: s */
    public static long m6994s(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: t */
    public static long m6995t(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    /* renamed from: u */
    public static long m6996u(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: v */
    public static long m6997v(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    /* renamed from: w */
    public static long m6998w(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: x */
    public static long m6999x(String str) {
        Matcher matcher = f7256h.matcher(str);
        if (matcher.matches()) {
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
                gregorianCalendar.set(14, new BigDecimal("0.".concat(String.valueOf(matcher.group(8)))).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
        }
        throw C2599az.m6819a("Invalid date/time format: ".concat(String.valueOf(str)), (Throwable) null);
    }

    /* renamed from: y */
    public static long m7000y(long j, long j2, long j3) {
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

    /* renamed from: z */
    public static long m7001z(int i, int i2) {
        return (((long) i2) & 4294967295L) | ((((long) i) & 4294967295L) << 32);
    }

    /* renamed from: aB */
    public static void m6946aB(long[] jArr, long j) {
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
