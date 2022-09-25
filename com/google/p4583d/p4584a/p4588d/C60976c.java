package com.google.p4583d.p4584a.p4588d;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.d.a.d.c */
/* compiled from: PG */
public final class C60976c implements Iterable, C60987n, C60983j {

    /* renamed from: a */
    final SortedMap f165101a;

    /* renamed from: b */
    final Map f165102b;

    public C60976c() {
        this.f165101a = new TreeMap();
        this.f165102b = new TreeMap();
    }

    /* renamed from: b */
    public final int mo57466b() {
        return this.f165101a.size();
    }

    /* renamed from: c */
    public final int mo57467c() {
        if (this.f165101a.isEmpty()) {
            return 0;
        }
        return ((Integer) this.f165101a.lastKey()).intValue() + 1;
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        C60976c cVar = new C60976c();
        for (Map.Entry entry : this.f165101a.entrySet()) {
            if (entry.getValue() instanceof C60983j) {
                cVar.f165101a.put((Integer) entry.getKey(), (C60987n) entry.getValue());
            } else {
                cVar.f165101a.put((Integer) entry.getKey(), ((C60987n) entry.getValue()).mo57468d());
            }
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.p4583d.p4584a.p4588d.C60987n) r1.f165101a.get(java.lang.Integer.valueOf(r2));
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57469e(int r2) {
        /*
            r1 = this;
            int r0 = r1.mo57467c()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.mo57485r(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap r0 = r1.f165101a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.d.a.d.n r2 = (com.google.p4583d.p4584a.p4588d.C60987n) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.d.a.d.n r2 = f165114f
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4588d.C60976c.mo57469e(int):com.google.d.a.d.n");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60976c)) {
            return false;
        }
        C60976c cVar = (C60976c) obj;
        if (mo57467c() != cVar.mo57467c()) {
            return false;
        }
        if (this.f165101a.isEmpty()) {
            return cVar.f165101a.isEmpty();
        }
        for (int intValue = ((Integer) this.f165101a.firstKey()).intValue(); intValue <= ((Integer) this.f165101a.lastKey()).intValue(); intValue++) {
            if (!mo57469e(intValue).equals(cVar.mo57469e(intValue))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = (com.google.p4583d.p4584a.p4588d.C60987n) r2.f165102b.get(r3);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57471f(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.d.a.d.f r3 = new com.google.d.a.d.f
            int r0 = r2.mo57467c()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.mo57486s(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map r0 = r2.f165102b
            java.lang.Object r3 = r0.get(r3)
            com.google.d.a.d.n r3 = (com.google.p4583d.p4584a.p4588d.C60987n) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.d.a.d.n r3 = f165114f
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4588d.C60976c.mo57471f(java.lang.String):com.google.d.a.d.n");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: com.google.d.a.d.c} */
    /* JADX WARNING: type inference failed for: r1v105, types: [com.google.d.a.d.n] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0521, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x053b, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0592, code lost:
        r3 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: fK */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57452fK(java.lang.String r22, com.google.p4583d.p4584a.C61012g r23, java.util.List r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = "concat"
            boolean r4 = r4.equals(r1)
            java.lang.String r5 = "indexOf"
            java.lang.String r6 = "reverse"
            java.lang.String r7 = "slice"
            java.lang.String r8 = "shift"
            java.lang.String r9 = "sort"
            java.lang.String r10 = "some"
            java.lang.String r11 = "join"
            java.lang.String r12 = "pop"
            java.lang.String r13 = "map"
            java.lang.String r14 = "lastIndexOf"
            java.lang.String r15 = "forEach"
            java.lang.String r0 = "filter"
            java.lang.String r2 = "toString"
            java.lang.String r3 = "every"
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r3.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r0.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r15.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r5.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r11.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r14.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r13.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r12.equals(r1)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = "push"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = "reduce"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = "reduceRight"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r6.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r8.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r7.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r10.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r9.equals(r1)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = "splice"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x00b9
            boolean r4 = r2.equals(r1)
            if (r4 != 0) goto L_0x00b9
            java.lang.String r4 = "unshift"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            com.google.d.a.d.r r0 = new com.google.d.a.d.r
            r0.<init>(r1)
            r2 = r21
            r3 = r23
            r4 = r24
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60981h.m93180a(r2, r0, r3, r4)
            return r0
        L_0x00b9:
            r4 = r2
            r2 = r3
            r3 = r23
            int r16 = r22.hashCode()
            r17 = -1
            switch(r16) {
                case -1776922004: goto L_0x0180;
                case -1354795244: goto L_0x0176;
                case -1274492040: goto L_0x016e;
                case -934873754: goto L_0x0163;
                case -895859076: goto L_0x0158;
                case -678635926: goto L_0x0150;
                case -467511597: goto L_0x0148;
                case -277637751: goto L_0x013d;
                case 107868: goto L_0x0135;
                case 111185: goto L_0x012c;
                case 3267882: goto L_0x0124;
                case 3452698: goto L_0x0118;
                case 3536116: goto L_0x010e;
                case 3536286: goto L_0x0104;
                case 96891675: goto L_0x00fb;
                case 109407362: goto L_0x00f1;
                case 109526418: goto L_0x00e7;
                case 965561430: goto L_0x00db;
                case 1099846370: goto L_0x00d1;
                case 1943291465: goto L_0x00c8;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x0189
        L_0x00c8:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0189
            r1 = 4
            goto L_0x018a
        L_0x00d1:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x0189
            r1 = 12
            goto L_0x018a
        L_0x00db:
            java.lang.String r3 = "reduceRight"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 11
            goto L_0x018a
        L_0x00e7:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0189
            r1 = 14
            goto L_0x018a
        L_0x00f1:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L_0x0189
            r1 = 13
            goto L_0x018a
        L_0x00fb:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0189
            r1 = 1
            goto L_0x018a
        L_0x0104:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x0189
            r1 = 16
            goto L_0x018a
        L_0x010e:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L_0x0189
            r1 = 15
            goto L_0x018a
        L_0x0118:
            java.lang.String r3 = "push"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 9
            goto L_0x018a
        L_0x0124:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0189
            r1 = 5
            goto L_0x018a
        L_0x012c:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0189
            r1 = 8
            goto L_0x018a
        L_0x0135:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L_0x0189
            r1 = 7
            goto L_0x018a
        L_0x013d:
            java.lang.String r3 = "unshift"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 19
            goto L_0x018a
        L_0x0148:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L_0x0189
            r1 = 6
            goto L_0x018a
        L_0x0150:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L_0x0189
            r1 = 3
            goto L_0x018a
        L_0x0158:
            java.lang.String r3 = "splice"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 17
            goto L_0x018a
        L_0x0163:
            java.lang.String r3 = "reduce"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 10
            goto L_0x018a
        L_0x016e:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0189
            r1 = 2
            goto L_0x018a
        L_0x0176:
            java.lang.String r3 = "concat"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0189
            r1 = 0
            goto L_0x018a
        L_0x0180:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0189
            r1 = 18
            goto L_0x018a
        L_0x0189:
            r1 = -1
        L_0x018a:
            r18 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r3 = "Callback should be a method"
            r20 = r2
            r22 = r3
            r2 = 0
            switch(r1) {
                case 0: goto L_0x084a;
                case 1: goto L_0x07fc;
                case 2: goto L_0x0794;
                case 3: goto L_0x075d;
                case 4: goto L_0x06c2;
                case 5: goto L_0x067d;
                case 6: goto L_0x05cf;
                case 7: goto L_0x0596;
                case 8: goto L_0x0578;
                case 9: goto L_0x053f;
                case 10: goto L_0x0530;
                case 11: goto L_0x0524;
                case 12: goto L_0x04ea;
                case 13: goto L_0x04d0;
                case 14: goto L_0x0442;
                case 15: goto L_0x03c5;
                case 16: goto L_0x0369;
                case 17: goto L_0x024c;
                case 18: goto L_0x0236;
                case 19: goto L_0x01a1;
                default: goto L_0x0197;
            }
        L_0x0197:
            r3 = r21
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Command not supported"
            r0.<init>(r1)
            throw r0
        L_0x01a1:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0224
            com.google.d.a.d.c r0 = new com.google.d.a.d.c
            r0.<init>()
            java.util.Iterator r1 = r24.iterator()
        L_0x01b0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d8
            java.lang.Object r2 = r1.next()
            com.google.d.a.d.n r2 = (com.google.p4583d.p4584a.p4588d.C60987n) r2
            r4 = r23
            com.google.d.a.e.c r3 = r4.f165215b
            com.google.d.a.d.n r2 = r3.mo57519a(r4, r2)
            boolean r3 = r2 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r3 != 0) goto L_0x01d0
            int r3 = r0.mo57467c()
            r0.mo57483p(r3, r2)
            goto L_0x01b0
        L_0x01d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L_0x01d8:
            int r1 = r0.mo57467c()
            java.util.Iterator r2 = r21.mo57478k()
        L_0x01e0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ff
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r15 = r21
            com.google.d.a.d.n r3 = r15.mo57469e(r3)
            r0.mo57483p(r4, r3)
            goto L_0x01e0
        L_0x01ff:
            r15 = r21
            r21.mo57481n()
            java.util.Iterator r1 = r0.mo57478k()
        L_0x0208:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0226
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            com.google.d.a.d.n r2 = r0.mo57469e(r2)
            r15.mo57483p(r3, r2)
            goto L_0x0208
        L_0x0224:
            r15 = r21
        L_0x0226:
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            int r1 = r21.mo57467c()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x053b
        L_0x0236:
            r2 = 0
            r15 = r21
            r1 = r24
            r0 = r4
            com.google.p4583d.p4584a.C61013h.m93265g(r0, r2, r1)
            com.google.d.a.d.r r0 = new com.google.d.a.d.r
            java.lang.String r1 = ","
            java.lang.String r1 = r15.mo57477j(r1)
            r0.<init>(r1)
            goto L_0x053b
        L_0x024c:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            r2 = 0
            boolean r3 = r24.isEmpty()
            if (r3 == 0) goto L_0x0261
            com.google.d.a.d.c r0 = new com.google.d.a.d.c
            r0.<init>()
            goto L_0x053b
        L_0x0261:
            java.lang.Object r3 = r1.get(r2)
            com.google.d.a.d.n r3 = (com.google.p4583d.p4584a.p4588d.C60987n) r3
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r3 = r5.mo57519a(r4, r3)
            java.lang.Double r3 = r3.mo57473h()
            double r5 = r3.doubleValue()
            double r5 = com.google.p4583d.p4584a.C61013h.m93259a(r5)
            int r3 = (int) r5
            if (r3 >= 0) goto L_0x0286
            int r5 = r21.mo57467c()
            int r3 = r3 + r5
            int r3 = java.lang.Math.max(r2, r3)
            goto L_0x0290
        L_0x0286:
            int r2 = r21.mo57467c()
            if (r3 <= r2) goto L_0x0290
            int r3 = r21.mo57467c()
        L_0x0290:
            int r2 = r21.mo57467c()
            com.google.d.a.d.c r5 = new com.google.d.a.d.c
            r5.<init>()
            int r6 = r24.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0351
            java.lang.Object r6 = r1.get(r7)
            com.google.d.a.d.n r6 = (com.google.p4583d.p4584a.p4588d.C60987n) r6
            com.google.d.a.e.c r7 = r4.f165215b
            com.google.d.a.d.n r6 = r7.mo57519a(r4, r6)
            java.lang.Double r6 = r6.mo57473h()
            double r6 = r6.doubleValue()
            double r6 = com.google.p4583d.p4584a.C61013h.m93259a(r6)
            int r6 = (int) r6
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)
            if (r6 <= 0) goto L_0x02da
            r7 = r3
        L_0x02c1:
            int r8 = r3 + r6
            int r8 = java.lang.Math.min(r2, r8)
            if (r7 >= r8) goto L_0x02da
            com.google.d.a.d.n r8 = r15.mo57469e(r3)
            int r9 = r5.mo57467c()
            r5.mo57483p(r9, r8)
            r15.mo57482o(r3)
            int r7 = r7 + 1
            goto L_0x02c1
        L_0x02da:
            int r2 = r24.size()
            if (r2 <= r0) goto L_0x0365
        L_0x02e0:
            int r2 = r24.size()
            if (r0 >= r2) goto L_0x0365
            java.lang.Object r2 = r1.get(r0)
            com.google.d.a.d.n r2 = (com.google.p4583d.p4584a.p4588d.C60987n) r2
            com.google.d.a.e.c r6 = r4.f165215b
            com.google.d.a.d.n r2 = r6.mo57519a(r4, r2)
            boolean r6 = r2 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r6 != 0) goto L_0x0349
            int r6 = r3 + r0
            int r6 = r6 + -2
            if (r6 < 0) goto L_0x0335
            int r7 = r21.mo57467c()
            if (r6 < r7) goto L_0x0306
            r15.mo57483p(r6, r2)
            goto L_0x0332
        L_0x0306:
            java.util.SortedMap r7 = r15.f165101a
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L_0x0312:
            if (r7 < r6) goto L_0x032f
            java.util.SortedMap r8 = r15.f165101a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r9)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            if (r8 == 0) goto L_0x032c
            int r10 = r7 + 1
            r15.mo57483p(r10, r8)
            java.util.SortedMap r8 = r15.f165101a
            r8.remove(r9)
        L_0x032c:
            int r7 = r7 + -1
            goto L_0x0312
        L_0x032f:
            r15.mo57483p(r6, r2)
        L_0x0332:
            int r0 = r0 + 1
            goto L_0x02e0
        L_0x0335:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid value index: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0349:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L_0x0351:
            if (r3 >= r2) goto L_0x0365
            com.google.d.a.d.n r0 = r15.mo57469e(r3)
            int r1 = r5.mo57467c()
            r5.mo57483p(r1, r0)
            r0 = 0
            r15.mo57483p(r3, r0)
            int r3 = r3 + 1
            goto L_0x0351
        L_0x0365:
            r3 = r15
            r15 = r5
            goto L_0x08ae
        L_0x0369:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            r2 = 1
            com.google.p4583d.p4584a.C61013h.m93267i(r9, r2, r1)
            int r2 = r21.mo57467c()
            if (r2 < r0) goto L_0x0521
            java.util.List r0 = r21.mo57480m()
            boolean r2 = r24.isEmpty()
            if (r2 != 0) goto L_0x03a1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r4.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r4, r1)
            boolean r2 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60980g
            if (r2 == 0) goto L_0x0399
            r2 = r1
            com.google.d.a.d.g r2 = (com.google.p4583d.p4584a.p4588d.C60980g) r2
            goto L_0x03a2
        L_0x0399:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L_0x03a1:
            r2 = 0
        L_0x03a2:
            com.google.d.a.e.f r1 = new com.google.d.a.e.f
            r1.<init>(r2, r4)
            java.util.Collections.sort(r0, r1)
            r21.mo57481n()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x03b2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0521
            int r1 = r3 + 1
            java.lang.Object r2 = r0.next()
            com.google.d.a.d.n r2 = (com.google.p4583d.p4584a.p4588d.C60987n) r2
            r15.mo57483p(r3, r2)
            r3 = r1
            goto L_0x03b2
        L_0x03c5:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            r2 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r10, r2, r1)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r4.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r4, r1)
            boolean r2 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60980g
            if (r2 == 0) goto L_0x043a
            int r2 = r21.mo57467c()
            if (r2 != 0) goto L_0x03eb
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165120l
            goto L_0x053b
        L_0x03eb:
            com.google.d.a.d.g r1 = (com.google.p4583d.p4584a.p4588d.C60980g) r1
            java.util.Iterator r2 = r21.mo57478k()
        L_0x03f1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0436
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            boolean r5 = r15.mo57485r(r3)
            if (r5 == 0) goto L_0x03f1
            r5 = 3
            com.google.d.a.d.n[] r5 = new com.google.p4583d.p4584a.p4588d.C60987n[r5]
            com.google.d.a.d.n r6 = r15.mo57469e(r3)
            r7 = 0
            r5[r7] = r6
            com.google.d.a.d.f r6 = new com.google.d.a.d.f
            double r7 = (double) r3
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            r6.<init>(r3)
            r3 = 1
            r5[r3] = r6
            r5[r0] = r15
            java.util.List r3 = java.util.Arrays.asList(r5)
            com.google.d.a.d.n r3 = r1.mo57451a(r4, r3)
            java.lang.Boolean r3 = r3.mo57472g()
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x03f1
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165119k
            goto L_0x053b
        L_0x0436:
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165120l
            goto L_0x053b
        L_0x043a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = r22
            r0.<init>(r2)
            throw r0
        L_0x0442:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r7, r0, r1)
            boolean r5 = r24.isEmpty()
            if (r5 == 0) goto L_0x0458
            com.google.d.a.d.n r0 = r21.mo57468d()
            goto L_0x053b
        L_0x0458:
            int r5 = r21.mo57467c()
            double r5 = (double) r5
            r7 = 0
            java.lang.Object r7 = r1.get(r7)
            com.google.d.a.d.n r7 = (com.google.p4583d.p4584a.p4588d.C60987n) r7
            com.google.d.a.e.c r8 = r4.f165215b
            com.google.d.a.d.n r7 = r8.mo57519a(r4, r7)
            java.lang.Double r7 = r7.mo57473h()
            double r7 = r7.doubleValue()
            double r7 = com.google.p4583d.p4584a.C61013h.m93259a(r7)
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x0483
            java.lang.Double.isNaN(r5)
            double r7 = r7 + r5
            double r7 = java.lang.Math.max(r7, r2)
            goto L_0x0487
        L_0x0483:
            double r7 = java.lang.Math.min(r7, r5)
        L_0x0487:
            int r9 = r24.size()
            if (r9 != r0) goto L_0x04b7
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r4.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r4, r0)
            java.lang.Double r0 = r0.mo57473h()
            double r0 = r0.doubleValue()
            double r0 = com.google.p4583d.p4584a.C61013h.m93259a(r0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x04b3
            java.lang.Double.isNaN(r5)
            double r5 = r5 + r0
            double r5 = java.lang.Math.max(r5, r2)
            goto L_0x04b7
        L_0x04b3:
            double r5 = java.lang.Math.min(r5, r0)
        L_0x04b7:
            com.google.d.a.d.c r0 = new com.google.d.a.d.c
            r0.<init>()
            int r1 = (int) r7
        L_0x04bd:
            double r2 = (double) r1
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x053b
            com.google.d.a.d.n r2 = r15.mo57469e(r1)
            int r3 = r0.mo57467c()
            r0.mo57483p(r3, r2)
            int r1 = r1 + 1
            goto L_0x04bd
        L_0x04d0:
            r0 = 0
            r15 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r0, r1)
            int r1 = r21.mo57467c()
            if (r1 != 0) goto L_0x04e1
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            goto L_0x053b
        L_0x04e1:
            com.google.d.a.d.n r1 = r15.mo57469e(r0)
            r15.mo57482o(r0)
            goto L_0x0592
        L_0x04ea:
            r0 = 0
            r15 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r6, r0, r1)
            int r0 = r21.mo57467c()
            if (r0 == 0) goto L_0x0521
            r3 = 0
        L_0x04f9:
            int r1 = r0 / 2
            if (r3 >= r1) goto L_0x0521
            boolean r1 = r15.mo57485r(r3)
            if (r1 == 0) goto L_0x051e
            com.google.d.a.d.n r1 = r15.mo57469e(r3)
            r2 = 0
            r15.mo57483p(r3, r2)
            int r2 = r0 + -1
            int r2 = r2 - r3
            boolean r4 = r15.mo57485r(r2)
            if (r4 == 0) goto L_0x051b
            com.google.d.a.d.n r4 = r15.mo57469e(r2)
            r15.mo57483p(r3, r4)
        L_0x051b:
            r15.mo57483p(r2, r1)
        L_0x051e:
            int r3 = r3 + 1
            goto L_0x04f9
        L_0x0521:
            r3 = r15
            goto L_0x08ae
        L_0x0524:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 0
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4589e.C61000g.m93238b(r15, r4, r1, r0)
            goto L_0x053b
        L_0x0530:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 1
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4589e.C61000g.m93238b(r15, r4, r1, r0)
        L_0x053b:
            r3 = r15
            r15 = r0
            goto L_0x08ae
        L_0x053f:
            r15 = r21
            r4 = r23
            r1 = r24
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x0569
            java.util.Iterator r0 = r24.iterator()
        L_0x054f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0569
            java.lang.Object r1 = r0.next()
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r4.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r4, r1)
            int r2 = r21.mo57467c()
            r15.mo57483p(r2, r1)
            goto L_0x054f
        L_0x0569:
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            int r1 = r21.mo57467c()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x053b
        L_0x0578:
            r0 = 0
            r15 = r21
            r1 = r24
            com.google.p4583d.p4584a.C61013h.m93265g(r12, r0, r1)
            int r0 = r21.mo57467c()
            if (r0 != 0) goto L_0x0589
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            goto L_0x053b
        L_0x0589:
            int r0 = r0 + -1
            com.google.d.a.d.n r1 = r15.mo57469e(r0)
            r15.mo57482o(r0)
        L_0x0592:
            r3 = r15
            r15 = r1
            goto L_0x08ae
        L_0x0596:
            r15 = r21
            r2 = r22
            r4 = r23
            r1 = r24
            r0 = 0
            r3 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r13, r3, r1)
            java.lang.Object r0 = r1.get(r0)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r4.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r4, r0)
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60986m
            if (r1 == 0) goto L_0x05c9
            int r1 = r21.mo57467c()
            if (r1 != 0) goto L_0x05c0
            com.google.d.a.d.c r0 = new com.google.d.a.d.c
            r0.<init>()
            goto L_0x053b
        L_0x05c0:
            com.google.d.a.d.m r0 = (com.google.p4583d.p4584a.p4588d.C60986m) r0
            r1 = 0
            com.google.d.a.d.c r0 = com.google.p4583d.p4584a.p4589e.C61000g.m93237a(r15, r4, r0, r1, r1)
            goto L_0x053b
        L_0x05c9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x05cf:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r14, r0, r1)
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x05ee
            r5 = 0
            java.lang.Object r0 = r1.get(r5)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r0 = r5.mo57519a(r4, r0)
        L_0x05ee:
            int r5 = r21.mo57467c()
            int r5 = r5 + -1
            double r5 = (double) r5
            int r7 = r24.size()
            r8 = 1
            if (r7 <= r8) goto L_0x0638
            java.lang.Object r1 = r1.get(r8)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r4, r1)
            java.lang.Double r4 = r1.mo57473h()
            double r4 = r4.doubleValue()
            boolean r4 = java.lang.Double.isNaN(r4)
            if (r4 == 0) goto L_0x061e
            int r1 = r21.mo57467c()
            int r1 = r1 + -1
            double r4 = (double) r1
            goto L_0x062a
        L_0x061e:
            java.lang.Double r1 = r1.mo57473h()
            double r4 = r1.doubleValue()
            double r4 = com.google.p4583d.p4584a.C61013h.m93259a(r4)
        L_0x062a:
            r5 = r4
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0638
            int r1 = r21.mo57467c()
            double r7 = (double) r1
            java.lang.Double.isNaN(r7)
            double r5 = r5 + r7
        L_0x0638:
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0647
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x053b
        L_0x0647:
            int r1 = r21.mo57467c()
            double r1 = (double) r1
            double r1 = java.lang.Math.min(r1, r5)
            int r1 = (int) r1
        L_0x0651:
            if (r1 < 0) goto L_0x0672
            boolean r2 = r15.mo57485r(r1)
            if (r2 == 0) goto L_0x066f
            com.google.d.a.d.n r2 = r15.mo57469e(r1)
            boolean r2 = com.google.p4583d.p4584a.C61013h.m93269k(r2, r0)
            if (r2 == 0) goto L_0x066f
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L_0x053b
        L_0x066f:
            int r1 = r1 + -1
            goto L_0x0651
        L_0x0672:
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x053b
        L_0x067d:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 1
            com.google.p4583d.p4584a.C61013h.m93267i(r11, r0, r1)
            int r0 = r21.mo57467c()
            if (r0 != 0) goto L_0x0691
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165121m
            goto L_0x053b
        L_0x0691:
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x06b5
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r4.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r4, r0)
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60985l
            if (r1 != 0) goto L_0x06b2
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60992s
            if (r1 == 0) goto L_0x06ad
            goto L_0x06b2
        L_0x06ad:
            java.lang.String r0 = r0.mo57475i()
            goto L_0x06b7
        L_0x06b2:
            java.lang.String r0 = ""
            goto L_0x06b7
        L_0x06b5:
            java.lang.String r0 = ","
        L_0x06b7:
            com.google.d.a.d.r r1 = new com.google.d.a.d.r
            java.lang.String r0 = r15.mo57477j(r0)
            r1.<init>(r0)
            goto L_0x0592
        L_0x06c2:
            r15 = r21
            r4 = r23
            r1 = r24
            r0 = 2
            com.google.p4583d.p4584a.C61013h.m93267i(r5, r0, r1)
            com.google.d.a.d.n r0 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            boolean r5 = r24.isEmpty()
            if (r5 != 0) goto L_0x06e1
            r5 = 0
            java.lang.Object r0 = r1.get(r5)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r0 = r5.mo57519a(r4, r0)
        L_0x06e1:
            int r5 = r24.size()
            r6 = 1
            if (r5 <= r6) goto L_0x0724
            java.lang.Object r1 = r1.get(r6)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r4, r1)
            java.lang.Double r1 = r1.mo57473h()
            double r4 = r1.doubleValue()
            double r4 = com.google.p4583d.p4584a.C61013h.m93259a(r4)
            int r1 = r21.mo57467c()
            double r6 = (double) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0714
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x053b
        L_0x0714:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0723
            int r1 = r21.mo57467c()
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r2 = r1 + r4
            goto L_0x0724
        L_0x0723:
            r2 = r4
        L_0x0724:
            java.util.Iterator r1 = r21.mo57478k()
        L_0x0728:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0752
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            double r5 = (double) r4
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0728
            com.google.d.a.d.n r4 = r15.mo57469e(r4)
            boolean r4 = com.google.p4583d.p4584a.C61013h.m93269k(r4, r0)
            if (r4 == 0) goto L_0x0728
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L_0x053b
        L_0x0752:
            com.google.d.a.d.f r0 = new com.google.d.a.d.f
            java.lang.Double r1 = java.lang.Double.valueOf(r18)
            r0.<init>(r1)
            goto L_0x053b
        L_0x075d:
            r3 = r21
            r2 = r22
            r4 = r23
            r1 = r24
            r0 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r15, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r4.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r4, r0)
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60986m
            if (r1 == 0) goto L_0x078e
            int r1 = r21.mo57466b()
            if (r1 != 0) goto L_0x0784
            com.google.d.a.d.n r15 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            goto L_0x08ae
        L_0x0784:
            com.google.d.a.d.m r0 = (com.google.p4583d.p4584a.p4588d.C60986m) r0
            r1 = 0
            com.google.p4583d.p4584a.p4589e.C61000g.m93237a(r3, r4, r0, r1, r1)
            com.google.d.a.d.n r15 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            goto L_0x08ae
        L_0x078e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x0794:
            r3 = r21
            r2 = r22
            r4 = r23
            r1 = r24
            r5 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r0, r5, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r4.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r4, r0)
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60986m
            if (r1 == 0) goto L_0x07f6
            int r1 = r21.mo57466b()
            if (r1 != 0) goto L_0x07be
            com.google.d.a.d.c r15 = new com.google.d.a.d.c
            r15.<init>()
            goto L_0x08ae
        L_0x07be:
            com.google.d.a.d.n r1 = r21.mo57468d()
            com.google.d.a.d.m r0 = (com.google.p4583d.p4584a.p4588d.C60986m) r0
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 0
            com.google.d.a.d.c r0 = com.google.p4583d.p4584a.p4589e.C61000g.m93237a(r3, r4, r0, r5, r2)
            com.google.d.a.d.c r15 = new com.google.d.a.d.c
            r15.<init>()
            java.util.Iterator r0 = r0.mo57478k()
        L_0x07d7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x08ae
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = r1
            com.google.d.a.d.c r4 = (com.google.p4583d.p4584a.p4588d.C60976c) r4
            com.google.d.a.d.n r2 = r4.mo57469e(r2)
            int r4 = r15.mo57467c()
            r15.mo57483p(r4, r2)
            goto L_0x07d7
        L_0x07f6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x07fc:
            r3 = r21
            r2 = r22
            r4 = r23
            r1 = r24
            r0 = r20
            r5 = 1
            com.google.p4583d.p4584a.C61013h.m93265g(r0, r5, r1)
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r5 = r4.f165215b
            com.google.d.a.d.n r1 = r5.mo57519a(r4, r1)
            boolean r5 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60986m
            if (r5 == 0) goto L_0x0844
            int r2 = r21.mo57467c()
            if (r2 != 0) goto L_0x0825
            com.google.d.a.d.n r15 = com.google.p4583d.p4584a.p4588d.C60987n.f165119k
            goto L_0x08ae
        L_0x0825:
            com.google.d.a.d.m r1 = (com.google.p4583d.p4584a.p4588d.C60986m) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.d.a.d.c r0 = com.google.p4583d.p4584a.p4589e.C61000g.m93237a(r3, r4, r1, r0, r2)
            int r0 = r0.mo57467c()
            int r1 = r21.mo57467c()
            if (r0 == r1) goto L_0x0841
            com.google.d.a.d.n r15 = com.google.p4583d.p4584a.p4588d.C60987n.f165120l
            goto L_0x08ae
        L_0x0841:
            com.google.d.a.d.n r15 = com.google.p4583d.p4584a.p4588d.C60987n.f165119k
            goto L_0x08ae
        L_0x0844:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x084a:
            r3 = r21
            r4 = r23
            r1 = r24
            com.google.d.a.d.n r15 = r21.mo57468d()
            boolean r0 = r24.isEmpty()
            if (r0 != 0) goto L_0x08ae
            java.util.Iterator r0 = r24.iterator()
        L_0x085e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x08ae
            java.lang.Object r1 = r0.next()
            com.google.d.a.d.n r1 = (com.google.p4583d.p4584a.p4588d.C60987n) r1
            com.google.d.a.e.c r2 = r4.f165215b
            com.google.d.a.d.n r1 = r2.mo57519a(r4, r1)
            boolean r2 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r2 != 0) goto L_0x08a6
            r2 = r15
            com.google.d.a.d.c r2 = (com.google.p4583d.p4584a.p4588d.C60976c) r2
            int r5 = r2.mo57467c()
            boolean r6 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60976c
            if (r6 == 0) goto L_0x08a2
            com.google.d.a.d.c r1 = (com.google.p4583d.p4584a.p4588d.C60976c) r1
            java.util.Iterator r6 = r1.mo57478k()
        L_0x0885:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x085e
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            com.google.d.a.d.n r7 = r1.mo57469e(r7)
            int r8 = r8 + r5
            r2.mo57483p(r8, r7)
            goto L_0x0885
        L_0x08a2:
            r2.mo57483p(r5, r1)
            goto L_0x085e
        L_0x08a6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed evaluation of arguments"
            r0.<init>(r1)
            throw r0
        L_0x08ae:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4588d.C60976c.mo57452fK(java.lang.String, com.google.d.a.g, java.util.List):com.google.d.a.d.n");
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        return true;
    }

    /* renamed from: h */
    public final Double mo57473h() {
        if (this.f165101a.size() == 1) {
            return mo57469e(0).mo57473h();
        }
        return this.f165101a.size() <= 0 ? Double.valueOf(C59203do.f157270a) : Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        return this.f165101a.hashCode() * 31;
    }

    /* renamed from: i */
    public final String mo57475i() {
        return mo57477j(",");
    }

    public final Iterator iterator() {
        return new C60975b(this);
    }

    /* renamed from: j */
    public final String mo57477j(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f165101a.isEmpty()) {
            for (int i = 0; i < mo57467c(); i++) {
                C60987n e = mo57469e(i);
                sb.append(str);
                if (!(e instanceof C60992s) && !(e instanceof C60985l)) {
                    sb.append(e.mo57475i());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    /* renamed from: k */
    public final Iterator mo57478k() {
        return this.f165101a.keySet().iterator();
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return new C60974a(this.f165101a.keySet().iterator(), this.f165102b.keySet().iterator());
    }

    /* renamed from: m */
    public final List mo57480m() {
        ArrayList arrayList = new ArrayList(mo57467c());
        for (int i = 0; i < mo57467c(); i++) {
            arrayList.add(mo57469e(i));
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void mo57481n() {
        this.f165101a.clear();
    }

    /* renamed from: o */
    public final void mo57482o(int i) {
        int intValue = ((Integer) this.f165101a.lastKey()).intValue();
        if (i <= intValue && i >= 0) {
            this.f165101a.remove(Integer.valueOf(i));
            if (i == intValue) {
                SortedMap sortedMap = this.f165101a;
                int i2 = i - 1;
                Integer valueOf = Integer.valueOf(i2);
                if (!sortedMap.containsKey(valueOf) && i2 >= 0) {
                    this.f165101a.put(valueOf, C60987n.f165114f);
                    return;
                }
                return;
            }
            while (true) {
                i++;
                if (i <= ((Integer) this.f165101a.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.f165101a;
                    Integer valueOf2 = Integer.valueOf(i);
                    C60987n nVar = (C60987n) sortedMap2.get(valueOf2);
                    if (nVar != null) {
                        this.f165101a.put(Integer.valueOf(i - 1), nVar);
                        this.f165101a.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    public final void mo57484q(String str, C60987n nVar) {
        if (nVar == null) {
            this.f165102b.remove(str);
        } else {
            this.f165102b.put(str, nVar);
        }
    }

    /* renamed from: r */
    public final boolean mo57485r(int i) {
        if (i >= 0 && i <= ((Integer) this.f165101a.lastKey()).intValue()) {
            return this.f165101a.containsKey(Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i);
    }

    /* renamed from: s */
    public final boolean mo57486s(String str) {
        return "length".equals(str) || this.f165102b.containsKey(str);
    }

    public final String toString() {
        return mo57477j(",");
    }

    /* renamed from: p */
    public final void mo57483p(int i, C60987n nVar) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i);
        } else if (nVar == null) {
            this.f165101a.remove(Integer.valueOf(i));
        } else {
            this.f165101a.put(Integer.valueOf(i), nVar);
        }
    }

    public C60976c(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                mo57483p(i, (C60987n) list.get(i));
            }
        }
    }
}
