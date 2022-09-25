package androidx.media3.extractor.p163j.p167d;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.p163j.C3470b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.d.a */
/* compiled from: PG */
public final class C3487a extends C3470b {

    /* renamed from: f */
    private static final Pattern f10843f = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: g */
    private final boolean f10844g;

    /* renamed from: h */
    private final C3488b f10845h;

    /* renamed from: i */
    private Map f10846i;

    /* renamed from: j */
    private float f10847j;

    /* renamed from: k */
    private float f10848k;

    public C3487a() {
        this((List) null);
    }

    /* renamed from: m */
    private static float m10094m(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* renamed from: n */
    private static int m10095n(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((Long) list.get(size)).longValue() != j) {
                    if (((Long) list.get(size)).longValue() < j) {
                        i = size + 1;
                        break;
                    }
                } else {
                    return size;
                }
            } else {
                i = 0;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* renamed from: o */
    private static long m10096o(String str) {
        Matcher matcher = f10843f.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i = C2612ak.f7249a;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x024c A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x024f A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0261 A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0264 A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0276 A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0279 A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028b A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x028e A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0294 A[Catch:{ RuntimeException -> 0x02c2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x02df  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10097p(androidx.media3.common.p136b.C2604ac r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            java.lang.String r3 = "'"
        L_0x0006:
            java.lang.String r0 = r29.mo6149q()
            if (r0 == 0) goto L_0x0305
            java.lang.String r4 = "[Script Info]"
            boolean r4 = r4.equalsIgnoreCase(r0)
            r5 = 91
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = -1
            if (r4 == 0) goto L_0x007e
        L_0x001a:
            java.lang.String r0 = r29.mo6149q()
            if (r0 == 0) goto L_0x0006
            int r4 = r2.f7236c
            int r10 = r2.f7235b
            int r4 = r4 - r10
            if (r4 == 0) goto L_0x002d
            int r4 = r29.mo6133a()
            if (r4 == r5) goto L_0x0006
        L_0x002d:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 != r6) goto L_0x001a
            r4 = r0[r8]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = com.google.common.base.C58890d.m90988c(r4)
            int r10 = r4.hashCode()
            switch(r10) {
                case 1879649548: goto L_0x0052;
                case 1879649549: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x005c
        L_0x0048:
            java.lang.String r10 = "playresy"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x005c
            r4 = 1
            goto L_0x005d
        L_0x0052:
            java.lang.String r10 = "playresx"
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x005c
            r4 = 0
            goto L_0x005d
        L_0x005c:
            r4 = -1
        L_0x005d:
            if (r4 == 0) goto L_0x0071
            if (r4 == r7) goto L_0x0062
            goto L_0x001a
        L_0x0062:
            r0 = r0[r7]     // Catch:{ NumberFormatException -> 0x006f }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x006f }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x006f }
            r1.f10848k = r0     // Catch:{ NumberFormatException -> 0x006f }
            goto L_0x001a
        L_0x006f:
            goto L_0x001a
        L_0x0071:
            r0 = r0[r7]     // Catch:{ NumberFormatException -> 0x006f }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x006f }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x006f }
            r1.f10847j = r0     // Catch:{ NumberFormatException -> 0x006f }
            goto L_0x001a
        L_0x007e:
            java.lang.String r4 = "[V4+ Styles]"
            boolean r4 = r4.equalsIgnoreCase(r0)
            java.lang.String r10 = "SsaDecoder"
            if (r4 == 0) goto L_0x02ee
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        L_0x008d:
            r12 = 0
        L_0x008e:
            java.lang.String r13 = r29.mo6149q()
            if (r13 == 0) goto L_0x02ea
            int r0 = r2.f7236c
            int r14 = r2.f7235b
            int r0 = r0 - r14
            if (r0 == 0) goto L_0x00a1
            int r0 = r29.mo6133a()
            if (r0 == r5) goto L_0x02ea
        L_0x00a1:
            java.lang.String r0 = "Format:"
            boolean r0 = r13.startsWith(r0)
            r14 = 6
            java.lang.String r15 = ","
            r5 = 3
            if (r0 == 0) goto L_0x0180
            r0 = 7
            java.lang.String r12 = r13.substring(r0)
            java.lang.String[] r12 = android.text.TextUtils.split(r12, r15)
            r13 = 0
            r15 = -1
            r18 = -1
            r19 = -1
            r20 = -1
            r21 = -1
            r22 = -1
            r23 = -1
            r24 = -1
            r25 = -1
            r26 = -1
        L_0x00ca:
            int r0 = r12.length
            if (r13 >= r0) goto L_0x016b
            r0 = r12[r13]
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = com.google.common.base.C58890d.m90988c(r0)
            int r17 = r0.hashCode()
            switch(r17) {
                case -1178781136: goto L_0x013c;
                case -1026963764: goto L_0x0132;
                case -192095652: goto L_0x0127;
                case -70925746: goto L_0x011d;
                case 3029637: goto L_0x0113;
                case 3373707: goto L_0x0109;
                case 366554320: goto L_0x00ff;
                case 767321349: goto L_0x00f4;
                case 1767875043: goto L_0x00ea;
                case 1988365454: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x0146
        L_0x00e0:
            java.lang.String r11 = "outlinecolour"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 3
            goto L_0x0147
        L_0x00ea:
            java.lang.String r11 = "alignment"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 1
            goto L_0x0147
        L_0x00f4:
            java.lang.String r11 = "borderstyle"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 9
            goto L_0x0147
        L_0x00ff:
            java.lang.String r11 = "fontsize"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 4
            goto L_0x0147
        L_0x0109:
            java.lang.String r11 = "name"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 0
            goto L_0x0147
        L_0x0113:
            java.lang.String r11 = "bold"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 5
            goto L_0x0147
        L_0x011d:
            java.lang.String r11 = "primarycolour"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 2
            goto L_0x0147
        L_0x0127:
            java.lang.String r11 = "strikeout"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 8
            goto L_0x0147
        L_0x0132:
            java.lang.String r11 = "underline"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 7
            goto L_0x0147
        L_0x013c:
            java.lang.String r11 = "italic"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0146
            r0 = 6
            goto L_0x0147
        L_0x0146:
            r0 = -1
        L_0x0147:
            switch(r0) {
                case 0: goto L_0x0166;
                case 1: goto L_0x0163;
                case 2: goto L_0x0160;
                case 3: goto L_0x015d;
                case 4: goto L_0x015a;
                case 5: goto L_0x0157;
                case 6: goto L_0x0154;
                case 7: goto L_0x0151;
                case 8: goto L_0x014e;
                case 9: goto L_0x014b;
                default: goto L_0x014a;
            }
        L_0x014a:
            goto L_0x0167
        L_0x014b:
            r26 = r13
            goto L_0x0167
        L_0x014e:
            r25 = r13
            goto L_0x0167
        L_0x0151:
            r24 = r13
            goto L_0x0167
        L_0x0154:
            r23 = r13
            goto L_0x0167
        L_0x0157:
            r22 = r13
            goto L_0x0167
        L_0x015a:
            r21 = r13
            goto L_0x0167
        L_0x015d:
            r20 = r13
            goto L_0x0167
        L_0x0160:
            r19 = r13
            goto L_0x0167
        L_0x0163:
            r18 = r13
            goto L_0x0167
        L_0x0166:
            r15 = r13
        L_0x0167:
            int r13 = r13 + 1
            goto L_0x00ca
        L_0x016b:
            if (r15 == r9) goto L_0x017c
            androidx.media3.extractor.j.d.c r12 = new androidx.media3.extractor.j.d.c
            r16 = r12
            r17 = r15
            r27 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = 91
            goto L_0x008e
        L_0x017c:
            r5 = 91
            goto L_0x008d
        L_0x0180:
            java.lang.String r0 = "Style:"
            boolean r11 = r13.startsWith(r0)
            if (r11 == 0) goto L_0x02e4
            if (r12 != 0) goto L_0x0195
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r0 = r0.concat(r13)
            androidx.media3.common.p136b.C2633u.m7050e(r10, r0)
            goto L_0x02e4
        L_0x0195:
            boolean r0 = r13.startsWith(r0)
            androidx.media3.common.p136b.C2601a.m6830b(r0)
            java.lang.String r0 = r13.substring(r14)
            java.lang.String[] r11 = android.text.TextUtils.split(r0, r15)
            int r0 = r11.length
            int r14 = r12.f10864k
            java.lang.String r15 = "SsaStyle"
            if (r0 == r14) goto L_0x01c7
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r14)
            r5[r8] = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5[r7] = r0
            r5[r6] = r13
            java.lang.String r0 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.lang.String r0 = androidx.media3.common.p136b.C2612ak.m6928K(r0, r5)
            androidx.media3.common.p136b.C2633u.m7050e(r15, r0)
        L_0x01c4:
            r14 = 0
            goto L_0x02dd
        L_0x01c7:
            androidx.media3.extractor.j.d.e r14 = new androidx.media3.extractor.j.d.e     // Catch:{ RuntimeException -> 0x02c2 }
            int r0 = r12.f10854a     // Catch:{ RuntimeException -> 0x02c2 }
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r17 = r0.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            int r0 = r12.f10855b     // Catch:{ RuntimeException -> 0x02c2 }
            if (r0 == r9) goto L_0x01e2
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            int r0 = androidx.media3.extractor.p163j.p167d.C3491e.m10100a(r0)     // Catch:{ RuntimeException -> 0x02c2 }
            r18 = r0
            goto L_0x01e4
        L_0x01e2:
            r18 = -1
        L_0x01e4:
            int r0 = r12.f10856c     // Catch:{ RuntimeException -> 0x02c2 }
            if (r0 == r9) goto L_0x01f5
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.Integer r0 = androidx.media3.extractor.p163j.p167d.C3491e.m10101b(r0)     // Catch:{ RuntimeException -> 0x02c2 }
            r19 = r0
            goto L_0x01f7
        L_0x01f5:
            r19 = 0
        L_0x01f7:
            int r0 = r12.f10857d     // Catch:{ RuntimeException -> 0x02c2 }
            if (r0 == r9) goto L_0x0208
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r0 = r0.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.Integer r0 = androidx.media3.extractor.p163j.p167d.C3491e.m10101b(r0)     // Catch:{ RuntimeException -> 0x02c2 }
            r20 = r0
            goto L_0x020a
        L_0x0208:
            r20 = 0
        L_0x020a:
            int r0 = r12.f10858e     // Catch:{ RuntimeException -> 0x02c2 }
            r16 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r0 == r9) goto L_0x0239
            r0 = r11[r0]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r6 = r0.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            float r0 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x021c }
            goto L_0x023c
        L_0x021c:
            r0 = move-exception
            r8 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x02c2 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = "Failed to parse font size: '"
            r0.append(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            r0.append(r6)     // Catch:{ RuntimeException -> 0x02c2 }
            r0.append(r3)     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r0, r8)     // Catch:{ RuntimeException -> 0x02c2 }
            androidx.media3.common.p136b.C2633u.m7050e(r15, r0)     // Catch:{ RuntimeException -> 0x02c2 }
        L_0x0239:
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x023c:
            int r5 = r12.f10859f     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == r9) goto L_0x024f
            r5 = r11[r5]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r5.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            boolean r5 = androidx.media3.extractor.p163j.p167d.C3491e.m10102c(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == 0) goto L_0x024f
            r22 = 1
            goto L_0x0251
        L_0x024f:
            r22 = 0
        L_0x0251:
            int r5 = r12.f10860g     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == r9) goto L_0x0264
            r5 = r11[r5]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r5.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            boolean r5 = androidx.media3.extractor.p163j.p167d.C3491e.m10102c(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == 0) goto L_0x0264
            r23 = 1
            goto L_0x0266
        L_0x0264:
            r23 = 0
        L_0x0266:
            int r5 = r12.f10861h     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == r9) goto L_0x0279
            r5 = r11[r5]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r5.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            boolean r5 = androidx.media3.extractor.p163j.p167d.C3491e.m10102c(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == 0) goto L_0x0279
            r24 = 1
            goto L_0x027b
        L_0x0279:
            r24 = 0
        L_0x027b:
            int r5 = r12.f10862i     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == r9) goto L_0x028e
            r5 = r11[r5]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r5.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            boolean r5 = androidx.media3.extractor.p163j.p167d.C3491e.m10102c(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == 0) goto L_0x028e
            r25 = 1
            goto L_0x0290
        L_0x028e:
            r25 = 0
        L_0x0290:
            int r5 = r12.f10863j     // Catch:{ RuntimeException -> 0x02c2 }
            if (r5 == r9) goto L_0x02b8
            r5 = r11[r5]     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r5.trim()     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r6 = r5.trim()     // Catch:{ NumberFormatException -> 0x02ab }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x02ab }
            if (r6 == r7) goto L_0x02a8
            r8 = 3
            if (r6 == r8) goto L_0x02a8
            goto L_0x02ab
        L_0x02a8:
            r26 = r6
            goto L_0x02ba
        L_0x02ab:
            java.lang.String r6 = "Ignoring unknown BorderStyle: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            java.lang.String r5 = r6.concat(r5)     // Catch:{ RuntimeException -> 0x02c2 }
            androidx.media3.common.p136b.C2633u.m7050e(r15, r5)     // Catch:{ RuntimeException -> 0x02c2 }
        L_0x02b8:
            r26 = -1
        L_0x02ba:
            r16 = r14
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ RuntimeException -> 0x02c2 }
            goto L_0x02dd
        L_0x02c2:
            r0 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Skipping malformed 'Style:' line: '"
            r5.<init>(r6)
            r5.append(r13)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = androidx.media3.common.p136b.C2633u.m7046a(r5, r0)
            androidx.media3.common.p136b.C2633u.m7050e(r15, r0)
            goto L_0x01c4
        L_0x02dd:
            if (r14 == 0) goto L_0x02e4
            java.lang.String r0 = r14.f10869a
            r4.put(r0, r14)
        L_0x02e4:
            r5 = 91
            r6 = 2
            r8 = 0
            goto L_0x008e
        L_0x02ea:
            r1.f10846i = r4
            goto L_0x0006
        L_0x02ee:
            java.lang.String r4 = "[V4 Styles]"
            boolean r4 = r4.equalsIgnoreCase(r0)
            if (r4 == 0) goto L_0x02fd
            java.lang.String r0 = "[V4 Styles] are not supported"
            androidx.media3.common.p136b.C2633u.m7049d(r10, r0)
            goto L_0x0006
        L_0x02fd:
            java.lang.String r4 = "[Events]"
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0006
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p167d.C3487a.m10097p(androidx.media3.common.b.ac):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:35|36|37|38|39|40|(2:(4:43|44|45|46)(1:47)|48)(2:49|(1:51)(8:59|(1:61)|66|67|(4:69|70|71|72)(1:73)|74|(2:76|160)(1:159)|78))|52|53|54|55|56|57|58|66|67|(0)(0)|74|(0)(0)|78|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x028b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x028c, code lost:
        r3.f7067c = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0290, code lost:
        switch(r11) {
            case -1: goto L_0x02a9;
            case 0: goto L_0x0293;
            case 1: goto L_0x02a7;
            case 2: goto L_0x02a5;
            case 3: goto L_0x02a3;
            case 4: goto L_0x02a7;
            case 5: goto L_0x02a5;
            case 6: goto L_0x02a3;
            case 7: goto L_0x02a7;
            case 8: goto L_0x02a5;
            case 9: goto L_0x02a3;
            default: goto L_0x0293;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0293, code lost:
        androidx.media3.common.p136b.C2633u.m7050e("SsaDecoder", "Unknown alignment: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02a3, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02a5, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a7, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a9, code lost:
        r6 = android.support.p033v7.widget.LinearLayoutManager.INVALID_OFFSET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ab, code lost:
        r3.f7073i = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02ad, code lost:
        switch(r11) {
            case -1: goto L_0x02c6;
            case 0: goto L_0x02b0;
            case 1: goto L_0x02c4;
            case 2: goto L_0x02c4;
            case 3: goto L_0x02c4;
            case 4: goto L_0x02c2;
            case 5: goto L_0x02c2;
            case 6: goto L_0x02c2;
            case 7: goto L_0x02c0;
            case 8: goto L_0x02c0;
            case 9: goto L_0x02c0;
            default: goto L_0x02b0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02b0, code lost:
        androidx.media3.common.p136b.C2633u.m7050e("SsaDecoder", "Unknown alignment: " + r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c0, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c2, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c4, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c6, code lost:
        r11 = android.support.p033v7.widget.LinearLayoutManager.INVALID_OFFSET;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c8, code lost:
        r3.f7071g = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02ca, code lost:
        if (r5 == null) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02d1, code lost:
        if (r7 == -3.4028235E38f) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d5, code lost:
        if (r4 == -3.4028235E38f) goto L_0x02e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d7, code lost:
        r3.f7072h = r5.x / r4;
        r3.f7069e = r5.y / r7;
        r3.f7070f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02e5, code lost:
        r3.f7072h = m10094m(r3.f7073i);
        r3.f7069e = m10094m(r11);
        r3.f7070f = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02f6, code lost:
        r0 = r3.mo6076a();
        r3 = m10095n(r9, r2, r1);
        r4 = m10095n(r20, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0304, code lost:
        if (r3 >= r4) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0306, code lost:
        ((java.util.List) r1.get(r3)).add(r0);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0171 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015d A[Catch:{ RuntimeException -> 0x0170 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016e  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.p163j.C3482c mo7433l(byte[] r23, int r24, boolean r25) {
        /*
            r22 = this;
            r0 = r22
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.media3.common.b.ac r3 = new androidx.media3.common.b.ac
            r4 = r23
            r5 = r24
            r3.<init>(r4, r5)
            boolean r4 = r0.f10844g
            if (r4 != 0) goto L_0x001c
            r0.m10097p(r3)
        L_0x001c:
            boolean r4 = r0.f10844g
            if (r4 == 0) goto L_0x0023
            androidx.media3.extractor.j.d.b r4 = r0.f10845h
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            java.lang.String r6 = r3.mo6149q()
            if (r6 == 0) goto L_0x031e
            java.lang.String r7 = "Format:"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L_0x0037
            androidx.media3.extractor.j.d.b r4 = androidx.media3.extractor.p163j.p167d.C3488b.m10099a(r6)
            goto L_0x0024
        L_0x0037:
            java.lang.String r7 = "Dialogue:"
            boolean r8 = r6.startsWith(r7)
            if (r8 == 0) goto L_0x0312
            java.lang.String r8 = "SsaDecoder"
            if (r4 != 0) goto L_0x004e
            java.lang.String r7 = "Skipping dialogue line before complete format: "
            java.lang.String r6 = r7.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x0312
        L_0x004e:
            boolean r7 = r6.startsWith(r7)
            androidx.media3.common.p136b.C2601a.m6830b(r7)
            r7 = 9
            java.lang.String r7 = r6.substring(r7)
            java.lang.String r9 = ","
            int r10 = r4.f10853e
            java.lang.String[] r7 = r7.split(r9, r10)
            int r9 = r7.length
            int r10 = r4.f10853e
            if (r9 == r10) goto L_0x0073
            java.lang.String r7 = "Skipping dialogue line with fewer columns than format: "
            java.lang.String r6 = r7.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x0312
        L_0x0073:
            int r9 = r4.f10849a
            r9 = r7[r9]
            long r9 = m10096o(r9)
            java.lang.String r11 = "Skipping invalid timing: "
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x008f
            java.lang.String r6 = r11.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x0312
        L_0x008f:
            int r14 = r4.f10850b
            r14 = r7[r14]
            long r14 = m10096o(r14)
            int r16 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r16 != 0) goto L_0x00a4
            java.lang.String r6 = r11.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x0312
        L_0x00a4:
            java.util.Map r6 = r0.f10846i
            r11 = -1
            if (r6 == 0) goto L_0x00ba
            int r12 = r4.f10851c
            if (r12 == r11) goto L_0x00ba
            r12 = r7[r12]
            java.lang.String r12 = r12.trim()
            java.lang.Object r6 = r6.get(r12)
            androidx.media3.extractor.j.d.e r6 = (androidx.media3.extractor.p163j.p167d.C3491e) r6
            goto L_0x00bb
        L_0x00ba:
            r6 = 0
        L_0x00bb:
            int r12 = r4.f10852d
            r7 = r7[r12]
            java.util.regex.Pattern r12 = androidx.media3.extractor.p163j.p167d.C3490d.f10865a
            java.util.regex.Matcher r12 = r12.matcher(r7)
            r5 = 0
            r13 = -1
        L_0x00c7:
            boolean r16 = r12.find()
            r11 = 1
            if (r16 == 0) goto L_0x017a
            r16 = r3
            java.lang.String r3 = r12.group(r11)
            r3.getClass()
            java.util.regex.Pattern r11 = androidx.media3.extractor.p163j.p167d.C3490d.f10866b     // Catch:{ RuntimeException -> 0x014d }
            java.util.regex.Matcher r11 = r11.matcher(r3)     // Catch:{ RuntimeException -> 0x014d }
            r17 = r4
            java.util.regex.Pattern r4 = androidx.media3.extractor.p163j.p167d.C3490d.f10867c     // Catch:{ RuntimeException -> 0x014f }
            java.util.regex.Matcher r4 = r4.matcher(r3)     // Catch:{ RuntimeException -> 0x014f }
            boolean r18 = r11.find()     // Catch:{ RuntimeException -> 0x014f }
            boolean r19 = r4.find()     // Catch:{ RuntimeException -> 0x014f }
            if (r18 == 0) goto L_0x011c
            if (r19 == 0) goto L_0x010f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x014f }
            r4.<init>()     // Catch:{ RuntimeException -> 0x014f }
            r18 = r12
            java.lang.String r12 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            r4.append(r12)     // Catch:{ RuntimeException -> 0x0151 }
            r4.append(r3)     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r12 = "'"
            r4.append(r12)     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r12 = "SsaStyle.Overrides"
            java.lang.String r4 = r4.toString()     // Catch:{ RuntimeException -> 0x0151 }
            androidx.media3.common.p136b.C2633u.m7049d(r12, r4)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0111
        L_0x010f:
            r18 = r12
        L_0x0111:
            r12 = 1
            java.lang.String r4 = r11.group(r12)     // Catch:{ RuntimeException -> 0x0151 }
            r12 = 2
            java.lang.String r11 = r11.group(r12)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x012c
        L_0x011c:
            r18 = r12
            r12 = 2
            if (r19 == 0) goto L_0x0148
            r11 = 1
            java.lang.String r19 = r4.group(r11)     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r11 = r4.group(r12)     // Catch:{ RuntimeException -> 0x0151 }
            r4 = r19
        L_0x012c:
            android.graphics.PointF r12 = new android.graphics.PointF     // Catch:{ RuntimeException -> 0x0151 }
            r4.getClass()
            java.lang.String r4 = r4.trim()     // Catch:{ RuntimeException -> 0x0151 }
            float r4 = java.lang.Float.parseFloat(r4)     // Catch:{ RuntimeException -> 0x0151 }
            r11.getClass()
            java.lang.String r11 = r11.trim()     // Catch:{ RuntimeException -> 0x0151 }
            float r11 = java.lang.Float.parseFloat(r11)     // Catch:{ RuntimeException -> 0x0151 }
            r12.<init>(r4, r11)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0149
        L_0x0148:
            r12 = 0
        L_0x0149:
            if (r12 == 0) goto L_0x0151
            r5 = r12
            goto L_0x0151
        L_0x014d:
            r17 = r4
        L_0x014f:
            r18 = r12
        L_0x0151:
            java.util.regex.Pattern r4 = androidx.media3.extractor.p163j.p167d.C3490d.f10868d     // Catch:{ RuntimeException -> 0x0170 }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ RuntimeException -> 0x0170 }
            boolean r4 = r3.find()     // Catch:{ RuntimeException -> 0x0170 }
            if (r4 == 0) goto L_0x016a
            r4 = 1
            java.lang.String r3 = r3.group(r4)     // Catch:{ RuntimeException -> 0x0170 }
            r3.getClass()
            int r3 = androidx.media3.extractor.p163j.p167d.C3491e.m10100a(r3)     // Catch:{ RuntimeException -> 0x0170 }
            goto L_0x016b
        L_0x016a:
            r3 = -1
        L_0x016b:
            r4 = -1
            if (r3 == r4) goto L_0x0171
            r13 = r3
            goto L_0x0171
        L_0x0170:
        L_0x0171:
            r3 = r16
            r4 = r17
            r12 = r18
            r11 = -1
            goto L_0x00c7
        L_0x017a:
            r16 = r3
            r17 = r4
            java.util.regex.Pattern r3 = androidx.media3.extractor.p163j.p167d.C3490d.f10865a
            java.util.regex.Matcher r3 = r3.matcher(r7)
            java.lang.String r4 = ""
            java.lang.String r3 = r3.replaceAll(r4)
            java.lang.String r4 = "\\N"
            java.lang.String r7 = "\n"
            java.lang.String r3 = r3.replace(r4, r7)
            java.lang.String r4 = "\\n"
            java.lang.String r3 = r3.replace(r4, r7)
            java.lang.String r4 = "\\h"
            java.lang.String r7 = " "
            java.lang.String r3 = r3.replace(r4, r7)
            float r4 = r0.f10847j
            float r7 = r0.f10848k
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r3)
            androidx.media3.common.a.b r3 = new androidx.media3.common.a.b
            r3.<init>()
            r3.f7065a = r11
            if (r6 == 0) goto L_0x0260
            java.lang.Integer r12 = r6.f10871c
            if (r12 == 0) goto L_0x01ce
            android.text.style.ForegroundColorSpan r12 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r0 = r6.f10871c
            int r0 = r0.intValue()
            r12.<init>(r0)
            int r0 = r11.length()
            r20 = r14
            r14 = 33
            r15 = 0
            r11.setSpan(r12, r15, r0, r14)
            goto L_0x01d0
        L_0x01ce:
            r20 = r14
        L_0x01d0:
            int r0 = r6.f10878j
            r12 = 3
            if (r0 != r12) goto L_0x01ee
            java.lang.Integer r0 = r6.f10872d
            if (r0 == 0) goto L_0x01ee
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            java.lang.Integer r14 = r6.f10872d
            int r14 = r14.intValue()
            r0.<init>(r14)
            int r14 = r11.length()
            r12 = 0
            r15 = 33
            r11.setSpan(r0, r12, r14, r15)
        L_0x01ee:
            float r0 = r6.f10873e
            r12 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r14 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0201
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L_0x0201
            float r0 = r0 / r7
            r3.f7075k = r0
            r0 = 1
            r3.f7074j = r0
        L_0x0201:
            boolean r0 = r6.f10874f
            if (r0 == 0) goto L_0x022b
            boolean r0 = r6.f10875g
            if (r0 == 0) goto L_0x021a
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r12 = 3
            r0.<init>(r12)
            int r12 = r11.length()
            r14 = 33
            r15 = 0
            r11.setSpan(r0, r15, r12, r14)
            goto L_0x023f
        L_0x021a:
            r14 = 33
            r15 = 0
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r12 = 1
            r0.<init>(r12)
            int r12 = r11.length()
            r11.setSpan(r0, r15, r12, r14)
            goto L_0x023f
        L_0x022b:
            r14 = 33
            r15 = 0
            boolean r0 = r6.f10875g
            if (r0 == 0) goto L_0x023f
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r12 = 2
            r0.<init>(r12)
            int r12 = r11.length()
            r11.setSpan(r0, r15, r12, r14)
        L_0x023f:
            boolean r0 = r6.f10876h
            if (r0 == 0) goto L_0x024f
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            int r12 = r11.length()
            r11.setSpan(r0, r15, r12, r14)
        L_0x024f:
            boolean r0 = r6.f10877i
            if (r0 == 0) goto L_0x0262
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            int r12 = r11.length()
            r11.setSpan(r0, r15, r12, r14)
            goto L_0x0262
        L_0x0260:
            r20 = r14
        L_0x0262:
            r0 = -1
            if (r13 == r0) goto L_0x0267
            r11 = r13
            goto L_0x026d
        L_0x0267:
            if (r6 == 0) goto L_0x026c
            int r11 = r6.f10870b
            goto L_0x026d
        L_0x026c:
            r11 = -1
        L_0x026d:
            java.lang.String r0 = "Unknown alignment: "
            switch(r11) {
                case -1: goto L_0x028b;
                case 0: goto L_0x0272;
                case 1: goto L_0x0288;
                case 2: goto L_0x0285;
                case 3: goto L_0x0282;
                case 4: goto L_0x0288;
                case 5: goto L_0x0285;
                case 6: goto L_0x0282;
                case 7: goto L_0x0288;
                case 8: goto L_0x0285;
                case 9: goto L_0x0282;
                default: goto L_0x0272;
            }
        L_0x0272:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x028b
        L_0x0282:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x028c
        L_0x0285:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x028c
        L_0x0288:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x028c
        L_0x028b:
            r6 = 0
        L_0x028c:
            r3.f7067c = r6
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r11) {
                case -1: goto L_0x02a9;
                case 0: goto L_0x0293;
                case 1: goto L_0x02a7;
                case 2: goto L_0x02a5;
                case 3: goto L_0x02a3;
                case 4: goto L_0x02a7;
                case 5: goto L_0x02a5;
                case 6: goto L_0x02a3;
                case 7: goto L_0x02a7;
                case 8: goto L_0x02a5;
                case 9: goto L_0x02a3;
                default: goto L_0x0293;
            }
        L_0x0293:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r8, r6)
            goto L_0x02a9
        L_0x02a3:
            r6 = 2
            goto L_0x02ab
        L_0x02a5:
            r6 = 1
            goto L_0x02ab
        L_0x02a7:
            r6 = 0
            goto L_0x02ab
        L_0x02a9:
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02ab:
            r3.f7073i = r6
            switch(r11) {
                case -1: goto L_0x02c6;
                case 0: goto L_0x02b0;
                case 1: goto L_0x02c4;
                case 2: goto L_0x02c4;
                case 3: goto L_0x02c4;
                case 4: goto L_0x02c2;
                case 5: goto L_0x02c2;
                case 6: goto L_0x02c2;
                case 7: goto L_0x02c0;
                case 8: goto L_0x02c0;
                case 9: goto L_0x02c0;
                default: goto L_0x02b0;
            }
        L_0x02b0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r11)
            java.lang.String r0 = r6.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r8, r0)
            goto L_0x02c6
        L_0x02c0:
            r11 = 0
            goto L_0x02c8
        L_0x02c2:
            r11 = 1
            goto L_0x02c8
        L_0x02c4:
            r11 = 2
            goto L_0x02c8
        L_0x02c6:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02c8:
            r3.f7071g = r11
            if (r5 == 0) goto L_0x02e5
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x02e5
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x02e5
            float r0 = r5.x
            float r0 = r0 / r4
            r3.f7072h = r0
            float r0 = r5.y
            float r0 = r0 / r7
            r3.f7069e = r0
            r0 = 0
            r3.f7070f = r0
            goto L_0x02f6
        L_0x02e5:
            r0 = 0
            int r4 = r3.f7073i
            float r4 = m10094m(r4)
            r3.f7072h = r4
            float r4 = m10094m(r11)
            r3.f7069e = r4
            r3.f7070f = r0
        L_0x02f6:
            androidx.media3.common.a.c r0 = r3.mo6076a()
            int r3 = m10095n(r9, r2, r1)
            r4 = r20
            int r4 = m10095n(r4, r2, r1)
        L_0x0304:
            if (r3 >= r4) goto L_0x0316
            java.lang.Object r5 = r1.get(r3)
            java.util.List r5 = (java.util.List) r5
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x0304
        L_0x0312:
            r16 = r3
            r17 = r4
        L_0x0316:
            r0 = r22
            r3 = r16
            r4 = r17
            goto L_0x0024
        L_0x031e:
            androidx.media3.extractor.j.d.f r0 = new androidx.media3.extractor.j.d.f
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p167d.C3487a.mo7433l(byte[], int, boolean):androidx.media3.extractor.j.c");
    }

    public C3487a(List list) {
        this.f10847j = -3.4028235E38f;
        this.f10848k = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f10844g = false;
            this.f10845h = null;
            return;
        }
        this.f10844g = true;
        String L = C2612ak.m6929L((byte[]) list.get(0));
        C2601a.m6830b(L.startsWith("Format:"));
        C3488b a = C3488b.m10099a(L);
        a.getClass();
        this.f10845h = a;
        m10097p(new C2604ac((byte[]) list.get(1)));
    }
}
