package com.google.p4583d.p4584a.p4589e;

import com.google.p4583d.p4584a.C61012g;
import com.google.p4583d.p4584a.C61013h;
import com.google.p4583d.p4584a.p4588d.C60976c;
import com.google.p4583d.p4584a.p4588d.C60986m;
import com.google.p4583d.p4584a.p4588d.C60987n;
import com.google.p4583d.p4584a.p4590f.C61011a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.d.a.e.e */
/* compiled from: PG */
public final class C60998e extends C60995b {
    protected C60998e() {
        this.f165130a.add(C61011a.APPLY);
        this.f165130a.add(C61011a.BLOCK);
        this.f165130a.add(C61011a.BREAK);
        this.f165130a.add(C61011a.CASE);
        this.f165130a.add(C61011a.DEFAULT);
        this.f165130a.add(C61011a.CONTINUE);
        this.f165130a.add(C61011a.DEFINE_FUNCTION);
        this.f165130a.add(C61011a.FN);
        this.f165130a.add(C61011a.IF);
        this.f165130a.add(C61011a.QUOTE);
        this.f165130a.add(C61011a.RETURN);
        this.f165130a.add(C61011a.SWITCH);
        this.f165130a.add(C61011a.TERNARY);
    }

    /* renamed from: c */
    private static C60987n m93235c(C61012g gVar, List list) {
        C61013h.m93266h(C61011a.FN.name(), 2, list);
        C60987n a = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(0));
        C60987n a2 = gVar.f165215b.mo57519a(gVar, (C60987n) list.get(1));
        if (a2 instanceof C60976c) {
            List m = ((C60976c) a2).mo57480m();
            List arrayList = new ArrayList();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C60986m(a.mo57475i(), m, arrayList, gVar);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{a2.getClass().getCanonicalName()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0137, code lost:
        if (r8.equals("continue") == false) goto L_0x013b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p4583d.p4584a.p4588d.C60987n mo57517a(java.lang.String r8, com.google.p4583d.p4584a.C61012g r9, java.util.List r10) {
        /*
            r7 = this;
            com.google.d.a.f.a r0 = com.google.p4583d.p4584a.p4590f.C61011a.ADD
            com.google.d.a.f.a r0 = com.google.p4583d.p4584a.C61013h.m93262d(r8)
            int r0 = r0.ordinal()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r2) goto L_0x0223
            r5 = 15
            if (r0 == r5) goto L_0x0217
            r5 = 25
            if (r0 == r5) goto L_0x0212
            r5 = 41
            if (r0 == r5) goto L_0x01ba
            r5 = 54
            if (r0 == r5) goto L_0x01b4
            r5 = 57
            java.lang.String r6 = "return"
            if (r0 == r5) goto L_0x018f
            r5 = 19
            if (r0 == r5) goto L_0x016c
            r5 = 20
            if (r0 == r5) goto L_0x014e
            r5 = 60
            if (r0 == r5) goto L_0x0091
            r5 = 61
            if (r0 == r5) goto L_0x0058
            switch(r0) {
                case 11: goto L_0x004a;
                case 12: goto L_0x003e;
                case 13: goto L_0x016c;
                default: goto L_0x0039;
            }
        L_0x0039:
            com.google.d.a.d.n r8 = super.mo57518b(r8)
            return r8
        L_0x003e:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.BREAK
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r4, r10)
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165117i
            return r8
        L_0x004a:
            com.google.d.a.g r8 = r9.mo57525a()
            com.google.d.a.d.c r9 = new com.google.d.a.d.c
            r9.<init>(r10)
            com.google.d.a.d.n r8 = r8.mo57526b(r9)
            return r8
        L_0x0058:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.TERNARY
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r0 = r9.f165215b
            com.google.d.a.d.n r8 = r0.mo57519a(r9, r8)
            java.lang.Boolean r8 = r8.mo57472g()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0084
            java.lang.Object r8 = r10.get(r3)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r10 = r9.f165215b
            com.google.d.a.d.n r8 = r10.mo57519a(r9, r8)
            goto L_0x0090
        L_0x0084:
            java.lang.Object r8 = r10.get(r2)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r10 = r9.f165215b
            com.google.d.a.d.n r8 = r10.mo57519a(r9, r8)
        L_0x0090:
            return r8
        L_0x0091:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.SWITCH
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r0 = r9.f165215b
            com.google.d.a.d.n r8 = r0.mo57519a(r9, r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r9, r0)
            java.lang.Object r10 = r10.get(r2)
            com.google.d.a.d.n r10 = (com.google.p4583d.p4584a.p4588d.C60987n) r10
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r10 = r1.mo57519a(r9, r10)
            boolean r1 = r0 instanceof com.google.p4583d.p4584a.p4588d.C60976c
            if (r1 == 0) goto L_0x0146
            boolean r1 = r10 instanceof com.google.p4583d.p4584a.p4588d.C60976c
            if (r1 == 0) goto L_0x013e
            com.google.d.a.d.c r0 = (com.google.p4583d.p4584a.p4588d.C60976c) r0
            com.google.d.a.d.c r10 = (com.google.p4583d.p4584a.p4588d.C60976c) r10
            r1 = 0
            r2 = 0
        L_0x00cc:
            int r5 = r0.mo57467c()
            if (r1 >= r5) goto L_0x0109
            if (r2 != 0) goto L_0x00e7
            com.google.d.a.d.n r2 = r0.mo57469e(r1)
            com.google.d.a.e.c r5 = r9.f165215b
            com.google.d.a.d.n r2 = r5.mo57519a(r9, r2)
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x00e5
            goto L_0x00e7
        L_0x00e5:
            r2 = 0
            goto L_0x0106
        L_0x00e7:
            com.google.d.a.d.n r2 = r10.mo57469e(r1)
            com.google.d.a.e.c r5 = r9.f165215b
            com.google.d.a.d.n r2 = r5.mo57519a(r9, r2)
            boolean r5 = r2 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r5 == 0) goto L_0x0105
            r8 = r2
            com.google.d.a.d.e r8 = (com.google.p4583d.p4584a.p4588d.C60978e) r8
            java.lang.String r8 = r8.f165105b
            java.lang.String r9 = "break"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x013a
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            return r8
        L_0x0105:
            r2 = 1
        L_0x0106:
            int r1 = r1 + 1
            goto L_0x00cc
        L_0x0109:
            int r8 = r0.mo57467c()
            int r8 = r8 + r3
            int r1 = r10.mo57467c()
            if (r8 != r1) goto L_0x013b
            int r8 = r0.mo57467c()
            com.google.d.a.d.n r8 = r10.mo57469e(r8)
            com.google.d.a.e.c r10 = r9.f165215b
            com.google.d.a.d.n r2 = r10.mo57519a(r9, r8)
            boolean r8 = r2 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r8 == 0) goto L_0x013b
            r8 = r2
            com.google.d.a.d.e r8 = (com.google.p4583d.p4584a.p4588d.C60978e) r8
            java.lang.String r8 = r8.f165105b
            boolean r9 = r8.equals(r6)
            if (r9 != 0) goto L_0x013a
            java.lang.String r9 = "continue"
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            return r2
        L_0x013b:
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            return r8
        L_0x013e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, case statements are not a list"
            r8.<init>(r9)
            throw r8
        L_0x0146:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Malformed SWITCH statement, cases are not a list"
            r8.<init>(r9)
            throw r8
        L_0x014e:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.DEFINE_FUNCTION
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93266h(r8, r2, r10)
            com.google.d.a.d.n r8 = m93235c(r9, r10)
            r10 = r8
            com.google.d.a.d.g r10 = (com.google.p4583d.p4584a.p4588d.C60980g) r10
            java.lang.String r10 = r10.f165107d
            if (r10 != 0) goto L_0x0168
            java.lang.String r10 = ""
            r9.mo57530f(r10, r8)
            goto L_0x016b
        L_0x0168:
            r9.mo57530f(r10, r8)
        L_0x016b:
            return r8
        L_0x016c:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0175
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            goto L_0x018e
        L_0x0175:
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r10 = r9.f165215b
            com.google.d.a.d.n r8 = r10.mo57519a(r9, r8)
            boolean r10 = r8 instanceof com.google.p4583d.p4584a.p4588d.C60976c
            if (r10 == 0) goto L_0x018c
            com.google.d.a.d.c r8 = (com.google.p4583d.p4584a.p4588d.C60976c) r8
            com.google.d.a.d.n r8 = r9.mo57526b(r8)
            goto L_0x018e
        L_0x018c:
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
        L_0x018e:
            return r8
        L_0x018f:
            boolean r8 = r10.isEmpty()
            if (r8 == 0) goto L_0x0198
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165118j
            goto L_0x01b3
        L_0x0198:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.RETURN
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r3, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r10 = r9.f165215b
            com.google.d.a.d.n r8 = r10.mo57519a(r9, r8)
            com.google.d.a.d.e r9 = new com.google.d.a.d.e
            r9.<init>(r6, r8)
            r8 = r9
        L_0x01b3:
            return r8
        L_0x01b4:
            com.google.d.a.d.c r8 = new com.google.d.a.d.c
            r8.<init>(r10)
            return r8
        L_0x01ba:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.IF
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93266h(r8, r2, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r0 = r9.f165215b
            com.google.d.a.d.n r8 = r0.mo57519a(r9, r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r9, r0)
            int r1 = r10.size()
            if (r1 <= r2) goto L_0x01ee
            java.lang.Object r10 = r10.get(r2)
            com.google.d.a.d.n r10 = (com.google.p4583d.p4584a.p4588d.C60987n) r10
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r10 = r1.mo57519a(r9, r10)
            goto L_0x01ef
        L_0x01ee:
            r10 = 0
        L_0x01ef:
            com.google.d.a.d.n r1 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            java.lang.Boolean r8 = r8.mo57472g()
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0202
            com.google.d.a.d.c r0 = (com.google.p4583d.p4584a.p4588d.C60976c) r0
            com.google.d.a.d.n r1 = r9.mo57526b(r0)
            goto L_0x020a
        L_0x0202:
            if (r10 == 0) goto L_0x020a
            com.google.d.a.d.c r10 = (com.google.p4583d.p4584a.p4588d.C60976c) r10
            com.google.d.a.d.n r1 = r9.mo57526b(r10)
        L_0x020a:
            boolean r8 = r1 instanceof com.google.p4583d.p4584a.p4588d.C60978e
            if (r8 == 0) goto L_0x020f
            return r1
        L_0x020f:
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165114f
            return r8
        L_0x0212:
            com.google.d.a.d.n r8 = m93235c(r9, r10)
            return r8
        L_0x0217:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.BREAK
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r4, r10)
            com.google.d.a.d.n r8 = com.google.p4583d.p4584a.p4588d.C60987n.f165116h
            return r8
        L_0x0223:
            com.google.d.a.f.a r8 = com.google.p4583d.p4584a.p4590f.C61011a.APPLY
            java.lang.String r8 = r8.name()
            com.google.p4583d.p4584a.C61013h.m93265g(r8, r1, r10)
            java.lang.Object r8 = r10.get(r4)
            com.google.d.a.d.n r8 = (com.google.p4583d.p4584a.p4588d.C60987n) r8
            com.google.d.a.e.c r0 = r9.f165215b
            com.google.d.a.d.n r8 = r0.mo57519a(r9, r8)
            java.lang.Object r0 = r10.get(r3)
            com.google.d.a.d.n r0 = (com.google.p4583d.p4584a.p4588d.C60987n) r0
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r0 = r1.mo57519a(r9, r0)
            java.lang.String r0 = r0.mo57475i()
            java.lang.Object r10 = r10.get(r2)
            com.google.d.a.d.n r10 = (com.google.p4583d.p4584a.p4588d.C60987n) r10
            com.google.d.a.e.c r1 = r9.f165215b
            com.google.d.a.d.n r10 = r1.mo57519a(r9, r10)
            boolean r1 = r10 instanceof com.google.p4583d.p4584a.p4588d.C60976c
            if (r1 == 0) goto L_0x0271
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0269
            com.google.d.a.d.c r10 = (com.google.p4583d.p4584a.p4588d.C60976c) r10
            java.util.List r10 = r10.mo57480m()
            com.google.d.a.d.n r8 = r8.mo57452fK(r0, r9, r10)
            return r8
        L_0x0269:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Function name for apply is undefined"
            r8.<init>(r9)
            throw r8
        L_0x0271:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getCanonicalName()
            r9[r4] = r10
            java.lang.String r10 = "Function arguments for Apply are not a list found %s"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            r8.<init>(r9)
            goto L_0x028a
        L_0x0289:
            throw r8
        L_0x028a:
            goto L_0x0289
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4583d.p4584a.p4589e.C60998e.mo57517a(java.lang.String, com.google.d.a.g, java.util.List):com.google.d.a.d.n");
    }
}
