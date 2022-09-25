package com.google.android.libraries.search.p2871b.p2896j;

import com.google.android.libraries.search.p2871b.p2895i.C37256e;
import java.util.Random;

/* renamed from: com.google.android.libraries.search.b.j.a */
/* compiled from: PG */
public final class C37267a {

    /* renamed from: a */
    public static final /* synthetic */ int f99033a = 0;

    /* renamed from: b */
    private static final char[] f99034b = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: c */
    private static final Random f99035c = new Random();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m66218a(com.google.common.p4522b.C58485gu r37, java.util.Map r38, java.util.Map r39, java.util.Set r40, java.util.Map r41, java.util.Map r42) {
        /*
            r0 = r37
            r1 = r41
            r2 = r42
            java.lang.String r3 = "-"
            int r4 = r37.size()
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.String[] r8 = new java.lang.String[r4]
            java.lang.String[] r4 = new java.lang.String[r4]
            boolean r9 = r37.isEmpty()
            java.lang.String r10 = "None"
            if (r9 == 0) goto L_0x001f
            return r10
        L_0x001f:
            r9 = 0
            java.lang.Object r11 = r0.get(r9)
            com.google.android.libraries.search.b.i.e r11 = (com.google.android.libraries.search.p2871b.p2895i.C37256e) r11
            com.google.c.a.a r11 = r11.mo40797b()
            com.google.protobuf.bv r11 = r11.instance
            com.google.c.a.b r11 = (com.google.p4438c.p4439a.C57913b) r11
            com.google.bx.d r11 = r11.f154902c
            if (r11 != 0) goto L_0x0034
            com.google.bx.d r11 = com.google.p4419bx.C57863d.f154580d
        L_0x0034:
            com.google.protobuf.fg r11 = r11.f154583b
            if (r11 != 0) goto L_0x003a
            com.google.protobuf.fg r11 = com.google.protobuf.C63042fg.f170152c
        L_0x003a:
            long r11 = com.google.protobuf.p4750c.C62953e.m95479d(r11)
            int r13 = r37.size()
            r16 = 11
            r17 = 9
            r18 = 7
            r19 = 10
            r19 = r3
            r26 = r10
            r24 = r11
            r3 = 8
            r9 = 11
            r14 = 0
            r15 = 7
            r18 = 0
            r21 = 9
            r22 = 5
            r23 = 10
        L_0x005e:
            java.lang.String r27 = ""
            java.lang.String r10 = "\n"
            if (r14 >= r13) goto L_0x0315
            java.lang.Object r28 = r0.get(r14)
            com.google.android.libraries.search.b.i.e r28 = (com.google.android.libraries.search.p2871b.p2895i.C37256e) r28
            java.lang.String r29 = m66219b(r28)
            r30 = r13
            int r13 = r29.length()
            int r9 = java.lang.Math.max(r9, r13)
            com.google.android.libraries.search.b.b.a r13 = r28.mo40798c()
            com.google.android.libraries.search.b.e.a r13 = r13.f98876a
            com.google.android.libraries.search.b.e.b r13 = r13.f98907b
            com.google.s.a.a.a.a.a.b r13 = r13.f98909b
            r29 = r9
            com.google.s.a.a.a.a.a.b r9 = com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a.C66419b.UNKNOWN
            if (r13 == r9) goto L_0x00ad
            com.google.android.libraries.search.b.b.a r9 = r28.mo40798c()
            com.google.android.libraries.search.b.e.a r9 = r9.f98876a
            com.google.android.libraries.search.b.e.b r9 = r9.f98907b
            com.google.s.a.a.a.a.a.b r9 = r9.f98909b
            int r13 = r9.f180604g
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0 = r39
            java.lang.Object r13 = r0.get(r13)
            com.google.android.libraries.search.b.g.d r13 = (com.google.android.libraries.search.p2871b.p2892g.C37242d) r13
            if (r13 == 0) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            int r9 = r9.f180604g
            com.google.android.libraries.search.b.g.c r13 = new com.google.android.libraries.search.b.g.c
            r13.<init>(r9)
        L_0x00aa:
            r0 = r38
            goto L_0x00cd
        L_0x00ad:
            r0 = r39
            com.google.android.libraries.search.b.b.a r9 = r28.mo40798c()
            com.google.android.libraries.search.b.e.a r9 = r9.f98876a
            com.google.android.libraries.search.b.e.b r9 = r9.f98907b
            int r9 = r9.f98908a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            r0 = r38
            java.lang.Object r13 = r0.get(r13)
            com.google.android.libraries.search.b.g.d r13 = (com.google.android.libraries.search.p2871b.p2892g.C37242d) r13
            if (r13 == 0) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            com.google.android.libraries.search.b.g.c r13 = new com.google.android.libraries.search.b.g.c
            r13.<init>(r9)
        L_0x00cd:
            com.google.c.a.a r9 = r28.mo40797b()
            com.google.protobuf.bv r9 = r9.instance
            com.google.c.a.b r9 = (com.google.p4438c.p4439a.C57913b) r9
            com.google.bx.d r9 = r9.f154902c
            if (r9 != 0) goto L_0x00db
            com.google.bx.d r9 = com.google.p4419bx.C57863d.f154580d
        L_0x00db:
            com.google.bx.c r9 = r9.f154584c
            if (r9 != 0) goto L_0x00e1
            com.google.bx.c r9 = com.google.p4419bx.C57862c.f154575d
        L_0x00e1:
            com.google.android.libraries.search.b.g.e r13 = r13.mo40692c()
            java.lang.String r9 = com.google.android.libraries.search.p2871b.p2896j.C37272f.m66226a(r9, r13)
            r6[r18] = r9
            int r9 = r9.length()
            int r15 = java.lang.Math.max(r15, r9)
            com.google.c.a.a r9 = r28.mo40797b()
            com.google.protobuf.bv r9 = r9.instance
            com.google.c.a.b r9 = (com.google.p4438c.p4439a.C57913b) r9
            com.google.bx.d r9 = r9.f154902c
            if (r9 != 0) goto L_0x0101
            com.google.bx.d r9 = com.google.p4419bx.C57863d.f154580d
        L_0x0101:
            com.google.protobuf.fg r9 = r9.f154583b
            if (r9 != 0) goto L_0x0107
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x0107:
            long r31 = com.google.protobuf.p4750c.C62953e.m95479d(r9)
            long r24 = r31 - r24
            long r33 = r31 - r11
            java.lang.String r9 = com.google.android.libraries.search.p2871b.p2896j.C37272f.m66227b(r33)
            java.lang.String r13 = com.google.android.libraries.search.p2871b.p2896j.C37272f.m66227b(r24)
            r33 = 0
            int r35 = (r24 > r33 ? 1 : (r24 == r33 ? 0 : -1))
            if (r35 < 0) goto L_0x0123
            java.lang.String r0 = "+"
            java.lang.String r13 = r0.concat(r13)
        L_0x0123:
            if (r18 <= 0) goto L_0x013e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            java.lang.String r9 = "("
            r0.append(r9)
            r0.append(r13)
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
        L_0x013e:
            r5[r18] = r9
            int r0 = r9.length()
            int r3 = java.lang.Math.max(r3, r0)
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            int r0 = r0.f154900a
            r9 = 4
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0182
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            com.google.c.a.d r0 = r0.f154903d
            if (r0 != 0) goto L_0x0164
            com.google.c.a.d r0 = com.google.p4438c.p4439a.C57915d.f154905a
        L_0x0164:
            java.util.Iterator r0 = r40.iterator()
        L_0x0168:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x017f
            java.lang.Object r9 = r0.next()
            com.google.android.libraries.search.b.j.c r9 = (com.google.android.libraries.search.p2871b.p2896j.C37269c) r9
            boolean r13 = r9.mo40827a()
            if (r13 == 0) goto L_0x0168
            java.lang.String r0 = r9.mo40828b()
            goto L_0x0184
        L_0x017f:
            java.lang.String r0 = "UNKNOWN_EXTENSION"
            goto L_0x0184
        L_0x0182:
            r0 = r26
        L_0x0184:
            r7[r18] = r0
            com.google.common.base.cf r0 = com.google.common.base.C58869cf.m90938d(r10)
            r9 = r7[r18]
            java.util.List r0 = r0.mo56155i(r9)
            java.util.Iterator r0 = r0.iterator()
            r9 = r21
        L_0x0196:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x01ab
            java.lang.Object r13 = r0.next()
            java.lang.String r13 = (java.lang.String) r13
            int r13 = r13.length()
            int r9 = java.lang.Math.max(r9, r13)
            goto L_0x0196
        L_0x01ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.TreeSet r13 = new java.util.TreeSet
            com.google.common.b.hd r21 = r28.mo40800f()
            r24 = r3
            com.google.common.b.ij r3 = r21.keySet()
            r13.<init>(r3)
            java.util.Iterator r3 = r13.iterator()
        L_0x01c3:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0260
            java.lang.Object r13 = r3.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r21 = r1.containsKey(r13)
            if (r21 != 0) goto L_0x01e1
            r21 = r3
            r17 = 8
            java.lang.String r3 = m66220c(r17)
            r1.put(r13, r3)
            goto L_0x01e5
        L_0x01e1:
            r21 = r3
            r17 = 8
        L_0x01e5:
            java.lang.Object r3 = r1.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = ": ["
            r1.append(r3)
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>()
            r25 = r9
            com.google.common.b.hd r9 = r28.mo40800f()
            java.lang.Object r9 = r9.get(r13)
            java.util.Set r9 = (java.util.Set) r9
            if (r9 == 0) goto L_0x020e
            r3.addAll(r9)
        L_0x020e:
            java.util.TreeSet r9 = new java.util.TreeSet
            r9.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0217:
            boolean r13 = r3.hasNext()
            if (r13 == 0) goto L_0x0243
            java.lang.Object r13 = r3.next()
            java.lang.String r13 = (java.lang.String) r13
            boolean r35 = r2.containsKey(r13)
            if (r35 != 0) goto L_0x0235
            r35 = 12
            r36 = r3
            java.lang.String r3 = m66220c(r35)
            r2.put(r13, r3)
            goto L_0x0237
        L_0x0235:
            r36 = r3
        L_0x0237:
            java.lang.Object r3 = r2.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            r9.add(r3)
            r3 = r36
            goto L_0x0217
        L_0x0243:
            com.google.common.base.ar r3 = new com.google.common.base.ar
            java.lang.String r13 = ", "
            r3.<init>((java.lang.String) r13)
            r3.mo56100g(r1, r9)
            java.lang.String r3 = "]"
            r1.append(r3)
            r0.append(r1)
            r0.append(r10)
            r1 = r41
            r3 = r21
            r9 = r25
            goto L_0x01c3
        L_0x0260:
            r25 = r9
            r17 = 8
            java.lang.String r0 = r0.toString()
            r8[r18] = r0
            com.google.common.base.cf r0 = com.google.common.base.C58869cf.m90938d(r10)
            r1 = r8[r18]
            java.util.List r0 = r0.mo56155i(r1)
            java.util.Iterator r0 = r0.iterator()
            r1 = r22
        L_0x027a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x028f
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            int r1 = java.lang.Math.max(r1, r3)
            goto L_0x027a
        L_0x028f:
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            com.google.c.a.i r0 = r0.f154901b
            if (r0 != 0) goto L_0x029d
            com.google.c.a.i r0 = com.google.p4438c.p4439a.C57920i.f154916f
        L_0x029d:
            int r0 = r0.f154919b
            r3 = 5
            if (r0 != r3) goto L_0x02bd
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            com.google.c.a.i r0 = r0.f154901b
            if (r0 != 0) goto L_0x02b0
            com.google.c.a.i r0 = com.google.p4438c.p4439a.C57920i.f154916f
        L_0x02b0:
            int r9 = r0.f154919b
            if (r9 != r3) goto L_0x02ba
            java.lang.Object r0 = r0.f154920c
            r27 = r0
            java.lang.String r27 = (java.lang.String) r27
        L_0x02ba:
            r4[r18] = r27
            goto L_0x02f5
        L_0x02bd:
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            com.google.c.a.i r0 = r0.f154901b
            if (r0 != 0) goto L_0x02cb
            com.google.c.a.i r0 = com.google.p4438c.p4439a.C57920i.f154916f
        L_0x02cb:
            int r0 = r0.f154919b
            r3 = 4
            if (r0 != r3) goto L_0x02f1
            com.google.c.a.a r0 = r28.mo40797b()
            com.google.protobuf.bv r0 = r0.instance
            com.google.c.a.b r0 = (com.google.p4438c.p4439a.C57913b) r0
            com.google.c.a.i r0 = r0.f154901b
            if (r0 != 0) goto L_0x02de
            com.google.c.a.i r0 = com.google.p4438c.p4439a.C57920i.f154916f
        L_0x02de:
            int r9 = r0.f154919b
            if (r9 != r3) goto L_0x02ea
            java.lang.Object r0 = r0.f154920c
            java.lang.Long r0 = (java.lang.Long) r0
            long r33 = r0.longValue()
        L_0x02ea:
            java.lang.String r27 = java.lang.String.valueOf(r33)
            r4[r18] = r27
            goto L_0x02f5
        L_0x02f1:
            r4[r18] = r26
            r27 = r26
        L_0x02f5:
            int r0 = r27.length()
            r13 = r23
            int r23 = java.lang.Math.max(r13, r0)
            int r18 = r18 + 1
            int r14 = r14 + 1
            r0 = r37
            r22 = r1
            r3 = r24
            r21 = r25
            r9 = r29
            r13 = r30
            r24 = r31
            r1 = r41
            goto L_0x005e
        L_0x0315:
            r13 = r23
            int r0 = r9 + r15
            int r0 = r0 + r3
            r1 = r22
            int r0 = r0 + r1
            int r0 = r0 + r13
            r2 = r21
            int r0 = r0 + r2
            r11 = 6
            int r0 = r0 + r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "|%-"
            r12.<init>(r14)
            r12.append(r9)
            java.lang.String r11 = "s|%-"
            r12.append(r11)
            r12.append(r15)
            r12.append(r11)
            r12.append(r3)
            r12.append(r11)
            r12.append(r1)
            r12.append(r11)
            r12.append(r13)
            r12.append(r11)
            r12.append(r2)
            r17 = r4
            java.lang.String r4 = "s|"
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r18 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r5.append(r9)
            java.lang.String r9 = "s|%"
            r5.append(r9)
            r5.append(r15)
            r5.append(r9)
            r5.append(r3)
            r5.append(r11)
            r5.append(r1)
            r5.append(r11)
            r5.append(r13)
            r5.append(r11)
            r5.append(r2)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            java.util.Formatter r2 = new java.util.Formatter     // Catch:{ IOException -> 0x04cd }
            r2.<init>()     // Catch:{ IOException -> 0x04cd }
            java.lang.Appendable r3 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r4 = r19
            java.lang.String r5 = com.google.common.base.C58880cq.m90966b(r4, r0)     // Catch:{ IOException -> 0x04cd }
            r3.append(r5)     // Catch:{ IOException -> 0x04cd }
            java.lang.Appendable r3 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r3.append(r10)     // Catch:{ IOException -> 0x04cd }
            r3 = 6
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "Event Name"
            r9 = 0
            r5[r9] = r3     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "Status"
            r9 = 1
            r5[r9] = r3     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "Latency"
            r11 = 2
            r5[r11] = r3     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "Tags"
            r13 = 3
            r5[r13] = r3     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "RequestId"
            r14 = 4
            r5[r14] = r3     // Catch:{ IOException -> 0x04cd }
            java.lang.String r3 = "Metadata"
            r14 = 5
            r5[r14] = r3     // Catch:{ IOException -> 0x04cd }
            r2.format(r12, r5)     // Catch:{ IOException -> 0x04cd }
            java.lang.Appendable r3 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r3.append(r10)     // Catch:{ IOException -> 0x04cd }
            java.lang.Appendable r3 = r2.out()     // Catch:{ IOException -> 0x04cd }
            java.lang.String r5 = com.google.common.base.C58880cq.m90966b(r4, r0)     // Catch:{ IOException -> 0x04cd }
            r3.append(r5)     // Catch:{ IOException -> 0x04cd }
            java.lang.Appendable r3 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r3.append(r10)     // Catch:{ IOException -> 0x04cd }
            r3 = 0
        L_0x03e0:
            int r5 = r37.size()     // Catch:{ IOException -> 0x04cd }
            if (r3 >= r5) goto L_0x04bd
            com.google.common.base.cf r5 = com.google.common.base.C58869cf.m90938d(r10)     // Catch:{ IOException -> 0x04cd }
            com.google.common.base.cf r5 = r5.mo56151a()     // Catch:{ IOException -> 0x04cd }
            r12 = r7[r3]     // Catch:{ IOException -> 0x04cd }
            java.util.List r5 = r5.mo56155i(r12)     // Catch:{ IOException -> 0x04cd }
            com.google.common.base.cf r12 = com.google.common.base.C58869cf.m90938d(r10)     // Catch:{ IOException -> 0x04cd }
            com.google.common.base.cf r12 = r12.mo56151a()     // Catch:{ IOException -> 0x04cd }
            r14 = r8[r3]     // Catch:{ IOException -> 0x04cd }
            java.util.List r12 = r12.mo56155i(r14)     // Catch:{ IOException -> 0x04cd }
            r14 = 0
        L_0x0403:
            int r15 = r12.size()     // Catch:{ IOException -> 0x04cd }
            int r13 = r5.size()     // Catch:{ IOException -> 0x04cd }
            int r13 = java.lang.Math.max(r15, r13)     // Catch:{ IOException -> 0x04cd }
            if (r14 >= r13) goto L_0x04a6
            if (r14 != 0) goto L_0x0463
            r13 = 6
            java.lang.Object[] r14 = new java.lang.Object[r13]     // Catch:{ IOException -> 0x04cd }
            r13 = r37
            java.lang.Object r15 = r13.get(r3)     // Catch:{ IOException -> 0x04cd }
            com.google.android.libraries.search.b.i.e r15 = (com.google.android.libraries.search.p2871b.p2895i.C37256e) r15     // Catch:{ IOException -> 0x04cd }
            java.lang.String r15 = m66219b(r15)     // Catch:{ IOException -> 0x04cd }
            r19 = 0
            r14[r19] = r15     // Catch:{ IOException -> 0x04cd }
            r15 = r6[r3]     // Catch:{ IOException -> 0x04cd }
            r14[r9] = r15     // Catch:{ IOException -> 0x04cd }
            r15 = r18[r3]     // Catch:{ IOException -> 0x04cd }
            r14[r11] = r15     // Catch:{ IOException -> 0x04cd }
            int r15 = r12.size()     // Catch:{ IOException -> 0x04cd }
            if (r15 <= 0) goto L_0x043a
            r15 = 0
            java.lang.Object r19 = r12.get(r15)     // Catch:{ IOException -> 0x04cd }
            goto L_0x043c
        L_0x043a:
            r19 = r27
        L_0x043c:
            r15 = 3
            r14[r15] = r19     // Catch:{ IOException -> 0x04cd }
            r15 = r17[r3]     // Catch:{ IOException -> 0x04cd }
            r19 = 4
            r14[r19] = r15     // Catch:{ IOException -> 0x04cd }
            int r15 = r5.size()     // Catch:{ IOException -> 0x04cd }
            if (r15 <= 0) goto L_0x0451
            r15 = 0
            java.lang.Object r19 = r5.get(r15)     // Catch:{ IOException -> 0x04cd }
            goto L_0x0453
        L_0x0451:
            r19 = r27
        L_0x0453:
            r15 = 5
            r14[r15] = r19     // Catch:{ IOException -> 0x04cd }
            r2.format(r1, r14)     // Catch:{ IOException -> 0x04cd }
            r14 = 0
            r16 = 5
            r19 = 0
            r20 = 2
            r21 = 3
            goto L_0x04a1
        L_0x0463:
            r13 = r37
            java.lang.Appendable r15 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r15.append(r10)     // Catch:{ IOException -> 0x04cd }
            r15 = 6
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x04cd }
            r19 = 0
            r11[r19] = r27     // Catch:{ IOException -> 0x04cd }
            r11[r9] = r27     // Catch:{ IOException -> 0x04cd }
            r20 = 2
            r11[r20] = r27     // Catch:{ IOException -> 0x04cd }
            int r15 = r12.size()     // Catch:{ IOException -> 0x04cd }
            if (r15 <= r14) goto L_0x0484
            java.lang.Object r15 = r12.get(r14)     // Catch:{ IOException -> 0x04cd }
            goto L_0x0486
        L_0x0484:
            r15 = r27
        L_0x0486:
            r21 = 3
            r11[r21] = r15     // Catch:{ IOException -> 0x04cd }
            r15 = 4
            r11[r15] = r27     // Catch:{ IOException -> 0x04cd }
            int r15 = r5.size()     // Catch:{ IOException -> 0x04cd }
            if (r15 <= r14) goto L_0x0498
            java.lang.Object r15 = r5.get(r14)     // Catch:{ IOException -> 0x04cd }
            goto L_0x049a
        L_0x0498:
            r15 = r27
        L_0x049a:
            r16 = 5
            r11[r16] = r15     // Catch:{ IOException -> 0x04cd }
            r2.format(r1, r11)     // Catch:{ IOException -> 0x04cd }
        L_0x04a1:
            int r14 = r14 + r9
            r11 = 2
            r13 = 3
            goto L_0x0403
        L_0x04a6:
            r13 = r37
            r16 = 5
            r19 = 0
            r20 = 2
            r21 = 3
            java.lang.Appendable r5 = r2.out()     // Catch:{ IOException -> 0x04cd }
            r5.append(r10)     // Catch:{ IOException -> 0x04cd }
            int r3 = r3 + 1
            r11 = 2
            r13 = 3
            goto L_0x03e0
        L_0x04bd:
            java.lang.Appendable r1 = r2.out()     // Catch:{ IOException -> 0x04cd }
            java.lang.String r0 = com.google.common.base.C58880cq.m90966b(r4, r0)     // Catch:{ IOException -> 0x04cd }
            r1.append(r0)     // Catch:{ IOException -> 0x04cd }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x04cd }
            return r0
        L_0x04cd:
            r0 = move-exception
            java.lang.String r1 = "Failed to render the events table: "
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r1.concat(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2871b.p2896j.C37267a.m66218a(com.google.common.b.gu, java.util.Map, java.util.Map, java.util.Set, java.util.Map, java.util.Map):java.lang.String");
    }

    /* renamed from: b */
    private static String m66219b(C37256e eVar) {
        String str = eVar.mo40798c().f98877b;
        if (eVar.mo40798c().f98879d) {
            return str.concat(" [S]");
        }
        return !eVar.mo40798c().f98878c ? str : str.concat(" [E]");
    }

    /* renamed from: c */
    private static String m66220c(int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = f99034b;
            sb.append(cArr[f99035c.nextInt(cArr.length)]);
        }
        return sb.toString();
    }
}
