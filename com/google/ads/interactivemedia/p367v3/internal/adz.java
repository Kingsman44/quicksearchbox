package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.adz */
/* compiled from: PG */
public final class adz {

    /* renamed from: a */
    private static final ArrayList f20397a = new ArrayList();

    /* renamed from: b */
    private static final Pattern f20398b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: a */
    public static boolean m18349a(String str) {
        return "audio".equals(m18362n(str));
    }

    /* renamed from: b */
    public static boolean m18350b(String str) {
        return "video".equals(m18362n(str));
    }

    /* renamed from: c */
    public static boolean m18351c(String str) {
        return "text".equals(m18362n(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0061, code lost:
        r3 = com.google.ads.interactivemedia.p367v3.internal.C6961gn.m20512c((r3 = m18361m(r4)).f20396b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0089 A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m18352d(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L_0x0081;
                case -432837260: goto L_0x0078;
                case -432837259: goto L_0x006f;
                case -53558318: goto L_0x004f;
                case 187078296: goto L_0x0046;
                case 187094639: goto L_0x003d;
                case 1504578661: goto L_0x0034;
                case 1504619009: goto L_0x002b;
                case 1504831518: goto L_0x0022;
                case 1903231877: goto L_0x0018;
                case 1903589369: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x008a
        L_0x000e:
            java.lang.String r4 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0018:
            java.lang.String r4 = "audio/g711-alaw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0022:
            java.lang.String r4 = "audio/mpeg"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x002b:
            java.lang.String r4 = "audio/flac"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0034:
            java.lang.String r4 = "audio/eac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x003d:
            java.lang.String r4 = "audio/raw"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0046:
            java.lang.String r4 = "audio/ac3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x004f:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x008a
            if (r4 != 0) goto L_0x005a
            return r0
        L_0x005a:
            com.google.ads.interactivemedia.v3.internal.ady r3 = m18361m(r4)
            if (r3 != 0) goto L_0x0061
            return r0
        L_0x0061:
            int r3 = r3.f20396b
            int r3 = com.google.ads.interactivemedia.p367v3.internal.C6961gn.m20512c(r3)
            if (r3 == 0) goto L_0x006e
            r4 = 16
            if (r3 == r4) goto L_0x006e
            return r2
        L_0x006e:
            return r0
        L_0x006f:
            java.lang.String r4 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0078:
            java.lang.String r4 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
            goto L_0x0089
        L_0x0081:
            java.lang.String r4 = "audio/eac3-joc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008a
        L_0x0089:
            return r2
        L_0x008a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.adz.m18352d(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: e */
    public static String m18353e(String str) {
        if (str == null) {
            return null;
        }
        for (String h : aeu.m18503U(str)) {
            String h2 = m18356h(h);
            if (h2 != null && m18350b(h2)) {
                return h2;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m18354f(String str) {
        if (str == null) {
            return null;
        }
        for (String h : aeu.m18503U(str)) {
            String h2 = m18356h(h);
            if (h2 != null && m18349a(h2)) {
                return h2;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static String m18355g(String str) {
        if (str == null) {
            return null;
        }
        for (String h : aeu.m18503U(str)) {
            String h2 = m18356h(h);
            if (h2 != null && m18351c(h2)) {
                return h2;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static String m18356h(String str) {
        ady m;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String C = aeu.m18485C(str.trim());
        if (C.startsWith("avc1") || C.startsWith("avc3")) {
            return "video/avc";
        }
        if (C.startsWith("hev1") || C.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (C.startsWith("dvav") || C.startsWith("dva1") || C.startsWith("dvhe") || C.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (C.startsWith("av01")) {
            return "video/av01";
        }
        if (C.startsWith("vp9") || C.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (C.startsWith("vp8") || C.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (C.startsWith("mp4a")) {
            if (C.startsWith("mp4a.") && (m = m18361m(C)) != null) {
                str2 = m18357i(m.f20395a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (C.startsWith("ac-3") || C.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (C.startsWith("ec-3") || C.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (C.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (C.startsWith("ac-4") || C.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (C.startsWith("dtsc") || C.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (C.startsWith("dtsh") || C.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (C.startsWith("opus")) {
                return "audio/opus";
            }
            if (C.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (C.startsWith("flac")) {
                return "audio/flac";
            }
            if (C.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (C.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (C.contains("cea708")) {
                return "application/cea-708";
            }
            if (C.contains("eia608") || C.contains("cea608")) {
                return "application/cea-608";
            }
            int size = f20397a.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                adx adx = (adx) f20397a.get(i);
                String str3 = adx.f20393b;
                if (C.startsWith((String) null)) {
                    String str4 = adx.f20392a;
                    break;
                }
                i++;
            }
            return null;
        }
    }

    /* renamed from: i */
    public static String m18357i(int i) {
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

    /* renamed from: j */
    public static int m18358j(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m18349a(str)) {
            return 1;
        }
        if (m18350b(str)) {
            return 2;
        }
        if (m18351c(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = f20397a.size();
        for (int i = 0; i < size; i++) {
            adx adx = (adx) f20397a.get(i);
            String str2 = adx.f20392a;
            if (str.equals((Object) null)) {
                int i2 = adx.f20394c;
                return 0;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public static String m18359k(String str) {
        int hashCode = str.hashCode();
        return hashCode != -1007807498 ? hashCode != -586683234 ? (hashCode == 187090231 && str.equals("audio/mp3")) ? "audio/mpeg" : str : str.equals("audio/x-wav") ? "audio/wav" : str : str.equals("audio/x-flac") ? "audio/flac" : str;
    }

    /* renamed from: l */
    public static boolean m18360l(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    static ady m18361m(String str) {
        Matcher matcher = f20398b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        ary.m19467t(group);
        String group2 = matcher.group(2);
        try {
            return new ady(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: n */
    private static String m18362n(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }
}
