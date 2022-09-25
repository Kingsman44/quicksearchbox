package androidx.media3.extractor.p163j.p168e;

import androidx.media3.extractor.p163j.C3470b;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.extractor.j.e.a */
/* compiled from: PG */
public final class C3494a extends C3470b {

    /* renamed from: f */
    private static final Pattern f10881f = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: g */
    private static final Pattern f10882g = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: h */
    private final StringBuilder f10883h = new StringBuilder();

    /* renamed from: i */
    private final ArrayList f10884i = new ArrayList();

    /* renamed from: m */
    static float m10107m(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    private static long m10108n(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = parseLong + (Long.parseLong(group2) * 60000);
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = parseLong2 + (Long.parseLong(group3) * 1000);
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.p163j.C3482c mo7433l(byte[] r17, int r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            java.lang.String r1 = "SubripDecoder"
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            androidx.media3.common.b.v r3 = new androidx.media3.common.b.v
            r4 = 0
            r3.<init>(r4)
            androidx.media3.common.b.ac r5 = new androidx.media3.common.b.ac
            r6 = r17
            r7 = r18
            r5.<init>(r6, r7)
        L_0x0018:
            java.lang.String r6 = r5.mo6149q()
            r7 = 0
            if (r6 == 0) goto L_0x01d5
            int r8 = r6.length()
            if (r8 == 0) goto L_0x0018
            java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01c9 }
            java.lang.String r6 = r5.mo6149q()
            if (r6 != 0) goto L_0x0035
            java.lang.String r4 = "Unexpected end"
            androidx.media3.common.p136b.C2633u.m7050e(r1, r4)
            goto L_0x01d5
        L_0x0035:
            java.util.regex.Pattern r8 = f10881f
            java.util.regex.Matcher r8 = r8.matcher(r6)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x01bf
            r6 = 1
            long r9 = m10108n(r8, r6)
            r3.mo6208b(r9)
            r9 = 6
            long r8 = m10108n(r8, r9)
            r3.mo6208b(r8)
            java.lang.StringBuilder r8 = r0.f10883h
            r8.setLength(r7)
            java.util.ArrayList r8 = r0.f10884i
            r8.clear()
            java.lang.String r8 = r5.mo6149q()
        L_0x005f:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x00b5
            java.lang.StringBuilder r9 = r0.f10883h
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0074
            java.lang.StringBuilder r9 = r0.f10883h
            java.lang.String r10 = "<br>"
            r9.append(r10)
        L_0x0074:
            java.lang.StringBuilder r9 = r0.f10883h
            java.util.ArrayList r10 = r0.f10884i
            java.lang.String r8 = r8.trim()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r8)
            java.util.regex.Pattern r12 = f10882g
            java.util.regex.Matcher r8 = r12.matcher(r8)
            r12 = 0
        L_0x0088:
            boolean r13 = r8.find()
            if (r13 == 0) goto L_0x00a8
            java.lang.String r13 = r8.group()
            r10.add(r13)
            int r14 = r8.start()
            int r14 = r14 - r12
            int r13 = r13.length()
            int r15 = r14 + r13
            java.lang.String r4 = ""
            r11.replace(r14, r15, r4)
            int r12 = r12 + r13
            r4 = 0
            goto L_0x0088
        L_0x00a8:
            java.lang.String r4 = r11.toString()
            r9.append(r4)
            java.lang.String r8 = r5.mo6149q()
            r4 = 0
            goto L_0x005f
        L_0x00b5:
            java.lang.StringBuilder r4 = r0.f10883h
            java.lang.String r4 = r4.toString()
            android.text.Spanned r4 = android.text.Html.fromHtml(r4)
            r8 = 0
        L_0x00c0:
            java.util.ArrayList r9 = r0.f10884i
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x00dc
            java.util.ArrayList r9 = r0.f10884i
            java.lang.Object r9 = r9.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r10 = "\\{\\\\an[1-9]\\}"
            boolean r10 = r9.matches(r10)
            if (r10 == 0) goto L_0x00d9
            goto L_0x00dd
        L_0x00d9:
            int r8 = r8 + 1
            goto L_0x00c0
        L_0x00dc:
            r9 = 0
        L_0x00dd:
            androidx.media3.common.a.b r8 = new androidx.media3.common.a.b
            r8.<init>()
            r8.f7065a = r4
            if (r9 != 0) goto L_0x00ec
            androidx.media3.common.a.c r4 = r8.mo6076a()
            goto L_0x01b6
        L_0x00ec:
            int r4 = r9.hashCode()
            java.lang.String r10 = "{\\an9}"
            java.lang.String r11 = "{\\an7}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an1}"
            r14 = 4
            r7 = 3
            r15 = 2
            switch(r4) {
                case -685620710: goto L_0x012b;
                case -685620648: goto L_0x0123;
                case -685620617: goto L_0x0119;
                case -685620555: goto L_0x010f;
                case -685620524: goto L_0x0107;
                case -685620462: goto L_0x00ff;
                default: goto L_0x00fe;
            }
        L_0x00fe:
            goto L_0x0133
        L_0x00ff:
            boolean r4 = r9.equals(r10)
            if (r4 == 0) goto L_0x0133
            r4 = 5
            goto L_0x0134
        L_0x0107:
            boolean r4 = r9.equals(r11)
            if (r4 == 0) goto L_0x0133
            r4 = 2
            goto L_0x0134
        L_0x010f:
            java.lang.String r4 = "{\\an6}"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0133
            r4 = 4
            goto L_0x0134
        L_0x0119:
            java.lang.String r4 = "{\\an4}"
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0133
            r4 = 1
            goto L_0x0134
        L_0x0123:
            boolean r4 = r9.equals(r12)
            if (r4 == 0) goto L_0x0133
            r4 = 3
            goto L_0x0134
        L_0x012b:
            boolean r4 = r9.equals(r13)
            if (r4 == 0) goto L_0x0133
            r4 = 0
            goto L_0x0134
        L_0x0133:
            r4 = -1
        L_0x0134:
            if (r4 == 0) goto L_0x0149
            if (r4 == r6) goto L_0x0149
            if (r4 == r15) goto L_0x0149
            if (r4 == r7) goto L_0x0145
            if (r4 == r14) goto L_0x0145
            r14 = 5
            if (r4 == r14) goto L_0x0145
            r8.f7073i = r6
            r4 = 1
            goto L_0x014d
        L_0x0145:
            r8.f7073i = r15
            r4 = 2
            goto L_0x014d
        L_0x0149:
            r4 = 0
            r8.f7073i = r4
            r4 = 0
        L_0x014d:
            int r14 = r9.hashCode()
            switch(r14) {
                case -685620710: goto L_0x0181;
                case -685620679: goto L_0x0177;
                case -685620648: goto L_0x016f;
                case -685620524: goto L_0x0167;
                case -685620493: goto L_0x015d;
                case -685620462: goto L_0x0155;
                default: goto L_0x0154;
            }
        L_0x0154:
            goto L_0x0189
        L_0x0155:
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0189
            r14 = 5
            goto L_0x018a
        L_0x015d:
            java.lang.String r10 = "{\\an8}"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0189
            r14 = 4
            goto L_0x018a
        L_0x0167:
            boolean r9 = r9.equals(r11)
            if (r9 == 0) goto L_0x0189
            r14 = 3
            goto L_0x018a
        L_0x016f:
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0189
            r14 = 2
            goto L_0x018a
        L_0x0177:
            java.lang.String r10 = "{\\an2}"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0189
            r14 = 1
            goto L_0x018a
        L_0x0181:
            boolean r9 = r9.equals(r13)
            if (r9 == 0) goto L_0x0189
            r14 = 0
            goto L_0x018a
        L_0x0189:
            r14 = -1
        L_0x018a:
            if (r14 == 0) goto L_0x019f
            if (r14 == r6) goto L_0x019f
            if (r14 == r15) goto L_0x019f
            if (r14 == r7) goto L_0x019b
            r7 = 4
            if (r14 == r7) goto L_0x019b
            r7 = 5
            if (r14 == r7) goto L_0x019b
            r8.f7071g = r6
            goto L_0x01a1
        L_0x019b:
            r6 = 0
            r8.f7071g = r6
            goto L_0x01a1
        L_0x019f:
            r8.f7071g = r15
        L_0x01a1:
            float r4 = m10107m(r4)
            r8.f7072h = r4
            int r4 = r8.f7071g
            float r4 = m10107m(r4)
            r8.f7069e = r4
            r4 = 0
            r8.f7070f = r4
            androidx.media3.common.a.c r4 = r8.mo6076a()
        L_0x01b6:
            r2.add(r4)
            androidx.media3.common.a.c r4 = androidx.media3.common.p135a.C2567c.f7082a
            r2.add(r4)
            goto L_0x01d2
        L_0x01bf:
            java.lang.String r4 = "Skipping invalid timing: "
            java.lang.String r4 = r4.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r1, r4)
            goto L_0x01d2
        L_0x01c9:
            java.lang.String r4 = "Skipping invalid index: "
            java.lang.String r4 = r4.concat(r6)
            androidx.media3.common.p136b.C2633u.m7050e(r1, r4)
        L_0x01d2:
            r4 = 0
            goto L_0x0018
        L_0x01d5:
            r1 = 0
            androidx.media3.common.a.c[] r1 = new androidx.media3.common.p135a.C2567c[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            androidx.media3.common.a.c[] r1 = (androidx.media3.common.p135a.C2567c[]) r1
            long[] r2 = r3.f7305b
            int r3 = r3.f7304a
            long[] r2 = java.util.Arrays.copyOf(r2, r3)
            androidx.media3.extractor.j.e.b r3 = new androidx.media3.extractor.j.e.b
            r3.<init>(r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p168e.C3494a.mo7433l(byte[], int, boolean):androidx.media3.extractor.j.c");
    }
}
