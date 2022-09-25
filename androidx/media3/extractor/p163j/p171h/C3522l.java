package androidx.media3.extractor.p163j.p171h;

import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.p163j.C3470b;

/* renamed from: androidx.media3.extractor.j.h.l */
/* compiled from: PG */
public final class C3522l extends C3470b {

    /* renamed from: f */
    private final C2604ac f11017f = new C2604ac();

    /* renamed from: g */
    private final C3513c f11018g = new C3513c();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0116, code lost:
        if (")".equals(androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r7, r11)) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03aa A[EDGE_INSN: B:217:0x03aa->B:190:0x03aa ?: BREAK  
    EDGE_INSN: B:218:0x03aa->B:190:0x03aa ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012b  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.extractor.p163j.C3482c mo7433l(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r1 = r21
            androidx.media3.common.b.ac r0 = r1.f11017f
            r2 = r22
            r3 = r23
            r0.mo6157y(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.media3.common.b.ac r2 = r1.f11017f     // Catch:{ az -> 0x03ca }
            androidx.media3.extractor.p163j.p171h.C3523m.m10177d(r2)     // Catch:{ az -> 0x03ca }
        L_0x0015:
            androidx.media3.common.b.ac r2 = r1.f11017f
            java.lang.String r2 = r2.mo6149q()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0015
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0026:
            androidx.media3.common.b.ac r3 = r1.f11017f
            r4 = -1
            r5 = 0
            r6 = -1
            r7 = 0
        L_0x002c:
            r9 = 2
            r10 = 1
            if (r6 != r4) goto L_0x0050
            int r7 = r3.f7235b
            java.lang.String r6 = r3.mo6149q()
            if (r6 != 0) goto L_0x003a
            r6 = 0
            goto L_0x002c
        L_0x003a:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x0044
            r6 = 2
            goto L_0x002c
        L_0x0044:
            java.lang.String r9 = "NOTE"
            boolean r6 = r6.startsWith(r9)
            if (r6 == 0) goto L_0x004e
            r6 = 1
            goto L_0x002c
        L_0x004e:
            r6 = 3
            goto L_0x002c
        L_0x0050:
            r3.mo6131A(r7)
            if (r6 == 0) goto L_0x03c4
            if (r6 != r10) goto L_0x0064
            androidx.media3.common.b.ac r3 = r1.f11017f
        L_0x0059:
            java.lang.String r4 = r3.mo6149q()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0026
            goto L_0x0059
        L_0x0064:
            if (r6 != r9) goto L_0x03b7
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x03af
            androidx.media3.common.b.ac r3 = r1.f11017f
            r3.mo6149q()
            androidx.media3.extractor.j.h.c r3 = r1.f11018g
            androidx.media3.common.b.ac r6 = r1.f11017f
            java.lang.StringBuilder r7 = r3.f10972d
            r7.setLength(r5)
            int r7 = r6.f7235b
        L_0x007c:
            java.lang.String r11 = r6.mo6149q()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x007c
            androidx.media3.common.b.ac r11 = r3.f10971c
            byte[] r12 = r6.f7234a
            int r6 = r6.f7235b
            r11.mo6157y(r12, r6)
            androidx.media3.common.b.ac r6 = r3.f10971c
            r6.mo6131A(r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0099:
            androidx.media3.common.b.ac r7 = r3.f10971c
            java.lang.StringBuilder r11 = r3.f10972d
            androidx.media3.extractor.p163j.p171h.C3513c.m10160c(r7)
            int r12 = r7.f7236c
            int r13 = r7.f7235b
            int r12 = r12 - r13
            java.lang.String r13 = "{"
            r14 = 5
            java.lang.String r15 = ""
            r16 = 0
            if (r12 >= r14) goto L_0x00b2
        L_0x00ae:
            r8 = r16
            goto L_0x0119
        L_0x00b2:
            java.nio.charset.Charset r12 = com.google.common.base.C58913w.f156754c
            java.lang.String r12 = r7.mo6151s(r14, r12)
            java.lang.String r14 = "::cue"
            boolean r12 = r14.equals(r12)
            if (r12 != 0) goto L_0x00c1
            goto L_0x00ae
        L_0x00c1:
            int r12 = r7.f7235b
            java.lang.String r14 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r7, r11)
            if (r14 != 0) goto L_0x00ca
            goto L_0x00ae
        L_0x00ca:
            boolean r17 = r13.equals(r14)
            if (r17 == 0) goto L_0x00d5
            r7.mo6131A(r12)
            r8 = r15
            goto L_0x0119
        L_0x00d5:
            java.lang.String r12 = "("
            boolean r12 = r12.equals(r14)
            if (r12 == 0) goto L_0x010a
            int r12 = r7.f7235b
            int r14 = r7.f7236c
            r17 = 0
        L_0x00e3:
            if (r12 >= r14) goto L_0x00fa
            if (r17 != 0) goto L_0x00fa
            int r17 = r12 + 1
            byte[] r8 = r7.f7234a
            byte r8 = r8[r12]
            char r8 = (char) r8
            r12 = 41
            if (r8 != r12) goto L_0x00f4
            r8 = 1
            goto L_0x00f5
        L_0x00f4:
            r8 = 0
        L_0x00f5:
            r12 = r17
            r17 = r8
            goto L_0x00e3
        L_0x00fa:
            int r12 = r12 + -1
            int r8 = r7.f7235b
            int r12 = r12 - r8
            java.nio.charset.Charset r8 = com.google.common.base.C58913w.f156754c
            java.lang.String r8 = r7.mo6151s(r12, r8)
            java.lang.String r8 = r8.trim()
            goto L_0x010c
        L_0x010a:
            r8 = r16
        L_0x010c:
            java.lang.String r12 = ")"
            java.lang.String r7 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r7, r11)
            boolean r7 = r12.equals(r7)
            if (r7 != 0) goto L_0x0119
            goto L_0x00ae
        L_0x0119:
            if (r8 == 0) goto L_0x03aa
            androidx.media3.common.b.ac r7 = r3.f10971c
            java.lang.StringBuilder r11 = r3.f10972d
            java.lang.String r7 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r7, r11)
            boolean r7 = r13.equals(r7)
            if (r7 != 0) goto L_0x012b
            goto L_0x03aa
        L_0x012b:
            androidx.media3.extractor.j.h.d r7 = new androidx.media3.extractor.j.h.d
            r7.<init>()
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L_0x013a
        L_0x0136:
            r11 = r16
            r8 = 0
            goto L_0x0195
        L_0x013a:
            r11 = 91
            int r11 = r8.indexOf(r11)
            if (r11 == r4) goto L_0x015f
            java.util.regex.Pattern r12 = androidx.media3.extractor.p163j.p171h.C3513c.f10969a
            java.lang.String r13 = r8.substring(r11)
            java.util.regex.Matcher r12 = r12.matcher(r13)
            boolean r13 = r12.matches()
            if (r13 == 0) goto L_0x015b
            java.lang.String r12 = r12.group(r10)
            r12.getClass()
            r7.f10976d = r12
        L_0x015b:
            java.lang.String r8 = r8.substring(r5, r11)
        L_0x015f:
            java.lang.String r11 = "\\."
            java.lang.String[] r8 = androidx.media3.common.p136b.C2612ak.m6967aq(r8, r11)
            r11 = r8[r5]
            r12 = 35
            int r12 = r11.indexOf(r12)
            if (r12 == r4) goto L_0x017e
            java.lang.String r13 = r11.substring(r5, r12)
            r7.f10974b = r13
            int r12 = r12 + 1
            java.lang.String r11 = r11.substring(r12)
            r7.f10973a = r11
            goto L_0x0180
        L_0x017e:
            r7.f10974b = r11
        L_0x0180:
            int r11 = r8.length
            if (r11 <= r10) goto L_0x0136
            java.lang.Object[] r8 = androidx.media3.common.p136b.C2612ak.m6976az(r8, r11)
            java.lang.String[] r8 = (java.lang.String[]) r8
            java.util.HashSet r11 = new java.util.HashSet
            java.util.List r8 = java.util.Arrays.asList(r8)
            r11.<init>(r8)
            r7.f10975c = r11
            goto L_0x0136
        L_0x0195:
            java.lang.String r12 = "}"
            if (r8 != 0) goto L_0x0394
            androidx.media3.common.b.ac r8 = r3.f10971c
            int r11 = r8.f7235b
            java.lang.StringBuilder r13 = r3.f10972d
            java.lang.String r8 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r8, r13)
            if (r8 == 0) goto L_0x01ae
            boolean r13 = r12.equals(r8)
            if (r13 == 0) goto L_0x01ac
            goto L_0x01ae
        L_0x01ac:
            r13 = 0
            goto L_0x01af
        L_0x01ae:
            r13 = 1
        L_0x01af:
            if (r13 != 0) goto L_0x0382
            androidx.media3.common.b.ac r14 = r3.f10971c
            r14.mo6131A(r11)
            androidx.media3.common.b.ac r11 = r3.f10971c
            java.lang.StringBuilder r14 = r3.f10972d
            androidx.media3.extractor.p163j.p171h.C3513c.m10160c(r11)
            java.lang.String r4 = androidx.media3.extractor.p163j.p171h.C3513c.m10158a(r11, r14)
            boolean r17 = r15.equals(r4)
            if (r17 == 0) goto L_0x01c9
            goto L_0x0382
        L_0x01c9:
            java.lang.String r5 = ":"
            java.lang.String r9 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r11, r14)
            boolean r5 = r5.equals(r9)
            if (r5 != 0) goto L_0x01d7
            goto L_0x0382
        L_0x01d7:
            androidx.media3.extractor.p163j.p171h.C3513c.m10160c(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r9 = 0
        L_0x01e0:
            java.lang.String r10 = ";"
            if (r9 != 0) goto L_0x0211
            r18 = r3
            int r3 = r11.f7235b
            r19 = r8
            java.lang.String r8 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r11, r14)
            if (r8 != 0) goto L_0x01f3
            r3 = r16
            goto L_0x0219
        L_0x01f3:
            boolean r20 = r12.equals(r8)
            if (r20 != 0) goto L_0x0208
            boolean r10 = r10.equals(r8)
            if (r10 == 0) goto L_0x0200
            goto L_0x0208
        L_0x0200:
            r5.append(r8)
            r3 = r18
            r8 = r19
            goto L_0x01e0
        L_0x0208:
            r11.mo6131A(r3)
            r3 = r18
            r8 = r19
            r9 = 1
            goto L_0x01e0
        L_0x0211:
            r18 = r3
            r19 = r8
            java.lang.String r3 = r5.toString()
        L_0x0219:
            if (r3 == 0) goto L_0x0386
            boolean r5 = r15.equals(r3)
            if (r5 == 0) goto L_0x0223
            goto L_0x0386
        L_0x0223:
            int r5 = r11.f7235b
            java.lang.String r8 = androidx.media3.extractor.p163j.p171h.C3513c.m10159b(r11, r14)
            boolean r9 = r10.equals(r8)
            if (r9 == 0) goto L_0x0230
            goto L_0x0239
        L_0x0230:
            boolean r8 = r12.equals(r8)
            if (r8 == 0) goto L_0x0386
            r11.mo6131A(r5)
        L_0x0239:
            java.lang.String r5 = "color"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x024c
            r5 = 1
            int r3 = androidx.media3.common.p136b.C2618f.m7015a(r3, r5)
            r7.f10978f = r3
            r7.f10979g = r5
            goto L_0x0386
        L_0x024c:
            r5 = 1
            java.lang.String r8 = "background-color"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x025f
            int r3 = androidx.media3.common.p136b.C2618f.m7015a(r3, r5)
            r7.f10980h = r3
            r7.f10981i = r5
            goto L_0x0386
        L_0x025f:
            java.lang.String r8 = "ruby-position"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x0280
            java.lang.String r4 = "over"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0273
            r7.f10987o = r5
            goto L_0x0386
        L_0x0273:
            java.lang.String r4 = "under"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0386
            r3 = 2
            r7.f10987o = r3
            goto L_0x0386
        L_0x0280:
            java.lang.String r5 = "text-combine-upright"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x02a0
            java.lang.String r4 = "all"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x029b
            java.lang.String r4 = "digits"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r3 = 0
            goto L_0x029c
        L_0x029b:
            r3 = 1
        L_0x029c:
            r7.f10988p = r3
            goto L_0x0386
        L_0x02a0:
            java.lang.String r5 = "text-decoration"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x02b5
            java.lang.String r4 = "underline"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0386
            r3 = 1
            r7.f10982j = r3
            goto L_0x0387
        L_0x02b5:
            java.lang.String r5 = "font-family"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x02c5
            java.lang.String r3 = com.google.common.base.C58890d.m90988c(r3)
            r7.f10977e = r3
            goto L_0x0386
        L_0x02c5:
            java.lang.String r5 = "font-weight"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x02da
            java.lang.String r4 = "bold"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0386
            r5 = 1
            r7.f10983k = r5
            goto L_0x0386
        L_0x02da:
            r5 = 1
            java.lang.String r8 = "font-style"
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x02ef
            java.lang.String r4 = "italic"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0386
            r7.f10984l = r5
            goto L_0x0386
        L_0x02ef:
            java.lang.String r5 = "font-size"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x0386
            java.util.regex.Pattern r4 = androidx.media3.extractor.p163j.p171h.C3513c.f10970b
            java.lang.String r5 = com.google.common.base.C58890d.m90988c(r3)
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L_0x0321
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Invalid font-size: '"
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "'."
            r4.append(r3)
            java.lang.String r3 = "WebvttCssParser"
            java.lang.String r4 = r4.toString()
            androidx.media3.common.p136b.C2633u.m7050e(r3, r4)
            goto L_0x0386
        L_0x0321:
            r3 = 2
            java.lang.String r5 = r4.group(r3)
            r5.getClass()
            int r3 = r5.hashCode()
            r8 = 37
            if (r3 == r8) goto L_0x034e
            r8 = 3240(0xca8, float:4.54E-42)
            if (r3 == r8) goto L_0x0344
            r8 = 3592(0xe08, float:5.033E-42)
            if (r3 == r8) goto L_0x033a
            goto L_0x0358
        L_0x033a:
            java.lang.String r3 = "px"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0358
            r5 = 0
            goto L_0x0359
        L_0x0344:
            java.lang.String r3 = "em"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0358
            r5 = 1
            goto L_0x0359
        L_0x034e:
            java.lang.String r3 = "%"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0358
            r5 = 2
            goto L_0x0359
        L_0x0358:
            r5 = -1
        L_0x0359:
            r3 = 1
            if (r5 == 0) goto L_0x0370
            if (r5 == r3) goto L_0x036b
            r8 = 2
            if (r5 != r8) goto L_0x0365
            r5 = 3
            r7.f10985m = r5
            goto L_0x0374
        L_0x0365:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x036b:
            r5 = 3
            r8 = 2
            r7.f10985m = r8
            goto L_0x0374
        L_0x0370:
            r5 = 3
            r8 = 2
            r7.f10985m = r3
        L_0x0374:
            java.lang.String r4 = r4.group(r3)
            r4.getClass()
            float r4 = java.lang.Float.parseFloat(r4)
            r7.f10986n = r4
            goto L_0x0389
        L_0x0382:
            r18 = r3
            r19 = r8
        L_0x0386:
            r3 = 1
        L_0x0387:
            r5 = 3
            r8 = 2
        L_0x0389:
            r8 = r13
            r3 = r18
            r11 = r19
            r4 = -1
            r5 = 0
            r9 = 2
            r10 = 1
            goto L_0x0195
        L_0x0394:
            r18 = r3
            r3 = 1
            r5 = 3
            r8 = 2
            boolean r4 = r12.equals(r11)
            if (r4 == 0) goto L_0x03a2
            r6.add(r7)
        L_0x03a2:
            r3 = r18
            r4 = -1
            r5 = 0
            r9 = 2
            r10 = 1
            goto L_0x0099
        L_0x03aa:
            r0.addAll(r6)
            goto L_0x0026
        L_0x03af:
            androidx.media3.extractor.j.e r0 = new androidx.media3.extractor.j.e
            java.lang.String r2 = "A style block was found after the first cue."
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x03b7:
            androidx.media3.common.b.ac r3 = r1.f11017f
            androidx.media3.extractor.j.h.e r3 = androidx.media3.extractor.p163j.p171h.C3521k.m10167d(r3, r0)
            if (r3 == 0) goto L_0x0026
            r2.add(r3)
            goto L_0x0026
        L_0x03c4:
            androidx.media3.extractor.j.h.o r0 = new androidx.media3.extractor.j.h.o
            r0.<init>(r2)
            return r0
        L_0x03ca:
            r0 = move-exception
            androidx.media3.extractor.j.e r2 = new androidx.media3.extractor.j.e
            r2.<init>((java.lang.Throwable) r0)
            goto L_0x03d2
        L_0x03d1:
            throw r2
        L_0x03d2:
            goto L_0x03d1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.p163j.p171h.C3522l.mo7433l(byte[], int, boolean):androidx.media3.extractor.j.c");
    }
}
