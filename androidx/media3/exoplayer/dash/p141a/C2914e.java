package androidx.media3.exoplayer.dash.p141a;

import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2610ai;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2613al;
import androidx.media3.exoplayer.p151k.C3258x;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: androidx.media3.exoplayer.dash.a.e */
/* compiled from: PG */
public final class C2914e extends DefaultHandler implements C3258x {

    /* renamed from: a */
    private static final Pattern f8338a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f8339b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f8340c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private static final int[] f8341d = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: e */
    private final XmlPullParserFactory f8342e;

    public C2914e() {
        try {
            this.f8342e = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: A */
    protected static final C2925p m8209A(XmlPullParser xmlPullParser, C2925p pVar, List list, long j, long j2, long j3, long j4, long j5) {
        long j6;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2925p pVar2 = pVar;
        long j7 = 1;
        long e = m8216e(xmlPullParser2, "timescale", pVar2 != null ? pVar2.f8386i : 1);
        long e2 = m8216e(xmlPullParser2, "presentationTimeOffset", pVar2 != null ? pVar2.f8387j : 0);
        long e3 = m8216e(xmlPullParser2, "duration", pVar2 != null ? pVar2.f8372b : -9223372036854775807L);
        if (pVar2 != null) {
            j7 = pVar2.f8371a;
        }
        long e4 = m8216e(xmlPullParser2, "startNumber", j7);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j6 = -1;
                break;
            }
            C2915f fVar = (C2915f) list.get(i);
            if (C58890d.m90990e("http://dashif.org/guidelines/last-segment-number", fVar.f8343a)) {
                j6 = Long.parseLong(fVar.f8344b);
                break;
            }
            i++;
        }
        long j8 = j6;
        long C = m8211C(j3, j4);
        List list2 = null;
        C2931v u = m8231u(xmlPullParser2, "media", pVar2 != null ? pVar2.f8379f : null);
        C2931v u2 = m8231u(xmlPullParser2, "initialization", pVar2 != null ? pVar2.f8378e : null);
        C2919j jVar = null;
        do {
            xmlPullParser.next();
            if (C2613al.m7007f(xmlPullParser2, "Initialization")) {
                jVar = m8233w(xmlPullParser);
                long j9 = j2;
            } else if (C2613al.m7007f(xmlPullParser2, "SegmentTimeline")) {
                list2 = m8234x(xmlPullParser2, e, j2);
            } else {
                long j10 = j2;
                m8220j(xmlPullParser);
            }
        } while (!C2613al.m7005d(xmlPullParser2, "SegmentTemplate"));
        if (pVar2 != null) {
            if (jVar == null) {
                jVar = pVar2.f8385h;
            }
            if (list2 == null) {
                list2 = pVar2.f8373c;
            }
        }
        return new C2925p(jVar, e, e2, e4, j8, e3, list2, C, u2, u, C2612ak.m6998w(j5), C2612ak.m6998w(j));
    }

    /* renamed from: B */
    private static int m8210B(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        C2601a.m6832d(i == i2);
        return i;
    }

    /* renamed from: C */
    private static long m8211C(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: D */
    private static final long m8212D(List list, long j, long j2, int i, long j3) {
        int r = i >= 0 ? i + 1 : (int) C2612ak.m6993r(j3 - j, j2);
        for (int i2 = 0; i2 < r; i2++) {
            list.add(new C2926q(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: b */
    protected static float m8213b(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f8338a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: c */
    protected static int m8214c(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: d */
    protected static long m8215d(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = C2612ak.f7255g.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
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
        long j2 = (long) ((parseDouble5 + d) * 1000.0d);
        if (!isEmpty) {
            return j2;
        }
        return -j2;
    }

    /* renamed from: e */
    protected static long m8216e(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: g */
    protected static C2915f m8217g(XmlPullParser xmlPullParser, String str) {
        String h = m8218h(xmlPullParser, "schemeIdUri", BuildConfig.FLAVOR);
        String h2 = m8218h(xmlPullParser, "value", (String) null);
        String h3 = m8218h(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!C2613al.m7005d(xmlPullParser, str));
        return new C2915f(h, h2, h3);
    }

    /* renamed from: h */
    protected static String m8218h(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    /* renamed from: i */
    protected static String m8219i(XmlPullParser xmlPullParser, String str) {
        String str2 = BuildConfig.FLAVOR;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m8220j(xmlPullParser);
            }
        } while (!C2613al.m7005d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: j */
    public static void m8220j(XmlPullParser xmlPullParser) {
        if (C2613al.m7006e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (C2613al.m7006e(xmlPullParser)) {
                    i++;
                } else if (C2613al.m7004c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009b, code lost:
        if (r0.equals("4000") != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c0, code lost:
        if (r3 == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00cb, code lost:
        if (r3 < 33) goto L_0x00e2;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final int m8221k(org.xmlpull.v1.XmlPullParser r9) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m8218h(r9, r0, r1)
            int r2 = r0.hashCode()
            r3 = 6
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -1
            switch(r2) {
                case -2128649360: goto L_0x0051;
                case -1352850286: goto L_0x0047;
                case -1138141449: goto L_0x003d;
                case -986633423: goto L_0x0033;
                case -79006963: goto L_0x0029;
                case 312179081: goto L_0x001f;
                case 2036691300: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x005b
        L_0x0015:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 6
            goto L_0x005c
        L_0x001f:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 4
            goto L_0x005c
        L_0x0029:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 2
            goto L_0x005c
        L_0x0033:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x003d:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 5
            goto L_0x005c
        L_0x0047:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 0
            goto L_0x005c
        L_0x0051:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005b
            r0 = 3
            goto L_0x005c
        L_0x005b:
            r0 = -1
        L_0x005c:
            java.lang.String r2 = "value"
            switch(r0) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00ce;
                case 2: goto L_0x00c3;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00af;
                case 5: goto L_0x0064;
                case 6: goto L_0x0064;
                default: goto L_0x0061;
            }
        L_0x0061:
            r3 = -1
            goto L_0x00e2
        L_0x0064:
            java.lang.String r0 = r9.getAttributeValue(r1, r2)
            if (r0 != 0) goto L_0x006b
            goto L_0x0061
        L_0x006b:
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L_0x0095;
                case 2937391: goto L_0x008b;
                case 3094035: goto L_0x0081;
                case 3133436: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x009e
        L_0x0077:
            java.lang.String r1 = "fa01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009e
            r4 = 3
            goto L_0x009f
        L_0x0081:
            java.lang.String r1 = "f801"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009e
            r4 = 2
            goto L_0x009f
        L_0x008b:
            java.lang.String r1 = "a000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009e
            r4 = 1
            goto L_0x009f
        L_0x0095:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r4 = -1
        L_0x009f:
            if (r4 == 0) goto L_0x00ad
            if (r4 == r7) goto L_0x00ab
            if (r4 == r6) goto L_0x00e2
            if (r4 == r5) goto L_0x00a8
            goto L_0x0061
        L_0x00a8:
            r3 = 8
            goto L_0x00e2
        L_0x00ab:
            r3 = 2
            goto L_0x00e2
        L_0x00ad:
            r3 = 1
            goto L_0x00e2
        L_0x00af:
            java.lang.String r0 = r9.getAttributeValue(r1, r2)
            if (r0 != 0) goto L_0x00b6
            goto L_0x0061
        L_0x00b6:
            r1 = 16
            int r0 = java.lang.Integer.parseInt(r0, r1)
            int r3 = java.lang.Integer.bitCount(r0)
            if (r3 != 0) goto L_0x00e2
            goto L_0x0061
        L_0x00c3:
            int r3 = m8214c(r9, r2, r8)
            if (r3 <= 0) goto L_0x0061
            r0 = 33
            if (r3 < r0) goto L_0x00e2
            goto L_0x0061
        L_0x00ce:
            int r0 = m8214c(r9, r2, r8)
            if (r0 < 0) goto L_0x0061
            int[] r1 = f8341d
            int r2 = r1.length
            r2 = 21
            if (r0 >= r2) goto L_0x0061
            r3 = r1[r0]
            goto L_0x00e2
        L_0x00de:
            int r3 = m8214c(r9, r2, r8)
        L_0x00e2:
            r9.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = androidx.media3.common.p136b.C2613al.m7005d(r9, r0)
            if (r0 == 0) goto L_0x00e2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.p141a.C2914e.m8221k(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: l */
    protected static final long m8222l(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: m */
    protected static final List m8223m(XmlPullParser xmlPullParser, List list, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : LinearLayoutManager.INVALID_OFFSET;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String i = m8219i(xmlPullParser, "BaseURL");
        if (i == null || C2610ai.m6916b(i)[0] == -1) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                C2911b bVar = (C2911b) list.get(i2);
                String a = C2610ai.m6915a(bVar.f8312a, i);
                String str = attributeValue3 == null ? a : attributeValue3;
                if (z) {
                    parseInt = bVar.f8314c;
                    parseInt2 = bVar.f8315d;
                    str = bVar.f8313b;
                }
                arrayList.add(new C2911b(a, str, parseInt, parseInt2));
            }
            return arrayList;
        }
        if (attributeValue3 == null) {
            attributeValue3 = i;
        }
        return C58597ky.m90212c(new C2911b(i, attributeValue3, parseInt, parseInt2));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014f  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final android.util.Pair m8224n(org.xmlpull.v1.XmlPullParser r10) {
        /*
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r10.getAttributeValue(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case -1980789791: goto L_0x0037;
                case 489446379: goto L_0x002d;
                case 755418770: goto L_0x0023;
                case 1812765994: goto L_0x0019;
                default: goto L_0x0018;
            }
        L_0x0018:
            goto L_0x0041
        L_0x0019:
            java.lang.String r3 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0041
            r0 = 0
            goto L_0x0042
        L_0x0023:
            java.lang.String r3 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0041
            r0 = 2
            goto L_0x0042
        L_0x002d:
            java.lang.String r3 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0041
            r0 = 3
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            if (r0 == 0) goto L_0x0057
            if (r0 == r6) goto L_0x0052
            if (r0 == r5) goto L_0x004f
            if (r0 == r4) goto L_0x004c
            goto L_0x00b5
        L_0x004c:
            java.util.UUID r0 = androidx.media3.common.C2669m.f7430c
            goto L_0x0054
        L_0x004f:
            java.util.UUID r0 = androidx.media3.common.C2669m.f7431d
            goto L_0x0054
        L_0x0052:
            java.util.UUID r0 = androidx.media3.common.C2669m.f7432e
        L_0x0054:
            r3 = r1
            goto L_0x00b7
        L_0x0057:
            java.lang.String r0 = "value"
            java.lang.String r0 = r10.getAttributeValue(r1, r0)
            int r3 = r10.getAttributeCount()
            r4 = 0
        L_0x0062:
            if (r4 >= r3) goto L_0x007c
            java.lang.String r5 = r10.getAttributeName(r4)
            java.lang.String r5 = androidx.media3.common.p136b.C2613al.m7003b(r5)
            java.lang.String r6 = "default_KID"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0079
            java.lang.String r3 = r10.getAttributeValue(r4)
            goto L_0x007d
        L_0x0079:
            int r4 = r4 + 1
            goto L_0x0062
        L_0x007c:
            r3 = r1
        L_0x007d:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00b1
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x00b1
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x0095:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x00a3
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00a3:
            java.util.UUID r3 = androidx.media3.common.C2669m.f7429b
            byte[] r3 = androidx.media3.extractor.p161h.C3434u.m9956b(r3, r4, r1)
            java.util.UUID r4 = androidx.media3.common.C2669m.f7429b
            r5 = r1
            r9 = r3
            r3 = r0
            r0 = r4
            r4 = r9
            goto L_0x00b9
        L_0x00b1:
            r3 = r0
            r0 = r1
            r4 = r0
            goto L_0x00b8
        L_0x00b5:
            r0 = r1
            r3 = r0
        L_0x00b7:
            r4 = r3
        L_0x00b8:
            r5 = r4
        L_0x00b9:
            r10.next()
            java.lang.String r6 = "clearkey:Laurl"
            boolean r6 = androidx.media3.common.p136b.C2613al.m7007f(r10, r6)
            r7 = 4
            if (r6 == 0) goto L_0x00d1
            int r6 = r10.next()
            if (r6 != r7) goto L_0x00d1
            java.lang.String r5 = r10.getText()
            goto L_0x0145
        L_0x00d1:
            java.lang.String r6 = "ms:laurl"
            boolean r6 = androidx.media3.common.p136b.C2613al.m7007f(r10, r6)
            if (r6 == 0) goto L_0x00e1
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r10.getAttributeValue(r1, r5)
            goto L_0x0145
        L_0x00e1:
            if (r4 != 0) goto L_0x011b
            boolean r6 = androidx.media3.common.p136b.C2613al.m7006e(r10)
            if (r6 == 0) goto L_0x011b
            java.lang.String r6 = r10.getName()
            java.lang.String r6 = androidx.media3.common.p136b.C2613al.m7003b(r6)
            java.lang.String r8 = "pssh"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x011b
            int r6 = r10.next()
            if (r6 != r7) goto L_0x011b
            java.lang.String r0 = r10.getText()
            byte[] r0 = android.util.Base64.decode(r0, r2)
            java.util.UUID r4 = androidx.media3.extractor.p161h.C3434u.m9955a(r0)
            if (r4 != 0) goto L_0x0117
            java.lang.String r0 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            androidx.media3.common.p136b.C2633u.m7050e(r0, r6)
            r0 = r4
            r4 = r1
            goto L_0x0145
        L_0x0117:
            r9 = r4
            r4 = r0
            r0 = r9
            goto L_0x0145
        L_0x011b:
            if (r4 != 0) goto L_0x0142
            java.util.UUID r6 = androidx.media3.common.C2669m.f7432e
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0142
            java.lang.String r6 = "mspr:pro"
            boolean r6 = androidx.media3.common.p136b.C2613al.m7007f(r10, r6)
            if (r6 == 0) goto L_0x0142
            int r6 = r10.next()
            if (r6 != r7) goto L_0x0142
            java.util.UUID r4 = androidx.media3.common.C2669m.f7432e
            java.lang.String r6 = r10.getText()
            byte[] r6 = android.util.Base64.decode(r6, r2)
            byte[] r4 = androidx.media3.extractor.p161h.C3434u.m9956b(r4, r1, r6)
            goto L_0x0145
        L_0x0142:
            m8220j(r10)
        L_0x0145:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = androidx.media3.common.p136b.C2613al.m7005d(r10, r6)
            if (r6 == 0) goto L_0x00b9
            if (r0 == 0) goto L_0x0156
            androidx.media3.common.DrmInitData$SchemeData r1 = new androidx.media3.common.DrmInitData$SchemeData
            java.lang.String r10 = "video/mp4"
            r1.<init>(r0, r5, r10, r4)
        L_0x0156:
            android.util.Pair r10 = android.util.Pair.create(r3, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.p141a.C2914e.m8224n(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: o */
    protected static final int m8225o(XmlPullParser xmlPullParser) {
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

    /* renamed from: p */
    protected static long m8226p(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return C2612ak.m6999x(attributeValue);
    }

    /* renamed from: q */
    protected static float m8227q(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return -3.4028235E38f;
        }
        return Float.parseFloat(attributeValue);
    }

    /* renamed from: r */
    protected static final C2919j m8228r(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return new C2919j(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return new C2919j(attributeValue, j2, j);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final int m8229s(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r6.hashCode()
            r2 = 2
            r3 = 4
            r4 = 8
            r5 = 1
            switch(r1) {
                case -2060497896: goto L_0x0091;
                case -1724546052: goto L_0x0086;
                case -1580883024: goto L_0x007b;
                case -1574842690: goto L_0x0071;
                case -1408024454: goto L_0x0067;
                case -1396432756: goto L_0x005c;
                case 99825: goto L_0x0052;
                case 3343801: goto L_0x0048;
                case 3530173: goto L_0x003d;
                case 552573414: goto L_0x0033;
                case 899152809: goto L_0x0028;
                case 1629013393: goto L_0x001d;
                case 1855372047: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x009c
        L_0x0012:
            java.lang.String r1 = "supplementary"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 2
            goto L_0x009d
        L_0x001d:
            java.lang.String r1 = "emergency"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 5
            goto L_0x009d
        L_0x0028:
            java.lang.String r1 = "commentary"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 3
            goto L_0x009d
        L_0x0033:
            java.lang.String r1 = "caption"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 6
            goto L_0x009d
        L_0x003d:
            java.lang.String r1 = "sign"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 10
            goto L_0x009d
        L_0x0048:
            java.lang.String r1 = "main"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 0
            goto L_0x009d
        L_0x0052:
            java.lang.String r1 = "dub"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 4
            goto L_0x009d
        L_0x005c:
            java.lang.String r1 = "forced-subtitle"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 8
            goto L_0x009d
        L_0x0067:
            java.lang.String r1 = "alternate"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 1
            goto L_0x009d
        L_0x0071:
            java.lang.String r1 = "forced_subtitle"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 7
            goto L_0x009d
        L_0x007b:
            java.lang.String r1 = "enhanced-audio-intelligibility"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 12
            goto L_0x009d
        L_0x0086:
            java.lang.String r1 = "description"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 11
            goto L_0x009d
        L_0x0091:
            java.lang.String r1 = "subtitle"
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L_0x009c
            r6 = 9
            goto L_0x009d
        L_0x009c:
            r6 = -1
        L_0x009d:
            switch(r6) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00b3;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00ad;
                case 7: goto L_0x00aa;
                case 8: goto L_0x00aa;
                case 9: goto L_0x00aa;
                case 10: goto L_0x00a7;
                case 11: goto L_0x00a4;
                case 12: goto L_0x00a1;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            return r0
        L_0x00a1:
            r6 = 2048(0x800, float:2.87E-42)
            return r6
        L_0x00a4:
            r6 = 512(0x200, float:7.175E-43)
            return r6
        L_0x00a7:
            r6 = 256(0x100, float:3.59E-43)
            return r6
        L_0x00aa:
            r6 = 128(0x80, float:1.794E-43)
            return r6
        L_0x00ad:
            r6 = 64
            return r6
        L_0x00b0:
            r6 = 32
            return r6
        L_0x00b3:
            r6 = 16
            return r6
        L_0x00b6:
            return r4
        L_0x00b7:
            return r3
        L_0x00b8:
            return r2
        L_0x00b9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.p141a.C2914e.m8229s(java.lang.String):int");
    }

    /* renamed from: t */
    protected static final int m8230t(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C58890d.m90990e("http://dashif.org/guidelines/trickmode", ((C2915f) list.get(i2)).f8343a)) {
                i |= 16384;
            }
        }
        return i;
    }

    /* renamed from: u */
    protected static final C2931v m8231u(XmlPullParser xmlPullParser, String str, C2931v vVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return vVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = BuildConfig.FLAVOR;
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                strArr[i2] = String.valueOf(strArr[i2]).concat(String.valueOf(attributeValue.substring(i)));
                i = attributeValue.length();
            } else if (indexOf != i) {
                strArr[i2] = String.valueOf(strArr[i2]).concat(String.valueOf(attributeValue.substring(i, indexOf)));
                i = indexOf;
            } else if (attributeValue.startsWith("$$", i)) {
                strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                i += 2;
            } else {
                int i3 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i3);
                String substring = attributeValue.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = String.valueOf(str2).concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c == 2) {
                        iArr[i2] = 4;
                    } else {
                        throw new IllegalArgumentException("Invalid template: ".concat(attributeValue));
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = BuildConfig.FLAVOR;
                i = indexOf2 + 1;
            }
        }
        return new C2931v(strArr, iArr, strArr2, i2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        r5 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if ("audio/eac3-joc".equals(r5) != false) goto L_0x0099;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final androidx.media3.common.C2680x m8232v(java.lang.String r16, java.lang.String r17, int r18, int r19, float r20, int r21, int r22, int r23, java.lang.String r24, java.util.List r25, java.util.List r26, java.lang.String r27, java.util.List r28, java.util.List r29) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r25
            r4 = r26
            boolean r5 = androidx.media3.common.C2598ay.m6813l(r17)
            if (r5 == 0) goto L_0x0015
            java.lang.String r5 = androidx.media3.common.C2598ay.m6805d(r27)
            goto L_0x0047
        L_0x0015:
            boolean r5 = androidx.media3.common.C2598ay.m6817p(r17)
            if (r5 == 0) goto L_0x0020
            java.lang.String r5 = androidx.media3.common.C2598ay.m6809h(r27)
            goto L_0x0047
        L_0x0020:
            boolean r5 = androidx.media3.common.C2598ay.m6816o(r17)
            if (r5 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            boolean r5 = androidx.media3.common.C2598ay.m6814m(r17)
            if (r5 == 0) goto L_0x002f
        L_0x002d:
            r5 = r0
            goto L_0x0047
        L_0x002f:
            java.lang.String r5 = "application/mp4"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0046
            java.lang.String r5 = androidx.media3.common.C2598ay.m6807f(r27)
            java.lang.String r6 = "text/vtt"
            boolean r6 = r6.equals(r5)
            if (r6 == 0) goto L_0x0047
            java.lang.String r5 = "application/x-mp4-vtt"
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            java.lang.String r6 = "audio/eac3"
            boolean r7 = r6.equals(r5)
            if (r7 == 0) goto L_0x0095
            r5 = 0
        L_0x0050:
            int r7 = r29.size()
            java.lang.String r9 = "ec+3"
            java.lang.String r10 = "audio/eac3-joc"
            if (r5 >= r7) goto L_0x008b
            r7 = r29
            java.lang.Object r11 = r7.get(r5)
            androidx.media3.exoplayer.dash.a.f r11 = (androidx.media3.exoplayer.dash.p141a.C2915f) r11
            java.lang.String r12 = r11.f8343a
            java.lang.String r13 = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018"
            boolean r13 = r13.equals(r12)
            if (r13 == 0) goto L_0x0076
            java.lang.String r13 = "JOC"
            java.lang.String r14 = r11.f8344b
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0086
        L_0x0076:
            java.lang.String r13 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0088
            java.lang.String r11 = r11.f8344b
            boolean r11 = r9.equals(r11)
            if (r11 == 0) goto L_0x0088
        L_0x0086:
            r5 = r10
            goto L_0x008e
        L_0x0088:
            int r5 = r5 + 1
            goto L_0x0050
        L_0x008b:
            r7 = r29
            r5 = r6
        L_0x008e:
            boolean r6 = r10.equals(r5)
            if (r6 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0095:
            r7 = r29
        L_0x0097:
            r9 = r27
        L_0x0099:
            r6 = 0
            r10 = 0
        L_0x009b:
            int r11 = r25.size()
            java.lang.String r12 = "urn:mpeg:dash:role:2011"
            r14 = 1
            if (r6 >= r11) goto L_0x00e6
            java.lang.Object r11 = r3.get(r6)
            androidx.media3.exoplayer.dash.a.f r11 = (androidx.media3.exoplayer.dash.p141a.C2915f) r11
            java.lang.String r15 = r11.f8343a
            boolean r12 = com.google.common.base.C58890d.m90990e(r12, r15)
            if (r12 == 0) goto L_0x00e3
            java.lang.String r11 = r11.f8344b
            if (r11 != 0) goto L_0x00b8
        L_0x00b6:
            r11 = 0
            goto L_0x00e2
        L_0x00b8:
            int r12 = r11.hashCode()
            r15 = -1574842690(0xffffffffa221cebe, float:-2.1929017E-18)
            if (r12 == r15) goto L_0x00d1
            r15 = -1396432756(0xffffffffacc4208c, float:-5.5742685E-12)
            if (r12 == r15) goto L_0x00c7
            goto L_0x00db
        L_0x00c7:
            java.lang.String r12 = "forced-subtitle"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00db
            r13 = 1
            goto L_0x00dc
        L_0x00d1:
            java.lang.String r12 = "forced_subtitle"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00db
            r13 = 0
            goto L_0x00dc
        L_0x00db:
            r13 = -1
        L_0x00dc:
            if (r13 == 0) goto L_0x00e1
            if (r13 == r14) goto L_0x00e1
            goto L_0x00b6
        L_0x00e1:
            r11 = 2
        L_0x00e2:
            r10 = r10 | r11
        L_0x00e3:
            int r6 = r6 + 1
            goto L_0x009b
        L_0x00e6:
            r6 = 0
            r11 = 0
        L_0x00e8:
            int r15 = r25.size()
            if (r6 >= r15) goto L_0x0106
            java.lang.Object r15 = r3.get(r6)
            androidx.media3.exoplayer.dash.a.f r15 = (androidx.media3.exoplayer.dash.p141a.C2915f) r15
            java.lang.String r8 = r15.f8343a
            boolean r8 = com.google.common.base.C58890d.m90990e(r12, r8)
            if (r8 == 0) goto L_0x0103
            java.lang.String r8 = r15.f8344b
            int r8 = m8229s(r8)
            r11 = r11 | r8
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00e8
        L_0x0106:
            r3 = 0
            r6 = 0
        L_0x0108:
            int r8 = r26.size()
            if (r3 >= r8) goto L_0x0174
            java.lang.Object r8 = r4.get(r3)
            androidx.media3.exoplayer.dash.a.f r8 = (androidx.media3.exoplayer.dash.p141a.C2915f) r8
            java.lang.String r15 = r8.f8343a
            boolean r15 = com.google.common.base.C58890d.m90990e(r12, r15)
            if (r15 == 0) goto L_0x0124
            java.lang.String r8 = r8.f8344b
            int r8 = m8229s(r8)
        L_0x0122:
            r6 = r6 | r8
            goto L_0x0171
        L_0x0124:
            java.lang.String r15 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            java.lang.String r13 = r8.f8343a
            boolean r13 = com.google.common.base.C58890d.m90990e(r15, r13)
            if (r13 == 0) goto L_0x0171
            java.lang.String r8 = r8.f8344b
            if (r8 != 0) goto L_0x0134
        L_0x0132:
            r8 = 0
            goto L_0x0122
        L_0x0134:
            int r13 = r8.hashCode()
            switch(r13) {
                case 49: goto L_0x0166;
                case 50: goto L_0x015b;
                case 51: goto L_0x0151;
                case 52: goto L_0x0146;
                case 53: goto L_0x013b;
                case 54: goto L_0x013c;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0132
        L_0x013c:
            java.lang.String r13 = "6"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0132
            r8 = 1
            goto L_0x0122
        L_0x0146:
            java.lang.String r13 = "4"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0132
            r8 = 8
            goto L_0x0122
        L_0x0151:
            java.lang.String r13 = "3"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0132
            r8 = 4
            goto L_0x0122
        L_0x015b:
            java.lang.String r13 = "2"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0132
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0122
        L_0x0166:
            java.lang.String r13 = "1"
            boolean r8 = r8.equals(r13)
            if (r8 == 0) goto L_0x0132
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x0122
        L_0x0171:
            int r3 = r3 + 1
            goto L_0x0108
        L_0x0174:
            int r3 = m8230t(r28)
            int r7 = m8230t(r29)
            androidx.media3.common.w r8 = new androidx.media3.common.w
            r8.<init>()
            r12 = r16
            r8.f7449a = r12
            r8.f7458j = r0
            r8.f7459k = r5
            r8.f7456h = r9
            r0 = r23
            r8.f7455g = r0
            r8.f7452d = r10
            r0 = r11 | r6
            r0 = r0 | r3
            r0 = r0 | r7
            r8.f7453e = r0
            r0 = r24
            r8.f7451c = r0
            boolean r0 = androidx.media3.common.C2598ay.m6817p(r5)
            if (r0 == 0) goto L_0x01ab
            r8.f7464p = r1
            r8.f7465q = r2
            r0 = r20
            r8.f7466r = r0
            goto L_0x0265
        L_0x01ab:
            boolean r0 = androidx.media3.common.C2598ay.m6813l(r5)
            if (r0 == 0) goto L_0x01bb
            r0 = r21
            r8.f7472x = r0
            r0 = r22
            r8.f7473y = r0
            goto L_0x0265
        L_0x01bb:
            boolean r0 = androidx.media3.common.C2598ay.m6816o(r5)
            if (r0 == 0) goto L_0x025b
            java.lang.String r0 = "application/cea-608"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "MpdParser"
            if (r0 == 0) goto L_0x020d
            r0 = 0
        L_0x01cc:
            int r2 = r26.size()
            if (r0 >= r2) goto L_0x0257
            java.lang.Object r2 = r4.get(r0)
            androidx.media3.exoplayer.dash.a.f r2 = (androidx.media3.exoplayer.dash.p141a.C2915f) r2
            java.lang.String r3 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r5 = r2.f8343a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x020a
            java.lang.String r3 = r2.f8344b
            if (r3 == 0) goto L_0x020a
            java.util.regex.Pattern r5 = f8339b
            java.util.regex.Matcher r3 = r5.matcher(r3)
            boolean r5 = r3.matches()
            if (r5 == 0) goto L_0x01fb
            java.lang.String r0 = r3.group(r14)
            int r13 = java.lang.Integer.parseInt(r0)
            goto L_0x0258
        L_0x01fb:
            java.lang.String r2 = r2.f8344b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r2 = r3.concat(r2)
            androidx.media3.common.p136b.C2633u.m7050e(r1, r2)
        L_0x020a:
            int r0 = r0 + 1
            goto L_0x01cc
        L_0x020d:
            java.lang.String r0 = "application/cea-708"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0257
            r0 = 0
        L_0x0216:
            int r2 = r26.size()
            if (r0 >= r2) goto L_0x0257
            java.lang.Object r2 = r4.get(r0)
            androidx.media3.exoplayer.dash.a.f r2 = (androidx.media3.exoplayer.dash.p141a.C2915f) r2
            java.lang.String r3 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r5 = r2.f8343a
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0254
            java.lang.String r3 = r2.f8344b
            if (r3 == 0) goto L_0x0254
            java.util.regex.Pattern r5 = f8340c
            java.util.regex.Matcher r3 = r5.matcher(r3)
            boolean r5 = r3.matches()
            if (r5 == 0) goto L_0x0245
            java.lang.String r0 = r3.group(r14)
            int r13 = java.lang.Integer.parseInt(r0)
            goto L_0x0258
        L_0x0245:
            java.lang.String r2 = r2.f8344b
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r2 = r3.concat(r2)
            androidx.media3.common.p136b.C2633u.m7050e(r1, r2)
        L_0x0254:
            int r0 = r0 + 1
            goto L_0x0216
        L_0x0257:
            r13 = -1
        L_0x0258:
            r8.f7447C = r13
            goto L_0x0265
        L_0x025b:
            boolean r0 = androidx.media3.common.C2598ay.m6814m(r5)
            if (r0 == 0) goto L_0x0265
            r8.f7464p = r1
            r8.f7465q = r2
        L_0x0265:
            androidx.media3.common.x r0 = new androidx.media3.common.x
            r0.<init>(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.p141a.C2914e.m8232v(java.lang.String, java.lang.String, int, int, float, int, int, int, java.lang.String, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List):androidx.media3.common.x");
    }

    /* renamed from: w */
    protected static final C2919j m8233w(XmlPullParser xmlPullParser) {
        return m8228r(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: x */
    protected static final List m8234x(XmlPullParser xmlPullParser, long j, long j2) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C2613al.m7007f(xmlPullParser2, "S")) {
                long e = m8216e(xmlPullParser2, C42181t.f110467a, -9223372036854775807L);
                if (z) {
                    j3 = m8212D(arrayList, j3, j4, i, e);
                }
                if (e == -9223372036854775807L) {
                    e = j3;
                }
                j4 = m8216e(xmlPullParser2, "d", -9223372036854775807L);
                i = m8214c(xmlPullParser2, C33259r.f88929b, 0);
                j3 = e;
                z = true;
            } else {
                m8220j(xmlPullParser);
            }
        } while (!C2613al.m7005d(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            m8212D(arrayList, j3, j4, i, C2612ak.m7000y(j2, j, 1000));
        }
        return arrayList;
    }

    /* renamed from: y */
    protected static final C2927r m8235y(XmlPullParser xmlPullParser, C2927r rVar) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2927r rVar2 = rVar;
        long e = m8216e(xmlPullParser2, "timescale", rVar2 != null ? rVar2.f8386i : 1);
        long j3 = 0;
        long e2 = m8216e(xmlPullParser2, "presentationTimeOffset", rVar2 != null ? rVar2.f8387j : 0);
        long j4 = rVar2 != null ? rVar2.f8383a : 0;
        if (rVar2 != null) {
            j3 = rVar2.f8384b;
        }
        C2919j jVar = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j3;
            j2 = j4;
        }
        if (rVar2 != null) {
            jVar = rVar2.f8385h;
        }
        do {
            xmlPullParser.next();
            if (C2613al.m7007f(xmlPullParser2, "Initialization")) {
                jVar = m8233w(xmlPullParser);
            } else {
                m8220j(xmlPullParser);
            }
        } while (!C2613al.m7005d(xmlPullParser2, "SegmentBase"));
        return new C2927r(jVar, e, e2, j2, j);
    }

    /* renamed from: z */
    protected static final C2924o m8236z(XmlPullParser xmlPullParser, C2924o oVar, long j, long j2, long j3, long j4, long j5) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        C2924o oVar2 = oVar;
        long j6 = 1;
        long e = m8216e(xmlPullParser2, "timescale", oVar2 != null ? oVar2.f8386i : 1);
        long e2 = m8216e(xmlPullParser2, "presentationTimeOffset", oVar2 != null ? oVar2.f8387j : 0);
        long e3 = m8216e(xmlPullParser2, "duration", oVar2 != null ? oVar2.f8372b : -9223372036854775807L);
        if (oVar2 != null) {
            j6 = oVar2.f8371a;
        }
        long e4 = m8216e(xmlPullParser2, "startNumber", j6);
        long C = m8211C(j3, j4);
        List list = null;
        List list2 = null;
        C2919j jVar = null;
        do {
            xmlPullParser.next();
            if (C2613al.m7007f(xmlPullParser2, "Initialization")) {
                jVar = m8233w(xmlPullParser);
                long j7 = j2;
            } else if (C2613al.m7007f(xmlPullParser2, "SegmentTimeline")) {
                list = m8234x(xmlPullParser2, e, j2);
            } else {
                long j8 = j2;
                if (C2613al.m7007f(xmlPullParser2, "SegmentURL")) {
                    if (list2 == null) {
                        list2 = new ArrayList();
                    }
                    list2.add(m8228r(xmlPullParser2, "media", "mediaRange"));
                } else {
                    m8220j(xmlPullParser);
                }
            }
        } while (!C2613al.m7005d(xmlPullParser2, "SegmentList"));
        if (oVar2 != null) {
            if (jVar == null) {
                jVar = oVar2.f8385h;
            }
            if (list == null) {
                list = oVar2.f8373c;
            }
            if (list2 == null) {
                list2 = oVar2.f8377e;
            }
        }
        return new C2924o(jVar, e, e2, e4, e3, list, C, list2, C2612ak.m6998w(j5), C2612ak.m6998w(j));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r81v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r99v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x08b5 A[Catch:{ XmlPullParserException -> 0x0ed7 }, LOOP:6: B:208:0x066e->B:260:0x08b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0b22 A[Catch:{ XmlPullParserException -> 0x0ed7 }, LOOP:5: B:149:0x03e0->B:349:0x0b22, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:466:0x0ead A[Catch:{ XmlPullParserException -> 0x0ed7 }, LOOP:1: B:47:0x010f->B:466:0x0ead, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0e6e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:491:0x09c0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:492:0x083f A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.dash.p141a.C2912c mo6768a(android.net.Uri r139, java.io.InputStream r140) {
        /*
            r138 = this;
            java.lang.String r1 = "Period"
            java.lang.String r2 = "ServiceDescription"
            java.lang.String r3 = "ProgramInformation"
            java.lang.String r4 = "MPD"
            java.lang.String r5 = "SupplementalProperty"
            java.lang.String r6 = "EssentialProperty"
            java.lang.String r7 = "id"
            java.lang.String r8 = "BaseURL"
            r9 = 0
            r10 = r138
            org.xmlpull.v1.XmlPullParserFactory r11 = r10.f8342e     // Catch:{ XmlPullParserException -> 0x0edb }
            org.xmlpull.v1.XmlPullParser r11 = r11.newPullParser()     // Catch:{ XmlPullParserException -> 0x0edb }
            r12 = r140
            r11.setInput(r12, r9)     // Catch:{ XmlPullParserException -> 0x0edb }
            int r12 = r11.next()     // Catch:{ XmlPullParserException -> 0x0edb }
            r13 = 2
            if (r12 != r13) goto L_0x0ecc
            java.lang.String r12 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0edb }
            boolean r12 = r4.equals(r12)     // Catch:{ XmlPullParserException -> 0x0edb }
            if (r12 == 0) goto L_0x0ecc
            r14 = 0
            java.lang.String[] r12 = new java.lang.String[r14]     // Catch:{ XmlPullParserException -> 0x0edb }
            java.lang.String r13 = "profiles"
            java.lang.String r13 = r11.getAttributeValue(r9, r13)     // Catch:{ XmlPullParserException -> 0x0edb }
            if (r13 == 0) goto L_0x0040
            java.lang.String r12 = ","
            java.lang.String[] r12 = r13.split(r12)     // Catch:{ XmlPullParserException -> 0x0edb }
        L_0x0040:
            int r13 = r12.length     // Catch:{ XmlPullParserException -> 0x0edb }
            r15 = 0
        L_0x0042:
            if (r15 >= r13) goto L_0x0054
            r14 = r12[r15]     // Catch:{ XmlPullParserException -> 0x0edb }
            java.lang.String r9 = "urn:dvb:dash:profile:dvb-dash:"
            boolean r9 = r14.startsWith(r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r9 == 0) goto L_0x0050
            r9 = 1
            goto L_0x0055
        L_0x0050:
            int r15 = r15 + 1
            r9 = 0
            goto L_0x0042
        L_0x0054:
            r9 = 0
        L_0x0055:
            java.lang.String r12 = "availabilityStartTime"
            long r26 = m8226p(r11, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r12 = "mediaPresentationDuration"
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r28 = m8215d(r11, r12, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r12 = "minBufferTime"
            long r30 = m8215d(r11, r12, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r12 = "dynamic"
            java.lang.String r13 = "type"
            r14 = 0
            java.lang.String r13 = r11.getAttributeValue(r14, r13)     // Catch:{ XmlPullParserException -> 0x0ec8 }
            boolean r14 = r12.equals(r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r14 == 0) goto L_0x008d
            java.lang.String r12 = "minimumUpdatePeriod"
            r25 = r4
            r32 = r5
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r12 = m8215d(r11, r12, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r33 = r12
            goto L_0x0098
        L_0x008d:
            r25 = r4
            r32 = r5
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r4
        L_0x0098:
            if (r14 == 0) goto L_0x00a3
            java.lang.String r12 = "timeShiftBufferDepth"
            long r12 = m8215d(r11, r12, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r35 = r12
            goto L_0x00a5
        L_0x00a3:
            r35 = r4
        L_0x00a5:
            if (r14 == 0) goto L_0x00b0
            java.lang.String r12 = "suggestedPresentationDelay"
            long r12 = m8215d(r11, r12, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r37 = r12
            goto L_0x00b5
        L_0x00b0:
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00b5:
            java.lang.String r4 = "publishTime"
            long r39 = m8226p(r11, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = 1
            if (r12 == r14) goto L_0x00c4
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x00c6
        L_0x00c4:
            r19 = 0
        L_0x00c6:
            androidx.media3.exoplayer.dash.a.b r13 = new androidx.media3.exoplayer.dash.a.b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r15 = r139.toString()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r4 = r139.toString()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == r9) goto L_0x00d7
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00d8
        L_0x00d7:
            r5 = 1
        L_0x00d8:
            r13.<init>(r15, r4, r5, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.b[] r4 = new androidx.media3.exoplayer.dash.p141a.C2911b[r12]     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5 = 0
            r4[r5] = r13     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r4 = com.google.common.p4522b.C58597ky.m90212c(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = 1
            if (r12 == r14) goto L_0x00f4
            r21 = 0
            goto L_0x00f9
        L_0x00f4:
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00f9:
            r43 = r6
            r5 = r19
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r19 = r14
            r20 = r15
            r14 = r21
        L_0x010f:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x0142
            if (r48 != 0) goto L_0x011e
            long r5 = m8222l(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x011e:
            java.util.List r12 = m8223m(r11, r4, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13.addAll(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            r53 = r3
            r50 = r4
            r10 = r7
            r120 = r8
            r96 = r9
            r123 = r13
            r129 = r19
            r4 = r20
            r85 = r32
            r137 = r43
            r48 = 1
        L_0x013c:
            r82 = 1
            r128 = 0
            goto L_0x0e66
        L_0x0142:
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r50 = r4
            java.lang.String r4 = "lang"
            if (r12 == 0) goto L_0x01ad
            java.lang.String r12 = "moreInformationURL"
            r51 = r5
            r5 = 0
            java.lang.String r57 = m8218h(r11, r12, r5)     // Catch:{ XmlPullParserException -> 0x01a8 }
            java.lang.String r58 = m8218h(r11, r4, r5)     // Catch:{ XmlPullParserException -> 0x01a8 }
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x015c:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r12 = "Title"
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x016c
            java.lang.String r6 = r11.nextText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0189
        L_0x016c:
            java.lang.String r12 = "Source"
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x0179
            java.lang.String r4 = r11.nextText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0189
        L_0x0179:
            java.lang.String r12 = "Copyright"
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x0186
            java.lang.String r5 = r11.nextText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0189
        L_0x0186:
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0189:
            boolean r12 = androidx.media3.common.p136b.C2613al.m7005d(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x015c
            androidx.media3.exoplayer.dash.a.i r12 = new androidx.media3.exoplayer.dash.a.i     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r53 = r12
            r54 = r6
            r55 = r4
            r56 = r5
            r53.<init>(r54, r55, r56, r57, r58)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            r53 = r3
            r10 = r7
            r120 = r8
            r96 = r9
            r47 = r12
            goto L_0x01d4
        L_0x01a8:
            r0 = move-exception
            r1 = r0
            r2 = r5
            goto L_0x0ede
        L_0x01ad:
            r51 = r5
            java.lang.String r5 = "UTCTiming"
            boolean r5 = androidx.media3.common.p136b.C2613al.m7007f(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r6 = "value"
            java.lang.String r12 = "schemeIdUri"
            if (r5 == 0) goto L_0x01e7
            r4 = 0
            java.lang.String r5 = r11.getAttributeValue(r4, r12)     // Catch:{ XmlPullParserException -> 0x01e2 }
            java.lang.String r6 = r11.getAttributeValue(r4, r6)     // Catch:{ XmlPullParserException -> 0x01e2 }
            androidx.media3.exoplayer.dash.a.w r4 = new androidx.media3.exoplayer.dash.a.w     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4.<init>(r5, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            r53 = r3
            r44 = r4
        L_0x01cf:
            r10 = r7
            r120 = r8
            r96 = r9
        L_0x01d4:
            r123 = r13
            r129 = r19
            r4 = r20
            r85 = r32
            r137 = r43
            r5 = r51
            goto L_0x013c
        L_0x01e2:
            r0 = move-exception
            r1 = r0
            r2 = r4
            goto L_0x0ede
        L_0x01e7:
            java.lang.String r5 = "Location"
            boolean r5 = androidx.media3.common.p136b.C2613al.m7007f(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r5 == 0) goto L_0x0206
            java.lang.String r4 = r139.toString()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r5 = r11.nextText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r4 = androidx.media3.common.p136b.C2610ai.m6915a(r4, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            r53 = r3
            r45 = r4
            goto L_0x01cf
        L_0x0206:
            boolean r5 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r5 == 0) goto L_0x0298
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0224:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r53 = r3
            java.lang.String r3 = "Latency"
            boolean r3 = androidx.media3.common.p136b.C2613al.m7007f(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0253
            java.lang.String r3 = "target"
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r21 = m8216e(r11, r3, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r3 = "min"
            long r23 = m8216e(r11, r3, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r3 = "max"
            long r54 = m8216e(r11, r3, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r61 = r6
            r62 = r12
            r57 = r23
            r59 = r54
            r55 = r21
            goto L_0x0278
        L_0x0253:
            java.lang.String r3 = "PlaybackRate"
            boolean r3 = androidx.media3.common.p136b.C2613al.m7007f(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x026e
            java.lang.String r3 = "min"
            float r3 = m8227q(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r6 = "max"
            float r6 = m8227q(r11, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r61 = r3
            r55 = r4
            r62 = r6
            goto L_0x0274
        L_0x026e:
            r55 = r4
            r61 = r6
            r62 = r12
        L_0x0274:
            r57 = r21
            r59 = r23
        L_0x0278:
            boolean r3 = androidx.media3.common.p136b.C2613al.m7005d(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x028b
            androidx.media3.exoplayer.dash.a.t r3 = new androidx.media3.exoplayer.dash.a.t     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r54 = r3
            r54.<init>(r55, r57, r59, r61, r62)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            r46 = r3
            goto L_0x01cf
        L_0x028b:
            r3 = r53
            r4 = r55
            r21 = r57
            r23 = r59
            r6 = r61
            r12 = r62
            goto L_0x0224
        L_0x0298:
            r53 = r3
            boolean r3 = androidx.media3.common.p136b.C2613al.m7007f(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0e48
            if (r49 != 0) goto L_0x0e48
            boolean r3 = r13.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5 = 1
            if (r5 == r3) goto L_0x02ab
            r3 = r13
            goto L_0x02ad
        L_0x02ab:
            r3 = r50
        L_0x02ad:
            r5 = 0
            java.lang.String r55 = r11.getAttributeValue(r5, r7)     // Catch:{ XmlPullParserException -> 0x01a8 }
            java.lang.String r5 = "start"
            long r56 = m8215d(r11, r5, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r21 = r14
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x02c8
            long r17 = r26 + r56
            r58 = r17
            goto L_0x02ca
        L_0x02c8:
            r58 = r14
        L_0x02ca:
            java.lang.String r5 = "duration"
            long r60 = m8215d(r11, r5, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r62 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r66 = r1
            r67 = r2
            r63 = r14
            r1 = r51
            r54 = 0
            r65 = 0
        L_0x02ed:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r17 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r17 == 0) goto L_0x032c
            if (r65 != 0) goto L_0x02fc
            long r1 = m8222l(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x02fc:
            java.util.List r14 = m8223m(r11, r3, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10.addAll(r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r69 = r1
            r68 = r3
            r80 = r5
            r79 = r6
            r120 = r8
            r96 = r9
            r78 = r10
            r134 = r12
            r123 = r13
            r129 = r19
            r140 = r20
            r126 = r21
            r85 = r32
            r137 = r43
            r2 = r67
            r65 = 1
            r82 = 1
            r128 = 0
            r32 = r4
            r10 = r7
            goto L_0x0dab
        L_0x032c:
            java.lang.String r14 = "AdaptationSet"
            boolean r14 = androidx.media3.common.p136b.C2613al.m7007f(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r15 = "SegmentTemplate"
            r68 = r3
            java.lang.String r3 = "SegmentList"
            r69 = r1
            java.lang.String r1 = "SegmentBase"
            if (r14 == 0) goto L_0x0b63
            boolean r2 = r10.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = 1
            if (r14 == r2) goto L_0x0347
            r2 = r10
            goto L_0x0349
        L_0x0347:
            r2 = r68
        L_0x0349:
            r14 = -1
            int r72 = m8214c(r11, r7, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r23 = m8225o(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "mimeType"
            r78 = r10
            r10 = 0
            java.lang.String r14 = r11.getAttributeValue(r10, r14)     // Catch:{ XmlPullParserException -> 0x0b5e }
            r71 = r12
            java.lang.String r12 = "codecs"
            java.lang.String r12 = r11.getAttributeValue(r10, r12)     // Catch:{ XmlPullParserException -> 0x0b5e }
            java.lang.String r10 = "width"
            r73 = r13
            r13 = -1
            int r10 = m8214c(r11, r10, r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r74 = r15
            java.lang.String r15 = "height"
            int r15 = m8214c(r11, r15, r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = m8213b(r11, r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r79 = r6
            java.lang.String r6 = "audioSamplingRate"
            r80 = r5
            r5 = -1
            int r6 = m8214c(r11, r6, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5 = 0
            java.lang.String r75 = r11.getAttributeValue(r5, r4)     // Catch:{ XmlPullParserException -> 0x01a8 }
            r76 = r3
            java.lang.String r3 = "label"
            java.lang.String r3 = r11.getAttributeValue(r5, r3)     // Catch:{ XmlPullParserException -> 0x01a8 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r77 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r95 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r96 = r1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r97 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r81 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r82 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r83 = r15
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r98 = r10
            r85 = r13
            r84 = r14
            r10 = r23
            r101 = r54
            r102 = r63
            r13 = r69
            r99 = 0
            r100 = 0
            r23 = r12
            r12 = r75
            r75 = -1
        L_0x03e0:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r86 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r86 == 0) goto L_0x043c
            if (r100 != 0) goto L_0x03ef
            long r13 = m8222l(r11, r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x03ef:
            r86 = r13
            java.util.List r13 = m8223m(r11, r2, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.addAll(r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            r104 = r2
            r117 = r3
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r137 = r43
            r134 = r71
            r123 = r73
            r8 = r74
            r3 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r125 = r85
            r13 = r86
            r1 = r96
            r82 = 1
            r100 = 1
        L_0x0428:
            r128 = 0
            r136 = -1
            r43 = r5
            r96 = r9
            r71 = r23
            r9 = r32
            r5 = r95
            r32 = r4
            r4 = r77
            goto L_0x09b8
        L_0x043c:
            r104 = r2
            java.lang.String r2 = "ContentProtection"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x048e
            android.util.Pair r2 = m8224n(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r86 = r13
            java.lang.Object r13 = r2.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x0456
            java.lang.Object r13 = r2.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r99 = r13
            java.lang.String r99 = (java.lang.String) r99     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0456:
            java.lang.Object r13 = r2.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x0461
            java.lang.Object r2 = r2.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r2 = (androidx.media3.common.DrmInitData.SchemeData) r2     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0461:
            r118 = r1
        L_0x0463:
            r117 = r3
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r137 = r43
            r134 = r71
            r123 = r73
            r8 = r74
            r3 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r125 = r85
            r13 = r86
            r1 = r96
            r82 = 1
            goto L_0x0428
        L_0x048e:
            r86 = r13
            java.lang.String r2 = "ContentComponent"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x04b7
            r2 = 0
            java.lang.String r13 = r11.getAttributeValue(r2, r4)     // Catch:{ XmlPullParserException -> 0x0ed4 }
            if (r12 != 0) goto L_0x04a1
            r12 = r13
            goto L_0x04ab
        L_0x04a1:
            if (r13 != 0) goto L_0x04a4
            goto L_0x04ab
        L_0x04a4:
            boolean r2 = r12.equals(r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.p136b.C2601a.m6832d(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x04ab:
            int r2 = m8225o(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r2 = m8210B(r10, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            r10 = r2
            goto L_0x0463
        L_0x04b7:
            java.lang.String r2 = "Role"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x050c
            java.lang.String r2 = "Role"
            androidx.media3.exoplayer.dash.a.f r2 = m8217g(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x04c8:
            r118 = r1
            r117 = r3
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r137 = r43
            r134 = r71
            r123 = r73
            r8 = r74
            r3 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r125 = r85
            r121 = r86
            r1 = r96
            r6 = r102
            r82 = 1
            r128 = 0
            r136 = -1
            r43 = r5
            r96 = r9
            r81 = r10
            r76 = r12
            r71 = r23
            r9 = r32
            r5 = r95
        L_0x0508:
            r32 = r4
            goto L_0x09ae
        L_0x050c:
            java.lang.String r2 = "AudioChannelConfiguration"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x051e
            int r2 = m8221k(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            r75 = r2
            goto L_0x0463
        L_0x051e:
            java.lang.String r2 = "Accessibility"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x0530
            java.lang.String r2 = "Accessibility"
            androidx.media3.exoplayer.dash.a.f r2 = m8217g(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x04c8
        L_0x0530:
            r2 = r43
            boolean r13 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x0580
            androidx.media3.exoplayer.dash.a.f r13 = m8217g(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6.add(r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            r137 = r2
            r117 = r3
            r43 = r5
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r134 = r71
            r123 = r73
            r8 = r74
            r3 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r125 = r85
            r121 = r86
            r5 = r95
            r1 = r96
            r6 = r102
            r82 = 1
            r128 = 0
            r136 = -1
            r96 = r9
            r81 = r10
            r76 = r12
            r71 = r23
            r9 = r32
            goto L_0x0508
        L_0x0580:
            r14 = r32
            boolean r13 = androidx.media3.common.p136b.C2613al.m7007f(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x05d4
            androidx.media3.exoplayer.dash.a.f r13 = m8217g(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r32 = r4
            r4 = r85
            r4.add(r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            r137 = r2
            r117 = r3
            r125 = r4
            r43 = r5
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r134 = r71
            r123 = r73
            r8 = r74
            r3 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r121 = r86
            r5 = r95
            r1 = r96
            r6 = r102
            r82 = 1
            r128 = 0
            r136 = -1
            r96 = r9
            r81 = r10
            r76 = r12
            r9 = r14
            r71 = r23
            goto L_0x09ae
        L_0x05d4:
            r32 = r4
            r4 = r85
            java.lang.String r13 = "Representation"
            boolean r13 = androidx.media3.common.p136b.C2613al.m7007f(r11, r13)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r43 = r5
            java.lang.String r5 = "InbandEventStream"
            if (r13 == 0) goto L_0x08e7
            boolean r13 = r15.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r85 = r14
            r14 = 1
            if (r14 == r13) goto L_0x05ef
            r13 = r15
            goto L_0x05f1
        L_0x05ef:
            r13 = r104
        L_0x05f1:
            r14 = 0
            java.lang.String r88 = r11.getAttributeValue(r14, r7)     // Catch:{ XmlPullParserException -> 0x0ec8 }
            java.lang.String r14 = "bandwidth"
            r89 = r15
            r15 = -1
            int r90 = m8214c(r11, r14, r15)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "mimeType"
            r15 = r84
            java.lang.String r84 = m8218h(r11, r14, r15)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "codecs"
            r91 = r12
            r12 = r23
            java.lang.String r92 = m8218h(r11, r14, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "width"
            r105 = r7
            r7 = r98
            int r93 = m8214c(r11, r14, r7)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "height"
            r98 = r7
            r7 = r82
            int r94 = m8214c(r11, r14, r7)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = r81
            float r106 = m8213b(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r82 = r7
            java.lang.String r7 = "audioSamplingRate"
            r107 = r10
            r10 = r97
            int r7 = m8214c(r11, r7, r10)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r97 = r10
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r117 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r118 = r1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r1.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r119 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r23 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r116 = r6
            r109 = r7
            r112 = r14
            r111 = r15
            r113 = r75
            r6 = r86
            r110 = r101
            r14 = r102
            r81 = 0
            r108 = 0
        L_0x066e:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r114 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r114 == 0) goto L_0x06af
            if (r108 != 0) goto L_0x067d
            long r6 = m8222l(r11, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x067d:
            r114 = r6
            java.util.List r6 = m8223m(r11, r13, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4.addAll(r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r137 = r2
            r120 = r8
            r129 = r19
            r140 = r20
            r126 = r21
            r125 = r23
            r134 = r71
            r123 = r73
            r8 = r74
            r74 = r76
            r131 = r82
            r132 = r83
            r121 = r86
            r133 = r89
            r76 = r91
            r135 = r96
            r130 = r111
            r124 = r112
            r6 = r114
            r108 = 1
            goto L_0x06e1
        L_0x06af:
            r120 = r8
            java.lang.String r8 = "AudioChannelConfiguration"
            boolean r8 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r8 == 0) goto L_0x06f3
            int r8 = m8221k(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r137 = r2
            r113 = r8
            r129 = r19
            r140 = r20
            r126 = r21
            r125 = r23
            r134 = r71
            r123 = r73
            r8 = r74
            r74 = r76
            r131 = r82
            r132 = r83
            r121 = r86
            r133 = r89
            r76 = r91
            r135 = r96
            r130 = r111
            r124 = r112
        L_0x06e1:
            r128 = 0
            r136 = -1
            r96 = r9
            r71 = r12
            r73 = r13
            r12 = r81
            r9 = r85
        L_0x06ef:
            r13 = r116
            goto L_0x0837
        L_0x06f3:
            r8 = r96
            boolean r96 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r96 == 0) goto L_0x0734
            r96 = r9
            r9 = r110
            androidx.media3.exoplayer.dash.a.r r9 = (androidx.media3.exoplayer.dash.p141a.C2927r) r9     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.r r110 = m8235y(r11, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r137 = r2
            r135 = r8
            r129 = r19
            r140 = r20
            r126 = r21
            r125 = r23
            r134 = r71
            r123 = r73
            r8 = r74
            r74 = r76
            r131 = r82
            r132 = r83
            r9 = r85
            r121 = r86
            r133 = r89
            r76 = r91
            r130 = r111
            r124 = r112
            r128 = 0
            r136 = -1
            r71 = r12
            r73 = r13
        L_0x0731:
            r12 = r81
            goto L_0x06ef
        L_0x0734:
            r96 = r9
            r9 = r76
            boolean r76 = androidx.media3.common.p136b.C2613al.m7007f(r11, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r76 == 0) goto L_0x078a
            long r114 = m8222l(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = r110
            androidx.media3.exoplayer.dash.a.o r14 = (androidx.media3.exoplayer.dash.p141a.C2924o) r14     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15 = r71
            r76 = r91
            r71 = r12
            r12 = r11
            r125 = r23
            r123 = r73
            r121 = r86
            r124 = r112
            r73 = r13
            r13 = r14
            r135 = r8
            r134 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r8 = r74
            r131 = r82
            r132 = r83
            r133 = r89
            r130 = r111
            r128 = 0
            r136 = -1
            r74 = r9
            r9 = r85
            r14 = r58
            r16 = r60
            r18 = r6
            r20 = r114
            r22 = r35
            androidx.media3.exoplayer.dash.a.o r110 = m8236z(r12, r13, r14, r16, r18, r20, r22)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r137 = r2
            r12 = r81
            r14 = r114
            goto L_0x06ef
        L_0x078a:
            r135 = r8
            r129 = r19
            r140 = r20
            r126 = r21
            r125 = r23
            r134 = r71
            r123 = r73
            r8 = r74
            r131 = r82
            r132 = r83
            r121 = r86
            r133 = r89
            r76 = r91
            r130 = r111
            r124 = r112
            r128 = 0
            r136 = -1
            r74 = r9
            r71 = r12
            r73 = r13
            r9 = r85
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x07db
            long r82 = m8222l(r11, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = r110
            androidx.media3.exoplayer.dash.a.p r13 = (androidx.media3.exoplayer.dash.p141a.C2925p) r13     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = r11
            r14 = r125
            r15 = r58
            r17 = r60
            r19 = r6
            r21 = r82
            r23 = r35
            androidx.media3.exoplayer.dash.a.p r110 = m8209A(r12, r13, r14, r15, r17, r19, r21, r23)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r137 = r2
            r12 = r81
            r14 = r82
            goto L_0x06ef
        L_0x07db:
            java.lang.String r12 = "ContentProtection"
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x0800
            android.util.Pair r12 = m8224n(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Object r13 = r12.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x07f1
            java.lang.Object r13 = r12.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r81 = r13
            java.lang.String r81 = (java.lang.String) r81     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x07f1:
            java.lang.Object r13 = r12.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x07fc
            java.lang.Object r12 = r12.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r12 = (androidx.media3.common.DrmInitData.SchemeData) r12     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10.add(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x07fc:
            r137 = r2
            goto L_0x0731
        L_0x0800:
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x0810
            androidx.media3.exoplayer.dash.a.f r12 = m8217g(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.add(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x080d:
            r13 = r116
            goto L_0x0833
        L_0x0810:
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x081e
            androidx.media3.exoplayer.dash.a.f r12 = m8217g(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r1.add(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x080d
        L_0x081e:
            boolean r12 = androidx.media3.common.p136b.C2613al.m7007f(r11, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 == 0) goto L_0x082e
            androidx.media3.exoplayer.dash.a.f r12 = m8217g(r11, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = r116
            r13.add(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0833
        L_0x082e:
            r13 = r116
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0833:
            r137 = r2
            r12 = r81
        L_0x0837:
            java.lang.String r2 = "Representation"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7005d(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x08b5
            r81 = r88
            r82 = r84
            r83 = r93
            r84 = r94
            r85 = r106
            r86 = r113
            r87 = r109
            r88 = r90
            r89 = r76
            r90 = r118
            r91 = r117
            r93 = r1
            r94 = r13
            androidx.media3.common.x r109 = m8232v(r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r110 == 0) goto L_0x0862
            r111 = r110
            goto L_0x0873
        L_0x0862:
            androidx.media3.exoplayer.dash.a.r r2 = new androidx.media3.exoplayer.dash.a.r     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15 = 0
            r16 = 1
            r18 = 0
            r20 = 0
            r22 = 0
            r14 = r2
            r14.<init>(r15, r16, r18, r20, r22)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r111 = r2
        L_0x0873:
            androidx.media3.exoplayer.dash.a.d r2 = new androidx.media3.exoplayer.dash.a.d     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r5 = r4.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6 = 1
            if (r6 == r5) goto L_0x087f
            r110 = r4
            goto L_0x0881
        L_0x087f:
            r110 = r73
        L_0x0881:
            r108 = r2
            r112 = r12
            r113 = r10
            r114 = r3
            r115 = r1
            r116 = r13
            r108.<init>(r109, r110, r111, r112, r113, r114, r115, r116)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.x r1 = r2.f8329a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r1 = r1.f7496n     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r1 = androidx.media3.common.C2598ay.m6803b(r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3 = r107
            int r1 = m8210B(r3, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3 = r132
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10 = r1
            r2 = r3
            r3 = r74
            r12 = r76
            r4 = r77
            r5 = r95
            r13 = r121
            r1 = r135
            r82 = 1
            goto L_0x09b8
        L_0x08b5:
            r20 = r140
            r85 = r9
            r81 = r12
            r116 = r13
            r12 = r71
            r13 = r73
            r91 = r76
            r9 = r96
            r86 = r121
            r73 = r123
            r112 = r124
            r23 = r125
            r21 = r126
            r19 = r129
            r111 = r130
            r82 = r131
            r83 = r132
            r89 = r133
            r71 = r134
            r96 = r135
            r2 = r137
            r76 = r74
            r74 = r8
            r8 = r120
            goto L_0x066e
        L_0x08e7:
            r118 = r1
            r137 = r2
            r117 = r3
            r125 = r4
            r119 = r6
            r105 = r7
            r120 = r8
            r133 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r134 = r71
            r123 = r73
            r8 = r74
            r74 = r76
            r124 = r81
            r131 = r82
            r2 = r83
            r130 = r84
            r121 = r86
            r135 = r96
            r82 = 1
            r128 = 0
            r136 = -1
            r96 = r9
            r81 = r10
            r76 = r12
            r9 = r14
            r71 = r23
            r1 = r135
            boolean r3 = androidx.media3.common.p136b.C2613al.m7007f(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x093c
            r3 = r101
            androidx.media3.exoplayer.dash.a.r r3 = (androidx.media3.exoplayer.dash.p141a.C2927r) r3     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.r r101 = m8235y(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3 = r74
        L_0x0932:
            r12 = r76
            r4 = r77
            r10 = r81
            r5 = r95
            goto L_0x09b6
        L_0x093c:
            r3 = r74
            boolean r4 = androidx.media3.common.p136b.C2613al.m7007f(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x095e
            r6 = r102
            long r102 = m8222l(r11, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = r101
            androidx.media3.exoplayer.dash.a.o r13 = (androidx.media3.exoplayer.dash.p141a.C2924o) r13     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = r11
            r14 = r58
            r16 = r60
            r18 = r121
            r20 = r102
            r22 = r35
            androidx.media3.exoplayer.dash.a.o r101 = m8236z(r12, r13, r14, r16, r18, r20, r22)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0932
        L_0x095e:
            r6 = r102
            boolean r4 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x0980
            long r102 = m8222l(r11, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = r101
            androidx.media3.exoplayer.dash.a.p r13 = (androidx.media3.exoplayer.dash.p141a.C2925p) r13     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = r11
            r14 = r125
            r15 = r58
            r17 = r60
            r19 = r121
            r21 = r102
            r23 = r35
            androidx.media3.exoplayer.dash.a.p r101 = m8209A(r12, r13, r14, r15, r17, r19, r21, r23)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0932
        L_0x0980:
            boolean r4 = androidx.media3.common.p136b.C2613al.m7007f(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x0990
            androidx.media3.exoplayer.dash.a.f r4 = m8217g(r11, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5 = r95
            r5.add(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x09ae
        L_0x0990:
            r5 = r95
            java.lang.String r4 = "Label"
            boolean r4 = androidx.media3.common.p136b.C2613al.m7007f(r11, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x09a5
            java.lang.String r4 = "Label"
            java.lang.String r4 = m8219i(r11, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r102 = r6
            r12 = r76
            goto L_0x09b4
        L_0x09a5:
            boolean r4 = androidx.media3.common.p136b.C2613al.m7006e(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x09ae
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x09ae:
            r102 = r6
            r12 = r76
            r4 = r77
        L_0x09b4:
            r10 = r81
        L_0x09b6:
            r13 = r121
        L_0x09b8:
            java.lang.String r6 = "AdaptationSet"
            boolean r6 = androidx.media3.common.p136b.C2613al.m7005d(r11, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r6 == 0) goto L_0x0b22
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r3 = r2.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r1.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = 0
        L_0x09ca:
            int r3 = r2.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r14 >= r3) goto L_0x0b02
            java.lang.Object r3 = r2.get(r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.d r3 = (androidx.media3.exoplayer.dash.p141a.C2913d) r3     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.x r6 = r3.f8329a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.w r7 = new androidx.media3.common.w     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r7.<init>(r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x09e1
            r7.f7450b = r4     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x09e1:
            java.lang.String r6 = r3.f8332d     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r6 != 0) goto L_0x09e7
            r6 = r99
        L_0x09e7:
            java.util.ArrayList r8 = r3.f8333e     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15 = r43
            r8.addAll(r15)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r12 = r8.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 != 0) goto L_0x0aba
            r12 = 0
        L_0x09f5:
            int r13 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r12 >= r13) goto L_0x0a1e
            java.lang.Object r13 = r8.get(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r13 = (androidx.media3.common.DrmInitData.SchemeData) r13     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r132 = r2
            java.util.UUID r2 = androidx.media3.common.C2669m.f7430c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r16 = r4
            java.util.UUID r4 = r13.f7051a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x0a17
            java.lang.String r2 = r13.f7052b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x0a17
            r8.remove(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0a23
        L_0x0a17:
            int r12 = r12 + 1
            r4 = r16
            r2 = r132
            goto L_0x09f5
        L_0x0a1e:
            r132 = r2
            r16 = r4
            r2 = 0
        L_0x0a23:
            if (r2 != 0) goto L_0x0a2a
        L_0x0a25:
            r85 = r9
            r43 = r15
            goto L_0x0a61
        L_0x0a2a:
            r4 = 0
        L_0x0a2b:
            int r12 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 >= r12) goto L_0x0a25
            java.lang.Object r12 = r8.get(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r12 = (androidx.media3.common.DrmInitData.SchemeData) r12     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.UUID r13 = androidx.media3.common.C2669m.f7429b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r85 = r9
            java.util.UUID r9 = r12.f7051a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r9 = r13.equals(r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r9 == 0) goto L_0x0a58
            java.lang.String r9 = r12.f7052b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r9 != 0) goto L_0x0a58
            androidx.media3.common.DrmInitData$SchemeData r9 = new androidx.media3.common.DrmInitData$SchemeData     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.UUID r13 = androidx.media3.common.C2669m.f7430c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r43 = r15
            java.lang.String r15 = r12.f7053c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            byte[] r12 = r12.f7054d     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r9.<init>(r13, r2, r15, r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r8.set(r4, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0a5a
        L_0x0a58:
            r43 = r15
        L_0x0a5a:
            int r4 = r4 + 1
            r15 = r43
            r9 = r85
            goto L_0x0a2b
        L_0x0a61:
            int r2 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r2 = r2 + -1
        L_0x0a67:
            if (r2 < 0) goto L_0x0ab2
            java.lang.Object r4 = r8.get(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r4 = (androidx.media3.common.DrmInitData.SchemeData) r4     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r9 = r4.mo6054a()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r9 != 0) goto L_0x0aaf
            r9 = 0
        L_0x0a76:
            int r12 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r9 >= r12) goto L_0x0aaf
            java.lang.Object r12 = r8.get(r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.DrmInitData$SchemeData r12 = (androidx.media3.common.DrmInitData.SchemeData) r12     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r13 = r12.mo6054a()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 == 0) goto L_0x0aa8
            boolean r13 = r4.mo6054a()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r13 != 0) goto L_0x0aa8
            java.util.UUID r13 = r4.f7051a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.UUID r15 = androidx.media3.common.C2669m.f7428a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r17 = r4
            java.util.UUID r4 = r12.f7051a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r4 = r15.equals(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 != 0) goto L_0x0aa4
            java.util.UUID r4 = r12.f7051a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r4 = r13.equals(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 == 0) goto L_0x0aaa
        L_0x0aa4:
            r8.remove(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0aaf
        L_0x0aa8:
            r17 = r4
        L_0x0aaa:
            int r9 = r9 + 1
            r4 = r17
            goto L_0x0a76
        L_0x0aaf:
            int r2 = r2 + -1
            goto L_0x0a67
        L_0x0ab2:
            androidx.media3.common.DrmInitData r2 = new androidx.media3.common.DrmInitData     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2.<init>(r6, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r7.f7462n = r2     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0ac2
        L_0x0aba:
            r132 = r2
            r16 = r4
            r85 = r9
            r43 = r15
        L_0x0ac2:
            java.util.ArrayList r2 = r3.f8334f     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2.addAll(r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r8 = r3.f8335g     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.common.x r4 = new androidx.media3.common.x     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            com.google.common.b.gu r6 = r3.f8330b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.s r7 = r3.f8331c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.List r8 = r3.f8336h     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.List r3 = r3.f8337i     // Catch:{ XmlPullParserException -> 0x0ed7 }
            boolean r3 = r7 instanceof androidx.media3.exoplayer.dash.p141a.C2927r     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0ae2
            androidx.media3.exoplayer.dash.a.l r3 = new androidx.media3.exoplayer.dash.a.l     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.r r7 = (androidx.media3.exoplayer.dash.p141a.C2927r) r7     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.<init>(r4, r6, r7, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0aed
        L_0x0ae2:
            boolean r3 = r7 instanceof androidx.media3.exoplayer.dash.p141a.C2923n     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0afa
            androidx.media3.exoplayer.dash.a.k r3 = new androidx.media3.exoplayer.dash.a.k     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.n r7 = (androidx.media3.exoplayer.dash.p141a.C2923n) r7     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r3.<init>(r4, r6, r7, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0aed:
            r1.add(r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r14 = r14 + 1
            r4 = r16
            r9 = r85
            r2 = r132
            goto L_0x09ca
        L_0x0afa:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r2 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            throw r1     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0b02:
            r85 = r9
            androidx.media3.exoplayer.dash.a.a r2 = new androidx.media3.exoplayer.dash.a.a     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r71 = r2
            r73 = r10
            r74 = r1
            r75 = r117
            r76 = r119
            r77 = r125
            r71.<init>(r72, r73, r74, r75, r76, r77)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4 = r80
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r80 = r4
            r2 = r67
            r10 = r105
            goto L_0x0dab
        L_0x0b22:
            r16 = r4
            r20 = r140
            r83 = r2
            r76 = r3
            r95 = r5
            r74 = r8
            r77 = r16
            r4 = r32
            r5 = r43
            r23 = r71
            r2 = r104
            r7 = r105
            r3 = r117
            r6 = r119
            r8 = r120
            r73 = r123
            r81 = r124
            r85 = r125
            r21 = r126
            r19 = r129
            r84 = r130
            r82 = r131
            r15 = r133
            r71 = r134
            r43 = r137
            r32 = r9
            r9 = r96
            r96 = r1
            r1 = r118
            goto L_0x03e0
        L_0x0b5e:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L_0x0ede
        L_0x0b63:
            r79 = r6
            r105 = r7
            r120 = r8
            r96 = r9
            r78 = r10
            r134 = r12
            r123 = r13
            r8 = r15
            r129 = r19
            r140 = r20
            r126 = r21
            r85 = r32
            r137 = r43
            r82 = 1
            r128 = 0
            r32 = r4
            r4 = r5
            java.lang.String r2 = "EventStream"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7007f(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x0d3e
            java.lang.String r1 = ""
            r2 = r134
            java.lang.String r1 = m8218h(r11, r2, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r3 = ""
            r5 = r79
            java.lang.String r3 = m8218h(r11, r5, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r6 = "timescale"
            r7 = 1
            long r6 = m8216e(r11, r6, r7)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r8 = "presentationTimeOffset"
            r9 = 0
            long r20 = m8216e(r11, r8, r9)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r10 = 512(0x200, float:7.175E-43)
            r9.<init>(r10)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0bb7:
            r11.next()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r10 = "Event"
            boolean r10 = androidx.media3.common.p136b.C2613al.m7007f(r11, r10)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r10 == 0) goto L_0x0ce5
            r10 = r105
            r14 = 0
            long r18 = m8216e(r11, r10, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r12 = "duration"
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r12 = m8216e(r11, r12, r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "presentationTime"
            r80 = r4
            r79 = r5
            r4 = 0
            long r22 = m8216e(r11, r14, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = 1000(0x3e8, double:4.94E-321)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r6
            long r71 = androidx.media3.common.p136b.C2612ak.m7000y(r12, r14, r16)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r12 = r22 - r20
            r14 = 1000000(0xf4240, double:4.940656E-318)
            r16 = r6
            long r12 = androidx.media3.common.p136b.C2612ak.m7000y(r12, r14, r16)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r14 = "messageData"
            r15 = 0
            java.lang.String r14 = m8218h(r11, r14, r15)     // Catch:{ XmlPullParserException -> 0x0ce0 }
            r9.reset()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            org.xmlpull.v1.XmlSerializer r15 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.nio.charset.Charset r16 = com.google.common.base.C58913w.f156754c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r4 = r16.name()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.setOutput(r9, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r11.nextToken()     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0c13:
            java.lang.String r4 = "Event"
            boolean r4 = androidx.media3.common.p136b.C2613al.m7005d(r11, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 != 0) goto L_0x0cb5
            int r4 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            switch(r4) {
                case 0: goto L_0x0ca0;
                case 1: goto L_0x0c98;
                case 2: goto L_0x0c6c;
                case 3: goto L_0x0c60;
                case 4: goto L_0x0c58;
                case 5: goto L_0x0c50;
                case 6: goto L_0x0c48;
                case 7: goto L_0x0c40;
                case 8: goto L_0x0c38;
                case 9: goto L_0x0c30;
                case 10: goto L_0x0c28;
                default: goto L_0x0c22;
            }     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0c22:
            r134 = r2
            r22 = r6
            goto L_0x0cac
        L_0x0c28:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.docdecl(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c30:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.comment(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c38:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.processingInstruction(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c40:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.ignorableWhitespace(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c48:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.entityRef(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c50:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.cdsect(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c58:
            java.lang.String r4 = r11.getText()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.text(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c60:
            java.lang.String r4 = r11.getNamespace()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r5 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.endTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0c22
        L_0x0c6c:
            java.lang.String r4 = r11.getNamespace()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r5 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.startTag(r4, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4 = 0
        L_0x0c78:
            int r5 = r11.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r4 >= r5) goto L_0x0c22
            java.lang.String r5 = r11.getAttributeNamespace(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r134 = r2
            java.lang.String r2 = r11.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r22 = r6
            java.lang.String r6 = r11.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r15.attribute(r5, r2, r6)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r4 = r4 + 1
            r6 = r22
            r2 = r134
            goto L_0x0c78
        L_0x0c98:
            r134 = r2
            r22 = r6
            r15.endDocument()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0cac
        L_0x0ca0:
            r134 = r2
            r22 = r6
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r128)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4 = 0
            r15.startDocument(r4, r2)     // Catch:{ XmlPullParserException -> 0x01e2 }
        L_0x0cac:
            r11.nextToken()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6 = r22
            r2 = r134
            goto L_0x0c13
        L_0x0cb5:
            r134 = r2
            r22 = r6
            r15.flush()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            byte[] r2 = r9.toByteArray()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r12)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r14 == 0) goto L_0x0cca
            byte[] r2 = androidx.media3.common.p136b.C2612ak.m6961ak(r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0cca:
            androidx.media3.extractor.metadata.emsg.EventMessage r5 = new androidx.media3.extractor.metadata.emsg.EventMessage     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = r5
            r13 = r1
            r14 = r3
            r15 = r71
            r17 = r18
            r19 = r2
            r12.<init>(r13, r14, r15, r17, r19)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            android.util.Pair r2 = android.util.Pair.create(r4, r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r8.add(r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0cf2
        L_0x0ce0:
            r0 = move-exception
            r1 = r0
            r2 = r15
            goto L_0x0ede
        L_0x0ce5:
            r134 = r2
            r80 = r4
            r79 = r5
            r22 = r6
            r10 = r105
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0cf2:
            java.lang.String r2 = "EventStream"
            boolean r2 = androidx.media3.common.p136b.C2613al.m7005d(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r2 == 0) goto L_0x0d32
            int r2 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long[] r2 = new long[r2]     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r4 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.extractor.metadata.emsg.EventMessage[] r4 = new androidx.media3.extractor.metadata.emsg.EventMessage[r4]     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r14 = 0
        L_0x0d07:
            int r5 = r8.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r14 >= r5) goto L_0x0d26
            java.lang.Object r5 = r8.get(r14)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            android.util.Pair r5 = (android.util.Pair) r5     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Object r6 = r5.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r6 = r6.longValue()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2[r14] = r6     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Object r5 = r5.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.extractor.metadata.emsg.EventMessage r5 = (androidx.media3.extractor.metadata.emsg.EventMessage) r5     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r4[r14] = r5     // Catch:{ XmlPullParserException -> 0x0ed7 }
            int r14 = r14 + 1
            goto L_0x0d07
        L_0x0d26:
            androidx.media3.exoplayer.dash.a.g r5 = new androidx.media3.exoplayer.dash.a.g     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5.<init>(r1, r3, r2, r4)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2 = r67
            r2.add(r5)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0dab
        L_0x0d32:
            r105 = r10
            r6 = r22
            r5 = r79
            r4 = r80
            r2 = r134
            goto L_0x0bb7
        L_0x0d3e:
            r80 = r4
            r2 = r67
            r10 = r105
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r1 == 0) goto L_0x0d54
            r1 = 0
            androidx.media3.exoplayer.dash.a.r r54 = m8235y(r11, r1)     // Catch:{ XmlPullParserException -> 0x0d50 }
            goto L_0x0dab
        L_0x0d50:
            r0 = move-exception
            r2 = r1
            goto L_0x0ed5
        L_0x0d54:
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r1 == 0) goto L_0x0d76
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = m8222l(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = 0
            r12 = r11
            r14 = r58
            r16 = r60
            r18 = r69
            r20 = r5
            r22 = r35
            androidx.media3.exoplayer.dash.a.o r54 = m8236z(r12, r13, r14, r16, r18, r20, r22)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0d73:
            r63 = r5
            goto L_0x0dab
        L_0x0d76:
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r11, r8)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r1 == 0) goto L_0x0d9a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r5 = m8222l(r11, r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r13 = 0
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89845m()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r12 = r11
            r15 = r58
            r17 = r60
            r19 = r69
            r21 = r5
            r23 = r35
            androidx.media3.exoplayer.dash.a.p r54 = m8209A(r12, r13, r14, r15, r17, r19, r21, r23)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0d73
        L_0x0d9a:
            java.lang.String r1 = "AssetIdentifier"
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r1 == 0) goto L_0x0da8
            java.lang.String r1 = "AssetIdentifier"
            m8217g(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            goto L_0x0dab
        L_0x0da8:
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0dab:
            r1 = r66
            boolean r3 = androidx.media3.common.p136b.C2613al.m7005d(r11, r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0e1e
            androidx.media3.exoplayer.dash.a.h r3 = new androidx.media3.exoplayer.dash.a.h     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r54 = r3
            r58 = r80
            r59 = r2
            r54.<init>(r55, r56, r58, r59)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Long r2 = java.lang.Long.valueOf(r60)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            android.util.Pair r2 = android.util.Pair.create(r3, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Object r3 = r2.first     // Catch:{ XmlPullParserException -> 0x0ed7 }
            androidx.media3.exoplayer.dash.a.h r3 = (androidx.media3.exoplayer.dash.p141a.C2917h) r3     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r4 = r3.f8351b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0df9
            if (r129 == 0) goto L_0x0dde
            r4 = r140
            r14 = r126
            r49 = 1
            goto L_0x0e1b
        L_0x0dde:
            int r1 = r140.size()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r3 = "Unable to determine start of period "
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2.append(r1)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.String r1 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6821c(r1, r2)     // Catch:{ XmlPullParserException -> 0x0ed4 }
            throw r1     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0df9:
            java.lang.Object r2 = r2.second     // Catch:{ XmlPullParserException -> 0x0ed7 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r4 = r2.longValue()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0e12
            r4 = r140
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0e18
        L_0x0e12:
            long r6 = r3.f8351b     // Catch:{ XmlPullParserException -> 0x0ed7 }
            long r14 = r6 + r4
            r4 = r140
        L_0x0e18:
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0e1b:
            r5 = r51
            goto L_0x0e66
        L_0x0e1e:
            r20 = r140
            r66 = r1
            r67 = r2
            r7 = r10
            r4 = r32
            r3 = r68
            r1 = r69
            r10 = r78
            r6 = r79
            r5 = r80
            r32 = r85
            r9 = r96
            r8 = r120
            r13 = r123
            r21 = r126
            r19 = r129
            r12 = r134
            r43 = r137
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x02ed
        L_0x0e48:
            r62 = r2
            r10 = r7
            r120 = r8
            r96 = r9
            r123 = r13
            r126 = r14
            r129 = r19
            r4 = r20
            r85 = r32
            r137 = r43
            r82 = 1
            r128 = 0
            m8220j(r11)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r5 = r51
            r14 = r126
        L_0x0e66:
            r2 = r25
            boolean r3 = androidx.media3.common.p136b.C2613al.m7005d(r11, r2)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r3 == 0) goto L_0x0ead
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r28 > r7 ? 1 : (r28 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0e8b
            int r1 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0e7e
            r28 = r14
            goto L_0x0e8b
        L_0x0e7e:
            if (r129 == 0) goto L_0x0e83
            r28 = r7
            goto L_0x0e8b
        L_0x0e83:
            java.lang.String r1 = "Unable to determine duration of static manifest."
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6821c(r1, r2)     // Catch:{ XmlPullParserException -> 0x0ed4 }
            throw r1     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0e8b:
            boolean r1 = r4.isEmpty()     // Catch:{ XmlPullParserException -> 0x0ed7 }
            if (r1 != 0) goto L_0x0ea5
            androidx.media3.exoplayer.dash.a.c r1 = new androidx.media3.exoplayer.dash.a.c     // Catch:{ XmlPullParserException -> 0x0ed7 }
            r25 = r1
            r32 = r129
            r41 = r47
            r42 = r44
            r43 = r46
            r44 = r45
            r45 = r4
            r25.<init>(r26, r28, r30, r32, r33, r35, r37, r39, r41, r42, r43, r44, r45)     // Catch:{ XmlPullParserException -> 0x0ed7 }
            return r1
        L_0x0ea5:
            java.lang.String r1 = "No periods found."
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6821c(r1, r2)     // Catch:{ XmlPullParserException -> 0x0ed4 }
            throw r1     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0ead:
            r25 = r2
            r20 = r4
            r7 = r10
            r4 = r50
            r3 = r53
            r2 = r62
            r32 = r85
            r9 = r96
            r8 = r120
            r13 = r123
            r19 = r129
            r43 = r137
            r10 = r138
            goto L_0x010f
        L_0x0ec8:
            r0 = move-exception
            r1 = r0
            r2 = r14
            goto L_0x0ede
        L_0x0ecc:
            java.lang.String r1 = "inputStream does not contain a valid media presentation description"
            r2 = 0
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6821c(r1, r2)     // Catch:{ XmlPullParserException -> 0x0ed4 }
            throw r1     // Catch:{ XmlPullParserException -> 0x0ed7 }
        L_0x0ed4:
            r0 = move-exception
        L_0x0ed5:
            r1 = r0
            goto L_0x0ede
        L_0x0ed7:
            r0 = move-exception
            r1 = r0
            r2 = 0
            goto L_0x0ede
        L_0x0edb:
            r0 = move-exception
            r1 = r0
            r2 = r9
        L_0x0ede:
            androidx.media3.common.az r1 = androidx.media3.common.C2599az.m6821c(r2, r1)
            goto L_0x0ee4
        L_0x0ee3:
            throw r1
        L_0x0ee4:
            goto L_0x0ee3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.dash.p141a.C2914e.mo6768a(android.net.Uri, java.io.InputStream):androidx.media3.exoplayer.dash.a.c");
    }
}
