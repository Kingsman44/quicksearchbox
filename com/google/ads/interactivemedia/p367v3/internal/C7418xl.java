package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.ads.interactivemedia.v3.internal.xl */
/* compiled from: PG */
public final class C7418xl extends DefaultHandler implements adc {

    /* renamed from: a */
    private static final Pattern f24315a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f24316b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f24317c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private static final int[] f24318d = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: e */
    private final XmlPullParserFactory f24319e;

    public C7418xl() {
        try {
            this.f24319e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: A */
    private static int m22407A(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        ary.m19464q(i == i2);
        return i;
    }

    /* renamed from: B */
    private static long m22408B(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: C */
    private static final long m22409C(List list, long j, long j2, int i, long j3) {
        int G = i >= 0 ? i + 1 : (int) aeu.m18489G(j3 - j, j2);
        for (int i2 = 0; i2 < G; i2++) {
            list.add(new C7430xx(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: h */
    public static void m22410h(XmlPullParser xmlPullParser) {
        if (atv.m19614f(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (atv.m19614f(xmlPullParser)) {
                    i++;
                } else if (atv.m19612d(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: i */
    protected static C7419xm m22411i(XmlPullParser xmlPullParser, String str) {
        String o = m22417o(xmlPullParser, "schemeIdUri", BuildConfig.FLAVOR);
        String o2 = m22417o(xmlPullParser, "value", (String) null);
        String o3 = m22417o(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!atv.m19611c(xmlPullParser, str));
        return new C7419xm(o, o2, o3);
    }

    /* renamed from: j */
    protected static float m22412j(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f24315a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: k */
    protected static long m22413k(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return aeu.m18494L(attributeValue);
    }

    /* renamed from: l */
    protected static String m22414l(XmlPullParser xmlPullParser, String str) {
        String str2 = BuildConfig.FLAVOR;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m22410h(xmlPullParser);
            }
        } while (!atv.m19611c(xmlPullParser, str));
        return str2;
    }

    /* renamed from: m */
    protected static int m22415m(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: n */
    protected static long m22416n(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: o */
    protected static String m22417o(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r0.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011") == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r5.getAttributeValue((java.lang.String) null, "value"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        if (r0 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        switch(r0.hashCode()) {
            case 1596796: goto L_0x006f;
            case 2937391: goto L_0x0065;
            case 3094035: goto L_0x005b;
            case 3133436: goto L_0x0050;
            default: goto L_0x004f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (r0.equals("fa01") == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r4 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r0.equals("f801") == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r4 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        if (r0.equals("a000") == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r0.equals("4000") == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r0.equals("urn:dolby:dash:audio_channel_configuration:2011") != false) goto L_0x003d;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final int m22418p(org.xmlpull.v1.XmlPullParser r5) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m22417o(r5, r0, r1)
            int r2 = r0.hashCode()
            java.lang.String r3 = "value"
            r4 = -1
            switch(r2) {
                case -1352850286: goto L_0x0079;
                case -1138141449: goto L_0x0034;
                case -986633423: goto L_0x001c;
                case 2036691300: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0085
        L_0x0013:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0085
            goto L_0x003d
        L_0x001c:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            int r0 = m22415m(r5, r3, r4)
            if (r0 < 0) goto L_0x0085
            int[] r1 = f24318d
            int r2 = r1.length
            r2 = 21
            if (r0 >= r2) goto L_0x0085
            r4 = r1[r0]
            goto L_0x0085
        L_0x0034:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003d
            goto L_0x0085
        L_0x003d:
            java.lang.String r0 = r5.getAttributeValue(r1, r3)
            java.lang.String r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x0085
        L_0x0048:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L_0x006f;
                case 2937391: goto L_0x0065;
                case 3094035: goto L_0x005b;
                case 3133436: goto L_0x0050;
                default: goto L_0x004f;
            }
        L_0x004f:
            goto L_0x0085
        L_0x0050:
            java.lang.String r1 = "fa01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r4 = 8
            goto L_0x0085
        L_0x005b:
            java.lang.String r1 = "f801"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r4 = 6
            goto L_0x0085
        L_0x0065:
            java.lang.String r1 = "a000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r4 = 2
            goto L_0x0085
        L_0x006f:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            r4 = 1
            goto L_0x0085
        L_0x0079:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0085
            int r4 = m22415m(r5, r3, r4)
        L_0x0085:
            r5.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r5, r0)
            if (r0 == 0) goto L_0x0085
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7418xl.m22418p(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: q */
    protected static final long m22419q(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: r */
    protected static final String m22420r(XmlPullParser xmlPullParser, String str) {
        return atv.m19618j(str, m22414l(xmlPullParser, "BaseURL"));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ef  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final android.util.Pair m22421s(org.xmlpull.v1.XmlPullParser r8) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r8.getAttributeValue(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18485C(r0)
            int r3 = r0.hashCode()
            r4 = 489446379(0x1d2c5beb, float:2.281153E-21)
            if (r3 == r4) goto L_0x0071
            r4 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r3 == r4) goto L_0x0066
            r4 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r3 == r4) goto L_0x0022
            goto L_0x007f
        L_0x0022:
            java.lang.String r3 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = "value"
            java.lang.String r0 = r8.getAttributeValue(r1, r0)
            java.lang.String r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19615g(r8)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0064
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x004c:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x005a
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x004c
        L_0x005a:
            java.util.UUID r3 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21606b
            byte[] r3 = com.google.ads.interactivemedia.p367v3.internal.C7135mz.m21199b(r3, r4, r1)
            java.util.UUID r4 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21606b
            r5 = r1
            goto L_0x0083
        L_0x0064:
            r3 = r1
            goto L_0x0081
        L_0x0066:
            java.lang.String r3 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007f
            java.util.UUID r4 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21607c
            goto L_0x007b
        L_0x0071:
            java.lang.String r3 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x007f
            java.util.UUID r4 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21608d
        L_0x007b:
            r0 = r1
            r3 = r0
            r5 = r3
            goto L_0x0083
        L_0x007f:
            r0 = r1
            r3 = r0
        L_0x0081:
            r4 = r3
            r5 = r4
        L_0x0083:
            r8.next()
            java.lang.String r6 = "ms:laurl"
            boolean r6 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r8, r6)
            if (r6 == 0) goto L_0x0095
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r8.getAttributeValue(r1, r5)
            goto L_0x00e5
        L_0x0095:
            r6 = 4
            if (r3 != 0) goto L_0x00bb
            boolean r7 = com.google.ads.interactivemedia.p367v3.internal.atv.m19616h(r8)
            if (r7 == 0) goto L_0x00bb
            int r7 = r8.next()
            if (r7 != r6) goto L_0x00bb
            java.lang.String r3 = r8.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = com.google.ads.interactivemedia.p367v3.internal.C7135mz.m21200c(r3)
            if (r4 != 0) goto L_0x00e5
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r3, r6)
            r3 = r1
            goto L_0x00e5
        L_0x00bb:
            if (r3 != 0) goto L_0x00e2
            java.util.UUID r7 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21608d
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x00e2
            java.lang.String r7 = "mspr:pro"
            boolean r7 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r8, r7)
            if (r7 == 0) goto L_0x00e2
            int r7 = r8.next()
            if (r7 != r6) goto L_0x00e2
            java.util.UUID r3 = com.google.ads.interactivemedia.p367v3.internal.C6821bi.f21608d
            java.lang.String r6 = r8.getText()
            byte[] r6 = android.util.Base64.decode(r6, r2)
            byte[] r3 = com.google.ads.interactivemedia.p367v3.internal.C7135mz.m21198a(r3, r6)
            goto L_0x00e5
        L_0x00e2:
            m22410h(r8)
        L_0x00e5:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r8, r6)
            if (r6 == 0) goto L_0x0083
            if (r4 == 0) goto L_0x00f6
            com.google.ads.interactivemedia.v3.internal.jb r1 = new com.google.ads.interactivemedia.v3.internal.jb
            java.lang.String r8 = "video/mp4"
            r1.<init>(r4, r5, r8, r3)
        L_0x00f6:
            android.util.Pair r8 = android.util.Pair.create(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7418xl.m22421s(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: t */
    protected static final int m22422t(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (!"text".equals(attributeValue)) {
            return -1;
        }
        return 3;
    }

    /* renamed from: u */
    protected static final int m22423u(String str) {
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    return 128;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    return 512;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    return 2048;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    return 2;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    return 16;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    return 1;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    return 256;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    return 64;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    return 8;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    return 32;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    return 4;
                }
                break;
        }
        return 0;
    }

    /* renamed from: v */
    protected static long m22424v(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return aeu.m18495M(attributeValue);
    }

    /* renamed from: w */
    protected static float m22425w(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    /* renamed from: x */
    protected static final C7423xq m22426x(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return new C7423xq(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return new C7423xq(attributeValue, j2, j);
    }

    /* renamed from: y */
    protected static final int m22427y(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if ("http://dashif.org/guidelines/trickmode".equalsIgnoreCase(((C7419xm) list.get(i2)).f24320a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* renamed from: z */
    protected static final C7436yc m22428z(XmlPullParser xmlPullParser, String str, C7436yc ycVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? C7436yc.m22487a(attributeValue) : ycVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r101v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r75v6, resolved type: java.lang.String} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0a5d A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0aa1  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0ad5 A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0afb A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0bb2 A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0bc4 A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0c9b A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0c9e A[Catch:{ XmlPullParserException -> 0x13a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0cee A[Catch:{ XmlPullParserException -> 0x13a6 }, LOOP:5: B:142:0x066e->B:333:0x0cee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0f81 A[Catch:{ XmlPullParserException -> 0x13a6 }, LOOP:4: B:95:0x03a2->B:399:0x0f81, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x12e6 A[Catch:{ XmlPullParserException -> 0x13a6 }, LOOP:3: B:84:0x0289->B:469:0x12e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:489:0x1383 A[Catch:{ XmlPullParserException -> 0x13a6 }, LOOP:0: B:25:0x00c9->B:489:0x1383, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x1341 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x0220 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x1287 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0ea5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:502:0x0a0c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x0ac6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x023d A[Catch:{ XmlPullParserException -> 0x13a6 }, LOOP:2: B:64:0x01df->B:75:0x023d, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.C7416xj mo14477a(android.net.Uri r144, java.io.InputStream r145) {
        /*
            r143 = this;
            r15 = r143
            java.lang.String r14 = "Period"
            java.lang.String r12 = "ServiceDescription"
            java.lang.String r13 = "ProgramInformation"
            java.lang.String r10 = "MPD"
            java.lang.String r11 = "SupplementalProperty"
            java.lang.String r8 = "EssentialProperty"
            java.lang.String r9 = "id"
            java.lang.String r6 = "BaseURL"
            org.xmlpull.v1.XmlPullParserFactory r1 = r15.f24319e     // Catch:{ XmlPullParserException -> 0x13a6 }
            org.xmlpull.v1.XmlPullParser r7 = r1.newPullParser()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = 0
            r1 = r145
            r7.setInput(r1, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r1 = r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2 = 2
            if (r1 != r2) goto L_0x139e
            java.lang.String r1 = r7.getName()     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x139e
            java.lang.String r1 = r144.toString()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "availabilityStartTime"
            long r17 = m22424v(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "mediaPresentationDuration"
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r19 = m22413k(r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "minBufferTime"
            long r21 = m22413k(r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "dynamic"
            java.lang.String r3 = "type"
            r4 = 0
            java.lang.String r3 = r7.getAttributeValue(r4, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r4 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 == 0) goto L_0x006b
            java.lang.String r2 = "minimumUpdatePeriod"
            r23 = r10
            r24 = r11
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r2 = m22413k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r25 = r2
            goto L_0x0076
        L_0x006b:
            r23 = r10
            r24 = r11
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = r10
        L_0x0076:
            if (r4 == 0) goto L_0x0081
            java.lang.String r2 = "timeShiftBufferDepth"
            long r2 = m22413k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r27 = r2
            goto L_0x0083
        L_0x0081:
            r27 = r10
        L_0x0083:
            if (r4 == 0) goto L_0x008e
            java.lang.String r2 = "suggestedPresentationDelay"
            long r2 = m22413k(r7, r2, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r29 = r2
            goto L_0x0093
        L_0x008e:
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0093:
            java.lang.String r2 = "publishTime"
            long r31 = m22424v(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5 = 1
            if (r5 == r4) goto L_0x00a2
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00a4
        L_0x00a2:
            r2 = 0
        L_0x00a4:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r10 = 1
            if (r10 == r4) goto L_0x00af
            r36 = 0
            goto L_0x00b4
        L_0x00af:
            r36 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00b4:
            r33 = 0
            r11 = r1
            r40 = r4
            r41 = r5
            r4 = r36
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r42 = 0
            r43 = 0
        L_0x00c9:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0129
            if (r42 != 0) goto L_0x0102
            long r1 = m22419q(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = m22420r(r7, r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r45 = r1
            r11 = r3
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r133 = r23
            r64 = r24
            r44 = r40
            r2 = r41
            r42 = 1
        L_0x00f3:
            r65 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r69 = 0
            r81 = 1
            r24 = r9
            goto L_0x1339
        L_0x0102:
            r45 = r2
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r133 = r23
            r64 = r24
            r44 = r40
            r2 = r41
            r65 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r69 = 0
            r81 = 1
            r40 = r4
            r24 = r9
            r23 = r11
            goto L_0x1335
        L_0x0129:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r10 = "lang"
            if (r1 == 0) goto L_0x0189
            java.lang.String r1 = "moreInformationURL"
            r45 = r2
            r2 = 0
            java.lang.String r51 = m22417o(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r52 = m22417o(r7, r10, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0141:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r10 = "Title"
            boolean r10 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x0151
            java.lang.String r3 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x016e
        L_0x0151:
            java.lang.String r10 = "Source"
            boolean r10 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x015e
            java.lang.String r1 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x016e
        L_0x015e:
            java.lang.String r10 = "Copyright"
            boolean r10 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x016b
            java.lang.String r2 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x016e
        L_0x016b:
            m22410h(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x016e:
            boolean r10 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r7, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x0141
            com.google.ads.interactivemedia.v3.internal.xp r10 = new com.google.ads.interactivemedia.v3.internal.xp     // Catch:{ XmlPullParserException -> 0x13a6 }
            r47 = r10
            r48 = r3
            r49 = r1
            r50 = r2
            r47.<init>(r48, r49, r50, r51, r52)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r76 = r6
            r15 = r7
            r78 = r8
            r36 = r10
            goto L_0x01bf
        L_0x0189:
            r45 = r2
            java.lang.String r1 = "UTCTiming"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = "value"
            java.lang.String r2 = "schemeIdUri"
            if (r1 == 0) goto L_0x01a8
            r1 = 0
            java.lang.String r2 = r7.getAttributeValue(r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = r7.getAttributeValue(r1, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.yd r1 = new com.google.ads.interactivemedia.v3.internal.yd     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1.<init>(r2, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r37 = r1
            goto L_0x01ba
        L_0x01a8:
            java.lang.String r1 = "Location"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x01ce
            java.lang.String r1 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r38 = r1
        L_0x01ba:
            r76 = r6
            r15 = r7
            r78 = r8
        L_0x01bf:
            r79 = r12
            r74 = r13
            r1 = r14
            r133 = r23
            r64 = r24
            r44 = r40
            r2 = r41
            goto L_0x00f3
        L_0x01ce:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0244
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r47 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01df:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = "Latency"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0202
            java.lang.String r3 = "target"
            r10 = r1
            r39 = r2
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r47 = m22416n(r7, r3, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x01f8:
            r1 = r10
            r2 = r39
        L_0x01fb:
            r141 = r47
            r47 = r11
            r10 = r141
            goto L_0x021a
        L_0x0202:
            r10 = r1
            r39 = r2
            java.lang.String r1 = "PlaybackRate"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x01f8
            java.lang.String r1 = "min"
            float r1 = m22425w(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "max"
            float r2 = m22425w(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x01fb
        L_0x021a:
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r7, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x023d
            com.google.ads.interactivemedia.v3.internal.ya r3 = new com.google.ads.interactivemedia.v3.internal.ya     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.<init>(r10, r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r39 = r3
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r133 = r23
            r64 = r24
            r44 = r40
            r2 = r41
            r11 = r47
            goto L_0x00f3
        L_0x023d:
            r141 = r10
            r11 = r47
            r47 = r141
            goto L_0x01df
        L_0x0244:
            r47 = r11
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x130f
            if (r43 != 0) goto L_0x130f
            r1 = 0
            java.lang.String r49 = r7.getAttributeValue(r1, r9)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r1 = "start"
            long r50 = m22413k(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r52 = r4
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0267
            long r54 = r17 + r50
            goto L_0x0269
        L_0x0267:
            r54 = r4
        L_0x0269:
            java.lang.String r1 = "duration"
            long r56 = m22413k(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r58 = r4
            r61 = r12
            r62 = r13
            r63 = r14
            r12 = r45
            r14 = r47
            r48 = 0
            r60 = 0
        L_0x0289:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r64 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r64 == 0) goto L_0x02fc
            if (r60 != 0) goto L_0x02cb
            long r12 = m22419q(r7, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r14 = m22420r(r7, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r16 = r1
            r35 = r3
            r67 = r4
            r76 = r6
            r15 = r7
            r78 = r8
            r34 = r10
            r133 = r23
            r64 = r24
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r79 = r61
            r74 = r62
            r136 = r63
            r60 = 1
            r65 = 0
            r69 = 0
            r81 = 1
            r52 = r2
            r24 = r9
            r53 = r11
            goto L_0x127f
        L_0x02cb:
            r16 = r1
            r35 = r3
            r67 = r4
            r76 = r6
            r15 = r7
            r78 = r8
            r34 = r10
            r133 = r23
            r64 = r24
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r79 = r61
            r74 = r62
            r136 = r63
            r65 = 0
            r69 = 0
            r81 = 1
            r52 = r2
            r24 = r9
            r53 = r11
            r61 = r12
            r63 = r14
            goto L_0x127b
        L_0x02fc:
            java.lang.String r4 = "AdaptationSet"
            boolean r4 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r5 = "SegmentTemplate"
            r64 = r14
            java.lang.String r14 = "SegmentList"
            r65 = r12
            java.lang.String r12 = "SegmentBase"
            if (r4 == 0) goto L_0x0fd0
            r13 = -1
            int r68 = m22415m(r7, r9, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r4 = m22422t(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r13 = "mimeType"
            r69 = r1
            r1 = 0
            java.lang.String r13 = r7.getAttributeValue(r1, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r70 = r2
            java.lang.String r2 = "codecs"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r1 = "width"
            r71 = r3
            r3 = -1
            int r1 = m22415m(r7, r1, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r72 = r4
            java.lang.String r4 = "height"
            int r4 = m22415m(r7, r4, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = m22412j(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r73 = r5
            java.lang.String r5 = "audioSamplingRate"
            r74 = r11
            r11 = -1
            int r5 = m22415m(r7, r5, r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11 = 0
            java.lang.String r75 = r7.getAttributeValue(r11, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r76 = r14
            java.lang.String r14 = "label"
            java.lang.String r14 = r7.getAttributeValue(r11, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r77 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r78 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r79 = r12
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r12.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r80 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r81 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r86 = r1
            r85 = r2
            r83 = r4
            r90 = r13
            r87 = r48
            r88 = r58
            r13 = r64
            r1 = r65
            r4 = r75
            r82 = r77
            r75 = 0
            r84 = 0
            r77 = r3
            r3 = r72
            r72 = -1
        L_0x03a2:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r91 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r91 == 0) goto L_0x045f
            if (r84 != 0) goto L_0x0408
            long r1 = m22419q(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r13 = m22420r(r7, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r125 = r4
            r128 = r9
            r34 = r10
            r131 = r11
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r130 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r47 = r90
            r35 = -1
            r81 = 1
            r84 = 1
        L_0x03ef:
            r73 = r5
            r76 = r6
            r78 = r8
            r77 = r14
            r64 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            r5 = r82
            r65 = r12
            r24 = r15
            r15 = r7
            goto L_0x0e9d
        L_0x0408:
            r16 = r3
            r125 = r4
            r128 = r9
            r34 = r10
            r131 = r11
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r130 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r47 = r90
            r35 = -1
            r81 = 1
            r85 = r1
            r73 = r5
            r76 = r6
            r78 = r8
            r77 = r14
            r64 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            r1 = r88
        L_0x0456:
            r65 = r12
            r66 = r13
            r24 = r15
            r15 = r7
            goto L_0x0e93
        L_0x045f:
            r91 = r1
            java.lang.String r1 = "ContentProtection"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x04be
            android.util.Pair r1 = m22421s(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Object r2 = r1.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0477
            java.lang.Object r2 = r1.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            r75 = r2
            java.lang.String r75 = (java.lang.String) r75     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0477:
            java.lang.Object r2 = r1.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0482
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.jb r1 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb) r1     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0482:
            r125 = r4
            r128 = r9
            r34 = r10
            r131 = r11
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r130 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r47 = r90
            r1 = r91
            r35 = -1
            r81 = 1
            goto L_0x03ef
        L_0x04be:
            java.lang.String r1 = "ContentComponent"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x04e3
            r1 = 0
            java.lang.String r2 = r7.getAttributeValue(r1, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 != 0) goto L_0x04cf
            r4 = r2
            goto L_0x04d9
        L_0x04cf:
            if (r2 != 0) goto L_0x04d2
            goto L_0x04d9
        L_0x04d2:
            boolean r1 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.p367v3.internal.ary.m19464q(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x04d9:
            int r1 = m22422t(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r1 = m22407A(r3, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r1
            goto L_0x0482
        L_0x04e3:
            java.lang.String r1 = "Role"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0544
            java.lang.String r1 = "Role"
            com.google.ads.interactivemedia.v3.internal.xm r1 = m22411i(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x04f4:
            r16 = r3
            r125 = r4
            r128 = r9
            r34 = r10
            r131 = r11
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r130 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r1 = r88
            r47 = r90
            r85 = r91
            r35 = -1
            r81 = 1
            r73 = r5
            r76 = r6
            r78 = r8
            r77 = r14
            r64 = r24
            r79 = r61
            r74 = r62
            r61 = r65
            goto L_0x0456
        L_0x0544:
            java.lang.String r1 = "AudioChannelConfiguration"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0554
            int r1 = m22418p(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r72 = r1
            goto L_0x0482
        L_0x0554:
            java.lang.String r1 = "Accessibility"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0566
            java.lang.String r1 = "Accessibility"
            com.google.ads.interactivemedia.v3.internal.xm r1 = m22411i(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r14.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x04f4
        L_0x0566:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0574
            com.google.ads.interactivemedia.v3.internal.xm r1 = m22411i(r7, r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r12.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x04f4
        L_0x0574:
            r2 = r24
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x05da
            com.google.ads.interactivemedia.v3.internal.xm r1 = m22411i(r7, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r16 = r3
            r125 = r4
            r128 = r9
            r34 = r10
            r131 = r11
            r24 = r15
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r140 = r73
            r130 = r74
            r138 = r76
            r122 = r77
            r4 = r78
            r139 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r47 = r90
            r85 = r91
            r35 = -1
            r81 = 1
            r64 = r2
            r73 = r5
            r76 = r6
            r15 = r7
            r78 = r8
            r77 = r14
            r79 = r61
            r74 = r62
            r61 = r65
            r1 = r88
            r65 = r12
            r66 = r13
            goto L_0x0e93
        L_0x05da:
            java.lang.String r1 = "Representation"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r24 = r15
            java.lang.String r15 = "InbandEventStream"
            if (r1 == 0) goto L_0x0d5b
            r16 = r15
            r1 = 0
            java.lang.String r15 = r7.getAttributeValue(r1, r9)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r1 = "bandwidth"
            r93 = r13
            r13 = -1
            int r1 = m22415m(r7, r1, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r13 = "mimeType"
            r94 = r14
            r14 = r90
            java.lang.String r13 = m22417o(r7, r13, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r90 = r1
            java.lang.String r1 = "codecs"
            r95 = r2
            r2 = r85
            java.lang.String r1 = m22417o(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r85 = r1
            java.lang.String r1 = "width"
            r96 = r2
            r2 = r86
            int r1 = m22415m(r7, r1, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r86 = r1
            java.lang.String r1 = "height"
            r97 = r4
            r4 = r83
            int r1 = m22415m(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r83 = r3
            r3 = r81
            r81 = r15
            float r15 = m22412j(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r98 = r1
            java.lang.String r1 = "audioSamplingRate"
            r99 = r4
            r4 = r80
            int r1 = m22415m(r7, r1, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r80 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r105 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r106 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.<init>(r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r100 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.<init>(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r110 = r1
            r109 = r2
            r111 = r12
            r103 = r14
            r104 = r15
            r107 = r72
            r108 = r87
            r1 = r88
            r14 = r91
            r12 = r93
            r101 = 0
            r102 = 0
        L_0x066e:
            r7.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r112 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r112 == 0) goto L_0x0757
            if (r102 != 0) goto L_0x06ef
            long r14 = m22419q(r7, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r12 = m22420r(r7, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r128 = r9
            r34 = r10
            r131 = r11
            r145 = r13
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r134 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r70 = r96
            r125 = r97
            r118 = r98
            r52 = r99
            r47 = r103
            r9 = r107
            r69 = r109
            r119 = r110
            r35 = -1
            r102 = 1
            r71 = r3
            r53 = r4
            r73 = r5
            r76 = r6
            r77 = r14
            r3 = r16
        L_0x06cf:
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r66 = r93
            r5 = r101
            r4 = r105
            r6 = r106
            r65 = r111
            r15 = r7
            r14 = r8
            r93 = r12
            r12 = r95
        L_0x06e9:
            r7 = r100
            r8 = r104
            goto L_0x0a04
        L_0x06ef:
            r128 = r9
            r34 = r10
            r131 = r11
            r145 = r13
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r134 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r70 = r96
            r125 = r97
            r118 = r98
            r52 = r99
            r47 = r103
            r69 = r109
            r119 = r110
            r35 = -1
            r71 = r3
            r53 = r4
            r73 = r5
            r76 = r6
            r77 = r14
            r3 = r16
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r66 = r93
            r4 = r105
            r6 = r106
            r65 = r111
            r15 = r7
            r14 = r8
            r93 = r12
            r12 = r95
            r7 = r100
            r8 = r104
            goto L_0x0a00
        L_0x0757:
            r112 = r3
            java.lang.String r3 = "AudioChannelConfiguration"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x07b3
            int r107 = m22418p(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r128 = r9
            r34 = r10
            r131 = r11
            r145 = r13
            r3 = r16
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r134 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r70 = r96
            r125 = r97
            r118 = r98
            r52 = r99
            r47 = r103
            r9 = r107
            r69 = r109
            r119 = r110
            r71 = r112
            r35 = -1
            r53 = r4
            r73 = r5
            r76 = r6
            r77 = r14
            goto L_0x06cf
        L_0x07b3:
            r3 = r79
            boolean r79 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r79 == 0) goto L_0x0836
            r79 = r3
            r3 = r108
            com.google.ads.interactivemedia.v3.internal.xy r3 = (com.google.ads.interactivemedia.p367v3.internal.C7431xy) r3     // Catch:{ XmlPullParserException -> 0x0831 }
            r113 = r12
            r12 = r143
            com.google.ads.interactivemedia.v3.internal.xy r108 = r12.mo16766c(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r128 = r9
            r34 = r10
            r131 = r11
            r145 = r13
            r3 = r16
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r134 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r12 = r95
            r70 = r96
            r125 = r97
            r118 = r98
            r52 = r99
            r47 = r103
            r9 = r107
            r69 = r109
            r119 = r110
            r71 = r112
            r35 = -1
            r53 = r4
            r73 = r5
            r76 = r6
            r77 = r14
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r66 = r93
            r5 = r101
            r4 = r105
            r6 = r106
            r65 = r111
            r93 = r113
            r15 = r7
            r14 = r8
            goto L_0x06e9
        L_0x0831:
            r0 = move-exception
            r12 = r143
            goto L_0x13a7
        L_0x0836:
            r79 = r3
            r113 = r12
            r12 = r143
            r3 = r76
            boolean r76 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r7, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r76 == 0) goto L_0x08dc
            long r114 = m22419q(r7, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r76 = r108
            com.google.ads.interactivemedia.v3.internal.xv r76 = (com.google.ads.interactivemedia.p367v3.internal.C7428xv) r76     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2 = r69
            r117 = r86
            r116 = r90
            r118 = r98
            r69 = r109
            r119 = r110
            r90 = r85
            r85 = r91
            r91 = 0
            r1 = r143
            r120 = r2
            r121 = r70
            r92 = r95
            r70 = r96
            r2 = r7
            r124 = r71
            r122 = r77
            r123 = r83
            r71 = r112
            r77 = r3
            r3 = r76
            r44 = r40
            r144 = r41
            r40 = r52
            r126 = r73
            r125 = r97
            r52 = r99
            r53 = r4
            r73 = r5
            r4 = r54
            r76 = r6
            r127 = r7
            r6 = r56
            r129 = r8
            r128 = r9
            r8 = r14
            r34 = r10
            r131 = r11
            r133 = r23
            r23 = r47
            r130 = r74
            r132 = r92
            r10 = r114
            r145 = r13
            r74 = r62
            r134 = r79
            r47 = r103
            r35 = -1
            r79 = r61
            r61 = r65
            r66 = r93
            r65 = r111
            r93 = r113
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.xv r108 = r1.mo16767d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r16
            r136 = r63
            r63 = r64
            r137 = r77
            r135 = r78
            r7 = r100
            r5 = r101
            r8 = r104
            r4 = r105
            r6 = r106
            r9 = r107
            r1 = r114
            r12 = r132
            r77 = r14
            r15 = r127
            r14 = r129
            goto L_0x0a04
        L_0x08dc:
            r76 = r6
            r129 = r8
            r128 = r9
            r34 = r10
            r131 = r11
            r145 = r13
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r122 = r77
            r134 = r79
            r123 = r83
            r117 = r86
            r116 = r90
            r132 = r95
            r70 = r96
            r125 = r97
            r118 = r98
            r52 = r99
            r47 = r103
            r69 = r109
            r119 = r110
            r71 = r112
            r35 = -1
            r77 = r3
            r53 = r4
            r73 = r5
            r79 = r61
            r74 = r62
            r61 = r65
            r90 = r85
            r85 = r91
            r66 = r93
            r65 = r111
            r93 = r113
            r13 = r7
            r11 = r126
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r13, r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0979
            long r91 = m22419q(r13, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r108
            com.google.ads.interactivemedia.v3.internal.xw r3 = (com.google.ads.interactivemedia.p367v3.internal.C7429xw) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r143
            r2 = r13
            r4 = r73
            r5 = r54
            r7 = r56
            r9 = r14
            r95 = r14
            r15 = r11
            r11 = r91
            r126 = r15
            r136 = r63
            r63 = r64
            r137 = r77
            r135 = r78
            r77 = r95
            r15 = r13
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.xw r108 = r1.mo16768e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r16
            r1 = r91
            r7 = r100
            r5 = r101
            r8 = r104
            r4 = r105
        L_0x096f:
            r6 = r106
            r9 = r107
            r14 = r129
            r12 = r132
            goto L_0x0a04
        L_0x0979:
            r126 = r11
            r136 = r63
            r63 = r64
            r137 = r77
            r135 = r78
            r77 = r14
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x09b5
            android.util.Pair r3 = m22421s(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Object r4 = r3.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 == 0) goto L_0x099c
            java.lang.Object r4 = r3.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            r101 = r4
            java.lang.String r101 = (java.lang.String) r101     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x099c:
            java.lang.Object r4 = r3.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 == 0) goto L_0x09aa
            java.lang.Object r3 = r3.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.jb r3 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = r105
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x09ac
        L_0x09aa:
            r4 = r105
        L_0x09ac:
            r3 = r16
            r7 = r100
            r5 = r101
            r8 = r104
            goto L_0x096f
        L_0x09b5:
            r4 = r105
            r3 = r16
            boolean r5 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r5 == 0) goto L_0x09d1
            com.google.ads.interactivemedia.v3.internal.xm r5 = m22411i(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6 = r106
            r6.add(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r7 = r100
            r8 = r104
            r14 = r129
        L_0x09ce:
            r12 = r132
            goto L_0x0a00
        L_0x09d1:
            r6 = r106
            r14 = r129
            boolean r5 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r5 == 0) goto L_0x09e7
            com.google.ads.interactivemedia.v3.internal.xm r5 = m22411i(r15, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r7 = r100
            r7.add(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r8 = r104
            goto L_0x09ce
        L_0x09e7:
            r7 = r100
            r12 = r132
            boolean r5 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r5 == 0) goto L_0x09fb
            com.google.ads.interactivemedia.v3.internal.xm r5 = m22411i(r15, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r8 = r104
            r8.add(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0a00
        L_0x09fb:
            r8 = r104
            m22410h(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0a00:
            r5 = r101
            r9 = r107
        L_0x0a04:
            java.lang.String r10 = "Representation"
            boolean r10 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x0cee
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r145)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0a19
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18354f(r90)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0a16:
            r10 = r145
            goto L_0x0a55
        L_0x0a19:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18350b(r145)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0a24
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18353e(r90)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0a16
        L_0x0a24:
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18351c(r145)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0a3b
            java.lang.String r1 = "application/x-rawcc"
            r10 = r145
            boolean r1 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0a39
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18355g(r90)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0a55
        L_0x0a39:
            r1 = r10
            goto L_0x0a55
        L_0x0a3b:
            r10 = r145
            java.lang.String r1 = "application/mp4"
            boolean r1 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0a54
            java.lang.String r1 = com.google.ads.interactivemedia.p367v3.internal.adz.m18356h(r90)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "text/vtt"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0a55
            java.lang.String r1 = "application/x-mp4-vtt"
            goto L_0x0a55
        L_0x0a54:
            r1 = 0
        L_0x0a55:
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0a98
            r1 = 0
        L_0x0a5e:
            int r2 = r8.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 >= r2) goto L_0x0a96
            java.lang.Object r2 = r8.get(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xm r2 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r2     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = r2.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r11 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r11 = r11.equals(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r11 == 0) goto L_0x0a7e
            java.lang.String r11 = "JOC"
            java.lang.String r13 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r11 = r11.equals(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r11 != 0) goto L_0x0a90
        L_0x0a7e:
            java.lang.String r11 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r3 = r11.equals(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0a93
            java.lang.String r3 = "ec+3"
            java.lang.String r2 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r2 = r3.equals(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0a93
        L_0x0a90:
            java.lang.String r1 = "audio/eac3-joc"
            goto L_0x0a98
        L_0x0a93:
            int r1 = r1 + 1
            goto L_0x0a5e
        L_0x0a96:
            java.lang.String r1 = "audio/eac3"
        L_0x0a98:
            r2 = 0
        L_0x0a99:
            int r3 = r24.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r11 = "urn:mpeg:dash:role:2011"
            if (r2 >= r3) goto L_0x0ac6
            r13 = r24
            java.lang.Object r3 = r13.get(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xm r3 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            r132 = r12
            java.lang.String r12 = r3.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r12 = r11.equalsIgnoreCase(r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r12 == 0) goto L_0x0abf
            java.lang.String r12 = "main"
            java.lang.String r3 = r3.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r3 = r12.equals(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0abf
            r2 = 1
            goto L_0x0acb
        L_0x0abf:
            int r2 = r2 + 1
            r24 = r13
            r12 = r132
            goto L_0x0a99
        L_0x0ac6:
            r132 = r12
            r13 = r24
            r2 = 0
        L_0x0acb:
            r129 = r14
            r3 = 0
            r12 = 0
        L_0x0acf:
            int r14 = r13.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 >= r14) goto L_0x0af1
            java.lang.Object r14 = r13.get(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xm r14 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r14     // Catch:{ XmlPullParserException -> 0x13a6 }
            r24 = r13
            java.lang.String r13 = r14.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r13 = r11.equalsIgnoreCase(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r13 == 0) goto L_0x0aec
            java.lang.String r13 = r14.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r13 = m22423u(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r12 = r12 | r13
        L_0x0aec:
            int r3 = r3 + 1
            r13 = r24
            goto L_0x0acf
        L_0x0af1:
            r24 = r13
            r3 = 0
            r13 = 0
        L_0x0af5:
            int r14 = r94.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 >= r14) goto L_0x0b75
            r14 = r94
            java.lang.Object r16 = r14.get(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r127 = r15
            r15 = r16
            com.google.ads.interactivemedia.v3.internal.xm r15 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r15     // Catch:{ XmlPullParserException -> 0x13a6 }
            r106 = r6
            java.lang.String r6 = r15.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r6 = r11.equalsIgnoreCase(r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b1b
            java.lang.String r6 = r15.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r6 = m22423u(r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r13 = r13 | r6
            r145 = r11
            goto L_0x0b6a
        L_0x0b1b:
            java.lang.String r6 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            r145 = r11
            java.lang.String r11 = r15.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r6 = r6.equalsIgnoreCase(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b6a
            java.lang.String r6 = r15.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 != 0) goto L_0x0b2d
        L_0x0b2b:
            r6 = 0
            goto L_0x0b69
        L_0x0b2d:
            int r11 = r6.hashCode()     // Catch:{ XmlPullParserException -> 0x13a6 }
            switch(r11) {
                case 49: goto L_0x0b5f;
                case 50: goto L_0x0b54;
                case 51: goto L_0x0b4a;
                case 52: goto L_0x0b3f;
                case 53: goto L_0x0b34;
                case 54: goto L_0x0b35;
                default: goto L_0x0b34;
            }     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0b34:
            goto L_0x0b2b
        L_0x0b35:
            java.lang.String r11 = "6"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b2b
            r6 = 1
            goto L_0x0b69
        L_0x0b3f:
            java.lang.String r11 = "4"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b2b
            r6 = 8
            goto L_0x0b69
        L_0x0b4a:
            java.lang.String r11 = "3"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b2b
            r6 = 4
            goto L_0x0b69
        L_0x0b54:
            java.lang.String r11 = "2"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b2b
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0b69
        L_0x0b5f:
            java.lang.String r11 = "1"
            boolean r6 = r6.equals(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0b2b
            r6 = 512(0x200, float:7.175E-43)
        L_0x0b69:
            r13 = r13 | r6
        L_0x0b6a:
            int r3 = r3 + 1
            r11 = r145
            r94 = r14
            r6 = r106
            r15 = r127
            goto L_0x0af5
        L_0x0b75:
            r106 = r6
            r127 = r15
            r14 = r94
            r3 = r12 | r13
            int r6 = m22427y(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r3 | r6
            int r6 = m22427y(r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r3 | r6
            com.google.ads.interactivemedia.v3.internal.cx r6 = new com.google.ads.interactivemedia.v3.internal.cx     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11 = r81
            r6.mo15617S(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6.mo15609K(r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6.mo15630ae(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r12 = r90
            r6.mo15607I(r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r13 = r116
            r6.mo15624Z(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6.mo15632ag(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6.mo15628ac(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15 = r125
            r6.mo15620V(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.adz.m18350b(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0bc4
            r2 = r117
            r6.mo15635aj(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r118
            r6.mo15615Q(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r80
            r6.mo15614P(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0bc1:
            r7 = 1
            goto L_0x0c95
        L_0x0bc4:
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.adz.m18349a(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0bd3
            r6.mo15606H(r9)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r119
            r6.mo15631af(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0bc1
        L_0x0bd3:
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.adz.m18351c(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0bc1
            java.lang.String r2 = "application/cea-608"
            boolean r2 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x0c38
            r1 = 0
        L_0x0be2:
            int r2 = r14.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 >= r2) goto L_0x0c36
            java.lang.Object r2 = r14.get(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xm r2 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r2     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r7 = r2.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r3 = r3.equals(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0c32
            java.lang.String r3 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0c32
            java.util.regex.Pattern r7 = f24316b     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.regex.Matcher r3 = r7.matcher(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r7 = r3.matches()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r7 == 0) goto L_0x0c13
            r7 = 1
            java.lang.String r1 = r3.group(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0c92
        L_0x0c13:
            r7 = 1
            java.lang.String r3 = "MpdParser"
            java.lang.String r8 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r2 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r9 = r2.length()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r9 == 0) goto L_0x0c29
            java.lang.String r2 = r8.concat(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0c2e
        L_0x0c29:
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2.<init>(r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0c2e:
            android.util.Log.w(r3, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0c33
        L_0x0c32:
            r7 = 1
        L_0x0c33:
            int r1 = r1 + 1
            goto L_0x0be2
        L_0x0c36:
            r7 = 1
            goto L_0x0c91
        L_0x0c38:
            r7 = 1
            java.lang.String r2 = "application/cea-708"
            boolean r1 = r2.equals(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0c91
            r1 = 0
        L_0x0c42:
            int r2 = r14.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 >= r2) goto L_0x0c91
            java.lang.Object r2 = r14.get(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xm r2 = (com.google.ads.interactivemedia.p367v3.internal.C7419xm) r2     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r8 = r2.f24320a     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r3 = r3.equals(r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0c8e
            java.lang.String r3 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0c8e
            java.util.regex.Pattern r8 = f24317c     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.regex.Matcher r3 = r8.matcher(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r8 = r3.matches()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r8 == 0) goto L_0x0c71
            java.lang.String r1 = r3.group(r7)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0c92
        L_0x0c71:
            java.lang.String r3 = "MpdParser"
            java.lang.String r8 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r2 = r2.f24321b     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r9 = r2.length()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r9 == 0) goto L_0x0c86
            java.lang.String r2 = r8.concat(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0c8b
        L_0x0c86:
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2.<init>(r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0c8b:
            android.util.Log.w(r3, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0c8e:
            int r1 = r1 + 1
            goto L_0x0c42
        L_0x0c91:
            r13 = -1
        L_0x0c92:
            r6.mo15604F(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0c95:
            com.google.ads.interactivemedia.v3.internal.cy r101 = r6.mo15625a()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r108 == 0) goto L_0x0c9e
            r103 = r108
            goto L_0x0cb1
        L_0x0c9e:
            com.google.ads.interactivemedia.v3.internal.xy r1 = new com.google.ads.interactivemedia.v3.internal.xy     // Catch:{ XmlPullParserException -> 0x13a6 }
            r110 = 0
            r111 = 1
            r113 = 0
            r115 = 0
            r117 = 0
            r109 = r1
            r109.<init>(r110, r111, r113, r115, r117)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r103 = r1
        L_0x0cb1:
            com.google.ads.interactivemedia.v3.internal.xk r1 = new com.google.ads.interactivemedia.v3.internal.xk     // Catch:{ XmlPullParserException -> 0x13a6 }
            r100 = r1
            r102 = r93
            r104 = r5
            r105 = r4
            r100.<init>(r101, r102, r103, r104, r105, r106)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.cy r2 = r1.f24308a     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = r2.f21812l     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r2 = com.google.ads.interactivemedia.p367v3.internal.adz.m18358j(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r6 = r123
            int r2 = m22407A(r6, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r122
            r3.add(r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r122 = r3
            r77 = r14
            r125 = r15
            r13 = r66
            r5 = r82
            r140 = r126
            r15 = r127
            r78 = r129
            r64 = r132
            r139 = r134
            r4 = r135
            r138 = r137
            r81 = 1
            r3 = r2
            goto L_0x0e9b
        L_0x0cee:
            r127 = r15
            r13 = r145
            r16 = r3
            r105 = r4
            r101 = r5
            r106 = r6
            r100 = r7
            r104 = r8
            r107 = r9
            r95 = r12
            r8 = r14
            r10 = r34
            r103 = r47
            r99 = r52
            r4 = r53
            r64 = r63
            r111 = r65
            r109 = r69
            r96 = r70
            r3 = r71
            r5 = r73
            r6 = r76
            r14 = r77
            r91 = r85
            r85 = r90
            r12 = r93
            r90 = r116
            r86 = r117
            r98 = r118
            r110 = r119
            r69 = r120
            r70 = r121
            r77 = r122
            r83 = r123
            r71 = r124
            r97 = r125
            r73 = r126
            r7 = r127
            r9 = r128
            r11 = r131
            r78 = r135
            r63 = r136
            r76 = r137
            r47 = r23
            r52 = r40
            r40 = r44
            r93 = r66
            r23 = r133
            r41 = r144
            r65 = r61
            r62 = r74
            r61 = r79
            r74 = r130
            r79 = r134
            goto L_0x066e
        L_0x0d5b:
            r132 = r2
            r129 = r8
            r128 = r9
            r34 = r10
            r131 = r11
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r136 = r63
            r63 = r64
            r120 = r69
            r121 = r70
            r124 = r71
            r126 = r73
            r130 = r74
            r137 = r76
            r122 = r77
            r135 = r78
            r134 = r79
            r53 = r80
            r71 = r81
            r52 = r83
            r70 = r85
            r69 = r86
            r47 = r90
            r85 = r91
            r35 = -1
            r81 = 1
            r73 = r5
            r76 = r6
            r79 = r61
            r74 = r62
            r61 = r65
            r6 = r3
            r65 = r12
            r66 = r13
            r3 = r15
            r15 = r4
            r12 = r7
            r13 = r134
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r12, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0dda
            r1 = r87
            com.google.ads.interactivemedia.v3.internal.xy r1 = (com.google.ads.interactivemedia.p367v3.internal.C7431xy) r1     // Catch:{ XmlPullParserException -> 0x0dd5 }
            r10 = r143
            com.google.ads.interactivemedia.v3.internal.xy r87 = r10.mo16766c(r12, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r6
            r139 = r13
            r77 = r14
            r125 = r15
            r13 = r66
            r5 = r82
            r1 = r85
            r140 = r126
            r78 = r129
            r64 = r132
            r4 = r135
            r138 = r137
            r15 = r12
            goto L_0x0e9d
        L_0x0dd5:
            r0 = move-exception
            r10 = r143
            goto L_0x13a7
        L_0x0dda:
            r10 = r143
            r11 = r137
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r12, r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x0e1d
            r1 = r88
            long r88 = m22419q(r12, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r87
            com.google.ads.interactivemedia.v3.internal.xv r3 = (com.google.ads.interactivemedia.p367v3.internal.C7428xv) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r143
            r2 = r12
            r4 = r54
            r16 = r6
            r6 = r56
            r8 = r85
            r138 = r11
            r125 = r15
            r15 = r10
            r10 = r88
            r15 = r12
            r139 = r13
            r64 = r132
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.xv r87 = r1.mo16767d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r77 = r14
            r3 = r16
            r13 = r66
            r5 = r82
            r1 = r85
            r140 = r126
            r78 = r129
        L_0x0e19:
            r4 = r135
            goto L_0x0e9d
        L_0x0e1d:
            r16 = r6
            r138 = r11
            r139 = r13
            r125 = r15
            r1 = r88
            r64 = r132
            r15 = r12
            r13 = r126
            boolean r4 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 == 0) goto L_0x0e5c
            long r88 = m22419q(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r87
            com.google.ads.interactivemedia.v3.internal.xw r3 = (com.google.ads.interactivemedia.p367v3.internal.C7429xw) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r143
            r2 = r15
            r4 = r73
            r5 = r54
            r7 = r56
            r9 = r85
            r11 = r88
            r140 = r13
            r77 = r14
            r78 = r129
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.xw r87 = r1.mo16768e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = r16
            r13 = r66
            r5 = r82
            r1 = r85
            goto L_0x0e19
        L_0x0e5c:
            r140 = r13
            r77 = r14
            r78 = r129
            boolean r4 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 == 0) goto L_0x0e72
            com.google.ads.interactivemedia.v3.internal.xm r3 = m22411i(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = r135
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0e93
        L_0x0e72:
            r4 = r135
            java.lang.String r3 = "Label"
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0e8a
            java.lang.String r3 = "Label"
            java.lang.String r3 = m22414l(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r88 = r1
            r5 = r3
            r3 = r16
            r13 = r66
            goto L_0x0e9b
        L_0x0e8a:
            boolean r3 = com.google.ads.interactivemedia.p367v3.internal.atv.m19614f(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r3 == 0) goto L_0x0e93
            m22410h(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0e93:
            r88 = r1
            r3 = r16
            r13 = r66
            r5 = r82
        L_0x0e9b:
            r1 = r85
        L_0x0e9d:
            java.lang.String r6 = "AdaptationSet"
            boolean r6 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r6)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x0f81
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r2 = r122.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2 = 0
        L_0x0eaf:
            int r6 = r122.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 >= r6) goto L_0x0f58
            r6 = r122
            java.lang.Object r7 = r6.get(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xk r7 = (com.google.ads.interactivemedia.p367v3.internal.C7417xk) r7     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.cy r8 = r7.f24308a     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.cx r8 = r8.mo15636a()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r5 == 0) goto L_0x0ec8
            r8.mo15619U(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0ec8:
            java.lang.String r9 = r7.f24311d     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r9 != 0) goto L_0x0ece
            r9 = r75
        L_0x0ece:
            java.util.ArrayList r10 = r7.f24312e     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11 = r131
            r10.addAll(r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r12 = r10.isEmpty()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r12 != 0) goto L_0x0f1b
            int r12 = r10.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r12 = r12 + -1
        L_0x0ee1:
            if (r12 < 0) goto L_0x0f10
            java.lang.Object r13 = r10.get(r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.jb r13 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb) r13     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r14 = r13.mo16056b()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r145 = r5
            if (r14 != 0) goto L_0x0f0b
            r14 = 0
        L_0x0ef2:
            int r5 = r10.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r14 >= r5) goto L_0x0f0b
            java.lang.Object r5 = r10.get(r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.jb r5 = (com.google.ads.interactivemedia.p367v3.internal.C7030jb) r5     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r5 = r5.mo16055a(r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r5 == 0) goto L_0x0f08
            r10.remove(r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0f0b
        L_0x0f08:
            int r14 = r14 + 1
            goto L_0x0ef2
        L_0x0f0b:
            int r12 = r12 + -1
            r5 = r145
            goto L_0x0ee1
        L_0x0f10:
            r145 = r5
            com.google.ads.interactivemedia.v3.internal.jc r5 = new com.google.ads.interactivemedia.v3.internal.jc     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5.<init>((java.lang.String) r9, (java.util.List) r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r8.mo15610L(r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0f1d
        L_0x0f1b:
            r145 = r5
        L_0x0f1d:
            java.util.ArrayList r5 = r7.f24313f     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5.addAll(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            long r9 = r7.f24314g     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.cy r8 = r8.mo15625a()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r9 = r7.f24309b     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xz r7 = r7.f24310c     // Catch:{ XmlPullParserException -> 0x13a6 }
            boolean r10 = r7 instanceof com.google.ads.interactivemedia.p367v3.internal.C7431xy     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x0f38
            com.google.ads.interactivemedia.v3.internal.xs r10 = new com.google.ads.interactivemedia.v3.internal.xs     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xy r7 = (com.google.ads.interactivemedia.p367v3.internal.C7431xy) r7     // Catch:{ XmlPullParserException -> 0x13a6 }
            r10.<init>(r8, r9, r7, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x0f43
        L_0x0f38:
            boolean r10 = r7 instanceof com.google.ads.interactivemedia.p367v3.internal.C7427xu     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r10 == 0) goto L_0x0f50
            com.google.ads.interactivemedia.v3.internal.xr r10 = new com.google.ads.interactivemedia.v3.internal.xr     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xu r7 = (com.google.ads.interactivemedia.p367v3.internal.C7427xu) r7     // Catch:{ XmlPullParserException -> 0x13a6 }
            r10.<init>(r8, r9, r7, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0f43:
            r1.add(r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r2 = r2 + 1
            r5 = r145
            r122 = r6
            r131 = r11
            goto L_0x0eaf
        L_0x0f50:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x0f58:
            com.google.ads.interactivemedia.v3.internal.xi r2 = new com.google.ads.interactivemedia.v3.internal.xi     // Catch:{ XmlPullParserException -> 0x13a6 }
            r67 = r2
            r69 = r3
            r70 = r1
            r71 = r77
            r72 = r65
            r67.<init>(r68, r69, r70, r71, r72, r73)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r14 = r130
            r14.add(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r53 = r14
            r16 = r120
            r52 = r121
            r35 = r124
            r24 = r128
            r65 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r69 = 0
            goto L_0x127b
        L_0x0f81:
            r145 = r5
            r82 = r145
            r7 = r15
            r15 = r24
            r10 = r34
            r90 = r47
            r83 = r52
            r80 = r53
            r24 = r64
            r12 = r65
            r86 = r69
            r85 = r70
            r81 = r71
            r5 = r73
            r6 = r76
            r14 = r77
            r8 = r78
            r69 = r120
            r70 = r121
            r77 = r122
            r71 = r124
            r9 = r128
            r11 = r131
            r76 = r138
            r73 = r140
            r78 = r4
            r47 = r23
            r52 = r40
            r40 = r44
            r65 = r61
            r64 = r63
            r62 = r74
            r61 = r79
            r4 = r125
            r74 = r130
            r23 = r133
            r63 = r136
            r79 = r139
            r41 = r144
            goto L_0x03a2
        L_0x0fd0:
            r120 = r1
            r121 = r2
            r124 = r3
            r140 = r5
            r76 = r6
            r15 = r7
            r78 = r8
            r128 = r9
            r34 = r10
            r139 = r12
            r138 = r14
            r133 = r23
            r44 = r40
            r144 = r41
            r23 = r47
            r40 = r52
            r79 = r61
            r74 = r62
            r136 = r63
            r63 = r64
            r61 = r65
            r81 = 1
            r14 = r11
            r64 = r24
            java.lang.String r1 = "EventStream"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x11b5
            java.lang.String r1 = ""
            r12 = r121
            java.lang.String r1 = m22417o(r15, r12, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = ""
            r13 = r124
            java.lang.String r10 = m22417o(r15, r13, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "timescale"
            r3 = 1
            long r52 = m22416n(r15, r2, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2 = 512(0x200, float:7.175E-43)
            r9.<init>(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x102a:
            r15.next()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "Event"
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x114a
            r7 = r128
            r5 = 0
            long r71 = m22416n(r15, r7, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "duration"
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r65 = m22416n(r15, r2, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "presentationTime"
            long r82 = m22416n(r15, r2, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r67 = 1000(0x3e8, double:4.94E-321)
            r69 = r52
            long r84 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r65, r67, r69)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r67 = 1000000(0xf4240, double:4.940656E-318)
            r65 = r82
            r69 = r52
            long r65 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18496N(r65, r67, r69)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "messageData"
            r8 = 0
            java.lang.String r2 = m22417o(r15, r2, r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r9.reset()     // Catch:{ XmlPullParserException -> 0x13a6 }
            org.xmlpull.v1.XmlSerializer r3 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.nio.charset.Charset r4 = com.google.ads.interactivemedia.p367v3.internal.apv.f21364b     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r4 = r4.name()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.setOutput(r9, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r15.nextToken()     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x107b:
            java.lang.String r4 = "Event"
            boolean r4 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 != 0) goto L_0x110a
            int r4 = r15.getEventType()     // Catch:{ XmlPullParserException -> 0x13a6 }
            switch(r4) {
                case 0: goto L_0x10fb;
                case 1: goto L_0x10f6;
                case 2: goto L_0x10d1;
                case 3: goto L_0x10c5;
                case 4: goto L_0x10bd;
                case 5: goto L_0x10b5;
                case 6: goto L_0x10ad;
                case 7: goto L_0x10a5;
                case 8: goto L_0x109d;
                case 9: goto L_0x1095;
                case 10: goto L_0x108c;
                default: goto L_0x108a;
            }     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x108a:
            goto L_0x1103
        L_0x108c:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.docdecl(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x1095:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.comment(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x109d:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.processingInstruction(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10a5:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.ignorableWhitespace(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10ad:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.entityRef(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10b5:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.cdsect(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10bd:
            java.lang.String r4 = r15.getText()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.text(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10c5:
            java.lang.String r4 = r15.getNamespace()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r5 = r15.getName()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.endTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x1103
        L_0x10d1:
            java.lang.String r4 = r15.getNamespace()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r5 = r15.getName()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.startTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = 0
        L_0x10dd:
            int r5 = r15.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 >= r5) goto L_0x1103
            java.lang.String r5 = r15.getAttributeNamespace(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r6 = r15.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r8 = r15.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.attribute(r5, r6, r8)     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r4 = r4 + 1
            r8 = 0
            goto L_0x10dd
        L_0x10f6:
            r3.endDocument()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r8 = 0
            goto L_0x1103
        L_0x10fb:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r33)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r8 = 0
            r3.startDocument(r8, r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x1103:
            r15.nextToken()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r5 = 0
            goto L_0x107b
        L_0x110a:
            r3.flush()     // Catch:{ XmlPullParserException -> 0x13a6 }
            byte[] r3 = r9.toByteArray()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Long r5 = java.lang.Long.valueOf(r65)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x111e
            byte[] r2 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18555y(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r16 = r2
            goto L_0x1120
        L_0x111e:
            r16 = r3
        L_0x1120:
            com.google.ads.interactivemedia.v3.internal.rc r6 = new com.google.ads.interactivemedia.v3.internal.rc     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2 = r6
            r121 = r12
            r124 = r13
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r1
            r4 = r10
            r12 = r5
            r13 = r6
            r65 = 0
            r5 = r84
            r24 = r7
            r130 = r14
            r14 = r8
            r7 = r71
            r35 = r9
            r9 = r16
            r2.<init>(r3, r4, r5, r7, r9)     // Catch:{ XmlPullParserException -> 0x13a6 }
            android.util.Pair r2 = android.util.Pair.create(r12, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r11.add(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x115a
        L_0x114a:
            r35 = r9
            r121 = r12
            r124 = r13
            r130 = r14
            r24 = r128
            r14 = 0
            r65 = 0
            m22410h(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x115a:
            java.lang.String r2 = "EventStream"
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x11a9
            int r2 = r11.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            long[] r2 = new long[r2]     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r3 = r11.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.rc[] r3 = new com.google.ads.interactivemedia.p367v3.internal.C7247rc[r3]     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = 0
        L_0x116f:
            int r5 = r11.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r4 >= r5) goto L_0x118e
            java.lang.Object r5 = r11.get(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Object r6 = r5.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ XmlPullParserException -> 0x13a6 }
            long r6 = r6.longValue()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r2[r4] = r6     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Object r5 = r5.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.rc r5 = (com.google.ads.interactivemedia.p367v3.internal.C7247rc) r5     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3[r4] = r5     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r4 = r4 + 1
            goto L_0x116f
        L_0x118e:
            com.google.ads.interactivemedia.v3.internal.xn r4 = new com.google.ads.interactivemedia.v3.internal.xn     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4.<init>(r1, r10, r2, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r12 = r120
            r12.add(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r16 = r12
            r69 = r14
            r52 = r121
            r35 = r124
            r53 = r130
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x127b
        L_0x11a9:
            r128 = r24
            r9 = r35
            r12 = r121
            r13 = r124
            r14 = r130
            goto L_0x102a
        L_0x11b5:
            r130 = r14
            r12 = r120
            r24 = r128
            r14 = 0
            r65 = 0
            r1 = r139
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x11e5
            r13 = r15
            r15 = r143
            com.google.ads.interactivemedia.v3.internal.xy r1 = r15.mo16766c(r13, r14)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r48 = r1
            r16 = r12
            r15 = r13
            r69 = r14
            r12 = r61
            r14 = r63
            r52 = r121
            r35 = r124
            r53 = r130
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x127f
        L_0x11e5:
            r13 = r15
            r15 = r143
            r1 = r138
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r13, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x1226
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r47 = m22419q(r13, r10)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = 0
            r1 = r143
            r2 = r13
            r4 = r54
            r6 = r56
            r8 = r61
            r52 = r10
            r10 = r47
            r16 = r12
            r15 = r13
            r52 = r121
            r35 = r124
            r12 = r27
            com.google.ads.interactivemedia.v3.internal.xv r1 = r1.mo16767d(r2, r3, r4, r6, r8, r10, r12)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r69 = r14
            r58 = r47
            r12 = r61
            r14 = r63
            r53 = r130
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x1223:
            r48 = r1
            goto L_0x127f
        L_0x1226:
            r16 = r12
            r15 = r13
            r52 = r121
            r35 = r124
            r1 = r140
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x1261
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r47 = m22419q(r15, r11)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3 = 0
            com.google.ads.interactivemedia.v3.internal.arn r4 = com.google.ads.interactivemedia.p367v3.internal.arn.m19402i()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1 = r143
            r2 = r15
            r5 = r54
            r7 = r56
            r9 = r61
            r67 = r11
            r11 = r47
            r69 = r14
            r53 = r130
            r13 = r27
            com.google.ads.interactivemedia.v3.internal.xw r1 = r1.mo16768e(r2, r3, r4, r5, r7, r9, r11, r13)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r58 = r47
            r12 = r61
            r14 = r63
            goto L_0x1223
        L_0x1261:
            r69 = r14
            r53 = r130
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String r1 = "AssetIdentifier"
            boolean r1 = com.google.ads.interactivemedia.p367v3.internal.atv.m19613e(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 == 0) goto L_0x1278
            java.lang.String r1 = "AssetIdentifier"
            m22411i(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            goto L_0x127b
        L_0x1278:
            m22410h(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x127b:
            r12 = r61
            r14 = r63
        L_0x127f:
            r1 = r136
            boolean r2 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r1)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r2 == 0) goto L_0x12e6
            com.google.ads.interactivemedia.v3.internal.xo r2 = new com.google.ads.interactivemedia.v3.internal.xo     // Catch:{ XmlPullParserException -> 0x13a6 }
            r48 = r2
            r52 = r53
            r53 = r16
            r48.<init>(r49, r50, r52, r53)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Long r3 = java.lang.Long.valueOf(r56)     // Catch:{ XmlPullParserException -> 0x13a6 }
            android.util.Pair r2 = android.util.Pair.create(r2, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Object r3 = r2.first     // Catch:{ XmlPullParserException -> 0x13a6 }
            com.google.ads.interactivemedia.v3.internal.xo r3 = (com.google.ads.interactivemedia.p367v3.internal.C7421xo) r3     // Catch:{ XmlPullParserException -> 0x13a6 }
            long r4 = r3.f24328b     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r6 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r6 != 0) goto L_0x12ca
            if (r44 == 0) goto L_0x12ad
            r2 = r144
            r4 = r40
            r43 = 1
            goto L_0x12e3
        L_0x12ad:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r2 = r144.size()     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x13a6 }
            r4 = 47
            r3.<init>(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r4 = "Unable to determine start of period "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x13a6 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x13a6 }
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x12ca:
            java.lang.Object r2 = r2.second     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x13a6 }
            long r4 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x13a6 }
            int r2 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r2 != 0) goto L_0x12db
            r2 = r144
            r4 = r67
            goto L_0x12e0
        L_0x12db:
            long r6 = r3.f24328b     // Catch:{ XmlPullParserException -> 0x13a6 }
            long r4 = r4 + r6
            r2 = r144
        L_0x12e0:
            r2.add(r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x12e3:
            r11 = r23
            goto L_0x1339
        L_0x12e6:
            r63 = r1
            r7 = r15
            r1 = r16
            r47 = r23
            r9 = r24
            r10 = r34
            r3 = r35
            r2 = r52
            r11 = r53
            r24 = r64
            r4 = r67
            r62 = r74
            r6 = r76
            r8 = r78
            r61 = r79
            r23 = r133
            r15 = r143
            r52 = r40
            r40 = r44
            r41 = r144
            goto L_0x0289
        L_0x130f:
            r76 = r6
            r15 = r7
            r78 = r8
            r79 = r12
            r74 = r13
            r1 = r14
            r133 = r23
            r64 = r24
            r44 = r40
            r2 = r41
            r23 = r47
            r65 = 0
            r67 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r69 = 0
            r81 = 1
            r40 = r4
            r24 = r9
            m22410h(r15)     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x1335:
            r11 = r23
            r4 = r40
        L_0x1339:
            r3 = r133
            boolean r6 = com.google.ads.interactivemedia.p367v3.internal.atv.m19611c(r15, r3)     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r6 == 0) goto L_0x1383
            int r1 = (r19 > r67 ? 1 : (r19 == r67 ? 0 : -1))
            if (r1 != 0) goto L_0x1359
            int r1 = (r4 > r67 ? 1 : (r4 == r67 ? 0 : -1))
            if (r1 == 0) goto L_0x134c
            r19 = r4
            goto L_0x1359
        L_0x134c:
            if (r44 == 0) goto L_0x1351
            r19 = r67
            goto L_0x1359
        L_0x1351:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "Unable to determine duration of static manifest."
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x1359:
            boolean r1 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x13a6 }
            if (r1 != 0) goto L_0x137b
            com.google.ads.interactivemedia.v3.internal.xj r1 = new com.google.ads.interactivemedia.v3.internal.xj     // Catch:{ XmlPullParserException -> 0x13a6 }
            r16 = r1
            r23 = r44
            r24 = r25
            r26 = r27
            r28 = r29
            r30 = r31
            r32 = r36
            r33 = r37
            r34 = r39
            r35 = r38
            r36 = r2
            r16.<init>(r17, r19, r21, r23, r24, r26, r28, r30, r32, r33, r34, r35, r36)     // Catch:{ XmlPullParserException -> 0x13a6 }
            return r1
        L_0x137b:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "No periods found."
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x1383:
            r14 = r1
            r41 = r2
            r23 = r3
            r7 = r15
            r9 = r24
            r40 = r44
            r2 = r45
            r24 = r64
            r13 = r74
            r6 = r76
            r8 = r78
            r12 = r79
            r10 = 1
            r15 = r143
            goto L_0x00c9
        L_0x139e:
            com.google.ads.interactivemedia.v3.internal.dt r1 = new com.google.ads.interactivemedia.v3.internal.dt     // Catch:{ XmlPullParserException -> 0x13a6 }
            java.lang.String r2 = "inputStream does not contain a valid media presentation description"
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x13a6 }
            throw r1     // Catch:{ XmlPullParserException -> 0x13a6 }
        L_0x13a6:
            r0 = move-exception
        L_0x13a7:
            r1 = r0
            com.google.ads.interactivemedia.v3.internal.dt r2 = new com.google.ads.interactivemedia.v3.internal.dt
            r2.<init>((java.lang.Throwable) r1)
            goto L_0x13af
        L_0x13ae:
            throw r2
        L_0x13af:
            goto L_0x13ae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7418xl.mo14477a(android.net.Uri, java.io.InputStream):com.google.ads.interactivemedia.v3.internal.xj");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C7431xy mo16766c(XmlPullParser xmlPullParser, C7431xy xyVar) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C7431xy xyVar2 = xyVar;
        long n = m22416n(xmlPullParser2, "timescale", xyVar2 != null ? xyVar2.f24363i : 1);
        long j3 = 0;
        long n2 = m22416n(xmlPullParser2, "presentationTimeOffset", xyVar2 != null ? xyVar2.f24364j : 0);
        long j4 = xyVar2 != null ? xyVar2.f24360a : 0;
        if (xyVar2 != null) {
            j3 = xyVar2.f24361b;
        }
        C7423xq xqVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j3;
            j2 = j4;
        }
        if (xyVar2 != null) {
            xqVar = xyVar2.f24362h;
        }
        do {
            xmlPullParser.next();
            if (atv.m19613e(xmlPullParser2, "Initialization")) {
                xqVar = mo16770g(xmlPullParser);
            } else {
                m22410h(xmlPullParser);
            }
        } while (!atv.m19611c(xmlPullParser2, "SegmentBase"));
        return new C7431xy(xqVar, n, n2, j2, j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C7428xv mo16767d(XmlPullParser xmlPullParser, C7428xv xvVar, long j, long j2, long j3, long j4, long j5) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C7428xv xvVar2 = xvVar;
        long j6 = 1;
        long n = m22416n(xmlPullParser2, "timescale", xvVar2 != null ? xvVar2.f24363i : 1);
        long n2 = m22416n(xmlPullParser2, "presentationTimeOffset", xvVar2 != null ? xvVar2.f24364j : 0);
        long n3 = m22416n(xmlPullParser2, "duration", xvVar2 != null ? xvVar2.f24349b : -9223372036854775807L);
        if (xvVar2 != null) {
            j6 = xvVar2.f24348a;
        }
        long n4 = m22416n(xmlPullParser2, "startNumber", j6);
        long B = m22408B(j3, j4);
        List list = null;
        List list2 = null;
        C7423xq xqVar = null;
        do {
            xmlPullParser.next();
            if (atv.m19613e(xmlPullParser2, "Initialization")) {
                xqVar = mo16770g(xmlPullParser);
            } else if (atv.m19613e(xmlPullParser2, "SegmentTimeline")) {
                list = mo16769f(xmlPullParser, n, j2);
            } else if (atv.m19613e(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(m22426x(xmlPullParser2, "media", "mediaRange"));
            } else {
                m22410h(xmlPullParser);
            }
        } while (!atv.m19611c(xmlPullParser2, "SegmentList"));
        if (xvVar2 != null) {
            if (xqVar == null) {
                xqVar = xvVar2.f24362h;
            }
            if (list == null) {
                list = xvVar2.f24350c;
            }
            if (list2 == null) {
                list2 = xvVar2.f24354e;
            }
        }
        return new C7428xv(xqVar, n, n2, n4, n3, list, B, list2, C6821bi.m19755b(j5), C6821bi.m19755b(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C7429xw mo16768e(XmlPullParser xmlPullParser, C7429xw xwVar, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C7429xw xwVar2 = xwVar;
        long j7 = 1;
        long n = m22416n(xmlPullParser2, "timescale", xwVar2 != null ? xwVar2.f24363i : 1);
        long n2 = m22416n(xmlPullParser2, "presentationTimeOffset", xwVar2 != null ? xwVar2.f24364j : 0);
        long n3 = m22416n(xmlPullParser2, "duration", xwVar2 != null ? xwVar2.f24349b : -9223372036854775807L);
        if (xwVar2 != null) {
            j7 = xwVar2.f24348a;
        }
        long n4 = m22416n(xmlPullParser2, "startNumber", j7);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C7419xm xmVar = (C7419xm) list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(xmVar.f24320a)) {
                j6 = Long.parseLong(xmVar.f24321b);
                break;
            }
            i++;
        }
        long j8 = j6;
        long B = m22408B(j3, j4);
        List list2 = null;
        C7436yc z = m22428z(xmlPullParser2, "media", xwVar2 != null ? xwVar2.f24356f : null);
        C7436yc z2 = m22428z(xmlPullParser2, "initialization", xwVar2 != null ? xwVar2.f24355e : null);
        C7423xq xqVar = null;
        do {
            xmlPullParser.next();
            if (atv.m19613e(xmlPullParser2, "Initialization")) {
                xqVar = mo16770g(xmlPullParser);
            } else if (atv.m19613e(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo16769f(xmlPullParser, n, j2);
            } else {
                m22410h(xmlPullParser);
            }
        } while (!atv.m19611c(xmlPullParser2, "SegmentTemplate"));
        if (xwVar2 != null) {
            if (xqVar == null) {
                xqVar = xwVar2.f24362h;
            }
            if (list2 == null) {
                list2 = xwVar2.f24350c;
            }
        }
        return new C7429xw(xqVar, n, n2, n4, j8, n3, list2, B, z2, z, C6821bi.m19755b(j5), C6821bi.m19755b(j));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final List mo16769f(XmlPullParser xmlPullParser, long j, long j2) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (atv.m19613e(xmlPullParser2, "S")) {
                long n = m22416n(xmlPullParser2, C42181t.f110467a, -9223372036854775807L);
                if (z) {
                    j3 = m22409C(arrayList, j3, j4, i, n);
                }
                if (n == -9223372036854775807L) {
                    n = j3;
                }
                j4 = m22416n(xmlPullParser2, "d", -9223372036854775807L);
                i = m22415m(xmlPullParser2, C33259r.f88929b, 0);
                j3 = n;
                z = true;
            } else {
                m22410h(xmlPullParser);
            }
        } while (!atv.m19611c(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            m22409C(arrayList, j3, j4, i, aeu.m18496N(j2, j, 1000));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C7423xq mo16770g(XmlPullParser xmlPullParser) {
        return m22426x(xmlPullParser, "sourceURL", "range");
    }
}
