package androidx.media3.extractor.p163j.p169f;

import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3470b;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: androidx.media3.extractor.j.f.f */
/* compiled from: PG */
public final class C3502f extends C3470b {

    /* renamed from: f */
    static final Pattern f10899f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g */
    static final Pattern f10900g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: h */
    private static final Pattern f10901h = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: i */
    private static final Pattern f10902i = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: j */
    private static final Pattern f10903j = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: k */
    private static final Pattern f10904k = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: l */
    private static final Pattern f10905l = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: m */
    private static final C3500d f10906m = new C3500d(30.0f, 1, 1);

    /* renamed from: n */
    private static final C3499c f10907n = new C3499c(15);

    /* renamed from: o */
    private final XmlPullParserFactory f10908o;

    public C3502f() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f10908o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (r14.equals(com.google.common.p4526f.p4528b.p4529a.C59002s.f156871a) != false) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012b  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m10115m(java.lang.String r14, androidx.media3.extractor.p163j.p169f.C3500d r15) {
        /*
            java.util.regex.Pattern r0 = f10901h
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x0091
            java.lang.String r14 = r0.group(r8)
            r14.getClass()
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            r14.getClass()
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            r14.getClass()
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x005a
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x005b
        L_0x005a:
            r10 = r5
        L_0x005b:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x006c
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f10894a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x006d
        L_0x006c:
            r10 = r5
        L_0x006d:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x008c
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f10895b
            double r4 = (double) r14
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r14 = r15.f10894a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r5 = r0 / r14
        L_0x008c:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x0091:
            java.util.regex.Pattern r0 = f10902i
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x0136
            java.lang.String r14 = r0.group(r8)
            r14.getClass()
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            r14.getClass()
            int r0 = r14.hashCode()
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00fd
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L_0x00f3
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L_0x00e9
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L_0x00df
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x00d6
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00cc
            goto L_0x0107
        L_0x00cc:
            java.lang.String r0 = "t"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            r7 = 5
            goto L_0x0108
        L_0x00d6:
            java.lang.String r0 = "s"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            goto L_0x0108
        L_0x00df:
            java.lang.String r0 = "ms"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            r7 = 3
            goto L_0x0108
        L_0x00e9:
            java.lang.String r0 = "m"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            r7 = 1
            goto L_0x0108
        L_0x00f3:
            java.lang.String r0 = "h"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            r7 = 0
            goto L_0x0108
        L_0x00fd:
            java.lang.String r0 = "f"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x0107
            r7 = 4
            goto L_0x0108
        L_0x0107:
            r7 = -1
        L_0x0108:
            if (r7 == 0) goto L_0x012b
            if (r7 == r8) goto L_0x0128
            if (r7 == r6) goto L_0x0121
            if (r7 == r5) goto L_0x011a
            if (r7 == r4) goto L_0x0113
            goto L_0x0132
        L_0x0113:
            int r14 = r15.f10896c
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            goto L_0x0126
        L_0x011a:
            float r14 = r15.f10894a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            goto L_0x0126
        L_0x0121:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x0126:
            double r9 = r9 / r14
            goto L_0x0132
        L_0x0128:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0130
        L_0x012b:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0130:
            double r9 = r9 * r14
        L_0x0132:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x0136:
            androidx.media3.extractor.j.e r15 = new androidx.media3.extractor.j.e
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r14 = r0.concat(r14)
            r15.<init>((java.lang.String) r14)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p169f.C3502f.m10115m(java.lang.String, androidx.media3.extractor.j.f.d):long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment m10116n(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.common.base.C58890d.m90988c(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x0038;
                case 100571: goto L_0x002e;
                case 3317767: goto L_0x0024;
                case 108511772: goto L_0x001a;
                case 109757538: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0042
        L_0x0010:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 0
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 3
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0042
            r5 = 4
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == 0) goto L_0x0055
            if (r5 == r4) goto L_0x0055
            if (r5 == r3) goto L_0x0052
            if (r5 == r2) goto L_0x0052
            if (r5 == r1) goto L_0x004f
            r5 = 0
            return r5
        L_0x004f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L_0x0052:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L_0x0055:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p169f.C3502f.m10116n(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: o */
    private static C3506j m10117o(C3506j jVar) {
        return jVar == null ? new C3506j() : jVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.media3.extractor.p163j.p169f.C3506j m10118p(org.xmlpull.v1.XmlPullParser r14, androidx.media3.extractor.p163j.p169f.C3506j r15) {
        /*
            int r0 = r14.getAttributeCount()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x03ce
            java.lang.String r3 = r14.getAttributeValue(r2)
            java.lang.String r4 = r14.getAttributeName(r2)
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00b7;
                case -1224696685: goto L_0x00ad;
                case -1065511464: goto L_0x00a3;
                case -879295043: goto L_0x0098;
                case -734428249: goto L_0x008e;
                case 3355: goto L_0x0084;
                case 3511770: goto L_0x0079;
                case 94842723: goto L_0x006f;
                case 109403361: goto L_0x0064;
                case 110138194: goto L_0x0059;
                case 365601008: goto L_0x004e;
                case 921125321: goto L_0x0042;
                case 1115953443: goto L_0x0036;
                case 1287124693: goto L_0x002b;
                case 1754920356: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00c1
        L_0x001f:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 8
            goto L_0x00c2
        L_0x002b:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 1
            goto L_0x00c2
        L_0x0036:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 11
            goto L_0x00c2
        L_0x0042:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 13
            goto L_0x00c2
        L_0x004e:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 4
            goto L_0x00c2
        L_0x0059:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 9
            goto L_0x00c2
        L_0x0064:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 14
            goto L_0x00c2
        L_0x006f:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 2
            goto L_0x00c2
        L_0x0079:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 10
            goto L_0x00c2
        L_0x0084:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 0
            goto L_0x00c2
        L_0x008e:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 5
            goto L_0x00c2
        L_0x0098:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 12
            goto L_0x00c2
        L_0x00a3:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 7
            goto L_0x00c2
        L_0x00ad:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 3
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00c1
            r4 = 6
            goto L_0x00c2
        L_0x00c1:
            r4 = -1
        L_0x00c2:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x03b8;
                case 1: goto L_0x039e;
                case 2: goto L_0x0384;
                case 3: goto L_0x037d;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0294;
                case 6: goto L_0x0286;
                case 7: goto L_0x027a;
                case 8: goto L_0x026e;
                case 9: goto L_0x0232;
                case 10: goto L_0x01bd;
                case 11: goto L_0x0181;
                case 12: goto L_0x0124;
                case 13: goto L_0x0118;
                case 14: goto L_0x00c9;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x03ca
        L_0x00c9:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            java.util.regex.Pattern r4 = f10899f
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r6 = r4.matches()
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r6 != 0) goto L_0x00ea
            java.lang.String r4 = "Invalid value for shear: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
            goto L_0x0114
        L_0x00ea:
            java.lang.String r4 = r4.group(r11)     // Catch:{ NumberFormatException -> 0x0102 }
            r4.getClass()
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ NumberFormatException -> 0x0102 }
            r6 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r4 = java.lang.Math.max(r6, r4)     // Catch:{ NumberFormatException -> 0x0102 }
            r6 = 1120403456(0x42c80000, float:100.0)
            float r7 = java.lang.Math.min(r6, r4)     // Catch:{ NumberFormatException -> 0x0102 }
            goto L_0x0114
        L_0x0102:
            r4 = move-exception
            java.lang.String r6 = "Failed to parse shear: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r6.concat(r3)
            java.lang.String r3 = androidx.media3.common.p136b.C2633u.m7046a(r3, r4)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
        L_0x0114:
            r15.f10950s = r7
            goto L_0x03ca
        L_0x0118:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            androidx.media3.extractor.j.f.b r3 = androidx.media3.extractor.p163j.p169f.C3498b.m10114a(r3)
            r15.f10949r = r3
            goto L_0x03ca
        L_0x0124:
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x014e;
                case -1026963764: goto L_0x0144;
                case 913457136: goto L_0x013a;
                case 1679736913: goto L_0x0130;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0157
        L_0x0130:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0157
            r8 = 0
            goto L_0x0157
        L_0x013a:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0157
            r8 = 1
            goto L_0x0157
        L_0x0144:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0157
            r8 = 2
            goto L_0x0157
        L_0x014e:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0157
            r8 = 3
        L_0x0157:
            if (r8 == 0) goto L_0x0179
            if (r8 == r11) goto L_0x0171
            if (r8 == r10) goto L_0x0169
            if (r8 == r9) goto L_0x0161
            goto L_0x03ca
        L_0x0161:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10938g = r1
            goto L_0x03ca
        L_0x0169:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10938g = r11
            goto L_0x03ca
        L_0x0171:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10937f = r1
            goto L_0x03ca
        L_0x0179:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10937f = r11
            goto L_0x03ca
        L_0x0181:
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            int r4 = r3.hashCode()
            r5 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            if (r4 == r5) goto L_0x019e
            r5 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r5) goto L_0x0194
            goto L_0x01a7
        L_0x0194:
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01a7
            r8 = 1
            goto L_0x01a7
        L_0x019e:
            java.lang.String r4 = "before"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01a7
            r8 = 0
        L_0x01a7:
            if (r8 == 0) goto L_0x01b5
            if (r8 == r11) goto L_0x01ad
            goto L_0x03ca
        L_0x01ad:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10945n = r10
            goto L_0x03ca
        L_0x01b5:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10945n = r11
            goto L_0x03ca
        L_0x01bd:
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x01fb;
                case -410956671: goto L_0x01f1;
                case -250518009: goto L_0x01e7;
                case -136074796: goto L_0x01dd;
                case 3016401: goto L_0x01d3;
                case 3556653: goto L_0x01c9;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x0204
        L_0x01c9:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 3
            goto L_0x0204
        L_0x01d3:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 1
            goto L_0x0204
        L_0x01dd:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 4
            goto L_0x0204
        L_0x01e7:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 5
            goto L_0x0204
        L_0x01f1:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 0
            goto L_0x0204
        L_0x01fb:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0204
            r8 = 2
        L_0x0204:
            if (r8 == 0) goto L_0x022a
            if (r8 == r11) goto L_0x0222
            if (r8 == r10) goto L_0x0222
            if (r8 == r9) goto L_0x021a
            if (r8 == r7) goto L_0x021a
            if (r8 == r6) goto L_0x0212
            goto L_0x03ca
        L_0x0212:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10944m = r7
            goto L_0x03ca
        L_0x021a:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10944m = r9
            goto L_0x03ca
        L_0x0222:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10944m = r10
            goto L_0x03ca
        L_0x022a:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10944m = r11
            goto L_0x03ca
        L_0x0232:
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            int r4 = r3.hashCode()
            r5 = 96673(0x179a1, float:1.35468E-40)
            if (r4 == r5) goto L_0x024f
            r5 = 3387192(0x33af38, float:4.746467E-39)
            if (r4 == r5) goto L_0x0245
            goto L_0x0258
        L_0x0245:
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0258
            r8 = 0
            goto L_0x0258
        L_0x024f:
            java.lang.String r4 = "all"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0258
            r8 = 1
        L_0x0258:
            if (r8 == 0) goto L_0x0266
            if (r8 == r11) goto L_0x025e
            goto L_0x03ca
        L_0x025e:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10948q = r11
            goto L_0x03ca
        L_0x0266:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10948q = r1
            goto L_0x03ca
        L_0x026e:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            android.text.Layout$Alignment r3 = m10116n(r3)
            r15.f10947p = r3
            goto L_0x03ca
        L_0x027a:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            android.text.Layout$Alignment r3 = m10116n(r3)
            r15.f10946o = r3
            goto L_0x03ca
        L_0x0286:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r15.f10940i = r3
            goto L_0x03ca
        L_0x0294:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            r15.f10939h = r3
            goto L_0x03ca
        L_0x02a2:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)     // Catch:{ e -> 0x036f }
            java.lang.String r4 = "\\s+"
            java.lang.String[] r4 = androidx.media3.common.p136b.C2612ak.m6967aq(r3, r4)     // Catch:{ e -> 0x036f }
            int r6 = r4.length     // Catch:{ e -> 0x036f }
            if (r6 != r11) goto L_0x02b6
            java.util.regex.Pattern r4 = f10903j     // Catch:{ e -> 0x036f }
            java.util.regex.Matcher r4 = r4.matcher(r3)     // Catch:{ e -> 0x036f }
            goto L_0x02c5
        L_0x02b6:
            if (r6 != r10) goto L_0x0353
            java.util.regex.Pattern r6 = f10903j     // Catch:{ e -> 0x036f }
            r4 = r4[r11]     // Catch:{ e -> 0x036f }
            java.util.regex.Matcher r4 = r6.matcher(r4)     // Catch:{ e -> 0x036f }
            java.lang.String r6 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            androidx.media3.common.p136b.C2633u.m7050e(r5, r6)     // Catch:{ e -> 0x036f }
        L_0x02c5:
            boolean r6 = r4.matches()     // Catch:{ e -> 0x036f }
            java.lang.String r7 = "'."
            if (r6 == 0) goto L_0x0339
            java.lang.String r6 = r4.group(r9)     // Catch:{ e -> 0x036f }
            r6.getClass()
            int r12 = r6.hashCode()     // Catch:{ e -> 0x036f }
            r13 = 37
            if (r12 == r13) goto L_0x02f9
            r13 = 3240(0xca8, float:4.54E-42)
            if (r12 == r13) goto L_0x02ef
            r13 = 3592(0xe08, float:5.033E-42)
            if (r12 == r13) goto L_0x02e5
            goto L_0x0302
        L_0x02e5:
            java.lang.String r12 = "px"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x0302
            r8 = 0
            goto L_0x0302
        L_0x02ef:
            java.lang.String r12 = "em"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x0302
            r8 = 1
            goto L_0x0302
        L_0x02f9:
            java.lang.String r12 = "%"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x0302
            r8 = 2
        L_0x0302:
            if (r8 == 0) goto L_0x0328
            if (r8 == r11) goto L_0x0325
            if (r8 != r10) goto L_0x030b
            r15.f10941j = r9     // Catch:{ e -> 0x036f }
            goto L_0x032a
        L_0x030b:
            androidx.media3.extractor.j.e r4 = new androidx.media3.extractor.j.e     // Catch:{ e -> 0x036f }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ e -> 0x036f }
            r8.<init>()     // Catch:{ e -> 0x036f }
            java.lang.String r9 = "Invalid unit for fontSize: '"
            r8.append(r9)     // Catch:{ e -> 0x036f }
            r8.append(r6)     // Catch:{ e -> 0x036f }
            r8.append(r7)     // Catch:{ e -> 0x036f }
            java.lang.String r6 = r8.toString()     // Catch:{ e -> 0x036f }
            r4.<init>((java.lang.String) r6)     // Catch:{ e -> 0x036f }
            throw r4     // Catch:{ e -> 0x036f }
        L_0x0325:
            r15.f10941j = r10     // Catch:{ e -> 0x036f }
            goto L_0x032a
        L_0x0328:
            r15.f10941j = r11     // Catch:{ e -> 0x036f }
        L_0x032a:
            java.lang.String r4 = r4.group(r11)     // Catch:{ e -> 0x036f }
            r4.getClass()
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ e -> 0x036f }
            r15.f10942k = r4     // Catch:{ e -> 0x036f }
            goto L_0x03ca
        L_0x0339:
            androidx.media3.extractor.j.e r4 = new androidx.media3.extractor.j.e     // Catch:{ e -> 0x036f }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ e -> 0x036f }
            r6.<init>()     // Catch:{ e -> 0x036f }
            java.lang.String r8 = "Invalid expression for fontSize: '"
            r6.append(r8)     // Catch:{ e -> 0x036f }
            r6.append(r3)     // Catch:{ e -> 0x036f }
            r6.append(r7)     // Catch:{ e -> 0x036f }
            java.lang.String r6 = r6.toString()     // Catch:{ e -> 0x036f }
            r4.<init>((java.lang.String) r6)     // Catch:{ e -> 0x036f }
            throw r4     // Catch:{ e -> 0x036f }
        L_0x0353:
            androidx.media3.extractor.j.e r4 = new androidx.media3.extractor.j.e     // Catch:{ e -> 0x036f }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ e -> 0x036f }
            r7.<init>()     // Catch:{ e -> 0x036f }
            java.lang.String r8 = "Invalid number of entries for fontSize: "
            r7.append(r8)     // Catch:{ e -> 0x036f }
            r7.append(r6)     // Catch:{ e -> 0x036f }
            java.lang.String r6 = "."
            r7.append(r6)     // Catch:{ e -> 0x036f }
            java.lang.String r6 = r7.toString()     // Catch:{ e -> 0x036f }
            r4.<init>((java.lang.String) r6)     // Catch:{ e -> 0x036f }
            throw r4     // Catch:{ e -> 0x036f }
        L_0x036f:
            java.lang.String r4 = "Failed parsing fontSize value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
            goto L_0x03ca
        L_0x037d:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10932a = r3
            goto L_0x03ca
        L_0x0384:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            int r4 = androidx.media3.common.p136b.C2618f.m7015a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0390 }
            r15.mo7446d(r4)     // Catch:{ IllegalArgumentException -> 0x0390 }
            goto L_0x03ca
        L_0x0390:
            java.lang.String r4 = "Failed parsing color value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
            goto L_0x03ca
        L_0x039e:
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            int r4 = androidx.media3.common.p136b.C2618f.m7015a(r3, r1)     // Catch:{ IllegalArgumentException -> 0x03aa }
            r15.mo7445c(r4)     // Catch:{ IllegalArgumentException -> 0x03aa }
            goto L_0x03ca
        L_0x03aa:
            java.lang.String r4 = "Failed parsing background value: "
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r4.concat(r3)
            androidx.media3.common.p136b.C2633u.m7050e(r5, r3)
            goto L_0x03ca
        L_0x03b8:
            java.lang.String r4 = "style"
            java.lang.String r5 = r14.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x03ca
            androidx.media3.extractor.j.f.j r15 = m10117o(r15)
            r15.f10943l = r3
        L_0x03ca:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x03ce:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p169f.C3502f.m10118p(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.j.f.j):androidx.media3.extractor.j.f.j");
    }

    /* renamed from: q */
    private static String[] m10119q(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : C2612ak.m6967aq(trim, "\\s+");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r36v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: androidx.media3.extractor.j.f.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: androidx.media3.extractor.j.f.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: androidx.media3.extractor.j.f.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v39, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v21, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v23, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v24, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v25, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v26, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v74, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v76, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v78, resolved type: java.util.HashMap} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0551, code lost:
        r9 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0598, code lost:
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0599, code lost:
        if (r6 == 0) goto L_0x05ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x059c, code lost:
        if (r6 == 1) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x059f, code lost:
        if (r6 == 2) goto L_0x05da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x05a2, code lost:
        if (r6 == 3) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05a5, code lost:
        if (r6 == 4) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x05a7, code lost:
        if (r6 == 5) goto L_0x05ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05b1, code lost:
        if (r12.startsWith("#") == false) goto L_0x05a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05b3, code lost:
        r29 = r12.substring(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05be, code lost:
        if (r7.containsKey(r12) == false) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05c0, code lost:
        r28 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05c3, code lost:
        r6 = m10119q(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05c9, code lost:
        if (r6.length <= 0) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x05cb, code lost:
        r27 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05cd, code lost:
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05d1, code lost:
        r1 = r0;
        r52 = r3;
        r2 = r34;
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05da, code lost:
        r6 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x05dd, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r37 = m10115m(r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x05e2, code lost:
        r6 = r36;
        r24 = m10115m(r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x05ea, code lost:
        r6 = r36;
        r22 = m10115m(r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x05f1, code lost:
        r4 = r4 + 1;
        r36 = r6;
        r21 = r9;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0633, code lost:
        r0 = e;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x05f1, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x05f1, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x05f1, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f1 A[SYNTHETIC, Splitter:B:100:0x01f1] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0284 A[Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }, LOOP:1: B:133:0x0284->B:295:0x0512, LOOP_START, PHI: r2 r6 r9 
      PHI: (r2v34 java.lang.Object) = (r2v10 java.lang.Object), (r2v36 java.lang.Object) binds: [B:132:0x0282, B:295:0x0512] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v39 java.util.HashMap) = (r6v1 java.util.HashMap), (r6v41 java.util.HashMap) binds: [B:132:0x0282, B:295:0x0512] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r9v33 java.lang.String) = (r9v12 java.lang.String), (r9v34 java.lang.String) binds: [B:132:0x0282, B:295:0x0512] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x041c  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0439 A[Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04d4 A[Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x063e  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0676 A[Catch:{ e -> 0x0684 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0197 A[Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.p163j.C3482c mo7433l(byte[] r51, int r52, boolean r53) {
        /*
            r50 = this;
            java.lang.String r1 = ""
            java.lang.String r2 = "\n"
            java.lang.String r3 = "http://www.w3.org/ns/ttml#parameter"
            r4 = r50
            org.xmlpull.v1.XmlPullParserFactory r5 = r4.f10908o     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.h r15 = new androidx.media3.extractor.j.f.h     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r10 = ""
            r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r15
            r21 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r9 = r21
            r7.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r10 = 0
            r11 = r51
            r12 = r52
            r9.<init>(r11, r10, r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r11 = 0
            r5.setInput(r9, r11)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r12 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.d r13 = f10906m     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.c r14 = f10907n     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r15 = r11
            r17 = r15
            r16 = 0
        L_0x006d:
            r11 = 1
            if (r12 == r11) goto L_0x0755
            java.lang.Object r18 = r9.peek()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r11 = r18
            androidx.media3.extractor.j.f.g r11 = (androidx.media3.extractor.p163j.p169f.C3503g) r11     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r16 != 0) goto L_0x0721
            java.lang.String r10 = r5.getName()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r31 = r1
            java.lang.String r1 = "tt"
            java.lang.String r4 = " "
            r21 = r13
            r13 = 2
            if (r12 != r13) goto L_0x06a8
            boolean r12 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r13 = "TtmlDecoder"
            if (r12 == 0) goto L_0x01d7
            java.lang.String r12 = "frameRate"
            java.lang.String r12 = r5.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r12 == 0) goto L_0x009e
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x00a0
        L_0x009e:
            r12 = 30
        L_0x00a0:
            java.lang.String r14 = "frameRateMultiplier"
            java.lang.String r14 = r5.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r14 == 0) goto L_0x00cf
            java.lang.String[] r14 = androidx.media3.common.p136b.C2612ak.m6967aq(r14, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r32 = r15
            int r15 = r14.length     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r33 = r2
            r2 = 2
            if (r15 != r2) goto L_0x00c7
            r2 = 0
            r15 = r14[r2]     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r15 = java.lang.Integer.parseInt(r15)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r15 = (float) r15     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r17 = 1
            r14 = r14[r17]     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r14 = (float) r14     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r15 = r15 / r14
            goto L_0x00d6
        L_0x00c7:
            androidx.media3.extractor.j.e r1 = new androidx.media3.extractor.j.e     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r2 = "frameRateMultiplier doesn't have 2 parts"
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            throw r1     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
        L_0x00cf:
            r33 = r2
            r32 = r15
            r2 = 0
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x00d6:
            androidx.media3.extractor.j.f.d r14 = f10906m     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r2 = r14.f10895b     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r17 = r2
            java.lang.String r2 = "subFrameRate"
            java.lang.String r2 = r5.getAttributeValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r2 == 0) goto L_0x00e9
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x00eb
        L_0x00e9:
            r2 = r17
        L_0x00eb:
            int r14 = r14.f10896c     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r17 = r14
            java.lang.String r14 = "tickRate"
            java.lang.String r14 = r5.getAttributeValue(r3, r14)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r14 == 0) goto L_0x00fe
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r34 = r9
            goto L_0x0102
        L_0x00fe:
            r34 = r9
            r14 = r17
        L_0x0102:
            androidx.media3.extractor.j.f.d r9 = new androidx.media3.extractor.j.f.d     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r12 = (float) r12     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r12 = r12 * r15
            r9.<init>(r12, r2, r14)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.c r2 = f10907n     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r12 = "cellResolution"
            java.lang.String r12 = r5.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r12 == 0) goto L_0x0184
            java.util.regex.Pattern r14 = f10905l     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.regex.Matcher r14 = r14.matcher(r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r15 = r14.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r15 != 0) goto L_0x012a
            java.lang.String r4 = "Ignoring malformed cell resolution: "
            java.lang.String r4 = r4.concat(r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x0184
        L_0x012a:
            r15 = 1
            java.lang.String r17 = r14.group(r15)     // Catch:{ NumberFormatException -> 0x0174 }
            r17.getClass()
            int r15 = java.lang.Integer.parseInt(r17)     // Catch:{ NumberFormatException -> 0x0174 }
            r17 = r2
            r2 = 2
            java.lang.String r14 = r14.group(r2)     // Catch:{ NumberFormatException -> 0x0176 }
            r14.getClass()
            int r2 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x0176 }
            if (r15 == 0) goto L_0x0153
            if (r2 == 0) goto L_0x0153
            androidx.media3.extractor.j.f.c r4 = new androidx.media3.extractor.j.f.c     // Catch:{ NumberFormatException -> 0x0176 }
            r4.<init>(r2)     // Catch:{ NumberFormatException -> 0x0176 }
            r35 = r3
            r14 = r4
            r21 = r9
            goto L_0x018c
        L_0x0153:
            androidx.media3.extractor.j.e r14 = new androidx.media3.extractor.j.e     // Catch:{ NumberFormatException -> 0x0176 }
            r35 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0178 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0178 }
            r21 = r9
            java.lang.String r9 = "Invalid cell resolution "
            r3.append(r9)     // Catch:{ NumberFormatException -> 0x017a }
            r3.append(r15)     // Catch:{ NumberFormatException -> 0x017a }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x017a }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x017a }
            java.lang.String r2 = r3.toString()     // Catch:{ NumberFormatException -> 0x017a }
            r14.<init>((java.lang.String) r2)     // Catch:{ NumberFormatException -> 0x017a }
            throw r14     // Catch:{ NumberFormatException -> 0x017a }
        L_0x0174:
            r17 = r2
        L_0x0176:
            r35 = r3
        L_0x0178:
            r21 = r9
        L_0x017a:
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            java.lang.String r2 = r2.concat(r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x018a
        L_0x0184:
            r17 = r2
            r35 = r3
            r21 = r9
        L_0x018a:
            r14 = r17
        L_0x018c:
            java.lang.String r2 = "extent"
            java.lang.String r2 = androidx.media3.common.p136b.C2613al.m7002a(r5, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r2 != 0) goto L_0x0197
        L_0x0194:
            r17 = 0
            goto L_0x01df
        L_0x0197:
            java.util.regex.Pattern r3 = f10904k     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r4 = r3.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r4 != 0) goto L_0x01ad
            java.lang.String r3 = "Ignoring non-pixel tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x0194
        L_0x01ad:
            r4 = 1
            java.lang.String r9 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x01cd }
            r9.getClass()
            int r4 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01cd }
            r9 = 2
            java.lang.String r3 = r3.group(r9)     // Catch:{ NumberFormatException -> 0x01cd }
            r3.getClass()
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01cd }
            androidx.media3.extractor.j.f.e r9 = new androidx.media3.extractor.j.f.e     // Catch:{ NumberFormatException -> 0x01cd }
            r9.<init>(r4, r3)     // Catch:{ NumberFormatException -> 0x01cd }
            r17 = r9
            goto L_0x01df
        L_0x01cd:
            java.lang.String r3 = "Ignoring malformed tts extent: "
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x0194
        L_0x01d7:
            r33 = r2
            r35 = r3
            r34 = r9
            r32 = r15
        L_0x01df:
            r3 = r17
            r2 = r21
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r4 = "metadata"
            java.lang.String r9 = "region"
            java.lang.String r12 = "head"
            java.lang.String r15 = "style"
            if (r1 != 0) goto L_0x027e
            boolean r1 = r10.equals(r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "body"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "div"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "p"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "span"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "br"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            boolean r1 = r10.equals(r15)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "styling"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "layout"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            boolean r1 = r10.equals(r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            boolean r1 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "image"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "data"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 != 0) goto L_0x027e
            java.lang.String r1 = "information"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x025a
            goto L_0x027e
        L_0x025a:
            java.lang.String r1 = r5.getName()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r9 = "Ignoring unsupported tag: "
            r4.append(r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r4.append(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r1 = r4.toString()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7049d(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r13 = r2
            r17 = r3
            r3 = r6
            r15 = r32
            r9 = r33
            r2 = r34
            goto L_0x06a4
        L_0x027e:
            boolean r1 = r12.equals(r10)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x051a
        L_0x0284:
            r5.next()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r5, r15)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x02c9
            java.lang.String r1 = androidx.media3.common.p136b.C2613al.m7002a(r5, r15)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.j r11 = new androidx.media3.extractor.j.f.j     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.j r11 = m10118p(r5, r11)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x02b8
            java.lang.String[] r1 = m10119q(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r10 = r1.length     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r36 = r2
            r2 = 0
        L_0x02a4:
            if (r2 >= r10) goto L_0x02ba
            r18 = r10
            r10 = r1[r2]     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.Object r10 = r6.get(r10)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.j r10 = (androidx.media3.extractor.p163j.p169f.C3506j) r10     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r11.mo7444b(r10)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r2 = r2 + 1
            r10 = r18
            goto L_0x02a4
        L_0x02b8:
            r36 = r2
        L_0x02ba:
            java.lang.String r1 = r11.f10943l     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x02c1
            r6.put(r1, r11)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
        L_0x02c1:
            r48 = r6
            r21 = r9
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0504
        L_0x02c9:
            r36 = r2
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r5, r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r2 = "id"
            if (r1 == 0) goto L_0x04da
            java.lang.String r38 = androidx.media3.common.p136b.C2613al.m7002a(r5, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r38 != 0) goto L_0x02e2
            r48 = r6
            r21 = r9
        L_0x02dd:
            r1 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x04d2
        L_0x02e2:
            java.lang.String r1 = "origin"
            java.lang.String r1 = androidx.media3.common.p136b.C2613al.m7002a(r5, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x04c6
            java.util.regex.Pattern r2 = f10900g     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.regex.Matcher r10 = r2.matcher(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.regex.Pattern r11 = f10904k     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r48 = r6
            java.util.regex.Matcher r6 = r11.matcher(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r18 = r10.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r20 = 1120403456(0x42c80000, float:100.0)
            if (r18 == 0) goto L_0x032b
            r21 = r9
            r9 = 1
            java.lang.String r6 = r10.group(r9)     // Catch:{ NumberFormatException -> 0x0321 }
            r6.getClass()
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x0321 }
            float r6 = r6 / r20
            r9 = 2
            java.lang.String r10 = r10.group(r9)     // Catch:{ NumberFormatException -> 0x0321 }
            r10.getClass()
            float r9 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x0321 }
            float r9 = r9 / r20
            r39 = r6
            goto L_0x0364
        L_0x0321:
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x02dd
        L_0x032b:
            r21 = r9
            boolean r9 = r6.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r9 == 0) goto L_0x04ba
            if (r3 != 0) goto L_0x033f
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x02dd
        L_0x033f:
            r9 = 1
            java.lang.String r10 = r6.group(r9)     // Catch:{ NumberFormatException -> 0x04ae }
            r10.getClass()
            int r9 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x04ae }
            r10 = 2
            java.lang.String r6 = r6.group(r10)     // Catch:{ NumberFormatException -> 0x04ae }
            r6.getClass()
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x04ae }
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x04ae }
            int r10 = r3.f10897a     // Catch:{ NumberFormatException -> 0x04ae }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x04ae }
            float r9 = r9 / r10
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x04ae }
            int r10 = r3.f10898b     // Catch:{ NumberFormatException -> 0x04ae }
            float r10 = (float) r10
            float r6 = r6 / r10
            r39 = r9
            r9 = r6
        L_0x0364:
            java.lang.String r6 = "extent"
            java.lang.String r6 = androidx.media3.common.p136b.C2613al.m7002a(r5, r6)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r6 == 0) goto L_0x04a6
            java.util.regex.Matcher r2 = r2.matcher(r6)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.util.regex.Matcher r6 = r11.matcher(r6)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r10 = r2.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r10 == 0) goto L_0x03a6
            r10 = 1
            java.lang.String r6 = r2.group(r10)     // Catch:{ NumberFormatException -> 0x039b }
            r6.getClass()
            float r6 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x039b }
            float r6 = r6 / r20
            r10 = 2
            java.lang.String r2 = r2.group(r10)     // Catch:{ NumberFormatException -> 0x039b }
            r2.getClass()
            float r1 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x039b }
            float r1 = r1 / r20
            r44 = r1
            r43 = r6
            goto L_0x03df
        L_0x039b:
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x02dd
        L_0x03a6:
            boolean r2 = r6.matches()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r2 == 0) goto L_0x049a
            if (r3 != 0) goto L_0x03b9
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x02dd
        L_0x03b9:
            r2 = 1
            java.lang.String r10 = r6.group(r2)     // Catch:{ NumberFormatException -> 0x048e }
            r10.getClass()
            int r2 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x048e }
            r10 = 2
            java.lang.String r6 = r6.group(r10)     // Catch:{ NumberFormatException -> 0x048e }
            r6.getClass()
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x048e }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x048e }
            int r10 = r3.f10897a     // Catch:{ NumberFormatException -> 0x048e }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x048e }
            float r2 = r2 / r10
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x048e }
            int r1 = r3.f10898b     // Catch:{ NumberFormatException -> 0x048e }
            float r1 = (float) r1
            float r6 = r6 / r1
            r43 = r2
            r44 = r6
        L_0x03df:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = androidx.media3.common.p136b.C2613al.m7002a(r5, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x0426
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r6 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r2 == r6) goto L_0x0404
            r6 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r6) goto L_0x03fa
            goto L_0x040e
        L_0x03fa:
            java.lang.String r2 = "after"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x040e
            r1 = 1
            goto L_0x040f
        L_0x0404:
            java.lang.String r2 = "center"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x040e
            r1 = 0
            goto L_0x040f
        L_0x040e:
            r1 = -1
        L_0x040f:
            if (r1 == 0) goto L_0x041c
            r2 = 1
            if (r1 == r2) goto L_0x0415
            goto L_0x0426
        L_0x0415:
            float r9 = r9 + r44
            r40 = r9
            r42 = 2
            goto L_0x042a
        L_0x041c:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r44 / r1
            float r9 = r9 + r1
            r40 = r9
            r42 = 1
            goto L_0x042a
        L_0x0426:
            r40 = r9
            r42 = 0
        L_0x042a:
            int r1 = r14.f10893a     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r6 = 1065353216(0x3f800000, float:1.0)
            float r46 = r6 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r1 = androidx.media3.common.p136b.C2613al.m7002a(r5, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x047e
            java.lang.String r1 = com.google.common.base.C58890d.m90988c(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r2 = r1.hashCode()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r9 = 3694(0xe6e, float:5.176E-42)
            if (r2 == r9) goto L_0x0464
            r9 = 3553396(0x363874, float:4.979368E-39)
            if (r2 == r9) goto L_0x045a
            r9 = 3553576(0x363928, float:4.97962E-39)
            if (r2 == r9) goto L_0x0450
            goto L_0x046e
        L_0x0450:
            java.lang.String r2 = "tbrl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x046e
            r1 = 2
            goto L_0x046f
        L_0x045a:
            java.lang.String r2 = "tblr"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x046e
            r1 = 1
            goto L_0x046f
        L_0x0464:
            java.lang.String r2 = "tb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x046e
            r1 = 0
            goto L_0x046f
        L_0x046e:
            r1 = -1
        L_0x046f:
            if (r1 == 0) goto L_0x047b
            r2 = 1
            if (r1 == r2) goto L_0x047b
            r2 = 2
            if (r1 == r2) goto L_0x0478
            goto L_0x047e
        L_0x0478:
            r47 = 1
            goto L_0x0482
        L_0x047b:
            r47 = 2
            goto L_0x0482
        L_0x047e:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r47 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0482:
            androidx.media3.extractor.j.f.h r1 = new androidx.media3.extractor.j.f.h     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r41 = 0
            r45 = 1
            r37 = r1
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d2
        L_0x048e:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with malformed extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d1
        L_0x049a:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d1
        L_0x04a6:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "Ignoring region without an extent"
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d1
        L_0x04ae:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d1
        L_0x04ba:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with unsupported origin: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x04d1
        L_0x04c6:
            r48 = r6
            r21 = r9
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "Ignoring region without an origin"
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
        L_0x04d1:
            r1 = 0
        L_0x04d2:
            if (r1 == 0) goto L_0x0504
            java.lang.String r2 = r1.f10922a     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r7.put(r2, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x0504
        L_0x04da:
            r48 = r6
            r21 = r9
            r6 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r5, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x0504
        L_0x04e6:
            r5.next()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r1 = "image"
            boolean r1 = androidx.media3.common.p136b.C2613al.m7007f(r5, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x04fe
            java.lang.String r1 = androidx.media3.common.p136b.C2613al.m7002a(r5, r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x04fe
            java.lang.String r9 = r5.nextText()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r8.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
        L_0x04fe:
            boolean r1 = androidx.media3.common.p136b.C2613al.m7005d(r5, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x04e6
        L_0x0504:
            boolean r1 = androidx.media3.common.p136b.C2613al.m7005d(r5, r12)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x0512
            r52 = r3
            r2 = r34
            r6 = r36
            goto L_0x0679
        L_0x0512:
            r9 = r21
            r2 = r36
            r6 = r48
            goto L_0x0284
        L_0x051a:
            r36 = r2
            r48 = r6
            r21 = r9
            int r1 = r5.getAttributeCount()     // Catch:{ e -> 0x068a }
            r2 = 0
            androidx.media3.extractor.j.f.j r26 = m10118p(r5, r2)     // Catch:{ e -> 0x068a }
            r27 = r2
            r29 = r27
            r28 = r31
            r4 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r37 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x053f:
            if (r4 >= r1) goto L_0x0604
            java.lang.String r6 = r5.getAttributeName(r4)     // Catch:{ e -> 0x05fa }
            java.lang.String r12 = r5.getAttributeValue(r4)     // Catch:{ e -> 0x05fa }
            int r30 = r6.hashCode()     // Catch:{ e -> 0x05fa }
            r2 = 5
            switch(r30) {
                case -934795532: goto L_0x058e;
                case 99841: goto L_0x0582;
                case 100571: goto L_0x0576;
                case 93616297: goto L_0x056a;
                case 109780401: goto L_0x0560;
                case 1292595405: goto L_0x0554;
                default: goto L_0x0551;
            }
        L_0x0551:
            r9 = r21
            goto L_0x0598
        L_0x0554:
            java.lang.String r9 = "backgroundImage"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0551
            r9 = r21
            r6 = 5
            goto L_0x0599
        L_0x0560:
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L_0x0551
            r9 = r21
            r6 = 3
            goto L_0x0599
        L_0x056a:
            java.lang.String r9 = "begin"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0551
            r9 = r21
            r6 = 0
            goto L_0x0599
        L_0x0576:
            java.lang.String r9 = "end"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0551
            r9 = r21
            r6 = 1
            goto L_0x0599
        L_0x0582:
            java.lang.String r9 = "dur"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0551
            r9 = r21
            r6 = 2
            goto L_0x0599
        L_0x058e:
            r9 = r21
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0598
            r6 = 4
            goto L_0x0599
        L_0x0598:
            r6 = -1
        L_0x0599:
            if (r6 == 0) goto L_0x05ea
            r10 = 1
            if (r6 == r10) goto L_0x05e2
            r10 = 2
            if (r6 == r10) goto L_0x05da
            r10 = 3
            if (r6 == r10) goto L_0x05c3
            r10 = 4
            if (r6 == r10) goto L_0x05b9
            if (r6 == r2) goto L_0x05ab
        L_0x05a9:
            r2 = 1
            goto L_0x05cd
        L_0x05ab:
            java.lang.String r2 = "#"
            boolean r2 = r12.startsWith(r2)     // Catch:{ e -> 0x05d0 }
            if (r2 == 0) goto L_0x05a9
            r2 = 1
            java.lang.String r29 = r12.substring(r2)     // Catch:{ e -> 0x05d0 }
            goto L_0x05cd
        L_0x05b9:
            r2 = 1
            boolean r6 = r7.containsKey(r12)     // Catch:{ e -> 0x05d0 }
            if (r6 == 0) goto L_0x05cd
            r28 = r12
            goto L_0x05cd
        L_0x05c3:
            r2 = 1
            java.lang.String[] r6 = m10119q(r12)     // Catch:{ e -> 0x05d0 }
            int r10 = r6.length     // Catch:{ e -> 0x05d0 }
            if (r10 <= 0) goto L_0x05cd
            r27 = r6
        L_0x05cd:
            r6 = r36
            goto L_0x05f1
        L_0x05d0:
            r0 = move-exception
            r1 = r0
            r52 = r3
            r2 = r34
            r6 = r36
            goto L_0x0692
        L_0x05da:
            r6 = r36
            r2 = 1
            long r37 = m10115m(r12, r6)     // Catch:{ e -> 0x0633 }
            goto L_0x05f1
        L_0x05e2:
            r6 = r36
            r2 = 1
            long r24 = m10115m(r12, r6)     // Catch:{ e -> 0x0633 }
            goto L_0x05f1
        L_0x05ea:
            r6 = r36
            r2 = 1
            long r22 = m10115m(r12, r6)     // Catch:{ e -> 0x0633 }
        L_0x05f1:
            int r4 = r4 + 1
            r36 = r6
            r21 = r9
            r2 = 0
            goto L_0x053f
        L_0x05fa:
            r0 = move-exception
            r6 = r36
        L_0x05fd:
            r1 = r0
            r52 = r3
        L_0x0600:
            r2 = r34
            goto L_0x0692
        L_0x0604:
            r6 = r36
            r2 = 1
            if (r11 == 0) goto L_0x0635
            long r9 = r11.f10912d     // Catch:{ e -> 0x0633 }
            r39 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r9 > r39 ? 1 : (r9 == r39 ? 0 : -1))
            if (r1 == 0) goto L_0x0635
            int r1 = (r22 > r39 ? 1 : (r22 == r39 ? 0 : -1))
            if (r1 == 0) goto L_0x061b
            long r17 = r22 + r9
            goto L_0x061d
        L_0x061b:
            r17 = r39
        L_0x061d:
            int r1 = (r24 > r39 ? 1 : (r24 == r39 ? 0 : -1))
            if (r1 == 0) goto L_0x0626
            long r24 = r24 + r9
            r22 = r17
            goto L_0x0635
        L_0x0626:
            r22 = r17
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x063a
        L_0x0633:
            r0 = move-exception
            goto L_0x05fd
        L_0x0635:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x063a:
            int r1 = (r24 > r9 ? 1 : (r24 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x065e
            int r1 = (r37 > r9 ? 1 : (r37 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0649
            long r37 = r22 + r37
            r52 = r3
            r24 = r37
            goto L_0x0660
        L_0x0649:
            if (r11 == 0) goto L_0x0659
            r52 = r3
            long r2 = r11.f10913e     // Catch:{ e -> 0x0656 }
            int r1 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x065b
            r24 = r2
            goto L_0x0660
        L_0x0656:
            r0 = move-exception
            r1 = r0
            goto L_0x0600
        L_0x0659:
            r52 = r3
        L_0x065b:
            r24 = r9
            goto L_0x0660
        L_0x065e:
            r52 = r3
        L_0x0660:
            java.lang.String r20 = r5.getName()     // Catch:{ e -> 0x0686 }
            androidx.media3.extractor.j.f.g r1 = new androidx.media3.extractor.j.f.g     // Catch:{ e -> 0x0686 }
            r21 = 0
            r19 = r1
            r30 = r11
            r19.<init>(r20, r21, r22, r24, r26, r27, r28, r29, r30)     // Catch:{ e -> 0x0686 }
            r2 = r34
            r2.push(r1)     // Catch:{ e -> 0x0684 }
            if (r11 == 0) goto L_0x0679
            r11.mo7437c(r1)     // Catch:{ e -> 0x0684 }
        L_0x0679:
            r17 = r52
            r13 = r6
            r15 = r32
            r9 = r33
            r3 = r48
            goto L_0x073f
        L_0x0684:
            r0 = move-exception
            goto L_0x0691
        L_0x0686:
            r0 = move-exception
            r2 = r34
            goto L_0x0691
        L_0x068a:
            r0 = move-exception
            r52 = r3
            r2 = r34
            r6 = r36
        L_0x0691:
            r1 = r0
        L_0x0692:
            java.lang.String r3 = "Suppressing parser error"
            java.lang.String r1 = androidx.media3.common.p136b.C2633u.m7046a(r3, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.common.p136b.C2633u.m7050e(r13, r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r17 = r52
            r13 = r6
            r15 = r32
            r9 = r33
            r3 = r48
        L_0x06a4:
            r16 = 1
            goto L_0x073f
        L_0x06a8:
            r33 = r2
            r35 = r3
            r48 = r6
            r2 = r9
            r32 = r15
            r3 = 4
            if (r12 != r3) goto L_0x06f4
            r11.getClass()
            java.lang.String r1 = r5.getText()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.g r3 = new androidx.media3.extractor.j.f.g     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r37 = 0
            java.lang.String r6 = "\r\n"
            r9 = r33
            java.lang.String r1 = r1.replaceAll(r6, r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r6 = " *\n *"
            java.lang.String r1 = r1.replaceAll(r6, r9)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r1 = r1.replaceAll(r9, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r6 = "[ \t\\x0B\f\r]+"
            java.lang.String r38 = r1.replaceAll(r6, r4)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r39 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r43 = 0
            r44 = 0
            java.lang.String r45 = ""
            r46 = 0
            r47 = 0
            r36 = r3
            r36.<init>(r37, r38, r39, r41, r43, r44, r45, r46, r47)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r11.mo7437c(r3)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x071e
        L_0x06f4:
            r9 = r33
            r3 = 3
            if (r12 != r3) goto L_0x071e
            java.lang.String r3 = r5.getName()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            boolean r1 = r3.equals(r1)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            if (r1 == 0) goto L_0x0714
            androidx.media3.extractor.j.f.k r15 = new androidx.media3.extractor.j.f.k     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.Object r1 = r2.peek()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            androidx.media3.extractor.j.f.g r1 = (androidx.media3.extractor.p163j.p169f.C3503g) r1     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r1.getClass()
            r3 = r48
            r15.<init>(r1, r3, r7, r8)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            goto L_0x0718
        L_0x0714:
            r3 = r48
            r15 = r32
        L_0x0718:
            r2.pop()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r13 = r21
            goto L_0x073f
        L_0x071e:
            r3 = r48
            goto L_0x0734
        L_0x0721:
            r31 = r1
            r35 = r3
            r3 = r6
            r21 = r13
            r32 = r15
            r1 = 2
            r49 = r9
            r9 = r2
            r2 = r49
            if (r12 != r1) goto L_0x0739
            int r16 = r16 + 1
        L_0x0734:
            r13 = r21
            r15 = r32
            goto L_0x073f
        L_0x0739:
            r1 = 3
            if (r12 != r1) goto L_0x0734
            int r16 = r16 + -1
            goto L_0x0734
        L_0x073f:
            r5.next()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            int r12 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            r4 = r50
            r6 = r3
            r1 = r31
            r3 = r35
            r10 = 0
            r49 = r9
            r9 = r2
            r2 = r49
            goto L_0x006d
        L_0x0755:
            r32 = r15
            if (r32 == 0) goto L_0x075a
            return r32
        L_0x075a:
            androidx.media3.extractor.j.e r1 = new androidx.media3.extractor.j.e     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            java.lang.String r2 = "No TTML subtitles found"
            r1.<init>((java.lang.String) r2)     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
            throw r1     // Catch:{ XmlPullParserException -> 0x076c, IOException -> 0x0762 }
        L_0x0762:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r1)
            throw r2
        L_0x076c:
            r0 = move-exception
            r1 = r0
            androidx.media3.extractor.j.e r2 = new androidx.media3.extractor.j.e
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r1)
            goto L_0x0777
        L_0x0776:
            throw r2
        L_0x0777:
            goto L_0x0776
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p169f.C3502f.mo7433l(byte[], int, boolean):androidx.media3.extractor.j.c");
    }
}
