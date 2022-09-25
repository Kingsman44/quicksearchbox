package com.google.ads.interactivemedia.p367v3.internal;

import android.util.Base64;
import com.google.android.libraries.p579ar.sceneviewer.media.MediaUtilities;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zw */
/* compiled from: PG */
public final class C7483zw implements adc {

    /* renamed from: A */
    private static final Pattern f24643A = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: B */
    private static final Pattern f24644B = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: C */
    private static final Pattern f24645C = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: D */
    private static final Pattern f24646D = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: E */
    private static final Pattern f24647E = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: F */
    private static final Pattern f24648F = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: G */
    private static final Pattern f24649G = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: H */
    private static final Pattern f24650H = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: I */
    private static final Pattern f24651I = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: J */
    private static final Pattern f24652J = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: K */
    private static final Pattern f24653K = m22716k("AUTOSELECT");

    /* renamed from: L */
    private static final Pattern f24654L = m22716k("DEFAULT");

    /* renamed from: M */
    private static final Pattern f24655M = m22716k("FORCED");

    /* renamed from: N */
    private static final Pattern f24656N = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: O */
    private static final Pattern f24657O = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: P */
    private static final Pattern f24658P = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: a */
    private static final Pattern f24659a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    private static final Pattern f24660b = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: c */
    private static final Pattern f24661c = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: d */
    private static final Pattern f24662d = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: e */
    private static final Pattern f24663e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: f */
    private static final Pattern f24664f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: g */
    private static final Pattern f24665g = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: h */
    private static final Pattern f24666h = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: i */
    private static final Pattern f24667i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: j */
    private static final Pattern f24668j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: k */
    private static final Pattern f24669k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: l */
    private static final Pattern f24670l = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: m */
    private static final Pattern f24671m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: n */
    private static final Pattern f24672n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: o */
    private static final Pattern f24673o = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: p */
    private static final Pattern f24674p = m22716k("CAN-SKIP-DATERANGES");

    /* renamed from: q */
    private static final Pattern f24675q = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: r */
    private static final Pattern f24676r = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: s */
    private static final Pattern f24677s = m22716k("CAN-BLOCK-RELOAD");

    /* renamed from: t */
    private static final Pattern f24678t = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: u */
    private static final Pattern f24679u = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: v */
    private static final Pattern f24680v = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: w */
    private static final Pattern f24681w = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: x */
    private static final Pattern f24682x = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: y */
    private static final Pattern f24683y = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: z */
    private static final Pattern f24684z = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: Q */
    private final C7478zr f24685Q;

    public C7483zw() {
        C7478zr zrVar = C7478zr.f24602a;
        throw null;
    }

    public C7483zw(C7478zr zrVar) {
        this.f24685Q = zrVar;
    }

    /* renamed from: b */
    private static int m22707b(BufferedReader bufferedReader, boolean z, int i) {
        while (i != -1 && Character.isWhitespace(i) && (z || !aeu.m18484B(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    /* renamed from: c */
    private static C7030jb m22708c(String str, String str2, Map map) {
        String i = m22714i(str, f24644B, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String g = m22712g(str, f24645C, map);
            return new C7030jb(C6821bi.f21607c, MediaUtilities.MIME_TYPE, Base64.decode(g.substring(g.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new C7030jb(C6821bi.f21607c, "hls", aeu.m18555y(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(i)) {
                return null;
            }
            String g2 = m22712g(str, f24645C, map);
            return new C7030jb(C6821bi.f21608d, MediaUtilities.MIME_TYPE, C7135mz.m21198a(C6821bi.f21608d, Base64.decode(g2.substring(g2.indexOf(44)), 0)));
        }
    }

    /* renamed from: d */
    private static String m22709d(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    /* renamed from: e */
    private static int m22710e(String str, Pattern pattern) {
        return Integer.parseInt(m22712g(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: f */
    private static double m22711f(String str, Pattern pattern) {
        return Double.parseDouble(m22712g(str, pattern, Collections.emptyMap()));
    }

    /* renamed from: g */
    private static String m22712g(String str, Pattern pattern, Map map) {
        String h = m22713h(str, pattern, map);
        if (h != null) {
            return h;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new C6886dt(sb.toString());
    }

    /* renamed from: h */
    private static String m22713h(String str, Pattern pattern, Map map) {
        return m22714i(str, pattern, (String) null, map);
    }

    /* renamed from: i */
    private static String m22714i(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            ary.m19467t(str2);
        }
        return (map.isEmpty() || str2 == null) ? str2 : m22715j(str2, map);
    }

    /* renamed from: j */
    private static String m22715j(String str, Map map) {
        Matcher matcher = f24658P.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: k */
    private static Pattern m22716k(String str) {
        str.length();
        return Pattern.compile(String.valueOf(str).concat("=(NO|YES)"));
    }

    /* renamed from: l */
    private static boolean m22717l(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* renamed from: m */
    private static double m22718m(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        ary.m19467t(group);
        return Double.parseDouble(group);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02b7, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("#EXT-X-STREAM-INF must be followed by another line");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02b8, code lost:
        r26 = r3;
        r1 = r5;
        r36 = r6;
        r39 = r7;
        r38 = r9;
        r37 = r13;
        r88 = r14;
        r2 = new java.util.ArrayList();
        r3 = new java.util.HashSet();
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02d4, code lost:
        if (r5 >= r15.size()) goto L_0x033a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02d6, code lost:
        r6 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r15.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02e2, code lost:
        if (r3.add(r6.f24596a) == false) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02e8, code lost:
        if (r6.f24597b.f21810j != null) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02ea, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ec, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ed, code lost:
        com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r7);
        r9 = (java.util.ArrayList) r1.get(r6.f24596a);
        com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9);
        r9 = new com.google.ads.interactivemedia.p367v3.internal.C7243qz(new com.google.ads.interactivemedia.p367v3.internal.C7467zg((java.lang.String) null, (java.lang.String) null, r9));
        r7 = r6.f24597b.mo15636a();
        r7.mo15622X(r9);
        r2.add(new com.google.ads.interactivemedia.p367v3.internal.C7477zq(r6.f24596a, r7.mo15625a(), r6.f24598c, r6.f24599d, r6.f24600e, r6.f24601f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0337, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x033a, code lost:
        r1 = 0;
        r10 = null;
        r23 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0342, code lost:
        if (r1 >= r39.size()) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0344, code lost:
        r3 = r39;
        r5 = (java.lang.String) r3.get(r1);
        r6 = m22712g(r5, f24650H, r8);
        r7 = m22712g(r5, f24649G, r8);
        r9 = new com.google.ads.interactivemedia.p367v3.internal.C6863cx();
        r12 = new java.lang.StringBuilder((r6.length() + 1) + r7.length());
        r12.append(r6);
        r12.append(":");
        r12.append(r7);
        r9.mo15617S(r12.toString());
        r9.mo15619U(r7);
        r9.mo15609K("application/x-mpegURL");
        r11 = m22717l(r5, f24654L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0393, code lost:
        if (m22717l(r5, f24655M) == false) goto L_0x0397;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0395, code lost:
        r11 = r11 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x039d, code lost:
        if (m22717l(r5, f24653K) == false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x039f, code lost:
        r11 = r11 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03a1, code lost:
        r9.mo15632ag(r11 ? 1 : 0);
        r11 = m22713h(r5, f24651I, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ae, code lost:
        if (android.text.TextUtils.isEmpty(r11) == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03b0, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03b2, code lost:
        r11 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18556z(r11, ",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03bf, code lost:
        if (true == com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, "public.accessibility.describes-video")) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c1, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03c3, code lost:
        r12 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03cb, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, "public.accessibility.transcribes-spoken-dialog") == false) goto L_0x03cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03cd, code lost:
        r12 = r12 | 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d5, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, "public.accessibility.describes-music-and-sound") == false) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03d7, code lost:
        r12 = r12 | 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03df, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, "public.easy-to-read") == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03e1, code lost:
        r11 = r12 | 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e4, code lost:
        r11 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03e5, code lost:
        r9.mo15628ac(r11);
        r9.mo15620V(m22713h(r5, f24648F, r8));
        r11 = m22713h(r5, f24645C, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03f7, code lost:
        if (r11 != null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03f9, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03fb, code lost:
        r11 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03ff, code lost:
        r39 = r3;
        r12 = new com.google.ads.interactivemedia.p367v3.internal.C7243qz(new com.google.ads.interactivemedia.p367v3.internal.C7467zg(r6, r7, java.util.Collections.emptyList()));
        r3 = m22712g(r5, f24647E, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x041f, code lost:
        switch(r3.hashCode()) {
            case -959297733: goto L_0x055f;
            case -333210994: goto L_0x0519;
            case 62628790: goto L_0x0487;
            case 81665115: goto L_0x0428;
            default: goto L_0x0422;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0422, code lost:
        r5 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0424, code lost:
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x042e, code lost:
        if (r3.equals("VIDEO") == false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0430, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0435, code lost:
        if (r3 >= r15.size()) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0437, code lost:
        r5 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r15.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0443, code lost:
        if (r6.equals(r5.f24598c) == false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0446, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0449, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x044a, code lost:
        if (r5 == null) goto L_0x046e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x044c, code lost:
        r3 = r5.f24597b;
        r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r3.f21809i, 2);
        r9.mo15607I(r5);
        r9.mo15630ae(com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r5));
        r9.mo15635aj(r3.f21817q);
        r9.mo15615Q(r3.f21818r);
        r9.mo15614P(r3.f21819s);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x046e, code lost:
        if (r11 != null) goto L_0x0471;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0471, code lost:
        r9.mo15622X(r12);
        r13 = r38;
        r13.add(new com.google.ads.interactivemedia.p367v3.internal.C7476zp(r11, r9.mo15625a(), r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0482, code lost:
        r5 = r88;
        r38 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0487, code lost:
        r13 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048f, code lost:
        if (r3.equals("AUDIO") == false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0491, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0496, code lost:
        if (r3 >= r15.size()) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0498, code lost:
        r14 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r15.get(r3);
        r38 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04a6, code lost:
        if (r6.equals(r14.f24599d) == false) goto L_0x04a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04a9, code lost:
        r3 = r3 + 1;
        r13 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04ae, code lost:
        r38 = r13;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04b1, code lost:
        if (r14 == null) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b3, code lost:
        r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r14.f24597b.f21809i, 1);
        r9.mo15607I(r3);
        r3 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04c4, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04c5, code lost:
        r5 = m22713h(r5, f24665g, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04cb, code lost:
        if (r5 == null) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04cd, code lost:
        r9.mo15606H(java.lang.Integer.parseInt(com.google.ads.interactivemedia.p367v3.internal.aeu.m18483A(r5, "/")[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04e3, code lost:
        if ("audio/eac3".equals(r3) == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04eb, code lost:
        if (r5.endsWith("/JOC") == false) goto L_0x04ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04ed, code lost:
        r3 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04ef, code lost:
        r9.mo15630ae(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x04f2, code lost:
        if (r11 == null) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x04f4, code lost:
        r9.mo15622X(r12);
        r13 = r37;
        r13.add(new com.google.ads.interactivemedia.p367v3.internal.C7476zp(r11, r9.mo15625a(), r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0506, code lost:
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0508, code lost:
        if (r14 == null) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x050a, code lost:
        r23 = r9.mo15625a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x050e, code lost:
        r5 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0514, code lost:
        r38 = r13;
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0519, code lost:
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0521, code lost:
        if (r3.equals("CLOSED-CAPTIONS") == false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r3 = m22712g(r5, f24652J, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x052f, code lost:
        if (r3.startsWith("CC") == false) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0531, code lost:
        r5 = "application/cea-608";
        r3 = java.lang.Integer.parseInt(r3.substring(2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x053e, code lost:
        r5 = "application/cea-708";
        r3 = java.lang.Integer.parseInt(r3.substring(7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054a, code lost:
        if (r10 != null) goto L_0x0551;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x054c, code lost:
        r10 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0551, code lost:
        r9.mo15630ae(r5);
        r9.mo15604F(r3);
        r10.add(r9.mo15625a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x055f, code lost:
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x056a, code lost:
        if (r3.equals("SUBTITLES") == false) goto L_0x05b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x056c, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0571, code lost:
        if (r3 >= r15.size()) goto L_0x0586;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0573, code lost:
        r5 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r15.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x057f, code lost:
        if (r6.equals(r5.f24600e) == false) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0582, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0586, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0587, code lost:
        if (r5 == null) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0589, code lost:
        r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r5.f24597b.f21809i, 3);
        r9.mo15607I(r3);
        r3 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x059a, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x059d, code lost:
        if (r3 != null) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x059f, code lost:
        r3 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05a0, code lost:
        r9.mo15630ae(r3);
        r9.mo15622X(r12);
        r5 = r88;
        r5.add(new com.google.ads.interactivemedia.p367v3.internal.C7476zp(r11, r9.mo15625a(), r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05b5, code lost:
        r5 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05b7, code lost:
        r1 = r1 + 1;
        r88 = r5;
        r37 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05bf, code lost:
        r5 = r88;
        r13 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x05c3, code lost:
        if (r20 == false) goto L_0x05cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05c5, code lost:
        r24 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05cc, code lost:
        r24 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05ce, code lost:
        r15 = new com.google.ads.interactivemedia.p367v3.internal.C7478zr(r4, r26, r2, r38, r13, r5, r22, r23, r24, r25, r8, r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05e4, code lost:
        com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05e9, code lost:
        r27 = r2;
        r28 = r3;
        r23 = r10;
        r21 = r11;
        r24 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05f9, code lost:
        r3 = "#EXT-X-ENDLIST";
        r6 = "#EXT-X-DISCONTINUITY-SEQUENCE";
        r7 = "#EXT-X-DISCONTINUITY";
        r8 = "#EXT-X-BYTERANGE";
        r9 = "#EXT-X-KEY";
        r10 = "#EXTINF";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0607, code lost:
        if (r5.startsWith(r1) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x060d, code lost:
        if (r5.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0613, code lost:
        if (r5.startsWith(r10) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0619, code lost:
        if (r5.startsWith(r9) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x061f, code lost:
        if (r5.startsWith(r8) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0625, code lost:
        if (r5.equals(r7) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x062b, code lost:
        if (r5.equals(r6) != false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0631, code lost:
        if (r5.equals(r3) == false) goto L_0x0634;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0634, code lost:
        r4.add(r5);
        r2 = r27;
        r3 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0640, code lost:
        r4.add(r5);
        r5 = r87.f24685Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0649, code lost:
        r13 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        r12 = new com.google.ads.interactivemedia.p367v3.internal.C7482zv(r4, r13);
        r32 = r88.toString();
        r4 = r5.f24639r;
        r14 = new java.util.HashMap();
        r15 = new java.util.HashMap();
        r2 = new java.util.ArrayList();
        r16 = r4;
        r4 = new java.util.ArrayList();
        r20 = new com.google.ads.interactivemedia.p367v3.internal.ary();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x066f, code lost:
        r28 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        r13 = new java.util.TreeMap();
        r88 = r2;
        r68 = r16;
        r70 = r20;
        r56 = -9223372036854775807L;
        r64 = -9223372036854775807L;
        r66 = -9223372036854775807L;
        r54 = -1;
        r43 = 0;
        r45 = 0;
        r58 = 0;
        r61 = 0;
        r71 = 0;
        r73 = 0;
        r2 = null;
        r16 = null;
        r20 = null;
        r22 = null;
        r25 = null;
        r26 = 0;
        r27 = false;
        r50 = null;
        r51 = 0;
        r52 = false;
        r53 = false;
        r60 = 0;
        r63 = 1;
        r69 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06b8, code lost:
        if (r12.mo16890a() == false) goto L_0x0b14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06ba, code lost:
        r89 = r15;
        r15 = r12.mo16891b();
        r75 = r12;
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06c8, code lost:
        if (r15.startsWith(r12) == false) goto L_0x06cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06ca, code lost:
        r4.add(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06cd, code lost:
        r21 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06d5, code lost:
        if (r15.startsWith("#EXT-X-PLAYLIST-TYPE") == false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06d7, code lost:
        r12 = m22712g(r15, f24672n, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06e3, code lost:
        if ("VOD".equals(r12) == false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06e5, code lost:
        r15 = r89;
        r12 = r75;
        r51 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06ec, code lost:
        r15 = r89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06f4, code lost:
        if ("EVENT".equals(r12) == false) goto L_0x06fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x06f6, code lost:
        r12 = r75;
        r51 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x06fb, code lost:
        r12 = r3;
        r76 = r4;
        r18 = r6;
        r83 = r7;
        r84 = r8;
        r85 = r9;
        r86 = r10;
        r77 = r23;
        r82 = r24;
        r23 = r1;
        r24 = r5;
        r1 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x071b, code lost:
        if (r15.equals("#EXT-X-I-FRAMES-ONLY") == false) goto L_0x0724;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x071d, code lost:
        r15 = r89;
        r12 = r75;
        r27 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x072f, code lost:
        if (r15.startsWith("#EXT-X-START") == false) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0731, code lost:
        r37 = m22711f(r15, f24681w);
        r12 = r3;
        r76 = r4;
        r15 = r89;
        r56 = (long) (r37 * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0741, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0742, code lost:
        r12 = r75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0744, code lost:
        r4 = r76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0748, code lost:
        r12 = r3;
        r76 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0751, code lost:
        if (r15.startsWith("#EXT-X-SERVER-CONTROL") == false) goto L_0x0773;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0753, code lost:
        m22718m(r15, f24673o);
        m22717l(r15, f24674p);
        m22718m(r15, f24675q);
        m22718m(r15, f24676r);
        m22717l(r15, f24677s);
        r70 = new com.google.ads.interactivemedia.p367v3.internal.ary();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0779, code lost:
        if (r15.startsWith("#EXT-X-PART-INF") == false) goto L_0x0789;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x077b, code lost:
        r15 = r89;
        r66 = (long) (m22711f(r15, f24670l) * 1000000.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x078f, code lost:
        if (r15.startsWith("#EXT-X-MAP") == false) goto L_0x07e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (com.google.ads.interactivemedia.p367v3.internal.aeu.m18484B(m22707b(r3, false, r5)) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0791, code lost:
        r36 = m22712g(r15, f24645C, r14);
        r3 = m22713h(r15, f24683y, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x079d, code lost:
        if (r3 == null) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x079f, code lost:
        r3 = r3.split("@");
        r37 = java.lang.Long.parseLong(r3[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07ae, code lost:
        if (r3.length <= 1) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07b0, code lost:
        r39 = r37;
        r37 = java.lang.Long.parseLong(r3[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x07bb, code lost:
        r39 = r37;
        r37 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07c0, code lost:
        r37 = r43;
        r39 = r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x07c4, code lost:
        if (r16 == null) goto L_0x07d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07c6, code lost:
        if (r20 == null) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        r5 = r3.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x07d0, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07d1, code lost:
        r35 = new com.google.ads.interactivemedia.p367v3.internal.C7479zs(r36, r37, r39, r16, r20);
        r15 = r89;
        r3 = r12;
        r54 = -1;
        r43 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07e9, code lost:
        if (r15.startsWith(r1) == false) goto L_0x07fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07eb, code lost:
        r64 = ((long) m22710e(r15, f24669k)) * 1000000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x07f7, code lost:
        r15 = r89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07ff, code lost:
        if (r15.startsWith("#EXT-X-MEDIA-SEQUENCE") == false) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0801, code lost:
        r45 = java.lang.Long.parseLong(m22712g(r15, f24678t, java.util.Collections.emptyMap()));
        r15 = r89;
        r3 = r12;
        r61 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r5 == null) goto L_0x0b57;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x081c, code lost:
        if (r15.startsWith("#EXT-X-VERSION") == false) goto L_0x0825;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x081e, code lost:
        r63 = m22710e(r15, f24671m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0825, code lost:
        r3 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x082b, code lost:
        if (r15.startsWith(r3) == false) goto L_0x0880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x082d, code lost:
        r4 = m22713h(r15, f24657O, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0833, code lost:
        if (r4 == null) goto L_0x085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0835, code lost:
        r15 = (java.lang.String) r5.f24609h.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x083d, code lost:
        if (r15 == null) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x083f, code lost:
        r14.put(r4, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r5 = r5.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0842, code lost:
        r15 = r89;
        r23 = r1;
        r77 = r3;
        r18 = r6;
        r83 = r7;
        r84 = r8;
        r85 = r9;
        r86 = r10;
        r82 = r24;
        r1 = r88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0857, code lost:
        r24 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x085b, code lost:
        r23 = r1;
        r14.put(m22712g(r15, f24649G, r14), m22712g(r15, f24656N, r14));
        r1 = r88;
        r15 = r89;
        r77 = r3;
        r18 = r6;
        r83 = r7;
        r84 = r8;
        r85 = r9;
        r86 = r10;
        r82 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0880, code lost:
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0886, code lost:
        if (r15.startsWith(r10) == false) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0888, code lost:
        r77 = r3;
        m22714i(r15, f24680v, com.evernote.android.state.BuildConfig.FLAVOR, r14);
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r73 = (long) (m22711f(r15, f24679u) * 1000000.0d);
        r12 = r75;
        r4 = r76;
        r23 = r77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x08ac, code lost:
        r77 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x08b2, code lost:
        if (r15.startsWith(r9) == false) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x08b4, code lost:
        r1 = m22712g(r15, f24684z, r14);
        r4 = r24;
        r3 = m22714i(r15, f24643A, r4, r14);
        r24 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x08ca, code lost:
        if ("NONE".equals(r1) == false) goto L_0x08d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r5.isEmpty() != false) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x08cc, code lost:
        r13.clear();
        r16 = null;
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x08d3, code lost:
        r22 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x08d7, code lost:
        r5 = m22713h(r15, f24646D, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x08e1, code lost:
        if (r4.equals(r3) == false) goto L_0x08fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x08e9, code lost:
        if ("AES-128".equals(r1) == false) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x08eb, code lost:
        r16 = m22712g(r15, f24645C, r14);
        r20 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08f7, code lost:
        r20 = r5;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x08fd, code lost:
        if (r2 != null) goto L_0x0903;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08ff, code lost:
        r2 = m22709d(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0903, code lost:
        r1 = m22708c(r15, r3, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0907, code lost:
        if (r1 == null) goto L_0x08f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0909, code lost:
        r13.put(r3, r1);
        r20 = r5;
        r16 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0911, code lost:
        r4 = r24;
        r24 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0919, code lost:
        if (r15.startsWith(r8) == false) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x091b, code lost:
        r1 = m22712g(r15, f24682x, r14).split("@");
        r54 = java.lang.Long.parseLong(r1[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0930, code lost:
        if (r1.length <= 1) goto L_0x0965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0932, code lost:
        r43 = java.lang.Long.parseLong(r1[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x093d, code lost:
        if (r15.startsWith(r6) == false) goto L_0x095d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        r10 = "#EXT-X-DEFINE";
        r11 = "#EXT";
        r12 = "identity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x093f, code lost:
        r60 = java.lang.Integer.parseInt(r15.substring(r15.indexOf(58) + 1));
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r23 = r77;
        r52 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0961, code lost:
        if (r15.equals(r7) == false) goto L_0x0974;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0963, code lost:
        r26 = r26 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0965, code lost:
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r23 = r77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0970, code lost:
        r24 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x097a, code lost:
        if (r15.startsWith("#EXT-X-PROGRAM-DATE-TIME") == false) goto L_0x09aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x097e, code lost:
        if (r58 != 0) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r5.startsWith(r2) == false) goto L_0x05e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0980, code lost:
        r58 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(com.google.ads.interactivemedia.p367v3.internal.aeu.m18495M(r15.substring(r15.indexOf(58) + 1))) - r71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0997, code lost:
        r1 = r88;
        r15 = r89;
        r82 = r4;
        r18 = r6;
        r83 = r7;
        r84 = r8;
        r85 = r9;
        r86 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x09b1, code lost:
        if (r15.equals("#EXT-X-GAP") == false) goto L_0x09c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x09b3, code lost:
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r23 = r77;
        r53 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x09c7, code lost:
        if (r15.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L_0x09d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x09c9, code lost:
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r23 = r77;
        r68 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x09db, code lost:
        if (r15.equals(r12) == false) goto L_0x09eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x09dd, code lost:
        r15 = r89;
        r3 = r12;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r23 = r77;
        r69 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x09f1, code lost:
        if (r15.startsWith("#") != false) goto L_0x0997;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x09f3, code lost:
        if (r16 != null) goto L_0x09f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x09f5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x09f7, code lost:
        if (r20 == null) goto L_0x09fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x09f9, code lost:
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x09fc, code lost:
        r1 = java.lang.Long.toHexString(r45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0a00, code lost:
        r78 = r45 + 1;
        r5 = m22715j(r15, r14);
        r15 = r89;
        r19 = (com.google.ads.interactivemedia.p367v3.internal.C7479zs) r15.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0a12, code lost:
        if (r54 != -1) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4.add(r5);
        r1 = new com.google.ads.interactivemedia.p367v3.internal.C7482zv(r4, r3);
        r4 = r88.toString();
        r5 = new java.util.HashMap();
        r8 = new java.util.HashMap();
        r15 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r14 = new java.util.ArrayList();
        r22 = new java.util.ArrayList();
        r7 = new java.util.ArrayList();
        r6 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0a14, code lost:
        r80 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0a17, code lost:
        if (r27 == false) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0a19, code lost:
        if (r25 != null) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0a1b, code lost:
        if (r19 != null) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0a1d, code lost:
        r35 = new com.google.ads.interactivemedia.p367v3.internal.C7479zs(r5, 0, r43, (java.lang.String) null, (java.lang.String) null);
        r15.put(r5, r35);
        r19 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0a33, code lost:
        r80 = r43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0a35, code lost:
        if (r22 != null) goto L_0x0a9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0a3b, code lost:
        if (r13.isEmpty() != false) goto L_0x0a9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0a3d, code lost:
        r82 = r4;
        r18 = r6;
        r3 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r13.values().toArray(new com.google.ads.interactivemedia.p367v3.internal.C7030jb[0]);
        r6 = new com.google.ads.interactivemedia.p367v3.internal.C7031jc(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b4, code lost:
        r28 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0a53, code lost:
        if (r50 != null) goto L_0x0a90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0a55, code lost:
        r4 = new com.google.ads.interactivemedia.p367v3.internal.C7030jb[r3.length];
        r22 = r6;
        r83 = r7;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0a5e, code lost:
        if (r6 >= r3.length) goto L_0x0a83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0a60, code lost:
        r7 = r3[r6];
        r4[r6] = new com.google.ads.interactivemedia.p367v3.internal.C7030jb(r7.f22530a, r7.f22531b, r7.f22532c, (byte[]) null);
        r6 = r6 + 1;
        r3 = r3;
        r8 = r8;
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0a83, code lost:
        r84 = r8;
        r85 = r9;
        r86 = r10;
        r3 = new com.google.ads.interactivemedia.p367v3.internal.C7031jc(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0a90, code lost:
        r22 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0a92, code lost:
        r83 = r7;
        r84 = r8;
        r85 = r9;
        r86 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0a9c, code lost:
        r82 = r4;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0aa1, code lost:
        r3 = r50;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0aa5, code lost:
        if (r25 == null) goto L_0x0aaa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0aa7, code lost:
        r37 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0aaa, code lost:
        r37 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0aac, code lost:
        r1 = r88;
        r1.add(new com.google.ads.interactivemedia.p367v3.internal.C7479zs(r5, r37, r73, r26, r71, r22, r16, r1, r80, r54, r53));
        r71 = r71 + r73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0ace, code lost:
        if (r54 == -1) goto L_0x0ad2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0ad0, code lost:
        r80 = r80 + r54;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0ad2, code lost:
        r43 = r80;
        r88 = r1;
        r50 = r3;
        r3 = r12;
        r6 = r18;
        r1 = r23;
        r5 = r24;
        r54 = -1;
        r73 = 0;
        r12 = r75;
        r4 = r76;
        r23 = r77;
        r45 = r78;
        r24 = r82;
        r7 = r83;
        r8 = r84;
        r9 = r85;
        r10 = r86;
        r53 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0af9, code lost:
        r88 = r1;
        r3 = r12;
        r6 = r18;
        r1 = r23;
        r5 = r24;
        r12 = r75;
        r4 = r76;
        r23 = r77;
        r24 = r82;
        r7 = r83;
        r8 = r84;
        r9 = r85;
        r10 = r86;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0b14, code lost:
        r1 = r88;
        r76 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3 = new java.util.ArrayList();
        r20 = false;
        r25 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0b1c, code lost:
        if (r58 == 0) goto L_0x0b21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0b1e, code lost:
        r49 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0b21, code lost:
        r49 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0b23, code lost:
        r30 = new com.google.ads.interactivemedia.p367v3.internal.C7480zt(r51, r32, r76, r56, r58, r52, r60, r61, r63, r64, r66, r68, r69, r49, r50, r1, r70, (byte[]) null, (byte[]) null, (byte[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0b4a, code lost:
        com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0b4f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0b50, code lost:
        r28 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0b53, code lost:
        r23 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0b57, code lost:
        com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x0b63, code lost:
        throw new com.google.ads.interactivemedia.p367v3.internal.C6886dt("Failed to parse the playlist, could not identify any tags.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0b6c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r1.mo16890a() == false) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r88 = r14;
        r14 = r1.mo16891b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00cf, code lost:
        if (r14.startsWith(r11) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d1, code lost:
        r3.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d4, code lost:
        r21 = r11;
        r11 = r14.startsWith("#EXT-X-I-FRAME-STREAM-INF");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:?, code lost:
        return r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        if (r14.startsWith(r10) == false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        r23 = r10;
        r8.put(m22712g(r14, f24649G, r8), m22712g(r14, f24656N, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f3, code lost:
        r26 = r3;
        r24 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f9, code lost:
        r23 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0101, code lost:
        if (r14.equals("#EXT-X-INDEPENDENT-SEGMENTS") == false) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0103, code lost:
        r43 = r1;
        r27 = r2;
        r26 = r3;
        r1 = r5;
        r36 = r6;
        r39 = r7;
        r38 = r9;
        r24 = r12;
        r37 = r13;
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011e, code lost:
        if (r14.startsWith("#EXT-X-MEDIA") == false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0120, code lost:
        r7.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r14.startsWith("#EXT-X-SESSION-KEY") == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012c, code lost:
        r10 = m22708c(r14, m22714i(r14, f24643A, r12, r8), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0136, code lost:
        if (r10 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0138, code lost:
        r26 = r3;
        r24 = r12;
        r6.add(new com.google.ads.interactivemedia.p367v3.internal.C7031jc(m22709d(m22712g(r14, f24684z, r8)), r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0155, code lost:
        r26 = r3;
        r24 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015d, code lost:
        if (r14.startsWith(r2) != false) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015f, code lost:
        if (r11 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0161, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        r43 = r1;
        r27 = r2;
        r1 = r5;
        r36 = r6;
        r39 = r7;
        r38 = r9;
        r37 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0172, code lost:
        r3 = r20 | r14.contains("CLOSED-CAPTIONS=NONE");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017b, code lost:
        if (true == r11) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017f, code lost:
        r10 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0181, code lost:
        r12 = m22710e(r14, f24664f);
        r27 = r2;
        r2 = f24659a.matcher(r14);
        r29 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0195, code lost:
        if (r2.find() == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0197, code lost:
        r20 = r3;
        r2 = r2.group(1);
        com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2);
        r2 = java.lang.Integer.parseInt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a6, code lost:
        r20 = r3;
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a9, code lost:
        r3 = m22713h(r14, f24666h, r8);
        r36 = r6;
        r6 = m22713h(r14, f24667i, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b7, code lost:
        if (r6 == null) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b9, code lost:
        r37 = r13;
        r6 = r6.split("x");
        r13 = java.lang.Integer.parseInt(r6[0]);
        r6 = java.lang.Integer.parseInt(r6[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01d0, code lost:
        if (r13 <= 0) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d2, code lost:
        if (r6 > 0) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d5, code lost:
        r29 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d8, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d9, code lost:
        r38 = r9;
        r6 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01de, code lost:
        r37 = r13;
        r38 = r9;
        r6 = -1;
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e4, code lost:
        r9 = m22713h(r14, f24668j, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ea, code lost:
        if (r9 == null) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ec, code lost:
        r9 = java.lang.Float.parseFloat(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f1, code lost:
        r9 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f3, code lost:
        r39 = r7;
        r7 = m22713h(r14, f24660b, r8);
        r40 = r5;
        r41 = m22713h(r14, f24661c, r8);
        r42 = m22713h(r14, f24662d, r8);
        r5 = m22713h(r14, f24663e, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        if (r11 == false) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0215, code lost:
        r11 = m22712g(r14, f24645C, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x021b, code lost:
        r11 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r4, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0224, code lost:
        if (r1.mo16890a() == false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0226, code lost:
        r11 = m22715j(r1.mo16891b(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022f, code lost:
        r14 = new com.google.ads.interactivemedia.p367v3.internal.C6863cx();
        r43 = r1;
        r14.mo15616R(r15.size());
        r14.mo15609K("application/x-mpegURL");
        r14.mo15607I(r3);
        r14.mo15605G(r2);
        r14.mo15624Z(r12);
        r14.mo15635aj(r13);
        r14.mo15615Q(r6);
        r14.mo15614P(r9);
        r14.mo15628ac(r10);
        r15.add(new com.google.ads.interactivemedia.p367v3.internal.C7477zq(r11, r14.mo15625a(), r7, r41, r42, r5));
        r1 = r40;
        r3 = (java.util.ArrayList) r1.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0277, code lost:
        if (r3 != null) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0279, code lost:
        r3 = new java.util.ArrayList();
        r1.put(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0281, code lost:
        r3.add(new com.google.ads.interactivemedia.p367v3.internal.C7466zf(r2, r12, r7, r41, r42, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0297, code lost:
        r14 = r88;
        r5 = r1;
        r11 = r21;
        r10 = r23;
        r12 = r24;
        r3 = r26;
        r2 = r27;
        r6 = r36;
        r13 = r37;
        r9 = r38;
        r7 = r39;
        r1 = r43;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo14477a(android.net.Uri r88, java.io.InputStream r89) {
        /*
            r87 = this;
            java.lang.String r1 = "#EXT-X-TARGETDURATION"
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r5 = r89
            r4.<init>(r5)
            r3.<init>(r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            int r5 = r3.read()     // Catch:{ all -> 0x0b6e }
            r6 = 239(0xef, float:3.35E-43)
            if (r5 != r6) goto L_0x003c
            int r5 = r3.read()     // Catch:{ all -> 0x0036 }
            r6 = 187(0xbb, float:2.62E-43)
            if (r5 != r6) goto L_0x0032
            int r5 = r3.read()     // Catch:{ all -> 0x0036 }
            r6 = 191(0xbf, float:2.68E-43)
            if (r5 != r6) goto L_0x0032
            int r5 = r3.read()     // Catch:{ all -> 0x0036 }
            goto L_0x003c
        L_0x0032:
            r28 = r3
            goto L_0x0b64
        L_0x0036:
            r0 = move-exception
            r1 = r0
            r28 = r3
            goto L_0x0b72
        L_0x003c:
            r6 = 1
            int r5 = m22707b(r3, r6, r5)     // Catch:{ all -> 0x0b6e }
            r7 = 0
            r8 = 0
        L_0x0043:
            r9 = 7
            if (r8 >= r9) goto L_0x0055
            java.lang.String r9 = "#EXTM3U"
            char r9 = r9.charAt(r8)     // Catch:{ all -> 0x0036 }
            if (r5 != r9) goto L_0x0032
            int r5 = r3.read()     // Catch:{ all -> 0x0036 }
            int r8 = r8 + 1
            goto L_0x0043
        L_0x0055:
            int r5 = m22707b(r3, r7, r5)     // Catch:{ all -> 0x0b6e }
            boolean r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18484B(r5)     // Catch:{ all -> 0x0b6e }
            if (r5 == 0) goto L_0x0032
        L_0x005f:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x0b6e }
            if (r5 == 0) goto L_0x0b57
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0b6e }
            boolean r8 = r5.isEmpty()     // Catch:{ all -> 0x0b6e }
            if (r8 != 0) goto L_0x0b53
            boolean r8 = r5.startsWith(r2)     // Catch:{ all -> 0x0b6e }
            java.lang.String r10 = "#EXT-X-DEFINE"
            java.lang.String r11 = "#EXT"
            java.lang.String r12 = "identity"
            if (r8 == 0) goto L_0x05e9
            r4.add(r5)     // Catch:{ all -> 0x0036 }
            com.google.ads.interactivemedia.v3.internal.zv r1 = new com.google.ads.interactivemedia.v3.internal.zv     // Catch:{ all -> 0x0036 }
            r1.<init>(r4, r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r4 = r88.toString()     // Catch:{ all -> 0x0036 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0036 }
            r5.<init>()     // Catch:{ all -> 0x0036 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0036 }
            r8.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r15.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r9.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r13.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r14.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r22 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r22.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r7.<init>()     // Catch:{ all -> 0x0036 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0036 }
            r6.<init>()     // Catch:{ all -> 0x0036 }
            r28 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0b6c }
            r3.<init>()     // Catch:{ all -> 0x0b6c }
            r20 = 0
            r25 = 0
        L_0x00bf:
            boolean r21 = r1.mo16890a()     // Catch:{ all -> 0x0b6c }
            if (r21 == 0) goto L_0x02b8
            r88 = r14
            java.lang.String r14 = r1.mo16891b()     // Catch:{ all -> 0x0b6c }
            boolean r21 = r14.startsWith(r11)     // Catch:{ all -> 0x0b6c }
            if (r21 == 0) goto L_0x00d4
            r3.add(r14)     // Catch:{ all -> 0x0b6c }
        L_0x00d4:
            r21 = r11
            java.lang.String r11 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r11 = r14.startsWith(r11)     // Catch:{ all -> 0x0b6c }
            boolean r23 = r14.startsWith(r10)     // Catch:{ all -> 0x0b6c }
            if (r23 == 0) goto L_0x00f9
            java.util.regex.Pattern r11 = f24649G     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22712g(r14, r11, r8)     // Catch:{ all -> 0x0b6c }
            r23 = r10
            java.util.regex.Pattern r10 = f24656N     // Catch:{ all -> 0x0b6c }
            java.lang.String r10 = m22712g(r14, r10, r8)     // Catch:{ all -> 0x0b6c }
            r8.put(r11, r10)     // Catch:{ all -> 0x0b6c }
        L_0x00f3:
            r26 = r3
            r24 = r12
            goto L_0x0163
        L_0x00f9:
            r23 = r10
            java.lang.String r10 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r10 = r14.equals(r10)     // Catch:{ all -> 0x0b6c }
            if (r10 == 0) goto L_0x0118
            r43 = r1
            r27 = r2
            r26 = r3
            r1 = r5
            r36 = r6
            r39 = r7
            r38 = r9
            r24 = r12
            r37 = r13
            r25 = 1
            goto L_0x0297
        L_0x0118:
            java.lang.String r10 = "#EXT-X-MEDIA"
            boolean r10 = r14.startsWith(r10)     // Catch:{ all -> 0x0b6c }
            if (r10 == 0) goto L_0x0124
            r7.add(r14)     // Catch:{ all -> 0x0b6c }
            goto L_0x00f3
        L_0x0124:
            java.lang.String r10 = "#EXT-X-SESSION-KEY"
            boolean r10 = r14.startsWith(r10)     // Catch:{ all -> 0x0b6c }
            if (r10 == 0) goto L_0x0155
            java.util.regex.Pattern r10 = f24643A     // Catch:{ all -> 0x0b6c }
            java.lang.String r10 = m22714i(r14, r10, r12, r8)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.jb r10 = m22708c(r14, r10, r8)     // Catch:{ all -> 0x0b6c }
            if (r10 == 0) goto L_0x00f3
            java.util.regex.Pattern r11 = f24684z     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22712g(r14, r11, r8)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22709d(r11)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.jc r14 = new com.google.ads.interactivemedia.v3.internal.jc     // Catch:{ all -> 0x0b6c }
            r26 = r3
            r24 = r12
            r12 = 1
            com.google.ads.interactivemedia.v3.internal.jb[] r3 = new com.google.ads.interactivemedia.p367v3.internal.C7030jb[r12]     // Catch:{ all -> 0x0b6c }
            r12 = 0
            r3[r12] = r10     // Catch:{ all -> 0x0b6c }
            r14.<init>((java.lang.String) r11, (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r3)     // Catch:{ all -> 0x0b6c }
            r6.add(r14)     // Catch:{ all -> 0x0b6c }
            goto L_0x0163
        L_0x0155:
            r26 = r3
            r24 = r12
            boolean r3 = r14.startsWith(r2)     // Catch:{ all -> 0x0b6c }
            if (r3 != 0) goto L_0x0172
            if (r11 == 0) goto L_0x0163
            r11 = 1
            goto L_0x0172
        L_0x0163:
            r43 = r1
            r27 = r2
            r1 = r5
            r36 = r6
            r39 = r7
            r38 = r9
            r37 = r13
            goto L_0x0297
        L_0x0172:
            java.lang.String r3 = "CLOSED-CAPTIONS=NONE"
            boolean r3 = r14.contains(r3)     // Catch:{ all -> 0x0b6c }
            r3 = r20 | r3
            r10 = 1
            if (r10 == r11) goto L_0x017f
            r10 = 0
            goto L_0x0181
        L_0x017f:
            r10 = 16384(0x4000, float:2.2959E-41)
        L_0x0181:
            java.util.regex.Pattern r12 = f24664f     // Catch:{ all -> 0x0b6c }
            int r12 = m22710e(r14, r12)     // Catch:{ all -> 0x0b6c }
            r27 = r2
            java.util.regex.Pattern r2 = f24659a     // Catch:{ all -> 0x0b6c }
            java.util.regex.Matcher r2 = r2.matcher(r14)     // Catch:{ all -> 0x0b6c }
            boolean r20 = r2.find()     // Catch:{ all -> 0x0b6c }
            r29 = -1
            if (r20 == 0) goto L_0x01a6
            r20 = r3
            r3 = 1
            java.lang.String r2 = r2.group(r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r2)     // Catch:{ all -> 0x0b6c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ all -> 0x0b6c }
            goto L_0x01a9
        L_0x01a6:
            r20 = r3
            r2 = -1
        L_0x01a9:
            java.util.regex.Pattern r3 = f24666h     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = m22713h(r14, r3, r8)     // Catch:{ all -> 0x0b6c }
            r36 = r6
            java.util.regex.Pattern r6 = f24667i     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = m22713h(r14, r6, r8)     // Catch:{ all -> 0x0b6c }
            if (r6 == 0) goto L_0x01de
            r37 = r13
            java.lang.String r13 = "x"
            java.lang.String[] r6 = r6.split(r13)     // Catch:{ all -> 0x0b6c }
            r13 = 0
            r30 = r6[r13]     // Catch:{ all -> 0x0b6c }
            int r13 = java.lang.Integer.parseInt(r30)     // Catch:{ all -> 0x0b6c }
            r19 = 1
            r6 = r6[r19]     // Catch:{ all -> 0x0b6c }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0b6c }
            if (r13 <= 0) goto L_0x01d8
            if (r6 > 0) goto L_0x01d5
            goto L_0x01d8
        L_0x01d5:
            r29 = r6
            goto L_0x01d9
        L_0x01d8:
            r13 = -1
        L_0x01d9:
            r38 = r9
            r6 = r29
            goto L_0x01e4
        L_0x01de:
            r37 = r13
            r38 = r9
            r6 = -1
            r13 = -1
        L_0x01e4:
            java.util.regex.Pattern r9 = f24668j     // Catch:{ all -> 0x0b6c }
            java.lang.String r9 = m22713h(r14, r9, r8)     // Catch:{ all -> 0x0b6c }
            if (r9 == 0) goto L_0x01f1
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ all -> 0x0b6c }
            goto L_0x01f3
        L_0x01f1:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x01f3:
            r39 = r7
            java.util.regex.Pattern r7 = f24660b     // Catch:{ all -> 0x0b6c }
            java.lang.String r7 = m22713h(r14, r7, r8)     // Catch:{ all -> 0x0b6c }
            r40 = r5
            java.util.regex.Pattern r5 = f24661c     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = m22713h(r14, r5, r8)     // Catch:{ all -> 0x0b6c }
            r41 = r5
            java.util.regex.Pattern r5 = f24662d     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = m22713h(r14, r5, r8)     // Catch:{ all -> 0x0b6c }
            r42 = r5
            java.util.regex.Pattern r5 = f24663e     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = m22713h(r14, r5, r8)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0220
            java.util.regex.Pattern r11 = f24645C     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22712g(r14, r11, r8)     // Catch:{ all -> 0x0b6c }
        L_0x021b:
            android.net.Uri r11 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r4, r11)     // Catch:{ all -> 0x0b6c }
            goto L_0x022f
        L_0x0220:
            boolean r11 = r1.mo16890a()     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x02b0
            java.lang.String r11 = r1.mo16891b()     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22715j(r11, r8)     // Catch:{ all -> 0x0b6c }
            goto L_0x021b
        L_0x022f:
            com.google.ads.interactivemedia.v3.internal.cx r14 = new com.google.ads.interactivemedia.v3.internal.cx     // Catch:{ all -> 0x0b6c }
            r14.<init>()     // Catch:{ all -> 0x0b6c }
            r43 = r1
            int r1 = r15.size()     // Catch:{ all -> 0x0b6c }
            r14.mo15616R(r1)     // Catch:{ all -> 0x0b6c }
            java.lang.String r1 = "application/x-mpegURL"
            r14.mo15609K(r1)     // Catch:{ all -> 0x0b6c }
            r14.mo15607I(r3)     // Catch:{ all -> 0x0b6c }
            r14.mo15605G(r2)     // Catch:{ all -> 0x0b6c }
            r14.mo15624Z(r12)     // Catch:{ all -> 0x0b6c }
            r14.mo15635aj(r13)     // Catch:{ all -> 0x0b6c }
            r14.mo15615Q(r6)     // Catch:{ all -> 0x0b6c }
            r14.mo15614P(r9)     // Catch:{ all -> 0x0b6c }
            r14.mo15628ac(r10)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r31 = r14.mo15625a()     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r1 = new com.google.ads.interactivemedia.v3.internal.zq     // Catch:{ all -> 0x0b6c }
            r29 = r1
            r30 = r11
            r32 = r7
            r33 = r41
            r34 = r42
            r35 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0b6c }
            r15.add(r1)     // Catch:{ all -> 0x0b6c }
            r1 = r40
            java.lang.Object r3 = r1.get(r11)     // Catch:{ all -> 0x0b6c }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0b6c }
            if (r3 != 0) goto L_0x0281
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0b6c }
            r3.<init>()     // Catch:{ all -> 0x0b6c }
            r1.put(r11, r3)     // Catch:{ all -> 0x0b6c }
        L_0x0281:
            com.google.ads.interactivemedia.v3.internal.zf r6 = new com.google.ads.interactivemedia.v3.internal.zf     // Catch:{ all -> 0x0b6c }
            r29 = r6
            r30 = r2
            r31 = r12
            r32 = r7
            r33 = r41
            r34 = r42
            r35 = r5
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0b6c }
            r3.add(r6)     // Catch:{ all -> 0x0b6c }
        L_0x0297:
            r14 = r88
            r5 = r1
            r11 = r21
            r10 = r23
            r12 = r24
            r3 = r26
            r2 = r27
            r6 = r36
            r13 = r37
            r9 = r38
            r7 = r39
            r1 = r43
            goto L_0x00bf
        L_0x02b0:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ all -> 0x0b6c }
            java.lang.String r2 = "#EXT-X-STREAM-INF must be followed by another line"
            r1.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0b6c }
            throw r1     // Catch:{ all -> 0x0b6c }
        L_0x02b8:
            r26 = r3
            r1 = r5
            r36 = r6
            r39 = r7
            r38 = r9
            r37 = r13
            r88 = r14
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0b6c }
            r2.<init>()     // Catch:{ all -> 0x0b6c }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0b6c }
            r3.<init>()     // Catch:{ all -> 0x0b6c }
            r5 = 0
        L_0x02d0:
            int r6 = r15.size()     // Catch:{ all -> 0x0b6c }
            if (r5 >= r6) goto L_0x033a
            java.lang.Object r6 = r15.get(r5)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r6 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r6     // Catch:{ all -> 0x0b6c }
            android.net.Uri r7 = r6.f24596a     // Catch:{ all -> 0x0b6c }
            boolean r7 = r3.add(r7)     // Catch:{ all -> 0x0b6c }
            if (r7 == 0) goto L_0x0337
            com.google.ads.interactivemedia.v3.internal.cy r7 = r6.f24597b     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.qz r7 = r7.f21810j     // Catch:{ all -> 0x0b6c }
            if (r7 != 0) goto L_0x02ec
            r7 = 1
            goto L_0x02ed
        L_0x02ec:
            r7 = 0
        L_0x02ed:
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r7)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zg r7 = new com.google.ads.interactivemedia.v3.internal.zg     // Catch:{ all -> 0x0b6c }
            android.net.Uri r9 = r6.f24596a     // Catch:{ all -> 0x0b6c }
            java.lang.Object r9 = r1.get(r9)     // Catch:{ all -> 0x0b6c }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)     // Catch:{ all -> 0x0b6c }
            r10 = 0
            r7.<init>(r10, r10, r9)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.qz r9 = new com.google.ads.interactivemedia.v3.internal.qz     // Catch:{ all -> 0x0b6c }
            r10 = 1
            com.google.ads.interactivemedia.v3.internal.qy[] r11 = new com.google.ads.interactivemedia.p367v3.internal.C7242qy[r10]     // Catch:{ all -> 0x0b6c }
            r10 = 0
            r11[r10] = r7     // Catch:{ all -> 0x0b6c }
            r9.<init>((com.google.ads.interactivemedia.p367v3.internal.C7242qy[]) r11)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r7 = r6.f24597b     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cx r7 = r7.mo15636a()     // Catch:{ all -> 0x0b6c }
            r7.mo15622X(r9)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r31 = r7.mo15625a()     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r7 = new com.google.ads.interactivemedia.v3.internal.zq     // Catch:{ all -> 0x0b6c }
            android.net.Uri r9 = r6.f24596a     // Catch:{ all -> 0x0b6c }
            java.lang.String r10 = r6.f24598c     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r6.f24599d     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = r6.f24600e     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = r6.f24601f     // Catch:{ all -> 0x0b6c }
            r29 = r7
            r30 = r9
            r32 = r10
            r33 = r11
            r34 = r12
            r35 = r6
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0b6c }
            r2.add(r7)     // Catch:{ all -> 0x0b6c }
        L_0x0337:
            int r5 = r5 + 1
            goto L_0x02d0
        L_0x033a:
            r1 = 0
            r10 = 0
            r23 = 0
        L_0x033e:
            int r3 = r39.size()     // Catch:{ all -> 0x0b6c }
            if (r1 >= r3) goto L_0x05bf
            r3 = r39
            java.lang.Object r5 = r3.get(r1)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r6 = f24650H     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = m22712g(r5, r6, r8)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r7 = f24649G     // Catch:{ all -> 0x0b6c }
            java.lang.String r7 = m22712g(r5, r7, r8)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cx r9 = new com.google.ads.interactivemedia.v3.internal.cx     // Catch:{ all -> 0x0b6c }
            r9.<init>()     // Catch:{ all -> 0x0b6c }
            int r11 = r6.length()     // Catch:{ all -> 0x0b6c }
            r12 = 1
            int r11 = r11 + r12
            int r12 = r7.length()     // Catch:{ all -> 0x0b6c }
            int r11 = r11 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b6c }
            r12.<init>(r11)     // Catch:{ all -> 0x0b6c }
            r12.append(r6)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = ":"
            r12.append(r11)     // Catch:{ all -> 0x0b6c }
            r12.append(r7)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0b6c }
            r9.mo15617S(r11)     // Catch:{ all -> 0x0b6c }
            r9.mo15619U(r7)     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = "application/x-mpegURL"
            r9.mo15609K(r11)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r11 = f24654L     // Catch:{ all -> 0x0b6c }
            boolean r11 = m22717l(r5, r11)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r12 = f24655M     // Catch:{ all -> 0x0b6c }
            boolean r12 = m22717l(r5, r12)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x0397
            r11 = r11 | 2
        L_0x0397:
            java.util.regex.Pattern r12 = f24653K     // Catch:{ all -> 0x0b6c }
            boolean r12 = m22717l(r5, r12)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x03a1
            r11 = r11 | 4
        L_0x03a1:
            r9.mo15632ag(r11)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r11 = f24651I     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22713h(r5, r11, r8)     // Catch:{ all -> 0x0b6c }
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x03b2
            r11 = 0
            goto L_0x03e5
        L_0x03b2:
            java.lang.String r12 = ","
            java.lang.String[] r11 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18556z(r11, r12)     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = "public.accessibility.describes-video"
            boolean r12 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, r12)     // Catch:{ all -> 0x0b6c }
            r13 = 1
            if (r13 == r12) goto L_0x03c3
            r12 = 0
            goto L_0x03c5
        L_0x03c3:
            r12 = 512(0x200, float:7.175E-43)
        L_0x03c5:
            java.lang.String r13 = "public.accessibility.transcribes-spoken-dialog"
            boolean r13 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, r13)     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x03cf
            r12 = r12 | 4096(0x1000, float:5.74E-42)
        L_0x03cf:
            java.lang.String r13 = "public.accessibility.describes-music-and-sound"
            boolean r13 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, r13)     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x03d9
            r12 = r12 | 1024(0x400, float:1.435E-42)
        L_0x03d9:
            java.lang.String r13 = "public.easy-to-read"
            boolean r11 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18534d(r11, r13)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x03e4
            r11 = r12 | 8192(0x2000, float:1.14794E-41)
            goto L_0x03e5
        L_0x03e4:
            r11 = r12
        L_0x03e5:
            r9.mo15628ac(r11)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r11 = f24648F     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22713h(r5, r11, r8)     // Catch:{ all -> 0x0b6c }
            r9.mo15620V(r11)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r11 = f24645C     // Catch:{ all -> 0x0b6c }
            java.lang.String r11 = m22713h(r5, r11, r8)     // Catch:{ all -> 0x0b6c }
            if (r11 != 0) goto L_0x03fb
            r11 = 0
            goto L_0x03ff
        L_0x03fb:
            android.net.Uri r11 = com.google.ads.interactivemedia.p367v3.internal.atv.m19617i(r4, r11)     // Catch:{ all -> 0x0b6c }
        L_0x03ff:
            com.google.ads.interactivemedia.v3.internal.qz r12 = new com.google.ads.interactivemedia.v3.internal.qz     // Catch:{ all -> 0x0b6c }
            r13 = 1
            com.google.ads.interactivemedia.v3.internal.qy[] r14 = new com.google.ads.interactivemedia.p367v3.internal.C7242qy[r13]     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zg r13 = new com.google.ads.interactivemedia.v3.internal.zg     // Catch:{ all -> 0x0b6c }
            r39 = r3
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0b6c }
            r13.<init>(r6, r7, r3)     // Catch:{ all -> 0x0b6c }
            r3 = 0
            r14[r3] = r13     // Catch:{ all -> 0x0b6c }
            r12.<init>((com.google.ads.interactivemedia.p367v3.internal.C7242qy[]) r14)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24647E     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = m22712g(r5, r3, r8)     // Catch:{ all -> 0x0b6c }
            int r13 = r3.hashCode()     // Catch:{ all -> 0x0b6c }
            switch(r13) {
                case -959297733: goto L_0x055f;
                case -333210994: goto L_0x0519;
                case 62628790: goto L_0x0487;
                case 81665115: goto L_0x0428;
                default: goto L_0x0422;
            }
        L_0x0422:
            r5 = r88
        L_0x0424:
            r13 = r37
            goto L_0x0510
        L_0x0428:
            java.lang.String r5 = "VIDEO"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0422
            r3 = 0
        L_0x0431:
            int r5 = r15.size()     // Catch:{ all -> 0x0b6c }
            if (r3 >= r5) goto L_0x0449
            java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r5 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r5     // Catch:{ all -> 0x0b6c }
            java.lang.String r13 = r5.f24598c     // Catch:{ all -> 0x0b6c }
            boolean r13 = r6.equals(r13)     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x0446
            goto L_0x044a
        L_0x0446:
            int r3 = r3 + 1
            goto L_0x0431
        L_0x0449:
            r5 = 0
        L_0x044a:
            if (r5 == 0) goto L_0x046e
            com.google.ads.interactivemedia.v3.internal.cy r3 = r5.f24597b     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = r3.f21809i     // Catch:{ all -> 0x0b6c }
            r6 = 2
            java.lang.String r5 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r5, r6)     // Catch:{ all -> 0x0b6c }
            r9.mo15607I(r5)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r5)     // Catch:{ all -> 0x0b6c }
            r9.mo15630ae(r5)     // Catch:{ all -> 0x0b6c }
            int r5 = r3.f21817q     // Catch:{ all -> 0x0b6c }
            r9.mo15635aj(r5)     // Catch:{ all -> 0x0b6c }
            int r5 = r3.f21818r     // Catch:{ all -> 0x0b6c }
            r9.mo15615Q(r5)     // Catch:{ all -> 0x0b6c }
            float r3 = r3.f21819s     // Catch:{ all -> 0x0b6c }
            r9.mo15614P(r3)     // Catch:{ all -> 0x0b6c }
        L_0x046e:
            if (r11 != 0) goto L_0x0471
            goto L_0x0422
        L_0x0471:
            r9.mo15622X(r12)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zp r3 = new com.google.ads.interactivemedia.v3.internal.zp     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r5 = r9.mo15625a()     // Catch:{ all -> 0x0b6c }
            r3.<init>(r11, r5, r7)     // Catch:{ all -> 0x0b6c }
            r13 = r38
            r13.add(r3)     // Catch:{ all -> 0x0b6c }
            r5 = r88
            r38 = r13
            goto L_0x0424
        L_0x0487:
            r13 = r38
            java.lang.String r14 = "AUDIO"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0514
            r3 = 0
        L_0x0492:
            int r14 = r15.size()     // Catch:{ all -> 0x0b6c }
            if (r3 >= r14) goto L_0x04ae
            java.lang.Object r14 = r15.get(r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r14 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r14     // Catch:{ all -> 0x0b6c }
            r38 = r13
            java.lang.String r13 = r14.f24599d     // Catch:{ all -> 0x0b6c }
            boolean r13 = r6.equals(r13)     // Catch:{ all -> 0x0b6c }
            if (r13 == 0) goto L_0x04a9
            goto L_0x04b1
        L_0x04a9:
            int r3 = r3 + 1
            r13 = r38
            goto L_0x0492
        L_0x04ae:
            r38 = r13
            r14 = 0
        L_0x04b1:
            if (r14 == 0) goto L_0x04c4
            com.google.ads.interactivemedia.v3.internal.cy r3 = r14.f24597b     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = r3.f21809i     // Catch:{ all -> 0x0b6c }
            r6 = 1
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r3, r6)     // Catch:{ all -> 0x0b6c }
            r9.mo15607I(r3)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x04c5
        L_0x04c4:
            r3 = 0
        L_0x04c5:
            java.util.regex.Pattern r6 = f24665g     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = m22713h(r5, r6, r8)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x04ef
            java.lang.String r6 = "/"
            java.lang.String[] r6 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18483A(r5, r6)     // Catch:{ all -> 0x0b6c }
            r13 = 0
            r6 = r6[r13]     // Catch:{ all -> 0x0b6c }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0b6c }
            r9.mo15606H(r6)     // Catch:{ all -> 0x0b6c }
            java.lang.String r6 = "audio/eac3"
            boolean r6 = r6.equals(r3)     // Catch:{ all -> 0x0b6c }
            if (r6 == 0) goto L_0x04ef
            java.lang.String r6 = "/JOC"
            boolean r5 = r5.endsWith(r6)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x04ef
            java.lang.String r3 = "audio/eac3-joc"
        L_0x04ef:
            r9.mo15630ae(r3)     // Catch:{ all -> 0x0b6c }
            if (r11 == 0) goto L_0x0506
            r9.mo15622X(r12)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zp r3 = new com.google.ads.interactivemedia.v3.internal.zp     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r5 = r9.mo15625a()     // Catch:{ all -> 0x0b6c }
            r3.<init>(r11, r5, r7)     // Catch:{ all -> 0x0b6c }
            r13 = r37
            r13.add(r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x050e
        L_0x0506:
            r13 = r37
            if (r14 == 0) goto L_0x050e
            com.google.ads.interactivemedia.v3.internal.cy r23 = r9.mo15625a()     // Catch:{ all -> 0x0b6c }
        L_0x050e:
            r5 = r88
        L_0x0510:
            r16 = 7
            goto L_0x05b7
        L_0x0514:
            r38 = r13
            r13 = r37
            goto L_0x050e
        L_0x0519:
            r13 = r37
            java.lang.String r6 = "CLOSED-CAPTIONS"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x050e
            java.util.regex.Pattern r3 = f24652J     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = m22712g(r5, r3, r8)     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = "CC"
            boolean r5 = r3.startsWith(r5)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x053e
            java.lang.String r5 = "application/cea-608"
            r14 = 2
            java.lang.String r3 = r3.substring(r14)     // Catch:{ all -> 0x0b6c }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x0b6c }
            r6 = 7
            goto L_0x054a
        L_0x053e:
            r14 = 2
            java.lang.String r5 = "application/cea-708"
            r6 = 7
            java.lang.String r3 = r3.substring(r6)     // Catch:{ all -> 0x0b6c }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x0b6c }
        L_0x054a:
            if (r10 != 0) goto L_0x0551
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0b6c }
            r10.<init>()     // Catch:{ all -> 0x0b6c }
        L_0x0551:
            r9.mo15630ae(r5)     // Catch:{ all -> 0x0b6c }
            r9.mo15604F(r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r3 = r9.mo15625a()     // Catch:{ all -> 0x0b6c }
            r10.add(r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x050e
        L_0x055f:
            r13 = r37
            r14 = 2
            r16 = 7
            java.lang.String r5 = "SUBTITLES"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x05b5
            r3 = 0
        L_0x056d:
            int r5 = r15.size()     // Catch:{ all -> 0x0b6c }
            if (r3 >= r5) goto L_0x0586
            java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zq r5 = (com.google.ads.interactivemedia.p367v3.internal.C7477zq) r5     // Catch:{ all -> 0x0b6c }
            java.lang.String r14 = r5.f24600e     // Catch:{ all -> 0x0b6c }
            boolean r14 = r6.equals(r14)     // Catch:{ all -> 0x0b6c }
            if (r14 == 0) goto L_0x0582
            goto L_0x0587
        L_0x0582:
            int r3 = r3 + 1
            r14 = 2
            goto L_0x056d
        L_0x0586:
            r5 = 0
        L_0x0587:
            if (r5 == 0) goto L_0x059a
            com.google.ads.interactivemedia.v3.internal.cy r3 = r5.f24597b     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = r3.f21809i     // Catch:{ all -> 0x0b6c }
            r5 = 3
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18502T(r3, r5)     // Catch:{ all -> 0x0b6c }
            r9.mo15607I(r3)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x059b
        L_0x059a:
            r3 = 0
        L_0x059b:
            java.lang.String r5 = "text/vtt"
            if (r3 != 0) goto L_0x05a0
            r3 = r5
        L_0x05a0:
            r9.mo15630ae(r3)     // Catch:{ all -> 0x0b6c }
            r9.mo15622X(r12)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zp r3 = new com.google.ads.interactivemedia.v3.internal.zp     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.cy r5 = r9.mo15625a()     // Catch:{ all -> 0x0b6c }
            r3.<init>(r11, r5, r7)     // Catch:{ all -> 0x0b6c }
            r5 = r88
            r5.add(r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x05b7
        L_0x05b5:
            r5 = r88
        L_0x05b7:
            int r1 = r1 + 1
            r88 = r5
            r37 = r13
            goto L_0x033e
        L_0x05bf:
            r5 = r88
            r13 = r37
            if (r20 == 0) goto L_0x05cc
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0b6c }
            r24 = r1
            goto L_0x05ce
        L_0x05cc:
            r24 = r10
        L_0x05ce:
            com.google.ads.interactivemedia.v3.internal.zr r1 = new com.google.ads.interactivemedia.v3.internal.zr     // Catch:{ all -> 0x0b6c }
            r15 = r1
            r16 = r4
            r17 = r26
            r18 = r2
            r19 = r38
            r20 = r13
            r21 = r5
            r26 = r8
            r27 = r36
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28)
            goto L_0x0b4e
        L_0x05e9:
            r27 = r2
            r28 = r3
            r23 = r10
            r21 = r11
            r24 = r12
            r16 = 7
            boolean r2 = r5.startsWith(r1)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "#EXT-X-ENDLIST"
            java.lang.String r6 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            java.lang.String r7 = "#EXT-X-DISCONTINUITY"
            java.lang.String r8 = "#EXT-X-BYTERANGE"
            java.lang.String r9 = "#EXT-X-KEY"
            java.lang.String r10 = "#EXTINF"
            java.lang.String r11 = "#EXT-X-MEDIA-SEQUENCE"
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.startsWith(r11)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.startsWith(r10)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.startsWith(r9)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.startsWith(r8)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.equals(r7)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.equals(r6)     // Catch:{ all -> 0x0b6c }
            if (r2 != 0) goto L_0x0640
            boolean r2 = r5.equals(r3)     // Catch:{ all -> 0x0b6c }
            if (r2 == 0) goto L_0x0634
            goto L_0x0640
        L_0x0634:
            r4.add(r5)     // Catch:{ all -> 0x0b6c }
            r2 = r27
            r3 = r28
            r6 = 1
            r7 = 0
            r9 = 7
            goto L_0x005f
        L_0x0640:
            r4.add(r5)     // Catch:{ all -> 0x0b6c }
            r2 = r87
            com.google.ads.interactivemedia.v3.internal.zr r5 = r2.f24685Q     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zv r12 = new com.google.ads.interactivemedia.v3.internal.zv     // Catch:{ all -> 0x0b6c }
            r13 = r28
            r12.<init>(r4, r13)     // Catch:{ all -> 0x0b4f }
            java.lang.String r32 = r88.toString()     // Catch:{ all -> 0x0b4f }
            boolean r4 = r5.f24639r     // Catch:{ all -> 0x0b4f }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x0b4f }
            r14.<init>()     // Catch:{ all -> 0x0b4f }
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x0b4f }
            r15.<init>()     // Catch:{ all -> 0x0b4f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0b4f }
            r2.<init>()     // Catch:{ all -> 0x0b4f }
            r16 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0b4f }
            r4.<init>()     // Catch:{ all -> 0x0b4f }
            com.google.ads.interactivemedia.v3.internal.ary r20 = new com.google.ads.interactivemedia.v3.internal.ary     // Catch:{ all -> 0x0b4f }
            r20.<init>()     // Catch:{ all -> 0x0b4f }
            r28 = r13
            java.util.TreeMap r13 = new java.util.TreeMap     // Catch:{ all -> 0x0b6c }
            r13.<init>()     // Catch:{ all -> 0x0b6c }
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r30 = -1
            r33 = 0
            r88 = r2
            r68 = r16
            r70 = r20
            r56 = r25
            r64 = r56
            r66 = r64
            r54 = r30
            r43 = r33
            r45 = r43
            r58 = r45
            r61 = r58
            r71 = r61
            r73 = r71
            r2 = 0
            r16 = 0
            r20 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r60 = 0
            r63 = 1
            r69 = 0
        L_0x06b4:
            boolean r35 = r12.mo16890a()     // Catch:{ all -> 0x0b6c }
            if (r35 == 0) goto L_0x0b14
            r89 = r15
            java.lang.String r15 = r12.mo16891b()     // Catch:{ all -> 0x0b6c }
            r75 = r12
            r12 = r21
            boolean r21 = r15.startsWith(r12)     // Catch:{ all -> 0x0b6c }
            if (r21 == 0) goto L_0x06cd
            r4.add(r15)     // Catch:{ all -> 0x0b6c }
        L_0x06cd:
            r21 = r12
            java.lang.String r12 = "#EXT-X-PLAYLIST-TYPE"
            boolean r12 = r15.startsWith(r12)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x0715
            java.util.regex.Pattern r12 = f24672n     // Catch:{ all -> 0x0b6c }
            java.lang.String r12 = m22712g(r15, r12, r14)     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = "VOD"
            boolean r15 = r15.equals(r12)     // Catch:{ all -> 0x0b6c }
            if (r15 == 0) goto L_0x06ec
            r15 = r89
            r12 = r75
            r51 = 1
            goto L_0x06b4
        L_0x06ec:
            java.lang.String r15 = "EVENT"
            boolean r12 = r15.equals(r12)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            if (r12 == 0) goto L_0x06fb
            r12 = r75
            r51 = 2
            goto L_0x06b4
        L_0x06fb:
            r12 = r3
            r76 = r4
            r18 = r6
            r83 = r7
            r84 = r8
            r85 = r9
            r86 = r10
            r77 = r23
            r82 = r24
            r10 = 0
            r23 = r1
            r24 = r5
            r1 = r88
            goto L_0x0af9
        L_0x0715:
            java.lang.String r12 = "#EXT-X-I-FRAMES-ONLY"
            boolean r12 = r15.equals(r12)     // Catch:{ all -> 0x0b6c }
            if (r12 == 0) goto L_0x0724
            r15 = r89
            r12 = r75
            r27 = 1
            goto L_0x06b4
        L_0x0724:
            java.lang.String r12 = "#EXT-X-START"
            boolean r12 = r15.startsWith(r12)     // Catch:{ all -> 0x0b6c }
            r35 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r12 == 0) goto L_0x0748
            java.util.regex.Pattern r12 = f24681w     // Catch:{ all -> 0x0b6c }
            double r37 = m22711f(r15, r12)     // Catch:{ all -> 0x0b6c }
            r12 = r3
            r76 = r4
            double r3 = r37 * r35
            long r3 = (long) r3     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r56 = r3
        L_0x0741:
            r3 = r12
        L_0x0742:
            r12 = r75
        L_0x0744:
            r4 = r76
            goto L_0x06b4
        L_0x0748:
            r12 = r3
            r76 = r4
            java.lang.String r3 = "#EXT-X-SERVER-CONTROL"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x0773
            java.util.regex.Pattern r3 = f24673o     // Catch:{ all -> 0x0b6c }
            m22718m(r15, r3)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24674p     // Catch:{ all -> 0x0b6c }
            m22717l(r15, r3)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24675q     // Catch:{ all -> 0x0b6c }
            m22718m(r15, r3)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24676r     // Catch:{ all -> 0x0b6c }
            m22718m(r15, r3)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24677s     // Catch:{ all -> 0x0b6c }
            m22717l(r15, r3)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.ary r70 = new com.google.ads.interactivemedia.v3.internal.ary     // Catch:{ all -> 0x0b6c }
            r70.<init>()     // Catch:{ all -> 0x0b6c }
            goto L_0x07f7
        L_0x0773:
            java.lang.String r3 = "#EXT-X-PART-INF"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x0789
            java.util.regex.Pattern r3 = f24670l     // Catch:{ all -> 0x0b6c }
            double r3 = m22711f(r15, r3)     // Catch:{ all -> 0x0b6c }
            double r3 = r3 * r35
            long r3 = (long) r3     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r66 = r3
            goto L_0x0741
        L_0x0789:
            java.lang.String r3 = "#EXT-X-MAP"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x07e5
            java.util.regex.Pattern r3 = f24645C     // Catch:{ all -> 0x0b6c }
            java.lang.String r36 = m22712g(r15, r3, r14)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24683y     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = m22713h(r15, r3, r14)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x07c0
            java.lang.String r4 = "@"
            java.lang.String[] r3 = r3.split(r4)     // Catch:{ all -> 0x0b6c }
            r4 = 0
            r15 = r3[r4]     // Catch:{ all -> 0x0b6c }
            long r37 = java.lang.Long.parseLong(r15)     // Catch:{ all -> 0x0b6c }
            int r4 = r3.length     // Catch:{ all -> 0x0b6c }
            r15 = 1
            if (r4 <= r15) goto L_0x07bb
            r3 = r3[r15]     // Catch:{ all -> 0x0b6c }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x0b6c }
            r39 = r37
            r37 = r3
            goto L_0x07c4
        L_0x07bb:
            r39 = r37
            r37 = r43
            goto L_0x07c4
        L_0x07c0:
            r37 = r43
            r39 = r54
        L_0x07c4:
            if (r16 == 0) goto L_0x07d1
            if (r20 == 0) goto L_0x07c9
            goto L_0x07d1
        L_0x07c9:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ all -> 0x0b6c }
            java.lang.String r2 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r1.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0b6c }
            throw r1     // Catch:{ all -> 0x0b6c }
        L_0x07d1:
            com.google.ads.interactivemedia.v3.internal.zs r25 = new com.google.ads.interactivemedia.v3.internal.zs     // Catch:{ all -> 0x0b6c }
            r35 = r25
            r41 = r16
            r42 = r20
            r35.<init>(r36, r37, r39, r41, r42)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r3 = r12
            r54 = r30
            r43 = r33
            goto L_0x0742
        L_0x07e5:
            boolean r3 = r15.startsWith(r1)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x07fb
            java.util.regex.Pattern r3 = f24669k     // Catch:{ all -> 0x0b6c }
            int r3 = m22710e(r15, r3)     // Catch:{ all -> 0x0b6c }
            long r3 = (long) r3     // Catch:{ all -> 0x0b6c }
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r64 = r3 * r35
        L_0x07f7:
            r15 = r89
            goto L_0x0741
        L_0x07fb:
            boolean r3 = r15.startsWith(r11)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x0816
            java.util.regex.Pattern r3 = f24678t     // Catch:{ all -> 0x0b6c }
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = m22712g(r15, r3, r4)     // Catch:{ all -> 0x0b6c }
            long r45 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r3 = r12
            r61 = r45
            goto L_0x0742
        L_0x0816:
            java.lang.String r3 = "#EXT-X-VERSION"
            boolean r3 = r15.startsWith(r3)     // Catch:{ all -> 0x0b6c }
            if (r3 == 0) goto L_0x0825
            java.util.regex.Pattern r3 = f24671m     // Catch:{ all -> 0x0b6c }
            int r63 = m22710e(r15, r3)     // Catch:{ all -> 0x0b6c }
            goto L_0x07f7
        L_0x0825:
            r3 = r23
            boolean r4 = r15.startsWith(r3)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x0880
            java.util.regex.Pattern r4 = f24657O     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = m22713h(r15, r4, r14)     // Catch:{ all -> 0x0b6c }
            if (r4 == 0) goto L_0x085b
            java.util.Map r15 = r5.f24609h     // Catch:{ all -> 0x0b6c }
            java.lang.Object r15 = r15.get(r4)     // Catch:{ all -> 0x0b6c }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x0b6c }
            if (r15 == 0) goto L_0x0842
            r14.put(r4, r15)     // Catch:{ all -> 0x0b6c }
        L_0x0842:
            r15 = r89
            r23 = r1
            r77 = r3
            r18 = r6
            r83 = r7
            r84 = r8
            r85 = r9
            r86 = r10
            r82 = r24
            r10 = 0
            r1 = r88
        L_0x0857:
            r24 = r5
            goto L_0x0af9
        L_0x085b:
            java.util.regex.Pattern r4 = f24649G     // Catch:{ all -> 0x0b6c }
            java.lang.String r4 = m22712g(r15, r4, r14)     // Catch:{ all -> 0x0b6c }
            r23 = r1
            java.util.regex.Pattern r1 = f24656N     // Catch:{ all -> 0x0b6c }
            java.lang.String r1 = m22712g(r15, r1, r14)     // Catch:{ all -> 0x0b6c }
            r14.put(r4, r1)     // Catch:{ all -> 0x0b6c }
            r1 = r88
            r15 = r89
            r77 = r3
            r18 = r6
            r83 = r7
            r84 = r8
            r85 = r9
            r86 = r10
            r82 = r24
            r10 = 0
            goto L_0x0857
        L_0x0880:
            r23 = r1
            boolean r1 = r15.startsWith(r10)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x08ac
            java.util.regex.Pattern r1 = f24679u     // Catch:{ all -> 0x0b6c }
            double r37 = m22711f(r15, r1)     // Catch:{ all -> 0x0b6c }
            r1 = r3
            double r3 = r37 * r35
            long r3 = (long) r3     // Catch:{ all -> 0x0b6c }
            r77 = r1
            java.util.regex.Pattern r1 = f24680v     // Catch:{ all -> 0x0b6c }
            r35 = r3
            java.lang.String r3 = ""
            m22714i(r15, r1, r3, r14)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r3 = r12
            r1 = r23
            r73 = r35
            r12 = r75
            r4 = r76
            r23 = r77
            goto L_0x06b4
        L_0x08ac:
            r77 = r3
            boolean r1 = r15.startsWith(r9)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x0911
            java.util.regex.Pattern r1 = f24684z     // Catch:{ all -> 0x0b6c }
            java.lang.String r1 = m22712g(r15, r1, r14)     // Catch:{ all -> 0x0b6c }
            java.util.regex.Pattern r3 = f24643A     // Catch:{ all -> 0x0b6c }
            r4 = r24
            java.lang.String r3 = m22714i(r15, r3, r4, r14)     // Catch:{ all -> 0x0b6c }
            r24 = r5
            java.lang.String r5 = "NONE"
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0b6c }
            if (r5 == 0) goto L_0x08d7
            r13.clear()     // Catch:{ all -> 0x0b6c }
            r16 = 0
            r20 = 0
        L_0x08d3:
            r22 = 0
            goto L_0x0965
        L_0x08d7:
            java.util.regex.Pattern r5 = f24646D     // Catch:{ all -> 0x0b6c }
            java.lang.String r5 = m22713h(r15, r5, r14)     // Catch:{ all -> 0x0b6c }
            boolean r16 = r4.equals(r3)     // Catch:{ all -> 0x0b6c }
            if (r16 == 0) goto L_0x08fd
            java.lang.String r3 = "AES-128"
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x08f7
            java.util.regex.Pattern r1 = f24645C     // Catch:{ all -> 0x0b6c }
            java.lang.String r1 = m22712g(r15, r1, r14)     // Catch:{ all -> 0x0b6c }
            r16 = r1
            r20 = r5
            goto L_0x0965
        L_0x08f7:
            r20 = r5
            r16 = 0
            goto L_0x0965
        L_0x08fd:
            if (r2 != 0) goto L_0x0903
            java.lang.String r2 = m22709d(r1)     // Catch:{ all -> 0x0b6c }
        L_0x0903:
            com.google.ads.interactivemedia.v3.internal.jb r1 = m22708c(r15, r3, r14)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x08f7
            r13.put(r3, r1)     // Catch:{ all -> 0x0b6c }
            r20 = r5
            r16 = 0
            goto L_0x08d3
        L_0x0911:
            r4 = r24
            r24 = r5
            boolean r1 = r15.startsWith(r8)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x0939
            java.util.regex.Pattern r1 = f24682x     // Catch:{ all -> 0x0b6c }
            java.lang.String r1 = m22712g(r15, r1, r14)     // Catch:{ all -> 0x0b6c }
            java.lang.String r3 = "@"
            java.lang.String[] r1 = r1.split(r3)     // Catch:{ all -> 0x0b6c }
            r3 = 0
            r5 = r1[r3]     // Catch:{ all -> 0x0b6c }
            long r54 = java.lang.Long.parseLong(r5)     // Catch:{ all -> 0x0b6c }
            int r3 = r1.length     // Catch:{ all -> 0x0b6c }
            r5 = 1
            if (r3 <= r5) goto L_0x0965
            r1 = r1[r5]     // Catch:{ all -> 0x0b6c }
            long r43 = java.lang.Long.parseLong(r1)     // Catch:{ all -> 0x0b6c }
            goto L_0x0965
        L_0x0939:
            boolean r1 = r15.startsWith(r6)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x095d
            r1 = 58
            int r1 = r15.indexOf(r1)     // Catch:{ all -> 0x0b6c }
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r1 = r15.substring(r1)     // Catch:{ all -> 0x0b6c }
            int r60 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            r3 = r12
            r1 = r23
            r5 = r24
            r12 = r75
            r23 = r77
            r52 = 1
            goto L_0x0970
        L_0x095d:
            boolean r1 = r15.equals(r7)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x0974
            int r26 = r26 + 1
        L_0x0965:
            r15 = r89
            r3 = r12
            r1 = r23
            r5 = r24
            r12 = r75
            r23 = r77
        L_0x0970:
            r24 = r4
            goto L_0x0744
        L_0x0974:
            java.lang.String r1 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r1 = r15.startsWith(r1)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x09aa
            int r1 = (r58 > r33 ? 1 : (r58 == r33 ? 0 : -1))
            if (r1 != 0) goto L_0x0997
            r1 = 58
            int r1 = r15.indexOf(r1)     // Catch:{ all -> 0x0b6c }
            r3 = 1
            int r1 = r1 + r3
            java.lang.String r1 = r15.substring(r1)     // Catch:{ all -> 0x0b6c }
            long r35 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18495M(r1)     // Catch:{ all -> 0x0b6c }
            long r35 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.m19755b(r35)     // Catch:{ all -> 0x0b6c }
            long r58 = r35 - r71
            goto L_0x0965
        L_0x0997:
            r1 = r88
            r15 = r89
            r82 = r4
            r18 = r6
            r83 = r7
            r84 = r8
            r85 = r9
            r86 = r10
            r10 = 0
            goto L_0x0af9
        L_0x09aa:
            r3 = 1
            java.lang.String r1 = "#EXT-X-GAP"
            boolean r1 = r15.equals(r1)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x09c1
            r15 = r89
            r3 = r12
            r1 = r23
            r5 = r24
            r12 = r75
            r23 = r77
            r53 = 1
            goto L_0x0970
        L_0x09c1:
            java.lang.String r1 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r1 = r15.equals(r1)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x09d7
            r15 = r89
            r3 = r12
            r1 = r23
            r5 = r24
            r12 = r75
            r23 = r77
            r68 = 1
            goto L_0x0970
        L_0x09d7:
            boolean r1 = r15.equals(r12)     // Catch:{ all -> 0x0b6c }
            if (r1 == 0) goto L_0x09eb
            r15 = r89
            r3 = r12
            r1 = r23
            r5 = r24
            r12 = r75
            r23 = r77
            r69 = 1
            goto L_0x0970
        L_0x09eb:
            java.lang.String r1 = "#"
            boolean r1 = r15.startsWith(r1)     // Catch:{ all -> 0x0b6c }
            if (r1 != 0) goto L_0x0997
            if (r16 != 0) goto L_0x09f7
            r1 = 0
            goto L_0x0a00
        L_0x09f7:
            if (r20 == 0) goto L_0x09fc
            r1 = r20
            goto L_0x0a00
        L_0x09fc:
            java.lang.String r1 = java.lang.Long.toHexString(r45)     // Catch:{ all -> 0x0b6c }
        L_0x0a00:
            r35 = 1
            long r78 = r45 + r35
            java.lang.String r5 = m22715j(r15, r14)     // Catch:{ all -> 0x0b6c }
            r15 = r89
            java.lang.Object r19 = r15.get(r5)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.zs r19 = (com.google.ads.interactivemedia.p367v3.internal.C7479zs) r19     // Catch:{ all -> 0x0b6c }
            int r35 = (r54 > r30 ? 1 : (r54 == r30 ? 0 : -1))
            if (r35 != 0) goto L_0x0a17
            r80 = r33
            goto L_0x0a35
        L_0x0a17:
            if (r27 == 0) goto L_0x0a33
            if (r25 != 0) goto L_0x0a33
            if (r19 != 0) goto L_0x0a33
            com.google.ads.interactivemedia.v3.internal.zs r3 = new com.google.ads.interactivemedia.v3.internal.zs     // Catch:{ all -> 0x0b6c }
            r37 = 0
            r41 = 0
            r42 = 0
            r35 = r3
            r36 = r5
            r39 = r43
            r35.<init>(r36, r37, r39, r41, r42)     // Catch:{ all -> 0x0b6c }
            r15.put(r5, r3)     // Catch:{ all -> 0x0b6c }
            r19 = r3
        L_0x0a33:
            r80 = r43
        L_0x0a35:
            if (r22 != 0) goto L_0x0a9c
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x0b6c }
            if (r3 != 0) goto L_0x0a9c
            java.util.Collection r3 = r13.values()     // Catch:{ all -> 0x0b6c }
            r82 = r4
            r18 = r6
            r4 = 0
            com.google.ads.interactivemedia.v3.internal.jb[] r6 = new com.google.ads.interactivemedia.p367v3.internal.C7030jb[r4]     // Catch:{ all -> 0x0b6c }
            java.lang.Object[] r3 = r3.toArray(r6)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.jb[] r3 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r3     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.jc r6 = new com.google.ads.interactivemedia.v3.internal.jc     // Catch:{ all -> 0x0b6c }
            r6.<init>((java.lang.String) r2, (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r3)     // Catch:{ all -> 0x0b6c }
            if (r50 != 0) goto L_0x0a90
            int r4 = r3.length     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.v3.internal.jb[] r4 = new com.google.ads.interactivemedia.p367v3.internal.C7030jb[r4]     // Catch:{ all -> 0x0b6c }
            r22 = r6
            r83 = r7
            r6 = 0
        L_0x0a5d:
            int r7 = r3.length     // Catch:{ all -> 0x0b6c }
            if (r6 >= r7) goto L_0x0a83
            r7 = r3[r6]     // Catch:{ all -> 0x0b6c }
            r35 = r3
            com.google.ads.interactivemedia.v3.internal.jb r3 = new com.google.ads.interactivemedia.v3.internal.jb     // Catch:{ all -> 0x0b6c }
            r84 = r8
            java.util.UUID r8 = r7.f22530a     // Catch:{ all -> 0x0b6c }
            r85 = r9
            java.lang.String r9 = r7.f22531b     // Catch:{ all -> 0x0b6c }
            java.lang.String r7 = r7.f22532c     // Catch:{ all -> 0x0b6c }
            r86 = r10
            r10 = 0
            r3.<init>(r8, r9, r7, r10)     // Catch:{ all -> 0x0b6c }
            r4[r6] = r3     // Catch:{ all -> 0x0b6c }
            int r6 = r6 + 1
            r3 = r35
            r8 = r84
            r9 = r85
            r10 = r86
            goto L_0x0a5d
        L_0x0a83:
            r84 = r8
            r85 = r9
            r86 = r10
            r10 = 0
            com.google.ads.interactivemedia.v3.internal.jc r3 = new com.google.ads.interactivemedia.v3.internal.jc     // Catch:{ all -> 0x0b6c }
            r3.<init>((java.lang.String) r2, (com.google.ads.interactivemedia.p367v3.internal.C7030jb[]) r4)     // Catch:{ all -> 0x0b6c }
            goto L_0x0aa3
        L_0x0a90:
            r22 = r6
        L_0x0a92:
            r83 = r7
            r84 = r8
            r85 = r9
            r86 = r10
            r10 = 0
            goto L_0x0aa1
        L_0x0a9c:
            r82 = r4
            r18 = r6
            goto L_0x0a92
        L_0x0aa1:
            r3 = r50
        L_0x0aa3:
            com.google.ads.interactivemedia.v3.internal.zs r4 = new com.google.ads.interactivemedia.v3.internal.zs     // Catch:{ all -> 0x0b6c }
            if (r25 == 0) goto L_0x0aaa
            r37 = r25
            goto L_0x0aac
        L_0x0aaa:
            r37 = r19
        L_0x0aac:
            r35 = r4
            r36 = r5
            r38 = r73
            r40 = r26
            r41 = r71
            r43 = r22
            r44 = r16
            r45 = r1
            r46 = r80
            r48 = r54
            r50 = r53
            r35.<init>(r36, r37, r38, r40, r41, r43, r44, r45, r46, r48, r50)     // Catch:{ all -> 0x0b6c }
            r1 = r88
            r1.add(r4)     // Catch:{ all -> 0x0b6c }
            long r71 = r71 + r73
            int r4 = (r54 > r30 ? 1 : (r54 == r30 ? 0 : -1))
            if (r4 == 0) goto L_0x0ad2
            long r80 = r80 + r54
        L_0x0ad2:
            r43 = r80
            r88 = r1
            r50 = r3
            r3 = r12
            r6 = r18
            r1 = r23
            r5 = r24
            r54 = r30
            r73 = r33
            r12 = r75
            r4 = r76
            r23 = r77
            r45 = r78
            r24 = r82
            r7 = r83
            r8 = r84
            r9 = r85
            r10 = r86
            r53 = 0
            goto L_0x06b4
        L_0x0af9:
            r88 = r1
            r3 = r12
            r6 = r18
            r1 = r23
            r5 = r24
            r12 = r75
            r4 = r76
            r23 = r77
            r24 = r82
            r7 = r83
            r8 = r84
            r9 = r85
            r10 = r86
            goto L_0x06b4
        L_0x0b14:
            r1 = r88
            r76 = r4
            com.google.ads.interactivemedia.v3.internal.zt r2 = new com.google.ads.interactivemedia.v3.internal.zt     // Catch:{ all -> 0x0b6c }
            int r3 = (r58 > r33 ? 1 : (r58 == r33 ? 0 : -1))
            if (r3 == 0) goto L_0x0b21
            r49 = 1
            goto L_0x0b23
        L_0x0b21:
            r49 = 0
        L_0x0b23:
            r53 = 0
            r54 = 0
            r55 = 0
            r30 = r2
            r31 = r51
            r33 = r76
            r34 = r56
            r36 = r58
            r38 = r52
            r39 = r60
            r40 = r61
            r42 = r63
            r43 = r64
            r45 = r66
            r47 = r68
            r48 = r69
            r51 = r1
            r52 = r70
            r30.<init>(r31, r32, r33, r34, r36, r38, r39, r40, r42, r43, r45, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x0b6c }
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28)
            r1 = r2
        L_0x0b4e:
            return r1
        L_0x0b4f:
            r0 = move-exception
            r28 = r13
            goto L_0x0b71
        L_0x0b53:
            r23 = r1
            goto L_0x005f
        L_0x0b57:
            r28 = r3
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28)
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt
            java.lang.String r2 = "Failed to parse the playlist, could not identify any tags."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0b64:
            com.google.ads.interactivemedia.v3.internal.vk r1 = new com.google.ads.interactivemedia.v3.internal.vk     // Catch:{ all -> 0x0b6c }
            java.lang.String r2 = "Input does not start with the #EXTM3U header."
            r1.<init>(r2)     // Catch:{ all -> 0x0b6c }
            throw r1     // Catch:{ all -> 0x0b6c }
        L_0x0b6c:
            r0 = move-exception
            goto L_0x0b71
        L_0x0b6e:
            r0 = move-exception
            r28 = r3
        L_0x0b71:
            r1 = r0
        L_0x0b72:
            com.google.ads.interactivemedia.p367v3.internal.aeu.m18548r(r28)
            goto L_0x0b77
        L_0x0b76:
            throw r1
        L_0x0b77:
            goto L_0x0b76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7483zw.mo14477a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
