package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.p136b.C2612ak;
import com.google.common.base.C58890d;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.common.ay */
/* compiled from: PG */
public final class C2598ay {

    /* renamed from: a */
    private static final ArrayList f7214a = new ArrayList();

    /* renamed from: b */
    private static final Pattern f7215b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m6802a(java.lang.String r6, java.lang.String r7) {
        /*
            int r0 = r6.hashCode()
            r1 = 8
            r2 = 7
            r3 = 5
            r4 = 6
            r5 = 0
            switch(r0) {
                case -2123537834: goto L_0x005f;
                case -1095064472: goto L_0x0055;
                case -53558318: goto L_0x004b;
                case 187078296: goto L_0x0041;
                case 187078297: goto L_0x0037;
                case 1504578661: goto L_0x002d;
                case 1504831518: goto L_0x0023;
                case 1505942594: goto L_0x0019;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0069
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 8
            goto L_0x006a
        L_0x0019:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 7
            goto L_0x006a
        L_0x0023:
            java.lang.String r0 = "audio/mpeg"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 0
            goto L_0x006a
        L_0x002d:
            java.lang.String r0 = "audio/eac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 3
            goto L_0x006a
        L_0x0037:
            java.lang.String r0 = "audio/ac4"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 5
            goto L_0x006a
        L_0x0041:
            java.lang.String r0 = "audio/ac3"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 2
            goto L_0x006a
        L_0x004b:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0055:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 6
            goto L_0x006a
        L_0x005f:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0069
            r6 = 4
            goto L_0x006a
        L_0x0069:
            r6 = -1
        L_0x006a:
            switch(r6) {
                case 0: goto L_0x008a;
                case 1: goto L_0x007b;
                case 2: goto L_0x007a;
                case 3: goto L_0x0079;
                case 4: goto L_0x0076;
                case 5: goto L_0x0073;
                case 6: goto L_0x0072;
                case 7: goto L_0x0071;
                case 8: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            return r5
        L_0x006e:
            r6 = 14
            return r6
        L_0x0071:
            return r1
        L_0x0072:
            return r2
        L_0x0073:
            r6 = 17
            return r6
        L_0x0076:
            r6 = 18
            return r6
        L_0x0079:
            return r4
        L_0x007a:
            return r3
        L_0x007b:
            if (r7 != 0) goto L_0x007e
            return r5
        L_0x007e:
            androidx.media3.common.ax r6 = m6804c(r7)
            if (r6 != 0) goto L_0x0085
            return r5
        L_0x0085:
            int r6 = r6.mo6107a()
            return r6
        L_0x008a:
            r6 = 9
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2598ay.m6802a(java.lang.String, java.lang.String):int");
    }

    /* renamed from: b */
    public static int m6803b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m6813l(str)) {
            return 1;
        }
        if (m6817p(str)) {
            return 2;
        }
        if (m6816o(str)) {
            return 3;
        }
        if (m6814m(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        int size = f7214a.size();
        for (int i = 0; i < size; i++) {
            C2596aw awVar = (C2596aw) f7214a.get(i);
            String str2 = awVar.f7209a;
            if (str.equals((Object) null)) {
                int i2 = awVar.f7211c;
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: c */
    static C2597ax m6804c(String str) {
        Matcher matcher = f7215b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new C2597ax(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static String m6805d(String str) {
        if (str == null) {
            return null;
        }
        for (String f : C2612ak.m6969as(str)) {
            String f2 = m6807f(f);
            if (f2 != null && m6813l(f2)) {
                return f2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m6806e(String str, String str2) {
        if (!(str == null || str2 == null)) {
            String[] as = C2612ak.m6969as(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : as) {
                if (str2.equals(m6807f(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m6807f(String str) {
        C2597ax c;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String c2 = C58890d.m90988c(str.trim());
        if (c2.startsWith("avc1") || c2.startsWith("avc3")) {
            return "video/avc";
        }
        if (c2.startsWith("hev1") || c2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (c2.startsWith("dvav") || c2.startsWith("dva1") || c2.startsWith("dvhe") || c2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (c2.startsWith("av01")) {
            return "video/av01";
        }
        if (c2.startsWith("vp9") || c2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (c2.startsWith("vp8") || c2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (c2.startsWith("mp4a")) {
            if (c2.startsWith("mp4a.") && (c = m6804c(c2)) != null) {
                str2 = m6808g(c.f7212a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (c2.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (c2.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (c2.startsWith("ac-3") || c2.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (c2.startsWith("ec-3") || c2.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (c2.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (c2.startsWith("ac-4") || c2.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (c2.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (c2.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (c2.startsWith("dtsh") || c2.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (c2.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (c2.startsWith("opus")) {
                return "audio/opus";
            }
            if (c2.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (c2.startsWith("flac")) {
                return "audio/flac";
            }
            if (c2.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (c2.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (c2.contains("cea708")) {
                return "application/cea-708";
            }
            if (c2.contains("eia608") || c2.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f7214a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                C2596aw awVar = (C2596aw) f7214a.get(i);
                String str3 = awVar.f7210b;
                if (c2.startsWith((String) null)) {
                    String str4 = awVar.f7209a;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    /* renamed from: g */
    public static String m6808g(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: h */
    public static String m6809h(String str) {
        if (str == null) {
            return null;
        }
        for (String f : C2612ak.m6969as(str)) {
            String f2 = m6807f(f);
            if (f2 != null && m6817p(f2)) {
                return f2;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0042 A[RETURN] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m6810i(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1007807498(0xffffffffc3ee13f6, float:-476.15594)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L_0x002a
            r1 = -586683234(0xffffffffdd07ec9e, float:-6.1214856E17)
            if (r0 == r1) goto L_0x0020
            r1 = 187090231(0xb26c537, float:3.2118805E-32)
            if (r0 == r1) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r0 = "audio/mp3"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "audio/x-wav"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "audio/x-flac"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            if (r0 == r2) goto L_0x003c
            return r4
        L_0x003c:
            java.lang.String r4 = "audio/wav"
            return r4
        L_0x003f:
            java.lang.String r4 = "audio/mpeg"
            return r4
        L_0x0042:
            java.lang.String r4 = "audio/flac"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2598ay.m6810i(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        r3 = (r3 = m6804c(r4)).mo6107a();
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m6811j(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L_0x0075;
                case -432837260: goto L_0x006b;
                case -432837259: goto L_0x0061;
                case -53558318: goto L_0x0056;
                case 187078296: goto L_0x004c;
                case 187094639: goto L_0x0042;
                case 1504578661: goto L_0x0037;
                case 1504619009: goto L_0x002d;
                case 1504831518: goto L_0x0023;
                case 1903231877: goto L_0x0019;
                case 1903589369: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0080
        L_0x000e:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 5
            goto L_0x0081
        L_0x0019:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 4
            goto L_0x0081
        L_0x0023:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 0
            goto L_0x0081
        L_0x002d:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 6
            goto L_0x0081
        L_0x0037:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 8
            goto L_0x0081
        L_0x0042:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 3
            goto L_0x0081
        L_0x004c:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 7
            goto L_0x0081
        L_0x0056:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 10
            goto L_0x0081
        L_0x0061:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 2
            goto L_0x0081
        L_0x006b:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0075:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            r3 = 9
            goto L_0x0081
        L_0x0080:
            r3 = -1
        L_0x0081:
            switch(r3) {
                case 0: goto L_0x009b;
                case 1: goto L_0x009b;
                case 2: goto L_0x009b;
                case 3: goto L_0x009b;
                case 4: goto L_0x009b;
                case 5: goto L_0x009b;
                case 6: goto L_0x009b;
                case 7: goto L_0x009b;
                case 8: goto L_0x009b;
                case 9: goto L_0x009b;
                case 10: goto L_0x0085;
                default: goto L_0x0084;
            }
        L_0x0084:
            return r0
        L_0x0085:
            if (r4 != 0) goto L_0x0088
            return r0
        L_0x0088:
            androidx.media3.common.ax r3 = m6804c(r4)
            if (r3 != 0) goto L_0x008f
            return r0
        L_0x008f:
            int r3 = r3.mo6107a()
            if (r3 == 0) goto L_0x009a
            r4 = 16
            if (r3 == r4) goto L_0x009a
            return r2
        L_0x009a:
            return r0
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.C2598ay.m6811j(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: k */
    public static boolean m6812k(String str, String str2) {
        return m6806e(str, str2) != null;
    }

    /* renamed from: l */
    public static boolean m6813l(String str) {
        return "audio".equals(m6818q(str));
    }

    /* renamed from: m */
    public static boolean m6814m(String str) {
        return "image".equals(m6818q(str));
    }

    /* renamed from: n */
    public static boolean m6815n(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m6816o(String str) {
        return "text".equals(m6818q(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: p */
    public static boolean m6817p(String str) {
        return "video".equals(m6818q(str));
    }

    /* renamed from: q */
    private static String m6818q(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
